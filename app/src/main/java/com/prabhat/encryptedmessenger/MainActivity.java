package com.prabhat.encryptedmessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN;

public class MainActivity extends AppCompatActivity {
    //private Button login_button;
   // String editText;
    //String editText2;
    private EditText editText;
    private EditText editText1;
    private Button login_button;
    private TextView textViewInfo;
    private int counter=5;
    private String Username="pasha";
    private final String password="1234";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        //login_button=findViewById(R.id.login_Button);
        editText =findViewById(R.id.editText);
        editText1=findViewById(R.id.editText2);
        login_button=findViewById(R.id.login_Button);
        textViewInfo =findViewById(R.id.textViewInfo);
        textViewInfo.setText("No of attempts remaining :5");
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(editText.getText().toString(),editText1.getText().toString());
            }
        });
    }
    private void validate(String name,String tpassword)
    {
        /*if((editText=="pasha") && ( editText1=="1234"))
        {
            Context context = getApplicationContext();
            Toast toast=Toast.makeText(context,"hello",Toast.LENGTH_SHORT);
            toast.show();
            Intent intent=new Intent(MainActivity.this,HOME.class);
            startActivity(intent);

        }*/
        if(name.equals(Username) && tpassword.equals(password))
        {
            Intent intent=new Intent(MainActivity.this,HOME.class);
            startActivity(intent);

        }

        else {
            counter--;
            Context context = getApplicationContext();
            CharSequence text = "Invalid username and password";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            textViewInfo.setText("no of attempts remaining:" +counter);
            if(counter==0)
            {
                login_button.setEnabled(false);
            }

        }
    }

    /*public void home(View view)
    {
        //Intent intent = new Intent(this, DisplayMessageActivity.class);
        Intent intent = new Intent( this, HOME.class  );
        startActivity(intent);
    }*/

}