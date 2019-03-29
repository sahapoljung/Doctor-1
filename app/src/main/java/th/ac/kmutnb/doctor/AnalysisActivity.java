package th.ac.kmutnb.doctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.app.PendingIntent.getActivity;

public class AnalysisActivity extends AppCompatActivity implements View.OnClickListener {

    private int index;
    private String in ="0",num, a="01",b="001",c="0001";

    private String six;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);


        index = getIntent().getIntExtra("index", 0);
        Log.d("26JanV1", "index at Anlysis ไรไร" + index);

        TextView textView = findViewById(R.id.question);

        Button button1 = findViewById(R.id.btnYes);
        button1.setOnClickListener(this);

        Button button2 = findViewById(R.id.btnNo);
        button2.setOnClickListener(this);


        if (in.equals("0")) {textView.setText("คุณมีไข้ใช่หรือไม่");}
        if (in.equals("00")) {textView.setText("คุณปวดศรีษะหรือเวียนหัวใช่หรือไม่");}
        if (in.equals("000")) {textView.setText("คุณมีปัญหาเกี่ยวกับตาใช่หรือไม่่");}

    }//main funtion

    private void main1() {
        num = in;
        TextView textView = findViewById(R.id.question);

        Button button1 = findViewById(R.id.btnYes);
        button1.setOnClickListener(this);

        Button button2 = findViewById(R.id.btnNo);
        button2.setOnClickListener(this);

        if (in.equals("0")) {textView.setText("คุณมีไข้ใช่หรือไม่");}
        if (in.equals("00")) {textView.setText("คุณปวดศรีษะหรือเวียนหัวใช่หรือไม่");}
        if (in.equals("000")) {textView.setText("คุณมีปัญหาเกี่ยวกับตาใช่หรือไม่่");}


        if (num.equals(a) ) { six = num; in = "1"; }
        if (num == b) { six = num; in = "2"; }
        if (num == c) { six = num; in = "3"; }

        sick1(textView);



    }

    private void sick1(TextView textView) {
        if (six.equals("01")&&in.equals("1")) {textView.setText("คุณมีไข้ร่วมกับน้ำมูกหรือไอใช่หรือไม่");}
        if (six.equals("01")&&in.equals("11")) {textView.setText("ไอเสียงก้อง และหายใจเข้ามีเสียงฮึ้ด");}
        if (six.equals("01")&&in.equals("110")) {textView.setText("ปวดหู หรือหูอื้อ");}
        if (six.equals("01")&&in.equals("1100")) {textView.setText("กดเจ็บบริเวณไซนัส");}
        if (six.equals("01")&&in.equals("11000")) {textView.setText("ทอลชิลโตแดงหรือเป็นหนอง");}
        if (six.equals("01")&&in.equals("110000")) {textView.setText("น้ำมูกข้นเหลืองหรือเขียวเกิน 24 ชั่วโมง");}
        if (six.equals("01")&&in.equals("1100000")) {textView.setText("ปวดเมื่อยมาก หรือมีประวัติสัมผัสผู้ป่วยไข้หวัดใหญ่");}
        if (six.equals("01")&&in.equals("11000000")) {textView.setText("อาจมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//จบช่วงที่1

        if (six.equals("01")&&in.equals("10")) {textView.setText("คุณมีไข้ร่วมกับอาการหอบ หายใจขัด หายใจลำบาก หรือหายใจเร็วกว่าปกติใช่หรือไม่");}
        if (six.equals("01")&&in.equals("101")) {textView.setText("อาจมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//จบ
        if (six.equals("01")&&in.equals("100")) {textView.setText("คุณมีไข้ร่วมกับผื่นหรือตุ่มขึ้น เช่น จุดแดง จ้ำเขียว ผื่นแดง ตุ่มใส หรือตุ่มหนอง ใช่หรือไม่");}
        if (six.equals("01")&&in.equals("1001")) {textView.setText("ขึ้นเป็นตุ่มนูน");}
        if (six.equals("01")&&in.equals("10011")) {textView.setText("มีตุ่มน้ำ เม็ดพองร่วมกับปากเปื่อย ตาแดง ตาแฉะ");}
        if (six.equals("01")&&in.equals("100111")) {textView.setText("อาจมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//จบ
        if (six.equals("01")&&in.equals("100110")) {textView.setText("ตุ่มฝี ตุ่มหนองหรือพุพอง");}
        if (six.equals("01")&&in.equals("1001100")) {textView.setText("ตุ่มใส");}
        if (six.equals("01")&&in.equals("10011001")) {textView.setText("อาจมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//จบ
        if (six.equals("01")&&in.equals("10010")) {textView.setText("ขึ้นเป็นผื่นแดงเล็ก ๆ");}
        if (six.equals("01")&&in.equals("100101")) {textView.setText("ทอลซิลบวมแดงหรือเป็นหนอง ลิ้นสตอเบอร์รี่ และมีผื่นแดงขึ้นทั่วตัวหลังมีไข้ 1-2 วัน");}
        if (six.equals("01")&&in.equals("100100")) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//จบช่วงที่2

        if (six.equals("01")&&in.equals("1000")) {textView.setText("คุณมีไข้ ตัวร้อน อุณหภูมิของร่างกายสูงกว่า 37.2 องศา ใช่หรือไม่");}
        if (six.equals("01")&&in.equals("10001")) {textView.setText("ทอนซิลโตแดงหรือเป็นหนอง");}
        if (six.equals("01")&&in.equals("100011")) {textView.setText("มีผื่นแดงขึ้นทั่วตัวหลังมีไข้ 1-2 วันและตรวจพบลิ้นสตอเบอร์รี่");}//จบช่วงที่3


        if (six.equals("01")&&in.equals("111")) {textView.setText("ครู้ป");}
        if (six.equals("01")&&in.equals("1101")) {textView.setText("หูชั้นกลางอักเสบเฉียบพลัน");}
        if (six.equals("01")&&in.equals("11001")) {textView.setText("หูชั้นกลางอักเสบเฉียบพลัน");}
        if (six.equals("01")&&in.equals("110001")) {textView.setText("ทอนซิลอักเสบ");}
        if (six.equals("01")&&in.equals("1100001")) {textView.setText("ไข้หวัด");}
        if (six.equals("01")&&in.equals("11000001")) {textView.setText("ไข้หวัด หรือไข้หวัดใหญ่");}//โรคช่วงที่1
        if (six.equals("01")&&in.equals("1001101")) {textView.setText("ฝี / พุพอง");}
        if (six.equals("01")&&in.equals("10011001")) {textView.setText("อีสุกอีใส");}
        if (six.equals("01")&&in.equals("1001011")) {textView.setText("อีดำอีแดง");}
        if (six.equals("01")&&in.equals("1001010")) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//โรคช่วงที่2
        if (six.equals("01")&&in.equals("10000")) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (six.equals("01")&&in.equals("100010")) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (six.equals("01")&&in.equals("1000110")) {textView.setText("ทอนซิลอักเสบ");}
        if (six.equals("01")&&in.equals("1000111")) {textView.setText("อีดำอีแดง");}//โรคช่วงที่3
    }


    @Override
    public void onClick(View v) {
        Ana1 ana1 = new Ana1();
        //int index = 0;
        TextView textView = findViewById(R.id.question);
        switch (v.getId()) {
            case R.id.btnYes:
                in = in+"1";


                     main1();




                Log.d("26JanV1", "in at Anlysis ไรไร" + in);
                break;
            case R.id.btnNo:
                in = in + "0";

                  main1();


                    Log.d("26JanV1", "in at Anlysis ไรไร" + in);

                break;
        }
    }
}
