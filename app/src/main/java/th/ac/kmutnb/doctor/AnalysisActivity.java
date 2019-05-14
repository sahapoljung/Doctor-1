package th.ac.kmutnb.doctor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.app.PendingIntent.getActivity;

public class AnalysisActivity extends AppCompatActivity/* implements View.OnClickListener*/ {

    private int index;
    private String in ="0",num, a="01",b="001",c="0001",d="00001",e="000001",f="0000001",g="00000001";
    private String six,data;
    private String datanum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentfinol, new AnalysisChooseFragment())
                    .commit();
        }


        //index = getIntent().getIntExtra("index", 0);
       // Log.d("26JanV1", "in at Anlysis ไรไร" + in);

//        TextView textView = findViewById(R.id.question);
//
//        Button button1 = findViewById(R.id.btnYes);
//        button1.setOnClickListener(this);
//
//        Button button2 = findViewById(R.id.btnNo);
//        button2.setOnClickListener(this);
//
//
//        if (in.equals("0")) {textView.setText("คุณมีอาการคัดจมูก แน่นจมูก หรือมีน้ำมูกไหล ใช่หรือไม่");}//ไข้หวัด

    }//main funtion

    private void main1() {

//        TextView textView = findViewById(R.id.question);
//        Button button1 = findViewById(R.id.btnYes);
//        button1.setOnClickListener(this);
//
//        Button button2 = findViewById(R.id.btnNo);
//        button2.setOnClickListener(this);
//
//
//
//        if (in.equals("00")) {textView.setText("คุณปวดศรีษะ หรือเวียนหัวใช่หรือไม่");}
//        if (in.equals("000")) {textView.setText("คุณมีอาการเกี่ยวกับการมองเห็นใช่หรือไม่");}
//        if (in.equals("0000")) {textView.setText("คุณมีอาการชาทั้งปลายมือและปลายเท้า อาจรู้สึกแปล๊บ ๆ ร่วมด้วย ใช่หรือไม่");}
//        if (in.equals("00000")) {textView.setText("คุณเป็นแผลหรือรอยแตกที่มุมปากทั้งสองข้างใช่หรือไม่");}
//        if (in.equals("000000")) {textView.setText("คุณมีอาการเหงือกบวมแดง ใช่หรือไม่");}
//        if (in.equals("0000000")) {textView.setText("คุณมีอาการถ่ายเป็นน้ำหรือถ่ายเหลวมากกว่าวันละ 3 ครั้งใช่หรือไม่");}
//        if (in.equals("0000000")) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.contentfinol, new AnalysisFinalFragment()).commit(); }
//
//
//        num = in;
//
//        if (six ==null) { six = num; }
//
//        if (num.equals(a)) { six = num; in = "1"; }
//        if (num.equals(b)) { six = num; in = "1"; }
//        if (num.equals(c)) { six = num; in = "1"; }
//        if (num.equals(d)) { six = num; in = "1"; }
//        if (num.equals(e)) { six = num; in = "1"; }
//        if (num.equals(f)) { six = num; in = "1"; }
//        if (num.equals(g)) { six = num; in = "1"; }
//        //SetTxt();
//        if (six.equals(a)) { sick1(textView);}
//        if (six.equals(b)) { sick2(textView);}
//        if (six.equals(c)) { sick3(textView);}
//        if (six.equals(d)) { sick4(textView);}
//        if (six.equals(e)) { sick5(textView);}
//        if (six.equals(f)) { sick6(textView);}
//        if (six.equals(g)) { sick7(textView);}






    }
    private void SetTxt() {
        Button button1 = findViewById(R.id.btnYes);
        Button button2 = findViewById(R.id.btnNo);
        button1.setText("");
        button2.setText("");
        Log.d("26JanV1", "in at Anlysis datanum" + datanum);
        Log.d("26JanV1", "in at Anlysis data" + data);
        Intent intent = new Intent(AnalysisActivity.this, AnaFinalActivity.class);
        intent.putExtra("data1", data);
        intent.putExtra("numdata1",datanum );
        startActivity(intent);
        finish();
    }

    private void sick1(TextView textView ) {


        char someChar = '1';
        int count = 0;
            if (in.equals("1")) { textView.setText("คุณมีอาการตัวร้อน หรืออุณหภูมิเกิน 37.5 องศา ใช่หรือไม่"); }
            if (in.equals("11")) { textView.setText("ก่อนหน้านี้คุณได้ไปทำงาน หรือไปสัมผัสอากาศที่เปลี่ยนแปลงอย่างฉับพลัน ใช่หรือไม่"); }
            if (in.equals("111")||in.equals("110")) { textView.setText("คุณน้ำมูกข้นเหลืองหรือเขียวเกิน 24 ชั่วโมง ใช่หรือไม่"); }
            if (in.equals("1111")||in.equals("1101")||in.equals("1110")||in.equals("1100")) {
                textView.setText("คุณมีอาการปวดเมื่อยตามลำตัวมาก ๆ ร่วมด้วยใช่หรือไม่"); }

            if (in.equals("11111")||in.equals("11011")||in.equals("11101")||in.equals("11001")||in.equals("11110")||in.equals("11010")||in.equals("11100")||in.equals("11000")) {
                textView.setText("คุณมีอาการปวดหัวร่วมด้วย ใช่หรือไม่"); }

            if (in.equals("111111")||in.equals("110111")||in.equals("111011")||in.equals("110011")||in.equals("111101")||in.equals("110101")||in.equals("111001")||in.equals("110001")
            ||in.equals("111110")||in.equals("110110")||in.equals("111010")||in.equals("110010")||in.equals("111100")||in.equals("110100")||in.equals("111000")||in.equals("110000")) {
                textView.setText("คุณมีอาการไอ หรือเจ็บคอร่วมด้วยใช่หรือไม่"); }

            if (in.equals("1111111")||in.equals("1101111")||in.equals("1110111")||in.equals("1100111")||in.equals("1111011")||in.equals("1101011")||in.equals("1110011")||in.equals("1100011")
                    ||in.equals("1111101")||in.equals("1101101")||in.equals("1110101")||in.equals("1100101")||in.equals("1111001")||in.equals("1101001")||in.equals("1110001")||in.equals("1100001")

            ||in.equals("1111110")||in.equals("1101110")||in.equals("1110110")||in.equals("1100110")||in.equals("1111010")||in.equals("1101010")||in.equals("1110010")||in.equals("1100010")
                    ||in.equals("1111100")||in.equals("1101100")||in.equals("1110100")||in.equals("1100100")||in.equals("1111000")||in.equals("1101000")||in.equals("1110000")||in.equals("1100000")) {
                for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
                if (count == 1||count==2) { datanum = "1";  }
                if (count ==3||count == 4||count==5) { datanum = "2"; }
                if (count == 6||count==7) { datanum = "3"; }
                data = "ไข้หวัด";
                SetTxt();
            }



            if (in.equals("10")) { textView.setText("คุณมีอาการจามบ่อยมากเวลาถูกอากาศเย็น ฝุ่น หรือขนสัตว์ใช่หรือไม่"); }
            if (in.equals("101") || in.equals("100")) { textView.setText("คุณคันคอ คันจมูก เวลาถูกอากาศเย็นหรือฝุ่น หรือขนสัตว์ ใช่หรือไม่"); }
            if (in.equals("1011") || in.equals("1010") || in.equals("1001") || in.equals("1000")) {
                //textView.setText("หวัดภูมิแพ้");
                for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
                if (count == 1) { datanum = "1";  }
                if (count == 2) { datanum = "2"; }
                if (count == 3) {  datanum= "3"; }
                data = "หวัดภูมิแพ้";
                SetTxt();
        }

        }



