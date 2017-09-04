package com.example.omar.circle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UserProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
    }

    public void createNewTask(View view){
        Intent createNewTask = new Intent(this, CreateNewTask.class);
        startActivity(createNewTask);
    }

    public void viewCurrentTasks(View view){
        Intent viewCurrentTasks = new Intent(this, CurrentAvailableTasks.class);
        startActivity(viewCurrentTasks);
    }

}
