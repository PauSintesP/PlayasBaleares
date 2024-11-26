package com.example.accions;

import android.media.MediaPlayer;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private ImageButton botoMusica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonWeb = findViewById(R.id.obrirweb);
        buttonWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = getString(R.string.web_url);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        Button botonLlamada = findViewById(R.id.botonLlamada);
        botonLlamada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = "123456789";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + num));
                startActivity(intent);
            }
        });

        Button botonCamara = findViewById(R.id.botofoto);
        botonCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });

        ImageButton botoMaps = findViewById(R.id.Maps);
        botoMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        ImageButton botoSortir = findViewById(R.id.salir);
        botoSortir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        botoMusica = findViewById(R.id.Play);
        botoMusica.setImageResource(R.drawable._play);
        botoMusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer == null) {
                    reproducirMusica();
                } else if (mediaPlayer.isPlaying()) {
                    pausarMusica();
                } else {
                    reanudarMusica();
                }
            }
        });
    }
    private void reproducirMusica() {
        mediaPlayer = MediaPlayer.create(this, R.raw.milmigueles);
        mediaPlayer.start();
        botoMusica.setImageResource(R.drawable._pause);
    }

    private void pausarMusica() {
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            botoMusica.setImageResource(R.drawable._play);
        }
    }
    private void reanudarMusica() {
        if (mediaPlayer != null) {
            mediaPlayer.start();
            botoMusica.setImageResource(R.drawable._pause);
        }
    }
}
