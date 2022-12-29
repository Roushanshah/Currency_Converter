package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
      EditText currencyeditTextNumber=(EditText) findViewById(R.id.currencyeditTextNumber);

      Double RupeeAmount=Double.parseDouble( currencyeditTextNumber.getText().toString());
      Double DollarAmount=RupeeAmount*0.012;

        Toast.makeText(MainActivity.this,"$" + String.format("%.2f", DollarAmount),Toast.LENGTH_LONG).show();

      Log.i("Amount",currencyeditTextNumber.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}