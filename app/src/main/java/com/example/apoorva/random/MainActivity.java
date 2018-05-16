package com.example.apoorva.random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n=new Random().nextInt(100);
    }
    public void check(View v)
    {

        EditText e=(EditText)findViewById(R.id.editText);
        int s=Integer.parseInt(e.getText().toString());
        if(s>n)
            Toast.makeText(this,"Number is greater",Toast.LENGTH_LONG).show();
        else if(s<n)
            Toast.makeText(this,"Number is smaller",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this,"Number is equal.You Win!!!!",Toast.LENGTH_LONG).show();
    }
}
