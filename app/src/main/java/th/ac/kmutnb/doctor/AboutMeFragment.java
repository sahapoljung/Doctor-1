package th.ac.kmutnb.doctor;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutMeFragment extends Fragment {
    String id;

    public AboutMeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView textView = getView().findViewById(R.id.txtAnalysisMain);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AnalysisActivity.class);
                intent.putExtra("idString", id);

                startActivity(intent);

            }
        });

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Intent intent = getActivity().getIntent();

        if (intent.hasExtra("id")) {
            id = getActivity().getIntent().getExtras().getString("id");
        } else {
            // Do something else
        }
        return inflater.inflate(R.layout.fragment_about_me, container, false);


    }



}
