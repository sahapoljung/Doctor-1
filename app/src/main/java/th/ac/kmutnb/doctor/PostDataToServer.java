package th.ac.kmutnb.doctor;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class PostDataToServer extends AsyncTask<String,Void,String> {


    private Context context;

    public PostDataToServer(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... strings) {

        try {
            OkHttpClient okHttpClient = new OkHttpClient();
            RequestBody requestBody = new FormEncodingBuilder()
                    .add("isAdd", "true")
                    .add("id", strings[0])
                    .add("num", strings[1])
                    .add("sick1", strings[2])
                    .add("day1", strings[3])
                    .add("sick2", strings[4])
                    .add("day2", strings[5])
                    .add("sick3", strings[6])
                    .add("day3", strings[7])
                    .add("sick4", strings[8])
                    .add("day4", strings[9])
                    .add("sick5", strings[10])
                    .add("day5", strings[11])
                    .add("sick6", strings[12])
                    .add("day6", strings[13])
                    .add("sick7", strings[14])
                    .add("day7", strings[15])
                    .add("sick8", strings[16])
                    .add("day8", strings[17])
                    .add("sick9", strings[18])
                    .add("day9", strings[19])
                    .add("sick10", strings[20])
                    .add("day10", strings[21])
                    .build();
          /*  Log.d("26JanV1", "0    " +strings[0]);
            Log.d("26JanV1", "1    " +strings[1]);
            Log.d("26JanV1", "2    " +strings[2]);
            Log.d("26JanV1", "3    " +strings[3]);
            Log.d("26JanV1", "4    " +strings[4]);
            Log.d("26JanV1", "5    " +strings[5]);
            Log.d("26JanV1", "6    " +strings[6]);
            Log.d("26JanV1", "7    " +strings[7]);
            Log.d("26JanV1", "8    " +strings[8]);
            Log.d("26JanV1", "9    " +strings[9]);
            Log.d("26JanV1", "10    " +strings[10]);
            Log.d("26JanV1", "11    " +strings[11]);
            Log.d("26JanV1", "12    " +strings[12]);
            Log.d("26JanV1", "13    " +strings[13]);
            Log.d("26JanV1", "14    " +strings[14]);
            Log.d("26JanV1", "15    " +strings[15]);
            Log.d("26JanV1", "16    " +strings[16]);*/
            Request.Builder builder = new Request.Builder();
            Request request = builder.url(strings[22]).post(requestBody).build();
            Response response = okHttpClient.newCall(request).execute();

            return response.body().string();
            // Log.d("26JanV1", "bbbbbbbbbbbbbbbb    " +response.body().string());


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


}
