package be.kdg.todo.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import be.kdg.todo.model.ToDoItem;
import be.kdg.todo.model.ToDoList;

public class ToDoDao {
    private final SQLiteDatabase database;
    private final ToDoDbHelper dbHelper;

    public ToDoDao(Context context) {
        dbHelper = new ToDoDbHelper(context);
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public ToDoItem insertToDoItem(String description) {
        // TODO
        return null;
    }

    public void deleteToDoItem(ToDoItem item) {
        // TODO
    }

    public ToDoList getAllToDoItems() {
        // TODO
        return null;
    }
}
