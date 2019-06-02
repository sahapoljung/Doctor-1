package th.ac.kmutnb.doctor;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {

    //Explicit


    private String nameString, surnameString, genderString, heightString, weightString, ageString, userString, passwordString;
    private boolean genderBoolean = true, heightABoolean = true, weightABoolean = true, ageABoolena = true;
    String urlAddUserPHP, urladdDataPHP, urlreedPHP = "https://www.androidthai.in.th/sam/getUserWhereUserSam.php";

    String s = "0", ss, num;

    public RegisterFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        creatrToober();
        ss = "1";
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
        final String[] heightStrings = {"Pleass Choose Height", "0-150", "151-170", "Over 170"};
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


        //      about weight
        Spinner weightspinner = getView().findViewById(R.id.spnWight);
        final String[] weightStrings = {"Pleass Choose weight", "0-40", "41-60", "61-80", "Over 80"};
        ArrayAdapter<String> weightStringArrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, weightStrings);
        weightspinner.setAdapter(weightStringArrayAdapter);
        weightspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                weightString = weightStrings[position];
                if (position == 0) {
                    weightABoolean = true;

                } else {
                    weightABoolean = false;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
//          about age
        Spinner agespinner = getView().findViewById(R.id.spnAge);
        final String[] ageStrings = {"Pleass Choose age", "1-10", "11-20", "21-30", "31-40", "41-50", "51-60", "Over 60"};
        ArrayAdapter<String> ageStringArrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, ageStrings);
        agespinner.setAdapter(ageStringArrayAdapter);
        agespinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ageString = ageStrings[position];
                if (position == 0) {
                    ageABoolena = true;
                } else {
                    ageABoolena = false;
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
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);
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


        if (item.getItemId() == R.id.itemUpload) {
            checkValue();
            addUser();
            //Log.d("26JanV1", "heightStringssssss    "+ s );
            //return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void addUser() {
        if (s.equals("0")) {

            urlAddUserPHP = "https://www.androidthai.in.th/sam/addUser.php?isAdd=true" + "&Name=" + nameString + "&Surname=" + surnameString + "&Gender=" + genderString + "&Height=" + heightString
                    + "&Weight=" + weightString + "&Age=" + ageString + "&User=" + userString + "&Password=" + passwordString;

            //urlPHP = "https://www.androidthai.in.th/sam/addUser.php";

            AddUserToServer addUserToServer = new AddUserToServer(getActivity());
            addUserToServer.execute(nameString, surnameString, genderString, heightString, weightString, ageString, userString, passwordString, urlAddUserPHP);
            //addUserToServer.execute(urlPHP);

            Toast.makeText(getActivity(), "Register Success", Toast.LENGTH_LONG).show();
            addData();
            getActivity().getSupportFragmentManager().popBackStack();

        } else {
            Toast.makeText(getActivity(), "Connot Register", Toast.LENGTH_SHORT).show();
        }
    }

    private void addData() {
        try {
            GetUserWhereUserThread getUserWhereUserThread = new GetUserWhereUserThread(getActivity());
            getUserWhereUserThread.execute(userString, urlreedPHP);
            String json = getUserWhereUserThread.get();

            JSONArray jsonArray = new JSONArray(json);
            JSONObject jsonObject = jsonArray.getJSONObject(0);
            String k;
            k = jsonObject.getString("id");
            urladdDataPHP = "https://www.androidthai.in.th/sam/addData.php?isAdd=true" + "&id=" + k;
            AddDataToServer addDataToServer = new AddDataToServer(getActivity());
            addDataToServer.execute(k, urladdDataPHP);


        } catch (Exception e) {

            e.printStackTrace();
        }
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


//  เช็คความว่างเปล่า gender ,height ,weight ,age

        if (nameString.isEmpty() || surnameString.isEmpty() || userString.isEmpty() || passwordString.isEmpty()) {
//            Have Space
            myAlert.normalDialog("Have Space", "Please Faill Every Blank");
            s = "1";
        } else if (genderBoolean) {
//            Non Choose Gender
            myAlert.normalDialog("Non choose Gender", "Please Choose Male or Female");
            s = "1";

        } else if (heightABoolean) {
            myAlert.normalDialog("Non Choose Height", "Please Choose Height");
            s = "1";

        } else if (weightABoolean) {
            myAlert.normalDialog("Non Choose Weight", "Please Choose Weight");
            s = "1";

        } else if (ageABoolena) {
            myAlert.normalDialog("Non Choose Age", "Please Choose Age");
            s = "1";
        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_register, menu);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

}
