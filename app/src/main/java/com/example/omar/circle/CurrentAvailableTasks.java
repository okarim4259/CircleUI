package com.example.omar.circle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CurrentAvailableTasks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_available_tasks);
    }

    //Code to go to task info Activity
    public void viewTaskInfo(View view){
        Intent viewTaskInfo = new Intent(this, TaskInfo.class);
        startActivity(viewTaskInfo);
    }

}
