package com.example.admin.taxi.fragment;


import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.admin.taxi.R;
import com.example.admin.taxi.activity.BaseActivity;
import com.google.firebase.auth.FirebaseAuth;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginDriverFragment extends BaseFagment implements View.OnClickListener {
    @BindView(R.id.edt_email)
    EditText edtEmail;
    @BindView(R.id.edt_password)
    EditText edtPassword;
    @BindView(R.id.bt_login)
    Button btLogin;
    @BindView(R.id.bt_register)
    Button btRegister;
    @BindView(R.id.toolbarTitle)
    TextView toolbarTitle;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private FirebaseAuth firebaseAuth;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_driver_login;
    }

    @Override
    protected void createView(View view) {
        btLogin.setOnClickListener(this);
        btRegister.setOnClickListener(this);
        ((BaseActivity) getActivity()).setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back);
        toolbarTitle.setText("Login");
        firebaseAuth = FirebaseAuth.getInstance();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login:
                doLogin();
                break;
            case R.id.bt_register:
                break;
        }
    }

    private void doLogin() {
    }

}
