package com.example.week7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp=findViewById(R.id.fruit_items);
        tv=findViewById(R.id.fruit_txt);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life cycle","Main Activity ----> destroyed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life cycle","Main Activity ----> paused");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle","Main Activity ----> started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life cycle","Main Activity ----> Stopped");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life cycle","Main Activity ----> Resumed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life cycle","Main Activity ----> Restarted");
    }

    public void choose(View view)
    {
       tv.setText(sp.getSelectedItem().toString());

    }
    public void order(View view)
    {
        Log.d("test","The button pressed");
        Intent intent=new Intent(this,Activity2.class);// from main to move activity2
        intent.putExtra("fruit",tv.getText().toString());
        startActivity(intent);

    }
}