package com.example.alpin.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etFname;
    private EditText etLname;
    private EditText etUname;
    private EditText etPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFname = (EditText) findViewById(R.id.et_fname);
        etLname = (EditText) findViewById(R.id.et_lname);
        etUname = (EditText) findViewById(R.id.et_uname);
        etPass  = (EditText) findViewById(R.id.et_pass);
    }
    public void submit(View view){
        String fname = etFname.getText().toString();
        String lname = etLname.getText().toString();
        String uname = etUname.getText().toString();
        String pass  = etPass.getText().toString();

        if(fname.isEmpty()){
            etFname.setError("Firstname harus diisi");
            etFname.requestFocus();
//            return;
//            toast("First name harus diisi");
        }
        else if (lname.isEmpty()) {
            etLname.setError("Lastname harus diisi");
            etLname.requestFocus();
//            return;
//            toast("Last name harus diisi");
        }
        else if (uname.isEmpty()){
            etUname.setError("Username harus diisi");
            etUname.requestFocus();
//            return;
//            toast("Username harus diisi");
        }
        else if (pass.isEmpty()){
            etPass.setError("Password harus diisi");
            etPass.requestFocus();
//            return;
//            toast("Password harus diisi");
        }
        else toast("Succes");
    }
    private void toast(String info){
        Toast.makeText(MainActivity.this, info, Toast.LENGTH_SHORT).show();
    }

}
