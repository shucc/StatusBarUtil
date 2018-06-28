package org.cchao.sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.cchao.statusbarlib.StatusBarUtil;

/**
 * Created by shucc on 17/10/31.
 * cc@cchao.org
 * 带输入框的全透明状态栏
 */
public class StatusBarTransparentActivity extends AppCompatActivity {

    public static void launch(Context context) {
        Intent starter = new Intent(context, StatusBarTransparentActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        StatusBarUtil.setTransparentStatusBar(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_bar_transparent);
        findViewById(R.id.btn_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StatusBarUtil.setTransparentStatusBar(StatusBarTransparentActivity.this);
            }
        });
        findViewById(R.id.btn_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StatusBarUtil.setSemitransparentStatusBar(StatusBarTransparentActivity.this);
            }
        });
        findViewById(R.id.btn_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StatusBarUtil.setStatusBarLightModel(StatusBarTransparentActivity.this, true);
            }
        });
        findViewById(R.id.btn_four).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StatusBarUtil.setStatusBarLightModel(StatusBarTransparentActivity.this, false);
            }
        });
    }
}
