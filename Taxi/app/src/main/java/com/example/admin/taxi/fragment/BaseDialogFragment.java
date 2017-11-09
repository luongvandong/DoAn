package com.example.admin.taxi.fragment;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.view.Window;

import butterknife.ButterKnife;

public abstract class BaseDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        View view = getActivity().getLayoutInflater().inflate(getLayoutId(), null);
        ButterKnife.bind(this, view);

        updateUI(view);

        dialog.setContentView(view);
        return dialog;

    }

    protected abstract int getLayoutId();

    protected abstract void updateUI(View view);
}
