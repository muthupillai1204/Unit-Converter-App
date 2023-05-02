package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
        //this is (onClicklistener method)
//       button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Toast.makeText(MainActivity.this, "Hi click listener!", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.205 * kg ;
//                textview.setText("The corresponding values in Pounds is " +pound);
//
//            }
//        });
    }
    //Alternate method from above code by using (android: onClick attribute)
    public void calculate(View view){
        String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.205 * kg ;
                textview.setText("The corresponding values in Pounds is " +pound);
        Toast.makeText(this, "Thanks for using this app!", Toast.LENGTH_SHORT).show();

    }
}