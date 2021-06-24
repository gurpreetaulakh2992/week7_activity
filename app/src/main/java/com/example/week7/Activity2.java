package com.example.week7;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        tv=findViewById(R.id.order_view);
        Intent intent=getIntent();
        String fruit=intent.getExtras().getString("fruit");

        tv.setText("You ordered : \n"+fruit);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life cycle","Main Activity2 ----> destroyed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life cycle","Main Activity2 ----> paused");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle","Main Activity2 ----> started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life cycle","Main Activity2 ----> Stopped");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life cycle","Main Activity2 ----> Resumed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life cycle","Main Activity2 ----> Restarted");
    }
}
