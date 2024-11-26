package com.example.ciclevida;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        Button button  = findViewById(R.id.boto2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Toast.makeText(this,"onCreateSecond", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart () {
        super.onStart();
        Toast.makeText(this, "onStartSecond", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume () {
        super.onResume();
        Toast.makeText(this, "onResumeSecond", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause () {
        super.onPause();
        Toast.makeText(this, "onPauseSecond", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop () {
        super.onStop();
        Toast.makeText(this, "onStopSecond", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart () {
        super.onRestart();
        Toast.makeText(this, "onRestartSecond", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy () {
        super.onDestroy();
        Toast.makeText(this, "onDestroySecond", Toast.LENGTH_SHORT).show();
    }
}