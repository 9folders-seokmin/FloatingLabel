package com.ninefolders.tutorial.floatinglabel;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    TextInputLayout mEmailTextInputLayout;
    EditText mEmailEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEmailTextInputLayout = (TextInputLayout)findViewById(R.id.email_layout);
        mEmailEditText = (EditText)findViewById(R.id.email);

        Button signInBtn = (Button)findViewById(R.id.email_sign_in_button);
        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEmailEditText.getText().toString().isEmpty()) {
                    mEmailTextInputLayout.setError(getString(R.string.error_empty_email));
                } else {
                    mEmailTextInputLayout.setErrorEnabled(false);
                }
            }
        });
    }
}
