package th.ac.kmutnb.doctor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnaFinalActivity extends AppCompatActivity {

    private String datastr;
    private String dataint;
    private String data1,data2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_final);
        TextView textView1 = findViewById(R.id.txtdataroc);
        TextView textView2 = findViewById(R.id.txtdatamol);
        dataint =getIntent().getExtras().getString("numdata1");
        datastr = getIntent().getExtras().getString("data1");
        Log.d("26JanV1", "in at Anlysissssss numdata   " + dataint);
        Log.d("26JanV1", "in at Anlysissssss numdata   " +datastr);

        if (datastr.equals("ไข้หวัด")&&dataint.equals("1")){ data1 = "ไข้หวัด ต่ำ";data2="      ควรไปพบแพทย์เพื่อวิเคราะห์อาการของของคุณอย่างละเอียด";}
        if (datastr.equals("ไข้หวัด")&&dataint.equals("2")){
            data1 = "ไข้หวัด ปานกลาง";
        data2 = "      1. ถ้ามีไข้ ให้กินพาราเซตามอล\n" +
                "      2. พักผ่อนมากๆ ห้ามทำงานหนักหรือออกกำลังกายมากเกินไป\n" +
                "      3. สวมใส่เสื้อผ้าให้ร่างกายอบอุ่น ห้ามถูกฝนหรือถูกอากาศเย็นจัด และห้ามอาบน้ำเย็น\n" +
                "      4. ดื่มน้ำมากๆ เพื่อช่วยลดไข้ และทดแทนน้ำ ที่เสียไปเนื่องจากไข้สูง\n" +
                "      5. ควรกินอาหารอ่อน น้ำข้าว น้ำหวาน น้ำส้ม น้ำผลไม้ หรือเครื่องดื่มร้อน ๆ\n" +
                "      6. ใช้ผ้าชุบน้ำ (ควรใช้น้ำอุ่น หรือน้ำก๊อก ธรรมดา อย่าใช้น้ำเย็นจัดหรือน้ำแข็ง) เช็ดตัวเวลามีไข้สูง\n\n" +
                "*ถ้าไม่ดีขึ้นภายใน 7 วัน หรือมีอาการแทรกซ้อนอื่นๆแนะนำให้รีบไปพบแพทย์ \n\n";}
        if (datastr.equals("ไข้หวัด")&&dataint.equals("3")){
            data1 = "จากการวิเคราะห์โอกาสที่จะเป็นสูง";

        data2=  "      1. ถ้ามีไข้ ให้กินพาราเซตามอล\n" +
                "      2. พักผ่อนมากๆ ห้ามทำงานหนักหรือออกกำลังกายมากเกินไป\n" +
                "      3. สวมใส่เสื้อผ้าให้ร่างกายอบอุ่น ห้ามถูกฝนหรือถูกอากาศเย็นจัด และห้ามอาบน้ำเย็น\n" +
                "      4. ดื่มน้ำมากๆ เพื่อช่วยลดไข้ และทดแทนน้ำ ที่เสียไปเนื่องจากไข้สูง\n" +
                "      5. ควรกินอาหารอ่อน น้ำข้าว น้ำหวาน น้ำส้ม น้ำผลไม้ หรือเครื่องดื่มร้อน ๆ\n" +
                "      6. ใช้ผ้าชุบน้ำ (ควรใช้น้ำอุ่น หรือน้ำก๊อก ธรรมดา อย่าใช้น้ำเย็นจัดหรือน้ำแข็ง) เช็ดตัวเวลามีไข้สูง\n\n" +
                "  * ถ้าไม่ดีขึ้นภายใน 7 วัน หรือมีอาการแทรกซ้อนอื่นๆแนะนำให้รีบไปพบแพทย์ \n\n";}
textView1.setText(data1);
        textView2.setText(data2);
//
//        if (data.equals("")&&numdata.equals("1")){ data1= "จากการวิเคราะห์โอกาสที่จะเป็นต่ำ";}
//        if (data.equals("")&&numdata.equals("2")){ data1 = "จากการวิเคราะห์โอกาสที่จะเป็นปานกลาง";}
//        if (data.equals("")&&numdata.equals("3")){ data1 = "จากการวิเคราะห์โอกาสที่จะเป็นสูง";}



    }
}
