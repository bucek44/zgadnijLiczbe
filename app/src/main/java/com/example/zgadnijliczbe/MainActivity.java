package com.example.zgadnijliczbe;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button[] przycik = new Button[12];
    TextView tekst ;
    Random random = new Random();
    int ileRazy = 0;

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
        tekst = findViewById(R.id.textView1);
        przycik[liczba].setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ileRazy++;
                        przycik[liczba].setBackgroundColor(Color.GREEN);
                        tekst.setText("BRAWOO ZGADŁES ZA "+ ileRazy);
                        block();

                    }
                }


        );
        for (int i = 0; i<12;i++){
            if (i!=liczba){
                int j = i;
                przycik[i].setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                przycik[j].setBackgroundColor(Color.RED);
                                if (j<liczba)
                                    przycik[j].setText(j+1 +" < iczba");
                                else if (j>liczba)
                                    przycik[j].setText(j+1 +" > iczba");
                                ileRazy++;
                                przycik[j].setTextColor(Color.WHITE);
                                przycik[j].setEnabled(false);

                            }
                        }
                );
            }
        }


    } void block(){
            for (int a = 0; a<12;a++){
                przycik[a].setEnabled(false);
                przycik[a].setTextColor(Color.WHITE);

            }
        }
}