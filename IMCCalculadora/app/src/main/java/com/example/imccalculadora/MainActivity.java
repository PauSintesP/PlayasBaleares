package com.example.imccalculadora;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText altura;
    private EditText peso;
    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inicializar vistas
        altura = findViewById(R.id.TextAltura);
        peso = findViewById(R.id.TextPes);
        calcular = findViewById(R.id.botoCalcula);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double imc = calcularIMC();
                String resultadoIMC = evaluarIMC(imc);

                // Mostra amb la funcio de TOAST
                Toast.makeText(MainActivity.this, resultadoIMC, Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Método para calcular el IMC
    public double calcularIMC() {
        String alturaStr = altura.getText().toString();
        String pesoStr = peso.getText().toString();

        if (!alturaStr.isEmpty() && !pesoStr.isEmpty()) {
            try {
                double alturaVal = Double.parseDouble(alturaStr);
                double pesoVal = Double.parseDouble(pesoStr);

                // Validar que la altura sea mayor que 0
                if (alturaVal > 0 && pesoVal > 0) {
                    // Faig servir alturaVal * alturaVal per a poder elevar a 2
                    return pesoVal / (alturaVal * alturaVal);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        // En cas de error retornam 0 per notificar-ho
        return 0;
    }

    // defineix valora el teu pes amb funcio al resultat de IMC
    public String evaluarIMC(double imc) {
        if (imc < 18.5) {
            return "IMC: " + String.format("%.2f", imc) + " - Pes Baix";
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            return "IMC: " + String.format("%.2f", imc) + " - Pes Normal";
        }
        else if (imc >= 25 && imc <= 29.9) {
            return "IMC: " + String.format("%.2f", imc) + " - Pes Alt";
        }
        else if (imc >= 30) {
            return "IMC: " + String.format("%.2f", imc) + " - Sobrespes";
        }
        return "Valors invalids";
    }
}
