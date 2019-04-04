package com.example.singleton_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private String data = "100";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,Main2Activity.class);
                MySingleton mySingleton = MySingleton.mySingleton();
//                MySingleton sing = new MySingleton(); 故意錯，將MySingleton 的建構子設成private，這樣這邊就不能用了，一定要用上一行的做法
                mySingleton.setData(data);
                startActivity(intent);
            }
        });

        button.performClick();
    }
}
