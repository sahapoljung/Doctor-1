package th.ac.kmutnb.doctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private String dell,num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = getIntent();
//
//        if (intent.hasExtra("index")) {
//            num = getIntent().getExtras().getString("index");
//
//        } else {
//            // Do something else
//        }
//        String txt = getIntent().getExtras().getString("dey");
        //num = getIntent().getExtras().getString("indix");
        //Log.d("26JanV1", "num    " + num);

//      Addfragment
        if (savedInstanceState == null) {
            //MainFragment mainFragment = MainFragment.newInstance("5678",num);
            getSupportFragmentManager().beginTransaction().add(R.id.mainFramement, new MainFragment()).commit();
        }

    }//Main method
} //main Class
