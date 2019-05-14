package th.ac.kmutnb.doctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String dell,num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        if (intent.hasExtra("indix")) {
            num = getIntent().getExtras().getString("indix");
        } else {
            // Do something else
        }
//        String txt = getIntent().getExtras().getString("dey");
        //num = getIntent().getExtras().getString("indix");
        Log.d("26JanV1", "num    " + num);

//      Addfragment
        if (savedInstanceState == null) {
            //MainFragment mainFragment = MainFragment.newInstance("5678",num);
            getSupportFragmentManager().beginTransaction().add(R.id.mainFramement, new MainFragment()).commit();
        }

    }//Main method
} //main Class
