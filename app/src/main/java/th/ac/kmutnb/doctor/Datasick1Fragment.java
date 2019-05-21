package th.ac.kmutnb.doctor;


import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Datasick1Fragment extends Fragment {


    public Datasick1Fragment() {
        // Required empty public constructor
    }

    int IMAGES;
    // String[] txtBmain = {"เนื้อหา","สาเหตุ","อาการ","สิ่งตรวจพบ","ภาวะแทรกซ้อน","การรักษา","ข้อแนะนำ","การป้องกัน"};
    //ImageView qImageView = (ImageView)getActivity().findViewById(R.id.imagesA1);
    String num1="1",num2="1",num3="1",num4="1",num5="1",num6="1",num7="1",num8 ="1",str,num;
    //TextView txtAmain;
    TextView txtBmain1,txtBmain2,txtBmain3,txtBmain4,txtBmain5,txtBmain6,txtBmain7,txtBmain8;
    TextView txtcolked1, txtcolked2, txtcolked3, txtcolked4, txtcolked5, txtcolked6, txtcolked7, txtcolked8;
    ImageView imagesA1,imagesA2,imagesA3,imagesA4,imagesA5,imagesA6,imagesA7, imagesA8 ;
    TextView txtCmain1,txtCmain2,txtCmain3,txtCmain4,txtCmain5,txtCmain6,txtCmain7,txtCmain8;
    ImageView imagesB1,imagesB2,imagesB3,imagesB4,imagesB5,imagesB6,imagesB7, imagesB8;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        creatrToober();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_datasick1, container, false);
        Bundle bundle = getArguments();
        num = bundle.getString("num");

        Log.d("26JanV1", "position sickdata num data1  ==>  " + num);
        //txtAmain = view.findViewById(R.id.txtAmain);
        //<!--ข้อคววามหลักก่อนกระจาย-->
