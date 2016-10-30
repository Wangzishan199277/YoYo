package com.example.wangzishan.yoyo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btn1 = (Button) findViewById(R.id.btn_yo);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.name);
                String name = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Hello " + name, Toast.LENGTH_LONG).show();
            }
        });

    }
}
