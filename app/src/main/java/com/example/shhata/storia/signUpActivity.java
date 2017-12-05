package com.example.shhata.storia;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signUpActivity extends AppCompatActivity {

    private EditText emailAddress;
    private EditText Password;
    private EditText confirmpass;
    private FirebaseAuth mFirebaseAuth;
    private Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        emailAddress = (EditText) findViewById(R.id.edit_Name_signUp);
        Password = (EditText) findViewById(R.id.edit_password_signUp);
        confirmpass=(EditText)findViewById(R.id.edit_password_signUp_confirm);
        mFirebaseAuth = FirebaseAuth.getInstance();
        signUp = (Button) findViewById(R.id.btn_signUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog progressDialog = ProgressDialog.show(signUpActivity.this,"please wait ...","processing ...",true);
                if(Password.getText().toString() == confirmpass.getText().toString()) {
                    (mFirebaseAuth.createUserWithEmailAndPassword(emailAddress.getText().toString(), Password.getText().toString()))
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    progressDialog.dismiss();

                                    if (task.isSuccessful()) {
                                        Toast.makeText(signUpActivity.this, "Registration Successful", Toast.LENGTH_LONG).show();
                                        Intent i = new Intent(signUpActivity.this, signInActivity.class);
                                        startActivity(i);
                                    } else {
                                        Toast.makeText(signUpActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();

                                    }
                                }
                            });
                }
                else
                    Toast.makeText(signUpActivity.this, "your password is not matching", Toast.LENGTH_LONG).show();

            }
        });

    }
}
