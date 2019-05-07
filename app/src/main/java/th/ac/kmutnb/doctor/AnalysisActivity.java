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
    private String in ="0",num, a="01",b="001",c="0001",d="00001",e="000001",f="0000001",g="00000001";

    private String six;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);


        index = getIntent().getIntExtra("index", 0);
        Log.d("26JanV1", "in at Anlysis ไรไร" + in);

        TextView textView = findViewById(R.id.question);

        Button button1 = findViewById(R.id.btnYes);
        button1.setOnClickListener(this);

        Button button2 = findViewById(R.id.btnNo);
        button2.setOnClickListener(this);


        if (in.equals("0")) {textView.setText("คุณมีไข้ใช่หรือไม่");}

    }//main funtion

    private void main1() {
        num = in;
        TextView textView = findViewById(R.id.question);

        Button button1 = findViewById(R.id.btnYes);
        button1.setOnClickListener(this);

        Button button2 = findViewById(R.id.btnNo);
        button2.setOnClickListener(this);

        //Button button3 = findViewById(R.id.btnRs);
      //  button3.setOnClickListener(this);

        if (in.equals("00")) {textView.setText("คุณปวดศรีษะหรือเวียนหัวใช่หรือไม่");}
        if (in.equals("000")) {textView.setText("คุณมีปัญหาเกี่ยวกับตาใช่หรือไม่่");}
        if (in.equals("0000")) {textView.setText("คุณไอใช่ไหม");}
        if (in.equals("00000")) {textView.setText("คุณมีอาการเกี่ยวกับหูใช่หรือไม่");}
        if (in.equals("000000")) {textView.setText("คุณมีน้ำมูกไหลใช่หรือไม่");}
        if (in.equals("0000000")) {textView.setText("คุณรู้สึกเจ็บคอ หรือเสียงแหบใช่หรือไม่");}
        if (in.equals("00000000")) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}

        if (num.equals(a) ) { six = num; in = "1"; }
        if (num.equals(b) ){ six = num; in = "2"; }
        if (num.equals(c)) { six = num; in = "3"; }
        if (num.equals(d)) { six = num; in = "4"; }
        if (num.equals(e)) { six = num; in = "5"; }
        if (num.equals(f)) { six = num; in = "6"; }
        if (num.equals(g)) { six = num; in = "7"; }

        sick1(textView, button1, button2);
        sick2(textView);
        sick3(textView);
        sick4(textView);
        sick5(textView);
        sick6(textView);
        sick7(textView);


        //sick1(textView);
       // button1.setText("");
       // button2.setText("");


    }

    private void sick1(TextView textView ,Button button1,Button button2) {
        if (in.equals("1") && six.equals("01")) {textView.setText("คุณมีไข้ร่วมกับน้ำมูกหรือไอใช่หรือไม่");}
        if (in.equals("11") && six.equals("01")) {textView.setText("ไอเสียงก้อง และหายใจเข้ามีเสียงฮึ้ด");}
        if (in.equals("110") && six.equals("01")) {textView.setText("ปวดหู หรือหูอื้อ");}
        if (in.equals("1100") && six.equals("01")) {textView.setText("กดเจ็บบริเวณไซนัส");}
        if (in.equals("11000") && six.equals("01")) {textView.setText("ทอลชิลโตแดงหรือเป็นหนอง");}
        if (in.equals("110000") && six.equals("01")) {textView.setText("น้ำมูกข้นเหลืองหรือเขียวเกิน 24 ชั่วโมง");}
        if (in.equals("1100000") && six.equals("01")) {textView.setText("ปวดเมื่อยมาก หรือมีประวัติสัมผัสผู้ป่วยไข้หวัดใหญ่");}
        if (in.equals("11000000") && six.equals("01")) {textView.setText("อาจมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//จบช่วงที่1

        if (in.equals("10") && six.equals("01")) {textView.setText("คุณมีไข้ร่วมกับอาการหอบ หายใจขัด หายใจลำบาก หรือหายใจเร็วกว่าปกติใช่หรือไม่");}
        if (in.equals("101") && six.equals("01")) {textView.setText("อาจมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//จบ
        if (in.equals("100") && six.equals("01")) {textView.setText("คุณมีไข้ร่วมกับผื่นหรือตุ่มขึ้น เช่น จุดแดง จ้ำเขียว ผื่นแดง ตุ่มใส หรือตุ่มหนอง ใช่หรือไม่");}
        if (in.equals("1001") && six.equals("01")) {textView.setText("ขึ้นเป็นตุ่มนูน");}
        if (in.equals("10011") && six.equals("01")) {textView.setText("มีตุ่มน้ำ เม็ดพองร่วมกับปากเปื่อย ตาแดง ตาแฉะ");}
        if (in.equals("100111") && six.equals("01")) {textView.setText("อาจมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//จบ
        if (in.equals("100110") && six.equals("01")) {textView.setText("ตุ่มฝี ตุ่มหนองหรือพุพอง");}
        if (in.equals("1001100") && six.equals("01")) {textView.setText("ตุ่มใส");}
        if (in.equals("10011001") && six.equals("01")) {textView.setText("อาจมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//จบ
        if (in.equals("10010") && six.equals("01")) {textView.setText("ขึ้นเป็นผื่นแดงเล็ก ๆ");}
        if (in.equals("100101") && six.equals("01")) {textView.setText("ทอลซิลบวมแดงหรือเป็นหนอง ลิ้นสตอเบอร์รี่ และมีผื่นแดงขึ้นทั่วตัวหลังมีไข้ 1-2 วัน");}
        if (in.equals("100100") && six.equals("01")) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//จบช่วงที่2

        if (in.equals("1000") && six.equals("01")) {textView.setText("คุณมีไข้ ตัวร้อน อุณหภูมิของร่างกายสูงกว่า 37.2 องศา ใช่หรือไม่");}
        if (in.equals("10001") && six.equals("01")) {textView.setText("ทอนซิลโตแดงหรือเป็นหนอง");}
        if (in.equals("100011") && six.equals("01")) {textView.setText("มีผื่นแดงขึ้นทั่วตัวหลังมีไข้ 1-2 วันและตรวจพบลิ้นสตอเบอร์รี่");}//จบช่วงที่3


        if (in.equals("111") && six.equals("01")) {textView.setText("ครู้ป");button1.setText("");button2.setText("");}
        if (in.equals("1101") && six.equals("01")) {textView.setText("หูชั้นกลางอักเสบเฉียบพลัน");}
        if (in.equals("11001") && six.equals("01")) {textView.setText("หูชั้นกลางอักเสบเฉียบพลัน");}
        if (in.equals("110001") && six.equals("01")) {textView.setText("ทอนซิลอักเสบ");}
        if (in.equals("1100001")&& six.equals("01")) {textView.setText("ไข้หวัด");}
        if (in.equals("11000001") && six.equals("01")) {textView.setText("ไข้หวัด หรือไข้หวัดใหญ่");}//โรคช่วงที่1
        if (in.equals("1001101") && six.equals("01")) {textView.setText("ฝี / พุพอง");}
        if (in.equals("10011001") && six.equals("01")) {textView.setText("อีสุกอีใส");}
        if (in.equals("1001011") && six.equals("01")) {textView.setText("อีดำอีแดง");}
        if (in.equals("1001010") && six.equals("01")) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//โรคช่วงที่2
        if (in.equals("10000")&& six.equals("01")) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("100010") && six.equals("01")) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("1000110") && six.equals("01")) {textView.setText("ทอนซิลอักเสบ");}
        if (in.equals("1000111") && six.equals("01")) {textView.setText("อีดำอีแดง");}//โรคช่วงที่3
    }

    private void sick7(TextView textView) {
        if (in.equals("7")&&six.equals(g)) {textView.setText("เสียงแหบห้าวผิดไปจากปกติ หรือพูดไม่มีเสียง");}
        if (in.equals("71")&&six.equals(g)) {textView.setText("เสียงแหบนานเกิน 3 สัปดาห์");}
        if (in.equals("711")&&six.equals(g)) {textView.setText("เสียงแหบเฉพราะช่วงหลังตื่นนอน และมีอาการจุกแน่นหรือแสบตรงลิ้นปี่หรือเรอเปรี้ยวเป็นๆ หายๆ เรื้อรัง");}
        if (in.equals("710")&&six.equals(g)) {textView.setText("เป็นหวัด เจ็บคอ หรือไอ");}
        if (in.equals("710")&&six.equals(g)) {textView.setText("เกิดหลังจากการใข้เสียงมาก เช่น ครู นักเทศน์ นักร้อง หรือดื่มแอลกอฮอล์จัด หรือสูบบุหรี่จัด");}//ช่วง1
        if (in.equals("70")&&six.equals(g)) {textView.setText("รู้สึกเจ็บหรือแสบภายในลำคอ");}
        if (in.equals("701")&&six.equals(g)) {textView.setText("ทอนซิลโตแดง หรือเป็นหนอง");}
        if (in.equals("7010")&&six.equals(g)) {textView.setText("มีไข้");}
        if (in.equals("70101")&&six.equals(g)) {textView.setText("ต่อมน้ำเหลืองใต้คางบวมและปวด");}
        if (in.equals("70100")&&six.equals(g)) {textView.setText("เกิดขึ้นทันทีขณะกินอาหาร");}
        if (in.equals("701000")&&six.equals(g)) {textView.setText("เสียงแหบเฉพราะช่วงหลังตื่นนอน และมีอาการจุกแน่นหรือแสบตรงลิ้นปี่หรือเรอเปรี้ยวเป็นๆ หายๆ เรื้อรัง");}



        if (in.equals("7111")&&six.equals(g)) {textView.setText("โรคกรดไหลย้อน");}
        if (in.equals("7110")&&six.equals(g)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("7100")&&six.equals(g)) {textView.setText("กล่องเสียงอักเสบ");}
        if (in.equals("71001")&&six.equals(g)) {textView.setText("กล่องเสียงอักเสบ");}
        if (in.equals("71000")&&six.equals(g)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//ช่วง1
        if (in.equals("700")&&six.equals(g)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("7011")&&six.equals(g)) {textView.setText("ทอนซิลอักเสบ");}
        if (in.equals("701011")&&six.equals(g)) {textView.setText("ต่อมน้ำเหลืองอักเสบ");}
        if (in.equals("701010")&&six.equals(g)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("701001")&&six.equals(g)) {textView.setText("ก้างปลาหรือกระดูกติดคอ");}
        if (in.equals("7010001")&&six.equals(g)) {textView.setText("โรคกรดไหลย้อน");}
        if (in.equals("7010000")&&six.equals(g)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
    }

    private void sick6(TextView textView) {
        if (in.equals("6")&&six.equals(f)) {textView.setText("คัดจมูก แน่นจมูก หรือมีน้ำมูกไหล");}
        if (in.equals("61")&&six.equals(f)) {textView.setText("น้ำมูกข้นเหลืองหรือเขียวเกิน 24 ชม. หรือหายใจมีกลิ่นเหม็น");}
        if (in.equals("611")&&six.equals(f)) {textView.setText("เป็นเรื้อรัง หรือปวดและกดเจ็บตรงหัวคิ้วหรือใต้ตา");}
        if (in.equals("6110")&&six.equals(f)) {textView.setText("ในเด็กที่นำเมล็ดผลไม้ ยางลบ หรือของอื่นๆ ใส่เข้าจมูก");}
        if (in.equals("610")&&six.equals(f)) {textView.setText("มีน้ำมูกไหล");}
        if (in.equals("6101")&&six.equals(f)) {textView.setText("จามบ่อย คันจมูก หรือคัดคอ หรือมีประวติโรคภูมิแพ้");}


        if (in.equals("60")&&six.equals(f)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("6111")&&six.equals(f)) {textView.setText("ไซนัสอักเสบเรื้อรัง");}
        if (in.equals("61101")&&six.equals(f)) {textView.setText("สิ่งแปลกปลอมเข้าจมูก");}
        if (in.equals("61100")&&six.equals(f)) {textView.setText("เยื่อจมูกอักเสบเป็นหนอง");}
        if (in.equals("6100")&&six.equals(f)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("61011")&&six.equals(f)) {textView.setText("หวัดภูมิแพ้");}
        if (in.equals("61010")&&six.equals(f)) {textView.setText("ไข้หวัด");}
    }

    private void sick5(TextView textView) {
        if (in.equals("5")&&six.equals(e)) {textView.setText("คุณปวดในหูหรือรอบๆ หูข้างหนึ่ง หรือสองข้าง");}
        if (in.equals("51")&&six.equals(e)) {textView.setText("พบร่วมกับเป็นไข้หวัด หรือเจ็บคอและมีอาการไข้สูง และหูอื้อ");}
        if (in.equals("510")&&six.equals(e)) {textView.setText("แมลงเข้าหู หรือสิ่งแปลกปลอมเข้าหู");}
        if (in.equals("5100")&&six.equals(e)) {textView.setText("เป็นหลังแคะหู");}
        if (in.equals("51000")&&six.equals(e)) {textView.setText("มีอาการหลังนั่งเครื่องบิน หรือดำน้ำลึก");}
        if (in.equals("510000")&&six.equals(e)) {textView.setText("คันในรูหู หรือมีขุยขาว น้ำตาล หรือดำในรูหู");}
        if (in.equals("5100000")&&six.equals(e)) {textView.setText("มีอาการหูอื้อร่วมด้วยเกิดขึ้นทันทีหลังว่ายน้ำ หรือดำน้ำ หรือส่องหูแล้วพบมีขี้หูอุดตัน");}//ช่วง1
        if (in.equals("50")&&six.equals(e)) {textView.setText("มีอาการหูอื้อคล้ายมีน้ำในหู เสียงดังรบกวนในหู รู้สึกแน่นในหู");}
        if (in.equals("501")&&six.equals(e)) {textView.setText("สิ่งแปลกปลอมเข้าหู");}
        if (in.equals("5010")&&six.equals(e)) {textView.setText("มีอาการหูอื้อร่วมด้วยเกิดขึ้นทันทีหลังว่ายน้ำ หรือดำน้ำ หรือส่องหูแล้วพบมีขี้หูอุดตัน");}//ช่วง2
        if (in.equals("500")&&six.equals(e)) {textView.setText("หูตึง/หูหนวก ฟังได้ไม่ชัด ไม่ได้ยิน");}
        if (in.equals("5001")&&six.equals(e)) {textView.setText("เป็นไข้หวัด หรือเจ็บคอ และใช้เครื่องส่องหูพบเยื่อแก้วหูบวมแดง");}
        if (in.equals("50010")&&six.equals(e)) {textView.setText("ได้ยินเสียงต่ำ (เสียงเคาะประตู) ได้ดีกว่าเสียงสูง (เสียงกระดิ่ง๗");}
        if (in.equals("500101")&&six.equals(e)) {textView.setText("ทำงานในที่ ๆ มีเสียงดังมาก เช่น ในโรงงาน");}//ช่วง3
        if (in.equals("5000")&&six.equals(e)) {textView.setText("มีหนองไหลหรือเลือดออกที่หู");}
        if (in.equals("50001")&&six.equals(e)) {textView.setText("หูมีหนองไหล");}
        if (in.equals("500011")&&six.equals(e)) {textView.setText("ปวดหูมากเวลาดึงใบหู");}
        if (in.equals("5000110")&&six.equals(e)) {textView.setText("เป็นหนองเรื้อรัง หรือส่องหูพบเยื่อแก้วหูมีรูทะลุ");}
        if (in.equals("50001100")&&six.equals(e)) {textView.setText("หลังเป็นไข้หวัด เจ็บคอ หรือมีไข้ หรือใช้เครื่องส่องหู");}
        if (in.equals("500010")&&six.equals(e)) {textView.setText("มีเลือดไหล ที่หู");}
        if (in.equals("5000101")&&six.equals(e)) {textView.setText("หลังแคะหูหรือแยงหู");}
        if (in.equals("50001010")&&six.equals(e)) {textView.setText("เป็นหลังนั่งเครื่องบินหรือดำน้ำลึก");}

        if (in.equals("511")&&six.equals(e)) {textView.setText("พหูชั้นกลางอักเสบเฉียบพลัน");}
        if (in.equals("5101")&&six.equals(e)) {textView.setText("สิ่งแปลกปลอมเข้าหู");}
        if (in.equals("51001")&&six.equals(e)) {textView.setText("แผลถลอกในช่องหู");}
        if (in.equals("510001")&&six.equals(e)) {textView.setText("หูบาดเจ็บจากความกดดันอากาศ");}
        if (in.equals("5100001")&&six.equals(e)) {textView.setText("โรคเชื้อราในช่องหู");}
        if (in.equals("51000001")&&six.equals(e)) {textView.setText("ขี้หูอุดตันรูหู");}
        if (in.equals("51000000")&&six.equals(e)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//ช่วง1
        if (in.equals("5011")&&six.equals(e)) {textView.setText("สิ่งแปลกปลอมเข้าหู");}
        if (in.equals("50101")&&six.equals(e)) {textView.setText("ขี้หูอุดตันรูหู");}
        if (in.equals("50100")&&six.equals(e)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//ช่วง2
        if (in.equals("50011")&&six.equals(e)) {textView.setText("หูชั้นกลางอักเสบเฉียบพลัน");}
        if (in.equals("5001011")&&six.equals(e)) {textView.setText("หูตึงเนื่องจากเสียง");}
        if (in.equals("500100")&&six.equals(e)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("5001010")&&six.equals(e)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//ช่วง3
        if (in.equals("5000111")&&six.equals(e)) {textView.setText("หูชั้นนอกอักเสบ");}
        if (in.equals("50001101")&&six.equals(e)) {textView.setText("หูชั้นกลางอักเสบเรื้อรัง");}
        if (in.equals("500011001")&&six.equals(e)) {textView.setText("หูชั้นกลางอักเสบเฉียบพลัน");}
        if (in.equals("500011000")&&six.equals(e)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("50001011")&&six.equals(e)) {textView.setText("แผลถลอกในช่องหู");}
        if (in.equals("500010101")&&six.equals(e)) {textView.setText("หูบาดเจ็บจากความกดอากาศ");}
        if (in.equals("500010100")&&six.equals(e)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("5000100")&&six.equals(e)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("50000")&&six.equals(e)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
    }

    private void sick4(TextView textView) {
        if (in.equals("4")&&six.equals(d)) {textView.setText("มีอาการไอแบบแห้งๆ(ไม่มีเสมหะ) หรือไอแบบมีเสมหะก็ได้");}
        if (in.equals("41")&&six.equals(d)) {textView.setText("ไอเสียงก้องและหายใจเข้ามีเสียงดีงฮึ้ด ตอนกลางคืน ในเด็กอายุ 6เดือน - 3ปี");}
        if (in.equals("411")&&six.equals(d)) {textView.setText("อาจเป็นครู๊ป");}
        if (in.equals("410")&&six.equals(d)) {textView.setText("ไอนานกว่า 2 สัปดาห์");}
        if (in.equals("4101")&&six.equals(d)) {textView.setText("คัดจมูก คันคอ หรือจามบ่อย เวลาถูกอากาศเย็นหรือฝ่น หรือขนสัตว์");}
        if (in.equals("41010")&&six.equals(d)) {textView.setText("ไอเฉพาะช่วงหลังตื่นนอนหรือหลังกินอาหาร และมีอาการจุกแน่นหรือแสบตรงลิ้นปี่หรือเรอเปรี้ยว");}
        if (in.equals("4100")&&six.equals(d)) {textView.setText("มีเสมหะ ?");}
        if (in.equals("410100")&&six.equals(d)) {textView.setText("มีเสมหะ ?");}
        if (in.equals("41001")&&six.equals(d)) {textView.setText("เหนื่อยง่าย หรือเรื้อรังเป็นแรมเดือนแรมปี");}
        if (in.equals("4101001")&&six.equals(d)) {textView.setText("เหนื่อยง่าย หรือเรื้อรังเป็นแรมเดือนแรมปี");}
        if (in.equals("410011")&&six.equals(d)) {textView.setText("เสมหะข้นและมีกลิ่นเหม็น");}
        if (in.equals("41010011")&&six.equals(d)) {textView.setText("เสมหะข้นและมีกลิ่นเหม็น");}


        if (in.equals("40")&&six.equals(d)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("41011")&&six.equals(d)) {textView.setText("หวัดภูมิแพ้");}
        if (in.equals("410101")&&six.equals(d)) {textView.setText("โรคกรดไหลย้อน");}
        if (in.equals("41010010")&&six.equals(d)) {textView.setText("หลอดลมอักเสบ");}
        if (in.equals("410010")&&six.equals(d)) {textView.setText("หลอดลมอักเสบ");}
        if (in.equals("410100111")&&six.equals(d)) {textView.setText("หลอดลมพอง");}
        if (in.equals("4100111")&&six.equals(d)) {textView.setText("หลอดลมพอง");}
        if (in.equals("41000")&&six.equals(d)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("4100110")&&six.equals(d)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("410100110")&&six.equals(d)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
    }

    private void sick3(TextView textView) {
        if (in.equals("3")&&six.equals(c)) {textView.setText("มีอาการปวดหรือเจ็บบริเวณรอบๆตา หรือภายในนัยน์ตาใช่หรือไม่");}
        if (in.equals("31")&&six.equals(c)) {textView.setText("ขอบตาบนบวมแดง มีแผลเปื่อยหรือมีสะเก็ดสีขาว");}
        if (in.equals("310")&&six.equals(c)) {textView.setText("มีตุ่มฝีขึ้นที่เปลือกตา");}
        if (in.equals("3101")&&six.equals(c)) {textView.setText("ขึ้นที่หัวตา");}
        if (in.equals("3100")&&six.equals(c)) {textView.setText("ปวดรอบกระบอกตา");}
        if (in.equals("31001")&&six.equals(c)) {textView.setText("กดเจ็บตรงหัวคิ้วหรือใต้ตา หรือมีน้ำมูกหรือเสมหะสีเหลืองหรือเขียว");}
        if (in.equals("310010")&&six.equals(c)) {textView.setText("ปวดตุบๆที่ขมับ หรือแต่ละครั้งปวดนาน 4-72 ชั่วโมง และมีสาเหตุกระตุ้น");}//จบช่วง1
        if (in.equals("30")&&six.equals(c)) {textView.setText("มีอาการตามองเห็นไม่ชัด สาตามืดมัว เห็นภาพผิดเพี้ยน เห็นภาพซ้อน เห็นเงาหยากไย่/แมลงลอยไปมา หรือแสงวาบคล้ายฟ้าแลบ หรือลายสายตาแคบ (มองไม่เห็นด้านข้าง)");}
        if (in.equals("301")&&six.equals(c)) {textView.setText("ตาฟ้าฟางตอนกลางคืนในผู้ที่ขาดอาหาร/โภชนาการไม่ดี");}
        if (in.equals("3010")&&six.equals(c)) {textView.setText("มองเห็นไม่ชัด (เหมือนภาพถ่ายที่โฟกัสไม่ดี) เวลาใกล้หรือมองไกล");}
        if (in.equals("30101")&&six.equals(c)) {textView.setText("อ่านหนังสือใกล้ตาไม่ชัด ในคนอายุมากกว่า 40 ปี");}//ช/่วง2
        if (in.equals("300")&&six.equals(c)) {textView.setText("มีอาการเคืองตา คันตา ตาแดง หรือมีขี้ตาแฉะ");}
        if (in.equals("3001")&&six.equals(c)) {textView.setText("หนังตาบวม");}
        if (in.equals("30011")&&six.equals(c)) {textView.setText("หนังตาบวมแดงมีแผลเปื่อย หรือมีสะเก็ดขาว");}
        if (in.equals("30010")&&six.equals(c)) {textView.setText("คันตา");}
        if (in.equals("300101")&&six.equals(c)) {textView.setText("พบหลังกินยา/อาหารทะเล/ถูกฝุ่น/สัมผัสสารเคมี หรือมีประวัติโรคภูมิแพ้");}
        if (in.equals("3001010")&&six.equals(c)) {textView.setText("พบตุ่มเล็กๆ สีเหลืองที่เยื่อบุเปลือกตาบน");}
        if (in.equals("300100")&&six.equals(c)) {textView.setText("เศษเหล็ก/ฝุ่นเข้าตา");}


        if (in.equals("311")&&six.equals(c)) {textView.setText("หนังตาอักเสบ");}
        if (in.equals("31011")&&six.equals(c)) {textView.setText("ถุงน้ำตาอักเสบ");}
        if (in.equals("31010")&&six.equals(c)) {textView.setText("กุ้งยิง");}
        if (in.equals("310011")&&six.equals(c)) {textView.setText("ไซนัสอักเสบ");}
        if (in.equals("3100101")&&six.equals(c)) {textView.setText("ไมเกรน");}
        if (in.equals("3100100")&&six.equals(c)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("31000")&&six.equals(c)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//จบช่วง1
        if (in.equals("3011")&&six.equals(c)) {textView.setText("โรคขาดวิตามินเอ");}
        if (in.equals("301011")&&six.equals(c)) {textView.setText("สายตายาวในผู้สูงอายุ");}
        if (in.equals("301010")&&six.equals(c)) {textView.setText("สายตาผิดปกติ");}//ช่วง2
        if (in.equals("300111")&&six.equals(c)) {textView.setText("หนังตาอักเสบุ");}
        if (in.equals("300110")&&six.equals(c)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("3001011")&&six.equals(c)) {textView.setText("เยื่อตาขาวอักเสบจากการแพ้");}
        if (in.equals("30010101")&&six.equals(c)) {textView.setText("ริดสีดวงตา");}
        if (in.equals("30010100")&&six.equals(c)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("3001001")&&six.equals(c)) {textView.setText("สิ่งแปลกปลอมเข้าตา");}
        if (in.equals("3001000")&&six.equals(c)) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
    }

    private void sick2(TextView textView) {
        if (in.equals("2")&&six.equals("001")) {textView.setText("มีอาการปวดหนัก ปวดมึน หรือปวดตุบๆ ที่บริเวณใดบริเวณหนึ่งของศรีษะ รอบตา หรือใบหน้า");}
        if (in.equals("21")&&six.equals("001")) {textView.setText("ปวดตุบๆ ที่ขมับข้างเดียว หรือ 2 ข้าง แต่ละครั้งปวดนาน 4-72 ชม. และมีสาเหตุกระตุ้น");}
        if (in.equals("210")&&six.equals("001")) {textView.setText("ปวดหัลงจากการอ่านหนังสือ หรือใช้สายตามาก");}
        if (in.equals("2101")&&six.equals("001")) {textView.setText("สายตาไม่ดี เช่นสายตาสั้น หรือสายตายาว");}//ช่วง1
        if (in.equals("20")&&six.equals("001")) {textView.setText("มีอาการวิงเวียนศรีษะ รู้สึกโคลงเคลง หน้ามืดตาลายคล้ายจะเป็นลมใช่หรือไม่");}
        if (in.equals("201")&&six.equals("001")) {textView.setText("เห็นบ้านหมุน หรือสิ่งรอบข้างหมุน");}
        if (in.equals("2011")&&six.equals("001")) {textView.setText("หูตึงหรือได้ยินไม่ชัด หรือมีเสียงดังรบกวนในหู");}
        if (in.equals("20111")&&six.equals("001")) {textView.setText("มีไข้ ปวดหู เยื่อแก้วหูบวมแดง หรือมีหูน้ำหนวกไหล");}
        if (in.equals("20110")&&six.equals("001")) {textView.setText("มีอาการบ้านหมุนเพียง 20-30 วินาที (ไม่เกิน 1 นาที)");}
        if (in.equals("201101")&&six.equals("001")) {textView.setText("มีอาการบ้านหมุนทันทีเฉพาะเวลาเปลี่ยนท่าบางท่า เช่น นอนตะแคงข้าง ลุกจากเตียง ก้มศรีษะ");}
        if (in.equals("201100")&&six.equals("001")) {textView.setText("มีอาการบ้านหมุนทันทีเฉพาะเวลาเปลี่ยนท่าบางท่า เช่น นอนตะแคงข้าง ลุกจากเตียง ก้มศรีษะ");}//ช่วง2


        if (in.equals("211")&&six.equals("001")) {textView.setText("ไมเกรน");}
        if (in.equals("21011")&&six.equals("001")) {textView.setText("สายตาผิดปกติ");}
        if (in.equals("21010")&&six.equals("001")) {textView.setText("รักษาตามอาการ");}
        if (in.equals("2100")&&six.equals("001")) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//ช่วง1
        if (in.equals("201111")&&six.equals("001")) {textView.setText("หูชั้นกลางอักเสบเฉียบพลัน");}
        if (in.equals("201110")&&six.equals("001")) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("2011010")&&six.equals("001")) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
        if (in.equals("2011011")&&six.equals("001")) {textView.setText("บ้านหมุนจากการเปลี่ยนท่า");}
        if (in.equals("2011001")&&six.equals("001")) {textView.setText("ไมเกรน");}
        if (in.equals("2010")&&six.equals("001")) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//ช่วง2
        if (in.equals("2011000")&&six.equals("001")) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}//ช่วง2
        if (in.equals("200")&&six.equals("001")) {textView.setText("อาจเป็นมีสาเหตุร้ายแรงอื่น ๆ ควรรีบไปพบแพทย์");}
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
//            case R.id.btnRs:
//
//
//
//
//
//
//
//                break;

        }
    }
}
