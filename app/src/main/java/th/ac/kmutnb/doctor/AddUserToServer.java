package th.ac.kmutnb.doctor;


import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class AddUserToServer extends AsyncTask<String, Void, String> {
    private Context context;
    public static String nu;
public AddUserToServer(Context context){ this.context = context; }

    @Override
    protected String doInBackground(String... strings) {
        try {
            OkHttpClient okHttpClient = new OkHttpClient();
            RequestBody requestBody = new FormEncodingBuilder()
                    .add("isAdd", "true")
                    .add("Name", strings[0])
                    .add("Surname", strings[1])
                    .add("Gender", strings[2])
                    .add("Height", strings[3])
                    .add("Weight", strings[4])
                    .add("Age", strings[5])
                    .add("User", strings[6])
                    .add("Password", strings[7])
                    .build();
            Request.Builder builder = new Request.Builder();
            Request request = builder.url(strings[8]).post(requestBody).build();
            Response response = okHttpClient.newCall(request).execute();
            Log.d("26JanV1", "aaaaaaaaaaaaaaaa    " +request);
            Log.d("26JanV1", "bbbbbbbbbbbbbbbb    " +strings[0]);



           // nu = response.body().string();
           // Log.d("26JanV1", "uouououououo    "+nu );
            return response.body().string();
        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }



}



}
