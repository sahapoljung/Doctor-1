package th.ac.kmutnb.doctor;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class AnalysisChooseFragment extends Fragment implements View.OnClickListener {

    private int index;
    private String in ="0",num, a="011",b="0101",c="01001",d="0011",e="00101",f="001001",g="";
    private String[] jum={"011","0101","01001","0011","00101","001001","0001","00001","000001"};
    private String six,data;
    private String datanum,dataAddnum,idString;

    public AnalysisChooseFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        TextView textView = getView().findViewById(R.id.question);

        Button button1 = getView().findViewById(R.id.btnYes);
        button1.setOnClickListener(this);

        Button button2 = getView().findViewById(R.id.btnNo);
        button2.setOnClickListener(this);

        Intent intent1 = getActivity().getIntent();
        if (intent1.hasExtra("idString")) {
            idString=getActivity().getIntent().getExtras().getString("idString");}


        if (in.equals("0")) {textView.setText("คุณมีอาการปวดหรือเวียนศีรษะใช่หรือไม่");}

    }

    private void pad(TextView textView) {
        ConstraintLayout constraintLayout = getView().findViewById(R.id.clchoos);
        constraintLayout.setMaxWidth(0);
        textView.setText("ควรไปพบแพทย์โดยด่วน");
    }

    private void main1() {

        TextView textView = getView().findViewById(R.id.question);
        TextView textView1 = getView().findViewById(R.id.question1);
        Button button1 = getView().findViewById(R.id.btnYes);
        button1.setOnClickListener(this);
        ImageView qImageView = (ImageView)getActivity().findViewById(R.id.imageanalysis);
        Button button2 = getView().findViewById(R.id.btnNo);
        button2.setOnClickListener(this);

        if (in.equals("01")) {textView.setText("คุณมีอาการคัดจมูก แน่นจมูก หรือมีน้ำมูกไหล ใช่หรือไม่");}//1
        if (in.equals("010")) {textView.setText("มีอาการวิงเวียนศรีษะ รู้สึกโคลงเคลง หน้ามืดตาลายคล้ายจะเป็นลมใช่หรือไม่");}//2
        if (in.equals("0100")) {textView.setText("คุณมีอาการปวดหนัก ปวดมึน หรือปวดตุบๆ ที่บริเวณใดบริเวณหนึ่งของศรีษะใช่หรือไม่");}//3

        if (in.equals("01000")) {textView.setText("ควรพบแพทย์พื่อดูอาการ");}

        if (in.equals("00")) {textView.setText("คุณมีอาการปวดท้องใช่หรือไม่");}

        if (in.equals("001")) {textView.setText("คุณมีอาการปวดท้อง ปวดจุก แสบ แน่นบริเวณเหนือสะดือกลางท้องหรือบริเวณลิ้นปี่ ใช่หรือไม่");qImageView.setBackgroundResource(R.drawable.g7_1);}//4
        if (in.equals("0010")) {textView.setText("คุณมีอาการถ่ายเป็นน้ำหรือถ่ายเหลวมากกว่าวันละ 3 ครั้งใช่หรือไม่");qImageView.setBackgroundResource(0);}//5
        if (in.equals("00100")) {textView.setText("คุณมีอาการเจ็บปวด ปวดแสบ และขัดขณะปัสสาวะ โดยเฉพาะตอนปัสสาวะสุดร่วมด้วย ใช่หรือไม่");}//6

        if (in.equals("001000")) {textView.setText("ควรพบแพทย์พื่อดูอาการ");}

        if (in.equals("000")) {textView.setText("คันคอ คันจมูก เวลาถูกอากาศเย็นหรือฝุ่น หรือขนสัตว์ ใช่หรือไม่");}
        if (in.equals("0000")) {textView.setText("คุณมีอาการมองไม่เห็นในที่แสงน้อย หรือตาฟ้าฟางตอนกลางคืน ใช่หรือไม่");}
        if (in.equals("00000")) {textView.setText("คุณมีอาการเหงือกบวมแดง ใช่หรือไม่");qImageView.setBackgroundResource(R.drawable.g8_1);}

        if (in.equals("000000")) {textView.setText("");}

                if (in.equals("000000")) {
                    qImageView.setBackgroundResource(0);
                    textView.setText("ระบบไม่สามารถวิเคราะห์อาการที่คุณเป็นได้ ควรพบแพทย์เพื่อตรวจอาการ");
            textView1.setGravity(1);
            textView1.setText(" * ถ้าคุณต้องการดูอาการเพื่อดูแล\n"+ "รักษาเบื้องต้นกด\n"+" ' Yes ' ถ้าไม่กด ' No '"); }
        if (in.equals("0000000")) {
            Intent intent = new Intent(getActivity(),DocTorActivity.class);
            intent.putExtra("id", idString);
            startActivity(intent);
            getActivity().finish();
        }
        if (in.equals("0000001")) {
            Intent intent = new Intent(getActivity(),SickDataActivity.class);
            startActivity(intent);
            getActivity().finish();
        }

        //3&4
//        if (in.equals("00")) {textView.setText("คุณปวดศรีษะ หรือเวียนหัวใช่หรือไม่");}//3&4
//        //5
//        if (in.equals("000")) {textView.setText("คุณมีอาการเกี่ยวกับการมองเห็นใช่หรือไม่");}//5
//        //6
//        if (in.equals("0000")) {textView.setText("คุณมีอาการเจ็บปวด ปวดแสบ และขัดขณะปัสสาวะ โดยเฉพาะตอนปัสสาวะสุด ร่วมด้วย ใช่หรือไม่");}//6
//        //7
//        if (in.equals("00000")) {textView.setText("คุณมีอาการปวดท้อง ปวดจุก แสบ แน่นบริเวณเหนือสะดือกลางท้องหรือบริเวณลิ้นปี่ ใช่หรือไม่");qImageView.setBackgroundResource(R.drawable.g7_1);}
//        //8
//        if (in.equals("000000")) {textView.setText("คุณมีอาการเหงือกบวมแดง ใช่หรือไม่");qImageView.setBackgroundResource(R.drawable.g8_1);}
//        //9
//        if (in.equals("0000000")) {textView.setText("คุณมีอาการถ่ายเป็นน้ำหรือถ่ายเหลวมากกว่าวันละ 3 ครั้งใช่หรือไม่");qImageView.setBackgroundResource(0);}
////      หน้าสุดท้ายที่ให้เลือกไปที่อาการต่อ
//        if (in.equals("00000000")) {textView.setText("ระบบไม่สามารถวิเคราะห์อาการที่คุณเป็นได้ ควรพบแพทย์เพื่อดูอาการ");
//            textView1.setGravity(1);
//            textView1.setText(" * ถ้าคุณต้องการดูอาการเพื่อดูแล\n"+ "รักษาเบื้องต้นกด\n"+" ' Yes ' ถ้าไม่กด ' No '"); }
//        if (in.equals("000000000")) {
//            Intent intent = new Intent(getActivity(),DocTorActivity.class);
//            startActivity(intent);
//            getActivity().finish();
//        }
//        if (in.equals("000000001")) {
//            Intent intent = new Intent(getActivity(),SickDataActivity.class);
//            startActivity(intent);
//            getActivity().finish();
//        }

        num = in;
       if(six==null){ six = num;}
        for (int i=0;i<9;i++){
            if (num.equals(jum[i])) {
                six = num; in = "1";
            }
        }
        if (six.equals(jum[0])) { sick1(textView,textView1,qImageView);}
        if (six.equals(jum[1])) { sick2(textView,textView1,qImageView);}
        if (six.equals(jum[2])) { sick3(textView,textView1,qImageView);}
        if (six.equals(jum[3])) { sick4(textView,textView1,qImageView);}
        if (six.equals(jum[4])) { sick5(textView,textView1,qImageView);}
        if (six.equals(jum[5])) { sick6(textView,textView1,qImageView);}
        if (six.equals(jum[6])) { sick7(textView,textView1,qImageView);}
        if (six.equals(jum[7])) { sick8(textView,textView1,qImageView);}
        if (six.equals(jum[8])) { sick9(textView,textView1,qImageView);}


//        if (num.equals(a)) { six = num; in = "1"; }
//        if (num.equals(b)) { six = num; in = "1"; }
//        if (num.equals(c)) { six = num; in = "1"; }
//        if (num.equals(d)) { six = num; in = "1"; }
//        if (num.equals(e)) { six = num; in = "1"; }
//        if (num.equals(f)) { six = num; in = "1"; }
//        if (num.equals(g)) { six = num; in = "1"; }
        //SetTxt();
//        if (six.equals(a)) { sick1(textView,textView1,qImageView);}
//        if (six.equals(b)) { sick2(textView,textView1,qImageView);}
//        if (six.equals(c)) { sick3(textView,textView1,qImageView);}
//        if (six.equals(d)) { sick4(textView,textView1,qImageView);}
//        if (six.equals(e)) { sick5(textView,textView1,qImageView);}
//        if (six.equals(f)) { sick6(textView,textView1,qImageView);}
//        if (six.equals(g)) { sick7(textView,textView1,qImageView);}

    }
    private void SetTxt() {
        Button button1 = getView().findViewById(R.id.btnYes);
        Button button2 = getView().findViewById(R.id.btnNo);
        button1.setText("");
        button2.setText("");
        Log.d("26JanV1", "in at Anlysis datanum" + datanum);
        Log.d("26JanV1", "in at Anlysis data" + data);
        Intent intent = new Intent(new Intent(getActivity(), AnaFinalActivity.class));
        Intent intent1 = getActivity().getIntent();
        if (intent1.hasExtra("idString")) {
            idString=getActivity().getIntent().getExtras().getString("idString");
            intent.putExtra("idString", idString);
            Log.d("26JanV1", "in at Anlysis idString  " + idString);
        } else {
            Log.d("26JanV1", "in at Anlysis idString else " + idString);
            // Do something else
        }
        intent.putExtra("data1", data);
        intent.putExtra("numdata1",datanum );
        intent.putExtra("dataAddnum",dataAddnum );
        startActivity(intent);
        getActivity().finish();


    }

    private void sick1(TextView textView ,TextView textView1, ImageView qImageView) {
        char someChar = '1';
        int count = 0;
        if (in.equals("1")) {
            textView.setText("คุณมีอาการตัวร้อน หรืออุณหภูมิเกิน 37.5 องศา ใช่หรือไม่");
        textView1.setText(" * อาการตัวร้อน คือ\n" +
                    "      1. เอามือทาบหน้าผากหรือคอ สังเกตว่าร้อนกว่าปกติหรือไม่\n" +
                    "      2. สังเกตว่าหน้าแดงเรื่อหรือแดงจัดหรือเปล่า\n");}
        if (in.equals("11") || in.equals("10")) { textView.setText("ก่อนหน้านี้คุณได้ไปทำงาน หรือไปสัมผัสอากาศที่เปลี่ยนแปลงอย่างฉับพลัน ใช่หรือไม่"); textView1.setText("");}
        if (in.equals("111") || in.equals("101")||in.equals("110") || in.equals("100")) { textView.setText("คุณน้ำมูกข้นเหลืองหรือเขียวเกิน 24 ชั่วโมง ใช่หรือไม่"); }
        if (in.equals("1111") || in.equals("1011")||in.equals("1101") || in.equals("1001")||in.equals("1110") || in.equals("1010")||in.equals("1100") || in.equals("1000")) {
            textView.setText("คุณมีอาการปวดเมื่อยตามลำตัวมาก ๆ ร่วมด้วยใช่หรือไม่"); }
        if (in.equals("11111") || in.equals("10111")||in.equals("11011") || in.equals("10011")||in.equals("11101") || in.equals("10101")||in.equals("11001") || in.equals("10001")
                ||in.equals("11110") || in.equals("10110")||in.equals("11010") || in.equals("10010")||in.equals("11100") || in.equals("10100")||in.equals("11000") || in.equals("10000")) {

            textView.setText("คุณมีอาการปวดหัวร่วมด้วย ใช่หรือไม่"); }

        if (in.equals("111111") || in.equals("101111")||in.equals("110111") || in.equals("100111")||in.equals("111011") || in.equals("101011")||in.equals("110011") || in.equals("100011")
                ||in.equals("111101") || in.equals("101101")||in.equals("110101") || in.equals("100101")||in.equals("111001") || in.equals("101001")||in.equals("110001") || in.equals("100001")

                ||in.equals("111110") || in.equals("101110")||in.equals("110110") || in.equals("100110")||in.equals("111010") || in.equals("101010")||in.equals("110010") || in.equals("100010")
                ||in.equals("111100") || in.equals("101100")||in.equals("110100") || in.equals("100100")||in.equals("111000") || in.equals("101000")||in.equals("110000") || in.equals("100000")) {

            textView.setText("คุณมีอาการไอ หรือเจ็บคอร่วมด้วยใช่หรือไม่"); }

        if (in.equals("1111111") || in.equals("1011111")||in.equals("1101111") || in.equals("1001111")||in.equals("1110111") || in.equals("1010111")||in.equals("1100111") || in.equals("1000111")
                ||in.equals("1111011") || in.equals("1011011")||in.equals("1101011") || in.equals("1001011")||in.equals("1110011") || in.equals("1010011")||in.equals("1100011") || in.equals("1000011")

                ||in.equals("1111101") || in.equals("1011101")||in.equals("1101101") || in.equals("1001101")||in.equals("1110101") || in.equals("1010101")||in.equals("1100101") || in.equals("1000101")
                ||in.equals("1111001") || in.equals("1011001")||in.equals("1101001") || in.equals("1001001")||in.equals("1110001") || in.equals("1010001")||in.equals("1100001") || in.equals("1000001")

       || in.equals("1111110") || in.equals("1011110")||in.equals("1101110") || in.equals("1001110")||in.equals("1110110") || in.equals("1010110")||in.equals("1100110") || in.equals("1000110")
                ||in.equals("1111010") || in.equals("1011010")||in.equals("1101010") || in.equals("1001010")||in.equals("1110010") || in.equals("1010010")||in.equals("1100010") || in.equals("1000010")

                ||in.equals("1111100") || in.equals("1011100")||in.equals("1101100") || in.equals("1001100")||in.equals("1110100") || in.equals("1010100")||in.equals("1100100") || in.equals("1000100")
                ||in.equals("1111000") || in.equals("1011000")||in.equals("1101000") || in.equals("1001000")||in.equals("1110000") || in.equals("1010000")||in.equals("1100000") || in.equals("1000000")) {

            textView.setText(" คุณมีอาการไข้สูง หรือหนาวสั่น หรือคลื่น ไส้อาเจียน ใช่หรือไม่ "); }


        if (in.equals("11111111") || in.equals("10111111")||in.equals("11011111") || in.equals("10011111")||in.equals("11101111") || in.equals("10101111")||in.equals("11001111") || in.equals("10001111")
                ||in.equals("11110111") || in.equals("10110111")||in.equals("11010111") || in.equals("10010111")||in.equals("11100111") || in.equals("10100111")||in.equals("11000111") || in.equals("10000111")

                ||in.equals("11111011") || in.equals("10111011")||in.equals("11011011") || in.equals("10011011")||in.equals("11101011") || in.equals("10101011")||in.equals("11001011") || in.equals("10001011")
                ||in.equals("11110011") || in.equals("10110011")||in.equals("11010011") || in.equals("10010011")||in.equals("11100011") || in.equals("10100011")||in.equals("11000011") || in.equals("10000011")

                || in.equals("11111101") || in.equals("10111101")||in.equals("11011101") || in.equals("10011101")||in.equals("11101101") || in.equals("10101101")||in.equals("11001101") || in.equals("10001101")
                ||in.equals("11110101") || in.equals("10110101")||in.equals("11010101") || in.equals("10010101")||in.equals("11100101") || in.equals("10100101")||in.equals("11000101") || in.equals("10000101")

                ||in.equals("11111001") || in.equals("10111001")||in.equals("11011001") || in.equals("10011001")||in.equals("11101001") || in.equals("10101001")||in.equals("11001001") || in.equals("10001001")
                ||in.equals("11110001") || in.equals("10110001")||in.equals("11010001") || in.equals("10010001")||in.equals("11100001") || in.equals("10100001")||in.equals("11000001") || in.equals("10000001")) {

            pad(textView); }

        if (in.equals("11111110") || in.equals("10111110")||in.equals("11011110") || in.equals("10011110")||in.equals("11101110") || in.equals("10101110")||in.equals("11001110") || in.equals("10001110")
                ||in.equals("11110110") || in.equals("10110110")||in.equals("11010110") || in.equals("10010110")||in.equals("11100110") || in.equals("10100110")||in.equals("11000110") || in.equals("10000110")

                ||in.equals("11111010") || in.equals("10111010")||in.equals("11011010") || in.equals("10011010")||in.equals("11101010") || in.equals("10101010")||in.equals("11001010") || in.equals("10001010")
                ||in.equals("11110010") || in.equals("10110010")||in.equals("11010010") || in.equals("10010010")||in.equals("11100010") || in.equals("10100010")||in.equals("11000010") || in.equals("10000010")

                || in.equals("11111100") || in.equals("10111100")||in.equals("11011100") || in.equals("10011100")||in.equals("11101100") || in.equals("10101100")||in.equals("11001100") || in.equals("10001100")
                ||in.equals("11110100") || in.equals("10110100")||in.equals("11010100") || in.equals("10010100")||in.equals("11100100") || in.equals("10100100")||in.equals("11000100") || in.equals("10000100")

                ||in.equals("11111000") || in.equals("10111000")||in.equals("11011000") || in.equals("10011000")||in.equals("11101000") || in.equals("10101000")||in.equals("11001000") || in.equals("10001000")
                ||in.equals("11110000") || in.equals("10110000")||in.equals("11010000") || in.equals("10010000")||in.equals("11100000") || in.equals("10100000")||in.equals("11000000") || in.equals("10000000")) {
            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
            if (count == 1||count==2) { datanum = "1";  }
            if (count ==3||count == 4||count==5) { datanum = "2"; }
            if (count == 6||count==7) { datanum = "3"; }
            data = "ไข้หวัด";
            dataAddnum = "1";
            SetTxt();
        }



    }

    private void sick2(TextView textView ,TextView textView1, ImageView qImageView) {
        char someChar = '1';
        int count = 0;
        if (in.equals("1")) { textView.setText("เห็นบ้านหมุน หรือสิ่งรอบข้างหมุน ใช่หรือไม่");
            textView1.setText(" * อาการบ้านหมุน คือ \n" +
                    "      รู้สึกว่าสิ่งแวดล้อมรอบตัวหรือสิ่งของที่มองเห็นหมุนไป หรือรู้สึกว่าตัวเองหมุนไปทั้งๆ ที่ตนเองอยู่กับที่");}

        if (in.equals("11") || in.equals("10")) { textView.setText("มีอาการบ้านหมุนเพียง 20-30 วินาที (ไม่เกิน 1 นาที) ใช่หรือไม่");textView1.setText(""); }
        if (in.equals("111") || in.equals("101")||in.equals("110") || in.equals("100")) {
            textView.setText("มีอาการบ้านหมุนทันทีเฉพาะเวลาเปลี่ยนท่าบางท่า เช่น นอนตะแคงข้าง ลุกจากเตียง ก้มศรีษะ ใช่หรือไม่"); }
        if (in.equals("1111") || in.equals("1011")||in.equals("1101") || in.equals("1001")||in.equals("1110") || in.equals("1010")||in.equals("1100") || in.equals("1000")) {
            textView.setText("ถ้าคุณมีอาการอาเจียนมากหรือหูอื้อ หูตึง หรือแว่วเสียงดังในหู หรือเดินเซ หรือแขนขาชาหรืออ่อนแรง หรือพูดอ้อแอ้ หรือกลืนลําบาก หรือตาเห็นภาพซ้อน ใช่หรือไม่"); }

        if (in.equals("11111") || in.equals("10111")||in.equals("11011") || in.equals("10011")||in.equals("11101") || in.equals("10101")||in.equals("11001") || in.equals("10001")) {
            pad(textView); }

        if (in.equals("11110") || in.equals("10110")||in.equals("11010") || in.equals("10010")||in.equals("11100") || in.equals("10100")||in.equals("11000") || in.equals("10000")) {

            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
            if (count == 1) {  datanum= "1";  }
            if (count == 2||count==3) { datanum = "2"; }
            if (count == 4) { datanum = "3"; }
            data = "บ้านหมุนจากการเปลี่ยนท่า";
            dataAddnum = "3";
            SetTxt();
             }
    }

    private void sick3(TextView textView ,TextView textView1, ImageView qImageView) {
        char someChar = '1';
        int count = 0;
        if (in.equals("1")) { textView.setText("คุณมีอาการปวดหนัก ปวดมึน หรือปวดตุบๆ ที่บริเวณใดบริเวณหนึ่งของศรีษะใช่หรือไม่"); }
        if (in.equals("11") || in.equals("10")) { textView.setText("คุณมีอาการบ้านหมุนนำมาก่อน แล้วจึงมีอาการปวดหัวตุบ ๆ ที่ขมับตามมาใช่หรือไม่");
        textView1.setText(" * อาการบ้านหมุน คือ \n" + "      รู้สึกว่าสิ่งแวดล้อมรอบตัวหรือสิ่งของที่มองเห็นหมุนไป หรือรู้สึกว่าตัวเองหมุนไปทั้งๆ ที่ตนเองอยู่กับที่");}

        if (in.equals("111") || in.equals("101")||in.equals("110") || in.equals("100")) {
            textView.setText("คุณมีอาการปวดหรือเจ็บบริเวณรอบ ๆ ตา หรือภายในนัยน์ตาใช่หรือไม่");
            textView1.setText("");}

        if (in.equals("1111") || in.equals("1011")||in.equals("1101") || in.equals("1001")||in.equals("1110") || in.equals("1010")||in.equals("1100") || in.equals("1000")) {
            textView.setText("ในการปวดหัวแต่ละครั้งปวดนาน 4-72 ชม. ใช่หรือไม่"); }

        if (in.equals("1111") || in.equals("1011")||in.equals("1101") || in.equals("1001")||in.equals("1110") || in.equals("1010")||in.equals("1100") || in.equals("1000")) {
            textView.setText("ก่อนหน้านี้คุณได้รับสิ่งกระตุ้นทำให้มีอาการปวดหัว เช่น ภาวะเครียด, การอดนอน, การนอนและตื่นที่ไม่เป็นเวลา, ช่วงที่เป็นประจำเดือน, กลิ่นหรือควัน, การเปลี่ยนแปลงของอากาศ หรือความร้อน, แสงแดด ใช่หรือไม่"); }

        if (in.equals("11111") || in.equals("10111")||in.equals("11011") || in.equals("10011")||in.equals("11101") || in.equals("10101")||in.equals("11001") || in.equals("10001")
        ||in.equals("11110") || in.equals("10110")||in.equals("11010") || in.equals("10010")||in.equals("11100") || in.equals("10100")||in.equals("11000") || in.equals("10000")) {
            textView.setText("ถ้าคุณมีอาการปวดศีรษะรุนแรง หรือปวดติดต่อกันนานเกิน 72 ชั่วโมง หรือแขนขาอ่อนแรงหรือหมดสติ ใช่หรือไม่"); }

        if (in.equals("111111") || in.equals("101111")||in.equals("110111") || in.equals("100111")||in.equals("111011") || in.equals("101011")||in.equals("110011") || in.equals("100011")
                ||in.equals("111101") || in.equals("101101")||in.equals("110101") || in.equals("100101")||in.equals("111001") || in.equals("101001")||in.equals("110001") || in.equals("100001")) {

            pad(textView); }

        if(in.equals("111110") || in.equals("101110")||in.equals("110110") || in.equals("100110")||in.equals("111010") || in.equals("101010")||in.equals("110010") || in.equals("100010")
        ||in.equals("111100") || in.equals("101100")||in.equals("110100") || in.equals("100100")||in.equals("111000") || in.equals("101000")||in.equals("110000") || in.equals("100000")) {

            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
            if (count == 1) {datanum  = "1";  }
            if (count == 2||count ==3) {  datanum= "2"; }
            if (count == 4||count==5) { datanum = "3"; }
            data = "ไมเกรน";
            dataAddnum = "4";
            SetTxt();
}

    }

    private void sick4(TextView textView ,TextView textView1, ImageView qImageView){
        char someChar = '1';
        int count = 0;
        if (in.equals("1")) { textView.setText("คุณปวดแบบเป็น ๆ หาย ๆ มาไม่น้อยกว่าหนึ่งเดือน ใช่หรือไม่"); qImageView.setBackgroundResource(0);}
        if (in.equals("11") || in.equals("10")) { textView.setText("คุณปวดท้อง ขณะที่เกี่ยวข้องกับมื้ออาหาร เช่น ปวดขณะหิวหรืออิ่มแต่เป็นการปวดแบบทนได้ ใช่หรือไม่"); }

        if (in.equals("111") || in.equals("101")||in.equals("110") || in.equals("100")) { textView.setText("คุณมีอาการท้องเฟ้อ อิ่มง่าย จุกหน้าอกแน่นท้อง เรอบ่อย อาหารไม่ย่อย และรู้สึกคลื่นไส้หลังการรับประทานอาหารไม่มีความอยากอาหาร ใช่หรือไม่"); }

        if (in.equals("1111") || in.equals("1011")||in.equals("1101") || in.equals("1001")||in.equals("1110") || in.equals("1010")||in.equals("1100") || in.equals("1000")) {
            textView.setText("คุณมีอาการหน้าท้องแข็ง และกดที่หน้าท้องแล้วรู้สึกเจ็บ ใช่หรือไม่"); }

        if (in.equals("11111") || in.equals("10111")||in.equals("11011") || in.equals("10011")||in.equals("11101") || in.equals("10101")||in.equals("11001") || in.equals("10001")
                ||in.equals("11110") || in.equals("10110")||in.equals("11010") || in.equals("10010")||in.equals("11100") || in.equals("10100")||in.equals("11000") || in.equals("10000")) {
            textView.setText("คุณมีอาการอาเจียนเป็นเลือดหรือถ่ายดํา หรือหน้ามืด เป็นลมหรือช็อก ใช่หรือไม่");}

        if (in.equals("111111") || in.equals("101111")||in.equals("110111") || in.equals("100111")||in.equals("111011") || in.equals("101011")||in.equals("110011") || in.equals("100011")
                ||in.equals("111101") || in.equals("101101")||in.equals("110101") || in.equals("100101")||in.equals("111001") || in.equals("101001")||in.equals("110001") || in.equals("100001")) {

            pad(textView); }

        if(in.equals("111110") || in.equals("101110")||in.equals("110110") || in.equals("100110")||in.equals("111010") || in.equals("101010")||in.equals("110010") || in.equals("100010")
                ||in.equals("111100") || in.equals("101100")||in.equals("110100") || in.equals("100100")||in.equals("111000") || in.equals("101000")||in.equals("110000") || in.equals("100000")) {

            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
            if (count == 1||count == 2) { datanum = "1";  }
            if (count == 3) { datanum = "2"; }
            if (count == 4||count==5) { datanum = "3"; }
            data = "โรคกระเพาะอักเสบ";
            dataAddnum = "7";
            SetTxt();
        }



    }

    private void sick5(TextView textView ,TextView textView1, ImageView qImageView){

        char someChar = '1';
        int count = 0;
        if (in.equals("1")) {
            textView.setText("คุณมีอาการปวดท้องเป็นพัก ๆ ปวดมากจนตัวงอ ใช่หรือไม่");
        }
        if (in.equals("11") || in.equals("10")) { textView.setText("คุณมีอาการอาเจียนร่วมด้วย ใช่หรือไม่"); }

        if (in.equals("111") || in.equals("101") || in.equals("110") || in.equals("100")) {
            textView.setText("คุณมีอาการถ่ายปนเลือด หรือภาวะขาดน้ำและเกลือแร่อย่างรุนแรง ใช่หรือไม่");
            textView1.setText(" * ภาวะขาดน้ำรุนแรง คือ น้ำหนักตัวลดมากกว่าร้อยละ 10 ผู้ป่วยมีอาการอ่อนเพลียมาก ลุกนั่งไม่ได้ ต้องนอน " +
                    "ไม่ค่อยรู้สึกตัวหรือช็อก (กระสับกระส่าย ตัวเย็น มือเท้าเย็นชืด ชีพจรเบาเร็ว ความดันต่ำมาก ปัสสาวะออกน้อยหรือไม่ออกเลย) " +
                    "และมีอาการตาโบ๋มาก ผิวหนังเที่ยวมาก ริมฝีปากและ ลิ้นแห้งผาก หายใจเร็วและลึก ในทารกนอกจากอาการดังกล่าวแล้ว" +
                    "ยังพบว่ากระหม่อมบุ๋มมาก แน่นิ่ง และตัวอ่อนปวกเปียก");

        }

        if (in.equals("1111") || in.equals("1011") || in.equals("1101") || in.equals("1001")) {
            pad(textView);textView1.setText(""); }

        if(in.equals("1110") || in.equals("1010") || in.equals("1100") || in.equals("1000")){
            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
            if (count == 1) {datanum  = "1"; }
            if (count == 2) { datanum = "2"; }
            if (count == 3) {  datanum= "3"; }
            dataAddnum = "9";
            data = "โรคท้องเดินหรืออุจจาระร่วง";
            SetTxt();
        }





    }

    private void sick6(TextView textView ,TextView textView1, ImageView qImageView){

        char someChar = '1';
        int count = 0;
        if (in.equals("1")) { textView.setText("คุณมีอาการเจ็บปวดท้องน้อย (ใกล้กระดูกหัวหน่าว) ใช่หรือไม่");qImageView.setBackgroundResource(R.drawable.g6_1); }

        if (in.equals("11") || in.equals("10")) {
            textView.setText("ภายในหนึ่งวันคุณปัสสาวะบ่อย บ่อยมากกว่า 10 ครั้งต่อวัน แต่ครั้งละน้อยๆแบบกะปริบกะปรอย และคล้ายถ่ายปัสสาวะไม่สุด ใช่หรือไม่");qImageView.setBackgroundResource(0);}
        if (in.equals("111") || in.equals("101")||in.equals("110") || in.equals("100")) {
            textView.setText("ปัสสาวะของคุณมีสีเข้ม ขุ่น หรือมีกลิ่นเหม็นผิดปกติ ใช่หรือไม่"); }
        if (in.equals("1111") || in.equals("1011")||in.equals("1101") || in.equals("1001")||in.equals("1110") || in.equals("1010")||in.equals("1100") || in.equals("1000")) {
            textView.setText("คุณมีอาการอาการปัสสาวะแล้วพบเลือดปนออกมากับปัสสาวะ หรือถ่ายปัสสาวะถี่มากขึ้น หรือรู้สึกปวดขณะถ่ายปัสสาวะเป็นเวลานานหลายชั่วโมง ใช่หรือไม่"); }

        if (in.equals("11111") || in.equals("10111")||in.equals("11011") || in.equals("10011")||in.equals("11101") || in.equals("10101")||in.equals("11001") || in.equals("10001")) {
            pad(textView); }

        if (in.equals("11110") || in.equals("10110")||in.equals("11010") || in.equals("10010")||in.equals("11100") || in.equals("10100")||in.equals("11000") || in.equals("10000")) {

            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
            if (count == 1) {  datanum= "1";  }
            if (count == 2||count==3) { datanum = "2"; }
            if (count == 4) { datanum = "3"; }
            data = "โรคกระเพาะปัสสาวะอักเสบ";
            dataAddnum = "6";
            SetTxt();
        }

    }

    private void sick7(TextView textView ,TextView textView1, ImageView qImageView){

        char someChar = '1';
        int count = 0;
        if (in.equals("1")) { textView.setText("คุณมีอาการคัดจมูก แน่นจมูก หรือมีน้ำมูกไหล ใช่หรือไม่"); }
        if (in.equals("11") || in.equals("10")) { textView.setText("คุณมีอาการจามบ่อยมาก เวลาถูกอากาศเย็นหรือฝุ่น หรือขนสัตว์ใช่หรือไม่"); }
        if (in.equals("111") || in.equals("101")||in.equals("110") || in.equals("100")) {
            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
            if (count == 1) { datanum = "1";  }
            if (count == 2) { datanum = "2"; }
            if (count == 3) {  datanum= "3"; }
            dataAddnum = "2";
            data = "หวัดภูมิแพ้";
            SetTxt();

        }



    }

    private void sick8(TextView textView ,TextView textView1, ImageView qImageView){

        char someChar = '1';
        int count = 0;
        if (in.equals("1")) { textView.setText("คุณมีอาการตามองเห็นไม่ชัด สาตามืดมัว เห็นภาพผิดเพี้ยน เห็นภาพซ้อน เห็นเงาหยากไย่/แมลงลอยไปมา หรือแสงวาบคล้ายฟ้าแลบ หรือลายสายตาแคบ (มองไม่เห็นด้านข้าง) ใช่หรือไม่");
            qImageView.setBackgroundResource(R.drawable.g5_1);}
        if (in.equals("11") || in.equals("10")) { textView.setText("คุณมีอาการผิวหนังแห้ง และหยาบกร้าน ใช่หรือไม่");qImageView.setBackgroundResource(0); }
        if (in.equals("111") || in.equals("101")||in.equals("110") || in.equals("100")) {
            textView.setText("คุณมีอาการเยื่อบุตาแห้ง หรืออาการตาแห้ง ใช่หรือไม่");
            textView1.setText(" * อาการตาแห้ง\n" + "      เกิดจากระบบต่อมน้ำตาทำงานผิดปกติ ทำให้มีปริมาณน้ำตาไม่เพียงพอหรือมีการระเหยของน้ำตาที่มากเกินไป ส่งผลให้เกิดอาการไม่สบายตา เช่น เคืองตา แสบตา ตาแห้ง เป็นต้น");
        }

        if (in.equals("1111") || in.equals("1011")||in.equals("1101") || in.equals("1001")||in.equals("1110") || in.equals("1010")||in.equals("1100") || in.equals("1000")) {
            textView.setText("คุณมีอาการอ่อนตัวของกระจกตาดำ ใช่หรือไม่");
            qImageView.setBackgroundResource(R.drawable.g5_2);
            textView1.setText(""); }

        if (in.equals("11111") || in.equals("10111")||in.equals("11011") || in.equals("10011")||in.equals("11101") || in.equals("10101")||in.equals("11001") || in.equals("10001")) {
            pad(textView); qImageView.setBackgroundResource(0);}

        if (in.equals("11110") || in.equals("10110")||in.equals("11010") || in.equals("10010")||in.equals("11100") || in.equals("10100")||in.equals("11000") || in.equals("10000")) {
            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
            if (count == 1) {datanum  = "1"; }
            if (count == 2||count==3) { datanum = "2"; }
            if (count == 4) { datanum = "3"; }
            data = "โรคขาดวิตามินเอ หรือโรคเกล็ดกระดี่ขึ้นตา";
            dataAddnum = "5";
            SetTxt();
        }



    }

    private void sick9(TextView textView ,TextView textView1, ImageView qImageView){


        char someChar = '1';
        int count = 0;
        if (in.equals("1")) { textView.setText("เมื่อคุณแปรงฟัน มักจะมีอาการเลือดออกตามไรฟัน ใช่หรือไม่"); qImageView.setBackgroundResource(R.drawable.g8_2);}
        if (in.equals("11") || in.equals("10")) { textView.setText("ช่วงนี้คุณรู้สึกมีอาการเจ็บป่วยได้ง่าย ใช่หรือไม่");qImageView.setBackgroundResource(0); }
        if (in.equals("111") || in.equals("101")||in.equals("110") || in.equals("100")) {
            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
            if (count == 1) {datanum  = "1"; }
            if (count == 2) { datanum = "2"; }
            if (count == 3) { datanum = "3"; }
            data = "โรคขาดวิตามินซีหรือโรคลักปิดลักเปิด";
            dataAddnum = "8";
            SetTxt();
            }
    }

    //           1&2

