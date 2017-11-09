package com.example.admin.taxi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.admin.taxi.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DriverLoginActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.edt_email)
    EditText edtEmail;
    @BindView(R.id.edt_password)
    EditText edtPassword;
    @BindView(R.id.bt_login)
    Button btLogin;
    @BindView(R.id.bt_register)
    Button btRegister;
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_driver_login;
    }

    @Override
    protected void initView() {
        btLogin.setOnClickListener(this);
        btRegister.setOnClickListener(this);
        firebaseAuth = FirebaseAuth.getInstance();
        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user != null) {
                    Intent intent = new Intent(DriverLoginActivity.this, DriverMapActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        };

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login:
                break;
            case R.id.bt_register:
                break;
        }

    }

    private boolean validateForm() {
        boolean valid = true;
        String email = edtEmail.getText().toString();
        if (TextUtils.isEmpty(email)) {
            edtEmail.setError("Required");
            valid = false;
        } else
            edtEmail.setError(null);
        String password = edtPassword.getText().toString();
        if (TextUtils.isEmpty(password)) {
            edtPassword.setError("Required");
            valid = false;
        } else
            edtPassword.setError(null);
        return valid;
    }

}
