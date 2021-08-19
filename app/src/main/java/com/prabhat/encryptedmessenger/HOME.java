package com.prabhat.encryptedmessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HOME extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_o_m_e);
       // Intent intent = getIntent();
       // startActivity(intent);
    }
    public void aes(View view)
    {
        Intent intent = new Intent( HOME.this, AES.class  );
        startActivity(intent);
    }
    public void des(View view)
    {
        Intent intent = new Intent( HOME.this, DES.class  );
        startActivity(intent);
    }
    public void rsa(View view)
    {
        Intent intent = new Intent( HOME.this, RSA.class  );
        startActivity(intent);
    }
    public void md5(View view)
    {
        Intent intent = new Intent( HOME.this, MD5.class  );
        startActivity(intent);
    }
}