//            <!--txtBmain1-->
//            <!--รูปลูกศรขึ้น-ลง-->
//            <!--imagesA1-->
//            <!--ข้อความในเนื้อหาที่แตกลงมา-->
//            <!--txtCmain1-->
//            <!--รูปเพิ่มเติม-->
//            <!--imagesB1-->

        //ไข้หวัด
        if (num.equals("0")) { Sick_main_1(view);str = "ไข้หวัด"; }


        return view ;

    }


    private void Sick_main_1(View view) {
       // txtAmain.setText("ไข้หวัด");

        txtBmain1 = view.findViewById(R.id.txtBmain1);
        txtBmain1.setText("เนื้อหา");
        txtBmain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_1();
            }
        });
        txtBmain2 = view.findViewById(R.id.txtBmain2);
        txtBmain2.setText("สาเหตุ");
        txtBmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_2();
            }
        });
        txtBmain3 = view.findViewById(R.id.txtBmain3);
        txtBmain3.setText("อาการ");
        txtBmain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_3();
            }
        });
        txtBmain4 = view.findViewById(R.id.txtBmain4);
        txtBmain4.setText("สิ่งตรวจพบ");
        txtBmain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_4();
            }
        });
        txtBmain5 = view.findViewById(R.id.txtBmain5);
        txtBmain5.setText("ภาวะแทรกซ้อน");
        txtBmain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_5();
            }
        });
        txtBmain6 = view.findViewById(R.id.txtBmain6);
        txtBmain6.setText("การรักษา");
        txtBmain6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_6();
            }
        });
        txtBmain7 = view.findViewById(R.id.txtBmain7);
        txtBmain7.setText("ข้อแนะนำ");
        txtBmain7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_7();
            }
        });
        txtBmain8 = view.findViewById(R.id.txtBmain8);
        txtBmain8.setText("การป้องกัน");
        txtBmain8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_8();
            }
        });


        imagesA1 = view.findViewById(R.id.imagesA1);
        imagesA1.setBackgroundResource(R.drawable.dow);
        imagesA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_1();
            }

        });
        imagesA2 = view.findViewById(R.id.imagesA2);
        imagesA2.setBackgroundResource(R.drawable.dow);
        imagesA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_2();
            }

        });
        imagesA3 = view.findViewById(R.id.imagesA3);
        imagesA3.setBackgroundResource(R.drawable.dow);
        imagesA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_3();
            }

        });
        imagesA4 = view.findViewById(R.id.imagesA4);
        imagesA4.setBackgroundResource(R.drawable.dow);
        imagesA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_4();
            }

        });
        imagesA5 = view.findViewById(R.id.imagesA5);
        imagesA5.setBackgroundResource(R.drawable.dow);
        imagesA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_5();
            }

        });
        imagesA6 = view.findViewById(R.id.imagesA6);
        imagesA6.setBackgroundResource(R.drawable.dow);
        imagesA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_6();
            }

        });
        imagesA7 = view.findViewById(R.id.imagesA7);
        imagesA7.setBackgroundResource(R.drawable.dow);
        imagesA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_7();
            }

        });
        imagesA8 = view.findViewById(R.id.imagesA8);
        imagesA8.setBackgroundResource(R.drawable.dow);
        imagesA8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_8();
            }

        });

        txtCmain1 = view.findViewById(R.id.txtCmain1);
        txtCmain2 = view.findViewById(R.id.txtCmain2);
        txtCmain3 = view.findViewById(R.id.txtCmain3);
        txtCmain4 = view.findViewById(R.id.txtCmain4);
        txtCmain5 = view.findViewById(R.id.txtCmain5);
        txtCmain6 = view.findViewById(R.id.txtCmain6);
        txtCmain7 = view.findViewById(R.id.txtCmain7);
        txtCmain8 = view.findViewById(R.id.txtCmain8);


        txtcolked1 = view.findViewById(R.id.txtcolked1);
        txtcolked1.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked2 = view.findViewById(R.id.txtcolked2);
        txtcolked2.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked3 = view.findViewById(R.id.txtcolked3);
        txtcolked3.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked4 = view.findViewById(R.id.txtcolked4);
        txtcolked4.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked5 = view.findViewById(R.id.txtcolked5);
        txtcolked5.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked6 = view.findViewById(R.id.txtcolked6);
        txtcolked6.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked7 = view.findViewById(R.id.txtcolked7);
        txtcolked7.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked8 = view.findViewById(R.id.txtcolked8);
        txtcolked8.setBackgroundColor(getResources().getColor(R.color.colorked));


    }

    private void Sick_sick1_1() {
        num1 = num1+"1";
        Log.d("26JanV1", "position sickdata num data1  ==>  " + num1);
        imagesA1.setBackgroundResource(R.drawable.up);
        txtCmain1.setTextSize(20);
        txtCmain1.setText("      \tไข้หวัดเป็นโรคที่พบได้บ่อยที่สุดทั้งในเด็กและผู้ใหญ่ บางคนอาจเป็นปีละหลายครั้ง โดยเฉพาะเด็กเล็กและเด็กที่เพิ่งเข้าโรงเรียนในปีแรกๆ อาจเฉลี่ยประมาณเดือนละครั้ง ทำให้ต้องสูญเสียแรงงาน เวลาเรียนและสิ้นเปลืองเงินทองไปปีละมากๆ\n" +
                "      \tทั้งนี้เนื่องจากเชื้อไวรัสที่เป็นสาเหตุของไข้หวัดมีอยู่มากว่า 200 ชนิด ซึ่งผลัดเปลี่ยนหมุนเวียนกันทำให้เกิดการอักเสบของทางเดิมหายใจส่วนต้น ( จมูกและคอ ) ครั้งละชนิด\n" +
                "      \tเมื่อมีอายุมากขึ้น ร่างกายจะมีภูมิคุ้มกันต่อเชื้อหวัดชนิดต่าง ๆ มากขึ้น ก็จะเป็นไข้หวัดห่างขึ้นและมีอาการรุนแรงน้อยลงไป\n" +
                "      \tโรคนี้สามารถติดต่อกันได้ง่าย โดยการใกล้ชิดกัน จึงพบกันมากตามโรงเรียน โรงงาน และที่ๆมีคนรวมกลุ่มกันมากๆ\n" +
                "      \tเป็นโรคที่พบได้ตลอดทั้งปี มักจะพบมากในช่วงฤดูฝน ฤดูหนาว หรือในช่วงที่มีอากาศเปลี่ยนแปลง ส่วนในฤดูร้อนจะพบน้อยลง\n");
        if (num1.equals("111")) {
            txtCmain1.setTextSize(15);
            imagesA1.setBackgroundResource(R.drawable.dow);
            txtCmain1.setText("");
            num1 = "1";
        }
    }
    private void Sick_sick1_2() {
        num2 = num2+"1";

        imagesA2.setBackgroundResource(R.drawable.up);
        txtCmain2.setTextSize(20);
        txtCmain2.setText("      \tเกิดจากเชื้อหวัด ซึ่งเป็นไวรัส (virus) มีอยู่มาก กว่า 200 ชนิดจากกลุ่มไวรัส 8 กลุ่มด้วยกัน กลุ่มไวรัส ที่สำคัญ ได้แก่ กลุ่มไวรัสไรโน (rhinovirus) ซึ่งมีมาก กว่า 100 ชนิด นอกนั้นก็มีกลุ่มไวรัสโคโรนา (coronavirus) กลุ่มไวรัสอะดีโน (adenovirus) กลุ่มอาร์เอสวี (respiratory syncytial virus/RSV) กลุ่มไวรัสพาราอินฟลูเอนซา (parainfluenza virus) กลุ่มเชื้อไวรัส ไข้หวัดใหญ่ (influenza virus) กลุ่มไวรัสเอนเทอโร (enterovirus) กลุ่มเชื้อเริ่ม (herpes simplex virus) เป็นต้น \n" +
                "      \tการเกิดโรคขึ้นในแต่ละครั้งจะเกิดจากเชื้อหวัดเพียงชนิดเดียว เมื่อเป็นแล้วร่างกายก็จะมีภูมิคุ้มกันต่อ เชื้อหวัดชนิดนั้น ในการเจ็บป่วยครั้งใหม่ก็จะเกิดจากเชื้อหวัดชนิดใหม่ หมุนเวียนเช่นนี้ไปเรื่อยๆ เชื้อหวัดมีอยู่ในน้ำมูก น้ำลาย และเสมหะของผู้ป่วย ติดต่อโดยการหายใจสูดเอาฝอยละอองเสมหะที่ ผู้ป่วยไอหรือจามรด ภายในระยะไม่เกิน 1 เมตร ซึ่งจัด ว่าเป็นการแพร่กระจายทางละอองเสมหะที่มีขนาดใหญ่ (droplet transmission) นอกจากนี้ เชื้อหวัดยังอาจติดต่อโดยการสัมผัส กล่าวคือ เชื้อหวัดอาจติดที่มือของผู้ป่วย สิ่งของเครื่อง ใช้ (เช่น ผ้าเช็ดหน้า ผ้าเช็ดตัว แก้วน้ำ จาน ชาม ของเล่น หนังสือ โทรศัพท์ เป็นต้น) หรือสิ่งแวดล้อม เมื่อคน ปกติสัมผัสถูกมือของผู้ป่วยหรือสิ่งของเครื่องใช้ หรือ สิ่งแวดล้อมที่แปดเปื้อนเชื้อหวัด เชื้อหวัดก็จะติดมือ ของคนๆ นั้น และเมื่อใช้นิ้วมือขยี้ตาหรือแคะจมูก เชื้อ ก็จะเข้าสู่ร่างกายของคนๆนั้น จนกลายเป็นไข้หวัดได้\n" +
                "      \tระยะฟักตัว (ระยะตั้งแต่ผู้ป่วยรับเชื้อเข้าไปจน กระทั่งมีอาการเกิดขึ้น) 1-3 วัน\n");
        if (num2.equals("111")) {
            txtCmain2.setTextSize(15);
            imagesA2.setBackgroundResource(R.drawable.dow);
            txtCmain2.setText("");
            num2 = "1";
        }
    }
    private void Sick_sick1_3() {
        num3 = num3+"1";
        imagesA3.setBackgroundResource(R.drawable.up);
        txtCmain3.setTextSize(20);
        txtCmain3.setText("      \tมีไข้เป็นพักๆ ครั่นเนื้อครั่นตัว อ่อนเพลีย ปวด หนักศีรษะเล็กน้อย เป็นหวัด คัดจมูก น้ำมูกใส จาม คอแห้ง หรือเจ็บคอเล็กน้อย ไอแห้งๆ หรือไอมีเสมหะ เล็กน้อย ลักษณะสีขาว บางครั้งอาจทำให้รู้สึกเจ็บบริเวณ ลิ้นปี่เวลาไอ ในเด็กเล็กอาจมีอาการอาเจียนเวลาไอ และมักจับไข้ขึ้นมาทันทีทันใด บางครั้งอาจมี ไข้สูงและชัก ในผู้ใหญ่อาจไม่มีไข้ มีเพียงคัดจมูก น้ำมูกใส ในทารกอาจมีอาการอาเจียน หรือท้องเดิน  ร่วมด้วย ในรายที่มีการติดเชื้อแบคทีเรียแทรกซ้อน ผู้ป่วย จะมีไข้เกิน 4 วัน หรือมีน้ำมูกข้นเหลืองหรือเขียวเกิน 24 ชั่วโมง หรือไอมีเสมหะเป็นสีเหลืองหรือเขียว");
        if (num3.equals("111")) {
            txtCmain3.setTextSize(15);
            imagesA3.setBackgroundResource(R.drawable.dow);
            txtCmain3.setText("");
            num3 = "1";
        }
    }
    private void Sick_sick1_4() {
        num4 = num4+"1";
        imagesA4.setBackgroundResource(R.drawable.up);
        txtCmain4.setTextSize(20);
        txtCmain4.setText("      \tไข้ น้ำมูก เยื่อจมูกบวมและแดง คอแดงเล็กน้อย ในเด็กอาจพบทอนซิลโต แต่ไม่แดงมาก และไม่มีหนอง");
        if (num4.equals("111")) {
            txtCmain4.setTextSize(15);
            imagesA4.setBackgroundResource(R.drawable.dow);
            txtCmain4.setText("");
            num4 = "1";
        }
    }
    private void Sick_sick1_5() {
        num5 = num5+"1";
        imagesA5.setBackgroundResource(R.drawable.up);
        txtCmain5.setTextSize(20);
        txtCmain5.setText("      \tที่พบบ่อยเกิดจากการอักเสบแทรกซ้อนของเชื้อ แบคทีเรีย ทำให้มีน้ำมูกหรือเสมหะเป็นสีเหลืองหรือเขียว ถ้าลุกลามไปยังบริเวณใกล้เคียง อาจทำให้เป็นทอนซิล อักเสบ  ไซนัสอักเสบ  หูชั้นกลางอักเสบ  หลอดลมอักเสบ  ปอดอักเสบ ในเด็กเล็ก อาจทำให้มีอาการชักจากไข้สูง บางรายอาจมีเสียงแหบ เนื่องจากกล่องเสียงอักเสบ บางรายอาจมีอาการบ้านหมุน เนื่องจากอวัยวะการ ทรงตัวภายในหูชั้นในอักเสบ ดังที่เรียกว่า หวัด ลงหู โรคแทรกที่รุนแรงมักเกิดในผู้ป่วยที่ไม่ได้พักผ่อน ตรากตรำงานหนัก ร่างกายอ่อนแอ (เช่น ขาดอาหาร เป็นต้น) ในทารกหรือผู้สูงอายุ");
        if (num5.equals("111")) {
            txtCmain5.setTextSize(15);
            imagesA5.setBackgroundResource(R.drawable.dow);
            txtCmain5.setText("");
            num5 = "1";
        }
    }
    private void Sick_sick1_6() {
        num6 = num6+"1";

        imagesA6.setBackgroundResource(R.drawable.up);
        txtCmain6.setTextSize(20);
        txtCmain6.setText("เนื่องจากไข้หวัดเกิดจากเชื้อไวรัส จึงไม่มียาที่ใช้ รักษาโดยเฉพาะ เพียงแต่ให้การรักษาไปตามอาการเท่า นั้น ได้แก่ \n" +
                "      \t1. แนะนำการปฏิบัติตัวของผู้ป่วย ดังนี้\n" +
                "       \t• พักผ่อนมากๆ ห้ามตรากตรำงานหนักหรือ ออกกำลังกายมากเกินไป\n" +
                "       \t• สวมใส่เสื้อผ้าให้ร่างกายอบอุ่น อย่าถูกฝน หรือถูกอากาศเย็นจัด และอย่าอาบน้ำเย็น\n" +
                "       \t• ดื่มน้ำมากๆ เพื่อช่วยลดไข้ และทดแทนน้ำ ที่เสียไปเนื่องจากไข้สูง\n" +
                "       \t• ควรกินอาหารอ่อน น้ำข้าว น้ำหวาน น้ำส้ม น้ำผลไม้ หรือเครื่องดื่มร้อน ๆ\n" +
                "       \t• ใช้ผ้าชุบน้ำ (ควรใช้น้ำอุ่น หรือน้ำก๊อก ธรรมดา อย่าใช้น้ำเย็นจัดหรือน้ำแข็ง) เช็ดตัวเวลามีไข้สูง\n" +
                "      \t2. ให้ยารักษาตามอาการ ดังนี้\n" +
                "       \tก. สำหรับผู้ใหญ่และเด็กโต (อายุมากกว่า 5 ปี)\n" +
                "        \t• ถ้ามีไข้ ให้พาราเซตามอล ผู้ที่มี อายุต่ำกว่า 19 ปี ควรหลีกเลี่ยงการใช้แอสไพริน เพราะอาจเพิ่มความเสี่ยงต่อการเกิดโรคเรย์ซินโดรม\n" +
                "        \t• ถ้ามีอาการน้ำมูกไหลมากจนสร้างความ รำคาญ ให้ยาแก้แพ้ เช่น คลอร์เฟนิรามีนใน 2-3 วันแรก เมื่อทุเลาแล้วควรหยุดยา หรือกรณีที่มี อาการไม่มาก ก็ไม่จำเป็นต้องให้ยานี้\n" +
                "        \t• ถ้ามีอาการไอ จิบน้ำอุ่นมากๆ หรือจิบน้ำผึ้งผสมมะนาว (น้ำผึ้ง 4 ส่วน น้ำมะนาว 1 ส่วน) ถ้า ไอมากลักษณะไอแห้งๆ ไม่มีเสมหะ ให้ยาระงับการไอ \n" +
                "       \tข. สำหรับเด็กเล็กและทารก\n" +
                "        \t• ถ้ามีใช้ให้พาราเซตามอลชนิดน้ำเชื่อม \n" +
                "        \t•  ถ้ามีน้ำมูกมาก ให้ใช้ลูกยางเบอร์ 2 ดูด น้ำมูกออกบ่อยๆ (ถ้าน้ำมูกข้นเหนียว ควรใช้น้ำเกลือ หยอดในจมูกก่อน) หรือใช้กระดาษทิชชูพันเป็นแท่ง สอดเข้าไปเช็ดน้ำมูก (ถ้าน้ำมูกข้นเหนียว ควรชุบน้ำสุก หรือน้ำเกลือพอชุ่มก่อน)\n" +
                "        \t• ถ้ามีอาการไอจิบน้ำอุ่นมากๆ หรือจิบน้ำ ผึ้งผสมมะนาว\" ถ้ามีอาการอาเจียนเวลาไอ ไม่จำเป็นต้อง ให้ยาแก้อาเจียน ควรแนะนำให้ป้อนนมและอาหารที่ละ น้อยแต่บ่อยครั้งขึ้น โดยเฉพาะอย่างยิ่งตอนจะเข้านอน\n" +
                "      \t3. ยาปฏิชีวนะไม่จำเป็นต้องให้ เพราะไม่ได้ผลต่อ การฆ่าเชื้อหวัดซึ่งเป็นไวรัส (อาการที่สังเกตได้คือ มี น้ำมูกใสๆ หรือสีขาว) ยกเว้นในรายที่สงสัยว่าจะมีอาการ ติดเชื้อแบคทีเรียซ้ำเติม เช่น มีไข้ทุกวันติดต่อกันเป็น 4 วัน มีน้ำมูกหรือเสมหะข้นเหลืองหรือเขียวเกิน 24 ชั่วโมง หรือปวดหู หูอื้อ\n" +
                "ยาปฏิชีวนะ ให้เลือกใช้เพนิซิลลินวี อะม็อกซีซิลลิน ในรายที่แพ้เพนิซิลลินให้ใช้อีริ โทรไมชิ้น หรือร็อกซิโทรไมซิน  แทน ควรให้นาน 7-10 วัน\n" +
                "      \t4. ถ้าไอมีเสมหะเหนียว ให้งดยาแก้แพ้ และ ยาระงับการไอ และให้ดื่มน้ำอุ่นมากๆ วันละ 1015 แก้ว\n" +
                "      \t5. ถ้ามีอาการหอบ หรือนับการหายใจได้เร็วกว่า ปกติ (เด็กอายุ 0-2 เดือนหายใจมากกว่า 60 ครั้ง/นาที อายุ 2 เดือนถึง 1 ปีหายใจมากกว่า 50 ครั้ง/นาที อายุ 1-5 ปีหายใจมากกว่า 40 ครั้ง/นาที) หรือมีไข้นานเกิน 7 “วัน ควรส่งโรงพยาบาลโดยเร็ว อาจเป็นปอดอักเสบ หรือภาวะรุนแรงอื่น ๆ ได้ อาจต้องเอกซเรย์ ตรวจเลือด ตรวจเสมหะ เป็นต้น\n" +
                "      \t6. ในเด็กถ้ามีอาการชักร่วมด้วย ดูเรื่อง “ชักจาก ไข้”\n" +
                "      \t7. ถ้าสงสัยเป็นไข้หวัดนก เช่น มีประวัติสัมผัสสัตว์ปีกที่ป่วยหรือตายภายใน 7 วัน หรืออยู่ใน พื้นที่ที่มีการระบาดของไข้หวัดนกภายใน 14 วัน ควร ส่งผู้ป่วยไปโรงพยาบาลโดยเร็ว\n");
        if (num6.equals("111")) {
            txtCmain6.setTextSize(15);
            imagesA6.setBackgroundResource(R.drawable.dow);
            txtCmain6.setText("");
            num6 = "1";
        }
    }
    private void Sick_sick1_7() {
        num7 = num7+"1";
        imagesA7.setBackgroundResource(R.drawable.up);
        txtCmain7.setTextSize(20);
        txtCmain7.setText("      \t1. ในปัจจุบันยังไม่มียาที่ใช้รักษาและป้องกันไข้ หวัดอย่างได้ผล การรักษาอยู่ที่การพักผ่อนและการปฏิบัติ ตัวของผู้ป่วยเป็นสำคัญ ยาที่ใช้ก็เป็นเพียงยาที่รักษา ตามอาการเท่านั้น โดยทั่วไปอาการตัวร้อนมักจะเป็นอยู่ ประมาณ 3-4 วัน ถ้าเป็นเกิน 4 วัน มักแสดงว่ามีการ ติดเชื้อแบคทีเรียแทรกซ้อน หรืออาจเกิดจากโรคอื่นๆ\n" +
                "        \tผู้ป่วยบางรายถึงแม้จะหายตัวร้อนแล้ว แต่ก็อาจ มีน้ำมูกและไอต่อไปได้ บางรายอาจไอโครกๆ อยู่เรื่อย อาจนานถึง 7-8 สัปดาห์ เนื่องจากเยื่อบุทางเดินหายใจถูก ทำลายชั่วคราว ทำให้ไวต่อสิ่งระคายเคือง (เช่น ฝุ่น ควัน) มักจะเป็นลักษณะไอแห้งๆ หรือมีเสมหะเล็กน้อยเป็น สีขาว ถ้าพบว่าผู้ป่วยไม่มีอาการผิดปกติอื่นๆร่วมด้วยก็ ไม่ต้องให้ยาอะไรทั้งสิ้น ให้ดื่มน้ำอุ่นมากๆ (ควรงดดื่ม น้ำเย็น ถ้าดื่มแล้วทำให้ไอมากขึ้น)\n" +
                "      \t2. ไม่จำเป็นต้องให้ยาปฏิชีวนะ (ย4) แก่ผู้ป่วยที่ เป็นไข้หวัดทุกราย ยกเว้นในรายที่สงสัยจะมีภาวะแทรก ซ้อนเท่านั้น\n" +
                "      \t3. ผู้ที่เป็นไข้หวัด (ซึ่งมีอาการตัวร้อนร่วมด้วย) เรื้อรังหรือเป็นๆ หายๆ ประจำอาจมีสาเหตุอื่นร่วมด้วย เช่น โรคหัวใจรั่วมาแต่กำเนิด ทาลัสซีเมีย (105) โรค โลหิตจางอะพลาสติก (103) โรคขาดอาหาร (130) เป็น ต้น จึงควรตรวจดูว่ามีสาเหตุเหล่านี้ร่วมด้วยหรือไม่ \"หากสงสัยควรแนะนำไปโรงพยาบาล\n");
        if (num7.equals("111")) {
            txtCmain7.setTextSize(15);
            imagesA7.setBackgroundResource(R.drawable.dow);
            txtCmain7.setText("");
            num7 = "1";
        }
    }
    private void Sick_sick1_8() {
        num8 = num8+"1";
        imagesA8.setBackgroundResource(R.drawable.up);
        txtCmain8.setTextSize(20);
        txtCmain8.setText("      \t1. หมั่นดูแลสุขภาพตนเองให้แข็งแรงโดยการ ออกกำลังกาย กินอาหารที่มีประโยชน์ พักผ่อนให้เพียงพอ อย่าตรากตรำงานหนักเกินไป ระวังรักษาร่างกายให้ อบอุ่นอยู่เสมอ โดยเฉพาะเวลาที่มีอากาศเปลี่ยนแปลง ไม่ควรอาบน้ำหรือสระผมด้วยน้ำที่เย็นเกินไป โดยเฉพาะ ในเวลาที่มีอากาศเย็น\n" +
                "      \t2. ในช่วงที่มีการระบาดของโรคนี้ หรือมีคนใกล้ชิด (เช่น คนในบ้าน โรงเรียน หรือที่ทำงาน) ป่วยเป็นโรคนี้ควรปฏิบัติดังนี้ 1 . ในช่วงที่มีการระบาดควรหลีกเลี่ยงการเข้าไปในที่ที่มีผู้คนแออัด เช่น สถานบันเทิง ห้างสรรพสินค้า งานมหรสพ เป็นต้น ถ้าเลี่ยงไม่ได้ ควรสวมหน้ากากอนามัย หมั่นล้างมือด้วยน้ำกับสบู่เพื่อชะเชื้อโรคที่อาจติดมา จากการสัมผัสถูกเสมหะผู้ป่วย และอย่าใช้นิ้วมือขยี้ตา หรือแคะไขจมูก\n" +
                "       \t• อย่าเข้าใกล้หรือนอนรวมกับผู้ป่วย ถ้าจำเป็นต้องดูแลผู้ป่วยอย่างใกล้ชิด ควรสวมหน้ากากอนามัย และหมั่นล้างมือด้วยน้ำกับสบู่\n" +
                "       \t• อย่าใช้สิ่งของเครื่องใช้ (เช่น ผ้าเช็ดหน้า ผ้าเช็ดตัว แก้วน้ำ เครื่องใช้ โทรศัพท์ ของเล่น เป็นต้น) ร่วมกับผู้ป่วย และควรหลีกเลี่ยงการสัมผัสมือผู้ป่วย\n" +
                "       \t• ผู้ป่วยควรแยกตัวออกห่างจากผู้อื่น อย่านอนปะปนหรือคลุกคลีใกล้ชิดกับผู้อื่น เวลาไอหรือจามควรใช้ผ้าปิดปากและจมูก เวลาเข้าไปในที่ที่มีคนอยู่กันมากๆ ควรสวมหน้ากากอนามัย\n");
        if (num8.equals("111")) {
            txtCmain8.setTextSize(15);
            imagesA8.setBackgroundResource(R.drawable.dow);
            txtCmain8.setText("");
            num8 = "1";
        }
    }

    private void creatrToober() {
        //    Create Toobar
        Toolbar toolbar = getView().findViewById(R.id.toolberdatasick);
        ((DatasickMainActivity)getActivity()).setSupportActionBar(toolbar);
        ((DatasickMainActivity) getActivity()).getSupportActionBar().setTitle(str);
        ((DatasickMainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);//ทำปุ่มย้อนกลับมุมบน
        ((DatasickMainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true); //ทำปุ่มย้อนกลับมุมบน
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = num2 + "1";
                Log.d("26JanV1", "position sickdata num data1  ==>  " + num2);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fldata, new DataSickMainFragment()).commit();
               // getActivity().getSupportFragmentManager().popBackStack();
            }//เม็กตอดกดให้กลับ
        });
        setHasOptionsMenu(true);
    }
}
