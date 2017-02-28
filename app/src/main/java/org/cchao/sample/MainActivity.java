package org.cchao.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.cchao.statusbarlib.StatusBarUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StatusBarUtil.setStatusBarColor(MainActivity.this, Color.RED);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_red).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StatusBarUtil.setStatusBarColor(MainActivity.this, Color.RED);
            }
        });
        findViewById(R.id.btn_white).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StatusBarUtil.setStatusBarColor(MainActivity.this, Color.WHITE);
            }
        });
        findViewById(R.id.btn_green).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StatusBarUtil.setStatusBarColor(MainActivity.this, Color.GREEN);
            }
        });
        findViewById(R.id.btn_black).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StatusBarUtil.setStatusBarColor(MainActivity.this, Color.BLACK);
            }
        });
        findViewById(R.id.btn_transparent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StatusBarUtil.setStatusBarColor(MainActivity.this, Color.TRANSPARENT);
            }
        });
    }
}