//    private void sick2(TextView textView ) {
//        char someChar = '1';
//        int count = 0;
//        Log.d("26JanV1", "in at Anlysis sig" + six);
//
//            if (in.equals("1")) { textView.setText("มีอาการวิงเวียนศรีษะ รู้สึกโคลงเคลง หน้ามืดตาลายคล้ายจะเป็นลมใช่หรือไม่"); }
//            if (in.equals("11")) { textView.setText("เห็นบ้านหมุน หรือสิ่งรอบข้างหมุน ใช่หรือไม่"); }
//            if (in.equals("111")||in.equals("110")) { textView.setText("มีอาการบ้านหมุนเพียง 20-30 วินาที (ไม่เกิน 1 นาที) ใช่หรือไม่"); }
//            if (in.equals("1111")||in.equals("1101")||in.equals("1110")||in.equals("1100")) {
//                textView.setText("มีอาการบ้านหมุนทันทีเฉพาะเวลาเปลี่ยนท่าบางท่า เช่น นอนตะแคงข้าง ลุกจากเตียง ก้มศรีษะ ใช่หรือไม่"); }
//            if (in.equals("11111")||in.equals("11011")||in.equals("11101")||in.equals("11001")||in.equals("11110")||in.equals("11010")||in.equals("11100")||in.equals("11000")) {
//                //textView.setText("บ้านหมุนจากการเปลี่ยนท่า");
//                for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
//                if (count == 1) {  datanum= "1";  }
//                if (count == 2||count==3) { datanum = "2"; }
//                if (count == 4||count==5) { datanum = "3"; }
//                data = "บ้านหมุนจากการเปลี่ยนท่า";
//                SetTxt();
//            }
//
//            if (in.equals("10")) { textView.setText("คุณมีอาการปวดหรือเจ็บบริเวณรอบ ๆ ตา หรือภายในนัยน์ตาใช่หรือไม่"); }
//            if (in.equals("101")||in.equals("100")) { textView.setText("คุณมีอาการบ้านหมุนนำมาก่อน แล้วจึงมีอาการปวดหัวตุบ ๆ ที่ขมับตามมาใช่หรือไม่"); }
//            if (in.equals("1011")||in.equals("1001")||in.equals("1010")||in.equals("1000")) { textView.setText("มีอาการปวดหนัก ปวดมึน หรือปวดตุบๆ ที่บริเวณใดบริเวณหนึ่งของศรีษะใช่หรือไม่"); }
//            if (in.equals("10111")||in.equals("10011")||in.equals("10101")||in.equals("10001")||in.equals("10110")||in.equals("10010")||in.equals("10100")||in.equals("10000")) {
//                textView.setText("ในการปวดหัวแต่ละครั้งปวดนาน 4-72 ชม. ใช่หรือไม่"); }
//            if (in.equals("101111")||in.equals("100111")||in.equals("101011")||in.equals("100011")||in.equals("101101")||in.equals("100101")||in.equals("101001")||in.equals("100001")
//            ||in.equals("101110")||in.equals("100110")||in.equals("101010")||in.equals("100010")||in.equals("101100")||in.equals("100100")||in.equals("101000")||in.equals("100000")) {
//                textView.setText("ก่อนหน้านี้คุณได้รับสิ่งกระตุ้นทำให้มีอาการปวดหัว เช่น ภาวะเครียด, การอดนอน, การนอนและตื่นที่ไม่เป็นเวลา, ช่วงที่เป็นประจำเดือน, กลิ่นหรือควัน, การเปลี่ยนแปลงของอากาศ หรือความร้อน, แสงแดด ใช่หรือไม่"); }
//
//            if (in.equals("1011111")||in.equals("1001111")||in.equals("1010111")||in.equals("1000111")||in.equals("1011011")||in.equals("1001011")||in.equals("1010011")||in.equals("1000011")
//                    ||in.equals("1011101")||in.equals("1001101")||in.equals("1010101")||in.equals("1000101")||in.equals("1011001")||in.equals("1001001")||in.equals("1010001")||in.equals("1000001")
//            ||in.equals("1011110")||in.equals("1001110")||in.equals("1010110")||in.equals("1000110")||in.equals("1011010")||in.equals("1001010")||in.equals("1010010")||in.equals("1000010")
//                    ||in.equals("1011100")||in.equals("1001100")||in.equals("1010100")||in.equals("1000100")||in.equals("1011000")||in.equals("1001000")||in.equals("1010000")||in.equals("1000000")) {
//                //textView.setText("ไมเกรน");
//                for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
//                if (count == 1||count==2) {datanum  = "1";  }
//                if (count == 4||count==5||count ==3) {  datanum= "2"; }
//                if (count == 6||count==7) { datanum = "3"; }
//                data = "ไมเกรน";
//                SetTxt();
//            }
//        }
//
//    private void sick3(TextView textView ) {
//        char someChar = '1';
//        int count = 0;
//        if (in.equals("1")) { textView.setText("คุณมีอาการตามองเห็นไม่ชัด สายตามืดมัว เห็นภาพผิดเพี้ยน เห็นภาพซ้อน เห็นเงาหยากไย่/แมลงลอยไปมา หรือแสงวาบคล้ายฟ้าแลบ หรือลายสายตาแคบ (มองไม่เห็นด้านข้าง) ใช่หรือไม่"); }
//        if (in.equals("11")||in.equals("10")) { textView.setText("คุณมีอาการมองไม่เห็นในที่แสงน้อย หรือตาฟ้าฟางตอนกลางคืน ใช่หรือไม่"); }
//        if (in.equals("111")||in.equals("101")||in.equals("110")||in.equals("100")) { textView.setText("คุณมีอาการผิวหนังแห้ง และหยาบกร้าน ใช่หรือไม่"); }
//        if (in.equals("1111")||in.equals("1011")||in.equals("1101")||in.equals("1001")||in.equals("1110")||in.equals("1010")||in.equals("1100")||in.equals("1000")) { textView.setText("คุณมีอาการเยื่อบุตาแห้ง หรืออาการตาแห้ง ใช่หรือไม่"); }
//        if (in.equals("11111")||in.equals("10111")||in.equals("11011")||in.equals("10011")||in.equals("11101")||in.equals("10101")||in.equals("11001")||in.equals("10001")
//        ||in.equals("11110")||in.equals("10110")||in.equals("11010")||in.equals("10010")||in.equals("11100")||in.equals("10100")||in.equals("11000")||in.equals("10000")){
////                textView.setText("โรคขาดวิตามินเอ หรือโรคเกล็ดกระดี่ขึ้นตา");
//            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
//                if (count == 1||count==2) {datanum  = "1"; }
//                if (count == 3||count==4) { datanum = "2"; }
//                if (count == 5) { datanum = "3"; }
//                data = "โรคขาดวิตามินเอ หรือโรคเกล็ดกระดี่ขึ้นตา";
//                SetTxt();
//        }
//
//    }
//
//    private void sick4(TextView textView ){
//
//        char someChar = '1';
//        int count = 0;
//        if (in.equals("1")) { textView.setText("คุณมีอาการกล้ามเนื้อแขนและขาไม่มีกำลัง ร่วมด้วยใช่หรือไม่"); }
//        if (in.equals("11")||in.equals("10")) {textView.setText(" อ่อนเพลีย เหนื่อยง่าย");}
//        if (in.equals("111")||in.equals("101")||in.equals("110")||in.equals("100")){
//    //            textView.setText("โรคขาดวิตามินบี 1 หรือโรคเหน็บชา");
//    for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
//            if (count == 1) {datanum  = "1";}
//            if (count == 2) {datanum = "2";}
//            if (count == 3) { datanum = "3";}
//            data = "โรคขาดวิตามินบี 1 หรือโรคเหน็บชา";
//            SetTxt();
//
//        }
//    }
//
//    private void sick5(TextView textView ){
//        char someChar = '1';
//        int count = 0;
//        if (in.equals("1")) { textView.setText("คุณมีเกล็ดใสเล็ก ๆ ที่ซอกจมูกใช่หรือไม่"); }
//        if (in.equals("11")||in.equals("10")) { textView.setText("คุณมีอาการลิ้นมีสีแดงกว่าปกติและเจ็บ ใช่หรือไม่"); }
//        if (in.equals("111")||in.equals("101")||in.equals("110")||in.equals("100")) { textView.setText("คุณมีแผลที่ผนังภายในปากรู้สึกคันและปวดแสบปวดร้อนที่ตา ใช่หรือไม่"); }
//        if (in.equals("1111")||in.equals("1011")||in.equals("1101")||in.equals("1001")||in.equals("1110")||in.equals("1010")||in.equals("1100")||in.equals("1000")) {
////            textView.setText("โรคขาดวิตามินบี 2 หรือโรคปากนกกระจอก");
//            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
//            if (count == 1) { datanum = "1";  }
//            if (count == 2||count==3) { datanum = "2"; }
//            if (count == 4) { datanum = "3"; }
//            data = "โรคขาดวิตามินบี 2 หรือโรคปากนกกระจอก";
//            SetTxt();
//        }
//      }
//
//
//    private void sick6(TextView textView ){
//        char someChar = '1';
//        int count = 0;
//        if (in.equals("1")) { textView.setText("เมื่อคุณแปรงฟัน มักจะมีอาการเลือดออกตามไรฟัน ใช่หรือไม่"); }
//        if (in.equals("11")||in.equals("10")) { textView.setText("ช่วงนี้คุณรู้สึกมีอาการเจ็บป่วยได้ง่าย ใช่หรือไม่"); }
//        if (in.equals("111")||in.equals("101")||in.equals("110")||in.equals("100")) {
////        textView.setText("โรคขาดวิตามินซีหรือโรคลักปิดลักเปิด");
//            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
//            if (count == 1) {datanum  = "1"; }
//            if (count == 2) { datanum = "2"; }
//            if (count == 3) { datanum = "3"; }
//            data = "โรคขาดวิตามินซีหรือโรคลักปิดลักเปิด";
//            SetTxt();
//        }
//    }
//
//    private void sick7(TextView textView ) {
//
//        char someChar = '1';
//        int count = 0;
//        if (in.equals("1")) {
//            textView.setText("คุณมีอาการปวดท้องเป็นพัก ๆ ปวดมากจนตัวงอ ใช่หรือไม่");
//        }
//        if (in.equals("11") || in.equals("10")) {
//            textView.setText("คุณมีอาการอาเจียนร่วมด้วย ใช่หรือไม่");
//        }
//        if (in.equals("111") || in.equals("101") || in.equals("110") || in.equals("100")) {
//
////            textView.setText("โรคท้องเดินหรืออุจจาระร่วง");
////            SetTxt();
//            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
//            if (count == 1) {datanum  = "1"; }
//            if (count == 2) { datanum = "2"; }
//            if (count == 3) {  datanum= "3"; }
//            data = "โรคท้องเดินหรืออุจจาระร่วง";
//            SetTxt();
//        }
//    }
//
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.btnYes:
//                in = in+"1";
//                     main1();
//                Log.d("26JanV1", "in at Anlysis ไรไร" + in);
//                break;
//            case R.id.btnNo:
//                in = in + "0";
//                  main1();
//                    Log.d("26JanV1", "in at Anlysis ไรไร" + in);
//                break;
//        }
//    }
}
