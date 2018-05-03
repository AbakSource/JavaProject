package com.example.mahdi.javacoding.Utilities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.mahdi.javacoding.MyTextUtil;
import com.example.mahdi.javacoding.R;

import static com.example.mahdi.javacoding.R.id.MyTextView;
import static com.example.mahdi.javacoding.R.id.useLogo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyTextUtil util = new MyTextUtil();
        TextView Text = (TextView) findViewById(R.id.MyTextView);
        Text.setText(util.getText());



    }

}
