package org.cchao.sample;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.cchao.statusbarlib.StatusBarUtil;

/**
 * Created by shucc on 18/6/27.
 * cc@cchao.org
 */
public class StatusBarColorActivity extends AppCompatActivity {

    public static void launch(Context context) {
        Intent starter = new Intent(context, StatusBarColorActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_bar_color);

        findViewById(R.id.btn_red).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StatusBarUtil.setStatusBarColor(StatusBarColorActivity.this, Color.RED);
            }
        });
        findViewById(R.id.btn_white).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StatusBarUtil.setStatusBarColor(StatusBarColorActivity.this, Color.WHITE);
            }
        });
        findViewById(R.id.btn_green).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StatusBarUtil.setStatusBarColor(StatusBarColorActivity.this, Color.GREEN);
            }
        });
        findViewById(R.id.btn_black).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StatusBarUtil.setStatusBarColor(StatusBarColorActivity.this, Color.BLACK);
            }
        });
    }
}

