package th.ac.kmutnb.doctor;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataSickMainFragment extends Fragment {


    private View root;

    public DataSickMainFragment() {
        // Required empty public constructor
    }
    Context context;
    ListView loadList;
    ArrayAdapter adapter;
    ArrayList<String> arrayList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_data_sick_main, container, false);

        loadList = (ListView) view.findViewById(R.id.lvdatasick);
        arrayList = new ArrayList<>();
        String[] string = {"โรคไข้หวัด", "โรคหวัดภูมิแพ้", "โรคบ้านหมุนจากการเปลี่ยนท่า","โรคไมเกรน","โรคขาดวิตามินเอ","โรคกระเพาะปัสสาวะอักเสบ","โรคกระเพาะอักเสบ","โรคขาดวิตามินซี","โรคท้องเดินหรืออุจจาระร่วง"};


            adapter = new ArrayAdapter<String>(this.context,android.R.layout.simple_list_item_1,string);

            loadList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
            loadList.setAdapter(adapter);

        loadList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
//              ส่งค่าเลเยอร์ที่กดไปยัง ข้อมูลโรค
                String s = String.valueOf(i);
                Log.d("26JanV1", "position sickdata ==>  " + s);
                Bundle bundle = new Bundle();
                bundle.putString("num", s);
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                Datasick1Fragment datasick1Fragment = new Datasick1Fragment();
                datasick1Fragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.fldata, datasick1Fragment);
                fragmentTransaction.commit();


            }
        });


    return view;


    }
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
