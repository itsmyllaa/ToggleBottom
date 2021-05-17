package com.example.toggleebotton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private TextView textResultado;
    private CheckBox  checkSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha   = findViewById(R.id.toggleSenha);
        switchSenha   = findViewById(R.id.switchSenha);
        textResultado = findViewById(R.id.textResultado);
        checkSenha    = findViewById(R.id.checkSenha);

        adicionarListener();

    }

    public void adicionarListener(){

        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });

    }

    public void enviar(View view){

        //if ( switchSenha.isChecked() ){
        //if ( toggleSenha.isChecked() ){
        if ( switchSenha.isChecked() ){
            textResultado.setText("Ligado");
        }else {
            textResultado.setText("Desligado");
        }
    }

}
