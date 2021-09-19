package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    public void clickFunction(View view) {
//        Log.i("info","Button pressed");
//        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
//        imageView.setImageResource(R.drawable.aman);
//    }
    public void clickFunction(View view) {
        Log.i("info","Button pressed");
        EditText currency = (EditText) findViewById(R.id.editCurrencyValue);
        double value=Double.parseDouble(currency.getText().toString());
        Log.i("currencyValue",currency.getText().toString());
        double indianValue = value*73.69;
        Toast.makeText(this,value +"$ is about "+indianValue+" Rs", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}