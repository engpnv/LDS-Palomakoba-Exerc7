package com.example.exerc7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MostraAluno extends AppCompatActivity {

    TextView tv_nome, tv_endereco, tv_email;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_aluno);

        tv_nome = findViewById(R.id.tv_nome);
        tv_endereco = findViewById(R.id.tv_endereco);
        tv_email = findViewById(R.id.tv_email);

        intent = getIntent();

        tv_nome.setText("Nome: "+intent.getExtras().getString("nome"));
        tv_endereco.setText("Endereço: "+intent.getExtras().getString("endereco"));
        tv_email.setText("E-mail: "+intent.getExtras().getString("email"));

    }
}