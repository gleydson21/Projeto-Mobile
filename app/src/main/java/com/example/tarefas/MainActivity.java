package com.example.tarefas;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare e inicialize os botões
        Button buttonAddTask = findViewById(R.id.buttonAddTask);
        Button buttonEditTask = findViewById(R.id.buttonEditTask);
        Button buttonDeleteTask = findViewById(R.id.buttonDeleteTask);

        // Defina os listeners de clique para os botões usando expressões lambda
        buttonAddTask.setOnClickListener(v -> {
            // Implemente a lógica para adicionar uma nova tarefa aqui
        });

        buttonEditTask.setOnClickListener(v -> {
            // Implemente a lógica para editar uma tarefa aqui
        });

        buttonDeleteTask.setOnClickListener(v -> {
            // Implemente a lógica para excluir uma tarefa aqui
        });
    }
}
