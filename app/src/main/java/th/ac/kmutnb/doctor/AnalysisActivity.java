package th.ac.kmutnb.doctor;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.app.PendingIntent.getActivity;

public class AnalysisActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentfinol, new AnalysisChooseFragment())
                    .commit();

        }

    }//main funtion
    @Override
    public void onBackPressed() {
        AlertDialog.Builder dialog= new AlertDialog.Builder(this);
        dialog.setTitle("Exit");
        dialog.setIcon(R.drawable.ic_action_exit);
        dialog.setCancelable(true);
        dialog.setMessage("คุณต้องการออกจากการวินิจฉัยหรือไม่");
        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        dialog.show();



    }

}
