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
import android.widget.LinearLayout;
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
    String num1="1",num2="1",num3="1",num4="1",num5="1",num6="1",num7="1",num8 ="1",str,num;
    TextView txtBmain1,txtBmain2,txtBmain3,txtBmain4,txtBmain5,txtBmain6,txtBmain7,txtBmain8;
    TextView txtcolked1, txtcolked2, txtcolked3, txtcolked4, txtcolked5, txtcolked6, txtcolked7, txtcolked8;
    ImageView imagesA1,imagesA2,imagesA3,imagesA4,imagesA5,imagesA6,imagesA7, imagesA8 ;
    TextView txtCmain1,txtCmain2,txtCmain3,txtCmain4,txtCmain5,txtCmain6,txtCmain7,txtCmain8;
    ImageView imagesB1,imagesB2,imagesB3,imagesB4,imagesB5,imagesB6,imagesB7, imagesB8;
    LinearLayout linearLayout1,linearLayout2,linearLayout3,linearLayout4,linearLayout5,linearLayout6,linearLayout7,linearLayout8;

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
        pakad(view);


        //<!--ข้อคววามหลักก่อนกระจาย-->
//            <!--txtBmain1-->
//            <!--รูปลูกศรขึ้น-ลง-->
//            <!--imagesA1-->
//            <!--ข้อความในเนื้อหาที่แตกลงมา-->
//            <!--txtCmain1-->
//            <!--รูปเพิ่มเติม-->
//            <!--imagesB1-->

        //ไข้หวัด
        if (num.equals("0")) { Sick_main_1();str = "โรคไข้หวัด"; }
        if (num.equals("1")) { Sick_main_2();str = "โรคหวัดภูมิแพ้"; }
        if (num.equals("2")) { Sick_main_3();str = "โรคบ้านหมุนจากการเปลี่ยนท่า"; }
        if (num.equals("3")) { Sick_main_4();str = "โรคไมเกรน"; }
        if (num.equals("4")) { Sick_main_5();str = "โรคขาดวิตามินเอ หรือโรคเกล็ดกระดี่ขึ้นตา";}
        if (num.equals("5")) { Sick_main_6();str = "โรคกระเพาะปัสสาวะอักเสบ"; }
        if (num.equals("6")) { Sick_main_7();str = "โรคกระเพาะอักเสบ"; }
        if (num.equals("7")) { Sick_main_8();str = "โรคขาดวิตามินซีหรือโรคลักปิดลักเปิด"; }
        if (num.equals("8")) { Sick_main_9();str = "โรคท้องเดินหรืออุจจาระร่วง"; }


        return view ;

    }




    private void Sick_main_1() {
       // txtAmain.setText("ไข้หวัด");


        txtBmain1.setText("เนื้อหา");
        txtBmain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_1();
            }
        });




        txtBmain2.setText("สาเหตุ");
        txtBmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_2();
            }
        });


        txtBmain3.setText("อาการ");
        txtBmain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_3();
            }
        });

        txtBmain4.setText("สิ่งตรวจพบ");
        txtBmain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_4();
            }
        });

        txtBmain5.setText("ภาวะแทรกซ้อน");
        txtBmain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_5();
            }
        });

        txtBmain6.setText("การรักษา");
        txtBmain6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_6();
            }
        });

        txtBmain7.setText("ข้อแนะนำ");
        txtBmain7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_7();
            }
        });

        txtBmain8.setText("การป้องกัน");
        txtBmain8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_8();
            }
        });



        imagesA1.setBackgroundResource(R.drawable.dow);
        imagesA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_1();
            }

        });

        imagesA2.setBackgroundResource(R.drawable.dow);
        imagesA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_2();
            }

        });

        imagesA3.setBackgroundResource(R.drawable.dow);
        imagesA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_3();
            }

        });

        imagesA4.setBackgroundResource(R.drawable.dow);
        imagesA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_4();
            }

        });

        imagesA5.setBackgroundResource(R.drawable.dow);
        imagesA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_5();
            }

        });

        imagesA6.setBackgroundResource(R.drawable.dow);
        imagesA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_6();
            }

        });

        imagesA7.setBackgroundResource(R.drawable.dow);
        imagesA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_7();
            }

        });

        imagesA8.setBackgroundResource(R.drawable.dow);
        imagesA8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_8();
            }

        });


        txtcolked1.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked2.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked3.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked4.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked5.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked6.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked7.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked8.setBackgroundColor(getResources().getColor(R.color.colorked));

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_1();
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_2();
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_3();
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_4();
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_5();
            }
        });
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_6();
            }
        });
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_7();
            }
        });
        linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick1_8();
            }
        });

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
                "      \tเป็นโรคที่พบได้ตลอดทั้งปี มักจะพบมากในช่วงฤดูฝน ฤดูหนาว หรือในช่วงที่มีอากาศเปลี่ยนแปลง ส่วนในฤดูร้อนจะพบน้อยลง \n");
        if (num1.equals("111")) {
            txtCmain1.setTextSize(10);
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
                "      \tการเกิดโรคขึ้นในแต่ละครั้งจะเกิดจากเชื้อหวัดเพียงชนิดเดียว เมื่อเป็นแล้วร่างกายก็จะมีภูมิคุ้มกันต่อเชื้อหวัดชนิดนั้น ในการเจ็บป่วยครั้งใหม่ก็จะเกิดจากเชื้อหวัดชนิดใหม่ หมุนเวียนเช่นนี้ไปเรื่อยๆ เชื้อหวัดมีอยู่ในน้ำมูก น้ำลาย และเสมหะของผู้ป่วยติดต่อโดยการหายใจสูดเอาฝอยละอองเสมหะที่ ผู้ป่วยไอหรือจามรดภายในระยะไม่เกิน 1 เมตร ซึ่งจัด ว่าเป็นการแพร่กระจายทางละอองเสมหะที่มีขนาดใหญ่ (droplet transmission) นอกจากนี้ เชื้อหวัดยังอาจติดต่อโดยการสัมผัส กล่าวคือ เชื้อหวัดอาจติดที่มือของผู้ป่วย สิ่งของเครื่องใช้ (เช่น ผ้าเช็ดหน้า ผ้าเช็ดตัว แก้วน้ำ จาน ชาม ของเล่น หนังสือ โทรศัพท์ เป็นต้น) หรือสิ่งแวดล้อม เมื่อคนปกติสัมผัสถูกมือของผู้ป่วยหรือสิ่งของเครื่องใช้ หรือ สิ่งแวดล้อมที่แปดเปื้อนเชื้อหวัด เชื้อหวัดก็จะติดมือ ของคนๆ นั้น และเมื่อใช้นิ้วมือขยี้ตาหรือแคะจมูก เชื้อ ก็จะเข้าสู่ร่างกายของคนๆนั้น จนกลายเป็นไข้หวัดได้\n" +
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
        txtCmain3.setText("      \tมีไข้เป็นพักๆ ครั่นเนื้อครั่นตัว อ่อนเพลีย ปวด หนักศีรษะเล็กน้อย เป็นหวัด คัดจมูก น้ำมูกใส จาม คอแห้ง หรือเจ็บคอเล็กน้อย ไอแห้งๆ หรือไอมีเสมหะ เล็กน้อย ลักษณะสีขาว บางครั้งอาจทำให้รู้สึกเจ็บบริเวณ ลิ้นปี่เวลาไอ ในเด็กเล็กอาจมีอาการอาเจียนเวลาไอ และมักจับไข้ขึ้นมาทันทีทันใด บางครั้งอาจมีไข้สูงและชัก ในผู้ใหญ่อาจไม่มีไข้ มีเพียงคัดจมูก น้ำมูกใส ในทารกอาจมีอาการอาเจียน หรือท้องเดินร่วมด้วย ในรายที่มีการติดเชื้อแบคทีเรียแทรกซ้อน ผู้ป่วยจะมีไข้เกิน 4 วัน หรือมีน้ำมูกข้นเหลืองหรือเขียวเกิน 24 ชั่วโมง หรือไอมีเสมหะเป็นสีเหลืองหรือเขียว");
        imagesB3.setBackgroundResource(R.drawable.a1_1);
        if (num3.equals("111")) {
            txtCmain3.setText("");
            imagesB3.setBackgroundResource(0);
            txtCmain3.setTextSize(15);
            imagesA3.setBackgroundResource(R.drawable.dow);
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
        txtCmain5.setText("      \tที่พบบ่อยเกิดจากการอักเสบแทรกซ้อนของเชื้อแบคทีเรีย ทำให้มีน้ำมูกหรือเสมหะเป็นสีเหลืองหรือเขียว ถ้าลุกลามไปยังบริเวณใกล้เคียง อาจทำให้เป็นทอนซิลอักเสบ  ไซนัสอักเสบ  หูชั้นกลางอักเสบ  หลอดลมอักเสบ  ปอดอักเสบ ในเด็กเล็กอาจทำให้มีอาการชักจากไข้สูง บางรายอาจมีเสียงแหบ เนื่องจากกล่องเสียงอักเสบ บางรายอาจมีอาการบ้านหมุน เนื่องจากอวัยวะการทรงตัวภายในหูชั้นในอักเสบ ดังที่เรียกว่า หวัด ลงหู โรคแทรกที่รุนแรงมักเกิดในผู้ป่วยที่ไม่ได้พักผ่อน ตรากตรำงานหนัก ร่างกายอ่อนแอ (เช่น ขาดอาหาร เป็นต้น) ในทารกหรือผู้สูงอายุ");
        imagesB5.setBackgroundResource(R.drawable.a1_2);
        if (num5.equals("111")) {
            txtCmain5.setTextSize(15);
            imagesA5.setBackgroundResource(R.drawable.dow);
            txtCmain5.setText("");
            imagesB5.setBackgroundResource(0);
            num5 = "1";
        }
    }
    private void Sick_sick1_6() {
        num6 = num6+"1";

        imagesA6.setBackgroundResource(R.drawable.up);
        txtCmain6.setTextSize(20);
        txtCmain6.setText(
                "     \tเนื่องจากไข้หวัดเกิดจากเชื้อไวรัส จึงไม่มียาที่ใช้ รักษาโดยเฉพาะ เพียงแต่ให้การรักษาไปตามอาการเท่า นั้น ได้แก่ \n" +
                "     \t1. แนะนำการปฏิบัติตัวของผู้ป่วย ดังนี้\n" +
                "     \t • พักผ่อนมากๆ ห้ามตรากตรำงานหนักหรือ ออกกำลังกายมากเกินไป\n" +
                "     \t • สวมใส่เสื้อผ้าให้ร่างกายอบอุ่น อย่าถูกฝน หรือถูกอากาศเย็นจัด และอย่าอาบน้ำเย็น\n" +
                "     \t • ดื่มน้ำมากๆ เพื่อช่วยลดไข้ และทดแทนน้ำที่เสียไปเนื่องจากไข้สูง\n" +
                "     \t • ควรกินอาหารอ่อน น้ำข้าว น้ำหวาน น้ำส้ม น้ำผลไม้ หรือเครื่องดื่มร้อน ๆ\n" +
                "     \t • ใช้ผ้าชุบน้ำ (ควรใช้น้ำอุ่น หรือน้ำก๊อก ธรรมดา อย่าใช้น้ำเย็นจัดหรือน้ำแข็ง) เช็ดตัวเวลามีไข้สูง\n" +
                "     \t2. ให้ยารักษาตามอาการ ดังนี้\n" +
                "     \t ก. สำหรับผู้ใหญ่และเด็กโต (อายุมากกว่า 5 ปี)\n" +
                "     \t  • ถ้ามีไข้ ให้พาราเซตามอล ผู้ที่มี อายุต่ำกว่า 19 ปี ควรหลีกเลี่ยงการใช้แอสไพริน เพราะอาจเพิ่มความเสี่ยงต่อการเกิดโรคเรย์ซินโดรม\n" +
                "     \t  • ถ้ามีอาการน้ำมูกไหลมากจนสร้างความ รำคาญ ให้ยาแก้แพ้ เช่น คลอร์เฟนิรามีนใน 2-3 วันแรก เมื่อทุเลาแล้วควรหยุดยา หรือกรณีที่มี อาการไม่มาก ก็ไม่จำเป็นต้องให้ยานี้\n" +
                "     \t  • ถ้ามีอาการไอ จิบน้ำอุ่นมากๆ หรือจิบน้ำผึ้งผสมมะนาว (น้ำผึ้ง 4 ส่วน น้ำมะนาว 1 ส่วน) ถ้า ไอมากลักษณะไอแห้งๆ ไม่มีเสมหะ ให้ยาระงับการไอ \n" +
                "     \t ข. สำหรับเด็กเล็กและทารก\n" +
                "     \t  • ถ้ามีใช้ให้พาราเซตามอลชนิดน้ำเชื่อม \n" +
                "     \t  • ถ้ามีน้ำมูกมาก ให้ใช้ลูกยางเบอร์ 2 ดูด น้ำมูกออกบ่อยๆ (ถ้าน้ำมูกข้นเหนียว ควรใช้น้ำเกลือ หยอดในจมูกก่อน) หรือใช้กระดาษทิชชูพันเป็นแท่ง สอดเข้าไปเช็ดน้ำมูก (ถ้าน้ำมูกข้นเหนียว ควรชุบน้ำสุก หรือน้ำเกลือพอชุ่มก่อน)\n" +
                "     \t  • ถ้ามีอาการไอจิบน้ำอุ่นมากๆ หรือจิบน้ำผึ้งผสมมะนาว ถ้ามีอาการอาเจียนเวลาไอ ไม่จำเป็นต้อง ให้ยาแก้อาเจียน ควรแนะนำให้ป้อนนมและอาหารที่ละ น้อยแต่บ่อยครั้งขึ้น โดยเฉพาะอย่างยิ่งตอนจะเข้านอน\n" +
                "     \t3. ยาปฏิชีวนะไม่จำเป็นต้องให้ เพราะไม่ได้ผลต่อ การฆ่าเชื้อหวัดซึ่งเป็นไวรัส (อาการที่สังเกตได้คือ มี น้ำมูกใสๆ หรือสีขาว) ยกเว้นในรายที่สงสัยว่าจะมีอาการ ติดเชื้อแบคทีเรียซ้ำเติม เช่น มีไข้ทุกวันติดต่อกันเป็น 4 วัน มีน้ำมูกหรือเสมหะข้นเหลืองหรือเขียวเกิน 24 ชั่วโมง หรือปวดหู หูอื้อ\n" +
                "ยาปฏิชีวนะ ให้เลือกใช้เพนิซิลลินวี อะม็อกซีซิลลิน ในรายที่แพ้เพนิซิลลินให้ใช้อีริ โทรไมชิ้น หรือร็อกซิโทรไมซิน  แทน ควรให้นาน 7-10 วัน\n" +
                "     \t4. ถ้าไอมีเสมหะเหนียว ให้งดยาแก้แพ้ และยาระงับการไอ และให้ดื่มน้ำอุ่นมากๆ วันละ 10-15 แก้ว\n" +
                "     \t5. ถ้ามีอาการหอบ หรือนับการหายใจได้เร็วกว่า ปกติ (เด็กอายุ 0-2 เดือนหายใจมากกว่า 60 ครั้ง/นาที อายุ 2 เดือนถึง 1 ปีหายใจมากกว่า 50 ครั้ง/นาที อายุ 1-5 ปีหายใจมากกว่า 40 ครั้ง/นาที) หรือมีไข้นานเกิน 7วัน ควรส่งโรงพยาบาลโดยเร็ว อาจเป็นปอดอักเสบ หรือภาวะรุนแรงอื่น ๆ ได้ อาจต้องเอกซเรย์ ตรวจเลือด ตรวจเสมหะ เป็นต้น\n" +
                "     \t6. ถ้าสงสัยเป็นไข้หวัดนก เช่น มีประวัติสัมผัสสัตว์ปีกที่ป่วยหรือตายภายใน 7 วัน หรืออยู่ใน พื้นที่ที่มีการระบาดของไข้หวัดนกภายใน 14 วัน ควร ส่งผู้ป่วยไปโรงพยาบาลโดยเร็ว\n");
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
        txtCmain7.setText("      \t1. ในปัจจุบันยังไม่มียาที่ใช้รักษาและป้องกันไข้ หวัดอย่างได้ผล การรักษาอยู่ที่การพักผ่อนและการปฏิบัติ ตัวของผู้ป่วยเป็นสำคัญ ยาที่ใช้ก็เป็นเพียงยาที่รักษาตามอาการเท่านั้น โดยทั่วไปอาการตัวร้อนมักจะเป็นอยู่ ประมาณ 3-4 วัน ถ้าเป็นเกิน 4 วัน มักแสดงว่ามีการ ติดเชื้อแบคทีเรียแทรกซ้อน หรืออาจเกิดจากโรคอื่นๆ\n" +
                "      \tผู้ป่วยบางรายถึงแม้จะหายตัวร้อนแล้ว แต่ก็อาจ มีน้ำมูกและไอต่อไปได้ บางรายอาจไอโครกๆ อยู่เรื่อย อาจนานถึง 7-8 สัปดาห์ เนื่องจากเยื่อบุทางเดินหายใจถูก ทำลายชั่วคราว ทำให้ไวต่อสิ่งระคายเคือง (เช่น ฝุ่น ควัน) มักจะเป็นลักษณะไอแห้งๆ หรือมีเสมหะเล็กน้อยเป็น สีขาว ถ้าพบว่าผู้ป่วยไม่มีอาการผิดปกติอื่นๆร่วมด้วยก็ ไม่ต้องให้ยาอะไรทั้งสิ้น ให้ดื่มน้ำอุ่นมากๆ (ควรงดดื่ม น้ำเย็น ถ้าดื่มแล้วทำให้ไอมากขึ้น)\n" +
                "      \t2. ไม่จำเป็นต้องให้ยาปฏิชีวนะแก่ผู้ป่วยที่เป็นไข้หวัดทุกราย ยกเว้นในรายที่สงสัยจะมีภาวะแทรกซ้อนเท่านั้น\n" +
                "      \t3. ผู้ที่เป็นไข้หวัด (ซึ่งมีอาการตัวร้อนร่วมด้วย) เรื้อรังหรือเป็นๆ หายๆ ประจำอาจมีสาเหตุอื่นร่วมด้วย เช่น โรคหัวใจรั่วมาแต่กำเนิด ทาลัสซีเมีย โรคโลหิตจางอะพลาสติก โรคขาดอาหาร เป็นต้น จึงควรตรวจดูว่ามีสาเหตุเหล่านี้ร่วมด้วยหรือไม่ “หากสงสัยควรแนะนำไปโรงพยาบาล ”\n");
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
        txtCmain8.setText("      \t1. หมั่นดูแลสุขภาพตนเองให้แข็งแรงโดยการออกกำลังกาย กินอาหารที่มีประโยชน์ พักผ่อนให้เพียงพอ อย่าตรากตรำงานหนักเกินไป ระวังรักษาร่างกายให้อบอุ่นอยู่เสมอ โดยเฉพาะเวลาที่มีอากาศเปลี่ยนแปลง ไม่ควรอาบน้ำหรือสระผมด้วยน้ำที่เย็นเกินไป โดยเฉพาะในเวลาที่มีอากาศเย็น\n" +
                "      \t2. ในช่วงที่มีการระบาดของโรคนี้ หรือมีคนใกล้ชิด (เช่น คนในบ้าน โรงเรียน หรือที่ทำงาน) ป่วยเป็นโรคนี้ควรปฏิบัติดังนี้ \n" +
                "        \t• ในช่วงที่มีการระบาดควรหลีกเลี่ยงการเข้าไปในที่ที่มีผู้คนแออัด เช่น สถานบันเทิง ห้างสรรพสินค้า งานมหรสพ เป็นต้น ถ้าเลี่ยงไม่ได้ ควรสวมหน้ากากอนามัย หมั่นล้างมือด้วยน้ำกับสบู่เพื่อชะเชื้อโรคที่อาจติดมา จากการสัมผัสถูกเสมหะผู้ป่วย และอย่าใช้นิ้วมือขยี้ตา หรือแคะไขจมูก\n" +
                "        \t• อย่าเข้าใกล้หรือนอนรวมกับผู้ป่วย ถ้าจำเป็นต้องดูแลผู้ป่วยอย่างใกล้ชิด ควรสวมหน้ากากอนามัย และหมั่นล้างมือด้วยน้ำกับสบู่\n" +
                "        \t• อย่าใช้สิ่งของเครื่องใช้ (เช่น ผ้าเช็ดหน้า ผ้าเช็ดตัว แก้วน้ำ เครื่องใช้ โทรศัพท์ ของเล่น เป็นต้น) ร่วมกับผู้ป่วย และควรหลีกเลี่ยงการสัมผัสมือผู้ป่วย\n" +
                "        \t• ผู้ป่วยควรแยกตัวออกห่างจากผู้อื่น อย่านอนปะปนหรือคลุกคลีใกล้ชิดกับผู้อื่น เวลาไอหรือจามควรใช้ผ้าปิดปากและจมูก เวลาเข้าไปในที่ที่มีคนอยู่กันมากๆ ควรสวมหน้ากากอนามัย\n");
        if (num8.equals("111")) {
            txtCmain8.setTextSize(15);
            imagesA8.setBackgroundResource(R.drawable.dow);
            txtCmain8.setText("");
            num8 = "1";
        }
    }

    private void Sick_main_2() {
        // txtAmain.setText("ไข้หวัด");


        txtBmain1.setText("เนื้อหา");
        txtBmain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_1();
            }
        });

        txtBmain2.setText("สาเหตุ");
        txtBmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_2();
            }
        });

        txtBmain3.setText("อาการ");
        txtBmain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_3();
            }
        });

        txtBmain4.setText("สิ่งตรวจพบ");
        txtBmain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_4();
            }
        });

        txtBmain5.setText("ภาวะแทรกซ้อน");
        txtBmain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_5();
            }
        });

        txtBmain6.setText("การรักษา");
        txtBmain6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_6();
            }
        });

        txtBmain7.setText("ข้อแนะนำ");
        txtBmain7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_7();
            }
        });


        imagesA1.setBackgroundResource(R.drawable.dow);
        imagesA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_1();
            }

        });

        imagesA2.setBackgroundResource(R.drawable.dow);
        imagesA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_2();
            }

        });

        imagesA3.setBackgroundResource(R.drawable.dow);
        imagesA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_3();
            }

        });

        imagesA4.setBackgroundResource(R.drawable.dow);
        imagesA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_4();
            }

        });

        imagesA5.setBackgroundResource(R.drawable.dow);
        imagesA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_5();
            }

        });

        imagesA6.setBackgroundResource(R.drawable.dow);
        imagesA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_6();
            }

        });

        imagesA7.setBackgroundResource(R.drawable.dow);
        imagesA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_7();
            }

        });



        txtcolked1.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked2.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked3.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked4.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked5.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked6.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked7.setBackgroundColor(getResources().getColor(R.color.colorked));

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_1();
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_2();
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_3();
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_4();
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_5();
            }
        });
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_6();
            }
        });
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick2_7();
            }
        });

    }
    private void Sick_sick2_1() {
        num1 = num1+"1";
        Log.d("26JanV1", "position sickdata num data1  ==>  " + num1);
        imagesA1.setBackgroundResource(R.drawable.up);
        txtCmain1.setTextSize(20);
        txtCmain1.setText("      \tหวัดภูมิแพ้ (เยื่อจมูกอักเสบเหตุภูมิแพ้จมูก อักเสบจากภูมิแพ้ หวัดจากการแพ้ หวัดแพ้อากาศ โรคแพ้ อากาศ) หมายถึงเยื่อจมูกอักเสบที่เกิดจากปฏิกิริยาภูมิแพ้ของร่างกาย จัดเป็นโรคภูมิแพ้ชนิดหนึ่ง ซึ่งพบได้ในคนทุกวัย มักเริ่มแสดงอาการในช่วงวัยรุ่น หรือวัยเรียนพบได้ประมาณร้อยละ 10-25 ของคนทั่วไป จากการ ศึกษาในบ้านเราพบโรคนี้ในเด็กวัยเรียนประมาณ ร้อยละ 20-40 ซึ่งผู้ป่วยมักมีประวัติโรคภูมิแพ้ในครอบครัว (เช่น หด ลมพิษ ผื่นคัน หวัดภูมิแพ้) และมักมีโรคภูมิแพ้ อื่นๆ \n" +
                "      \tโรคนี้มักมีอาการเป็นๆ หายๆ เรื้อรังเป็นแรมเดือนแรมปี น่ารำคาญ อาจมีอาการกำเริบเป็นบางฤดูกาล หรืออาจเป็นประจำตลอดทั้งปี ทั้งนี้ขึ้นกับสารก่อภูมิแพ้ที่เป็นสาเหตุ ถ้าเกิดจากละอองเกสร หญ้า หรือวัชพืช เรียกว่าไข้ละอองฟาง (hay fever)\n");
        if (num1.equals("111")) {
            txtCmain1.setTextSize(15);
            imagesA1.setBackgroundResource(R.drawable.dow);
            txtCmain1.setText("");
            num1 = "1";
        }
    }
    private void Sick_sick2_2() {
        num2 = num2+"1";

        imagesA2.setBackgroundResource(R.drawable.up);
        txtCmain2.setTextSize(20);
        txtCmain2.setText("      \tเกิดจากความผิดปกติที่ถ่ายทอดทางกรรมพันธุ์ ทำให้ร่างกายเกิดปฏิกิริยาภูมิแพ้ต่อสารก่อภูมิแพ้ต่างๆ เป็นผลให้มีการหลั่งสารเคมีหลายชนิดออกมาทำให้เกิดอาการคัน จาม คัดจมูก น้ำมูกไหล\n" +
                "      \tสารก่อภูมิแพ้ที่พบบ่อย ได้แก่ ละอองเกสร หญ้า วัชพืช สปอร์ของเชื้อราที่อยู่นอกบ้าน ทำให้เกิดอาการ กำเริบในบางฤดูกาล ส่วนผู้ที่มีอาการตลอดปีมักเกิดจากสารก่อภูมิแพ้ภายในบ้าน เช่น ไรฝุ่นบ้าน แมลงสาบ สัตว์เลี้ยง ฝุ่นละออง เป็นต้น นอกจากนี้ยังอาจเกิดจากการแพ้อาหาร (เช่น อาหารทะเล) ซึ่งมักจะพบร่วมกับโรคภูมิแพ้อื่นๆ เช่น หิด ลมพิษ ผื่นคัน ซึ่งผู้ที่เป็นโรคหวัดภูมิแพ้ มักมีการตอบสนองไวเกินต่อสิ่งกระตุ้น (สิ่งระคายเคือง) เช่น กลิ่นฉุนๆ บุหรี่ ควัน อาหารเม็ด แอลกอฮอล์ อากาศเปลี่ยน ความชื้น ทั้งนี้ โดยไม่เกี่ยวกับปฏิกิริยาภูมิแพ้แบบสัมผัสสารก่อภูมิแพ้\n");
        if (num2.equals("111")) {
            txtCmain2.setTextSize(15);
            imagesA2.setBackgroundResource(R.drawable.dow);
            txtCmain2.setText("");
            num2 = "1";
        }
    }
    private void Sick_sick2_3() {
        num3 = num3+"1";
        imagesA3.setBackgroundResource(R.drawable.up);
        txtCmain3.setTextSize(20);
        txtCmain3.setText("      \tมีอาการเป็นหวัด คัดจมูก จามบ่อย น้ำมูกมีลักษณะใสๆ มักมีอาการคันในจมูก คันคอ คันตา น้ำตาไหล เจ็บคอ แสบคอ หรือไอแห้งๆ (แบบระคายคอ) ร่วมด้วย ในบางรายอาจมีอาการปวดซื้อตรงบริเวณหน้าผาก หรือหัวคิ้ว หรือปวดศีรษะ หูอื้อ หรือมีเสียงดังในหู (เนื่องจากท่อยูสเตเชียนตึบ) การรับรู้กลิ่นน้อยลง หรือ หายใจมีกลิ่นเหม็น โดยอาการมักเกิดเวลาถูกอากาศเย็น ควัน ฝุ่นละออง สารก่อภูมิแพ้ หรือสิ่งกระตุ้นอื่นๆ บางรายอาจมีอาการตอนช่วงเช้าๆ พอสายๆ ก็ ทุเลาไปได้เองในรายที่เป็นมากอาจมีอาการอ่อนเพลีย นอนไม่ หลับ บางรายอาจมีอาการของโรคหืดร่วมด้วย หายใจมีเสียงดังวื้ด หรือรู้สึกแน่นอึดอัดในหน้าอก");
        if (num3.equals("111")) {
            txtCmain3.setTextSize(15);
            imagesA3.setBackgroundResource(R.drawable.dow);
            txtCmain3.setText("");
            num3 = "1";
        }
    }
    private void Sick_sick2_4() {
        num4 = num4+"1";
        imagesA4.setBackgroundResource(R.drawable.up);
        txtCmain4.setTextSize(20);
        txtCmain4.setText("      \tเยื่อจมูกบวมและซีด หรือเป็นสีม่วงอ่อนๆ ต่าง จากไข้หวัด หรือไซนัสอักเสบ ซึ่งเยื่อจมูกจะมีลักษณะบวมและออกสีแดง มักพบน้ำมูกลักษณะใสๆ (ถ้าน้ำมูกมีสีเหลืองหรือเขียว แสดงว่ามีการติดเชื้อแบคที่เรียซ้ำเติม หรือเป็นไซนัสอักเสบ) บางรายอาจพบเยื่อตาขาวออกแดงเล็กน้อย ในเด็กที่มีอาการคันจมูก จะยกมือขึ้นขยี้จมูกบ่อยๆ อาจทำให้เกิดรอยย่นที่สันจมูก (เรียกว่า allergic nasal line) อาจพบผิวหนังบริเวณขอบตาล่างบวมและมีสีคล้ำ(เรียกว่า allergic shiners)");
        if (num4.equals("111")) {
            txtCmain4.setTextSize(15);
            imagesA4.setBackgroundResource(R.drawable.dow);
            txtCmain4.setText("");
            num4 = "1";
        }
    }
    private void Sick_sick2_5() {
        num5 = num5+"1";
        imagesA5.setBackgroundResource(R.drawable.up);
        txtCmain5.setTextSize(20);
        txtCmain5.setText("      \tโดยทั่วไปมักไม่มีภาวะแทรกซ้อนร้ายแรง ในรายที่มีอาการรุนแรง อาจมีให้อ่อนเพลีย นอน ไม่หลับ อาจมีผลกระทบต่อคุณภาพชีวิต การเรียน การทำงาน บางรายอาจเป็นโรคหืดร่วมด้วย ในรายที่เป็นเรื้อรัง อาจกลาย เป็นไซนัสอักเสบ หูชั้นกลางอักเสบ หรือติ่งเนื้อเมือกจมูกเด็กบางรายอาจมีอาการนอนกรนและเกิดภาวะหยุดหายใจขณะหลับได้");
        if (num5.equals("111")) {
            txtCmain5.setTextSize(15);
            imagesA5.setBackgroundResource(R.drawable.dow);
            txtCmain5.setText("");
            num5 = "1";
        }
    }
    private void Sick_sick2_6() {
        num6 = num6+"1";

        imagesA6.setBackgroundResource(R.drawable.up);
        txtCmain6.setTextSize(20);
        txtCmain6.setText("      \t1. แนะนำให้ผู้ป่วยสังเกตว่าเกิดจากสารก่อภูมิแพ้ หรือสิ่งกระตุ้นอะไร แล้วพยายามหลีกเลี่ยง ก็อาจช่วย ให้อาการทุเลาได้ เช่น มีอาการขณะกวาดบ้านหรือถูกฝุ่น ก็แสดงว่าเกิดจากฝุ่น ถ้าเป็นขณะอยู่ในห้องนอนก็อาจ เกิดจากไรฝุ่นบ้าน ถ้าเป็นขณะสัมผัสสัตว์เลี้ยงก็อาจเกิดจากสัตว์เลี้ยง เป็นต้น\n" +
                "      \t2. ถ้ามีอาการเพียงเล็กน้อย เป็นช่วงสั้นๆ เช่น ตอนเช้าหลังตื่นนอน ตอนสายๆ หายได้เอง ก็ไม่จำเป็น ต้องให้ยารักษา แต่ถ้ามีอาการน้ำมูกไหลมากหรือไอจน น่ารำคาญ ให้กินยาแก้แพ้ เช่น คลอร์เฟนิรามีน หรือไดเฟนไฮดรามีน ครั้งละ 1/2 - 1 เม็ด วันละ 2-4 ครั้ง หรือยาแก้แพ้ที่ไม่ง่วง เช่น ลอราทาดีน ครั้งละ 1/2 - 1 เม็ด วันละครั้ง เป็นต้น\n" +
                "      \tถ้ามีอาการคัดจมูกมากหรือหูอื้อร่วมด้วย ให้ กินยาแก้คัดจมูก เช่น สูโดเอฟดรีน ควบด้วยครั้งละ 1/2 - 1 เม็ด วันละ 2-3 ครั้ง บางรายอาจใช้ยาป้ายจมูกเอฟีดขึ้นวันละ 1-2 ครั้ง แต่ไม่ควรใช้ติดต่อกันเกิน 3 วัน อาจทำให้เยื่อจมูกกลับบวมมากขึ้นได้ ถ้าไอมากให้กินยาระงับการไอ ยาเหล่านี้ให้กินเมื่อมีอาการจนน่ารำคาญหรือมีผล กระทบต่อการดำเนินชีวิต เมื่ออาการดีขึ้นก็ให้หยุดยาแต่ถ้ากำเริบใหม่ก็ให้กินใหม่ บางคนที่เป็นอยู่ประจำทุกวันก็อาจต้องคอยกินยาไปเรื่อยๆ\n" +
                "      \t3. ให้การรักษาดังกล่าวแล้วไม่ได้ผล หรือเป็น เรื้อรัง (มีอาการมากกว่า 4 วันต่อสัปดาห์ และมีอาการ ติดต่อกันนานกว่า 4 สัปดาห์) หรือรุนแรง (มีอาการนอน ไม่หลับ นอนกรน มีภาวะหยุดหายใจขณะหลับ มีผล กระทบต่อการเรียน การงาน หรือคุณภาพชีวิต) ควรให้ยาสตีรอยด์ชนิดพ่นจมูกวันละ 1-2 ครั้ง เช่น บูโดซีในด์ (budosenide) เบโคลเมทาโซน (beclomethasone) ไตรแอมซิโนโลน (triamcinolone) ฟลูทิคาโซน (fluticasone) เป็นต้น ยากลุ่มนี้สามารถบรรเทาอาการจาม คัน คัดจมูก และน้ำมูกไหลได้ดี แต่จะได้ผลหลังจากใช้ ยาได้ 1 สัปดาห์ไปแล้ว ยานี้อาจใช้เดี่ยวๆ หรือใช้ร่วมกับยาแก้แพ้ แก้คัดจมูก ทั้งนี้ขึ้นกับความรุนแรงของโรค\n" +
                "      \t4. ถ้าไม่ได้ผลควรส่งโรงพยาบาลหรือปรึกษาแพทย์ ผู้เชี่ยวชาญ ในรายที่ไม่แน่ใจ แพทย์อาจทำการวินิจฉัย โดยการใช้กล้องส่องตรวจภายในโพรงจมูก (nasal endoscopy) การตรวจอีโอซิโนฟิลในเลือด (พบมากกว่าร้อย ละ 10 ของจำนวนเม็ดเลือดขาวทั้งหมด) หรือในเสมหะ (พบมากกว่าร้อยละ 30) การทดสอบผิวหนัง (skin test) ดูว่าแพ้สารอะไร เอกซเรย์ไซนัส (ดูว่ามีการอักเสบหรือ ไม่) เป็นต้น ถ้าพบว่าเป็นหวัดภูมิแพ้ แพทย์อาจทำการ ปรับเปลี่ยนยา เช่น ให้ไอพราโทรเพียมโบรไมด์ชนิด พ่นจมูก (ช่วยลดน้ำมูกได้ดี) โซเดียมโครโมโกลเคต (sodium cromoglycate) ชนิดพ่นจมูก ยาต้านลิวโคทรีน ชนิดกิน (ได้ผลต่อการลดอาการคัดจมูกและใช้ควบคุม โรคหืดที่พบร่วม) สตีรอยด์ชนิดกิน (ควรใช้ด้วยความ ระมัดระวัง และไม่ใช้ติดต่อกันนานเกิน 2 สัปดาห์)\n" +
                "      \tในบางรายอาจต้องทำการทดสอบผิวหนัง (skin test) ว่าแพ้สารอะไร แล้วให้การรักษาด้วยการขจัดภูมิไว (desensitization/hyposensitization) โดยการฉีดสารที่แพ้เข้าร่างกายที่ละน้อยๆ เป็นประจำทุก 1-2 สัปดาห์ นาน 3-5 ปี ซึ่งค่ารักษาค่อนข้างแพง วิธีนี้จะได้ผลดีในรายที่แพ้ไรฝุ่นบ้าน เชื้อรา ละอองเกสร หญ้า วัชพืช ขุยหนังหรือรังแคแมว (cat dander) สำหรับเด็ก วิธีนี้อาจช่วยป้องกันไม่ให้เกิดโรคหืดตามมาได้\n" +
                "      \tผลการรักษา ส่วนใหญ่สามารถควบคุมอาการได้ ดีด้วยยาแก้แพ้และสตีรอยด์ชนิดพ่นจมูก แต่เมื่อหยุดยาก็อาจกำเริบได้อีก ส่วนน้อยที่ต้องให้การรักษาด้วยวิธีอิมมูนบําบัด (การขจัดภูมิไว) หรือใช้ยากลุ่มอื่น ในรายที่ดื้อต่อการรักษาอาจเกิดจากการใช้ยาไม่ ถูกต้อง หรืออาจมีโรคอื่นๆร่วมด้วย เช่น ไซนัสอักเสบ หูชั้นกลางอักเสบ หด ติ่งเนื้อเมือกจมูก ควรปรับยาที่ใช้ให้เหมาะสม หรือรักษาโรคที่พบร่วม\n");
        if (num6.equals("111")) {
            txtCmain6.setTextSize(15);
            imagesA6.setBackgroundResource(R.drawable.dow);
            txtCmain6.setText("");
            num6 = "1";
        }
    }
    private void Sick_sick2_7() {
        num7 = num7+"1";
        imagesA7.setBackgroundResource(R.drawable.up);
        txtCmain7.setTextSize(20);
        txtCmain7.setText("      \t1. โรคนี้มักเป็นเรื้อรัง ไม่ค่อยหายขาด ถ้าอาการไม่มากพอทนได้ ก็ไม่จำเป็นต้องกินยาอะไรทั้งสิ้น ถ้า จำเป็นก็แนะนำให้ผู้ป่วยกินยาแก้แพ้ แก้คัดจมูก แก้ไอ และควรห้ามมิให้ผู้ป่วยซื้อยาชุดหรือยาลูกกลอนกินเอง เพราะมักเข้ายาสตีรอยด์ ซึ่งถ้ากินไปนานๆ ก็อาจทำให้เกิดผลข้างเคียงแทรกซ้อนได้\n" +
                "      \t2. การใช้ยาปฏิชีวนะ ไม่มีความจำเป็นในการรักษาโรคนี้ ยกเว้นในรายที่น้ำมูกเหลืองหรือเขียว หรือ สงสัยเป็นไซนัสอักเสบ หรือหูชั้นกลางอักเสบ\n" +
                "      \t3. ถ้าจำเป็นต้องใช้ยาพ่นจมูก ควรให้แพทย์เป็น ผู้พิจารณาสั่งใช้ เพราะยาบางชนิดที่เข้ายาแก้แพ้หรือ แก้คัดจมูก เมื่อหยอดบ่อยเกินไป ก็อาจทำให้เยื่อจมูกอักเสบมากยิ่งขึ้น\n" +
                "      \t4. ควรแนะนำให้ผู้ป่วยรักษาสุขภาพทั่วไปให้แข็งแรง โดยการบำรุงอาหารสุขภาพ (กินผักผลไม้ให้มากๆ) ออกกำลังกายเป็นประจำ (เช่น วิ่งเหยาะ เดินเร็ว ขี่จักรยาน ว่ายน้ำ) นอนหลับพักผ่อนให้เพียงพอ และผ่อนคลาย ความเครียด (เช่น ฝึกโยคะ รำมวยจีน สวดมนต์ ฝึก สมาธิ ฟังเพลง) ก็อาจมีส่วนช่วยให้โรคทุเลาได้\n" +
                "      \t5. ในกรณีเป็นหวัด คัดจมูก โดยไม่ทราบสาเหตุ ชัดเจน นานเกิน 2 สัปดาห์ ควรให้แพทย์ตรวจหาสาเหตุ\n");
        if (num7.equals("111")) {
            txtCmain7.setTextSize(15);
            imagesA7.setBackgroundResource(R.drawable.dow);
            txtCmain7.setText("");
            num7 = "1";
        }
    }

    private void Sick_main_3() {
        // txtAmain.setText("ไข้หวัด");


        txtBmain1.setText("เนื้อหา");
        txtBmain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_1();
            }
        });



        txtBmain2.setText("สาเหตุ");
        txtBmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_2();
            }
        });

        txtBmain3.setText("อาการ");
        txtBmain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_3();
            }
        });

        txtBmain4.setText("สิ่งตรวจพบ");
        txtBmain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_4();
            }
        });

        txtBmain5.setText("ภาวะแทรกซ้อน");
        txtBmain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_5();
            }
        });

        txtBmain6.setText("การรักษา");
        txtBmain6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_6();
            }
        });

        txtBmain7.setText("ข้อแนะนำ");
        txtBmain7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_7();
            }
        });


        imagesA1.setBackgroundResource(R.drawable.dow);
        imagesA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_1();
            }

        });

        imagesA2.setBackgroundResource(R.drawable.dow);
        imagesA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_2();
            }

        });

        imagesA3.setBackgroundResource(R.drawable.dow);
        imagesA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_3();
            }

        });

        imagesA4.setBackgroundResource(R.drawable.dow);
        imagesA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_4();
            }

        });

        imagesA5.setBackgroundResource(R.drawable.dow);
        imagesA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_5();
            }

        });

        imagesA6.setBackgroundResource(R.drawable.dow);
        imagesA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_6();
            }

        });

        imagesA7.setBackgroundResource(R.drawable.dow);
        imagesA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_7();
            }

        });



        txtcolked1.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked2.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked3.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked4.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked5.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked6.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked7.setBackgroundColor(getResources().getColor(R.color.colorked));

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_1();
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_2();
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_3();
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_4();
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_5();
            }
        });
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_6();
            }
        });
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick3_7();
            }
        });

    }
    private void Sick_sick3_1() {
        num1 = num1+"1";
        Log.d("26JanV1", "position sickdata num data1  ==>  " + num1);
        imagesA1.setBackgroundResource(R.drawable.up);
        txtCmain1.setTextSize(20);
        txtCmain1.setText("      \tภาวะนี้หมายถึง อาการวิงเวียนแบบบ้านหมุนหรือ สิ่งรอบตัวหมุนที่เกิดขึ้นเป็นช่วงสั้นๆร่วมกับอาการตา กระตุก (nystagmus) และเกิดขึ้นฉับพลันขณะมีการเปลี่ยนทำหรือเคลื่อนไหวศีรษะ ภาวะนี้จัดเป็นสาเหตุของอาการบ้านหมุน (vertigo) ที่พบได้บ่อยที่สุด จะพบได้มากขึ้นตามอายุที่มากขึ้น จึงพบได้บ่อยในผู้สูงอายุและพบได้น้อยในคนอายุต่ำกว่า 35 ปี");
        if (num1.equals("111")) {
            txtCmain1.setTextSize(15);
            imagesA1.setBackgroundResource(R.drawable.dow);
            txtCmain1.setText("");
            num1 = "1";
        }
    }
    private void Sick_sick3_2() {
        num2 = num2+"1";

        imagesA2.setBackgroundResource(R.drawable.up);
        txtCmain2.setTextSize(20);
        txtCmain2.setText("      \tเกี่ยวข้องกับความผิดปกติของหูชั้นในส่วนลาบรินท์ (labyrinth) ที่ทำหน้าที่ควบคุมเกี่ยวกับการทรงตัว ประกอบด้วยหลอดกึ่งวง 3 อัน (ด้านหน้า ด้านหลัง และด้านข้าง) ซึ่งภายในมีของเหลวและเซลล์ประสาท บรรจุอยู่หลอดกึ่งวงทั้ง 3 อันนี้มีช่องเชื่อมต่อกับกระเปาะที่เรียกว่า “ยูทริเคิล (ultricle)” และ “แซกคูล (sac- cule)” ในคนปกติจะมีผลึกหินปูนเกาะอยู่ในยูทริเคิล\n" +
                "      \tและแซกคูลทำหน้าที่ช่วยในการรับรู้ทิศทางการเคลื่อนไหวของร่างกาย ถ้าหากมีผลึกหินปูนจำนวนมากหลุดออกมาจากส่วนนี้ เข้าไปลอยอยู่ในของเหลวภายในหลอดกึ่งวงก็จะเกิดการรบกวนเซลล์ประสาทภายใน หลอดกึ่งวง ทำให้เกิดอาการบ้านหมุนอย่างรุนแรง\n" +
                "      \tผลึกหินปูนดังกล่าวสามารถหลุดลอยเข้าไปในหลอดกึ่งวงได้ทุกอัน แต่จะเข้าไปในหลอดกึ่งวงด้านหลัง (posterior semicircular canal) เป็นส่วนใหญ่ ผลึกหินปูนที่ลอยอยู่ในหลอดถึงวง มีชื่อเรียกว่า “Ca- nalith\n" +
                "      \tสาเหตุของการเกิดภาวะนี้ในผู้ป่วยอายุมาก มักเกิดจากความเสื่อมของอวัยวะการทรงตัวภายในหูชั้นใน ส่วนผู้ป่วยอายุต่ำกว่า 50 ปี มักเกิดจากการได้รับบาดเจ็บที่ศีรษะ นอกจากนี้ยังอาจเกิดจากการติดเชื้อไวรัสหรือเป็นผลที่เกิดตามหลังการผ่าตัดหู และมีผู้ป่วยจำนวนไม่น้อยที่เกิดขึ้นโดยไม่ทราบสาเหตุแน่ชัด\n" +
                "      \tภาวะนี้อาจพบร่วมกับโรคอื่นๆ เช่น ไมเกรน โรคเมเนียส์  หูชั้นกลางอักเสบ โรคทางสมอง เป็นต้น\n");
        if (num2.equals("111")) {
            txtCmain2.setTextSize(15);
            imagesA2.setBackgroundResource(R.drawable.dow);
            txtCmain2.setText("");
            num2 = "1";
        }
    }
    private void Sick_sick3_3() {
        num3 = num3+"1";

        imagesA3.setBackgroundResource(R.drawable.up);
        txtCmain3.setTextSize(20);
        txtCmain3.setText("      \tผู้ป่วยจะมีอาการวิงเวียน เห็นบ้านหมุนหรือสิ่งรอบตัวหมุนอย่างรุนแรง ซึ่งเกิดขึ้นฉับพลันทันทีขณะ เปลี่ยนท่าหรือเคลื่อนไหวศีรษะ ที่พบบ่อยคือ ท่าลุกขึ้นจากเตียงนอน หรือท่านอนพลิกตะแคงตัว บางรายก็อาจ เป็นขณะล้มตัวลงนอน ก้มศีรษะ (ก้มหาของ กวาดบ้าน กราบพระ) หรือเงยศีรษะ (เงยมองขึ้นข้างบนหาของ สอยผลไม้ นอนบนเตียงทำฟัน นอนบนเตียงสระผม) อาการบ้านหมุนแต่ละครั้งจะเป็นอยู่นานประมาณ 20-30 วินาที (ส่วนใหญ่ไม่เกิน 1 นาที) และอาจกำเริบใหม่เมื่อเคลื่อนไหวศีรษะในท่านั้นอีก ขณะมีอาการบ้านหมุน ผู้ป่วยมักมีอาการตากระตุกร่วมด้วย\n" +
                "      \tในรายที่เป็นมากแม้แต่การเคลื่อนไหวศีรษะเพียงเล็กน้อย ก็อาจกระตุ้นให้เกิดอาการบ้านหมุน และมีอาการคลื่นไส้อาเจียนร่วมด้วย\n" +
                "      \tบางรายหลังจากหายเวียนศีรษะแล้ว ยังอาจมีอาการคลื่นไส้หรือรู้สึกโคลงเคลงนานหลายนาทีถึงหลาย ชั่วโมง\n" +
                "      \tในรายที่เป็นไม่มาก หลังจากหายเวียนศีรษะแต่ละครั้งก็จะรู้สึกสบายดีเฉกเช่นคนปกติ จนกว่าจะถูก กระตุ้นให้เกิดอาการครั้งใหม่\n" +
                "      \tผู้ป่วยจะไม่มีอาการหูอื้อ หูตึง หรือแว่วเสียงดังในหูร่วมด้วย (ถ้ามี มักเกิดจากโรคของหูชั้นในแบบ อื่นๆ)\n" +
                "      \tอาการบ้านหมุนอาจกำเริบเป็นครั้งคราว (เมื่อเคลื่อนไหวศีรษะในท่าที่ทำให้เกิดอาการ) อยู่เรื่อยๆ นานหลายวัน หรือเป็นสัปดาห์ๆ หรือเป็นเดือนๆ แล้วก็หายไปได้เอง พอเว้นได้ระยะหนึ่งอาจเป็นสัปดาห์ ๆ หรือเป็นแรมเดือน อาการก็หวนกลับมาเป็นใหม่ได้อีก\n");
        imagesB3.setBackgroundResource(R.drawable.a3_1);
        if (num3.equals("111")) {
            txtCmain3.setTextSize(15);
            imagesA3.setBackgroundResource(R.drawable.dow);
            txtCmain3.setText("");
            imagesB3.setBackgroundResource(0);
            num3 = "1";
        }
    }
    private void Sick_sick3_4() {
        num4 = num4+"1";
        imagesA4.setBackgroundResource(R.drawable.up);
        txtCmain4.setTextSize(20);
        txtCmain4.setText("      \tการตรวจร่างกายมักไม่พบสิ่งผิดปกติชัดเจน\n" +
                "      \tการทดสอบดิกซ์ฮอลล์ไพก์ (Dix-Hallpike test) จะพบอาการตากระตุกร่วมกับอาการบ้านหมุน\n" +
                "      \tจัดให้ผู้ป่วยนั่งบนเตียงตรวจ แล้วให้ผู้ป่วยนอนหงายลงบน เตียงตามแนวยาวของเสียง ให้ศีรษะห้อยลงจากขอบเตียง โดยมีมือผู้ตรวจพยุงไว้ ให้ศีรษะหงายไปข้างหลัง (ทำมุม 30 องศากับ ขอบเตียง) ผู้ตรวจจับศีรษะผู้ป่วยหันไปทางขวา 45 องศา สังเกตดูอาการตากระตุกนาน 20-30 วินาที ถ้าไม่พบให้จับศีรษะหันไปทางซ้าย 45 องศา แล้วสังเกตอาการในทำนองเดียวกัน\n");
        imagesB4.setBackgroundResource(R.drawable.a3_2);
        if (num4.equals("111")) {
            txtCmain4.setTextSize(15);
            imagesA4.setBackgroundResource(R.drawable.dow);
            txtCmain4.setText("");
            imagesB4.setBackgroundResource(0);
            num4 = "1";
        }
    }
    private void Sick_sick3_5() {
        num5 = num5+"1";
        imagesA5.setBackgroundResource(R.drawable.up);
        txtCmain5.setTextSize(20);
        txtCmain5.setText("      \tนอกจากความรู้สึกกลัวหรือทรมานขณะมีอาการ บ้านหมุนกำเริบแล้ว โรคนี้มักจะไม่มีภาวะแทรกซ้อน ร้ายแรงใดๆ ยกเว้นในผู้สูงอายุมากๆ หรือผู้ที่เคยได้รับบาดเจ็บหรือไม่ค่อยได้เคลื่อนไหวร่างกาย หรือมีโรคทางหูร่วมด้วย อาจเกิดการหกล้มกระดูกหักได้");
        if (num5.equals("111")) {
            txtCmain5.setTextSize(15);
            imagesA5.setBackgroundResource(R.drawable.dow);
            txtCmain5.setText("");
            num5 = "1";
        }
    }
    private void Sick_sick3_6() {
        num6 = num6+"1";

        imagesA6.setBackgroundResource(R.drawable.up);
        txtCmain6.setTextSize(20);
        txtCmain6.setText("      \t1. ควรแนะนำให้ผู้ป่วยปฏิบัติตัวดังนี้\n" +
                "      \t ก. ขณะมีอาการกำเริบ ให้ผู้ป่วยเปลี่ยนท่ามานั่งตัวตรงๆ หรือนอนหงายศีรษะตรงทันที\n" +
                "      \t ข. ป้องกันไม่ให้อาการกำเริบซ้ำโดยการนอนหนุนหมอนอย่างน้อย 2 ใบ อย่านอนตะแคงข้างที่มี อาการเวลาลุกจากเตียงนอนให้ลุกอย่างช้าๆ และนั่งอยู่ขอบเตียงสักครู่ก่อนจะยืนขึ้น อย่าก้มศีรษะต่ำหรือเงยมองขึ้นข้างบน หลีกเลี่ยงการทำงานที่ต้องก้มๆ เงยๆ การสะบัดผมหรือสะบัดคอเร็วๆ รวมทั้งท่าอื่น ๆ ที่กระตุ้นให้อาการกำเริบ\n" +
                "      \t ค. หลีกเลี่ยงการขับรถหรือทำงานเกี่ยวกับเครื่องจักร เพื่อป้องกันอุบัติเหตุที่อาจเกิดขึ้น\n" +
                "      \t2. ถ้าอาการไม่มากและเป็นอยู่ช่วงสั้น ๆ ไม่ต้อง ใช้ยารักษา แต่ถ้ามีอาการคลื่นได้หรือโคลงเคลงมากและ นานเป็นชั่วโมงๆ ก็ให้กินยาบรรเทาอาการ เช่น ไตเมนไฮดริเนต ครั้งละ 1-2 เม็ด ซ้ำได้ทุก 6 ชั่วโมง\n" +
                "      \t3. ถ้าอาการไม่ดีขึ้นใน 1 สัปดาห์ หรือมีอาการ บ้านหมุนหรืออาเจียนมาก มีอาการหูอื้อ หูตึง หรือแว่ว เสียงดังในหู เดินเซ แขนขาชาหรืออ่อนแรง พูดอ้อแอ้ กลืนลำบาก ตาเห็นภาพซ้อน หรือสงสัยมีความผิดปกติ รุนแรงอื่นๆ ควรส่งโรงพยาบาลอาจต้องทำการตรวจ\n" +
                "      \tพิเศษเพิ่มเติม เช่น ถ้าสงสัยโรคทางสมองอาจต้องตรวจเอกซเรย์คอมพิวเตอร์ หรือถ่ายภาพด้วยคลื่นแม่เหล็ก ไฟฟ้า\n" +
                "      \tถ้าสงสัยความผิดปกติทางหู อาจต้องตรวจสมรรถภาพของการได้ยิน (audiogram) ตรวจคลื่นไฟฟ้า เกี่ยวกับอาการตากระตุก (electronystagmography/ENG) ทดสอบบนเก้าอี้หมุน (rotatory chair test)\n" +
                "      \tถ้าพบว่าเป็นอาการบ้านหมุนจากการเปลี่ยนท่า แพทย์จะทำการรักษาด้วยท่าบริหารศีรษะที่เรียกว่า “Erley maneuver” (หรือเรียกอีกชื่อหนึ่งว่า “Canalith repositioning Imaneuver”) ซึ่งเป็นการทำให้ผลึกหินปูน ในหลอดทั้งวง (โดยเฉพาะอย่างยิ่งหลอดกึ่งวงด้านหลัง) ไหลกลับเข้าไปที่กระเปาะยูทรีเคิล วิธีนี้ทำเพียงครั้งเดียว\n" +
                "      \tการบริหารแบบ Frandt-Daraff exercise (สอนให้ผู้ป่วยทำเองที่บ้าน)\n" +
                "      \tท่าที่ 1 นั่งห้อยเท้าตรงขอบเตียง \n" +
                "      \tท่าที่ 2 ล้มตัวลงนอนตะแคงไปข้างหนึ่ง (เช่น ข้างซ้าย) หันศีรษะให้ปลายจมูกขึ้นบน ทำมุม 45 องศา กับพื้น อยู่ในท่านี้ 30 วินาที หรือจนกว่าจะหายเวียน (ถ้ามีอาการวิงเวียน) \n" +
                "      \tท่าที่ 3 ลุกขึ้นนั่งแบบเดียวกับในท่าที่ 1 อยู่ในท่านี้นาน 30 วินาที \n" +
                "      \tท่าที่ 4 ล้มตัวลงนอนตะแคงไปอีกข้างหนึ่ง (เช่น ข้างขวา) หันศีรษะให้ปลายจมูกขึ้นบน ทำมุม 45 องศากับพื้น อยู่ในท่านี้ 30 วินาที หรือจนกว่า จะหายเวียน (ถ้ามีอาการวิงเวียน) แล้วกลับมา สุกนั่งในท่าที่ 1 นาน 30 วินาที การบริหารท่านี้ ควรทำวันละ 3 ครั้ง เช้า กลาง วัน เย็น ครั้งละ 5 ชุด (ชุดหนึ่ง 4 ขั้นตอน)\n" +
                "      \tช่วยให้อาการหายได้ทันทีถึงร้อยละ 80 รายที่ไม่หายอาจ ต้องทำซ้ำ เมื่อหายแล้วประมาณร้อยละ 30 ของผู้ป่วยมีโอกาสกำเริบซ้ำใน 1 ปี และร้อยละ 50 กำเริบใน 5 ปี เมื่อกำเริบก็ต้องรักษาด้วยวิธีนี้ซ้ำอีก\n" +
                "      \tในรายที่ทำวิธีดังกล่าวไม่ได้ผล หรือทนต่อผล ข้างเคียง (บ้านหมุน คลื่นไส้ อาเจียน) ไม่ได้ หรือมีข้อ ห้ามทำ แพทย์จะสอนให้ผู้ป่วยทำท่าบริหารที่เรียกว่า “Brandt - Daroff exercise” โดยให้ทำเองที่บ้านทุกวัน วันละ 3 ครั้ง นาน 2 สัปดาห์ (ส่วนใหญ่จะทุเลาเมื่อทำ ไปได้ 10 วัน) ในรายที่กำเริบบ่อย แพทย์อาจแนะนำให้ ผู้ป่วยทำท่าบริหารนี้ต่อเนื่องทุกวัน\n" +
                "      \tส่วนในรายที่การรักษาดังกล่าวไม่ได้ผลและมีอาการต่อเนื่องนานเกิน 1 ปี แพทย์อาจรักษาด้วยการ ผ่าตัด ซึ่งได้ผลประมาณร้อยละ 90\n");
        imagesB6.setBackgroundResource(R.drawable.a3_3);
        if (num6.equals("111")) {
            txtCmain6.setTextSize(15);
            imagesA6.setBackgroundResource(R.drawable.dow);
            txtCmain6.setText("");
            imagesB6.setBackgroundResource(0);
            num6 = "1";
        }
    }
    private void Sick_sick3_7() {
        num7 = num7+"1";
        imagesA7.setBackgroundResource(R.drawable.up);
        txtCmain7.setTextSize(20);
        txtCmain7.setText("      \t1. โรคนี้แม้ว่าจะมีอาการบ้านหมุนรุนแรง จนผู้ป่วยบางคนรู้สึกตกใจกลัว และอาจเป็นๆ หายๆ ได้บ่อย จนน่ารำคาญ แต่จัดเป็นภาวะที่ไม่มีอันตรายเป็นส่วนใหญ่ผู้ป่วยควรสังเกตว่าท่าใดที่ทำให้อาการกำเริบ แล้วหาทางหลีกเลี่ยงไม่ทำท่านั้น ก็จะสามารถดำเนินชีวิตได้เป็นปกติ\n" +
                "      \t2. ในรายที่เป็นเรื้อรังหรือกำเริบบ่อย ควรให้แพทย์ที่มีความเชี่ยวชาญในการรักษาโรคนี้ทำการรักษาด้วยวิธีบริหารศีรษะ และผู้ป่วยอาจจำเป็นต้องหมั่นทำท่าบริหารเองที่บ้าน\n" +
                "      \t3. เนื่องจากโรคนี้มักพบในผู้สูงอายุ จึงควรแยกออกจากอาการบ้านหมุนจากภาวะหลอดเลือดตีบในสมอง ซึ่งมักมีอาการติดต่อกันนานๆ และอาจมีอาการผิดปกติ ทางสมอง (เช่น ตาเห็นภาพซ้อน พูดอ้อแอ้ เดินเซ แขน ขาชาหรืออ่อนแรง) ร่วมด้วย ส่วนอาการบ้านหมุนจากการเปลี่ยนท่ามักจะมีอาการเกิดขึ้นฉับพลันขณะเปลี่ยนท่าเฉพาะบางท่า และเป็นอยู่เพียง 20-30 วินาที อาจมีอาการคลื่นไส้ อาเจียน โคลงเคลงร่วมด้วย โดยที่ไม่มี อาการผิดปกติทางสมอง ส่วนใหญ่เมื่อหายจากอาการ บ้านหมุนแล้ว ผู้ป่วยมักจะรู้สึกสบายดี อย่างไรก็ตาม ถ้าแยกแยะโรคไม่ได้ชัดเจน หรือผู้ป่วยมีปัจจัยเสี่ยงต่อ ภาวะหลอดเลือดสมองตีบ (เช่น เป็นเบาหวาน ความดัน โลหิตสูง ไขมันในเลือดสูง) ก็ควรส่งโรงพยาบาลเพื่อการ วินิจฉัยที่แน่ชัด\n");
        if (num7.equals("111")) {
            txtCmain7.setTextSize(15);
            imagesA7.setBackgroundResource(R.drawable.dow);
            txtCmain7.setText("");
            num7 = "1";
        }
    }

    private void Sick_main_4() {
        // txtAmain.setText("ไข้หวัด");


        txtBmain1.setText("เนื้อหา");
        txtBmain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_1();
            }
        });

        txtBmain2.setText("สาเหตุ");
        txtBmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_2();
            }
        });

        txtBmain3.setText("สาเหตุกระตุ้น");
        txtBmain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_3();
            }
        });

        txtBmain4.setText("อาการ");
        txtBmain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_4();
            }
        });

        txtBmain5.setText("สิ่งตรวจพบ");
        txtBmain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_5();
            }
        });

        txtBmain6.setText("ภาวะแทรกซ้อน");
        txtBmain6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_6();
            }
        });

        txtBmain7.setText("ข้อแนะนำ");
        txtBmain7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_7();
            }
        });

        txtBmain8.setText("การป้องกัน");
        txtBmain8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_8();
            }
        });


        imagesA1.setBackgroundResource(R.drawable.dow);
        imagesA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_1();
            }

        });

        imagesA2.setBackgroundResource(R.drawable.dow);
        imagesA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_2();
            }

        });

        imagesA3.setBackgroundResource(R.drawable.dow);
        imagesA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_3();
            }

        });

        imagesA4.setBackgroundResource(R.drawable.dow);
        imagesA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_4();
            }

        });

        imagesA5.setBackgroundResource(R.drawable.dow);
        imagesA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_5();
            }

        });

        imagesA6.setBackgroundResource(R.drawable.dow);
        imagesA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_6();
            }

        });

        imagesA7.setBackgroundResource(R.drawable.dow);
        imagesA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_7();
            }

        });

        imagesA8.setBackgroundResource(R.drawable.dow);
        imagesA8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_8();
            }

        });


        txtcolked1.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked2.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked3.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked4.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked5.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked6.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked7.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked8.setBackgroundColor(getResources().getColor(R.color.colorked));

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_1();
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_2();
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_3();
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_4();
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_5();
            }
        });
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_6();
            }
        });
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_7();
            }
        });
        linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick4_8();
            }
        });

    }
    private void Sick_sick4_1() {
        num1 = num1+"1";
        Log.d("26JanV1", "position sickdata num data1  ==>  " + num1);
        imagesA1.setBackgroundResource(R.drawable.up);
        txtCmain1.setTextSize(20);
        txtCmain1.setText("      \tไมเกรน (โรคปวดหัวข้างเดียว ลมตะกัง ก็เรียก) พบได้ประมาณร้อยละ 10-15 ของประชากรทั่วไป พบ ได้ในคนทุกวัย แต่พบมากในช่วงอายุ 10-30 ปี พบ ในผู้หญิงมากกว่าผู้ชายประมาณ 3.5 เท่า โรคนี้มักเป็นๆ หายๆ เรื้อรังเป็นแรมปี เริ่มเป็น ครั้งแรกตอนย่างเข้าวัยรุ่น หรือระยะหนุ่มสาว โดยเฉพาะผู้ป่วยหญิงมักเป็นโรคนี้ตอนเริ่มมีประจำเดือน บางรายเริ่มเป็นโรคนี้ตั้งแต่เด็ก ซึ่งมักมีอาการปวดท้อง เมารถ เมาเรือด้วย มีน้อยรายที่จะมีอาการเป็นครั้งแรกเมื่ออายุ 40 ปีขึ้นไป แต่ผู้หญิงที่เคยเป็นไมเกรนมาก่อนเมื่อถึงวัยใกล้หมดประจำเดือน (40-50 ปี) อาจมีอาการปวด ศีรษะบ่อยขึ้น บางรายอาจทุเลาหรือหายไปเองเมื่ออายุ มากกว่า 50-60 ปีขึ้นไป แต่บางรายอาจเป็นตลอดชีวิต\n" +
                "      \tไมเกรนจัดว่าเป็นโรคที่ไม่มีอันตรายร้ายแรง แต่สร้างความรำคาญน่าทรมานและทำให้เสียการเสียงานโรคนี้เกิดได้กับคนทุกระดับ ไม่เกี่ยวกับฐานะทาง สังคมหรือระดับสติปัญญา แต่ผู้ป่วยที่มีฐานะดีหรือมี การศึกษาดีมักจะปรึกษาแพทย์บ่อยกว่า ผู้ที่เป็นโรคนี้ อยู่เป็นประจำ มักเป็นคนประเภทเจ้าระเบียบ รู้จี้จุกจิกโรคนี้ชาวบ้านเรียกว่า ลมตะกัง\n");
        if (num1.equals("111")) {
            txtCmain1.setTextSize(15);
            imagesA1.setBackgroundResource(R.drawable.dow);
            txtCmain1.setText("");
            num1 = "1";
        }
    }
    private void Sick_sick4_2() {
        num2 = num2+"1";

        imagesA2.setBackgroundResource(R.drawable.up);
        txtCmain2.setTextSize(20);
        txtCmain2.setText("      \tโรคนี้สามารถถ่ายทอดทางกรรมพันธุ์ (พบว่า ประมาณ 2 ใน 3 ของผู้ป่วยไมเกรน มีประวัติว่ามีพ่อแม่ พี่น้องเป็นโรคนี้ด้วย) และมักมีสาเหตุกระตุ้นให้เกิด อาการกำเริบในแต่ละครั้ง ส่วนกลไกการเกิดอาการของโรคยังไม่เป็นที่ทราบ แน่ชัด สันนิษฐานว่ามีความสัมพันธ์กับการเปลี่ยนแปลง ในการทำงานของสมอง ทั้งในส่วนเปลือกสมอง (cortex) และก้านสมอง (brain stem) ร่วมกับการเปลี่ยนแปลงของสารเคมีในสมอง ได้แก่ ซีโรโทนิน (serotonin) (พบว่ามีปริมาณลดลงขณะที่มีอาการกำเริบ) โดพามีน (dopamine) และสารเคมีกลุ่มอื่นๆ ส่งผลให้เกิดการอักเสบของเส้นใยประสาทสมองเส้นที่ 5 (trigeminal nerve fiber ที่เลี้ยงบริเวณใบหน้าและศีรษะ) รวม ทั้งการอักเสบร่วมกับการหดและขยายตัวของหลอดเลือดแดงทั้งในและนอกกะโหลกศีรษะ ทำให้เปลือกสมอง (cortex) มีเลือดไปเลี้ยงน้อยลง กระตุ้นให้เกิดอาการปวดศีรษะและอาการร่วมต่างๆ ขึ้นมา");
        if (num2.equals("111")) {
            txtCmain2.setTextSize(15);
            imagesA2.setBackgroundResource(R.drawable.dow);
            txtCmain2.setText("");
            num2 = "1";
        }
    }
    private void Sick_sick4_3() {
        num3 = num3+"1";

        imagesA3.setBackgroundResource(R.drawable.up);
        txtCmain3.setTextSize(20);
        txtCmain3.setText("      \tผู้ป่วยมักบอกได้ว่า มีสาเหตุต่างๆ ที่กระตุ้นให้เกิดอาการปวดศีรษะ ซึ่งแต่ละคนอาจมีสาเหตุที่แตกต่างกันไป แต่มักจะมีได้หลายๆ อย่าง อาทิเช่น\n" +
                "      \t• มีแสงสว่างจ้าเข้าตา เช่น ออกกลางแดดจ้าๆ แสงจ้า แสงไฟกะพริบ แสงสีระยิบระยับในโรงมหรสพ หรือสถานเริงรมย์ เป็นต้น\n" +
                "      \t• การใช้สายตาเพ่งดูอะไรนานๆ เช่น ดูภาพยนตร์ หนังสือ จอคอมพิวเตอร์ หรือกล้องจุลทรรศน์ เย็บปัก ถักร้อย เป็นต้น\n" +
                "      \t• การอยู่ในที่ๆ มีเสียงดังจอแจ เช่น ตลาดนัด หรือเสียงอึกทึก (เช่น เสียงกลอง เสียงระฆัง)\n" +
                "      \t• การสูดดมกลิ่นฉุนๆ เช่น กลิ่นน้ำมันรถ กลิ่น สีหรือทินเนอร์ กลิ่นสารเคมี หรือยาฆ่าแมลง ควันบุหรี่ กลิ่นน้ำหอมหรือดอกไม้ เป็นต้น\n" +
                "      \t• การดื่มกาแฟมากๆ ก็อาจกระตุ้นให้ปวดได้ (แต่บางคนดื่มกาแฟแล้วอาการทุเลา หรือขาดกาแฟกลับ ทำให้ปวดไมเกรน)\n" +
                "      \t• เหล้า เบียร์ เหล้าองุ่นแดง (red wine) ถั่ว ต่างๆ กล้วย นมเปรี้ยว เนยแข็ง ช็อกโกแลต ตับไก่ ไส้กรอก อาหารทะเล อาหารทอดน้ำมัน อาหารหมัก ดองหรือรมควัน ผงชูรส น้ำตาลเทียม (aspartame) สารกันบูด ผลไม้ที่มีรสเปรี้ยว (เช่น ส้ม มะนาว) หอม กระเทียม ล้วนกระตุ้นทำให้ปวดได้\n" +
                "      \t• ยานอนหลับ ยาขยายหลอดเลือด (เช่น ไนโตรกลีเซอรีน) ยาลดความดัน (เช่น ไฮดราลาซีน รีเซอร์พื้น) ยาขับปัสสาวะ\n" +
                "      \t• การอยู่ในที่ร้อนหรือเย็นเกินไป เช่นอากาศร้อนหรือหนาวจัดห้องที่อบอ้าวห้องปรับอากาศเย็นจัดอากาศเปลี่ยน แปลง เป็นต้น\n" +
                "      \t• การอดนอน (นอนไม่พอ) หรือนอนมากเกินไป การนอนตื่นสาย (เช่น ในวันหยุดสุดสัปดาห์)\n" +
                "      \t• การอดข้าว กินข้าวผิดเวลา หรือกินอิ่มจัด เชื่อ ว่าเกี่ยวกับภาวะน้ำตาลในเลือดต่ำ (hypoglycemia) ซึ่งกระตุ้นให้ปวดศีรษะได้ บางครั้งพบว่าผู้ป่วยไมเกรนเมื่อ เป็นโรคเบาหวาน (มีน้ำตาลในเลือดสูง) อาการปวดจะหายไป\n" +
                "      \t• การนั่งรถ นั่งเรือ หรือนั่งเครื่องบิน\n" +
                "      \t• การเปลี่ยนแปลงของระดับความสูงหรือความดันบรรยากาศ\n" +
                "      \t• อาการเจ็บปวดตามส่วนอื่น ๆ ของร่างกาย \n" +
                "      \t• การเป็นไข้ เช่น ตัวร้อนจากไข้หวัด ไข้หวัดใหญ่\n" +
                "      \t• การออกกำลังกายจนเหนื่อยเกินไป รวมทั้งการร่วมเพศ\n" +
                "      \t• ร่างกายเหนื่อยล้า\n" +
                "      \t• การถูกกระแทกแรงๆ ที่ศีรษะ (เช่นการใช้ศีรษะ โหม่งฟุตบอล) ก็อาจทำให้ปวดศีรษะทันที\n" +
                "      \t• อิทธิพลของฮอร์โมนเพศ สำหรับผู้ป่วยหญิงมีผลต่อการเกิดอาการไมเกรนอย่างมาก เช่น บางรายมีอาการปวดเฉพาะเวลาใกล้จะมีหรือขณะมีประจำเดือน บางรายในช่วง 3 เดือนแรกของการตั้งครรภ์ก็อาจทำให้ อาการกำเริบมากขึ้น เมื่อเลยระยะ 3 เดือนไปแล้ว อาการ มักจะหายไปจนกระทั่งหลังคลอด (ในระยะ 6 เดือนหลัง ของการตั้งครรภ์มักมีฮอร์โมนโพรเจสเทอโรนสูง) บางราย กินยาเม็ดคุมกำเนิด (มีฮอร์โมนเอสโทรเจน) ทำให้ปวด บ่อยขึ้น พอหยุดกินยาก็ดีขึ้น หรือฉีดยาคุมกำเนิดอาการ มักจะทุเลา\n" +
                "      \t• ความเครียดทางอารมณ์ คิดมาก อารมณ์ขุ่นมัว ตื่นเต้น ตกใจ\n");

        imagesB3.setBackgroundResource(R.drawable.a4_3);
        if (num3.equals("111")) {
            txtCmain3.setTextSize(15);
            imagesA3.setBackgroundResource(R.drawable.dow);
            txtCmain3.setText("");
            imagesB3.setBackgroundResource(0);
            num3 = "1";
        }
    }
    private void Sick_sick4_4() {
        num4 = num4+"1";
        imagesA4.setBackgroundResource(R.drawable.up);
        txtCmain4.setTextSize(20);
        txtCmain4.setText("      \tมักมีอาการกำเริบเป็นครั้งคราว ส่วนใหญ่จะมีอาการปวดแบบตุบๆ (เข้ากับจังหวะการเต้นของหัวใจ) ที่บริเวณขมับข้างใดข้างหนึ่ง อาจปวดสลับข้างในแต่ละครั้ง ส่วนน้อยจะปวดพร้อมกันทั้ง 2 ข้าง บางรายอาจมีอาการปวดที่รอบๆ กระบอกตาร่วมด้วย แต่ละครั้งมักจะปวดนาน 4-72 ชั่วโมง และจะปวดมากขึ้นเมื่อมีการเคลื่อนไหวของร่างกาย หรือสัมผัสถูกแสง เสียงหรือกลิ่นมักปวดรุนแรงปานกลางถึงมากจนเป็นอุปสรรค ต่อการทำกิจวัตรประจำ วัน ผู้ป่วยมักมีอาการคลื่นไส้ ร่วมด้วย และบางรายอาจมีอาการอาเจียนร่วมด้วย (หลัง อาเจียน อาการปวดจะค่อยๆ ทุเลาไปเอง) ผู้ป่วยมักมีอาการกลัว (ไม่ชอบ) แสงหรือเสียงร่วมด้วย ชอบอยู่ในห้องที่มืดและเงียบนอกจากนี้ยังอาจมีอาการอื่นๆ ร่วมด้วย เช่น ตาพร่ามัว คัดจมูก ท้องเดิน ปัสสาวะออก มาก ซีด เหงื่อออก บวมที่หนังศีรษะหรือใบหน้า เจ็บหนัง ศีรษะ มีเส้นพองที่ขมับ ขาดสมาธิ อารมณ์แปรปรวน รู้สึกศีรษะโหวงๆ รู้สึกจะเป็นลม แขนขาเย็น เป็นต้น \n" +
                "      \tบางรายก่อนมีอาการปวดศีรษะ อาจมีสัญญาณบอกเหตุซึ่งส่วนใหญ่จะเป็นอาการผิดปกติเกี่ยวกับสายตา เช่น เห็นแสงวอบแวบหรือระยิบระยับเห็นเป็น เส้นหยัก ภาพเบี้ยว ภาพเล็กหรือใหญ่เกินจริง หรือเห็น ดวงมืดในลานสายตา ซึ่งจะค่อยๆ เป็นมากขึ้นเรื่อยๆ ใน ช่วงเวลา 5-20 นาที และมักจะเป็นอยู่นานไม่เกิน 60 นาที ส่วนน้อยอาจมีสัญญาณบอกเหตุในลักษณะอื่นๆ เช่น มีความรู้สึกสัมผัสเพี้ยน (รู้สึกเสียวแปลบๆ เหมือน ถูกเข็ม หรือเหมือนมีตัวอะไรไต่) ที่มือและแขน รอบ ปากและจมูกข้างใดข้างหนึ่ง ชาที่ใบหน้าและแขนขา มี ความรู้สึกไวต่อการสัมผัส พูดไม่ได้หรือพูดลำบาก บ้าน หมุน” มีเสียงหลอนหรือกลิ่นหลอน เห็นภาพซ้อน แขนขาอ่อนแรง อาการเหล่านี้มักเป็นเพียงชั่วขณะ แล้วทุเลาไปได้เอง\n" +
                "      \tอาการปวดศีรษะ มักเกิดขึ้นภายใน 60 นาที (บาง ครั้งหลายชั่วโมง) หลังสัญญาณบอกเหตุทุเลาลงแล้วบางรายสัญญาณบอกเหตุอาจเป็นต่อเนื่องแม้ภายหลังมีอาการปวดศีรษะเกิดขึ้นแล้ว บางรายอาจมีสัญญาณบอกเหตุโดยไม่มีอาการปวดตุบๆ แบบไมเกรนตามมา หรือมีอาการปวดศีรษะใน ลักษณะแตกต่างจากไมเกรน (เช่นปวดมึนปวดซื้อ) ตามมาก็ได้ นอกจากนี้ผู้ป่วยบางรายอาจมีอาการผิดปกติล่วงหน้าหรือตามหลังระยะปวดไมเกรน อาการผิดปกติล่วงหน้า (prodome) อาจเกิดก่อนปวดศีรษะเป็นชั่วโมงๆ หรือเป็นวันๆ เช่น อารมณ์ แปรปรวน (หงุดหงิด ซึมเศร้า หรือครื้มใจ) อ่อนเพลีย หาวบ่อย ง่วงนอนมาก รู้สึกอยากอาหารบางชนิด (เช่น ช็อกโกแลต ของหวาน) กล้ามเนื้อตึง (โดยเฉพาะอย่าง ยิ่งที่คอ) ท้องผูกหรือท้องเดินปัสสาวะออกมาก ส่วนอาการผิดปกติที่อาจพบภายหลังหายปวดศีรษะแล้ว (postdome) เช่น อ่อนเพลีย หงุดหงิด เฉยเมย ขาดสมาธิ เจ็บหนังศีรษะ อารมณ์แปรปรวน รู้สึกศีรษะ โหวงๆ กลัวแสง เบื่ออาหาร เป็นต้น\n" +
                "      \tในเด็กมักมีอาการคล้ายดังกล่าวข้างต้น แต่มักจะ ปวดขมับพร้อมกัน 2 ข้าง และปวดนานน้อยกว่าผู้ใหญ่ (นานประมาณ 1-48 ชั่วโมง) ไม่ค่อยมีสัญญาณบอกเหตุ ทางตา (อาการผิดปกติทางสายตา) แต่มักมีอาการผิดปกติ ล่วงหน้า เช่น หาวบ่อยง่วงนานมากหรือเฉยเมย มีความรู้สึกอยากอาหารบางชนิด (เช่น ช็อกโกแลต ของหวาน นมเปรี้ยว กล้วย) เด็กบางคนอาจมีอาการคลื่นไส้ อาเจียน ปวดท้อง กลัวแสง กลัวเสี่ยง โดยไม่มีอาการปวดศีรษะก็ได้ เมื่อโตขึ้นก็จะมีอาการปวดศีรษะไมเกรน)\n" +
                "      \tเกณฑ์การวินิจฉัยโรคไมเกรนชนิดไม่มีสัญญาณบอกเหตุ\t\n" +
                "      \tมีอาการปวดศีรษะกำเริบอย่างน้อย 5 ครั้ง ซึ่งมีลักษณะ อาการดังนี้\n" +
                "      \t1. ปวดศีรษะแต่ละครั้งนาน 4-72 ชั่วโมง \n" +
                "      \t2. มีอาการต่อไปนี้อย่างน้อย 2 อย่าง\n" +
                "      \t • ปวดข้างเดียว \n" +
                "      \t • ปวดแบบตุบ ๆ\n" +
                "      \t • ปวดรุนแรงปานกลางถึงมาก (เป็นอุปสรรคต่อการ ทำกิจวัตรประจำวัน)\n" +
                "      \t • ปวดมากขึ้นเมื่อเดินขึ้นบันไดหรือเคลื่อนไหวร่างกาย \n" +
                "      \t3. มีอาการต่อไปนี้อย่างน้อย 1 อย่าง\n" +
                "      \t • คลื่นไส้ อาเจียน หรือทั้ง 2 อย่าง \n" +
                "      \t • กลัวแสง กลัวเสียง หรือทั้ง 2 อย่าง\n" +
                "      \tเกณฑ์การวินิจฉัยโรคไมเกรนชนิดมีสัญญาณบอกเหตุ\n" +
                "      \tมีอาการกำเริบอย่างน้อย 2 ครั้ง ซึ่งมีลักษณะอาการดังนี้\n" +
                "      \t 1. มีสัญญาณบอกเหตุอย่างน้อย 1 อาการ (โดยไม่มี อาการกล้ามเนื้ออ่อนแรงหรืออัมพาต) ดังต่อไปนี้\n" +
                "      \t  • อาการผิดปกติทางสายตา เช่น เห็นแสงวอบแวบ เห็นเป็นเส้นหยัก ภาพเบี้ยว ภาพเล็กหรือใหญ่เกินจริง \n" +
                "      \t  • ความรู้สึกสัมผัสผิดปกติ เช่น รู้สึกเสียว ๆ แปลบ เหมือนถูกเข็ม หรือมีตัวอะไรไต่ ชาที่ใบหน้าหรือแขนขา\n" +
                "      \t  • มีอาการพูดไม่ได้หรือพูดลำบาก \n" +
                "      \t 2. สัญญาณบอกเหตุมีลักษณะอย่างน้อย 2 ข้อต่อไปนี้\n" +
                "      \t  • มีอาการผิดปกติทางสายตาข้างเดียว และ/หรือ ความรู้สึกสัมผัสผิดปกติข้างเดียว\n" +
                "      \t  • มีสัญญาณบอกเหตุอย่างน้อย 1 อาการที่ค่อยๆเกิดมากขึ้นในช่วงเวลามากกว่า 5 นาที และ/หรือมีสัญญาณ บอกเหตุต่างๆ ทยอยเกิดตามกันมาในช่วงเวลามากกว่า 5 นาที\n" +
                "      \t  • สัญญาณบอกเหตุแต่ละอย่างเป็นอยู่นาน 5-60 นาที\n");
        imagesB4.setBackgroundResource(R.drawable.a4_4);
        if (num4.equals("111")) {
            txtCmain4.setTextSize(15);
            imagesA4.setBackgroundResource(R.drawable.dow);
            txtCmain4.setText("");
            imagesB4.setBackgroundResource(0);
            num4 = "1";
        }
    }
    private void Sick_sick4_5() {
        num5 = num5+"1";
        imagesA5.setBackgroundResource(R.drawable.up);
        txtCmain5.setTextSize(20);
        txtCmain5.setText("      \tมักตรวจไม่พบสิ่งผิดปกติชัดเจน ขณะที่มีอาการปวด อาจคดได้หลอดเลือดที่บริเวณ ขมับโป่งพอง และเต้นตุบๆ หรือพบอาการเจ็บเสียวที่หนังศีรษะเวลาสัมผัสถูก น้อยรายมากที่อาจพบอาการแสดงของสัญญาณบอก เหตุ เช่น พูดไม่ได้ แขนขาอ่อนแรง หมดสติ");
        if (num5.equals("111")) {
            txtCmain5.setTextSize(15);
            imagesA5.setBackgroundResource(R.drawable.dow);
            txtCmain5.setText("");
            num5 = "1";
        }
    }
    private void Sick_sick4_6() {
        num6 = num6+"1";

        imagesA6.setBackgroundResource(R.drawable.up);
        txtCmain6.setTextSize(20);
        txtCmain6.setText("      \tส่วนใหญ่จะเป็นๆ หายๆ เป็นช่วงๆ โดยไม่มีภาวะแทรกซ้อนร้ายแรง นอกจากอาจทำให้มีความวิตกกังวลหรือซึมเศร้า บางรายอาจมีอาการปวดไมเกรนต่อเนื่อง (status migrainosus) คือปวดติดต่อกันนานเกิน 72ชั่วโมง หรืออาจเป็นไมเกรนเรื้อรัง (chronic migraine) คือ ปวด มากกว่า 15 วัน/เดือน โรคไมเกรนเรื้อรัง มักจะสัมพันธ์กับโรควิตก กังวล โรคแพนิก โรคอารมณ์แปรปรวน หรือซึมเศร้า มีภาวะเครียด หรือมีการใช้ยาแก้ปวดไมเกรนมากเกินไป (มากกว่า 2-3 ครั้ง/สัปดาห์)\n" +
                "      \tมีน้อยรายมากที่อาจเสี่ยงต่อการเป็นโรคหลอดเลือดสมองจากภาวะขาดเลือดแทรกซ้อน ซึ่งมักพบในผู้หญิงที่เป็นไมเกรนชนิดมีสัญญาณบอกเหตุ (aura) ที่มีประวัติสูบบุหรี่และ/หรือกินยาเม็ดคุมกำเนิด\n" +
                "      \tนอกจากนี้ ผู้ป่วยไมเกรนยังอาจมีภาวะอื่นๆ ร่วมด้วยมากกว่าผู้ที่ไม่ได้เป็นไมเกรน เช่น โรคลมชัก ภาวะไขมันในเลือดผิดปกติ จากกรรมพันธุ์โรค วิตกกังวล โรคซึมเศร้า โรคลำไส้แปรปรวน ความดันโลหิตสูง โรคสั่นไม่ทราบสาเหตุ (hereditary essential tremor) เป็นต้น การรักษา\n" +
                "      \t1. ขณะที่มีอาการกำเริบ ให้ยาบรรเทาปวด ได้แก่ ยาแก้ปวด หรือยาต้านอักเสบที่ไม่ใช่สตีรอยด์ ในรายที่เป็นรุนแรงอาจให้ยารักษาไมเกรน เช่น คาเฟอร์กอตแทน ถ้ามีอาการคลื่นไส้หรืออาเจียน ให้ยาแก้อาเจียน เช่น เมโทโคลพราไมด์ ดอมเพอริโดน \n" +
                "      \tข้อสำคัญ การให้ยาบรรเทาปวด ต้องรีบกระทำทันทีเมื่อเริ่มรู้สึกมีอาการ จึงจะได้ผลดี และควรแนะนำให้ผู้ป่วยนั่งหรือนอนพักในห้องมืดและเงียบ ๆ\n" +
                "      \t2. ถ้าปวดรุนแรงปวดติดต่อกันนานเกิน 72 ชั่วโมง แขนขาอ่อนแรงหรือหมดสติ หรือสงสัยเกิดจากสาเหตุ ร้ายแรงอื่นๆ เช่น ต้อหินเฉียบพลัน โรคหลอด เลือดสมองแตก ศีรษะได้รับบาดเจ็บเลือดออกในสมอง เยื่อหุ้มสมองอักเสบ เป็นต้น ควรส่งโรงพยาบาลโดยเร็ว อาจจำเป็นต้องทำการตรวจเพิ่มเติม เช่น เจาะหลัง ถ่ายภาพสมองด้วยคลื่นแม่เหล็กไฟฟ้า หรือเอกซเรย์คอมพิวเตอร์ เป็นต้น ถ้าตรวจพบว่าเป็นไมเกรน ก็จะให้ยารักษาไมเกรนสำหรับชนิดปวดรุนแรง ได้แก่ ชูมาทริปแทน (sumatriptan) กินขนาด 50-100 มก.ครั้งเดียว ส่วนใหญ่ อาการปวดมักจะทุเลาภายใน 4 ชั่วโมงหลังให้ยา ในกรณี ที่มีอาการปวดไมเกรนนานเกิน 72 ชั่วโมง (ซึ่งพบได้น้อย) แพทย์อาจต้องให้ยานี้ซ้ำหลายครั้ง (แต่ไม่ควรเกิน 300 มก./24 ชั่วโมง) ร่วมกับยาต้านอักเสบที่ไม่ใช่สตีรอยด์ ในบางกรณีแพทย์อาจพิจารณาให้ยาอื่นแทน เช่น ฉีดไดโดรเออร์โกตามีน 1-2 มก. เข้าใต้ผิว หนัง หรือฉีดคลอร์ไพรมาซึน (chlorpromazine) 25-50 มก. เข้าหลอดเลือดดำ หรือฉีดเดกซาเมทาโชน 4-8 มก. เข้าหลอดเลือดดำ หรือให้เพร็ตนิโซโล กินวันละ 60 มก. วันละครั้ง เป็นระยะเวลา 3-4 วัน ในกรณีที่มีอาการแขนขาอ่อนแรงหรือหมดสติ (เป็นอาการแสดงของไมเกรนชนิดรุนแรง ซึ่งพบได้น้อยมาก) ก็จำเป็นต้องให้การรักษาแบบประคับประคองอาการจะเป็นอยู่ชั่วคราว และหายได้เอง\n" +
                "      \t3. ในรายที่มีอาการมากกว่าเดือนละ 3 ครั้ง ควร ให้ยาป้องกัน ถ้าใช้ยาไม่ได้ผล หรือมีอาการปวดแทบทุกวัน (มากกว่า 15 วัน/เดือน) ซึ่งถือว่าเป็นไมเกรนเรื้อรัง ควรปรึกษาแพทย์ผู้เชี่ยวชาญเพื่อตรวจหาสาเหตุ\n");
        if (num6.equals("111")) {
            txtCmain6.setTextSize(15);
            imagesA6.setBackgroundResource(R.drawable.dow);
            txtCmain6.setText("");
            num6 = "1";
        }
    }
    private void Sick_sick4_7() {
        num7 = num7+"1";
        imagesA7.setBackgroundResource(R.drawable.up);
        txtCmain7.setTextSize(20);
        txtCmain7.setText("      \t1. อาการปวดศีรษะแบบตุบๆ นอกจากจะมีสาเหตุ จากไมเกรนแล้ว ยังอาจเป็นอาการแสดงของโรคความ ดันโลหิตสูง ได้ ดังนั้นในการวินิจฉัยว่าเป็นไมเกรน ควรตรวจวัดความดันให้แน่ใจก่อน โดยเฉพาะอย่างยิ่งผู้ที่มีอายุมากกว่า 30 ปี\n" +
                "      \t2. โรคนี้มักมีอาการเป็นๆหายๆ เรื้อรังมาตั้งแต่วัย เด็กหรือวัยหนุ่มสาว อาจมีอาการกำเริบถี่ห่างในแต่ละ ช่วงเวลาและแต่ละคนแตกต่างกันไป ควรให้ความมั่นใจ แก่ผู้ป่วยว่าไม่ใช่โรคร้ายแรงหรือเป็นเนื้องอกสมอง มี เช่นนั้นผู้ป่วยจะวิตกกังวล และเปลี่ยนหมอเปลี่ยนโรง พยาบาลไปเรื่อยๆ\n" +
                "      \t3. ควรแนะนำให้ผู้ป่วยสังเกตว่ามีสาเหตุอะไรที่กระตุ้นให้ปวดศีรษะบ้าง ถ้าทราบและสามารถหลีกเลี่ยงได้ ก็จะช่วยให้ปวดห่างขึ้น\n" +
                "      \t4. ควรแนะนำให้ผู้ป่วยรู้จักดูแลตัวเองตั้งแต่เริ่มมีอาการกำเริบ เช่น เริ่มมีอาการผิดปกติล่วงหน้า หรือมีสัญญาณบอกเหตุ ก็ควรจะรีบกินยาบรรเทาปวดทันที (ผู้ป่วยควรพกยาแก้ปวดไว้ประจำตัว) แล้วนั่งหรือนอนพักในห้องที่มืดและเงียบๆ อากาศถ่ายเทสะดวก ไม่อบอ้าว จะช่วยให้บรรเทาอาการปวดได้เร็ว หากปล่อยให้ปวดอยู่นานแล้วค่อยกินยาอาจไม่ค่อยได้ผล\n" +
                "      \t5. ผู้ที่มีอาการปวดไมเกรนบ่อย ทั้งๆ ที่กินยารักษาไมเกรน โดยเฉพาะอย่างยิ่งยาต้านอักเสบที่ไม่ใช่ สตีรอยด์ หรือยากลุ่มเออร์โกตามีน อยู่ บ่อยๆ อาจเกิดจากการใช้ยามากเกิน ควรปรึกษาแพทย์เพื่อปรับเปลี่ยนการใช้ยาให้เหมาะสม\n" +
                "      \t6. การออกกำลังกายแต่พอเหมาะ (อย่าหักโหมจน เกินไป หลีกเลี่ยงบริเวณที่มีแสงจ้าและอากาศร้อน) การ\n" +
                "      \tฝึกวิธีผ่อนคลายความเครียดหรือการทำสมาธิ และการรักษาด้วยการฝังเข็ม อาจช่วยให้โรคทุเลาหรือเว้นห่างขึ้นได้\n" +
                "      \t7. ผู้ป่วยไมเกรนควรหลีกเลี่ยงการสูบบุหรี่ และ การกินยาเม็ดคุมกำเนิด โดยเฉพาะผู้หญิงที่เป็นไมเกรน ชนิดมีสัญญาณบอกเหตุ เพื่อลดความเสี่ยงต่อการเกิด โรคหลอดเลือดสมองแทรกซ้อน\n" +
                "      \t8. อาการปวดศีรษะข้างเดียว อาจมีสาเหตุจากโรคอื่นๆ โดยเฉพาะอย่างยิ่ง ถ้าพบในผู้ชายที่มีอาการ ปวดรุนแรงข้างเดียว แบบเป็นๆ หายๆ ครั้งละไม่เกิน 4 ชั่วโมง อาจเป็นโรคปวดศีรษะคลัสเตอร์\n" +
                "      \tถ้าพบในคนอายุมากกว่า 40-50 ปี ที่มีอาการปวดรุนแรงและคลำหลอดเลือดแดงที่ขมับ มีลักษณะค่อนข้างแข็งและกดเจ็บ อาจมีสาเหตุจากหลอดเลือด แดงอักเสบ (giant cell arteritis) ควรส่งโรงพยาบาลโดยเร็ว เพราะอาจทำให้ตาบอดได้ แพทย์จะให้กินเพร็ดนิโซโลน เป็นเวลาอย่างน้อย 2-4 สัปดาห์ โรคนี้ถึงแม้จะพบได้น้อย แต่ก็ถือว่าเป็นโรคที่มีอันตราย ร้ายแรงชนิดหนึ่งในคนอายุ 40-50 ปี ขึ้นไป\n" +
                "      \tนอกจากนี้ในรายที่ปวดรุนแรง (โดยเฉพาะ อย่างยิ่งในรายที่ไม่เคยปวดไมเกรนมาก่อน หรือมีอาการ แตกต่างจากอาการไมเกรนที่เคยเป็น) หรือกินยาไม่ได้ผล อาจต้องนึกถึงภาวะปริแตกของหลอดเลือดที่ผิดปกติในสมอง เช่น หลอดเลือดโป่งพอง (aneurysm) หลอดเลือดฝอยผิดปกติ (arteriovenous malformation/ AVM) ต้อหินเฉียบพลัน ในผู้สูงอายุ โรคปวด ประสาทใบหน้า (trigeminal neuralgia) ซึ่งจะมีอาการ ปวดเหมือนถูกมีดแทงหรือเข็มร้อนๆ แทง หรือไฟฟ้าช็อต ที่บริเวณใบหน้าซีกใดซีกหนึ่งนานครั้งละ 10-30 วินาที เป็นๆ หายๆ เรื้อรัง \n" +
                "      \tดังนั้นหากสงสัยควรส่งโรงพยาบาล เพื่อการ ตรวจวินิจฉัยที่แน่นอน และให้การรักษาได้ทันท่วงทีในรายที่มีภาวะรุนแรง\n");
        if (num7.equals("111")) {
            txtCmain7.setTextSize(15);
            imagesA7.setBackgroundResource(R.drawable.dow);
            txtCmain7.setText("");
            num7 = "1";
        }
    }
    private void Sick_sick4_8() {
        num8 = num8+"1";
        imagesA8.setBackgroundResource(R.drawable.up);
        txtCmain8.setTextSize(20);
        txtCmain8.setText("      \tสำหรับผู้ที่ปวดไมเกรนบ่อยๆ ให้พยายามค้นหาสิ่งที่กระตุ้นให้ปวดแล้วหลีกเลี่ยงเสีย เช่น ถ้ากินยาเม็ด คุมกำเนิด ทำให้ปวดบ่อย ก็เลิกยานี้เสีย และหันไปใช้ยาคุมชนิดฉีดแทน (ยานี้มีฮอร์โมนโพรเจสเทอโรน มีส่วน ช่วยป้องกันไมเกรน) ถ้ากินผงชูรสหรือดื่มแอลกอฮอล์ แล้วปวดก็ควรงดเสีย ถ้าเข้าไปในที่ที่มีเสียงอึกทึกจอแจ (เช่น ตลาดนัด) แล้วปวดก็ต้องงดไป เป็นต้น\n" +
                "      \tถ้าไม่ทราบว่าอะไรเป็นสาเหตุกระตุ้น หรือทราบแต่ไม่อาจหลีกเลี่ยงได้ และยังปวดอยู่บ่อยๆ (มากกว่า 3 ครั้ง/เดือน) จนเสียการเสียงาน ควรให้ยากินป้องกันไม่ ให้ปวด ซึ่งมีอยู่หลายขนาน โดยให้เลือกใช้ขนานใดขนาน หนึ่งเพียงขนานเดียว และให้กินเป็นประจำทุกวัน ควรให้ ติดต่อกันนาน 4-6 เดือน จึงค่อยหยุดยา เมื่อกลับมามี อาการกำเริบบ่อยๆ อีก ก็ให้กินยาป้องกันซ้ำอีก\n");
        if (num8.equals("111")) {
            txtCmain8.setTextSize(15);
            imagesA8.setBackgroundResource(R.drawable.dow);
            txtCmain8.setText("");
            num8 = "1";
        }
    }


    private void Sick_main_5() {
        // txtAmain.setText("ไข้หวัด");

        txtBmain1.setText("เนื้อหา");
        txtBmain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_1();
            }
        });

        txtBmain2.setText("สาเหตุ");
        txtBmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_2();
            }
        });

        txtBmain3.setText("อาการ");
        txtBmain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_3();
            }
        });

        txtBmain4.setText("สิ่งตรวจพบ");
        txtBmain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_4();
            }
        });

        txtBmain5.setText("การรักษา");
        txtBmain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_5();
            }
        });

        txtBmain6.setText("ข้อแนะนำ");
        txtBmain6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_6();
            }
        });

        txtBmain7.setText("การป้องกัน");
        txtBmain7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_7();
            }
        });


        imagesA1.setBackgroundResource(R.drawable.dow);
        imagesA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_1();
            }

        });

        imagesA2.setBackgroundResource(R.drawable.dow);
        imagesA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_2();
            }

        });

        imagesA3.setBackgroundResource(R.drawable.dow);
        imagesA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_3();
            }

        });

        imagesA4.setBackgroundResource(R.drawable.dow);
        imagesA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_4();
            }

        });

        imagesA5.setBackgroundResource(R.drawable.dow);
        imagesA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_5();
            }

        });

        imagesA6.setBackgroundResource(R.drawable.dow);
        imagesA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_6();
            }

        });

        imagesA7.setBackgroundResource(R.drawable.dow);
        imagesA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_7();
            }

        });


        txtcolked1.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked2.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked3.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked4.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked5.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked6.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked7.setBackgroundColor(getResources().getColor(R.color.colorked));

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_1();
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_2();
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_3();
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_4();
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_5();
            }
        });
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_6();
            }
        });
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick5_7();
            }
        });
    }
    private void Sick_sick5_1() {
        num1 = num1+"1";
        Log.d("26JanV1", "position sickdata num data1  ==>  " + num1);
        imagesA1.setBackgroundResource(R.drawable.up);
        txtCmain1.setTextSize(20);
        txtCmain1.setText("      \tโรคขาดวิตามินเอ ยังพบได้ในท้องที่ชนบทบาง แห่ง (พบบ่อยทางภาคอีสาน) และในเด็กที่ยากจน\n" +
                "      \tเภาวะขาดวิตามินเอ ทำให้ประสาทตาส่วนที่เรียก ว่าจอตา หรือเรตินา (retina) เสื่อม ทำให้เยื่อบุตาแห้ง และต่อมน้ำตาไม่ทำงาน จึงอาจทำให้เด็กที่เป็นโรคนี้ตาบอดได้ ดังที่ชาวบ้านรู้จักกันดี่ว่าเป็น โรคเกล็ดกระดี่ขึ้นตา\n");
        if (num1.equals("111")) {
            txtCmain1.setTextSize(15);
            imagesA1.setBackgroundResource(R.drawable.dow);
            txtCmain1.setText("");
            num1 = "1";
        }
    }
    private void Sick_sick5_2() {
        num2 = num2+"1";

        imagesA2.setBackgroundResource(R.drawable.up);
        txtCmain2.setTextSize(20);
        txtCmain2.setText("      \tมักจะพบในเด็กวัยแรกเกิดถึงอายุ 5 ปี เกิดจาก การกินอาหารที่มีวิตามินเอน้อยไป เช่น กินแต่นมข้นหวาน กล้วยบดและข้าว โดยไม่ได้อาหารเสริมอื่นๆ โรคนี้มักจะพบร่วมกันไปกับโรคขาดอาหารบางราย อาจเป็นหลังจากเป็นโรคติดเชื้อ (เช่น หัด ปอดอักเสบ) หรือท้องเดินเรื้อรัง\n" +
                "      \tเในผู้ใหญ่พบได้น้อย ถ้าพบมักมีสาเหตุจากโรค อื่นๆ เช่น โรคตับเรื้อรัง โรคลำไส้อักเสบเรื้อรัง เป็นต้น มีผลทำให้การดูดซึมวิตามินเอน้อยลง\n");
        if (num2.equals("111")) {
            txtCmain2.setTextSize(15);
            imagesA2.setBackgroundResource(R.drawable.dow);
            txtCmain2.setText("");
            num2 = "1";
        }
    }
    private void Sick_sick5_3() {
        num3 = num3+"1";
        imagesA3.setBackgroundResource(R.drawable.up);
        txtCmain3.setTextSize(20);
        txtCmain3.setText("      \tเริ่มแรกจะมีอาการตาฟางหรือมองไม่เห็นเฉพาะ ตอนกลางคืนหรือในที่มืดๆ (แต่มองเห็นเป็นปกติใน เวลากลางวัน และในที่สว่างๆ) เนื่องจากจอตาเริ่มเสื่อม ต่อมาเยื่อตาขาวแห้ง เมื่อเป็นมากขึ้นเยื่อตาขาวจะย่น อยู่รอบๆ กระจกตาดำดูคล้ายเกล็ดปลา และกระจกตา ดำซึ่งปกติสะท้อนแสงวาววับ จะแห้งและไม่มีประกาย ตาขาวจะเปลี่ยนเป็นสีเทาหรือสีเงิน เห็นเป็นจุดใหญ่ทางด้านหางตา เรียกว่า จุดบิทอตส์ (Bitot's spot) หรือ เกล็ดกระดี่ อาจเป็นที่ตาทั้ง 2 ข้าง ถ้ารักษาในระยะนี้จะแก้ได้ทัน แต่ถ้าปล่อยทิ้งไว้กระจกตาจะเกิดการอ่อนตัว เป็นแผล และเกิดรูทะลุ มีเชื้อโรคเข้าไปในลูกตา ทำให้ เกิดการอักเสบภายในลูกตา ตาจะบอดได้ ถ้าเป็นในระยะนี้โอกาสหายก็มีน้อย\n" +
                "      \tเในเด็กเล็กมักตรวจพบเมื่อมีการอ่อนตัวของ กระจกตาดำแล้ว จะพบหนังตาบวม ปิดตาแน่น ไม่ยอมลืมตา\n");
        imagesB3.setBackgroundResource(R.drawable.a5_3);
        if (num3.equals("111")) {
            txtCmain3.setTextSize(15);
            imagesA3.setBackgroundResource(R.drawable.dow);
            txtCmain3.setText("");
            imagesB3.setBackgroundResource(0);
            num3 = "1";
        }
    }
    private void Sick_sick5_4() {
        num4 = num4+"1";
        imagesA4.setBackgroundResource(R.drawable.up);
        txtCmain4.setTextSize(20);
        txtCmain4.setText("      \tอาจตรวจพบ เยื่อตาขาวรอบๆ กระจกตาดำเป็น รอยย่น กระจกตาดำขุ่นมัวไม่สะท้อนแสงและเกล็ด กระดี่ตรงด้านหางตา");
        if (num4.equals("111")) {
            txtCmain4.setTextSize(15);
            imagesA4.setBackgroundResource(R.drawable.dow);
            txtCmain4.setText("");
            num4 = "1";
        }
    }
    private void Sick_sick5_5() {
        num5 = num5+"1";
        imagesA5.setBackgroundResource(R.drawable.up);
        txtCmain5.setTextSize(20);
        txtCmain5.setText("      \t1.\tเมื่อเริ่มมีอาการตาบอดกลางคืน หรือเริ่มมี เกล็ดกระดี่ขึ้นตา ให้กินวิตามินเอชนิดแคปซูล (ขนาด 25,000 ยูนิต) วันละ 2 ครั้ง ครั้งละ 1-2 แคปซูล เป็น\n" +
                "      \t2.\tเวลา 3-5 วัน (ในเด็กเล็กควรฉีกแคปซูลให้กิน) พร้อม กับให้วิตามินรวมชนิดน้ำเชื่อม 1 ช้อนชา วันละ 3 ครั้ง ถ้ามีวิตามินเอชนิดฉีดให้ขนาด 1 แสนยูนิต ฉีดเข้า กล้ามเนื้อที่สะโพกครั้งเดี่ยว เพิ่มเติมจากยากินดังกล่าว หรือถ้าไม่มียาวิตามินเอชนิดแคปซูลหรือชนิดฉีด ให้ กินวิตามินรวมชนิดน้ำเชื่อม 1 ช้อนชาวันละ 3 ครั้ง หรือน้ำมันตับปลา (1,000 ยูนิต) วันละ 3 ครั้ง ครั้งละ 2-5 เม็ด ร่วมกับกินอาหารที่มีวิตามินเอ นาน 2-3 เดือน\n" +
                "      \t3.\tถ้าไม่ดี่ขึ้นใน 1 สัปดาห์ หรือมีอาการอ่อนตัวของกระจกตาดำให้ส่งโรงพยาบาล\n" +
                "      \t4.\tถ้ามีการติดเชื้ออักเสบ ให้ส่งโรงพยาบาลทันที ระหว่างที่เดินทางอาจให้กินวิตามินเอชนิดแคปซูล หรือ ฉีดวิตามินเอดังในข้อ 1 ร่วมกับให้กินยาปฏิชีวนะ เช่น เพนิซิลลินวี อะม็อกซีซิลลิน อีริโทรไมชิน ถ้าเด็กปิดตาแน่น อย่าพยายามเปิดตาเด็ก เพราะอาจทำให้กระจกตาดำแตกทะลุได้\n");
        if (num5.equals("111")) {
            txtCmain5.setTextSize(15);
            imagesA5.setBackgroundResource(R.drawable.dow);
            txtCmain5.setText("");
            num5 = "1";
        }
    }
    private void Sick_sick5_6() {
        num6 = num6+"1";

        imagesA6.setBackgroundResource(R.drawable.up);
        txtCmain6.setTextSize(20);
        txtCmain6.setText("      \tเด็กที่มีภาวะขาดวิตามินเอ เมื่อเป็นหัด ควรปรึกษาแพทย์ เพื่อพิจารณาให้วิตามินเอเสริม ซึ่งจะช่วยลดความพิการและการเสียชีวิตลงได้");
        if (num6.equals("111")) {
            txtCmain6.setTextSize(15);
            imagesA6.setBackgroundResource(R.drawable.dow);
            txtCmain6.setText("");
            num6 = "1";
        }
    }
    private void Sick_sick5_7() {
        num7 = num7+"1";
        imagesA7.setBackgroundResource(R.drawable.up);
        txtCmain7.setTextSize(20);
        txtCmain7.setText("      \tโรคนี้เป็นแล้วทำให้ตาบอดได้ แต่เป็นโรคที่สามารถป้องกันได้ด้วยการกินอาหารที่มีวิตามินเอสูง เช่น เนื้อ ตับ ไข่ นม ฟักทอง มะเขือเทศ มะละกอสุก ผักใบเขียว (ผักบุ้ง ใบตําลึง ใบมันสําปะหลัง) พริกที่เผ็ดๆ จึงควรแนะนำให้เด็กๆ กินอาหารเหล่านี้ให้มาก เป็นประจำ");
        if (num7.equals("111")) {
            txtCmain7.setTextSize(15);
            imagesA7.setBackgroundResource(R.drawable.dow);
            txtCmain7.setText("");
            num7 = "1";
        }
    }

    private void Sick_main_6() {
        // txtAmain.setText("ไข้หวัด");


        txtBmain1.setText("เนื้อหา");
        txtBmain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_1();
            }
        });

        txtBmain2.setText("อาการ");
        txtBmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_2();
            }
        });

        txtBmain3.setText("สิ่งตรวจพบ");
        txtBmain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_3();
            }
        });

        txtBmain4.setText("สาเหตุ");
        txtBmain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_4();
            }
        });

        txtBmain5.setText("ภาวะแทรกซ้อน");
        txtBmain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_5();
            }
        });

        txtBmain6.setText("การรักษา");
        txtBmain6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_6();
            }
        });

        txtBmain7.setText("การป้องกัน");
        txtBmain7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_7();
            }
        });

        txtBmain8.setText("ข้อแนะนำ");
        txtBmain8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_8();
            }
        });



        imagesA1.setBackgroundResource(R.drawable.dow);
        imagesA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_1();
            }

        });

        imagesA2.setBackgroundResource(R.drawable.dow);
        imagesA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_2();
            }

        });

        imagesA3.setBackgroundResource(R.drawable.dow);
        imagesA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_3();
            }

        });

        imagesA4.setBackgroundResource(R.drawable.dow);
        imagesA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_4();
            }

        });

        imagesA5.setBackgroundResource(R.drawable.dow);
        imagesA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_5();
            }

        });

        imagesA6.setBackgroundResource(R.drawable.dow);
        imagesA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_6();
            }

        });

        imagesA7.setBackgroundResource(R.drawable.dow);
        imagesA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_7();
            }

        });

        imagesA8.setBackgroundResource(R.drawable.dow);
        imagesA8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_8();
            }

        });


        txtcolked1.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked2.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked3.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked4.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked5.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked6.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked7.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked8.setBackgroundColor(getResources().getColor(R.color.colorked));

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_1();
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_2();
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_3();
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_4();
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_5();
            }
        });
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_6();
            }
        });
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_7();
            }
        });
        linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_8();
            }
        });


    }
    private void Sick_sick6_1() {
        num1 = num1+"1";
        imagesA1.setBackgroundResource(R.drawable.up);
        txtCmain1.setTextSize(20);
        txtCmain1.setText("      \tกระเพาะปัสสาวะอักเสบ เป็นโรคที่พบได้บ่อย พบในผู้หญิงมากกว่าผู้ชายหลายเท่า เนื่องจากท่อปัสสาวะ ของผู้หญิงสั้น และอยู่ใกล้ทวารหนักซึ่งเป็นแหล่งที่มีเชื้อโรคมาก เชื้อโรคจากบริเวณดังกล่าวจึงเข้าทางท่อ ปัสสาวะของผู้หญิงได้ง่ายกว่าผู้ชาย\n" +
                "      \tผู้หญิงแทบทุกตนมีโอกาสเป็นโรคนี้ตั้งแต่วัยเด็ก จนถึงวัยสูงอายุ พบมากในผู้หญิงที่ตั้งครรภ์ (โดยเฉพาะ อย่างยิ่งในช่วง 2-3 เดือนแรกของการตั้งครรภ์) หรือผู้หญิงที่ชอบอั้นปัสสาวะนานๆ\n" +
                "      \tผู้ชายมีโอกาสเป็นโรคนี้น้อยมาก ถ้าพบมักมีความผิดปกติอย่างอื่นร่วมด้วย เช่น ต่อมลูกหมากโต เนื้องอกกระเพาะปัสสาวะ ก้อนเนื้องอกในช่องท้อง มีความผิดปกติทางโครงสร้างของทางเดินปัสสาวะ\n");
        if (num1.equals("111")) {
            txtCmain1.setTextSize(15);
            imagesA1.setBackgroundResource(R.drawable.dow);
            txtCmain1.setText("");
            num1 = "1";
        }
    }
    private void Sick_sick6_2() {
        num2 = num2+"1";

        imagesA2.setBackgroundResource(R.drawable.up);
        txtCmain2.setTextSize(20);
        txtCmain2.setText("      \tปัสสาวะกะปริดกะปรอย (ออกทีละน้อยแต่บ่อย ครั้ง) รู้สึกปวดขัดหรือแสบร้อนเวลาถ่ายปัสสาวะ อาจมี อาการปวดที่ท้องน้อยร่วมด้วย ปัสสาวะอาจมีกลิ่นเหม็น สีมักจะใส แต่บางรายอาจขุ่นหรือมีเลือดปน\n" +
                "      \tอาการอาจเกิดขึ้นหลังอั้นปัสสาวะนานๆ หรือหลังร่วมเพศ\n" +
                "      \tในเด็กเล็กอาจมีอาการปัสสาวะรดที่นอน อาจมีไข้ เบื่ออาหาร และอาเจียน\n");
        if (num2.equals("111")) {
            txtCmain2.setTextSize(15);
            imagesA2.setBackgroundResource(R.drawable.dow);
            txtCmain2.setText("");
            num2 = "1";
        }
    }
    private void Sick_sick6_3() {
        num3 = num3+"1";
        imagesA3.setBackgroundResource(R.drawable.up);
        txtCmain3.setTextSize(20);
        txtCmain3.setText("      \tมักตรวจไม่พบสิ่งผิดปกติชัดเจน บางรายอาจมีอาการกดเจ็บเล็กน้อยตรงกลางท้องน้อย");

        if (num3.equals("111")) {
            txtCmain3.setText("");

            txtCmain3.setTextSize(15);
            imagesA3.setBackgroundResource(R.drawable.dow);
            num3 = "1";
        }
    }
    private void Sick_sick6_4() {
        num4 = num4+"1";
        imagesA4.setBackgroundResource(R.drawable.up);
        txtCmain4.setTextSize(20);
        txtCmain4.setText("      \tส่วนใหญ่เกิดจากการติดเชื้อแบคทีเรียกลุ่มแกรมลบ (ที่พบในลำไส้ของคนเรา) เช่น อีโคไล เคล็บซิลลา\n" +
                "      \tโตโมแนส เอนเทอโรแบทเตอร์ (enterobacter) เป็นต้น เชื้อโรคเหล่านี้มีมากบริเวณทวารหนัก แล้วปนเปื้อนผ่าน เข้าท่อปัสสาวะเข้ามาในกระเพาะปัสสาวะ\n" +
                "      \tอาจพบเป็นภาวะแทรกซ้อนของผู้ป่วยเบาหวาน นิ่วกระเพาะปัสสาวะ ผู้ป่วยที่ถ่ายปัสสาวะไม่ได้เนื่องจาก เป็นอัมพาต หรือพบภายหลังการสวนปัสสาวะ ภาวะอุดกั้นของทางเดินปัสสาวะ เช่น ต่อมลูกหมากโต มะเร็ง ต่อมลูกหมาก เนื้องอกกระเพาะปัสสาวะ เนื้องอกมดลูกก้อนเนื้องอกในช่องท้อง ภาวะตั้งครรภ์ เป็นต้น\n" +
                "      \tผู้หญิงที่แต่งงานใหม่หรือหลังร่วมเพศ อาจมีอาการขัดเบาแบบกระเพาะปัสสาวะอักเสบ แพทย์เรียกว่า โรคกระเพาะปัสสาวะอักเสบจากฮันนีมูน (honeymoon's cystitis) สาเหตุเกิดจากการฟรกช้ำจากการร่วมเพศ แล้ว ทำให้มีอาการอักเสบของท่อปัสสาวะ\n");
        imagesB4.setBackgroundResource(R.drawable.a6_4);
        if (num4.equals("111")) {
            txtCmain4.setTextSize(15);
            imagesA4.setBackgroundResource(R.drawable.dow);
            txtCmain4.setText("");
            imagesB4.setBackgroundResource(0);
            num4 = "1";
        }
    }
    private void Sick_sick6_5() {
        num5 = num5+"1";
        imagesA5.setBackgroundResource(R.drawable.up);
        txtCmain5.setTextSize(20);
        txtCmain5.setText("      \tส่วนมากมักจะไม่มีภาวะแทรกซ้อนร้ายแรง แต่บางรายอาจเป็น ๆ หาย ๆ เรื้อรัง ซึ่งถ้าไม่ได้รับการรักษา เชื้อโรคอาจลุกลามขึ้นไปที่ไต ทำให้กลายเป็นกรวยไตอักเสบได้\n" +
                "      \tในผู้ชาย เสื้ออาจลุกลามเข้าไปทำให้ต่อมลูกหมากอักเสบ\n");

        if (num5.equals("111")) {
            txtCmain5.setTextSize(15);
            imagesA5.setBackgroundResource(R.drawable.dow);
            txtCmain5.setText("");

            num5 = "1";
        }
    }
    private void Sick_sick6_6() {
        num6 = num6+"1";

        imagesA6.setBackgroundResource(R.drawable.up);
        txtCmain6.setTextSize(20);
        txtCmain6.setText(
                "     \t1. ขณะที่มีอาการ ให้ดื่มน้ำมากๆ ถ้าปวดมากให้ ยาแก้ปวด และให้ยาปฏิชีวนะ เช่น โคไตรม็อกซา- โซล 2 เม็ด วันละ 2 ครั้ง อะม็อกซีซิลลิน 500 มก. ทุก 8 ชั่วโมง โอฟล็อกซาซิน 200 มก. วันละ 2 ครั้ง หรือไซโพรฟล็อกซาซิน 250 มก. วันละ 2 ครั้ง นาน 3 วัน\n" +
                        "     \t2. ถ้าไม่ดีขึ้นหรือเป็นมากกว่า 2-3 ครั้ง หรือ พบโรคนี้ในผู้ชาย ควรส่งโรงพยาบาลเพื่อตรวจหาสาเหตุ โดยการตรวจปัสสาวะ (พบเม็ดเลือดขาวจำนวนมาก) นำปัสสาวะไปเพาะหาเชื้อ เอกซเรย์ และถ้าจำเป็นอาจต้อง ใช้กล้องส่องตรวจกระเพาะปัสสาวะ (cystoscopy) แล้วให้การรักษาตามสาเหตุที่พบ\n");
        if (num6.equals("111")) {
            txtCmain6.setTextSize(15);
            imagesA6.setBackgroundResource(R.drawable.dow);
            txtCmain6.setText("");
            num6 = "1";
        }
    }
    private void Sick_sick6_7() {
        num7 = num7+"1";
        imagesA7.setBackgroundResource(R.drawable.up);
        txtCmain7.setTextSize(20);
        txtCmain7.setText("      \tผู้ที่เคยเป็นโรคนี้ เมื่อรักษาหายแล้วควรป้องกัน ไม่ให้เป็นช้ำโดย\n" +
                "      \t1. พยายามดื่มน้ำมากๆ และอย่ากลั้นปัสสาวะ ควรฝึกถ่ายปัสสาวะในห้องน้ำนอกบ้าน หรือระหว่างเดินทางได้ทุกที่ การอั้นปัสสาวะทำให้เชื้อโรคอยู่ในกระเพาะปัสสาวะได้นานจนสามารถเจริญแพร่พันธุ์ ประกอบกับในภาวะที่กระเพาะปัสสาวะยืดตัว ความสามารถในการขจัดเชื้อโรคของเยื่อบุผิวกระเพาะปัสสาวะลดน้อยลง จึงทำให้เกิดอาการอักเสบของกระเพาะปัสสาวะได้ง่ายขึ้น\n" +
                "      \t2. หลังถ่ายอุจจาระ ควรใช้กระดาษชำระเช็ดทำความสะอาดจากข้างหน้าไปข้างหลัง เพื่อป้องกันมิให้นำ\n" +
                "      \tเชื้อโรคจากบริเวณทวารหนักเข้าสู่ท่อปัสสาวะ\n" +
                "      \t3. สำหรับอาการขัดเบาหลังร่วมเพศ (โรคกระเพาะ ปัสสาวะจากฮันนีมูน) อาจป้องกันได้โดยดื่มน้ำ 1 แก้ว ก่อนร่วมเพศ ควรใส่ครีมหล่อลื่นช่องคลอด และถ่ายปัสสาวะทันทีหลังร่วมเพศ\n");
        if (num7.equals("111")) {
            txtCmain7.setTextSize(15);
            imagesA7.setBackgroundResource(R.drawable.dow);
            txtCmain7.setText("");
            num7 = "1";
        }
    }
    private void Sick_sick6_8() {
        num8 = num8+"1";
        imagesA8.setBackgroundResource(R.drawable.up);
        txtCmain8.setTextSize(20);
        txtCmain8.setText("      \t1. กระเพาะปัสสาวะอักเสบ พบเป็นสาเหตุอันดับแรกๆ ของอาการขัดเบา แต่อย่างไรก็ตาม ยังมีโรคอีก หลายชนิดที่อาจมีอาการแสดงคล้ายโรคนี้ได้อีก\n" +
                "      \t2. ในเด็กเล็กที่มีอาการปัสสาวะรดที่นอนบ่อย หรือมีไข้ และอาเจียนโดยไม่ทราบสาเหตุ ควรนึกถึงโรคนี้ไว้เสมอ การตรวจปัสสาวะจะช่วยให้วินิจฉัยโรค ได้แน่ชัด\n" +
                "      \t3. ผู้ป่วยที่เป็นโรคนี้ ควรดื่มน้ำมากๆ (ประมาณ วันละ 3-4 ลิตร) เพื่อช่วยขับเชื้อโรคออก และช่วยลด อาการปวดแสบปวดร้อนเวลาปัสสาวะ\n");
        if (num8.equals("111")) {
            txtCmain8.setTextSize(15);
            imagesA8.setBackgroundResource(R.drawable.dow);
            txtCmain8.setText("");
            num8 = "1";
        }
    }



    private void Sick_main_7() {
        // txtAmain.setText("ไข้หวัด");


        txtBmain1.setText("เนื้อหา");
        txtBmain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_1();
            }
        });

        txtBmain2.setText("สาเหตุ");
        txtBmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_2();
            }
        });

        txtBmain3.setText("อาการ");
        txtBmain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_3();
            }
        });

        txtBmain4.setText("ภาวะแทรกซ้อน");
        txtBmain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_4();
            }
        });

        txtBmain5.setText("การรักษา");
        txtBmain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_5();
            }
        });

        txtBmain6.setText("ข้อแนะนำ");
        txtBmain6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_6();
            }
        });


        imagesA1.setBackgroundResource(R.drawable.dow);
        imagesA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_1();
            }

        });

        imagesA2.setBackgroundResource(R.drawable.dow);
        imagesA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_2();
            }

        });

        imagesA3.setBackgroundResource(R.drawable.dow);
        imagesA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_3();
            }

        });

        imagesA4.setBackgroundResource(R.drawable.dow);
        imagesA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_4();
            }

        });

        imagesA5.setBackgroundResource(R.drawable.dow);
        imagesA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_5();
            }

        });

        imagesA6.setBackgroundResource(R.drawable.dow);
        imagesA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick6_7();
            }

        });


        txtcolked1.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked2.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked3.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked4.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked5.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked6.setBackgroundColor(getResources().getColor(R.color.colorked));

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_1();
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_2();
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_3();
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_4();
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_5();
            }
        });
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick7_6();
            }
        });

    }
    private void Sick_sick7_1() {
        num1 = num1+"1";
        imagesA1.setBackgroundResource(R.drawable.up);
        txtCmain1.setTextSize(20);
        txtCmain1.setText("      \tกระเพาะอาหารอักเสบ (กระเพาะอักเสบ ก็เรียก) หมายถึงการอักเสบของเยื่อบุกระเพาะอาหาร ในปัจจุบันได้แบ่งกระเพาะอาหารอักเสบ เป็นชนิดเยื่อบุกร่อน (erosive gastritis) ชนิดเรื้อรัง(chronic/nonerosive gastritis) และชนิดจำเพาะ (specific types of gastritis) โรคนี้พบได้ในคนทั่วไป พบมากในผู้ที่กินยาแอสไพริน ยาต้านอักเสบที่ไม่ใช่สตีรอยด์ (ยาแก้ปวดข้อ) ดื่มแอลกอฮอล์");
        if (num1.equals("111")) {
            txtCmain1.setTextSize(15);
            imagesA1.setBackgroundResource(R.drawable.dow);
            txtCmain1.setText("");
            num1 = "1";
        }
    }
    private void Sick_sick7_2() {
        num2 = num2+"1";

        imagesA2.setBackgroundResource(R.drawable.up);
        txtCmain2.setTextSize(20);
        txtCmain2.setText("      \t1. กระเพาะอาหารอักเสบชนิดเยื่อบุกร่อน เยื่อบุกระเพาะอาหารจะมีลักษณะแดงและกร่อน เป็นแผลตื้น ๆ หลายแห่ง อาจมีภาวะเลือดออก จึงมีอีกชื่อหนึ่งว่า กระเพาะอาหารอักเสบชนิดเลือดออก (hemorrhagic gastritis) มักมีสาเหตุจาก\n" +
                "      \t • ยาโดยเฉพาะอย่างยิ่งแอสไพรินและยาต้านอักเสบที่ไม่ใช่สตีรอยด์\n" +
                "      \t • แอลกอฮอล์\n" +
                "      \t • ภาวะร่างกายเครียดเฉียบพลัน เช่น ไฟไหม้ น้ำร้อนลวกรุนแรง บาดเจ็บรุนแรง การผ่าตัด ภาวะช็อก ภาวะไตวาย ภาวะตับวาย เป็นต้น\n" +
                "      \t • พบร่วมกับโรคตับแข็งที่มีภาวะความ ดันในหลอดเลือดดำตับสูง (portal hypertension)\n" +
                "      \t2. กระเพาะอาหารอักเสบชนิดเรื้อรัง ส่วนใหญ่จะไม่มีอาการวินิจฉัยจากการตรวจชิ้นเนื้อ แบ่งออกเป็น\n" +
                "      \t • ชนิดเอ จะมีความผิดปกติตรงส่วนต้น (fundus) ของกระเพาะอาหาร มีสาเหตุจากปฏิกิริยาภูมิต้าน ตนเอง (autoimmune) มักมีภาวะโลหิตจางจากภาวะขาดวิตามินบี 12 (pernicious anemia) ร่วมด้วย เพราะ ไม่สามารถดูดซึมวิตามินชนิดนี้ และเพิ่มความเสี่ยงต่อการเกิดมะเร็งกระเพาะอาหาร\n" +
                "      \t • ชนิดบี จะมีความผิดปกติตรงส่วนปลาย (antrum) ของกระเพาะอาหาร แต่ก็อาจลุกลามไปทั่ว กระเพาะอาหาร มีสาเหตุจากการติดเชื้อแบคทีเรียแกรมลบชื่อ เฮลิโคแบกเตอร์ไพโลไร หรือ “เอชไพโลไร” (Helicobacter pylori H. pylori) เชื้อนี้แต่เดิมเรียกว่า แคมโพโลแบกเตอร์ ไพโลไร (Campylobacter pylor) เชื้อนี้สามารถติดต่อโดยการกินอาหารหรือน้ำดื่มที่ปน เปื้อนอุจจาระของผู้ติดเชื้อ แล้วเข้าไปฝังตัวอยู่ใต้เยื่อบุผิวกระเพาะอาหาร กระเพาะอาหารอักเสบเรื้อรังจากเชื้อ ชนิดนี้มีความสัมพันธ์กับการเกิดแผลในกระเพาะอาหาร และลำไส้เล็กส่วนต้น (แผลเพ็ปติก) และเพิ่มความเสี่ยงต่อการเกิดมะเร็งกระเพาะอาหาร\n" +
                "      \t3. กระเพาะอาหารอักเสบชนิดจำเพาะ พบร่วมกับโรคต่างๆ เช่น การติดเชื้อราหรือเชื้อไวรัสในผู้ป่วย เอดส์ การติดเชื้อวัณโรค ซิฟิลิส พยาธิ การถูกสารเคมี เป็นต้น\n");
        if (num2.equals("111")) {
            txtCmain2.setTextSize(15);
            imagesA2.setBackgroundResource(R.drawable.dow);
            txtCmain2.setText("");
            num2 = "1";
        }
    }
    private void Sick_sick7_3() {
        num3 = num3+"1";
        imagesA3.setBackgroundResource(R.drawable.up);
        txtCmain3.setTextSize(20);
        txtCmain3.setText("      \tจะมีอาการปวดจุกแน่นตรงใต้ลิ้นปี่ คลื่นไส้ อาเจียน เบื่ออาหาร บางรายอาจมีอาการท้องเดินร่วมด้วย\n" +
                "      \tในรายที่เป็นชนิดเยื่อบุกร่อน อาจมีอาการอาเจียน เป็นเลือด หรือถ่ายดำ โดยจะมีอาการปวดท้องร่วมด้วย หรือไม่ก็ได้ มักมีประวัติการกินยาหรือดื่มแอลกอฮอล์ หรือมีภาวะเครียดก่อนมีเลือดออก\n" +
                "      \tบางรายอาจไม่มีอาการแสดงจนกว่าจะเกิดภาวะแทรกซ้อน เช่น เลือดออก โลหิตจาง แล้วจึงตรวจพบ จากการใช้กล้องส่องตรวจกระเพาะอาหาร (gastro scopy) \n");

        if (num3.equals("111")) {
            txtCmain3.setText("");

            txtCmain3.setTextSize(15);
            imagesA3.setBackgroundResource(R.drawable.dow);
            num3 = "1";
        }
    }
    private void Sick_sick7_4() {
        num4 = num4+"1";
        imagesA4.setBackgroundResource(R.drawable.up);
        txtCmain4.setTextSize(20);
        txtCmain4.setText("      \tประมาณร้อยละ 70 ของผู้ป่วยมีภาวะเลือดออกร่วมด้วย เมื่องดยาและเครื่องดื่มแอลกอฮอล์แล้วเลือดมักหยุดออกได้เอง มีเพียงส่วนน้อยที่อาจมีเลือดออก\n" +
                "      \tในรายที่เป็นเรื้อรังอาจเป็นแผลเพ็ปติก หรือมะเร็งกระเพาะอาหาร\n");
        if (num4.equals("111")) {
            txtCmain4.setTextSize(15);
            imagesA4.setBackgroundResource(R.drawable.dow);
            txtCmain4.setText("");
            num4 = "1";
        }
    }
    private void Sick_sick7_5() {
        num5 = num5+"1";
        imagesA5.setBackgroundResource(R.drawable.up);
        txtCmain5.setTextSize(20);
        txtCmain5.setText("      \t1. ถ้ามีอาการแสบท้องหรือปวดท้องตอนดึก หรือ จุกเสียดแน่นท้องหลังอาหารหรือมีประวัติกินยาแอสไพริน หรือยาต้านอักเสบที่ไม่ใช่สตีรอยต์ ให้ยาต้านกรดร่วมกับยาลดการสร้างกรด เช่นรานที่ดินนาน 2 สัปดาห์ ถ้าดีขึ้นกินต่อจนครบ 8 สัปดาห์\n" +
                "      \t2. ถ้ามีอาการอาเจียนเป็นเลือดหรือถ่ายดำ ควร ส่งโรงพยาบาลภายใน 24 ชั่วโมง (หากมีอาการหน้ามืด เป็นลม หรือช็อกควรส่งทันที) ถ้าเสียเลือดมากต้องรับไว้รักษาในโรงพยาบาล อาจต้องให้เลือดและตรวจหาสาเหตุโดยการใช้กล้องส่องตรวจกระเพาะลำไส้ (endoscopy) หรือเอกซเรย์กระเพาะลำไส้โดยการกลืนแป้งแบเรียม แล้วให้การรักษาตามสาเหตุที่พบ เช่น\n" +
                "      \tถ้าพบว่าเป็นแผลเพ็ปติกก็ให้การรักษาแบบ แผลเพ็ปติก\n" +
                "      \tถ้าเป็นกระเพาะอาหารอักเสบก็ให้ยาลดการ สร้างกรด เช่น รานิทิดีน ร่วมกับยาปกป้องเยื่อบุ กระเพาะอาหาร เช่น ซูคราลเฟต (sucralfate) 1 กรัม วันละ 4 ครั้ง นาน 2-4 สัปดาห์\n" +
                "      \tถ้ามีภาวะซีดให้ยาบํารุงโลหิต ต้องบอกผู้ป่วยว่ายานี้กินแล้วอาจถ่ายอุจจาระสีดำ ซึ่งเป็นสีของยา\n" +
                "      \tผู้ป่วยต้องงดดื่มแอลกอฮอล์ และยาที่อาจทำให้ กระเพาะอาหารอักเสบ\n" +
                "      \t3. ในรายที่กินยาแล้วไม่ดีขึ้น หรือเป็นเรื้อรัง หรือ น้ำหนักลด ควรแนะนำไปโรงพยาบาล เพื่อตรวจหาสาเหตุเพิ่มเติม โดยการใช้กล้องส่องตรวจกระเพาะลำไส้ ตรวจชิ้นเนื้อกระเพาะอาหารแล้วให้การรักษาตามสาเหตุที่พบ\n" +
                "      \tในกรณีที่เป็นกระเพาะอาหารอักเสบเรื้อรังจาก เชื้อเฮลิโคแบกเตอร์ไพโลไร (H.pylori) จะให้ยาปฏิชีวนะ กำจัดเชื้อเมื่อพบว่ามีแผลที่กระเพาะอาหารหรือลำไส้เล็กส่วนต้นร่วมด้วย\n");

        if (num5.equals("111")) {
            txtCmain5.setTextSize(15);
            imagesA5.setBackgroundResource(R.drawable.dow);
            txtCmain5.setText("");

            num5 = "1";
        }
    }
    private void Sick_sick7_6() {
        num6 = num6+"1";

        imagesA6.setBackgroundResource(R.drawable.up);
        txtCmain6.setTextSize(20);
        txtCmain6.setText(
                "     \t1. ผู้ป่วยควรงดบุหรี่ แอลกอฮอล์ ชา กาแฟ หรือ เครื่องดื่มกาเฟอีน น้ำอัดลม และหลีกเลี่ยงการใช้ยา แอสไพริน ยาต้านอักเสบที่ไม่ใช่สตีรอยด์ อาหารรสเผ็ดจัด เปรี้ยวจัด\n" +
                "     \t2. สำหรับผู้ที่จำเป็นต้องใช้แอสไพริน และยาต้าน อักเสบที่ไม่ใช่สตีรอยด์ ถ้ามีภาวะเสี่ยงต่อการเกิดแผล ในกระเพาะอาหารและลำไส้ เช่น ผู้สูงอายุ ผู้ที่ต้องใช้ ยานี้ในขนาดสูงหรือนานๆ หรือใช้ร่วมกับยาสตีรอยด์ ผู้ที่เคยเป็นแผลเพ็ปติกมาก่อนอาจต้องให้ยาป้องกัน\n" +
                "     \t3. ควรแนะนำผู้ป่วยที่กินยาแอสไพริน หรือยากลุ่มต้านการอักเสบที่ไม่ใช่สตีรอยด์ทุกราย ให้สังเกตสีของอุจจาระเป็นประจำ ถ้าเป็นสีดำต้องรีบกลับไปพบแพทย์หรือโรงพยาบาลโดยเร็ว ผู้ป่วยจำนวนมากไม่ทราบ ว่าอาการถ่ายดำเป็นอาการเลือดออกในกระเพาะลำไส้ มักปล่อยให้เลือดออกมากจนมีอาการอ่อนเพลีย ซีด เป็น ลม จึงค่อยไปโรงพยาบาล ซึ่งมักจะต้องให้เลือดและเสี่ยงต่อภาวะแทรกซ้อนร้ายแรง\n");
        if (num6.equals("111")) {
            txtCmain6.setTextSize(15);
            imagesA6.setBackgroundResource(R.drawable.dow);
            txtCmain6.setText("");
            num6 = "1";
        }
    }

    private void Sick_main_8() {
        // txtAmain.setText("ไข้หวัด");


        txtBmain1.setText("เนื้อหา");
        txtBmain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick8_1();
            }
        });

        txtBmain2.setText("อาการ");
        txtBmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick8_2();
            }
        });

        txtBmain3.setText("สื่งที่ตรวจพบ");
        txtBmain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick8_3();
            }
        });

        txtBmain4.setText("การรักษา");
        txtBmain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick8_4();
            }
        });

        txtBmain5.setText("การป้องกัน");
        txtBmain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick8_5();
            }
        });


        imagesA1.setBackgroundResource(R.drawable.dow);
        imagesA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick8_1();
            }

        });

        imagesA2.setBackgroundResource(R.drawable.dow);
        imagesA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick8_2();
            }

        });

        imagesA3.setBackgroundResource(R.drawable.dow);
        imagesA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick8_3();
            }

        });

        imagesA4.setBackgroundResource(R.drawable.dow);
        imagesA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick8_4();
            }

        });

        imagesA5.setBackgroundResource(R.drawable.dow);
        imagesA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick8_5();
            }

        });


        txtcolked1.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked2.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked3.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked4.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked5.setBackgroundColor(getResources().getColor(R.color.colorked));

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick8_1();
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick8_2();
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick8_3();
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick8_4();
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick8_5();
            }
        });

    }
    private void Sick_sick8_1() {
        num1 = num1+"1";
        imagesA1.setBackgroundResource(R.drawable.up);
        txtCmain1.setTextSize(20);
        txtCmain1.setText("      \tลักปิดลักเปิด เกิดจากการขาดวิตามินซี พบได้ ในเด็กอายุระหว่าง 6-18 เดือน ผู้ป่วยมักมีประวัติกินนมข้นหวาน หรือน้ำข้าวใส่น้ำตาล และไม่ได้รับอาหาร เสริมวิตามินซี (เช่น น้ำส้มคั้น) เด็กมักมีการขาดสาร อาหารอื่นๆร่วมด้วย เช่น โปรตีน เหล็ก วิตามินบี 2 เป็นต้น อาการมักจะเกิดขึ้นหลังเป็นโรคติดเชื้อ หรือ ท้องเดิน ทําให้มีการสูญเสียวิตามินซี\n" +
                "ส่วนในเด็กโตและผู้ใหญ่ จะพบเป็นโรคนี้ได้น้อย\n");
        if (num1.equals("111")) {
            txtCmain1.setTextSize(15);
            imagesA1.setBackgroundResource(R.drawable.dow);
            txtCmain1.setText("");
            num1 = "1";
        }
    }
    private void Sick_sick8_2() {
        num2 = num2+"1";

        imagesA2.setBackgroundResource(R.drawable.up);
        txtCmain2.setTextSize(20);
        txtCmain2.setText("      \tเด็กจะมีอาการกระสับกระส่าย ร้องกวนตลอดเวลา เบื่ออาหาร น้ำหนักไม่ขึ้น ต่อมาจะพบว่ามีอาการ ปวดตามแขน ขา เนื่องจากมีเลือดออกใต้เยื่อหุ้มกระดูก โดยเฉพาะตรงบริเวณเหนือข้อเข่าและข้อเท้า เด็กจะนอนแบะขาอยู่ในท่าคล้ายกบ\n" +
                "      \tเด็กที่มีฟันขึ้นแล้วจะมีอาการเหงือกบวม และมี เลือดออกตามไรฟัน อาจมีอาการเลือดออกได้ง่าย เช่น มีเลือดกําเดาไหล มีจุดแดงพรายย้ำขึ้นตามตัว ถ้าเป็นแผลมักจะหายช้า ในรายที่เป็นรุนแรงอาจมีเลือดออกในสมองเป็นอันตรายถึงตายได้\n");
        if (num2.equals("111")) {
            txtCmain2.setTextSize(15);
            imagesA2.setBackgroundResource(R.drawable.dow);
            txtCmain2.setText("");
            num2 = "1";
        }
    }
    private void Sick_sick8_3() {
        num3 = num3+"1";
        imagesA3.setBackgroundResource(R.drawable.up);
        txtCmain3.setTextSize(20);
        txtCmain3.setText("      \tอาจตรวจพบอาการเหงือกบวม เลือดออกตาม ไรฟัน เลือดกำเดาไหล จุดแดงจำเขียวตามผิวหนัง จุดเลือดออกที่ใต้เล็บ ซีด (เนื่องจากขาดธาตุเหล็ก)\n" +
                "      \tตรงรอยต่อระหว่างกระดูกอ่อนและซีโครง (costochondral junction) อาจมีลักษณะเป็นตุ่ม ๆ คล้าย ลูกประคำ\n");

        if (num3.equals("111")) {
            txtCmain3.setText("");

            txtCmain3.setTextSize(15);
            imagesA3.setBackgroundResource(R.drawable.dow);
            num3 = "1";
        }
    }
    private void Sick_sick8_4() {
        num4 = num4+"1";
        imagesA4.setBackgroundResource(R.drawable.up);
        txtCmain4.setTextSize(20);
        txtCmain4.setText("      \tให้กินวิตามินซีขนาด 100 มก. วันละ 3 ครั้ง ถ้า กินไม่ได้ ให้ฉีดเข้าหลอดเลือดดำ อาการจะดีขึ้นภายใน 1 สัปดาห์ ถ้าไม่ดีขึ้นควรส่งโรงพยาบาล อาจต้องตรวจเลือด เอกซเรย์ และตรวจพิเศษอื่น ๆ ถ้าจำเป็น ถ้าเป็นโรคนี้จริงก็ให้การรักษาด้วยวิตามินซี");
        if (num4.equals("111")) {
            txtCmain4.setTextSize(15);
            imagesA4.setBackgroundResource(R.drawable.dow);
            txtCmain4.setText("");
            num4 = "1";
        }
    }
    private void Sick_sick8_5() {
        num5 = num5+"1";
        imagesA5.setBackgroundResource(R.drawable.up);
        txtCmain5.setTextSize(20);
        txtCmain5.setText("      \tโรคนี้สามารถป้องกันได้โดยให้อาหารเสริมแก่ทารก เช่น น้ำส้ม มะเขือเทศ ผักใบเขียว เป็นต้น หรือถ้า จำเป็นอาจให้วิตามินซี หรือวิตามินรวม");

        if (num5.equals("111")) {
            txtCmain5.setTextSize(15);
            imagesA5.setBackgroundResource(R.drawable.dow);
            txtCmain5.setText("");

            num5 = "1";
        }
    }



    private void Sick_main_9() {
        // txtAmain.setText("ไข้หวัด");


        txtBmain1.setText("เนื้อหา");
        txtBmain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_1();
            }
        });

        txtBmain2.setText("สาเหตุ");
        txtBmain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_2();
            }
        });

        txtBmain3.setText("อาการ");
        txtBmain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_3();
            }
        });

        txtBmain4.setText("สิ่งตรวจพบ");
        txtBmain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_4();
            }
        });

        txtBmain5.setText("ภาวะแทรกซ้อน");
        txtBmain5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_5();
            }
        });

        txtBmain6.setText("การรักษา");
        txtBmain6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_6();
            }
        });

        txtBmain7.setText("ข้อแนะนำ");
        txtBmain7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_7();
            }
        });

        txtBmain8.setText("การป้องกัน");
        txtBmain8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_8();
            }
        });


        imagesA1.setBackgroundResource(R.drawable.dow);
        imagesA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_1();
            }

        });

        imagesA2.setBackgroundResource(R.drawable.dow);
        imagesA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_2();
            }

        });

        imagesA3.setBackgroundResource(R.drawable.dow);
        imagesA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_3();
            }

        });

        imagesA4.setBackgroundResource(R.drawable.dow);
        imagesA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_4();
            }

        });

        imagesA5.setBackgroundResource(R.drawable.dow);
        imagesA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_5();
            }

        });

        imagesA6.setBackgroundResource(R.drawable.dow);
        imagesA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_6();
            }

        });

        imagesA7.setBackgroundResource(R.drawable.dow);
        imagesA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_7();
            }

        });

        imagesA8.setBackgroundResource(R.drawable.dow);
        imagesA8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_8();
            }

        });


        txtcolked1.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked2.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked3.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked4.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked5.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked6.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked7.setBackgroundColor(getResources().getColor(R.color.colorked));
        txtcolked8.setBackgroundColor(getResources().getColor(R.color.colorked));

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_1();
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_2();
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_3();
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_4();
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_5();
            }
        });
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_6();
            }
        });
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_7();
            }
        });
        linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sick_sick9_8();
            }
        });


    }
    private void Sick_sick9_1() {
        num1 = num1+"1";
        imagesA1.setBackgroundResource(R.drawable.up);
        txtCmain1.setTextSize(20);
        txtCmain1.setText("      \tท้องเดิน (ท้องร่วง ท้องเสีย อุจจาระร่วง) หมายถึงภาวะที่ผู้ป่วยมีอาการถ่ายเป็นน้ำหรือถ่ายเหลวมากกว่า วันละ 3 ครั้ง หรือถ่ายเป็นมูกหรือมูกปนเลือดเพียงครั้งเดียว ในทารกที่กินนมมารดา ปกติอาจถ่ายอุจจาระเหลวๆ บ่อยครั้งได้ ไม่ถือว่าเป็นอาการของท้องเดิน แต่ถ้าถ่ายเป็นน้ำจำนวนมากและบ่อยครั้งกว่าที่เคยเป็นก็ถือว่าผิดปกติ\n" +
                "      \tท้องเดินเป็นอาการที่พบได้บ่อย และมีสาเหตุได้หลายประการ ส่วนใหญ่อาการจะไม่รุนแรงและมักหาย ได้เอง ส่วนน้อยอาจมีอาการรุนแรงทำให้มีภาวะขาดน้ำและเกลือแร่เป็นอันตรายถึงเสียชีวิตได้ โดยเฉพาะในเด็กเล็กและผู้สูงอายุ\n" +
                "      \tนอกจากอาการถ่ายเป็นน้ำ ถ่ายเหลว หรือถ่ายมี มูกเลือดปนแล้ว อาจมีอาการไข้ ปวดท้อง อาเจียนร่วม ด้วย ซึ่งสุดแล้วแต่สาเหตุที่เป็น\n");
        if (num1.equals("111")) {
            txtCmain1.setTextSize(15);
            imagesA1.setBackgroundResource(R.drawable.dow);
            txtCmain1.setText("");
            num1 = "1";
        }
    }
    private void Sick_sick9_2() {
        num2 = num2+"1";

        imagesA2.setBackgroundResource(R.drawable.up);
        txtCmain2.setTextSize(20);
        txtCmain2.setText("      \t1. ถ้าเป็นท้องเดินชนิดเฉียบพลัน อาจเกิดจาก\n" +
                "      \t ก. การติดเชื้อซึ่งพบได้บ่อยกว่าสาเหตุอื่น อาจ เกิดจากเชื้อไวรัส (เช่น ไวรัสโรตา ไวรัสโคโรนา ไวรัส อะดีโน) เชื้อแบคทีเรีย (เช่น ชิเกลลา ไทฟอยด์ อหิวาต์) โปรโตซัว (เช่น อะมีบา ไกอาร์เดีย มาลาเรีย) หนอน พยาธิ (เช่น พยาธิแส้ม้า ทรีคิเนลลาสไปราลิส)\n" +
                "      \t ข. สารพิษจากเชื้อโรค โดยการกินพิษของเชื้อ โรคที่ปะปนอยู่ในอาหาร ซึ่งมักจะพบว่า ในกลุ่มคนที่กิน อาหารด้วยกันมีอาการพร้อมกันหลายคน (ดู “โรคที่ 34 อาหารเป็นพิษ”)\n" +
                "      \t ค. สารเคมี เช่น ตะกั่ว สารหนูในเทรต ยาฆ่าแมลง เป็นต้น มักทำให้มีอาการอาเจียน ปวดท้องรุนแรง และชักร่วมด้วย\n" +
                "      \t ง. ยา เช่น ยาถ่าย ยาลดกรด ยาปฏิชีวนะ ยา รักษาโรคเกาต์ (เช่น คอลชิซิน) เป็นต้น\n" +
                "      \tในกรณีที่เกิดจากการใช้ยาปฏิชีวนะ สาเหตุที่ชักนำให้เกิดอาการท้องเดินคือยาปฏิชีวนะเข้าไปทำลายจุลินทรีย์ที่อยู่เป็นปกติวิสัยหรือประจำถิ่น (normal flora) บางชนิดในลำไส้ใหญ่ ทำให้เชื้อแบคทีเรียที่มีชื่อว่า Clostridium difficile ที่แฝงเร้นอยู่มีการเจริญเติบโต จนเกิดการอักเสบของสำไส้ใหญ่ ภาวะนี้พบบ่อยในผู้ที่ ใช้ยาคลินดาไมซิน (clindamycin) ลินโคไมซิน (lincomycin) กลุ่มเพนิซิลลิน  และเซฟาโลสปอริน นอกจากนี้ก็อาจพบในการใช้ยาอีริโทรไมซิน กลุ่มเตตราไซคลีน  กลุ่มซัลฟา และกลุ่มควิโนโลน อาการมักเกิดหลัง การใช้ยาประ มาณ 1-10 วัน (บางรายภายใน 6 สัปดาห์) ถ้าเป็นไม่รุนแรงจะมีอาการถ่ายเหลวบ่อย ในรายที่ เป็นรุนแรงจะมีอาการถ่ายเป็นมูกและมีเลือดออก มีไข้ ปวดท้อง เกิดภาวะขาดน้ำ ความดันต่ำ หรือลำไส้ใหญ่ทะลุ เป็นอันตรายร้ายแรงได้ เรียกภาวะรุนแรงนี้ว่า Pseudomembranous colitis\n" +
                "      \t จ. สัตว์พิษ (เช่น ปลาปักเป้า ปลาทะเล หอย ทะเล คางคก) พืชพิษ (เช่น เห็ดพิษ กลอย)\n" +
                "      \t2. ถ้าเป็นเรื้อรัง (ถ่ายนานเกิน 3 สัปดาห์ หรือ เป็นๆ หายๆ บ่อย) อาจเกิดจาก\n" +
                "      \t ก. โรคลำไส้แปรปรวน มักทำให้มีอาการ เป็นๆ หายๆ เป็นแรมเดือนแรมปี โดยที่ร่างกายแข็งแรง\n" +
                "      \t ข. การติดเชื้อ เช่น บิดอะมีบา ไกอาร์เดีย วัณโรคลำไส้ พยาธิแส้ม้า เอดส์ เป็นต้น\n" +
                "      \t ค. โรคต่อมไร้ท่อ เช่น เบาหวาน ภาวะ ต่อมไทรอยด์ทำงานเกิน\n" +
                "      \t ง. ภาวะพร่องแล็กเทสซึ่งเป็นเอนไซม์ ย่อยน้ำตาลแล็กโทสในนม จึงทำให้เกิดอาการท้องเดินหลังดื่มนม\n" +
                "      \t จ. การแพ้อาหาร เช่น นมวัว ไข่ ปลา กุ้ง หอย ปู ถั่วลิสง เป็นต้น ซึ่งพบได้ในคนทุกวัยโดยเฉพาะอย่างยิ่งในเด็กเล็ก\n" +
                "      \t ฉ. การดูดซึมผิดปกติ (malabsorption) เป็น ภาวะที่ลำไส้ไม่สามารถดูดซึมสารอาหารได้ตามปกติ อาจเกิดจากการขาดเอนไซม์ย่อยอาหาร หรือความผิดปกติของลำไส้เล็ก ซึ่งเป็นผลมาจากสาเหตุต่างๆ เช่น โรคตับอ่อนอักเสบเรื้อรัง มะเร็งตับอ่อน ภาวะทางเดิน น้ำดีอุดกั้น การผ่าตัดกระเพาะอาหารลำไส้เล็กหรือ ถุงน้ำดี การติดเชื้อของลำไส้ (ที่พบบ่อยคือ ท้องเดิน จากเชื้อไกอาร์เดีย) เป็นต้น ทำให้เกิดอาการท้องเดิน เรื้อรัง ถ่ายอุจจาระเหลวมีสีเหลืองอ่อน เป็นฟองลักษณะ เป็นมัน ลอยน้ำ และมีกลิ่นเหม็นจัด (เนื่องจากไขมัน ไม่ถูกดูดซึม) ผู้ป่วยมักมีอาการน้ำหนักลด และอาจมี อาการของการขาดสารอาหาร เช่น ซีด บวม เป็นต้น\n" +
                "      \t ช. เนื้องอกหรือมะเร็งของลำไส้หรือตับอ่อน\n" +
                "      \t ซ. ยา เช่น กินยาถ่าย หรือยาต้านกรดเป็นประจำก็ทำให้มีอาการท้องเดินเรื้อรังได้\n" +
                "      \t ณ. อื่นๆ เช่น ลำไส้ใหญ่อักเสบ (colitis) จาก การฝังแร่รักษามะเร็งปากมดลูก (ถ่ายเป็นมูกเลือดเรื้อรัง) ความเครียด การกระตุ้นหรือการไม่ย่อยของอาหาร (เช่น พริก กาแฟ แอลกอฮอล์ น้ำผลไม้)\n");
        imagesB2.setBackgroundResource(R.drawable.a9_2);
        if (num2.equals("111")) {
            txtCmain2.setTextSize(15);
            imagesA2.setBackgroundResource(R.drawable.dow);
            txtCmain2.setText("");
            imagesB2.setBackgroundResource(0);
            num2 = "1";
        }
    }
    private void Sick_sick9_3() {
        num3 = num3+"1";

        imagesA3.setBackgroundResource(R.drawable.up);
        txtCmain3.setTextSize(20);
        txtCmain3.setText("      \tขึ้นกับสาเหตุที่เป็น โดยทั่วไปจะมีอาการปวดท้อง ถ่ายเป็นน้ำหรือถ่ายเหลวบ่อยครั้ง บางรายอาจมีไข้ หรือคลื่นไส้ อาเจียนร่วมด้วย หรืออาจถ่ายเป็นมูก หรือมูกปนเลือด");

        if (num3.equals("111")) {
            txtCmain3.setTextSize(15);
            imagesA3.setBackgroundResource(R.drawable.dow);
            txtCmain3.setText("");

            num3 = "1";
        }
    }
    private void Sick_sick9_4() {
        num4 = num4+"1";
        imagesA4.setBackgroundResource(R.drawable.up);
        txtCmain4.setTextSize(20);
        txtCmain4.setText("      \tถ้าเป็นรุนแรงอาจมีภาวะขาดน้ำ บางรายอาจมีไข้ ");

        if (num4.equals("111")) {
            txtCmain4.setTextSize(15);
            imagesA4.setBackgroundResource(R.drawable.dow);
            txtCmain4.setText("");
            num4 = "1";
        }
    }
    private void Sick_sick9_5() {
        num5 = num5+"1";
        imagesA5.setBackgroundResource(R.drawable.up);
        txtCmain5.setTextSize(20);
        txtCmain5.setText("      \tในผู้ป่วยท้องเดินชนิดเฉียบพลันภาวะแทรกซ้อนที่สำคัญคือ ภาวะขาดน้ำและเกลือแร่ ซึ่งอาจทำให้เกิดภาวะช็อก ภาวะเลือดเป็นกรด ภาวะโพแทสเซียมในเลือดต่ำ ภาวะโซเดียมในเลือดต่ำ เป็นอันตรายถึงเสียชีวิตได้ ความรุนแรงของโรคขึ้นกับขนาดของภาวะขาด น้ำเป็นสำคัญ\n" +
                "      \tภาวะขาดน้ำ สามารถแบ่งออกเป็น 3 ขนาด ได้แก่\n" +
                "      \t1. ภาวะขาดน้ำเล็กน้อย (mild dehydration) น้ำหนักตัวลดประมาณร้อยละ 5 ผู้ป่วยเริ่มรู้สึกกระหายน้ำและอ่อนเพลียเล็กน้อย แต่อาการทั่วไปดี หน้าตาแจ่มใสเดินได้ชีพจรและความดันเลือดอยู่ในเกณฑ์ปกติ\n" +
                "      \t2. ภาวะขาดน้ำปานกลาง (moderate dehydration) น้ำหนักตัวลดประมาณร้อยละ 5-10 ผู้ป่วยจะรู้สึกเพลียมาก เดินแทบไม่ไหว แต่ยังนั่งได้ และยังรู้สึกตัวดี เริ่มมีอาการตาโป (ตาลึก) ปากแห้ง ผิวหนังเที่ยวและขาด ความยืดหยุ่น ชีพจรเบาเร็ว ความดันต่ำ ในทารกนอกจากอาการดังกล่าวแล้ว ยังพบว่า กระหม่อมนุ่ม และท่าทางเชื่องซึม ไม่วิ่งเล่นเหมือนปกติ\n" +
                "      \t3. ภาวะขาดน้ำรุนแรง (severe dehydration) น้ำหนักตัวลดมากกว่าร้อยละ 10 ผู้ป่วยมีอาการอ่อนเพลีย มาก ลุกนั่งไม่ได้ ต้องนอน ไม่ค่อยรู้สึกตัวหรือช็อก (กระสับกระส่าย ตัวเย็น มือเท้าเย็นชืด ชีพจรเบาเร็ว ความดันต่ำมาก ปัสสาวะออกน้อยหรือไม่ออกเลย) และมีอาการตาโบ๋มาก ผิวหนังเที่ยวมาก ริมฝีปากและ ลิ้นแห้งผาก หายใจเร็วและลึก ในทารกนอกจากอาการดังกล่าวแล้ว ยังพบว่ากระหม่อมบุ๋มมาก แน่นิ่ง และตัวอ่อนปวกเปียก\n" +
                "      \tในผู้ป่วยท้องเดินชนิดเรื้อรัง ลำไส้อาจดูดซึม อาหารไม่ได้ ทำให้น้ำหนักลด ขาดสารอาหาร ซีดได้\n");
        if (num5.equals("111")) {
            txtCmain5.setTextSize(15);
            imagesA5.setBackgroundResource(R.drawable.dow);
            txtCmain5.setText("");
            num5 = "1";
        }
    }
    private void Sick_sick9_6() {
        num6 = num6+"1";

        imagesA6.setBackgroundResource(R.drawable.up);
        txtCmain6.setTextSize(20);
        txtCmain6.setText("      \tในรายที่เป็นท้องเดินชนิดเฉียบพลันมีแนวทางในการดูแลรักษาดังนี้\n" +
                "      \t1. ควรงดอาหารแข็ง อาหารรสจัด และอาหารที่มีกากใย (เช่น ผัก ผลไม้) ให้กินอาหารอ่อน หรืออาหารเหลว เช่น ข้าวต้ม โจ๊ก น้ำข้าว น้ำหวานแทน ในทารกให้ดื่มนมมารดาตามปกติ ถ้าดื่มนมผงในระยะ 2-4 ชั่วโมงแรก ให้ผสมนมเจือจางลงเท่าตัว แล้วค่อยให้ดื่มนมผสมตามปกติ\n" +
                "      \t2. ให้น้ำเกลือ\n" +
                "      \t ก. ผู้ป่วยยังกินได้ไม่อาเจียน หรืออาเจียน เพียงเล็กน้อย ให้กินสารละลายน้ำตาลเกลือแร่ โดยผสม ผงน้ำตาลเกลือแร่ขององค์การเภสัชกรรม กับน้ำสุกดื่มต่างน้ำบ่อยๆครั้งละ 1/2 - 1 ถ้วย (250 มล.) หรือ จะใช้น้ำเกลือผสมเองก็ได้โดยใช้น้ำสุก 1 ขวดแม่โขงกลม (หรือขวดน้ำปลาใหญ่ คือขนาดประมาณ 750 มล.) ผสม กับน้ำตาลทราย 2 ช้อนโต๊ะ (25-30 กรัม) และเกลือปน 1 ช้อนชา (1.7 กรัม) หรือจะใช้น้ำอัดลมหรือน้ำข้าวต้มใส่ เกลือ (ใส่เกลือ 1 ช้อนชาในน้ำอัดลมหรือน้ำข้าว 1 ขวด แม่โขง) ก็ได้ ส่วนในเด็กเล็ก ในช่วง 4 ชั่วโมงแรกให้สารละลายน้ำตาลเกลือแร่ในปริมาณ 50 มล./กก. (สำหรับ ภาวะขาดน้ำเล็กน้อย) และ 100 มล./กก. (สำหรับภาวะ ขาดน้ำเห็นได้ชัด)\n" +
                "      \t ข. ถ้าผู้ป่วยมีอาการอาเจียนเล็กน้อย แต่ยังพอ ดื่มน้ำเกลือหรือน้ำข้าวต้มได้ ให้คอยสังเกตว่าได้รับน้ำ เข้าไปมาก กว่าส่วนที่อาเจียนออกมาหรือไม่ ถ้าอาเจียนออกมามากกว่าส่วนที่ดื่มเข้าไป หรือมีอาการอาเจียนมาก ควรให้น้ำ เกลือทางหลอดเลือดดำแทน\n" +
                "      \tผู้ใหญ่ ให้น้ำเกลือชนิดเดกซ์โทรสในนอร์มัลซาไลน์ 5% (5% D/NSS) หรือนอร์มัลซาไลน์ (NSS) 1,000-2,000 มล. ใน 12-24 ชั่วโมง ถ้ามีภาวะขาดน้ำ ปานกลางหรือรุนแรงในระยะ 1-2 ชั่วโมงควรให้น้ำเกลือ หยดเร็วๆ จนกระทั่งชีพจรเต้นช้าลงและแรงขึ้น ความ ดันเลือดกลับคืนเป็นปกติ จึงค่อยปรับให้น้ำเกลือหยด ช้าลง\n" +
                "      \tเด็ก ให้น้ำเกลือชนิดเดกซ์โทรส 5% ใน 3 น้ำเกลือนอร์มัล (5% Di3 NSS) ขนาด 100 มล./กก. ใน 24 ชั่วโมง ถ้ามีภาวะขาดน้ำรุนแรงในระยะ 1-2 ชั่วโมง แรกให้ขนาด 20 มล./กก. ใน 1 ชั่วโมง\n" +
                "      \tขณะให้น้ำเกลือ ควรเฝ้าดูอาการอย่างใกล้ชิด และใช้เครื่องฟังตรวจปอดบ่อยๆ ถ้ามีอาการหน้าบวม หอบ ตัวเขียว หรือฟังปอดมีเสียงกรอบแกรบ (crepitation) แสดงว่าให้น้ำเกลือเร็วหรือมากเกินไป ควรหยุด น้ำเกลือ และฉีดฟูโรซีไมด์ (ย21.1) 1 - 1 หลอดเข้าหลอด เลือดดํา ถ้าไม่ดีขึ้นให้รีบส่งโรงพยาบาล\n" +
                "      \t3. ยาแก้ท้องเดิน ไม่มีประโยชน์ในการรักษาอาการท้องเดิน และถ้าใช้ผิด ๆ อาจเกิดโทษได้ โดยเฉพาะ อย่างยิ่งในเด็กเล็กและผู้ป่วยที่มีสาเหตุจากโรคติดเชื้อ ดังนั้น ในปัจจุบันจึงไม่แนะนำให้ใช้ยาแก้ท้องเดิน แต่เน้นที่การให้สารละลายน้ำตาลเกลือแร่ให้ได้เพียงพอ อาการท้องเดินก็จะค่อยๆ ดีขึ้น\n" +
                "      \t4. ยาปฏิชีวนะ ส่วนใหญ่ไม่ต้องให้ ควรให้เฉพาะ รายที่สงสัยเป็นบิด อหิวาต์ หรือไทฟอยด์ เท่านั้น \n" +
                "      \t5. ถ้าทราบสาเหตุของท้องเดินให้รักษาตามสาเหตุ\n" +
                "      \t6. ควรติดตามดูการเปลี่ยนแปลงของโรค ถ้าถ่าย รุนแรง ปวดท้องรุนแรง อาเจียนรุนแรง มีภาวะขาดน้ำ มากขึ้น มีภาวะขาดน้ำรุนแรง หรือช็อกอย่างใดอย่าง หนึ่ง ควรส่งโรงพยาบาลโดยด่วน โดยให้น้ำเกลือทาง หลอดเลือด อาการที่แสดงว่าผู้ป่วยดีขึ้น ได้แก่ \n" +
                "      \t • ถ่ายและอาเจียนน้อยลง \n" +
                "      \t • ภาวะขาดน้ำลดน้อยลง \n" +
                "      \t • ปัสสาวะออกมากขึ้น \n" +
                "      \t • น้ำหนักตัวเพิ่มขึ้น\n" +
                "      \t • หน้าตาแจ่มใส ลุกนั่ง หรือเดินได้ เด็กเล็ก เริ่มวิ่งเล่นได้\n" +
                "ในรายที่เป็นท้องเดินชนิดเรื้อรัง ถ้ามีอาการอ่อน เพลีย เบื่ออาหาร น้ำหนักลด ซีด มีไข้เรื้อรัง หรือถ่าย เป็นมูกหรือมูกปนเลือด หลังเข้านอนกลางคืนต้องตื่น ขึ้นถ่ายท้องตอนดึก หรือมีอาการอุจจาระราด (กลั้นไม่ อยู่) ควรแนะนำไปตรวจหาสาเหตุที่โรงพยาบาล ถ้าไม่มี อาการเหล่านี้ก็ให้รักษาตามสาเหตุ\n");
        imagesB6.setBackgroundResource(R.drawable.a9_6);
        if (num6.equals("111")) {
            txtCmain6.setTextSize(15);
            imagesA6.setBackgroundResource(R.drawable.dow);
            txtCmain6.setText("");
            imagesB6.setBackgroundResource(0);
            num6 = "1";
        }
    }
    private void Sick_sick9_7() {
        num7 = num7+"1";
        imagesA7.setBackgroundResource(R.drawable.up);
        txtCmain7.setTextSize(20);
        txtCmain7.setText("      \t1. ท้องเดินชนิดเฉียบพลัน ถ้าพบในเด็กเล็กและ ผู้สูงอายุอาจมีอันตรายถึงตายได้ ถ้าให้การรักษาขั้นต้น แล้วอาการไม่ดีขึ้น ควรส่งโรงพยาบาล\n" +
                "      \t2. อันตรายที่เกิดจากโรคนี้ คือ การสูญเสียน้ำและ เกลือแร่ จึงควรแนะนำให้ประชาชนทั่วไปรู้จักใช้ผงน้ำตาลเกลือแร่ น้ำเกลือผสมเอง น้ำอัดลมหรือน้ำข้าวต้มใส่เกลือ ดื่มกินทันทีที่มีอาการท้องเดิน จะช่วยป้องกันมิให้อาการรุนแรงได้ สิ่งนี้นับเป็น “ยาแก้ท้องเดิน” ที่ จำเป็นที่สุด\n" +
                "      \t3. ในเด็กเล็ก อาการท้องเดินมีความสัมพันธ์กับ โรคขาดอาหารอย่างมาก กล่าวคือ ท้องเดินบ่อยอาจทำให้ขาดอาหาร และโรคขาดอาหารอาจทำให้ท้องเดินบ่อย จึงควรรักษาทั้ง 2 โรคนี้อย่างจริงจัง\n" +
                "      \t4. ควรอธิบายให้ชาวบ้านเข้าใจถึงสาเหตุของโรค ท้องเดินในเด็กเล็กว่าไม่ได้เกี่ยวกับการยืดตัวของเด็กดังที่เข้าใจกันทั่วไป แต่เกิดจากการติดเชื้อซึ่งสามารถป้องกันได้\n");
        if (num7.equals("111")) {
            txtCmain7.setTextSize(15);
            imagesA7.setBackgroundResource(R.drawable.dow);
            txtCmain7.setText("");
            num7 = "1";
        }
    }
    private void Sick_sick9_8() {
        num8 = num8+"1";
        imagesA8.setBackgroundResource(R.drawable.up);
        txtCmain8.setTextSize(20);
        txtCmain8.setText("      \tสำหรับท้องเดินจากการติดเชื้อสามารถป้องกันได้ ด้วยการปฏิบัติตัวดังนี้\n" +
                "      \t1. กินอาหารสุกและไม่มีแมลงวันตอม ดื่มน้ำต้ม สุกหรือน้ำสะอาด (ไม่ดื่มน้ำคลอง หรือน้ำบ่อแบบดิบๆ ไม่กินน้ำแข็งที่เตรียมไม่สะอาด)\n" +
                "      \t2. ล้างมือด้วยน้ำกับสบู่ก่อนเตรียมอาหาร ก่อน เปิบข้าว และหลังถ่ายอุจจาระหรือเปลี่ยนผ้าอ้อมเด็กทุกครั้ง\n" +
                "      \t3. ถ่ายอุจจาระลงในส้วมที่มิดชิด เพื่อป้องกันการ แพร่เชื้อ\n" +
                "      \t4. สำหรับทารก \n" +
                "      \t • ควรเลี้ยงทารกด้วยนมมารดา\n" +
                "      \t • ถ้าใช้ขวดนมเลี้ยงทารก ควรต้มขวดในน้ำ เดือดนานอย่างน้อย 15-20 นาที เพื่อฆ่าเชื้อโรคเสียก่อน\n" +
                "      \t • ควรฉีดวัคซีนป้องกันโรคพื้นฐานต่างๆ ตาม กำหนดเวลา และให้อาหารเสริมแก่ทารกเพื่อให้สุขภาพ แข็งแรงและไม่เป็นโรคขาดอาหาร\n");
        if (num8.equals("111")) {
            txtCmain8.setTextSize(15);
            imagesA8.setBackgroundResource(R.drawable.dow);
            txtCmain8.setText("");
            num8 = "1";
        }
    }

    private void pakad(View view) {
        //          ข้อความก่อนแตก
        txtBmain1 = view.findViewById(R.id.txtBmain1);
        txtBmain2 = view.findViewById(R.id.txtBmain2);
        txtBmain3 = view.findViewById(R.id.txtBmain3);
        txtBmain4 = view.findViewById(R.id.txtBmain4);
        txtBmain5 = view.findViewById(R.id.txtBmain5);
        txtBmain6 = view.findViewById(R.id.txtBmain6);
        txtBmain7 = view.findViewById(R.id.txtBmain7);
        txtBmain8 = view.findViewById(R.id.txtBmain8);


//          ลูกศรขึ้น-ลง
        imagesA1 = view.findViewById(R.id.imagesA1);
        imagesA2 = view.findViewById(R.id.imagesA2);
        imagesA3 = view.findViewById(R.id.imagesA3);
        imagesA4 = view.findViewById(R.id.imagesA4);
        imagesA5 = view.findViewById(R.id.imagesA5);
        imagesA6 = view.findViewById(R.id.imagesA6);
        imagesA7 = view.findViewById(R.id.imagesA7);
        imagesA8 = view.findViewById(R.id.imagesA8);

//          ข้อความที่แตกออก
        txtCmain1 = view.findViewById(R.id.txtCmain1);
        txtCmain2 = view.findViewById(R.id.txtCmain2);
        txtCmain3 = view.findViewById(R.id.txtCmain3);
        txtCmain4 = view.findViewById(R.id.txtCmain4);
        txtCmain5 = view.findViewById(R.id.txtCmain5);
        txtCmain6 = view.findViewById(R.id.txtCmain6);
        txtCmain7 = view.findViewById(R.id.txtCmain7);
        txtCmain8 = view.findViewById(R.id.txtCmain8);

//      ขีดขั้นช่อง
        txtcolked1 = view.findViewById(R.id.txtcolked1);
        txtcolked2 = view.findViewById(R.id.txtcolked2);
        txtcolked3 = view.findViewById(R.id.txtcolked3);
        txtcolked4 = view.findViewById(R.id.txtcolked4);
        txtcolked5 = view.findViewById(R.id.txtcolked5);
        txtcolked6 = view.findViewById(R.id.txtcolked6);
        txtcolked7 = view.findViewById(R.id.txtcolked7);
        txtcolked8 = view.findViewById(R.id.txtcolked8);
//          รูปเพิ่มเติม
        imagesB1 = view.findViewById(R.id.imagesB1);
        imagesB2 = view.findViewById(R.id.imagesB2);
        imagesB3 = view.findViewById(R.id.imagesB3);
        imagesB4 = view.findViewById(R.id.imagesB4);
        imagesB5 = view.findViewById(R.id.imagesB5);
        imagesB6 = view.findViewById(R.id.imagesB6);
        imagesB7 = view.findViewById(R.id.imagesB7);
        imagesB8 = view.findViewById(R.id.imagesB8);


        linearLayout1 = view.findViewById(R.id.llsick1);
        linearLayout2 = view.findViewById(R.id.llsick2);
        linearLayout3 = view.findViewById(R.id.llsick3);
        linearLayout4 = view.findViewById(R.id.llsick4);
        linearLayout5 = view.findViewById(R.id.llsick5);
        linearLayout6 = view.findViewById(R.id.llsick6);
        linearLayout7 = view.findViewById(R.id.llsick7);
        linearLayout8 = view.findViewById(R.id.llsick8);




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
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fldata, new DataSickMainFragment()).commit();
               // getActivity().getSupportFragmentManager().popBackStack();
            }//เม็กตอดกดให้กลับ
        });
        setHasOptionsMenu(true);
    }

}
