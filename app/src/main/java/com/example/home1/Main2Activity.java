package com.example.home1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView e4=findViewById(R.id.show);
       TextView e5=findViewById(R.id.date2);

        Bundle b=getIntent().getExtras();
        String first=b.getString("first");
        String lasts=b.getString("last");
        String dob=b.getString("DOB");


        e4.setText("Name :" +first + " " +lasts);
                 e5.setText(dob);




    }
}
