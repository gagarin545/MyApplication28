package com.example.ura.myapplication28;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String[] testarray;
    boolean flag = true;
    ImageButton butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butt = findViewById(R.id.button);
        butt.setOnClickListener(this);
        testarray = getResources().getStringArray(R.array.order);
        }


    @Override
    public void onClick(View v) {

        Toast tost = Toast.makeText(getApplicationContext(), getString(R.string.fair)  + testarray[(int) (Math.random() * 7)] , Toast.LENGTH_LONG );
        tost.show();
        if(flag)
            butt.setImageResource(R.drawable.jellyfish);
        else
            butt.setImageResource(R.drawable.koala);
        flag = !flag;
        
    }
}


