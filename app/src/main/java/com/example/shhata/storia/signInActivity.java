package com.example.shhata.storia;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signInActivity extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private FirebaseAuth mFirebaseAuth;
    private TextView Go2signUp;
    private Button signinbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Email = (EditText) findViewById(R.id.edit_email);
        Password = (EditText) findViewById(R.id.edit_password);
        mFirebaseAuth = FirebaseAuth.getInstance();
        Go2signUp = (TextView) findViewById(R.id.Sign_up);
        signinbtn = (Button) findViewById(R.id.btn_signIn);

        Go2signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(signInActivity.this,signUpActivity.class);
                startActivity(i);
            }
        });

        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog progressDialog = ProgressDialog.show(signInActivity.this,"please wait ...","Processing ...",true);
                mFirebaseAuth.signInWithEmailAndPassword(Email.getText().toString(),Password.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressDialog.dismiss();
                                if(task.isSuccessful())
                                {
                                    Toast.makeText(signInActivity.this,"Registration Successful",Toast.LENGTH_LONG).show();
                                    Intent i =new Intent(signInActivity.this,homeActivity.class);
                                    startActivity(i);
                                }
                                else
                                {
                                    Toast.makeText(signInActivity.this,task.getException().getMessage(),Toast.LENGTH_LONG).show();
                                }
                            }
                        });
            }
        });

    }
}
