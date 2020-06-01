package com.example.sahoophone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   
    
    public boolean numberOrNot(String input)
    {
        try{
            Integer.parseInt(input);
        }
        catch (NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
    public void b1(View view)
    {

        EditText edit1 = (EditText) findViewById(R.id.edit1);
        EditText edit2 = findViewById(R.id.edit2);
        String a1= edit1.getText().toString();
        String a2= edit2.getText().toString();
        if(numberOrNot(a1)&&numberOrNot(a2)) {
            Double p1 = Double.parseDouble(a1);
            Double p2 = Double.parseDouble(a2);
            Double sum = p1 + p2;
            String str = "Sum=" + (sum.toString());
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Please provide Numbers", Toast.LENGTH_SHORT).show();
        }
    }

    public void b2(View view)
    {
        EditText edit1 = findViewById(R.id.edit1);
        EditText edit2 = findViewById(R.id.edit2);
        String a1= edit1.getText().toString();
        String a2= edit2.getText().toString();
        if(numberOrNot(a1)&&numberOrNot(a2)) {
            Double p1 = Double.parseDouble(a1);
            Double p2 = Double.parseDouble(a2);
            Double sum = p1 - p2;
            String str = "Substraction =" + sum.toString();
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Please Provide Number", Toast.LENGTH_SHORT).show();
        }
    }

    public void b3(View view) {
        EditText edit1 = findViewById(R.id.edit1);
        EditText edit2 = findViewById(R.id.edit2);
        String a1 = edit1.getText().toString();
        String a2 = edit2.getText().toString();
        if(numberOrNot(a1)&&numberOrNot(a2))
        {
        Double p1 = Double.parseDouble(a1);
        Double p2 = Double.parseDouble(a2);
        Double sum = p1 * p2;
        String str = "Multiplication =" + (sum.toString());
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
    else
    {
        Toast.makeText(this, "Please provide Numbers", Toast.LENGTH_SHORT).show();
    }
    }

    public void b4(View view) {
        EditText edit1 = findViewById(R.id.edit1);
        EditText edit2 = findViewById(R.id.edit2);
        String a1 = edit1.getText().toString();
        String a2 = edit2.getText().toString();
        if(numberOrNot(a1)&&numberOrNot(a2))
        {
        Double p1 = Double.parseDouble(a1);
        Double p2 = Double.parseDouble(a2);
        Double sum = p1 / p2;
        String str = "Divide=" + (sum.toString());
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
    else
    {
        Toast.makeText(this, "Please provide Numbers", Toast.LENGTH_SHORT).show();
    }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
           }

    public void msg_reset(View view) {
        Toast toast=Toast.makeText(this,R.string.msg_reset,Toast.LENGTH_LONG);
        toast.show();
            }
}