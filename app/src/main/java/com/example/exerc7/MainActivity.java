package com.example.exerc7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv_listaAlunos;
    ArrayList<Aluno> listaDeAlunos;
    ArrayAdapter<Aluno> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_listaAlunos = findViewById(R.id.lv_listaAlunos);
        listaDeAlunos = new ArrayList<>();
        listaDeAlunos.add(new Aluno("João","Rua a","joao@email"));
        listaDeAlunos.add(new Aluno("Maria","Rua b","maria@email"));
        listaDeAlunos.add(new Aluno("Pedro","Rua c","pedro@email"));
        listaDeAlunos.add(new Aluno("Ana","Rua 2","maria@email"));

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1 , listaDeAlunos);
        lv_listaAlunos.setAdapter(adapter);
        //parte 1

        lv_listaAlunos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, MostraAluno.class);
                intent.putExtra("nome", listaDeAlunos.get(position).getNome());
                intent.putExtra("endereco", listaDeAlunos.get(position).getEndereco());
                intent.putExtra("email", listaDeAlunos.get(position).getEmail());
                startActivity(intent);
            }
        });



    }
}