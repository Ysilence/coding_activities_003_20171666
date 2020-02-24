package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    EditText t2;
    int x=(int)(Math.random()*1000);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.right1);
        t2=(EditText)findViewById(R.id.edt1);
    }


    public void right1(View view){
        String inputText=t2.getText().toString();
        int y;
        y=Integer.parseInt(inputText);
        if(x<y){
            t1.setText("the number you guess is \n bigger");
        }
        else if (x>y){
            t1.setText("the number you guess is \n smaller");
        }
        else if (x==y){
            t1.setText("the number you guess is right");
        }

    }
}
