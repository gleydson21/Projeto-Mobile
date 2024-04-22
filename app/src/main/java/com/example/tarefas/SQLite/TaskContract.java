package com.example.tarefas.SQLite;

import android.provider.BaseColumns;

public class TaskContract {

    // Defina aqui o nome da tabela e os nomes das colunas
    public static final class TaskEntry implements BaseColumns {
        public static final String TABLE_NAME = "tasks";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_DESCRIPTION = "description";
    }
}
