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

        if (datastr.equals("ไข้หวัด")){ sick1();}
        if (datastr.equals("หวัดภูมิแพ้")){ sick2();}
        if (datastr.equals("บ้านหมุนจากการเปลี่ยนท่า")){ sick3();}
        if (datastr.equals("ไมเกรน")){ sick4();}
        if (datastr.equals("โรคขาดวิตามินเอ หรือโรคเกล็ดกระดี่ขึ้นตา")){ sick5();}
        if (datastr.equals("โรคขาดวิตามินบี 1 หรือโรคเหน็บชา")){ sick6();}
        if (datastr.equals("โรคขาดวิตามินบี 2 หรือโรคปากนกกระจอก")){ sick7();}
        if (datastr.equals("โรคขาดวิตามินซีหรือโรคลักปิดลักเปิด")){ sick8();}
        if (datastr.equals("โรคท้องเดินหรืออุจจาระร่วง")){ sick9();}




        textView1.setText(data1);textView2.setText(data2);





    }
    private void sick9() {
        if (dataint.equals("1")){ data1= "ท้องเดินหรืออุจจาระร่วง ต่ำ";data2="      ควรไปพบแพทย์เพื่อวิเคราะห์อาการของของคุณอย่างละเอียด";}
        if (dataint.equals("2")){ data1 = "ท้องเดินหรืออุจจาระร่วง ปานกลาง";
            data2=  "      1.\tควรงดอาหารแข็ง อาหารรสจัด และอาหารที่มีกากใย \n" +
                    "      2.\tให้กินสารละลายน้ำตาลเกลือแร่\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 3 วัน แนะนำให้รีบไปพบแพทย์เพื่อให้ตรวจหาอาการเพิ่มเติม \n\n";}
        if (dataint.equals("3")){ data1 = "ท้องเดินหรืออุจจาระร่วง สูง";
            data2=  "      1.\tควรงดอาหารแข็ง อาหารรสจัด และอาหารที่มีกากใย \n" +
                    "      2.\tให้กินสารละลายน้ำตาลเกลือแร่\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 3 วัน แนะนำให้รีบไปพบแพทย์เพื่อให้ตรวจหาอาการเพิ่มเติม \n\n";}
    }



    private void sick8() {
        if (dataint.equals("1")){ data1= "ขาดวิตามินซีหรือโรคลักปิดลักเปิด ต่ำ";data2="      ควรไปพบแพทย์เพื่อวิเคราะห์อาการของของคุณอย่างละเอียด";}
        if (dataint.equals("2")){ data1 = "ขาดวิตามินซีหรือโรคลักปิดลักเปิด ปานกลาง";
            data2=  "      1.\tให้กินวิตามินซีขนาด 100 มก. วันละ 3 ครั้ง\n" +
                    "      2.\tการกินอาหารที่มีวิตามินซีให้เพียงพอและเป็นประจำ เช่น ส้ม มะนาว มะขามป้อม มะเขือเทศ ฝรั่ง ผักชี เป็นต้น\n" +
                    "      * ถ้าไม่ดีขึ้นใน 2วัน หรือมีอาการแทรกซ้อนอื่นๆควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และตรวจหาสาเหตุเพิ่มเติม\n\n";}
        if (dataint.equals("3")){ data1 = "ขาดวิตามินซีหรือโรคลักปิดลักเปิด สูง";
            data2=  "      1.\tให้กินวิตามินซีขนาด 100 มก. วันละ 3 ครั้ง\n" +
                    "      2.\tการกินอาหารที่มีวิตามินซีให้เพียงพอและเป็นประจำ เช่น ส้ม มะนาว มะขามป้อม มะเขือเทศ ฝรั่ง ผักชี เป็นต้น\n" +
                    "      * ถ้าไม่ดีขึ้นใน 2วัน หรือมีอาการแทรกซ้อนอื่นๆควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และตรวจหาสาเหตุเพิ่มเติม\n\n";}
    }



    private void sick7() {
        if (dataint.equals("1")){ data1= "ขาดวิตามินบี 2 หรือโรคปากนกกระจอก ต่ำ";data2="      ควรไปพบแพทย์เพื่อวิเคราะห์อาการของของคุณอย่างละเอียด";}
        if (dataint.equals("2")){ data1 = "ขาดวิตามินบี 2 หรือโรคปากนกกระจอก ปานกลาง";
            data2=  "      1.\tให้วิตามินบีสอง วันละ 10-30 mg/วันจนเริ่มดีขึ้น จึงลดขนาดของยาเหลือวันละ 2-4 mg/วัน จนหาย\n" +
                    "      2.\tกินอาหารที่มีวิตามินบีสองให้เพียงพอและเป็นประจำ เช่น นมสด นมปรุงแต่ง นมถั่วเหลือง น้ำเต้าหู้ ถั่วเมล็ดแห้งข้าวซ้อมมือ ผัก ผลไม้ เป็นต้น\n" +
                    "      * ถ้าไม่ดีขึ้นใน 1 สัปดาห์ หรือมีอาการแทรกซ้อนอื่นๆควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และตรวจหาสาเหตุเพิ่มเติม\n\n";}
        if (dataint.equals("3")){ data1 = "ขาดวิตามินบี 2 หรือโรคปากนกกระจอก สูง";
            data2=  "      1.\tให้วิตามินบีสอง วันละ 10-30 mg/วันจนเริ่มดีขึ้น จึงลดขนาดของยาเหลือวันละ 2-4 mg/วัน จนหาย\n" +
                    "      2.\tกินอาหารที่มีวิตามินบีสองให้เพียงพอและเป็นประจำ เช่น นมสด นมปรุงแต่ง นมถั่วเหลือง น้ำเต้าหู้ ถั่วเมล็ดแห้งข้าวซ้อมมือ ผัก ผลไม้ เป็นต้น\n" +
                    "      * ถ้าไม่ดีขึ้นใน 1 สัปดาห์ หรือมีอาการแทรกซ้อนอื่นๆควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และตรวจหาสาเหตุเพิ่มเติม\n\n";}
    }

    private void sick6() {
        if (dataint.equals("1")){ data1= "เหน็บชา/โรคขาดวิตามินบี 1 ต่ำ";data2="      ควรไปพบแพทย์เพื่อวิเคราะห์อาการของของคุณอย่างละเอียด";}
        if (dataint.equals("2")){ data1 = "เหน็บชา/โรคขาดวิตามินบี 1 ปานกลาง";
            data2=  "      1.\tให้วิตามินบี 1 10-20 มก. โดยการกินวันละ 2-3 ครั้ง เป็นเวลา 2 สัปดาห์ \n" +
                    "      2.\tการกินอาหารที่มีวิตามินบีหนึ่งให้เพียงพอและเป็นประจำ เช่น ข้าวซ้อมมือ ตับ ถั่วเมล็ดแห้ง และเนื้อสัตว์ และควรหลีกเลี่ยงอาหารที่ทำลายวิตามินบีหนึ่ง เช่น ปลาร้าดิบ หอยดิบ หมาก เมี่ยง ใบชา เป็นต้น\n" +
                    "      ถ้าไม่ดีขึ้นภายใน 7 วัน หรือมีอาการแทรกซ้อนอื่นๆ ควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และตรวจหาสาเหตุเพิ่มเติม\n\n";}
        if (dataint.equals("3")){ data1 = "เหน็บชา/โรคขาดวิตามินบี 1 สูง";
            data2=  "      1.\tให้วิตามินบี 1 10-20 มก. โดยการกินวันละ 2-3 ครั้ง เป็นเวลา 2 สัปดาห์ \n" +
                    "      2.\tการกินอาหารที่มีวิตามินบีหนึ่งให้เพียงพอและเป็นประจำ เช่น ข้าวซ้อมมือ ตับ ถั่วเมล็ดแห้ง และเนื้อสัตว์ และควรหลีกเลี่ยงอาหารที่ทำลายวิตามินบีหนึ่ง เช่น ปลาร้าดิบ หอยดิบ หมาก เมี่ยง ใบชา เป็นต้น\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 7 วัน หรือมีอาการแทรกซ้อนอื่นๆ ควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และตรวจหาสาเหตุเพิ่มเติม\n\n";}
    }


    private void sick5() {
        if (dataint.equals("1")){ data1= "ขาดวิตามินเอ หรือโรคเกล็ดกระดี่ขึ้นตา ต่ำ";data2="      ควรไปพบแพทย์เพื่อวิเคราะห์อาการของของคุณอย่างละเอียด";}
        if (dataint.equals("2")){ data1 = "ขาดวิตามินเอ หรือโรคเกล็ดกระดี่ขึ้นตา ปานกลาง";
            data2=  "      1.\tเมื่อเริ่มมีอาการตาบอดกลางคืน หรือเริ่มมี เกล็ดกระดี่ขึ้นตา ให้กินวิตามินเอชนิดแคปซูล (ขนาด 25,000 ยูนิต) วันละ 2 ครั้ง ครั้งละ 1-2 แคปซูล \n" +
                    "      2.\tกินอาหารที่มีไขมันและอาหารจำพวกผลไม้ ผักใบเขียว ผักใบเหลือง เช่น มะละกอ มะม่วงสุก ผักบุ้ง คะน้า ตำลึง มันเทศ ไข่ นม สำหรับทารกควรได้กินอาหารเสริมที่ผสมกับตับหรือไข่แดงบด\n" +
                    "      * ถ้าไม่ดีขึ้นใน 1 สัปดาห์ มีอาการอ่อนตัวของกระจกตาดำหรืออาการแทรกซ้อนอื่นๆควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และตรวจหาสาเหตุเพิ่มเติม\n\n";}
        if (dataint.equals("3")){ data1 = "ขาดวิตามินเอ หรือโรคเกล็ดกระดี่ขึ้นตา สูง";
            data2=  "      1.\tเมื่อเริ่มมีอาการตาบอดกลางคืน หรือเริ่มมี เกล็ดกระดี่ขึ้นตา ให้กินวิตามินเอชนิดแคปซูล (ขนาด 25,000 ยูนิต) วันละ 2 ครั้ง ครั้งละ 1-2 แคปซูล \n" +
                    "      2.\tกินอาหารที่มีไขมันและอาหารจำพวกผลไม้ ผักใบเขียว ผักใบเหลือง เช่น มะละกอ มะม่วงสุก ผักบุ้ง คะน้า ตำลึง มันเทศ ไข่ นม สำหรับทารกควรได้กินอาหารเสริมที่ผสมกับตับหรือไข่แดงบด\n" +
                    "      * ถ้าไม่ดีขึ้นใน 1 สัปดาห์ มีอาการอ่อนตัวของกระจกตาดำหรืออาการแทรกซ้อนอื่นๆควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และตรวจหาสาเหตุเพิ่มเติม\n\n";}
    }
    private void sick4() {
        if (dataint.equals("1")){ data1= "ไมเกรน ต่ำ";data2="      ควรไปพบแพทย์เพื่อวิเคราะห์อาการของของคุณอย่างละเอียด";}
        if (dataint.equals("2")){ data1 = "ไมเกรน ปานกลาง";
            data2=  "      1.\tขณะที่มีอาการกำเริบ ให้ยาบรรเทาปวด ได้แก่ พาราเซตามอล หรือยาต้านอักเสบที่ไม่ใช่สตีรอยด์ \n" +
                    "      2.\tสังเกตและหลีกเลี่ยงสิ่งกระตุ้น ที่ทำให้เกิดอาการปวดศีรษะ\n" +
                    "      3.\tนอนพักผ่อนให้เพียงพอ และตรงตามเวลาทุกวัน\n" +
                    "      4.\tออกกำลังกายอย่างสม่ำเสมอ ไม่หักโหมจนเกินไป\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 3 วัน เป็นมากกว่า 5 ครั้ง / เดือน หรือมีอาการแทรกซ้อนอื่นๆ แนะนำให้รีบไปพบแพทย์เพื่อให้ตรวจหาอาการเพิ่มเติม\n\n";}
        if (dataint.equals("3")){ data1 = "ไมเกรน สูง";
            data2=  "      1.\tขณะที่มีอาการกำเริบ ให้ยาบรรเทาปวด ได้แก่ พาราเซตามอล หรือยาต้านอักเสบที่ไม่ใช่สตีรอยด์ \n" +
                    "      2.\tสังเกตและหลีกเลี่ยงสิ่งกระตุ้น ที่ทำให้เกิดอาการปวดศีรษะ\n" +
                    "      3.\tนอนพักผ่อนให้เพียงพอ และตรงตามเวลาทุกวัน\n" +
                    "      4.\tออกกำลังกายอย่างสม่ำเสมอ ไม่หักโหมจนเกินไป\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 3 วัน เป็นมากกว่า 5 ครั้ง / เดือน หรือมีอาการแทรกซ้อนอื่นๆ แนะนำให้รีบไปพบแพทย์เพื่อให้ตรวจหาอาการเพิ่มเติม\n\n";}
    }


    private void sick3() {
        if (dataint.equals("1")){ data1= "หวัดภูมิแพ้ ต่ำ";data2="      ควรไปพบแพทย์เพื่อวิเคราะห์อาการของของคุณอย่างละเอียด";}
        if (dataint.equals("2")){ data1 = "หวัดภูมิแพ้ ปานกลาง";
            data2=  "      1. ขณะมีอาการกำเริบ ให้ผู้ป่วยเปลี่ยนท่ามา นั่งตอตรงๆ หรือนอนหงายศีรษะตรงทันที\n" +
                    "      2. ป้องกันไม่ให้อาการกำเริบซ้ำโดยการนอน หนุนหมอนอย่างน้อย 2 ใบ อย่านอนตะแคงข้างที่มี อาการ เวลาลุกจากเตียงนอนให้ลุกอย่างช้าๆ และนั่งอยู่ ขอบเตียงสักครู่ก่อนจะยืนขึ้น อย่าก้มศีรษะต่ำหรือเงย มองขึ้นข้างบน หลีกเลี่ยงการทำงานที่ต้องก้มๆ เงยๆ การสะบัดผมหรือสะบัดคอเร็วๆ รวมทั้งท่าอื่น ๆ ที่กระตุ้นให้อาการกำเริบ\n" +
                    "      3. หลีกเลี่ยงการขับรถหรือทำงานเกี่ยวกับ เครื่องจักร เพื่อป้องกันอุบัติเหตุที่อาจเกิดขึ้น\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 7 วัน หรือมีอาการแทรกซ้อนอื่นๆแนะนำให้รีบไปพบแพทย์เพื่อให้ตรวจหาอาการเพิ่มเติม\n\n";}
        if (dataint.equals("3")){ data1 = "หวัดภูมิแพ้ สูง";
            data2=  "      1. ขณะมีอาการกำเริบ ให้ผู้ป่วยเปลี่ยนท่ามา นั่งตอตรงๆ หรือนอนหงายศีรษะตรงทันที\n" +
                    "      2. ป้องกันไม่ให้อาการกำเริบซ้ำโดยการนอน หนุนหมอนอย่างน้อย 2 ใบ อย่านอนตะแคงข้างที่มี อาการ เวลาลุกจากเตียงนอนให้ลุกอย่างช้าๆ และนั่งอยู่ ขอบเตียงสักครู่ก่อนจะยืนขึ้น อย่าก้มศีรษะต่ำหรือเงย มองขึ้นข้างบน หลีกเลี่ยงการทำงานที่ต้องก้มๆ เงยๆ การสะบัดผมหรือสะบัดคอเร็วๆ รวมทั้งท่าอื่น ๆ ที่กระตุ้นให้อาการกำเริบ\n" +
                    "      3. หลีกเลี่ยงการขับรถหรือทำงานเกี่ยวกับ เครื่องจักร เพื่อป้องกันอุบัติเหตุที่อาจเกิดขึ้น\n" +
                    "      * ถ้าไม่ดีขึ้นภายใน 7 วัน หรือมีอาการแทรกซ้อนอื่นๆแนะนำให้รีบไปพบแพทย์เพื่อให้ตรวจหาอาการเพิ่มเติม\n\n";}
    }

    private void sick2() {
        if (dataint.equals("1")){ data1= "หวัดภูมิแพ้ ต่ำ";data2="      ควรไปพบแพทย์เพื่อวิเคราะห์อาการของของคุณอย่างละเอียด";}
        if (dataint.equals("2")){ data1 = "หวัดภูมิแพ้ ปานกลาง";
        data2=  "      1. แนะนำให้ผู้ป่วยสังเกตว่าเกิดจากสารก่อภูมิแพ้ หรือสิ่งกระตุ้นอะไร แล้วพยายามหลีกเลี่ยง \n" +
                "      2. ถ้ามีอาการน้ำมูกไหลมากกินยาแก้แพ้ เช่น คลอร์เฟนิรามีน หรือไดเฟนไฮดรามีน ครั้งละ 1/2 - 1 เม็ด วันละ 2-4 ครั้ง หรือยาแก้แพ้ที่ไม่ง่วง เช่น ลอราทาดีน ครั้งละ 1/2 - 1 เม็ด วันละครั้ง\n" +
                "      * ถ้าไม่ได้ผลหรือมีอาการแทรกซ้อนอื่นๆควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และตรวจหาสาเหตุเพิ่มเติม\n\n";}
        if (dataint.equals("3")){ data1 = "หวัดภูมิแพ้ สูง";
        data2=  "      1. แนะนำให้ผู้ป่วยสังเกตว่าเกิดจากสารก่อภูมิแพ้ หรือสิ่งกระตุ้นอะไร แล้วพยายามหลีกเลี่ยง \n" +
                "      2. ถ้ามีอาการน้ำมูกไหลมากกินยาแก้แพ้ เช่น คลอร์เฟนิรามีน หรือไดเฟนไฮดรามีน ครั้งละ 1/2 - 1 เม็ด วันละ 2-4 ครั้ง หรือยาแก้แพ้ที่ไม่ง่วง เช่น ลอราทาดีน ครั้งละ 1/2 - 1 เม็ด วันละครั้ง\n" +
                "      * ถ้าไม่ได้ผลหรือมีอาการแทรกซ้อนอื่นๆควรส่งโรงพยาบาลหรือปรึกษาแพทย์ และตรวจหาสาเหตุเพิ่มเติม\n\n";}
    }

    private void sick1() {
        if (dataint.equals("1")){ data1 = "ไข้หวัด ต่ำ";data2="      ควรไปพบแพทย์เพื่อวิเคราะห์อาการของของคุณอย่างละเอียด";}
        if (dataint.equals("2")){
            data1 = "ไข้หวัด ปานกลาง";
        data2 = "      1. ถ้ามีไข้ ให้กินพาราเซตามอล\n" +
                "      2. พักผ่อนมากๆ ห้ามทำงานหนักหรือออกกำลังกายมากเกินไป\n" +
                "      3. สวมใส่เสื้อผ้าให้ร่างกายอบอุ่น ห้ามถูกฝนหรือถูกอากาศเย็นจัด และห้ามอาบน้ำเย็น\n" +
                "      4. ดื่มน้ำมากๆ เพื่อช่วยลดไข้ และทดแทนน้ำ ที่เสียไปเนื่องจากไข้สูง\n" +
                "      5. ควรกินอาหารอ่อน น้ำข้าว น้ำหวาน น้ำส้ม น้ำผลไม้ หรือเครื่องดื่มร้อน ๆ\n" +
                "      6. ใช้ผ้าชุบน้ำ (ควรใช้น้ำอุ่น หรือน้ำก๊อก ธรรมดา อย่าใช้น้ำเย็นจัดหรือน้ำแข็ง) เช็ดตัวเวลามีไข้สูง\n\n" +
                "*ถ้าไม่ดีขึ้นภายใน 7 วัน หรือมีอาการแทรกซ้อนอื่นๆแนะนำให้รีบไปพบแพทย์ \n\n";}
        if (dataint.equals("3")){
            data1 = "จากการวิเคราะห์โอกาสที่จะเป็นสูง";

        data2=  "      1. ถ้ามีไข้ ให้กินพาราเซตามอล\n" +
                "      2. พักผ่อนมากๆ ห้ามทำงานหนักหรือออกกำลังกายมากเกินไป\n" +
                "      3. สวมใส่เสื้อผ้าให้ร่างกายอบอุ่น ห้ามถูกฝนหรือถูกอากาศเย็นจัด และห้ามอาบน้ำเย็น\n" +
                "      4. ดื่มน้ำมากๆ เพื่อช่วยลดไข้ และทดแทนน้ำ ที่เสียไปเนื่องจากไข้สูง\n" +
                "      5. ควรกินอาหารอ่อน น้ำข้าว น้ำหวาน น้ำส้ม น้ำผลไม้ หรือเครื่องดื่มร้อน ๆ\n" +
                "      6. ใช้ผ้าชุบน้ำ (ควรใช้น้ำอุ่น หรือน้ำก๊อก ธรรมดา อย่าใช้น้ำเย็นจัดหรือน้ำแข็ง) เช็ดตัวเวลามีไข้สูง\n\n" +
                "  * ถ้าไม่ดีขึ้นภายใน 7 วัน หรือมีอาการแทรกซ้อนอื่นๆแนะนำให้รีบไปพบแพทย์ \n\n";}
    }
}
