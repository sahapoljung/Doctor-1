package th.ac.kmutnb.doctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HisActivity extends AppCompatActivity {

    private String idString, urlPHP = "https://www.androidthai.in.th/sam/getDataWhereIdSam.php", num, dayf, sum;
    JSONObject jsonObject;
    String[] showsick = {"", "", "", "", "", "", ""}, showday = {"", "", "", "", "", "", ""}, timeshow = new String[7];

    int[] sickkk = new int[7], DayPerSick = {3, 14, 7, 3, 7, 7, 7, 7, 3}, numPm = new int[8]/*เวลาสิ้นสุดแต่ละโรค*/,

    timeT = {25, 25, 25, 25, 25, 25, 25,}/*เวลาส่วนของชั่วโมง*/, dayT = {0, 0, 0, 0, 0, 0, 0}/*วันที่วินิจฉัยในส่วนของวัน*/;
    // int /*i = Integer.parseInt(p1)*//*เวลาของแต่ละโรค*/ numf/*เวลาที่คิดได้เป็นวัน*/, numfm/*เวลาที่คิดได้เป็นชั่วโมง*/;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_his);
        getUser();

        time();


    }

    private void time() {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss yyyy-MM-dd");
        String formattedDate = df.format(c.getTime());
        String[] dayR = formattedDate.split(" ", 2);
        String time11 = dayR[0];
        String day22 = dayR[1];

        Log.d("26JanV1", "time op  " + time11);
        Log.d("26JanV1", "Day  oop  " + day22);


        //String p3 = p[2];

        int /*i = Integer.parseInt(p1)*/num = 72/*เวลาของแต่ละโรค*/, numf/*เวลาที่คิดได้เป็นวัน*/, numfm/*เวลาที่คิดได้เป็นชั่วโมง*/;
        int day2 = 0 /*วันปัจจุบันในเครื่อง*/, time2/*เวเลปัจจุบันในเครื่อง*/;
        int day1 = 17/*วันที่วินิจฉัยครั้งแรก*/, timef/*เวลาที่ถูกหักลบกำเวลาจริงแล้ว*/, dayd /*วันที่ผ่านมาว่าผ่านมากี่วันแล้ว*/, time1 = 12/*เวลาที่วินิจฉัยครั้งแรก*/;


        //วันที่วินิจฉัยครั้งแรก
        String[] d = day22.split("-", 3);

        String day11111 = d[2];
        Log.d("26JanV1", "day11==>" + day11111);
        day2 = Integer.parseInt(day11111);

        //เวลาวินิจฉัยครั้งแรก
        String[] t = time11.split(":", 3);
        String time22 = t[0];
        Log.d("26JanV1", "time22==>" + time22);
        time2 = Integer.parseInt(time22);

        for (int i = 0; i < 7; i++) {
            // Log.d("26JanV1", "timeT [i] time ==>" + timeT[i]);

            if (timeT[i] != 25) {
                Log.d("26JanV1", "timeT [i] time ==>" + timeT[i]);
                dayd = (dayT[i] - day2) * 24;

                if (time2 >= timeT[i]) {

                    timef = time2 - timeT[i];
                    if (dayd != 0) {
                        dayd = dayd - timef;
                    } else {
                        dayd = timef;
                    }

                } else {

                    timef = timeT[i] - time2;
                    if (dayd != 0) {
                        dayd = dayd + timef;
                    } else {
                        dayd = timef;
                    }

                }

                numf = numPm[i] - dayd;
                numfm = numf % 24;

                timeshow[i] = Integer.toString(numf / 24) + " วัน " + Integer.toString(numfm) + " ชั่วโมง";
                Log.d("26JanV1", "Finol    " + timeshow[i]);
            }

        }


    }


    private void getUser() {
        String[] datasick = {"ไข้หวัด", "หวัดภูมิแพ้", "บ้านหมุนจากการเปลี่ยนท่า", "ไมเกรน", "โรคขาดวิตามินเอ", "โรคกระเพาะปัสสาวะอักเสบ", "โรคกระเพาะอักเสบ", "โรคขาดวิตามินซีหรือโรคลักปิดลักเปิด", "โรคท้องเดินหรืออุจจาระร่วง"},
                day = {"day1", "day2", "day3", "day4", "day5", "day6", "day7"}, sick = {"sick1", "sick2", "sick3", "sick4", "sick5", "sick6", "sick7"};
        Intent intent = getIntent();
        if (intent.hasExtra("id")) {
            idString = getIntent().getStringExtra("id");
            Log.d("26JanV1", "id HIS HIS ==>" + idString);
            try {

                GetUserWhereIdThread getUserWhereIdThread = new GetUserWhereIdThread(HisActivity.this);
                getUserWhereIdThread.execute(idString, urlPHP);
                String json = getUserWhereIdThread.get();
                Log.d("26JanV1", "json HIS HIS ==>" + json);
                JSONArray jsonArray = new JSONArray(json);
                jsonObject = jsonArray.getJSONObject(0);
                Log.d("26JanV1", "json jsonObject ==>" + jsonObject);
                sum = jsonObject.getString("num");
                // Log.d("26JanV1", "nummmm==>" + sum);

                for (int i = 0; i < 7; i++) {
                    showsick[i] = jsonObject.getString(sick[i]);
                    showday[i] = jsonObject.getString(day[i]);
                    Log.d("26JanV1", "showday[i]  ==>" + showday[i]);

                    if (!showsick[i].equals("NULL")) {
                        sickkk[i] = Integer.parseInt(showsick[i]);
                        showsick[i] = datasick[sickkk[i]];
                        Log.d("26JanV1", "ii  ==>" + i);
                        //time();
                        for (int j = 0; j < 9; j++) {

                            if (showsick[i].equals(datasick[j])) {

                                numPm[i] = DayPerSick[j] * 24;
                                // Log.d("26JanV1", "nummmm==>" + numPm[i]);

                                String[] dayR = showday[i].split(" ", 2);

                                String day1 = dayR[0];
                                String time1 = dayR[1];
                                //นำส่วนวันไปใช้
                                String[] d = day1.split("/", 2);
                                String day11 = d[0];
                                dayT[i] = Integer.parseInt(day11);
                                //นำส่วนชั่วโมงไปใช้
                                String[] t = time1.split(":", 2);
                                String time11 = t[0];
                                timeT[i] = Integer.parseInt(time11);

                                //  Log.d("26JanV1", "dayT[i] ==>" + dayT[i]);
                                //  Log.d("26JanV1", "timeT[i] ==>" + timeT[i]);

                            }

                        }


                    }

                    //showsick[i] = datasick[sickkk[i]];

                    //int result = Integer.parseInt(number);
                    //  Log.d("26JanV1", "iii==>" + showsick[i]);
                    // Log.d("26JanV1", "BB  ==>" + showday[i]);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }

}
