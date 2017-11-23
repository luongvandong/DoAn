package com.example.admin.taxi.activity;

import com.example.admin.taxi.R;
import com.example.admin.taxi.fragment.FragmentController;
import com.example.admin.taxi.fragment.LoginDriverFragment;

public class DriverLoginActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_driver_login;
    }

    @Override
    protected void initView() {
        FragmentController.replaceFragment(this,new LoginDriverFragment(),R.id.fram_container);
    }
  /*  private boolean validateForm() {
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
    }*/

}
