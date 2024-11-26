package com.example.ciclevida;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button button  = findViewById(R.id.boto1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });

        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart () {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume () {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause () {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop () {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart () {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy () {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}