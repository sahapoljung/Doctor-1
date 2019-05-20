package th.ac.kmutnb.doctor;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

public class DocTorActivity extends AppCompatActivity {

    private String idString ,del=null;
    private String urlPHP = "https://www.androidthai.in.th/sam/getUserWhereIdSam.php";
    private String nameString , surnameString,index="1",num;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_tor);



            getUser();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.contentDoctorFragment, new AboutMeFragment()).commit();

        }

//        หน้าแรก
        aboutMeControllor();
//       วินิจฉัย
        analysisControllor();

        //ข้อมูลโรค
        DataSickControllor();

        //ล็อคเอาท์
        LogoutControllor();

        //ข้อมูลส่วนตัว
        InfoControllor();
        //ข้อมูลอาการ
        sickdataControllor();
        //ล็อคเอาท์
        //LogoutControllor();


    }// Main Method



    private void InfoControllor() {
        TextView textView = findViewById(R.id.txtInfo);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.contentDoctorFragment, new InfoFragment()).commit();
                drawerLayout.closeDrawers();
            }
        });
    }

    private void DataSickControllor() {
        TextView textView = findViewById(R.id.txtdatasick);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //getSupportFragmentManager().beginTransaction().replace(R.id.contentDoctorFragment, new DataSickFragment()).commit();
               // drawerLayout.closeDrawers();
                Intent intent = new Intent(DocTorActivity.this, DatasickMainActivity.class);
                startActivity(intent);
                drawerLayout.closeDrawers();

            }
        });
    }

    private void LogoutControllor() {

        final TextView textView = findViewById(R.id.txtLogout);
        textView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //getSupportFragmentManager().beginTransaction().replace(R.id.contentDoctorFragment, new AnalysisChooseFragment()).commit();
                //getSupportFragmentManager().beginTransaction().replace(R.id.FragmentMain, new MainFragment()).commit();
                num = "1";
                //getUser();

                Intent intent = new Intent(DocTorActivity.this, MainActivity.class);
                intent.putExtra("index", num);
                startActivity(intent);
                finish();
//                getSupportFragmentManager().beginTransaction().replace(R.id.mainFramement, new MainFragment()).commit();
//                finish();




               // newActivityReminder.setClass(getActivity(),MainActivityReminder.class);
               // newActivityReminder.putExtra("index","test");//ส่งค่าตัวหลังเป็น Value

               // startActivity(newActivityReminder);



//                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);
//
//                MainFragment mainFragment = new MainFragment();
                //mainFragment.setArguments(getIntent().getExtras());


            }
        });
    }
    private void sickdataControllor() {
        TextView textView = findViewById(R.id.txtsickdata);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // getSupportFragmentManager().beginTransaction().replace(R.id.contentDoctorFragment, new AnalysisChooseFragment()).commit();

                Intent intent = new Intent(DocTorActivity.this, SickDataActivity.class);
                startActivity(intent);
                drawerLayout.closeDrawers();


            }
        });
    }
    private void analysisControllor() {
        TextView textView = findViewById(R.id.txtAnalysis);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // getSupportFragmentManager().beginTransaction().replace(R.id.contentDoctorFragment, new AnalysisChooseFragment()).commit();

                Intent intent = new Intent(DocTorActivity.this, AnalysisActivity.class);
                startActivity(intent);
                drawerLayout.closeDrawers();


            }
        });
    }

    private void aboutMeControllor() {
        final TextView textView = findViewById(R.id.txtAboutMe);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.contentDoctorFragment, new AboutMeFragment()).commit();

                drawerLayout.closeDrawers();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    private void getUser() {

        Intent intent = getIntent();
        if (intent.hasExtra("id")) {
            idString = getIntent().getStringExtra("id");
            Log.d("26JanV1", "id Recive ==>" + idString);
            try {

                GetUserWhereIdThread getUserWhereIdThread = new GetUserWhereIdThread(DocTorActivity.this);
                getUserWhereIdThread.execute(idString, urlPHP);
                String json = getUserWhereIdThread.get();
                Log.d("26JanV1", "json Doctor ==>" + json);

                JSONArray jsonArray = new JSONArray(json);
                JSONObject jsonObject = jsonArray.getJSONObject(0);
                nameString = jsonObject.getString("Name");
                surnameString = jsonObject.getString("Surname");
                createToobar();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {


            nameString = " ";
            surnameString =" ";
            createToobar();
            // Do something else
        }
//        idString = getIntent().getStringExtra("id");
//        Log.d("26JanV1", "id Recive ==>" + idString);
//
//
//            try {
//
//                GetUserWhereIdThread getUserWhereIdThread = new GetUserWhereIdThread(DocTorActivity.this);
//                getUserWhereIdThread.execute(idString, urlPHP);
//                String json = getUserWhereIdThread.get();
//                Log.d("26JanV1", "json Doctor ==>" + json);
//
//                JSONArray jsonArray = new JSONArray(json);
//                JSONObject jsonObject = jsonArray.getJSONObject(0);
//                nameString = jsonObject.getString("Name");
//                surnameString = jsonObject.getString("Surname");
//                createToobar();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }




    }

    private void createToobar() {

        Toolbar toolbar = findViewById(R.id.toolbarDoctor);
        setSupportActionBar(toolbar);
        getSupportActionBar().setSubtitle(nameString + " " + surnameString);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_action_hamberker);

        drawerLayout = findViewById(R.id.drawerLayout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(DocTorActivity.this,drawerLayout,R.string.open,R.string.close);


    }
}//main class
