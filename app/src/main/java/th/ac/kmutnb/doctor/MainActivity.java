package th.ac.kmutnb.doctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //String txt = getIntent().getExtras().getString("dey");
//      Addfragment
        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction().add(R.id.mainFramement, new MainFragment()).commit();
        }

    }//Main method
} //main Class
