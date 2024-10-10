package com.example.ativ_comp_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edTempoGasto, edVelocidadeMedia, edMedia;
    private TextView tv_resultado;
    private Button bt_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTempoGasto = findViewById(R.id.edTempoGasto);
        edVelocidadeMedia = findViewById(R.id.edVelocidadeMedia);
        edMedia = findViewById(R.id.edMedia);

        tv_resultado = findViewById(R.id.tv_resultado);

        bt_calcular = findViewById(R.id.bt_calcular);


        bt_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double distancia = Double.parseDouble(edTempoGasto.getText().toString()) * Double.parseDouble(edVelocidadeMedia.getText().toString());

                double litros = distancia / Double.parseDouble(edMedia.getText().toString());

                tv_resultado.setText(String.valueOf(litros));

            }
        });

    }
}