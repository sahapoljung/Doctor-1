package th.ac.kmutnb.doctor;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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
        String[] string = {"ไอ", "น้ำมูกไหล", "ปวดศรีษะ","มีไข้","เป็นแผล","ก้างติดคอ","ปวดเมื่อยกล้ามเนื้อจากการออกกำลังกาย","ผดคันจากอากาศร้อน"};


        adapter = new ArrayAdapter<String>(this.context,android.R.layout.simple_list_item_1,string);
        loadList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        loadList.setAdapter(adapter);

        loadList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("26JanV1", "position sickdata ==>  " + position);
                //  SparseBooleanArray checkedItemPositions = loadList.getCheckedItemPositions();
                //  int itemCount = adapter.getCount();
                //checkedItemPositions.clear();
                // adapter.notifyDataSetChanged();

            }
        });


        return view;
    }
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

}
