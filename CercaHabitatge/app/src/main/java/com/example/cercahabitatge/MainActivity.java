package com.example.cercahabitatge;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle InstanciaGuardada) {
        super.onCreate(InstanciaGuardada);
        setContentView(R.layout.activity_main);
        EditText textInputMunicipi = findViewById(R.id.textInputMunicipi);
        Button botoCerca = findViewById(R.id.botoCerca);
        Button botoSortir = findViewById(R.id.botoSortir);
        botoCerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String municipi = textInputMunicipi.getText().toString();
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("municipi", municipi);
                startActivity(intent);
            }
        });
        botoSortir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }
}
