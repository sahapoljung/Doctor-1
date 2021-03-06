package th.ac.kmutnb.doctor;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SickData1Fragment extends Fragment {


    public SickData1Fragment() {
        // Required empty public constructor
    }

    String str,num;
    TextView textView;
    ImageView imagesC;
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        creatrToober();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
View view = inflater.inflate(R.layout.fragment_sick_data1, container, false);

        textView = view.findViewById(R.id.txtSmain);
        imagesC = view.findViewById(R.id.imagesC);
        Bundle bundle = getArguments();
        num = bundle.getString("num");

        if (num.equals("0")) { Sick_main_1();str = "ไอ"; }
        if (num.equals("1")) { Sick_main_2();str = "น้ำมูกไหล"; }
        if (num.equals("2")) { Sick_main_3();str = "ปวดศรีษะ"; }
        if (num.equals("3")) { Sick_main_4();str = "มีไข้"; }
        if (num.equals("4")) { Sick_main_5();str = "แผลสด";}
        if (num.equals("5")) { Sick_main_6();str = "ก้างติดคอ"; }
        if (num.equals("6")) { Sick_main_7();str = "ผดคันจากอากาศร้อน"; }
        if (num.equals("7")) { Sick_main_8();str = "ปวดเมื่อยจากการออกกำลังกาย"; }
        if (num.equals("8")) { Sick_main_9();str = "รังแค"; }

        Log.d("26JanV1", "position sickdata ++++++ ==>  " + num);
return view;
    }


    private void Sick_main_1() {
        textView.setText(
                "       \tยารักษา\n" +
                "      \t1.\tยาละลายเสมหะ บรอมเฮกซีน (Bromhexine) เป็นตัวแรก ๆ ที่มีกลไก ทำให้เสมหะมีน้ำมากขึ้น เสมหะใสขึ้น ข้อเสียคือออกฤทธิ์ช้า\n" +
                "      \t2.\tยาละลายเสมหะ แอมบรอกซอล (Ambroxol) กลไกเหมือนบรอมเฮกซีน ออกฤทธิ์เร็ว แต่ราคาค่อนข้างสูง\n" +
                "      \t3.\tยาละลายเสมหะ คาร์โบซิสเทอีน (Carbocysteine) กลไกการทำงานจะเยอะกว่า นอกจากเพิ่มน้ำในเสมหะ มีกลไกบางอย่างทำให้เสมหะมีขนาดเล็กลง หรืออาจจะแค่กลืนลงกระเพาะอาหารก็ได้ ซึ่งปลอดภัย ราคาไม่สูง มีทั้งแบบเม็ด และแบบน้ำ\n\n" +

                "       \tการรักษา และดูแลร่างกายเมื่อมีอาการไอ\n" +
                "      \t1.\tหาสาเหตุของอาการไอ และแก้ไขที่ต้นเหตุอาการไอให้ถูกต้อง\n" +
                "      \t2.\tพักผ่อนให้เพียงพอเมื่อมีอาการไอ ไม่เครียด เพราะความเครียดก็เป็นสาเหตุให้อาการไอหายได้ช้า\n" +
                "      \t3.\tปรับอุณหภูมิห้องให้เหมาะสม ไม่ต่ำกว่า 25 องศาเซลเซียส และไม่ควรให้พัดลม หรือลมจากเครื่องปรับอากาศโดนตัวมากเกินไป\n" +
                "      \t4.\tไม่ปล่อยให้ร่างกายเย็นเกินไป ควรห่มผ้า หรือใส่ถุงเท้าตอนนอน\n" +
                "      \t5.\tดื่มน้ำเปล่าเยอะ ๆ เพื่อช่วยละลายเสมหะ และขับออกมาได้ง่ายขึ้น\n" +
                "      \t6.\tดื่มน้ำอุ่น ไม่ดื่มน้ำเย็นเมื่อมีอาการไอ\n" +
                "      \t7.\tหลีกเลี่ยงสิ่งแวดล้อมที่ทำให้แพ้ หรือมีอาการไอ เช่น ที่ที่มีฝุ่นละออง ควัน มลพิษ\n" +
                "      \t8.\tเมื่อมีอาการไอไม่กิน อาหารทอด อาหารมัน หรืออาหารที่กระตุ้นให้เกิดอาการไอมากขึ้น\n" +
                "      \t9.\tหากมีอาการไอต่อเนื่องเป็นระยะเวลานาน ควรปรึกษาแพทย์ เพื่อวินิจฉัย และรักษาอย่างเหมาะสม\n");
    }

    private void Sick_main_2() {
        textView.setText(
            "      \tยารักษา\n" +
            "      \tยาแก้แพ้แบ่งออกเป็นสองกลุ่มใหญ่ๆคือ ยาแก้แพ้รุ่นแรก (first-generation antihistamine) เป็นยาแก้แพ้กลุ่มที่ทำให้ง่วง และกลุ่มที่สองคือ ยาแก้แพ้รุ่นที่สอง (second generation) หรือยาแก้แพ้กลุ่มที่ไม่ทำให้ง่วง \n" +
            "      \tยาแก้แพ้รุ่นแรกสามารถซึมผ่านเข้าสู่สมองไปออกฤทธิ์กดระบบประสาทได้ ผลคือทำให้พบอาการง่วงซึมได้ และอาจทำให้เกิดผลข้างเคียงอีกกลุ่มหนึ่งคืออาการแห้ง (ซึ่งกลไกนี้เองที่ให้น้ำมูกแห้ง) ได้แก่ ปากแห้ง คอแห้ง น้ำมูกข้น และอาการข้างเคียงอื่น ได้แก่ ตาพร่า ปัสสาวะคั่ง แรงดันในลูกตาเพิ่ม ใจสั่น \n" +
            "      \tยากลุ่มนี้มีข้อควรระวัง คือ ไม่ใช้ยาในผู้ป่วยสูงอายุ โรคหัวใจ ต้อหิน ต่อมลูกหมากโต เนื่องจากผลข้างเคียงอาจทำให้อาการของโรคที่ผู้ป่วยเป็นอยู่แล้วรุนแรงขึ้น\n" +
            "      \tยาในกลุ่มนี้ที่นิยมใช้ได้แก่\n" +
            "       \t1.\tคลอเฟนิรามีน (chlorpheniramine) ขนาดรับประทานคือ 4 มิลลิกรัม ทุก 4 ถึง 6 ชั่วโมง ไม่รับประทานเกิน 24 มิลลิกรัมต่อวัน \n" +
            "       \t2.\tบรอมเฟนิรามีน (brompheniramine) ขนาดรับประทานเช่นเดียวกันกับคลอเฟนิรามีนคือ 4 มิลลิกรัม ทุก 4 ถึง 6 ชั่วโมง \n" +
            "       \t3.\tไดเฟนไฮดรามีน (diphenhydramine) ขนาดรับประทานคือ 25 ถึง 50 มิลลิกรัม ทุก 4 ถึง 6 ชั่วโมงและไม่เกิน 150 มิลลิกรัมใน 1 วัน ยาไดเฟนไฮดรามีนยังมีข้อบ่งใช้อื่น คือ บรรเทาอาการเมารถ เมาเรือ (motion sickness) \n" +
            "      \tยาอีกกลุ่มคือยาที่ไม่ก่อให้เกิดอาการง่วง กลไกในการออกฤทธิ์ของยาเป็นแบบเดียวกันกับยาแก้แพ้รุ่นแรก คือยับยั้งการหลั่งฮีสตามีนซึ่งเป็นต้นเหตุโดยตรงของอาการแพ้ แต่ยากลุ่มนี้จะไม่ซึมผ่านเข้าสู่สมอง ทำให้ไม่พบผลข้างเคียง คืออาการง่วงซึม หรืออาจพบได้น้อยมากในยาบางตัว นอกจากนี้ยายังไม่มีฤทธิ์ในการยับยั้งสารสื่อประสาทอะเซทิลโคลีน ทำให้ไม่เกิดผลข้างเคียงปากแห้ง คอแห้ง ตาพร่า ปัสสาวะคั่ง แรงดันในลูกตาเพิ่ม ใจสั่น อย่างในยารุ่นแรกด้วย\n" +
            "      \tยาในกลุ่มนี้ได้แก่ \n" +
            "       \t1.\tเซเทอริซีน (cetirizine) ขนาดรับประทานคือ 10 มิลลิกรัม วันละหนึ่งครั้ง หรือแบ่งรับประทาน 5 มิลลิกรัม วันละสองครั้ง\n" +
            "       \t2.\t ลอราทาดีน (loratadine) ขนาดรับประทานคือ 10 มิลลิกรัมวันละหนึ่งครั้ง เฟกโซเฟนาดีน (fexofenadine) ขนาดรับประทานคือ 120 มิลลิกรัม วันละหนึ่งครึ่ง \n" +
            "      \tจะเห็นได้ว่ายากลุ่มนี้มีความถี่ในการรับประทานต่ำกว่ายารุ่นแรกคือ รับประทานเพียงวันละหนึ่งครั้ง เนื่องจากตัวยาสามารถออกฤทธิ์ได้ยาวนานกว่า \n" +
            "      \tนอกจากนี้มีการรายงานการศึกษาว่าการรักษาน้ำมูกไหลที่เกิดจากไข้หวัดด้วยการใช้ยานั้น ยาแก้แพ้รุ่นแรกให้ประสิทธิภาพดีกว่ายาแก้แพ้รุ่นที่สอง\n"); }
    private void Sick_main_3() { textView.setText("      \tยาพาราเซตามอล หรือยาแก้ปวด ถูกจัดให้เป็นเป็นยาสามัญประจำบ้านที่เกือบทุกบ้าน การกินยาแก้ปวดหรือยาพาราเซตามอล เมื่อเรามีอาการปวดหัว ปวดเมื่อยกล้ามเนื้อ มีไข้สูงตัวร้อน เพื่อเป็นการบรรเทาอาการ\n" +
            "      \tข้อควรรู้ก่อนกินยาพาราเซตามอล (ยาแก้ปวด)\n" +
            "       \t1.\tควรกินยาแก้ปวด 1 เม็ดทุกเวลา 6 ชั่วโมง และห้ามกินยาแก้ปวดต่อเนื่องกันเกิน 7 วันโดยเด็ดขาด\n" +
            "       \t2.\tยาแก้ปวดไม่สามารถลดอาการปวดที่มีความเจ็บปวดอย่างรุนแรงได้ เช่น อาการปวดจากแผลผ่าตัด\n" +
            "       \t3.\tหากมีอาการปวดหัวบ่อย โดยมากกว่า 15 วันต่อเดือน ควรไปปรึกษาแพทย์เพื่อให้การวินิจฉัยโดยด่วน\n" +
            "       \t4.\tหากกินยาแก้ปวดเข้าไปแล้ว เกิดมีอาการคลื่นไส้อาเจียน หรือมีอาการเบื่ออาหาร ต้องรีบไปพบแพทย์ทันที\n" +
            "       \t5.\tควรกินยาแก้ปวดเฉพาะเมื่อมีอาการเท่านั้น ห้ามกินยาแก้ปวดก่อนจะมีอาการโดยเด็ดขาด มิฉะนั้นอาจได้รับยาแก้ปวดเกินขนาดได้\n" +
            "       \t6.\tถ้าหากเกิดลืมกินยาแก้ปวด เมื่อเข้าสู่อาหารมื้อต่อไป ก็ไม่ต้องกินยาเพิ่มเติมแต่อย่างใด และให้กินยาแก้ปวดในมื้อถัดไปนั้นตามปริมาณปกติเช่นเดิม\n" +
            "       \t7.\tยาแก้ปวดอาจไม่เหมาะสมสำหรับสตรีมีครรภ์ เพราะยาแก้ปวดดังกล่าว อาจจะเข้าไปสู่ร่างกายของทารกได้\n" +
            "      \tข้อห้ามเกี่ยวกับยาพาราเซตามอล\n" +
            "       \t1.\tการกินยาแก้ปวดต้องไม่ทานเกิน 15 มิลลิกรัมต่อน้ำหนักตัว โดยในยาแก้ปวด 1 เม็ดจะมีปริมาณยาอยู่ที่ 500 มิลลิกรัม\n" +
            "       \t2.\tห้ามกินยาแก้ปวดเกินวันละ 8 เม็ดโดยเด็ดขาด เพราะจะทำให้ตับของเราต้องทำงานหนักเกินไป\n" +
            "       \t3.\tการกินยาแก้ปวดห้ามกินร่วมกันกับยารักษาโรควัณโรคหรือยารักษาโรคลมชักโดยเด็ดขาด เพราะจะเป็นการไปเพิ่มการเป็นพิษต่อตับให้เพิ่มสูงขึ้น\n" +
            "       \t4.\tห้ามกินยาแก้ปวดร่วมกันกับเครื่องดื่มที่มีแอลกอฮอล์ เพราะจะยิ่งเพิ่มผลเสียให้กับตับ\n" +
            "       \t5.\tถ้าหากเป็นโรคหัวใจหรือเป็นโรคความดันโลหิตสูง ไม่ควรกินยาแก้ปวดหรือยาพาราเซตามอล เพราะจะส่งผลทำให้โรคที่เป็นอยู่นั้นมีความรุนแรงมากยิ่งขึ้นไปอีก\n" +
            "      \tข้อที่ควรต้องระวังที่สุดก็คือ การกินยาแก้ปวดหรือยาพาราเซตามอล มากเกินขนาด คือ กินเกินวันละ 8 เม็ดหรือกินต่อเนื่องกันเป็นเวลานานเกินไปจะทำให้มีผลเสียต่อตับ ทำให้เกิดสภาวะตับอักเสบ คลื่นไส้อาเจียน และถ้าเซลล์ตับถูกทำลายอย่างมากก็อาจส่งผลถึงแก่ชีวิตได้ ดังนั้นการกินยาแก้ปวดให้ปลอดภัย ต้องกินก็ต่อเมื่อมีอาการเท่านั้น\n"); }
    private void Sick_main_4() { textView.setText("      \tรับประทานยาลดไข้พาราเซตามอล (Paracetamol) และเช็ดตัวร่วมด้วยเมื่อมีไข้สูง แต่ในบางครั้งเมื่อมีไข้ต่ำ ๆ อาจไม่จำเป็นต้องรับประทานยาลดไข้เลยก็ได้ เพียงแต่เช็ดตัวบ่อย ๆ ก็เพียงพอแล้ว เพราะยาลดไข้เป็นเพียงยาที่ช่วยระงับหรือบรรเทาอาการไข้ได้ชั่วขณะหนึ่งเท่านั้น และเมื่อรักษาที่สาเหตุแล้วไข้ก็จะลดกลับมาเป็นปกติเอง (ยาลดไข้ที่ดีที่สุดคือยาพาราเซตามอล เพราะมีผลข้างเคียงน้อยและไม่ระเคืองต่อกระเพาะอาหาร)\n" +
            "      \tการใช้ยาพาราเซตามอล (Paracetamol) \n" +
            "       \t1.\tในผู้ใหญ่ ให้รับประทานครั้งละ 1-2 เม็ด (ชนิดเม็ด 500 มิลลิกรัม)\n" +
            "       \t2.\tในเด็กที่มีอายุน้อยกว่า 12 ปี ให้ใช้ในขนาด 10-15 มิลลิกรัม/กิโลกรัม/ครั้ง\n" +
            "       \t3.\tสามารถรับประทานซ้ำได้ทุก 4-6 ชั่วโมง โดยควรรับประทานยาเฉพาะเมื่อมีไข้สูงเท่านั้น (ตั้งแต่ 38.5 องศาเซลเซียสขึ้นไป) ถ้าไม่หายให้ซ้ำได้ทุก 4-6 ชั่วโมง สำหรับผู้ใหญ่ไม่ควรเกิน 8 เม็ดหรือ 4 กรัมต่อวัน ส่วนในเด็กไม่ควรเกิน 5 ครั้งต่อวัน ไม่ควรใช้ติดต่อกันเป็นเวลา 5 วัน เนื่องจากมีโอกาสเกิดพิษต่อตับ\n" +
            "       \t4.\tยาลดไข้เป็นเพียงแค่ยาบรรเทาอาการ ไม่ใช่ยารักษาสาเหตุที่ทำให้เกิดไข้ กล่าวคือ เมื่อรับประทานยา 1 ครั้ง ยาจะออกฤทธิ์ลดไข้หลังการรับประทานประมาณ 30 นาที และจะออกฤทธิ์สูงสุดประมาณ 1 ชั่วโมง คงสภาพอยู่ได้ 4-6 ชั่วโมง หากสาเหตุที่ทำให้เกิดไข้ยังไม่หาย เมื่อยาหมดฤทธิ์แล้วไข้ก็จะปรากฏขึ้นมาใหม่ และต้องรับประทานยาใหม่ ดังนั้น หากมีไข้สูงระหว่างมื้อยา ให้ใช้วิธีเช็ดตัวลดไข้ หากมีอาการหนาวสั่นควรให้ความอบอุ่นก่อนแล้วจึงค่อยเช็ดตัว\n" +
            "       \t5.\tไม่ควรใช้ยาแอสไพริน (Aspirin) เพราะยานี้มีข้อห้ามในการใช้มาก (เช่น ห้ามใช้ในผู้ที่อายุต่ำกว่า 19 ปี, สตรีตั้งครรภ์ในช่วง 1-2 สัปดาห์ก่อนคลอด, ผู้ป่วยที่เป็นโรคกระเพาะหรือมีแผลในกระเพาะอาหาร, ผู้ป่วยที่มีภาวะเลือดออกง่ายอย่างโรคไข้เลือดออก, ผู้ป่วยโรคหืด ลมพิษ หวัด ภูมิแพ้ ที่เคยมีอาการกำเริบจากการใช้ยาชนิดนี้ เป็นต้น) และอาจทำให้เกิดอาการแพ้ยาจนเป็นอันตรายได้ หรือหากรับประทานมากเกินขนาด อาจทำให้มีไข้สูง ซึม ชัก และเสียชีวิตได้\n" +
            "      \tรักษาแบบประคับประคองไปตามอาการ เช่น รักษาอาการปวดศีรษะ ปวดกล้ามเนื้อ ปวดเมื่อยตัว ด้วยการรับประทานยาลดไข้พาราเซตามอล หรือให้น้ำเกลือทางหลอดเลือดเมื่อผู้ป่วยมีอาการอ่อนเพลียมากหรือขาดน้ำ เป็นต้น\n"); }
    private void Sick_main_5() { textView.setText(
            "      \tบาดแผลตามร่างกายเกิดขึ้นได้จากการประสบอุบัติเหตุภายนอก เช่น ถูกของมีคมบาด หกล้ม รถชน จนเกิดความเสียหายของเนื้อเยื่อในบริเวณนั้น แผลมักปรากฏขึ้นเป็นแผลเปิดบริเวณผิวหนัง และมีเลือดไหลหรือซึมออกมาจากบาดแผล หากบาดแผลที่เกิดขึ้นมีขนาดเล็ก ตื้น หรือไม่รุนแรง ผู้ป่วยก็สามารถล้างทำความสะอาดแผลได้ด้วยตนเองที่บ้าน โดยอาจใช้ยารักษาแผลสดที่หาซื้อได้ตามร้านขายยาภายใต้คำแนะนำของเภสัชกร\n" +
            "      \tการทำแผลด้วยตนเอง\n" +
            "       \t•\tล้างสิ่งสกปรกออกจากแผล และล้างแผลให้สะอาดด้วยยาฆ่าเชื้อ\n" +
            "       \t•\tกดห้ามเลือดและยกส่วนที่เกิดแผลให้สูงขึ้น เพื่อให้เลือดหยุดไหล และลดอาการบวม\n" +
            "       \t•\tหากเป็นแผลขนาดเล็กอาจไม่ต้องปิดปากแผล แต่ในบางกรณีควรปิดหรือพันด้วยผ้าพันแผลที่ปลอดเชื้อ\n" +
            "       \t•\tรักษาความสะอาดและดูแลให้แผลแห้ง บาดแผลที่ไม่รุนแรงอาจฟื้นฟูและหายดีในเวลาไม่กี่วัน\n" +
            "       \t•\tหากเจ็บปวดจากบาดแผล อาจรับประทานยาพาราเซตามอล เพื่อบรรเทาความเจ็บปวดตามวิธีและปริมาณที่เหมาะสมที่ระบุไว้บนฉลากยา และหลีกเลี่ยงการใช้ยาแอสไพริน เพราะอาจมีผลทำให้เลือดไหลเพิ่มมากขึ้นหรือนานขึ้นได้\n" +
            "       \t•\tอาจประคบน้ำแข็งบริเวณผิวหนังรอบบาดแผลที่เป็นรอยช้ำหรือบวมในระยะแรกที่เกิดบาดแผล\n" +
            "       \t•\tรักษาสุขภาพ และพักผ่อนให้เพียงพอ\n" +
            "      \tควรรีบไปพบแพทย์เพื่อรับการรักษา และทำแผลจากแพทย์ผู้เชี่ยวชาญทันที หากเกิดแผลในลักษณะดังต่อไปนี้\n" +
            "       \t•\tบาดแผลมีขนาดใหญ่ มีความรุนแรง หรือเกิดจากอุบัติเหตุรุนแรง\n" +
            "       \t•tเป็นแผลลึกเกินกว่า 1/2 นิ้ว\n" +
            "       \t•\tแผลมีเลือดไหลไม่หยุดแม้พยายามกดห้ามเลือดแล้ว\n" +
            "       \t•\tบาดแผลมีเลือดไหลออกมาไม่หยุดอย่างต่อเนื่องเกินกว่า 20 นาที\n"); }
    private void Sick_main_6() { textView.setText(
            "      \tสิ่งที่ควรรีบทำเมื่อก้างติดคอ\n" +
            "       \t1.\tดื่มน้ำตามมาก ๆ น้ำจะช่วยพัดให้ก้างปลาหลุดได้หากติดอยู่ไม่ลึก เช่น บริเวณแถวลำคอส่วนบนและทอนซิล ให้ลองใช้น้ำกลั้วในคออย่างแรงแล้วบ้วนทิ้ง 2 – 3 ครั้ง ถ้าก้างปักไม่ลึกก็จะหลุดออกมาได้\n" +
            "       \t2.\tดื่มน้ำมะนาว ดื่มน้ำมะนาวคั้นสดๆ เข้าไปประมาณ 1 -2 ช้อนโต๊ะ เนื่องจากน้ำมะนาวมีฤทธิ์เป็นกรด จะช่วยทำให้ก้างปลาอ่อนนิ่มขึ้นได้บ้าง แต่ก็อาจจะช่วยได้เฉพาะกับก้างปลาที่อ่อน ขนาดไม่ใหญ่มากนัก\n" +
            "       \t3.\tกลืนข้าวคำโต ๆ อาจจะเป็นข้าวเหนียวหรือข้าวสวย ปั้นให้เป็นก้อนกลมมีขนาดเท่าประมาณลูกชิ้นลูกเล็กๆ กลืนลงไปทั้งก้อนโดยไม่ต้องเคี้ยว ก้อนข้าวอาจจะช่วยดันก้างให้หลุดติดลงไปในท้อง\n" +
            "       \t4.\tใช้นิ้วมือล้วง ใช้นิ้วมือพันผ้าสะอาด ล้วงเข้าไปเขี่ยในบริเวณที่รู้สึกว่ามีก้างปลาติดอยู่ แต่ต้องทำด้วยความระมัดระวัง เพราะช่องลำคอของคนเรานั้นเต็มไปด้วยส่วนต่างๆ ที่สำคัญ หากไม่ระวังหรือนิ้วมือไม่สะอาดพออาจทำให้เกิดแผลขึ้น และอาจตามมาด้วยอาการอักเสบภายในช่องปากได้\n" +
            "       \t5.\tใช้อุปกรณ์คีบออกเองในกรณีที่อ้าปากแล้วมองเห็นก้างปลาติดอยู่ที่คอหรือต่อมทอนซิลอย่างชัดเจน ก็สามารถใช้ไฟฉายส่องดูภายในลำคอ แล้วใช้ช้อนหรือแผ่นไม้กดลิ้นลงด้วยมือข้างหนึ่ง แล้วใช้อุปกรณ์คีบออกด้วยมืออีกข้างหนึ่ง\n" +
            "      \tหากลองทำทุกวิธีแล้วยังไม่ได้ผล ควรต้องไปพบแพทย์โดยเร็วที่สุด เพราะหากปล่อยเอาไว้ก้างปลาเหล่านั้นอาจจะไปทิ่มตำในส่วนที่สำคัญ อย่างเช่น หลอดอาหาร โคนลิ้น ต่อมทอลซิน การไปพบแพทย์จึงเป็นทางเลือกที่ดีที่สุด เพราะแพทย์จะมีเครื่องไม้เครื่องมือต่างๆ ที่พร้อม รวมถึงมีการรักษาที่ถูกวิธี และปลอดภัย\n"); }
    private void Sick_main_7() {

        textView.setText("      \tผดร้อน ภาษาอังกฤษคือ Heat rash, Prickly Heat หรือ Miliaria มักจะเกิดขึ้นในช่วงที่มีอากาศร้อนหรืออากาศอบอ้าว สามารถเกิดขึ้นได้ทั้งเด็กและผู้ใหญ่ โดยส่วนใหญ่แล้วผดร้อนมักจะขึ้นในบริเวณตามซอกต่าง ๆ ของร่างกายที่เสียดสีกัน อาทิ บริเวณต้นขาด้านใน ใต้รักแร้ หัวเข่า เป็นต้น ผดร้อนเป็นอาการทางผิวหนังที่ไม่อันตราย แต่ก็อาจจะก่อให้เกิดอาการคันหรือแสบได้ \n" +
                "      \tสาเหตุการเกิดผดร้อน\n" +
                "       \tผดร้อน เป็นอาการทางผิวหนังที่เกิดจากต่อมเหงื่อใต้ผิวหนังทำงานผิดปกติ โดยสาเหตุที่ทำให้เกิดผดร้อนนั้นจะแบ่งออกเป็นตามชนิดของผดร้อนดังนี้\n" +
                "        \t-\tมิเลียเรีย คริสตัลลินา (Miliaria Crystallina) \n" +
                "      \tผดร้อนชนิดนี้เป็นผดร้อนที่มีอาการรุนแรงน้อยที่สุดและมักพบได้บ่อยที่สุด เมื่อเทียบผดร้อนชนิดอื่น ๆ โดยสาเหตุเกิดจากการรั่วของท่อเหงื่อและสะสมอยู่บริเวณผิวหนังชั้นนอกสุดที่ปกคลุมด้วยผิวหนังบาง ๆ ทำให้เกิดเป็นตุ่มใส ๆ ไม่มีอาการคันและแตกเป็นสะเก็ดได้ง่าย สามารถเกิดได้ทุกส่วนของร่างกาย แต่ในผู้ใหญ่มักจะพบบริเวณลำตัวมากที่สุด ผดร้อนชนิดนี้จะเกิดขึ้นหลังจากสัมผัสอากาศร้อนมากกว่า 1-2 วันขึ้นไป เป็นผดร้อนที่พบได้บ่อยในเด็กทารก\n" +
                "        \t-\tมิเลียเรีย รูบรา (Miliaria rubra)\n" +
                "      \tเป็นผดร้อนชนิดที่ก่อให้เกิดอาการแสบและคัน เกิดจากการอุดตันของต่อมเหงื่อในผิวหนังชั้นนอก ทำให้เหงื่อไหลออกมาสะสมที่บริเวณผิวหนังชั้นนอก โดยผดร้อนชนิดนี้จะมีอาการอักเสบร่วมด้วย ทำให้เกิดบวมแดงร่วมกับอาการแสบและคัน ผดร้อนชนิดนี้สามารถกลายเป็นผดที่มีตุ่มหนองได้หากไม่ได้รับการรักษาที่ถูกวิธี\n" +
                "        \t-\tมิเลียเรีย โพรฟันดา (Miliaria profunda)\n" +
                "      \tอาการของผดร้อนชนิดนี้จะแตกต่างจากผดร้อนชนิดอื่นโดยสิ้นเชิง เพราะลักษณะของผดจะมีขนาดใหญ่ เป็นปื้นหนาสีเนื้อ มีสาเหตุมาจากการรั่วไหลของต่อมเหงื่อในชั้นหนังแท้ ส่งผลให้เหงื่อไม่สามารถไหลออกมาได้ โดยจะเกิดขึ้นหลังจากผิวหนังสัมผัสความร้อนไม่กี่ชั่วโมง ผดที่เกิดขึ้นจะไม่มีอาการคัน แต่จะทำให้ร่างกายไม่สามารถหลั่งเหงื่อออกมาเพื่อระบายความร้อน ซึ่งอาจส่งผลให้หน้ามืด และวิงเวียนได้ \n" +
                "      \tลักษณะการแตกต่างของผดกับผื่น\n" +
                "      \tผดและผื่นมองผิวเผินอาจจะคล้ายกันแต่ขอบอกเลยว่าทั้ง 2 อาการนี้ไม่ใช่อย่างเดียวกัน เพราะผดและผื่นนั้นมีสาเหตุการเกิดที่แตกต่างกัน\n" +
                "      \tโดยผดจะเกิดจากการอุดตันของต่อมเหงื่อ และมักเกิดขึ้นในช่วงที่มีอากาศร้อนจัด บ้างก็คัน บ้างก็ไม่ทำให้รู้สึกคัน แล้วแต่ชนิดของผด และเป็นอาการที่ไม่เป็นอันตราย แต่ผื่นนั้นส่วนใหญ่แล้วจะเกิดจากการแพ้ และถ้าหากเกา ผื่นก็จะยิ่งหนาและลามเป็นวงกว้างมากขึ้น จนกลายเป็นหนองหรืออักเสบ ผื่นที่เกิดขึ้นจะทำให้เกิดอาการคัน และไม่สามารถรักษาได้ด้วยยาแก้คัน แต่ต้องใช้ยาแก้แพ้ช่วยในการรักษาค่ะ\n" +
                "      \tการรักษา\n" +
                "      \tอาการของผดร้อนไม่ใช่เรื่องอันตรายหรือน่ากลัวแต่อย่างใด และสามารถรักษาให้หายได้ในเวลาไม่นาน เพราะสาเหตุเกิดจากความร้อน ดังนั้นถ้าหากผิวหนังบริเวณดังกล่าวเย็นลงก็จะทำให้อาการผดร้อนลดลงจนหายเป็นปกติค่ะ ซึ่งวิธีรักษาก็มีหลากหลายวิธีดังนี้\n" +
                "       \t- ใช้ครีมรักษาอาการคันที่มีขายตามร้านขายยาทั่วไป หรือคาลาไมน์ เพื่อบรรเทาอาการแสบและคัน\n" +
                "       \t- ในรายที่มีการอักเสบ ควรใช้ยาทาที่มีส่วนผสมของยาปฏิชีวนะด้วย เพื่อรักษาอาการติดเชื้อที่ผิวหนังและต่อมเหงื่อ\n" +
                "       \t- เปลี่ยนมาสวมใส่เสื้อผ้าที่สามารถระบายอากาศได้ดี หรืออาบน้ำเพื่อให้ผิวหนังบริเวณที่เกิดผดร้อนเย็นลง\n" +
                "       \t- พยายามหลีกเลี่ยงไม่ให้เหงื่อสัมผัสกับบริเวณที่เป็นผดร้อน เพราะจะยิ่งทำให้แสบมากขึ้น\n" +
                "       \t- นำผ้าสะอาดชุบน้ำเย็นแล้วบิดให้หมาดประคบบริเวณที่เป็นผดร้อน เพื่อลดความร้อนของผิวหนัง\n" +
                "       \t- ใช้สมุนไพรที่มีฤทธิ์เย็น เช่น ว่านหางจระเข้ แตงกวา เปลือกแตงโม ขมิ้นชัน เป็นต้น ทาบริเวณที่เป็นผดร้อนก็จะช่วยบรรเทาอาการได้\n" +
                "      \tปกติแล้วผดร้อนเป็นอาการที่สามารถรักษาด้วยตนเองได้และไม่จำเป็นต้องไปพบแพทย์ แต่ถ้าเกิดผดร้อนติดต่อกันเป็นเวลานาน และมีไข้ ตัวเย็น เจ็บบริเวณที่เป็นผดร้อนมากผิดปกติ หรือมีหนองออกมาจากแผลผดร้อน ควรรีบไปพบแพทย์ เพราะนั่นอาจเป็นการติดเชื้อที่ต้องได้รับการรักษาอย่างเร่งด่วน\n" +
                "      \tการป้องกัน\n" +
                "      \tแม้จะไม่สามารถหลีกหนีจากอากาศร้อน แต่เราก็ยังสามารถลดโอกาสที่จะเกิดผดร้อนได้ ดังนี้\n" +
                "       \t- หลีกเลี่ยงการสวมเสื้อผ้าฟิต ๆ พอดีตัว หรือหนาเกินไป และควรสวมเสื้อผ้าที่สามารถระบายอากาศได้\n" +
                "       \t- ไม่ควรทาครีมหรือโลชั่นบำรุงผิวหนาเกินไปเพราะจะทำให้เกิดการอุดตันที่รูขุมขน\n" +
                "       \t- หลีกเลี่ยงการอยู่ในบริเวณที่ร้อนจัด หรืออากาศอบอ้าวเป็นเวลานาน ควรอยู่ในบริเวณที่อากาศถ่ายเทและไม่ร้อนมากนัก\n" +
                "       \t- เลิกใช้สบู่ที่เหมาะกับสภาพผิว และไม่มีส่วนผสมของน้ำหอมหรือสารเคมีมากจนเกินไป เพราะสารเคมีอาจจะทำให้ต่อมเหงื่อทำงานผิดปกติได้ \n" +
                "       \t- ในวันที่อากาศร้อนจัด ควรหมั่นเช็ดตัวด้วยน้ำเย็น เพื่อให้อุณหภูมิที่ผิวหนังลดลง\n" +
                "       \t- เลี่ยงการออกกำลังกายอย่างหนักในวันที่สภาพอากาศร้อน\n");
        imagesC.setBackgroundResource(R.drawable.c7_1);}
    private void Sick_main_8() {
        textView.setText(
                "      \tเชื่อว่าหลายคนคงเคยมีอาการ “ปวด” จากการออกกำลังกาย ซึ่งอาจคิดว่าอาการปวดนั้นเป็น “สัญญาณที่ดี” เหมือนสำนวนติดปากที่ว่า “No Pain, No Gain” แต่ในความเป็นจริงอาการปวดนั้นอาจเป็นสัญญาณเตือนว่ามีอาการ “บาดเจ็บ” บางอย่างกับกล้ามเนื้อ ข้อต่อ หรือส่วนอื่นของร่างกายได้ ดังนั้นควรรู้ทันเพื่อไม่ให้อาการเหล่านี้มาทำลายความตั้งใจในการออกกำลังกายของเราได้\n" +
                "      \tลักษณะของการปวดกล้ามเนื้อจากการออกกำลังกาย \n" +
                "      \tสามารถแบ่งออกเป็นกลุ่มใหญ่ๆ ได้ 2 กลุ่ม ดังนี้\n" +
                "       \t1. อาการปวดระบม หรือปวดตึง (DOMS : Delayed Onset Muscle Soreness)\n" +
                "      \tอาการปวดกล้ามเนื้อในลักษณะนี้จะมีสาเหตุมาจากเส้นใยกล้ามเนื้อ (Muscle fiber) มีการฉีกขาด อันเนื่องมาจากมีการออกแรงหรือใช้งานมากกว่าที่เคยทำเป็นประจำโดยส่วนใหญ่แล้วจะเกิดกับคนที่เพิ่งเริ่มออกกำลังกายใหม่ๆ หรืออาจจะเกิดขึ้นกับคนที่มีการออกกำลังกายอยู่แล้ว แต่มีการปรับเปลี่ยนโปรแกรมการออกกำลังกาย เช่น เพิ่มระยะเวลาหรือความหนักของการออกกำลังกายให้สูงขึ้นกว่าที่เคยปฏิบัติอยู่ โดยปกติอาการปวดระบม หรือปวดตึงสามารถหายได้เอง\n" +
                "       \t2. อาการปวดที่เกิดจากการบาดเจ็บโดยตรง \n" +
                "      \tมีอาการปวดแบบแปล๊บๆ จี๊ดๆ ที่บริเวณกล้ามเนื้อหรือข้อต่อ อาจเกิดจากการกระแทกที่กล้ามเนื้อโดยตรง ทำให้เกิดการช้ำหรือฉีกขาด โดยสามารถเกิดขึ้นได้ทั้งขณะออกกำลังกายและหลังออกกำลังกาย อาการปวดแบบนี้จะเพิ่มมากขึ้นเมื่อมีการเคลื่อนไหวในส่วนที่บาดเจ็บ และอาการปวดอาจไม่หายไป ถึงแม้จะมีการพักร่างกายแล้วก็ตาม\n" +
                "      \tจำเป็นต้องใช้ยาคลายกล้ามเนื้อหรือยาบรรเทาปวดไหม \n" +
                "      \tโดยปกติแล้วอาการปวดจากการออกกำลังกายทั่วไปสามารถหายไปได้เอง ดังนั้นการใช้ยาคลายกล้ามเนื้อจึงแทบไม่จำเป็นต้องใช้เลย แต่หากอาการปวดนั้นส่งผลกระทบต่อการใช้ชีวิตประจำวัน ก็ควรเลือกใช้ยาบรรเทาปวดกล้ามเนื้อที่ใช้ภายนอก ใช้ตรงบริเวณจุดที่ปวด แต่หากมีอาการปวดรุนแรงอาจกินยาคลายกล้ามเนื้อร่วมด้วย แต่ควรปรึกษาแพทย์หรือเภสัชกรก่อนการใช้ยาทุกครั้ง\n" +
                "      \tเทคนิคป้องกันและบรรเทาอาการปวดกล้ามเนื้อ\n" +
                "      \tสามารถลดความเสี่ยงและความรุนแรงของอาการปวดอักเสบกล้ามเนื้อจากการออกกำลังกายได้ ด้วยวิธีดังนี้\n" +
                "       \t1. อุปกรณ์\n" +
                "      \tเราควรป้องกันไม่ให้เกิดอาการบาดเจ็บของกล้ามเนื้อด้วยการสวมอุปกรณ์ป้องกันข้อต่อหรือใส่รองเท้าที่เหมาะสมกับกีฬาที่เลือกเล่น\n" +
                "       \t2. การทำวอร์มอัพก่อนออกกำลังกาย\n" +
                "      \tช่วยเพิ่มอัตราการเต้นของหัวใจ (heart rate) ซึ่งแน่นอนว่าเป็นการส่งสัญญาณเตือนระบบกล้ามเนื้อช่วยให้กล้ามเนื้อคลายตัว เพิ่มอุณหภูมิกล้ามเนื้อ เพิ่มการไหลเวียนของระบบเลือด เพิ่มความยืดหยุ่นของเส้นเอ็นและข้อต่อ\n" +
                "       \t3. คูลดาวน์หลังออกกำลังกาย\n" +
                "      \tเป็นการเตรียมร่างกายให้กลับสู่สภาวะปกติ เพราะหลังจากออกกำลังกายระบบต่างๆ ในร่างกายจะยังคงมีค่าสูงอยู่ เช่น หัวใจเต้นเร็ว อุณหภูมิร่างกายสูง และการคูลดาวน์ยังช่วยลดภาวะกล้ามเนื้อล้าหลังจากออกกำลังกายได้เป็นอย่างดี\n" +
                "       \t4. พกผลิตภัณฑ์บรรเทาอาการปวดอักเสบกล้ามเนื้อแบบเย็น\n" +
                "      \tควรพกยาบรรเทาอาการปวดอักเสบกล้ามเนื้อที่มีตัวยาต้านอาการอักเสบที่ไม่ใช่สเตียรอยด์ เช่น ตัวยาไดโคลฟีแนค (Diclofenac) โดยอาจเลือกผลิตภัณฑ์แบบเย็น เพราะผลิตภัณฑ์บรรเทาอาการปวดอักเสบกล้ามเนื้อแบบเย็นมีคุณสมบัติทำให้เส้นเลือดหดตัวและลดอาการบวมหลังจากมีอาการบาดเจ็บกล้ามเนื้อเบื้องต้นภายใน 72 ชั่วโมง โดยไม่ควรนวดบริเวณที่ปวดเด็ดขาด เพราะจะทำให้อาการปวดอักเสบกล้ามเนื้อรุนแรงมากขึ้น ดังนั้นเราจึงควรเลือกใช้ยาบรรเทาภายนอกชนิดสเปรย์เพื่อหลีกเลี่ยงการสัมผัสบริเวณที่มีอาการอักเสบโดยตรงและลดความเสี่ยงที่จะมีการอักเสบเพิ่ม\n");
    }
    private void Sick_main_9() {
        textView.setText(
                "      \tรังแค หมายถึง เกล็ดสีขาวบนหนังศีรษะ ซึ่งจะ หลุดร่วงเมื่อแปรงหรือหวีผม เป็นสิ่งที่พบได้ในคนกว่า ร้อยละ 50 โดยเฉพาะอย่างยิ่งจะเป็นมากในช่วงอายุ ประมาณ 20 ปี\n" +
                "      \tการมีรังแคมาก ไม่ถือว่าเป็นโรคและไม่ทําให้ เกิดความผิดปกติของเส้นผมหรือการอักเสบของหนัง ศีรษะแต่อย่างใด นอกจากทําให้รําคาญและเสียบุคลิก ภาพ\n" +
                "      \tสาเหตุ \n" +
                "       \tเกล็ดรังแคเกิดจากหนังศีรษะชั้นบนสุด (ชั้นขี้ไคล) ที่ตายแล้วและหลุดลอกออกมาตามธรรมชาติ ผมบน ศีรษะอาจจะรบกวนกระบวนการหลุดลอกของชั้นขี้ไคล ทําให้มีเกล็ดหรือขุยเกิดขึ้น เนื่องจากภาวะนี้พบมาก ในวัยรุ่น จึงเชื่อว่าอาจเกิดจากการกระตุ้นของฮอร์โมน แอนโดรเจนและการทํางานของต่อมไขมันและอาจเกี่ยว ข้องกับกรรมพันธุ์ นอกจากนี้ยังพบว่า ผู้ที่มีรังแคมาก จะมีปริมาณของเชื้อรามาลัสซีเชียเฟอร์เฟอร์ (Malassezia furfur) มากกว่าคนปกติ ซึ่งสันนิษฐานว่าอาจเป็นสาเหตุ ของการเกิดรังแคได้\n" +
                "      \tอาการ\n" +
                "       \tเป็นเกล็ดหรือขุยสีขาวหรือเทาเงิน ขนาดเล็กๆ อาจ เป็นขุยละเอียด หรือเป็นแผ่น อาจเป็นเพียงแห่งเดียว หรือหลายแห่งหรืออาจเป็นทั้งหนังศีรษะก็ได้ เกล็ดรังแค จะติดค่อนข้างแน่นบนหนังศีรษะ และจะหลุดร่วงก็ต่อ เมื่อแปรงหรือหวีผม หรือเมื่อถูกลมพัด\n" +
                "      \tความรุนแรงของรังแคจะแปรผันไม่แน่นอนใน แต่ละช่วง โดยที่ไม่ทราบสาเหตุ บางรายอาจมีอาการคัน ร่วมด้วย\n" +
                "      \tการรักษา\n" +
                "       \tสระผมด้วยแชมพูที่มีตัวยารักษารังแค เช่น ซีลีเนียมซัลไฟด์ (selenium sulfide เฃ่น มีอยู่ในเซลซัน) ซิงค์ไพรไทโอน (Zinc pyrithione) น้ำมันดิน (coal tar เช่น ทาร์แชมพู) ใช้สระผมสัปดาห์ละ 2-3 ครั้ง ควรสระทิ้งไว้นาน 5-15 นาที แล้วค่อยล้างออก นอกจากนี้อาจใช้แชมพูคีโตโค- นาโซล ซึ่งมีฤทธิ์ฆ่าเชื้อรา สระผมก็ได้ผลเช่นกัน\n" +
                "      \tถ้าได้ผล ควรใช้แชมพูดังกล่าวไปเรื่อยๆ หากหยุด ใช้อาจกลับมีรังแคได้อีก\n" +
                "      \tในรายที่ใช้แชมพูดังกล่าว 2 สัปดาห์แล้วยังไม่ได้ผล หรือหนังศีรษะมีลักษณะอักเสบหรือมีอาการผิด ปกติอื่นๆ ที่สงสัยว่าอาจเป็นโรคผิวหนังชนิดอื่น ๆ ควรตรวจหาสาเหตุอื่น ๆ เพิ่มเติม \n" +
                "      \tข้อแนะนํา \n" +
                "       \tผู้ที่มีอาการรังแคที่ศีรษะที่เป็นเรื้อรัง หรือเป็น มากกว่าปกติ อาจเป็นโรคผิวหนังอักเสบชนิดเกล็ดรังแคหรืออาการแรกเริ่มของโรคโชริอาซิสก็ได้ หากสงสัยควรปรึกษาแพทย์เพื่อยืนยันการวินิจฉัย และให้การรักษาที่ถูกต้องต่อไป\n");
    }

    private void creatrToober() {
        //    Create Toobar
        Toolbar toolbar = getView().findViewById(R.id.toolberdatasick3);
        ((SickDataActivity)getActivity()).setSupportActionBar(toolbar);
        ((SickDataActivity) getActivity()).getSupportActionBar().setTitle(str);
        ((SickDataActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);//ทำปุ่มย้อนกลับมุมบน
        ((SickDataActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true); //ทำปุ่มย้อนกลับมุมบน
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.flsickdata, new SickDataMainFragment()).commit();
                // getActivity().getSupportFragmentManager().popBackStack();
            }//เม็กตอดกดให้กลับ
        });
        setHasOptionsMenu(true);
    }
}
