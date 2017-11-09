package com.example.admin.taxi.activity;


import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.example.admin.taxi.R;

import butterknife.BindView;


public class MainActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.bt_driver)
    Button btDriver;
    @BindView(R.id.bt_customer)
    Button btCustomer;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        btDriver.setOnClickListener(this);
        btCustomer.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_customer:
                break;
            case R.id.bt_driver:
                Intent intent = new Intent(MainActivity.this, DriverLoginActivity.class);
                startActivity(intent);
                finish();
                break;
        }

    }
}
