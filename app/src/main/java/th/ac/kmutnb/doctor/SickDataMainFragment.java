package th.ac.kmutnb.doctor;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
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
public class SickDataMainFragment extends Fragment {


    public SickDataMainFragment() {
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
       // return inflater.inflate(R.layout.fragment_sick_data_main, container, false);

        View view =inflater.inflate(R.layout.fragment_sick_data_main, container, false);
        loadList = (ListView) view.findViewById(R.id.lvsickdata);
        arrayList = new ArrayList<>();
        String[] string = {"ไอ", "น้ำมูกไหล", "ปวดศรีษะ","มีไข้","เป็นแผล","ก้างติดคอ","ผดคันจากอากาศร้อน","ปวดเมื่อยจากการออกกำลังกาย","รังแค"};


        adapter = new ArrayAdapter<String>(this.context,android.R.layout.simple_list_item_1,string);
        loadList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        loadList.setAdapter(adapter);

        loadList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                String s = String.valueOf(i);
                Log.d("26JanV1", "position sickdata ==>  " + s);
                Bundle bundle = new Bundle();
                bundle.putString("num", s);
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                SickData1Fragment sickData1Fragment  = new SickData1Fragment();
                sickData1Fragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.flsickdata, sickData1Fragment);
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
