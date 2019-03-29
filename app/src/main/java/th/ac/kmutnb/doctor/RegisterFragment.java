package th.ac.kmutnb.doctor;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {

//Explicit
    private String nameString ,surnameString , genderString, heightString, weightString,ageString, userString , passwordString ;

    private boolean genderBoolean = true, heightABoolean = true , weightABoolean = true;

    public RegisterFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        creatrToober();


        // about gender
        RadioGroup radioGroup = getView().findViewById(R.id.redGender);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                genderBoolean = false;
                switch (checkedId) {
                    case R.id.redMale:
                        genderString = "Male";
                        break;
                    case R.id.redFemale:
                        genderString = "Female";
                        break;
                }
            }
        });

        //        about Height
        Spinner heightspinner = getView().findViewById(R.id.spnHeight);
        final String[] heightStrings = {"Pleass Choose Height","0-150","151-170","Over 170"};
        ArrayAdapter<String> heightStringArrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, heightStrings);
        heightspinner.setAdapter(heightStringArrayAdapter);
        heightspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                heightString = heightStrings[position];
                if (position == 0) {
                    heightABoolean = true;

                } else {
                    heightABoolean = false;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    } //Main Method

    private void creatrToober() {
        //    Create Toobar
        Toolbar toolbar = getView().findViewById(R.id.toolberRegister);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
        ((MainActivity) getActivity()).getSupportActionBar().setTitle(getString(R.string.new_register));
        ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);//ทำปุ่มย้อนกลับมุมบน
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true); //ทำปุ่มย้อนกลับมุมบน
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }//เม็กตอดกดให้กลับ
        });
        setHasOptionsMenu(true);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getItemId() == R.id.itemUpload) {
            checkValue();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
// ทั้งหมดสำหรับหารเช็คว่าใส่ครบทุกช่องหรือไม่
    private void checkValue() {

//        Get Value From EditTxet
        EditText nameEditText = getView().findViewById(R.id.edtName);
        EditText surnameEditText = getView().findViewById(R.id.edtSurName);
        EditText userEditText = getView().findViewById(R.id.edtUesr);
        EditText passwordEdText = getView().findViewById(R.id.edtPassword);

        nameString = nameEditText.getText().toString().trim();
        surnameString = surnameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEdText.getText().toString().trim();


        MyAlert myAlert = new MyAlert(getActivity());


//  เช็คความว่างเปล่า gender ,height ,weigt ,age

        if (nameString.isEmpty() || surnameString.isEmpty() || userString.isEmpty() || passwordString.isEmpty()) {
//            Have Space
            myAlert.normalDialog("Have Space", "Please Faill Every Blank");
        } else if (genderBoolean) {
//            Non Choose Gender
            myAlert.normalDialog("Non choose Gender", "Please Choose Male or Female");

        } else if (heightABoolean) {
            myAlert.normalDialog("Non Choose Height", "Please Choose Height");


        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_register,menu );
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

}
