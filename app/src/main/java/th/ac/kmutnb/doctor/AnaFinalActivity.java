package th.ac.kmutnb.doctor;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AnaFinalActivity extends AppCompatActivity implements View.OnClickListener {

    private String datastr, formattedDate, numm, urlPost = "https://www.androidthai.in.th/sam/postData.php";
    private String dataint, dataAddnum, idString, urlPHP = "https://www.androidthai.in.th/sam/getDataWhereIdSam.php";
    private String data1, data2, data3;
    private String i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21;
    int num,nom,Timesick;
    String[] showsick = {"", "", "", "", "", "", "", "", "", ""}, showday = {"", "", "", "", "", "", "", "", "", ""}, updata = new String[8];

    String sum,numday;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        progressDialog = new ProgressDialog(AnaFinalActivity.this);
        progressDialog.setTitle("");
        progressDialog.setMessage("Loading...");
        progressDialog.show();
        setContentView(R.layout.activity_ana_final);
        TextView textView1 = findViewById(R.id.txtdataroc);
        TextView textView2 = findViewById(R.id.txtdatamol);
        TextView textView3 = findViewById(R.id.txtdatafinol1);
        TextView textView4 = findViewById(R.id.txtdatafinol2);
        //อาการเบื้องต้น
        TextView textView5 = findViewById(R.id.txtdatafinol3);
        datastr = getIntent().getExtras().getString("data1");
        dataint = getIntent().getExtras().getString("numdata1");


        Intent intent = getIntent();
        idString = getIntent().getExtras().getString("idString");
        Log.d("26JanV1", "Don't ID idString   ==>"+idString);

      try {

              if (idString.equals(null)) {
              } else {

                  Postdata();
                  TimeMain();

              }


      }catch (Exception e) {

          Log.d("26JanV1", "Exception e  MAIN==>" );

          e.printStackTrace();
      }


       // Postdata();

       // getUser();

     //   TimeMain();


        // time();
        progressDialog.dismiss();
        sack(textView1, textView2, textView3, textView4, textView5);

    }

    private void TimeMain() {
        int oum = Integer.parseInt(dataAddnum); //เลขโรค
        int som = Integer.parseInt(sum),mum=0;        // จำนวนครั้งที่วินิจฉัย
        som = som-1;
        try {
            for (int i = 0; i < 11; i++) {
                Log.d("26JanV1", "showsick[i]  ==>" + showsick[i]);
               // if (!showsick[i].equals("NULL")) {

                for (int j = 0; j < 11; j++) { if(showsick[i].equals("NULL")){ mum = 1; }else { mum = 2;} } //เช็คว่ามี NULLหรือไม่


                   // Log.d("26JanV1", "somsom  ==>" + som);
                   // Log.d("26JanV1", "nom  ==>" + nom);
                  //  Log.d("26JanV1", "showsick[nom]  ==>" + showsick[nom]);
                   // Log.d("26JanV1", "showsick[som] ==>" + showsick[som]);
                  //if (mum==1){som++;}else {som--;}
                    if (dataAddnum.equals(showsick[som])) {
                        String[] dayR = showday[som].split(" ", 2);
                        String time11 = dayR[0];
                        String day22 = dayR[1];
                        int day1, time1, time2;
                        String[] d = day22.split("-", 3);
                        String day11111 = d[0];

                        day1 = Integer.parseInt(day11111);
                        Log.d("26JanV1", "day1==>" +  day1);
                        //เวลาวินิจฉัยครั้งแรก
                        String[] t = time11.split(":", 3);
                        String time22 = t[0];
                        String time33 = t[1];
                       // Log.d("26JanV1", "time22==>" + time22);
                        time1 = Integer.parseInt(time22);
                        time2 = Integer.parseInt(time33);
                        Log.d("26JanV1", "time1==>" + time1);
                        Log.d("26JanV1", "time2==>" + time2);

                        //int time1 = Integer.parseInt(showsick[nom - 1]);
                        //numday = showday[som];
                        //Log.d("26JanV1", "time1[i]  ==>" );
                       // Log.d("26JanV1", "time2[i] ==>" + time2);
                        time(day1, time1, time2);
                    i=11;
                    }

                    if (som == 0) {
                        if(mum==1){ i = 11;} else {som = 10;}
                    }
                som--;
               // }

            }
        }catch (Exception e) {

            Log.d("26JanV1", "Exception e  NUMM==>" );

            e.printStackTrace();
        }
    }

    private void time(int day1,int time1,int time2) {

        int[] DayPerSick = {3, 14, 7, 3, 7, 7, 7, 7, 3};
        int oum = Integer.parseInt(dataAddnum);
        int timenew1,timenew2,daynew,sumtime1,sumtime2,sumday;
        Timesick = DayPerSick[oum-1]*24;

        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
        String formattedDate = df.format(c.getTime());
        String[] dayR = formattedDate.split(" ", 2);
        String time11 = dayR[0];
        String day22 = dayR[1];

        String[] d = day22.split("-", 3);
        String day11111 = d[0];

        daynew = Integer.parseInt(day11111);
        Log.d("26JanV1", "daynew==>" +  daynew);
        //เวลาวินิจฉัยครั้งแรก
        String[] t = time11.split(":", 3);
        String time22 = t[0];
        String time33 = t[1];

        timenew1 = Integer.parseInt(time22);
        timenew2 = Integer.parseInt(time33);
        Log.d("26JanV1", "timenew1==>" + timenew1);
        Log.d("26JanV1", "timenew2==>" + timenew2);

        sumday = (daynew - day1) * 24;
       if(time1>=timenew1){

           sumtime1 = time1 - timenew1;
           if (sumday != 0) {
               sumday = sumday - sumtime1;
           }
           else {
               sumday = sumtime1;
           }

       }else {
           sumtime1 = timenew1 - time1;
           if (sumday != 0) {
               sumday = sumday + sumtime1;
           } else {
               sumday = sumtime1;
           }

       }

       int Timesic = Timesick - sumday;
        String Out = Integer.toString(sumday/24);
        MyAlert myAlert = new MyAlert(AnaFinalActivity.this);

       if(Timesic<=0){
           myAlert.normalDialog("คำเตือน", "ระบบพบว่า "+Out+" วันที่แล้วคุณเคยเป็น"+datastr+" ถ้าคุณเป็นต่อเนื่องจากครั้งที่แล้ว ควรไปพบแพทย์โดยด่วน แต่ถ้าคุณไม่ได้เป็นต่อเนื่องจากครั้งที่แล้ว ให้รักษาตามคำแนะนำเบื้องต้น");
       }
        Log.d("26JanV1", "sumday==>" + sumday);








    }

    private void sack(TextView textView1, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        if (datastr.equals("ไข้หวัด")) {
            sick1();
        }
        if (datastr.equals("หวัดภูมิแพ้")) {
            sick2();
        }
        if (datastr.equals("บ้านหมุนจากการเปลี่ยนท่า")) {
            sick3();
        }
        if (datastr.equals("ไมเกรน")) {
            sick4();
        }
        if (datastr.equals("โรคขาดวิตามินเอ หรือโรคเกล็ดกระดี่ขึ้นตา")) {
            sick5();
        }
        if (datastr.equals("โรคกระเพาะปัสสาวะอักเสบ")) {
            sick6();
        }
        if (datastr.equals("โรคกระเพาะอักเสบ")) {
            sick7();
        }
        if (datastr.equals("โรคขาดวิตามินซีหรือโรคลักปิดลักเปิด")) {
            sick8();
        }
        if (datastr.equals("โรคท้องเดินหรืออุจจาระร่วง")) {
            sick9();
        }


        textView1.setText(data1);
        textView2.setText(data2);
        textView5.setText(data3);

        textView3.setOnClickListener((View.OnClickListener) this);
        textView4.setOnClickListener((View.OnClickListener) this);
    }

    private void Postdata() {

        dataAddnum = getIntent().getExtras().getString("dataAddnum"); //หมายเลขโรค
        //idString=getIntent().getExtras().getString("dataAddnum");

        // num = Integer.parseInt(numm);
        //num += 1;
        try {


            Intent intent = getIntent();
            if (intent.hasExtra("idString")) {
                idString = getIntent().getExtras().getString("idString");
                getUser();

                num = Integer.parseInt(sum);
                if (num == 10) { num = 0; }
                num = num + 1;
                //if (num >= 11) { num = 0; }
               // numm = Integer.toString(num);
                Calendar c = Calendar.getInstance();
                SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
                formattedDate = df.format(c.getTime());

                //Log.d("26JanV1", " num   " + numm);
                Log.d("26JanV1", " dataAddnum   " + dataAddnum);
                Log.d("26JanV1", " idString     " + idString);


                for (int i = 0; i < 11; i++) {
                    if (num - 1 == i) {
                        showsick[i] = dataAddnum;
                        showday[i] = formattedDate;
                    }
                    if (i == 0) {
                        if (num >= 11) { num = 0;}
                        numm = Integer.toString(num);
                        i1 = numm;
                    } else if (i == 1) {
                        i2 = showsick[i - 1];
                        i3 = showday[i - 1];
                    } else if (i == 2) {
                        i4 = showsick[i - 1];
                        i5 = showday[i - 1];
                    } else if (i == 3) {
                        i6 = showsick[i - 1];
                        i7 = showday[i - 1];
                    } else if (i == 4) {
                        i8 = showsick[i - 1];
                        i9 = showday[i - 1];
                    } else if (i == 5) {
                        i10 = showsick[i - 1];
                        i11 = showday[i - 1];
                    } else if (i == 6) {
                        i12 = showsick[i - 1];
                        i13 = showday[i - 1];
                    } else if (i == 7) {
                        i14 = showsick[i - 1];
                        i15 = showday[i - 1];
                    } else if (i == 8) {
                        i16 = showsick[i - 1];
                        i17 = showday[i - 1];
                    } else if (i == 9) {
                        i18 = showsick[i - 1];
                        i19 = showday[i - 1];
                    } else if (i == 10) {
                        i20 = showsick[i - 1];
                        i21 = showday[i - 1];
                    }

                }
                urlPost = "https://www.androidthai.in.th/sam/postData.php";
                PostDataToServer postDataToServer = new PostDataToServer(AnaFinalActivity.this);
                postDataToServer.execute(idString, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, urlPost);


            } else {


                Log.d("26JanV1", " Postdata   idString" + idString);
                // Do something else
            }
        }catch (Exception e) {

            Log.d("26JanV1", "Exception e  POST==>" );

            e.printStackTrace();
        }


    }


    private void getUser() {
        String[] day = {"day1", "day2", "day3", "day4", "day5", "day6", "day7", "day8", "day9", "day10"}, sick = {"sick1", "sick2", "sick3", "sick4", "sick5", "sick6", "sick7", "sick8", "sick9", "sick10"};

        Log.d("26JanV1", "id Recive ==>" + idString);
        try {

            GetUserWhereIdThread getUserWhereIdThread = new GetUserWhereIdThread(AnaFinalActivity.this);
            getUserWhereIdThread.execute(idString, urlPHP);
            String json = getUserWhereIdThread.get();
            Log.d("26JanV1", "json Doctor ==>" + json);

            JSONArray jsonArray = new JSONArray(json);
            JSONObject jsonObject = jsonArray.getJSONObject(0);
            sum = jsonObject.getString("num");
            for (int i = 0; i < 10; i++) {

                showsick[i] = jsonObject.getString(sick[i]);
                showday[i] = jsonObject.getString(day[i]);
                Log.d("26JanV1", "showsick[i]  ==>" + showsick[i]);
                Log.d("26JanV1", "showday[i] ==>" + showday[i]);
            }

        } catch (Exception e) {
            Log.d("26JanV1", "Exception e  getUser==>" );
            e.printStackTrace();
        }

    }


    @Override
    public void onClick(View v) {
        int index = 0;
        switch (v.getId()) {
            case R.id.txtdatafinol1:
                Intent intent = new Intent(AnaFinalActivity.this, DatasickMainActivity.class);
                startActivity(intent);

                break;

            case R.id.txtdatafinol2:
                Intent intent2 = new Intent(AnaFinalActivity.this, SickDataActivity.class);
                startActivity(intent2);

                break;


        }
    }


    private void sick9() {
        data3 = "      ถ้าคุณต้องการดูข้อมูลรักษาอาการเบื้องต้น";

        if (dataint.equals("1")) {
            data1 = "คุณมีโอกาส 1 ใน 3 ที่จะเป็น\nโรคท้องเดินหรืออุจจาระร่วง";
            data2 = "      1.\tควรงดอาหารแข็ง อาหารรสจัด และอาหารที่มีกากใย \n" +
                    "      2.\tให้กินสารละลายน้ำตาลเกลือแร่\n\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 3 วัน หรืออาการถ่ายปนเลือด หรือภาวะขาดน้ำและเกลือแร่อย่างรุนแรง ให้เดินทางไปพบแพทย์ทันที \n" +
                    "      “ ภาวะขาดน้ำรุนแรง คือ น้ำหนักตัวลดมากกว่าร้อยละ 10 ผู้ป่วยมีอาการอ่อนเพลีย มาก ลุกนั่งไม่ได้ ต้องนอน ไม่ค่อยรู้สึกตัวหรือช็อก (กระสับกระส่าย ตัวเย็น มือเท้าเย็นชืด ชีพจรเบาเร็ว ความดันต่ำมาก ปัสสาวะออกน้อยหรือไม่ออกเลย) และมีอาการตาโบ๋มาก ผิวหนังเที่ยวมาก ริมฝีปากและ ลิ้นแห้งผาก หายใจเร็วและลึก ในทารกนอกจากอาการดังกล่าวแล้ว ยังพบว่ากระหม่อมบุ๋มมาก แน่นิ่ง และตัวอ่อนปวกเปียก ” \n";
        }
        if (dataint.equals("2")) {
            data1 = "คุณมีโอกาส 2 ใน 3 ที่จะเป็น\nโรคท้องเดินหรืออุจจาระร่วง";
            data2 = "      1.\tควรงดอาหารแข็ง อาหารรสจัด และอาหารที่มีกากใย \n" +
                    "      2.\tให้กินสารละลายน้ำตาลเกลือแร่\n\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 3 วัน หรืออาการถ่ายปนเลือด หรือภาวะขาดน้ำและเกลือแร่อย่างรุนแรง ให้เดินทางไปพบแพทย์ทันที \n" +
                    "      “ ภาวะขาดน้ำรุนแรง คือ น้ำหนักตัวลดมากกว่าร้อยละ 10 ผู้ป่วยมีอาการอ่อนเพลีย มาก ลุกนั่งไม่ได้ ต้องนอน ไม่ค่อยรู้สึกตัวหรือช็อก (กระสับกระส่าย ตัวเย็น มือเท้าเย็นชืด ชีพจรเบาเร็ว ความดันต่ำมาก ปัสสาวะออกน้อยหรือไม่ออกเลย) และมีอาการตาโบ๋มาก ผิวหนังเที่ยวมาก ริมฝีปากและ ลิ้นแห้งผาก หายใจเร็วและลึก ในทารกนอกจากอาการดังกล่าวแล้ว ยังพบว่ากระหม่อมบุ๋มมาก แน่นิ่ง และตัวอ่อนปวกเปียก ” \n";
        }
        if (dataint.equals("3")) {
            data1 = "คุณเป็นโรคท้องเดินหรืออุจจาระร่วง";
            data2 = "      1.\tควรงดอาหารแข็ง อาหารรสจัด และอาหารที่มีกากใย \n" +
                    "      2.\tให้กินสารละลายน้ำตาลเกลือแร่\n\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 3 วัน หรืออาการถ่ายปนเลือด หรือภาวะขาดน้ำและเกลือแร่อย่างรุนแรง ให้เดินทางไปพบแพทย์ทันที \n" +
                    "      “ ภาวะขาดน้ำรุนแรง คือ น้ำหนักตัวลดมากกว่าร้อยละ 10 ผู้ป่วยมีอาการอ่อนเพลีย มาก ลุกนั่งไม่ได้ ต้องนอน ไม่ค่อยรู้สึกตัวหรือช็อก (กระสับกระส่าย ตัวเย็น มือเท้าเย็นชืด ชีพจรเบาเร็ว ความดันต่ำมาก ปัสสาวะออกน้อยหรือไม่ออกเลย) และมีอาการตาโบ๋มาก ผิวหนังเที่ยวมาก ริมฝีปากและ ลิ้นแห้งผาก หายใจเร็วและลึก ในทารกนอกจากอาการดังกล่าวแล้ว ยังพบว่ากระหม่อมบุ๋มมาก แน่นิ่ง และตัวอ่อนปวกเปียก ” \n";
        }
    }


    private void sick8() {
        data3 = "      ถ้าคุณต้องการดูข้อมูลรักษาอาการเบื้องต้น";
        if (dataint.equals("1")) {
            data1 = "คุณมีโอกาส 1 ใน 3 ที่จะเป็น\nโรคขาดวิตามินซีหรือโรคลักปิดลักเปิด";
            data2 = "      1.\tให้กินวิตามินซีขนาด 100 มก. วันละ 3 ครั้ง\n" +
                    "      2.\tการกินอาหารที่มีวิตามินซีให้เพียงพอและเป็นประจำ เช่น ส้ม มะนาว มะขามป้อม มะเขือเทศ ฝรั่ง ผักชี เป็นต้น\n\n" +
                    "      * ถ้าไม่ดีขึ้นใน 1 สัปดาห์ หรือมีอาการแทรกซ้อนอื่นๆควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และอาจต้องตรวจเลือด เอกซเรย์ และตรวจพิเศษอื่น ๆ\n";
        }
        if (dataint.equals("2")) {
            data1 = "คุณมีโอกาส 2 ใน 3 ที่จะเป็น\nโรคขาดวิตามินซีหรือโรคลักปิดลักเปิด";
            data2 = "      1.\tให้กินวิตามินซีขนาด 100 มก. วันละ 3 ครั้ง\n" +
                    "      2.\tการกินอาหารที่มีวิตามินซีให้เพียงพอและเป็นประจำ เช่น ส้ม มะนาว มะขามป้อม มะเขือเทศ ฝรั่ง ผักชี เป็นต้น\n\n" +
                    "      * ถ้าไม่ดีขึ้นใน 1 สัปดาห์ หรือมีอาการแทรกซ้อนอื่นๆควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และอาจต้องตรวจเลือด เอกซเรย์ และตรวจพิเศษอื่น ๆ\n";
        }
        if (dataint.equals("3")) {
            data1 = "คุณเป็นโรคขาดวิตามินซีหรือโรคลักปิดลักเปิด";
            data2 = "      1.\tให้กินวิตามินซีขนาด 100 มก. วันละ 3 ครั้ง\n" +
                    "      2.\tการกินอาหารที่มีวิตามินซีให้เพียงพอและเป็นประจำ เช่น ส้ม มะนาว มะขามป้อม มะเขือเทศ ฝรั่ง ผักชี เป็นต้น\n\n" +
                    "      * ถ้าไม่ดีขึ้นใน 1 สัปดาห์ หรือมีอาการแทรกซ้อนอื่นๆควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และอาจต้องตรวจเลือด เอกซเรย์ และตรวจพิเศษอื่น ๆ\n";
        }
    }


    private void sick7() {
        data3 = "      ถ้าคุณต้องการดูข้อมูลรักษาอาการเบื้องต้น";

        if (dataint.equals("1")) {
            data1 = "คุณมีโอกาส 1 ใน 3 ที่จะเป็น\nโรคกระเพาะอาหารอักเสบ";
            data2 = "      1.\tรับประทานยาลดการสร้างกรด เช่น ยารานิทิดีน ร่วมกับยาปกป้องเยื่อบุกระเพาะอาหาร เช่น ซูคราลเฟต (sucralfate) 1 กรัม วันละ 4 ครั้ง นาน 2-4 สัปดาห์\n" +
                    "      2.\tรับประทานอาหารให้ตรงเวลา และงดดื่มสุรา สูบบุหรี่\n" +
                    "      3.\tรับประทานอาหารอ่อนที่ย่อยง่าย ควรเคี้ยวอาหารให้ละเอียด และอาหารที่รับประทานในแต่ละมื้อไม่ควรมีปริมาณมากเกินไป\n" +
                    "      4.\tหลีกเลี่ยงสิ่งระคายเคืองต่อกระเพาะอาหาร เช่น ยาชุด ยาแก้ปวดข้อ ยาแก้ปวดแอสไพริน ยาที่มีสเตียรอยด์ น้ำอัดลม อาหารรสจัด เครื่องดื่มที่มีแอลกอฮอล์ อาหารหรือเครื่องดื่มที่มีคาเฟอีน เช่น ช็อคโกแลต ชา กาแฟ เป็นต้น\n" +
                    "      5.\tถ้าเครียดพยายามลดความเครียด เช่น ดูหนัง ฟังเพลง ทำสมาธิ การฝึกผ่อนคลายกล้ามเนื้อ เป็นต้น และหมั่นออกกำลังกาย\n" +
                    "      6.\tถ้าปฏิบัติตามนี้แล้วอาการไม่ดีขึ้น ควรไปพบแพทย์ที่โรงพยาบาล เพื่อการตรวจวินิจฉัยที่แน่นอน\n\n" +
                    "      * ถ้าไม่ดีขึ้นใน 1 สัปดาห์ หรือถ้ามีอาการอาเจียนเป็นเลือดหรือถ่ายดํา ควรส่งโรงพยาบาลภายใน 24 ชั่วโมง (หากมีอาการหน้ามืด เป็นลมหรือช็อกควรส่งทันที) อาจต้องให้เลือดและตรวจหาสาเหตุโดยการใช้กล้องส่องตรวจกระเพาะลําไส้อย่างละเอียด\n";
        }
        if (dataint.equals("2")) {
            data1 = "คุณมีโอกาส 2 ใน 3 ที่จะเป็น\nโรคกระเพาะอาหารอักเสบ";
            data2 = "      1.\tรับประทานยาลดการสร้างกรด เช่น ยารานิทิดีน ร่วมกับยาปกป้องเยื่อบุกระเพาะอาหาร เช่น ซูคราลเฟต (sucralfate) 1 กรัม วันละ 4 ครั้ง นาน 2-4 สัปดาห์\n" +
                    "      2.\tรับประทานอาหารให้ตรงเวลา และงดดื่มสุรา สูบบุหรี่\n" +
                    "      3.\tรับประทานอาหารอ่อนที่ย่อยง่าย ควรเคี้ยวอาหารให้ละเอียด และอาหารที่รับประทานในแต่ละมื้อไม่ควรมีปริมาณมากเกินไป\n" +
                    "      4.\tหลีกเลี่ยงสิ่งระคายเคืองต่อกระเพาะอาหาร เช่น ยาชุด ยาแก้ปวดข้อ ยาแก้ปวดแอสไพริน ยาที่มีสเตียรอยด์ น้ำอัดลม อาหารรสจัด เครื่องดื่มที่มีแอลกอฮอล์ อาหารหรือเครื่องดื่มที่มีคาเฟอีน เช่น ช็อคโกแลต ชา กาแฟ เป็นต้น\n" +
                    "      5.\tถ้าเครียดพยายามลดความเครียด เช่น ดูหนัง ฟังเพลง ทำสมาธิ การฝึกผ่อนคลายกล้ามเนื้อ เป็นต้น และหมั่นออกกำลังกาย\n" +
                    "      6.\tถ้าปฏิบัติตามนี้แล้วอาการไม่ดีขึ้น ควรไปพบแพทย์ที่โรงพยาบาล เพื่อการตรวจวินิจฉัยที่แน่นอน\n\n" +
                    "      * ถ้าไม่ดีขึ้นใน 1 สัปดาห์ หรือถ้ามีอาการอาเจียนเป็นเลือดหรือถ่ายดํา ควรส่งโรงพยาบาลภายใน 24 ชั่วโมง (หากมีอาการหน้ามืด เป็นลมหรือช็อกควรส่งทันที) อาจต้องให้เลือดและตรวจหาสาเหตุโดยการใช้กล้องส่องตรวจกระเพาะลําไส้อย่างละเอียด\n";
        }
        if (dataint.equals("3")) {
            data1 = "คุณเป็นโรคกระเพาะอาหารอักเสบ";
            data2 = "      1.\tรับประทานยาลดการสร้างกรด เช่น ยารานิทิดีน ร่วมกับยาปกป้องเยื่อบุกระเพาะอาหาร เช่น ซูคราลเฟต (sucralfate) 1 กรัม วันละ 4 ครั้ง นาน 2-4 สัปดาห์\n" +
                    "      2.\tรับประทานอาหารให้ตรงเวลา และงดดื่มสุรา สูบบุหรี่\n" +
                    "      3.\tรับประทานอาหารอ่อนที่ย่อยง่าย ควรเคี้ยวอาหารให้ละเอียด และอาหารที่รับประทานในแต่ละมื้อไม่ควรมีปริมาณมากเกินไป\n" +
                    "      4.\tหลีกเลี่ยงสิ่งระคายเคืองต่อกระเพาะอาหาร เช่น ยาชุด ยาแก้ปวดข้อ ยาแก้ปวดแอสไพริน ยาที่มีสเตียรอยด์ น้ำอัดลม อาหารรสจัด เครื่องดื่มที่มีแอลกอฮอล์ อาหารหรือเครื่องดื่มที่มีคาเฟอีน เช่น ช็อคโกแลต ชา กาแฟ เป็นต้น\n" +
                    "      5.\tถ้าเครียดพยายามลดความเครียด เช่น ดูหนัง ฟังเพลง ทำสมาธิ การฝึกผ่อนคลายกล้ามเนื้อ เป็นต้น และหมั่นออกกำลังกาย\n" +
                    "      6.\tถ้าปฏิบัติตามนี้แล้วอาการไม่ดีขึ้น ควรไปพบแพทย์ที่โรงพยาบาล เพื่อการตรวจวินิจฉัยที่แน่นอน\n\n" +
                    "      * ถ้าไม่ดีขึ้นใน 1 สัปดาห์ หรือถ้ามีอาการอาเจียนเป็นเลือดหรือถ่ายดํา ควรส่งโรงพยาบาลภายใน 24 ชั่วโมง (หากมีอาการหน้ามืด เป็นลมหรือช็อกควรส่งทันที) อาจต้องให้เลือดและตรวจหาสาเหตุโดยการใช้กล้องส่องตรวจกระเพาะลําไส้อย่างละเอียด\n";
        }
    }

    private void sick6() {
        data3 = "      ถ้าคุณต้องการดูข้อมูลรักษาอาการเบื้องต้น";
        if (dataint.equals("1")) {
            data1 = "คุณมีโอกาส 1 ใน 3 ที่จะเป็น\nโรคกระเพาะปัสสาวะอักเสบ";
            data2 = "      1. พยายามดื่มน้ำมาก ๆ  และอย่ากลั้นปัสสาวะ ควรฝึกถ่ายปัสสาวะในห้องน้ำนอกบ้าน หรือระหว่างเดินทางได้ทุกที่ การอั้นปัสสาวะทําให้เชื้อโรคอยู่ในกระเพาะปัสสาวะได้นานจนสามารถเจริญแพร่พันธุ์ \n" +
                    "      2. หลังถ่ายอุจจาระ ควรใช้กระดาษชําระเช็ดทําความสะอาดจากข้างหน้าไปข้างหลัง เพื่อป้องกันไม่ให้นําเชื้อโรคจากบริเวณทวารหนักเข้าสู่ท่อปัสสาวะ\n" +
                    "      3. ถ้าปวดมากให้ยาแก้ปวดหรือยาพาราเซตามอน\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 1 สัปดาห์ หรือมีอาการปัสสาวะแล้วพบเลือดปนออกมากับปัสสาวะ แนะนำให้เดินทางไปพบแพทย์เพื่อดูอาการอย่างละเอียด\n\n";
        }
        if (dataint.equals("2")) {
            data1 = "คุณมีโอกาส 2 ใน 3 ที่จะเป็น\nโรคกระเพาะปัสสาวะอักเสบ";
            data2 = "      1. พยายามดื่มน้ำมาก ๆ  และอย่ากลั้นปัสสาวะ ควรฝึกถ่ายปัสสาวะในห้องน้ำนอกบ้าน หรือระหว่างเดินทางได้ทุกที่ การอั้นปัสสาวะทําให้เชื้อโรคอยู่ในกระเพาะปัสสาวะได้นานจนสามารถเจริญแพร่พันธุ์ \n" +
                    "      2. หลังถ่ายอุจจาระ ควรใช้กระดาษชําระเช็ดทําความสะอาดจากข้างหน้าไปข้างหลัง เพื่อป้องกันไม่ให้นําเชื้อโรคจากบริเวณทวารหนักเข้าสู่ท่อปัสสาวะ\n" +
                    "      3. ถ้าปวดมากให้ยาแก้ปวดหรือยาพาราเซตามอน\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 1 สัปดาห์ หรือมีอาการปัสสาวะแล้วพบเลือดปนออกมากับปัสสาวะ แนะนำให้เดินทางไปพบแพทย์เพื่อดูอาการอย่างละเอียด\n\n";
        }
        if (dataint.equals("3")) {
            data1 = "คุณเป็นโรคกระเพาะปัสสาวะอักเสบ";
            data2 = "      1. พยายามดื่มน้ำมาก ๆ  และอย่ากลั้นปัสสาวะ ควรฝึกถ่ายปัสสาวะในห้องน้ำนอกบ้าน หรือระหว่างเดินทางได้ทุกที่ การอั้นปัสสาวะทําให้เชื้อโรคอยู่ในกระเพาะปัสสาวะได้นานจนสามารถเจริญแพร่พันธุ์ \n" +
                    "      2. หลังถ่ายอุจจาระ ควรใช้กระดาษชําระเช็ดทําความสะอาดจากข้างหน้าไปข้างหลัง เพื่อป้องกันไม่ให้นําเชื้อโรคจากบริเวณทวารหนักเข้าสู่ท่อปัสสาวะ\n" +
                    "      3. ถ้าปวดมากให้ยาแก้ปวดหรือยาพาราเซตามอน\n\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 1 สัปดาห์ หรือมีอาการปัสสาวะแล้วพบเลือดปนออกมากับปัสสาวะ แนะนำให้เดินทางไปพบแพทย์เพื่อดูอาการอย่างละเอียด\n";
        }
    }


    private void sick5() {

        data3 = "      อาการเบื้องต้นสำหรับโรคขาดวิตามินเอ\n" +
                "    1.ตาแห้ง\n";

        if (dataint.equals("1")) {
            data1 = "คุณมีโอกาส 1 ใน 3 ที่จะเป็น\nโรคขาดวิตามินเอ หรือโรคเกล็ดกระดี่ขึ้นตา";
            data2 = "      1.\tเมื่อเริ่มมีอาการตาบอดกลางคืน หรือเริ่มมี เกล็ดกระดี่ขึ้นตา ให้กินวิตามินเอชนิดแคปซูล (ขนาด 25,000 ยูนิต) วันละ 2 ครั้ง ครั้งละ 1-2 แคปซูล \n" +
                    "      2.\tกินอาหารที่มีไขมันและอาหารจำพวกผลไม้ ผักใบเขียว ผักใบเหลือง เช่น มะละกอ มะม่วงสุก ผักบุ้ง คะน้า ตำลึง มันเทศ ไข่ นม สำหรับทารกควรได้กินอาหารเสริมที่ผสมกับตับหรือไข่แดงบด\n\n" +
                    "      * ถ้าไม่ดีขึ้นใน 1 สัปดาห์ มีอาการอ่อนตัวของกระจกตาดำหรืออาการแทรกซ้อนอื่นๆควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และตรวจหาสาเหตุเพิ่มเติม\n";
        }
        if (dataint.equals("2")) {
            data1 = "คุณมีโอกาส 2 ใน 3 ที่จะเป็น\nโรคขาดวิตามินเอ หรือโรคเกล็ดกระดี่ขึ้นตา";
            data2 = "      1.\tเมื่อเริ่มมีอาการตาบอดกลางคืน หรือเริ่มมี เกล็ดกระดี่ขึ้นตา ให้กินวิตามินเอชนิดแคปซูล (ขนาด 25,000 ยูนิต) วันละ 2 ครั้ง ครั้งละ 1-2 แคปซูล \n" +
                    "      2.\tกินอาหารที่มีไขมันและอาหารจำพวกผลไม้ ผักใบเขียว ผักใบเหลือง เช่น มะละกอ มะม่วงสุก ผักบุ้ง คะน้า ตำลึง มันเทศ ไข่ นม สำหรับทารกควรได้กินอาหารเสริมที่ผสมกับตับหรือไข่แดงบด\n\n" +
                    "      * ถ้าไม่ดีขึ้นใน 1 สัปดาห์ มีอาการอ่อนตัวของกระจกตาดำหรืออาการแทรกซ้อนอื่นๆควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และตรวจหาสาเหตุเพิ่มเติม\n";
        }
        if (dataint.equals("3")) {
            data1 = "คุณเป็นโรคขาดวิตามินเอ หรือโรคเกล็ดกระดี่ขึ้นตา";
            data2 = "      1.\tเมื่อเริ่มมีอาการตาบอดกลางคืน หรือเริ่มมี เกล็ดกระดี่ขึ้นตา ให้กินวิตามินเอชนิดแคปซูล (ขนาด 25,000 ยูนิต) วันละ 2 ครั้ง ครั้งละ 1-2 แคปซูล \n" +
                    "      2.\tกินอาหารที่มีไขมันและอาหารจำพวกผลไม้ ผักใบเขียว ผักใบเหลือง เช่น มะละกอ มะม่วงสุก ผักบุ้ง คะน้า ตำลึง มันเทศ ไข่ นม สำหรับทารกควรได้กินอาหารเสริมที่ผสมกับตับหรือไข่แดงบด\n\n" +
                    "      * ถ้าไม่ดีขึ้นใน 1 สัปดาห์ มีอาการอ่อนตัวของกระจกตาดำหรืออาการแทรกซ้อนอื่นๆควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และตรวจหาสาเหตุเพิ่มเติม\n";
        }
    }

    private void sick4() {
        data3 = "      ถ้าคุณต้องการดูข้อมูลรักษาอาการเบื้องต้น";
        if (dataint.equals("1")) {
            data1 = "คุณมีโอกาส 1 ใน 3 ที่จะเป็น\nโรคไมเกรน";
            data2 = "      1.\tขณะที่มีอาการกำเริบ ให้ยาบรรเทาปวด ได้แก่ พาราเซตามอล หรือยาต้านอักเสบที่ไม่ใช่สตีรอยด์ \n" +
                    "      2.\tสังเกตและหลีกเลี่ยงสิ่งกระตุ้น ที่ทำให้เกิดอาการปวดศีรษะ\n" +
                    "      3.\tนอนพักผ่อนให้เพียงพอ และตรงตามเวลาทุกวัน\n" +
                    "      4.\tออกกำลังกายอย่างสม่ำเสมอ ไม่หักโหมจนเกินไป\n\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 3 วัน หรือถ้าปวดรุนแรงปวดติดต่อกันนานเกิน 72 ชั่วโมง แขนขาอ่อนแรงหรือหมดสติ หรือสงสัยเกิดจากสาเหตุ ร้ายแรงอื่นๆ เช่น ต้อหินเฉียบพลัน โรคหลอด หลอดเลือดในสมองแตก ศีรษะได้รับบาดเจ็บเลือดออกในสมอง เยื่อหุ้มสมองอักเสบ เป็นต้น ควรส่งโรงพยาบาลโดยเร็วอาจจำเป็นต้องทำการตรวจเพิ่มเติม\n";
        }
        if (dataint.equals("2")) {
            data1 = "คุณมีโอกาส 2 ใน 3 ที่จะเป็น\nโรคไมเกรน";
            data2 = "      1.\tขณะที่มีอาการกำเริบ ให้ยาบรรเทาปวด ได้แก่ พาราเซตามอล หรือยาต้านอักเสบที่ไม่ใช่สตีรอยด์ \n" +
                    "      2.\tสังเกตและหลีกเลี่ยงสิ่งกระตุ้น ที่ทำให้เกิดอาการปวดศีรษะ\n" +
                    "      3.\tนอนพักผ่อนให้เพียงพอ และตรงตามเวลาทุกวัน\n" +
                    "      4.\tออกกำลังกายอย่างสม่ำเสมอ ไม่หักโหมจนเกินไป\n\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 3 วัน หรือถ้าปวดรุนแรงปวดติดต่อกันนานเกิน 72 ชั่วโมง แขนขาอ่อนแรงหรือหมดสติ หรือสงสัยเกิดจากสาเหตุ ร้ายแรงอื่นๆ เช่น ต้อหินเฉียบพลัน โรคหลอด หลอดเลือดในสมองแตก ศีรษะได้รับบาดเจ็บเลือดออกในสมอง เยื่อหุ้มสมองอักเสบ เป็นต้น ควรส่งโรงพยาบาลโดยเร็วอาจจำเป็นต้องทำการตรวจเพิ่มเติม\n";
        }
        if (dataint.equals("3")) {
            data1 = "คุณเป็นโรคไมเกรน";
            data2 = "      1.\tขณะที่มีอาการกำเริบ ให้ยาบรรเทาปวด ได้แก่ พาราเซตามอล หรือยาต้านอักเสบที่ไม่ใช่สตีรอยด์ \n" +
                    "      2.\tสังเกตและหลีกเลี่ยงสิ่งกระตุ้น ที่ทำให้เกิดอาการปวดศีรษะ\n" +
                    "      3.\tนอนพักผ่อนให้เพียงพอ และตรงตามเวลาทุกวัน\n" +
                    "      4.\tออกกำลังกายอย่างสม่ำเสมอ ไม่หักโหมจนเกินไป\n\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 3 วัน หรือถ้าปวดรุนแรงปวดติดต่อกันนานเกิน 72 ชั่วโมง แขนขาอ่อนแรงหรือหมดสติ หรือสงสัยเกิดจากสาเหตุ ร้ายแรงอื่นๆ เช่น ต้อหินเฉียบพลัน โรคหลอด หลอดเลือดในสมองแตก ศีรษะได้รับบาดเจ็บเลือดออกในสมอง เยื่อหุ้มสมองอักเสบ เป็นต้น ควรส่งโรงพยาบาลโดยเร็วอาจจำเป็นต้องทำการตรวจเพิ่มเติม\n";
        }
    }


    private void sick3() {
        data3 = "      อาการเบื้องต้นสำหรับโรคบ้านหมุนจากการเปลี่ยนท่า\n" +
                "    1.ปวดศีรษะ\n";
        if (dataint.equals("1")) {
            data1 = "คุณมีโอกาส 1 ใน 3 ที่จะเป็น\nโรคบ้านหมุนจากการเปลี่ยนท่า";
            data2 = "      1. ขณะมีอาการกำเริบ ให้ผู้ป่วยเปลี่ยนท่ามา นั่งตอตรงๆ หรือนอนหงายศีรษะตรงทันที\n" +
                    "      2. ป้องกันไม่ให้อาการกำเริบซ้ำโดยการนอน หนุนหมอนอย่างน้อย 2 ใบ อย่านอนตะแคงข้างที่มี อาการ เวลาลุกจากเตียงนอนให้ลุกอย่างช้าๆ และนั่งอยู่ ขอบเตียงสักครู่ก่อนจะยืนขึ้น อย่าก้มศีรษะต่ำหรือเงย มองขึ้นข้างบน หลีกเลี่ยงการทำงานที่ต้องก้มๆ เงยๆ การสะบัดผมหรือสะบัดคอเร็วๆ รวมทั้งท่าอื่น ๆ ที่กระตุ้นให้อาการกำเริบ\n" +
                    "      3. หลีกเลี่ยงการขับรถหรือทำงานเกี่ยวกับ เครื่องจักร เพื่อป้องกันอุบัติเหตุที่อาจเกิดขึ้น\n\n" +
                    "      * ถ้าอาการไม่ดีขึ้นใน 1 สัปดาห์ หรือมีอาการบ้านหมุนหรืออาเจียนมาก มีอาการหูอื้อ หูตึง หรือแว่ว เสียงดังในหู เดินเซ แขนขาชาหรืออ่อนแรง พูดอ้อแอ้ กลืนลําบาก ตาเห็นภาพซ้อน หรือสงสัยมีความผิดปกติ รุนแรงอื่นๆ ควรส่งโรงพยาบาลอาจต้องตรวจอย่างละเอียด\n";
        }
        if (dataint.equals("2")) {
            data1 = "คุณมีโอกาส 2 ใน 3 ที่จะเป็น\nโรคบ้านหมุนจากการเปลี่ยนท่า";
            data2 = "      1. ขณะมีอาการกำเริบ ให้ผู้ป่วยเปลี่ยนท่ามา นั่งตอตรงๆ หรือนอนหงายศีรษะตรงทันที\n" +
                    "      2. ป้องกันไม่ให้อาการกำเริบซ้ำโดยการนอน หนุนหมอนอย่างน้อย 2 ใบ อย่านอนตะแคงข้างที่มี อาการ เวลาลุกจากเตียงนอนให้ลุกอย่างช้าๆ และนั่งอยู่ ขอบเตียงสักครู่ก่อนจะยืนขึ้น อย่าก้มศีรษะต่ำหรือเงย มองขึ้นข้างบน หลีกเลี่ยงการทำงานที่ต้องก้มๆ เงยๆ การสะบัดผมหรือสะบัดคอเร็วๆ รวมทั้งท่าอื่น ๆ ที่กระตุ้นให้อาการกำเริบ\n" +
                    "      3. หลีกเลี่ยงการขับรถหรือทำงานเกี่ยวกับ เครื่องจักร เพื่อป้องกันอุบัติเหตุที่อาจเกิดขึ้น\n\n" +
                    "      * ถ้าอาการไม่ดีขึ้นใน 1 สัปดาห์ หรือมีอาการบ้านหมุนหรืออาเจียนมาก มีอาการหูอื้อ หูตึง หรือแว่ว เสียงดังในหู เดินเซ แขนขาชาหรืออ่อนแรง พูดอ้อแอ้ กลืนลําบาก ตาเห็นภาพซ้อน หรือสงสัยมีความผิดปกติ รุนแรงอื่นๆ ควรส่งโรงพยาบาลอาจต้องตรวจอย่างละเอียด\n";
        }
        if (dataint.equals("3")) {
            data1 = "คุณเป็นโรคบ้านหมุนจากการเปลี่ยนท่า";
            data2 = "      1. ขณะมีอาการกำเริบ ให้ผู้ป่วยเปลี่ยนท่ามา นั่งตอตรงๆ หรือนอนหงายศีรษะตรงทันที\n" +
                    "      2. ป้องกันไม่ให้อาการกำเริบซ้ำโดยการนอน หนุนหมอนอย่างน้อย 2 ใบ อย่านอนตะแคงข้างที่มี อาการ เวลาลุกจากเตียงนอนให้ลุกอย่างช้าๆ และนั่งอยู่ ขอบเตียงสักครู่ก่อนจะยืนขึ้น อย่าก้มศีรษะต่ำหรือเงย มองขึ้นข้างบน หลีกเลี่ยงการทำงานที่ต้องก้มๆ เงยๆ การสะบัดผมหรือสะบัดคอเร็วๆ รวมทั้งท่าอื่น ๆ ที่กระตุ้นให้อาการกำเริบ\n" +
                    "      3. หลีกเลี่ยงการขับรถหรือทำงานเกี่ยวกับ เครื่องจักร เพื่อป้องกันอุบัติเหตุที่อาจเกิดขึ้น\n\n" +
                    "      * ถ้าอาการไม่ดีขึ้นใน 1 สัปดาห์ หรือมีอาการบ้านหมุนหรืออาเจียนมาก มีอาการหูอื้อ หูตึง หรือแว่ว เสียงดังในหู เดินเซ แขนขาชาหรืออ่อนแรง พูดอ้อแอ้ กลืนลําบาก ตาเห็นภาพซ้อน หรือสงสัยมีความผิดปกติ รุนแรงอื่นๆ ควรส่งโรงพยาบาลอาจต้องตรวจอย่างละเอียด\n";
        }
    }

    private void sick2() {
        data3 = "       อาการเบื้องต้นสำหรับโรคหวัดภูมิแพ้\n" +
                "     1.อาการไอ\n" +
                "     2.อาการน้ำมูกไหล\n" +
                "     3.อาการปวดหัว\n" +
                "     4.อาการตัวร้อน\n";
        if (dataint.equals("1")) {
            data1 = "คุณมีโอกาส 1 ใน 3 ที่จะเป็น\nโรคหวัดภูมิแพ้";
            data2 = "      1. แนะนำให้ผู้ป่วยสังเกตว่าเกิดจากสารก่อภูมิแพ้ หรือสิ่งกระตุ้นอะไร แล้วพยายามหลีกเลี่ยง \n" +
                    "      2. ถ้ามีอาการน้ำมูกไหลมากกินยาแก้แพ้ เช่น คลอร์เฟนิรามีน หรือไดเฟนไฮดรามีน ครั้งละ 1/2 - 1 เม็ด วันละ 2-4 ครั้ง หรือยาแก้แพ้ที่ไม่ง่วง เช่น ลอราทาดีน ครั้งละ 1/2 - 1 เม็ด วันละครั้ง\n\n" +
                    "      * ถ้าการรักษาดังกล่าวแล้วไม่ได้ผลหรือเป็นเรื้อรัง (มีอาการมากกว่า 4 วันต่อสัปดาห์ และมีอาการติดต่อกันนานกว่า 2 สัปดาห์) หรือรุนแรง (มีอาการนอน ไม่หลับ นอนกรน มีภาวะหยุดหายใจขณะหลับ มีผลกระทบต่อการเรียน การงาน หรือคุณภาพชีวิต) ให้เดินทางไปพบแพทย์เพื่อให้แพทย์วินิจฉัยโดยระเอียดมากขึ้น\n";
        }
        if (dataint.equals("2")) {
            data1 = "คุณมีโอกาส 2 ใน 3 ที่จะเป็น\nโรคหวัดภูมิแพ้";
            data2 = "      1. แนะนำให้ผู้ป่วยสังเกตว่าเกิดจากสารก่อภูมิแพ้ หรือสิ่งกระตุ้นอะไร แล้วพยายามหลีกเลี่ยง \n" +
                    "      2. ถ้ามีอาการน้ำมูกไหลมากกินยาแก้แพ้ เช่น คลอร์เฟนิรามีน หรือไดเฟนไฮดรามีน ครั้งละ 1/2 - 1 เม็ด วันละ 2-4 ครั้ง หรือยาแก้แพ้ที่ไม่ง่วง เช่น ลอราทาดีน ครั้งละ 1/2 - 1 เม็ด วันละครั้ง\n\n" +
                    "      * ถ้าการรักษาดังกล่าวแล้วไม่ได้ผลหรือเป็นเรื้อรัง (มีอาการมากกว่า 4 วันต่อสัปดาห์ และมีอาการติดต่อกันนานกว่า 2 สัปดาห์) หรือรุนแรง (มีอาการนอน ไม่หลับ นอนกรน มีภาวะหยุดหายใจขณะหลับ มีผลกระทบต่อการเรียน การงาน หรือคุณภาพชีวิต) ให้เดินทางไปพบแพทย์เพื่อให้แพทย์วินิจฉัยโดยระเอียดมากขึ้น\n";
        }
        if (dataint.equals("3")) {
            data1 = "คุณเป็นหวัดภูมิแพ้";
            data2 = "      1. แนะนำให้ผู้ป่วยสังเกตว่าเกิดจากสารก่อภูมิแพ้ หรือสิ่งกระตุ้นอะไร แล้วพยายามหลีกเลี่ยง \n" +
                    "      2. ถ้ามีอาการน้ำมูกไหลมากกินยาแก้แพ้ เช่น คลอร์เฟนิรามีน หรือไดเฟนไฮดรามีน ครั้งละ 1/2 - 1 เม็ด วันละ 2-4 ครั้ง หรือยาแก้แพ้ที่ไม่ง่วง เช่น ลอราทาดีน ครั้งละ 1/2 - 1 เม็ด วันละครั้ง\n\n" +
                    "      * ถ้าการรักษาดังกล่าวแล้วไม่ได้ผลหรือเป็นเรื้อรัง (มีอาการมากกว่า 4 วันต่อสัปดาห์ และมีอาการติดต่อกันนานกว่า 2 สัปดาห์) หรือรุนแรง (มีอาการนอน ไม่หลับ นอนกรน มีภาวะหยุดหายใจขณะหลับ มีผลกระทบต่อการเรียน การงาน หรือคุณภาพชีวิต) ให้เดินทางไปพบแพทย์เพื่อให้แพทย์วินิจฉัยโดยระเอียดมากขึ้น\n";
        }
    }

    private void sick1() {
        data3 = "       อาการเบื้องต้นสำหรับโรคไข้หวัด\n" +
                "     \t1.อาการไอ\n" +
                "     \t2.อาการน้ำมูกไหล\n" +
                "     \t3.อาการปวดหัว\n" +
                "     \t4.อาการตัวร้อน\n";
        if (dataint.equals("1")) {
            data1 = "คุณมีโอกาส 1 ใน 3 ที่จะเป็น\nโรคไข้หวัด ";
            data2 = "      1. ถ้ามีไข้ ให้กินพาราเซตามอล\n" +
                    "      2. พักผ่อนมากๆ ห้ามทำงานหนักหรือออกกำลังกายมากเกินไป\n" +
                    "      3. สวมใส่เสื้อผ้าให้ร่างกายอบอุ่น ห้ามถูกฝนหรือถูกอากาศเย็นจัด และห้ามอาบน้ำเย็น\n" +
                    "      4. ดื่มน้ำมากๆ เพื่อช่วยลดไข้ และทดแทนน้ำ ที่เสียไปเนื่องจากไข้สูง\n" +
                    "      5. ควรกินอาหารอ่อน น้ำข้าว น้ำหวาน น้ำส้ม น้ำผลไม้ หรือเครื่องดื่มร้อน ๆ\n" +
                    "      6. ใช้ผ้าชุบน้ำ (ควรใช้น้ำอุ่น หรือน้ำก๊อก ธรรมดา อย่าใช้น้ำเย็นจัดหรือน้ำแข็ง) เช็ดตัวเวลามีไข้สูง\n\n" +
                    "    * ถ้าไม่ดีขึ้นภายใน 3 วัน หรือมีอาการไข้สูง หนาวสั่น คลื่นไส้ อาเจียน แนะนำให้เดินทางไปพบแพทย์โดยด่วน เนื่องจากอาจเป็นโรคไข้หวัดใหญ่ หรือไข้เลือดออกได้ \n";
        }
        if (dataint.equals("2")) {
            data1 = "คุณมีโอกาส 2 ใน 3 ที่จะเป็น\nโรคไข้หวัด";
            data2 = "      1. ถ้ามีไข้ ให้กินพาราเซตามอล\n" +
                    "      2. พักผ่อนมากๆ ห้ามทำงานหนักหรือออกกำลังกายมากเกินไป\n" +
                    "      3. สวมใส่เสื้อผ้าให้ร่างกายอบอุ่น ห้ามถูกฝนหรือถูกอากาศเย็นจัด และห้ามอาบน้ำเย็น\n" +
                    "      4. ดื่มน้ำมากๆ เพื่อช่วยลดไข้ และทดแทนน้ำ ที่เสียไปเนื่องจากไข้สูง\n" +
                    "      5. ควรกินอาหารอ่อน น้ำข้าว น้ำหวาน น้ำส้ม น้ำผลไม้ หรือเครื่องดื่มร้อน ๆ\n" +
                    "      6. ใช้ผ้าชุบน้ำ (ควรใช้น้ำอุ่น หรือน้ำก๊อก ธรรมดา อย่าใช้น้ำเย็นจัดหรือน้ำแข็ง) เช็ดตัวเวลามีไข้สูง\n\n" +
                    "    * ถ้าไม่ดีขึ้นภายใน 3 วัน หรือมีอาการไข้สูง หนาวสั่น คลื่นไส้ อาเจียน แนะนำให้เดินทางไปพบแพทย์โดยด่วน เนื่องจากอาจเป็นโรคไข้หวัดใหญ่ หรือไข้เลือดออกได้ \n";
        }
        if (dataint.equals("3")) {
            data1 = "คุณเป็นโรคไข้หวัด";

            data2 = "      1. ถ้ามีไข้ ให้กินพาราเซตามอล\n" +
                    "      2. พักผ่อนมากๆ ห้ามทำงานหนักหรือออกกำลังกายมากเกินไป\n" +
                    "      3. สวมใส่เสื้อผ้าให้ร่างกายอบอุ่น ห้ามถูกฝนหรือถูกอากาศเย็นจัด และห้ามอาบน้ำเย็น\n" +
                    "      4. ดื่มน้ำมากๆ เพื่อช่วยลดไข้ และทดแทนน้ำ ที่เสียไปเนื่องจากไข้สูง\n" +
                    "      5. ควรกินอาหารอ่อน น้ำข้าว น้ำหวาน น้ำส้ม น้ำผลไม้ หรือเครื่องดื่มร้อน ๆ\n" +
                    "      6. ใช้ผ้าชุบน้ำ (ควรใช้น้ำอุ่น หรือน้ำก๊อก ธรรมดา อย่าใช้น้ำเย็นจัดหรือน้ำแข็ง) เช็ดตัวเวลามีไข้สูง\n\n" +
                    "    * ถ้าไม่ดีขึ้นภายใน 3 วัน หรือมีอาการไข้สูง หนาวสั่น คลื่นไส้ อาเจียน แนะนำให้เดินทางไปพบแพทย์โดยด่วน เนื่องจากอาจเป็นโรคไข้หวัดใหญ่ หรือไข้เลือดออกได้ \n";
        }
    }
}