//    private void sick1(TextView textView ,TextView textView1, ImageView qImageView) {
//
//
//        char someChar = '1';
//        int count = 0;
//        if (in.equals("1")) { textView.setText("คุณมีอาการตัวร้อน หรืออุณหภูมิเกิน 37.5 องศา ใช่หรือไม่");
//            textView1.setTextSize(20);
//        textView1.setText(" * อาการตัวร้อน คือ\n" +
//                    "      1. เอามือทาบหน้าผากหรือคอ สังเกตว่าร้อนกว่าปกติหรือไม่\n" +
//                    "      2. สังเกตว่าหน้าแดงเรื่อหรือแดงจัดหรือเปล่า\n");}
//        if (in.equals("11")) { textView.setText("ก่อนหน้านี้คุณได้ไปทำงาน หรือไปสัมผัสอากาศที่เปลี่ยนแปลงอย่างฉับพลัน ใช่หรือไม่");
//            textView1.setText("");}
//        if (in.equals("111")||in.equals("110")) { textView.setText("คุณน้ำมูกข้นเหลืองหรือเขียวเกิน 24 ชั่วโมง ใช่หรือไม่"); }
//        if (in.equals("1111")||in.equals("1101")||in.equals("1110")||in.equals("1100")) {
//            textView.setText("คุณมีอาการปวดเมื่อยตามลำตัวมาก ๆ ร่วมด้วยใช่หรือไม่"); }
//
//        if (in.equals("11111")||in.equals("11011")||in.equals("11101")||in.equals("11001")||in.equals("11110")||in.equals("11010")||in.equals("11100")||in.equals("11000")) {
//            textView.setText("คุณมีอาการปวดหัวร่วมด้วย ใช่หรือไม่"); }
//
//        if (in.equals("111111")||in.equals("110111")||in.equals("111011")||in.equals("110011")||in.equals("111101")||in.equals("110101")||in.equals("111001")||in.equals("110001")
//                ||in.equals("111110")||in.equals("110110")||in.equals("111010")||in.equals("110010")||in.equals("111100")||in.equals("110100")||in.equals("111000")||in.equals("110000")) {
//            textView.setText("คุณมีอาการไอ หรือเจ็บคอร่วมด้วยใช่หรือไม่"); }
//
//        if (in.equals("1111111")||in.equals("1101111")||in.equals("1110111")||in.equals("1100111")||in.equals("1111011")||in.equals("1101011")||in.equals("1110011")||in.equals("1100011")
//                ||in.equals("1111101")||in.equals("1101101")||in.equals("1110101")||in.equals("1100101")||in.equals("1111001")||in.equals("1101001")||in.equals("1110001")||in.equals("1100001")
//
//                ||in.equals("1111110")||in.equals("1101110")||in.equals("1110110")||in.equals("1100110")||in.equals("1111010")||in.equals("1101010")||in.equals("1110010")||in.equals("1100010")
//                ||in.equals("1111100")||in.equals("1101100")||in.equals("1110100")||in.equals("1100100")||in.equals("1111000")||in.equals("1101000")||in.equals("1110000")||in.equals("1100000")) {
//            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
//            if (count == 1||count==2) { datanum = "1";  }
//            if (count ==3||count == 4||count==5) { datanum = "2"; }
//            if (count == 6||count==7) { datanum = "3"; }
//            data = "ไข้หวัด";
//            dataAddnum = "1";
//
//            SetTxt();
//        }
//
//
//
//        if (in.equals("10")) { textView.setText("คุณมีอาการจามบ่อยมากเวลาถูกอากาศเย็น ฝุ่น หรือขนสัตว์ใช่หรือไม่"); textView1.setText("");}
//        if (in.equals("101") || in.equals("100")) { textView.setText("คุณคันคอ คันจมูก เวลาถูกอากาศเย็นหรือฝุ่น หรือขนสัตว์ ใช่หรือไม่"); }
//        if (in.equals("1011") || in.equals("1010") || in.equals("1001") || in.equals("1000")) {
//            //textView.setText("หวัดภูมิแพ้");
//            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
//            if (count == 1) { datanum = "1";  }
//            if (count == 2) { datanum = "2"; }
//            if (count == 3) {  datanum= "3"; }
//            dataAddnum = "2";
//            data = "หวัดภูมิแพ้";
//            SetTxt();
//        }
//
//    }
//
//
////              3&4
//    private void sick2(TextView textView,TextView textView1, ImageView qImageView ) {
//        char someChar = '1';
//        int count = 0;
//        Log.d("26JanV1", "in at Anlysis sig" + six);
//
//        if (in.equals("1")) { textView.setText("มีอาการวิงเวียนศรีษะ รู้สึกโคลงเคลง หน้ามืดตาลายคล้ายจะเป็นลมใช่หรือไม่"); }
//        if (in.equals("11")) { textView.setText("เห็นบ้านหมุน หรือสิ่งรอบข้างหมุน ใช่หรือไม่");
//            textView1.setTextSize(20);
//            textView1.setText(" * อาการบ้านหมุน คือ \n" +
//                    "      รู้สึกว่าสิ่งแวดล้อมรอบตัวหรือสิ่งของที่มองเห็นหมุนไป หรือรู้สึกว่าตัวเองหมุนไปทั้งๆ ที่ตนเองอยู่กับที่");}
//        if (in.equals("111")||in.equals("110")) { textView.setText("มีอาการบ้านหมุนเพียง 20-30 วินาที (ไม่เกิน 1 นาที) ใช่หรือไม่"); textView1.setText("");}
//        if (in.equals("1111")||in.equals("1101")||in.equals("1110")||in.equals("1100")) {
//            textView.setText("มีอาการบ้านหมุนทันทีเฉพาะเวลาเปลี่ยนท่าบางท่า เช่น นอนตะแคงข้าง ลุกจากเตียง ก้มศรีษะ ใช่หรือไม่"); }
//        if (in.equals("11111")||in.equals("11011")||in.equals("11101")||in.equals("11001")||in.equals("11110")||in.equals("11010")||in.equals("11100")||in.equals("11000")) {
//            //textView.setText("บ้านหมุนจากการเปลี่ยนท่า");
//            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
//            if (count == 1) {  datanum= "1";  }
//            if (count == 2||count==3) { datanum = "2"; }
//            if (count == 4||count==5) { datanum = "3"; }
//            data = "บ้านหมุนจากการเปลี่ยนท่า";
//            dataAddnum = "3";
//            SetTxt();
//        }
//
//        if (in.equals("10")) { textView.setText("คุณมีอาการปวดหรือเจ็บบริเวณรอบ ๆ ตา หรือภายในนัยน์ตาใช่หรือไม่"); }
//        if (in.equals("101")||in.equals("100")) { textView.setText("คุณมีอาการบ้านหมุนนำมาก่อน แล้วจึงมีอาการปวดหัวตุบ ๆ ที่ขมับตามมาใช่หรือไม่");
//            textView1.setTextSize(20);
//            textView1.setText(" * อาการบ้านหมุน คือ \n" +
//                    "      รู้สึกว่าสิ่งแวดล้อมรอบตัวหรือสิ่งของที่มองเห็นหมุนไป หรือรู้สึกว่าตัวเองหมุนไปทั้งๆ ที่ตนเองอยู่กับที่");}
//        if (in.equals("1011")||in.equals("1001")||in.equals("1010")||in.equals("1000")) {
//
//            textView.setText("มีอาการปวดหนัก ปวดมึน หรือปวดตุบๆ ที่บริเวณใดบริเวณหนึ่งของศรีษะใช่หรือไม่");
//            textView1.setText("");}
//        if (in.equals("10111")||in.equals("10011")||in.equals("10101")||in.equals("10001")||in.equals("10110")||in.equals("10010")||in.equals("10100")||in.equals("10000")) {
//            textView.setText("ในการปวดหัวแต่ละครั้งปวดนาน 4-72 ชม. ใช่หรือไม่"); }
//        if (in.equals("101111")||in.equals("100111")||in.equals("101011")||in.equals("100011")||in.equals("101101")||in.equals("100101")||in.equals("101001")||in.equals("100001")
//                ||in.equals("101110")||in.equals("100110")||in.equals("101010")||in.equals("100010")||in.equals("101100")||in.equals("100100")||in.equals("101000")||in.equals("100000")) {
//            textView.setText("ก่อนหน้านี้คุณได้รับสิ่งกระตุ้นทำให้มีอาการปวดหัว เช่น ภาวะเครียด, การอดนอน, การนอนและตื่นที่ไม่เป็นเวลา, ช่วงที่เป็นประจำเดือน, กลิ่นหรือควัน, การเปลี่ยนแปลงของอากาศ หรือความร้อน, แสงแดด ใช่หรือไม่"); }
//
//        if (in.equals("1011111")||in.equals("1001111")||in.equals("1010111")||in.equals("1000111")||in.equals("1011011")||in.equals("1001011")||in.equals("1010011")||in.equals("1000011")
//                ||in.equals("1011101")||in.equals("1001101")||in.equals("1010101")||in.equals("1000101")||in.equals("1011001")||in.equals("1001001")||in.equals("1010001")||in.equals("1000001")
//                ||in.equals("1011110")||in.equals("1001110")||in.equals("1010110")||in.equals("1000110")||in.equals("1011010")||in.equals("1001010")||in.equals("1010010")||in.equals("1000010")
//                ||in.equals("1011100")||in.equals("1001100")||in.equals("1010100")||in.equals("1000100")||in.equals("1011000")||in.equals("1001000")||in.equals("1010000")||in.equals("1000000")) {
//            //textView.setText("ไมเกรน");
//            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
//            if (count == 1||count==2) {datanum  = "1";  }
//            if (count == 4||count==5||count ==3) {  datanum= "2"; }
//            if (count == 6||count==7) { datanum = "3"; }
//            data = "ไมเกรน";
//            dataAddnum = "4";
//            SetTxt();
//        }
//    }
////              5
//    private void sick3(TextView textView ,TextView textView1, ImageView qImageView) {
//        char someChar = '1';
//        int count = 0;
//        if (in.equals("1")) { textView.setText("คุณมีอาการตามองเห็นไม่ชัด สายตามืดมัว เห็นภาพผิดเพี้ยน เห็นภาพซ้อน เห็นเงาหยากไย่/แมลงลอยไปมา หรือแสงวาบคล้ายฟ้าแลบ หรือลายสายตาแคบ (มองไม่เห็นด้านข้าง) ใช่หรือไม่");
//            qImageView.setBackgroundResource(R.drawable.g5_1);}
//        if (in.equals("11")||in.equals("10")) { textView.setText("คุณมีอาการมองไม่เห็นในที่แสงน้อย หรือตาฟ้าฟางตอนกลางคืน ใช่หรือไม่");
//            qImageView.setBackgroundResource(0);}
//        if (in.equals("111")||in.equals("101")||in.equals("110")||in.equals("100")) { textView.setText("คุณมีอาการผิวหนังแห้ง และหยาบกร้าน ใช่หรือไม่"); }
//        if (in.equals("1111")||in.equals("1011")||in.equals("1101")||in.equals("1001")||in.equals("1110")||in.equals("1010")||in.equals("1100")||in.equals("1000")) {
//
//            textView.setText("คุณมีอาการเยื่อบุตาแห้ง หรืออาการตาแห้ง ใช่หรือไม่");
//            textView1.setTextSize(20);
//            textView1.setText(" * อาการตาแห้ง\n" +
//                    "      เกิดจากระบบต่อมน้ำตาทำงานผิดปกติ ทำให้มีปริมาณน้ำตาไม่เพียงพอหรือมีการระเหยของน้ำตาที่มากเกินไป ส่งผลให้เกิดอาการไม่สบายตา เช่น เคืองตา แสบตา ตาแห้ง เป็นต้น");
//
//        }
//        if (in.equals("11111")||in.equals("10111")||in.equals("11011")||in.equals("10011")||in.equals("11101")||in.equals("10101")||in.equals("11001")||in.equals("10001")
//                ||in.equals("11110")||in.equals("10110")||in.equals("11010")||in.equals("10010")||in.equals("11100")||in.equals("10100")||in.equals("11000")||in.equals("10000")){
//            textView1.setText("");
////
//            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
//            if (count == 1||count==2) {datanum  = "1"; }
//            if (count == 3||count==4) { datanum = "2"; }
//            if (count == 5) { datanum = "3"; }
//            data = "โรคขาดวิตามินเอ หรือโรคเกล็ดกระดี่ขึ้นตา";
//            dataAddnum = "5";
//            SetTxt();
//
//        }
//
//    }
////              6
//    private void sick4(TextView textView,TextView textView1, ImageView qImageView ) {
//
//        char someChar = '1';
//        int count = 0;
//        if (in.equals("1")) {
//            textView.setText("คุณมีอาการเจ็บปวดท้องน้อย (ใกล้กระดูกหัวหน่าว) ใช่หรือไม่");
//            qImageView.setBackgroundResource(R.drawable.g6_1);
//        }
//        if (in.equals("11") || in.equals("10")) {
//            textView.setText("ภายในหนึ่งวันคุณปัสสาวะบ่อย มากกว่า 10 ครั้งต่อวัน แต่ครั้งละออกแบบกะปริบกะปรอย และคล้ายถ่ายปัสสาวะไม่สุด ใช่หรือไม่");
//            qImageView.setBackgroundResource(0);
//        }
//
//        if (in.equals("111") || in.equals("101") || in.equals("110") || in.equals("100")) {
//            textView.setText("ปัสสาวะของคุณมีสีเข้ม ขุ่น หรือมีกลิ่นเหม็นผิดปกติ ใช่หรือไม่");
//        }
//        if (in.equals("1111") || in.equals("1011") || in.equals("1101") || in.equals("1001") || in.equals("1110") || in.equals("1010") || in.equals("1100") || in.equals("1000")){
//
//            for (int i = 0; i < in.length(); i++) {
//                if (in.charAt(i) == someChar) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                datanum = "1";
//            }
//            if (count == 2||count == 3) {
//                datanum = "2";
//            }
//            if (count == 4) {
//                datanum = "3";
//            }
//            data = "โรคกระเพาะปัสสาวะอักเสบ";
//            dataAddnum = "6";
//            SetTxt();
//
//    }
//
//
//    }
////              7
//    private void sick5(TextView textView,TextView textView1, ImageView qImageView ){
//        char someChar = '1';
//        int count = 0;
//        if (in.equals("1")) { textView.setText("คุณปวดแบบเป็น ๆ หาย ๆ มาไม่น้อยกว่าหนึ่งเดือน ใช่หรือไม่");
//            qImageView.setBackgroundResource(0);}
//        if (in.equals("11")||in.equals("10")) { textView.setText("คุณปวดท้อง ขณะที่เกี่ยวข้องกับมื้ออาหาร เช่น ปวดขณะหิวหรืออิ่มแต่เป็นการปวดแบบทนได้ ใช่หรือไม่"); }
//        if (in.equals("111")||in.equals("101")||in.equals("110")||in.equals("100")) { textView.setText("คุณมีอาการท้องเฟ้อ อิ่มง่าย จุกหน้าอกแน่นท้อง เรอบ่อย อาหารไม่ย่อย และรู้สึกคลื่นไส้หลังการรับประทานอาหารไม่มีความอยากอาหาร ใช่หรือไม่"); }
//
//        if (in.equals("1111")||in.equals("1011")||in.equals("1101")||in.equals("1001")||in.equals("1110")||in.equals("1010")||in.equals("1100")||in.equals("1000")) {
//            textView.setText("คุณมีอาการหน้าท้องแข็ง และกดที่หน้าท้องแล้วรู้สึกเจ็บ ใช่หรือไม่");
//        }
//
//        if (in.equals("11111")||in.equals("10111")||in.equals("11011")||in.equals("10011")||in.equals("11101")||in.equals("10101")||in.equals("11001")||in.equals("10001")
//             ||in.equals("11110")||in.equals("10110")||in.equals("11010")||in.equals("10010")||in.equals("11100")||in.equals("10100")||in.equals("11000")||in.equals("10000")) {
//
//            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
//            if (count == 1||count == 2) { datanum = "1";  }
//            if (count == 3) { datanum = "2"; }
//            if (count == 4||count==5) { datanum = "3"; }
//            data = "โรคกระเพาะอักเสบ";
//            dataAddnum = "7";
//            SetTxt();
//        }
//    }
//
//
////              8
//
//    private void sick6(TextView textView,TextView textView1, ImageView qImageView ){
//        char someChar = '1';
//        int count = 0;
//        if (in.equals("1")) { textView.setText("เมื่อคุณแปรงฟัน มักจะมีอาการเลือดออกตามไรฟัน ใช่หรือไม่"); qImageView.setBackgroundResource(R.drawable.g8_2); }
//        if (in.equals("11")||in.equals("10")) { textView.setText("ช่วงนี้คุณรู้สึกมีอาการเจ็บป่วยได้ง่าย ใช่หรือไม่");qImageView.setBackgroundResource(0); }
//        if (in.equals("111")||in.equals("101")||in.equals("110")||in.equals("100")) {
////        textView.setText("โรคขาดวิตามินซีหรือโรคลักปิดลักเปิด");
//            for (int i = 0; i < in.length(); i++) { if (in.charAt(i) == someChar) { count++; } }
//            if (count == 1) {datanum  = "1"; }
//            if (count == 2) { datanum = "2"; }
//            if (count == 3) { datanum = "3"; }
//            data = "โรคขาดวิตามินซีหรือโรคลักปิดลักเปิด";
//            dataAddnum = "8";
//            SetTxt();
//        }
//    }
////              9
//    private void sick7(TextView textView,TextView textView1, ImageView qImageView ) {
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
//            dataAddnum = "9";
//            data = "โรคท้องเดินหรืออุจจาระร่วง";
//            SetTxt();
//        }
//    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Intent intent = getActivity().getIntent();

        if (intent.hasExtra("idString")) {
            idString = getActivity().getIntent().getExtras().getString("idString");
            Log.d("26JanV1", "in at Anlysis idString" + idString);

        } else {
            Log.d("26JanV1", "in at Anlysis idString" + idString);
            // Do something else
        }

        return inflater.inflate(R.layout.fragment_analysis_choose, container, false);
    }
    @Override
    public void onClick(View v) {
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
