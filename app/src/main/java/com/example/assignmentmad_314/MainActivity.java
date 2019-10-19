package com.example.assignmentmad_314;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText usrname;
    EditText usrid;
    EditText usrpwd;
    Button button;
    int goodid = 1;
    String goodname = "babita";
    String goodpwd = "Welcome1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usrid = findViewById(R.id.editText5);
        usrname = findViewById(R.id.editText);
        usrpwd = findViewById(R.id.editText4);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = usrname.getText().toString();
                String password = usrpwd.getText().toString();
                int id = Integer.parseInt(usrid.getText().toString());

               Student student = new Student();
                student.Id = id ;
                student.name = name;
                student.password = password;
                if (usrid.equals(goodid)&& usrname.equals(goodname) && usrpwd.equals(goodpwd))
                {
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    intent.putExtra("username",name);

                    startActivity(intent);
                }



            }
        });

    }
}