package com.example.zgadnijliczbe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button[] przycik = new Button[12];
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        przycik[0] = findViewById(R.id.button1);
        przycik[1] = findViewById(R.id.button2);
        przycik[2] = findViewById(R.id.button3);
        przycik[3] = findViewById(R.id.button4);
        przycik[4] = findViewById(R.id.button5);
        przycik[5] = findViewById(R.id.button6);
        przycik[6] = findViewById(R.id.button7);
        przycik[7] = findViewById(R.id.button8);
        przycik[8] = findViewById(R.id.button9);
        przycik[9] = findViewById(R.id.button10);
        przycik[10] = findViewById(R.id.button11);
        przycik[11] = findViewById(R.id.button12);
        int liczba = random.nextInt(12);
        przycik[liczba].setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        przycik[liczba].setBackground("@color/green");

                    }
                }
                
        );
    }
}