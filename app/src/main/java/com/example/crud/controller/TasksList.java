package com.example.crud.controller;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.crud.R;
import com.example.crud.adapter.Adapter;
import com.example.crud.entity.Task;
import com.example.crud.model.TaskDaoRepository;

import java.util.ArrayList;
import java.util.List;

public class TasksList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks_list);

        List<Task> listTask = new TaskDaoRepository(this).findAll();

        // Configurar RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerViewTasks);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter(listTask);
        recyclerView.setAdapter(adapter);

        Intent intent = getIntent();
        if (intent.getBooleanExtra("status", false)) {
            Toast.makeText(this, "Nova tarefa adicionada com sucesso!", Toast.LENGTH_SHORT).show();
        }
    }
}