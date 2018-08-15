package com.example.a123.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    Button startButton;
    public void startGame(View view)
    {
        startButton.setVisibility(View.INVISIBLE);
        Log.i("Hellow","Button is pressed");
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton= (Button)findViewById(R.id.startButton);


    }
}
