package th.ac.kmutnb.doctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;

public class DatasickMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datasick_main);

        //final ListView lisView1 = (ListView)findViewById(R.id.lvdatasick);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fldata, new DataSickMainFragment())
                    .commit();

        }
    }
}