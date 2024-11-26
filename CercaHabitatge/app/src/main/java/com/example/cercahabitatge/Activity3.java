package com.example.cercahabitatge;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class Activity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle InstanciaGuardada) {
        super.onCreate(InstanciaGuardada);
        setContentView(R.layout.activity_3);
        TextView NomMunicipiDetall = findViewById(R.id.NomMunicipiDetall);
        String municipi = getIntent().getStringExtra("municipi");
        NomMunicipiDetall.setText("Municipi: " + municipi);
        Button BotoLlista = findViewById(R.id.BotoLlista);
        BotoLlista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this, Activity2.class);
                intent.putExtra("municipi", municipi);
            }});
        Button BotoContacta = findViewById(R.id.BotoContacta);
        BotoContacta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity3.this, "Contacte OK", Toast.LENGTH_SHORT).show();
            }
        });
        Button BotoSortirDetall = findViewById(R.id.BotoSortirDetall);
        BotoSortirDetall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }
}
