package com.example.home1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View view) {
        EditText e1=findViewById(R.id.tvfirst);
        EditText e2=findViewById(R.id.tvlast);
        TextView e3=findViewById(R.id.date);




        Intent myIntent =new Intent(this,Main2Activity.class);
        Bundle b=new Bundle();
        b.putString("first",e1.getText().toString());
        b.putString("last",e2.getText().toString());
        b.putString("DOB",e3.getText().toString());










        myIntent.putExtras(b);

        startActivity(myIntent);




    }


}
