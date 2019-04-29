package com.example.studentregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class Registration extends AppCompatActivity implements View.OnClickListener{

    Button bregister;
    EditText etfirstname,etlastname,etusername,etmail;
    EditText etpassword,etconfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etfirstname=(EditText) findViewById(R.id.etfirstname);
        etlastname=(EditText) findViewById(R.id.etlastname);
        etmail=(EditText) findViewById(R.id.etmail);
        etusername=(EditText) findViewById(R.id.etusername);
        etpassword=(EditText) findViewById(R.id.etpassword);
        etconfirm=(EditText) findViewById(R.id.etconfirm);


        bregister=(Button) findViewById(R.id.bregister);


        bregister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bregister:
                startActivity(new Intent(this, MainActivity.class));
             break;
        }
    }
}
