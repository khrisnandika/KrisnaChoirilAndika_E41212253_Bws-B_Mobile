package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class RelativeLayout extends AppCompatActivity {
    DatePickerDialog picker;
    EditText eText;
    Button btnGet;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        txtView=(TextView)findViewById(R.id.textView1);
        eText=(EditText)findViewById(R.id.editText);
        eText.setInputType(InputType.TYPE_NULL);
        eText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar kalender = Calendar.getInstance();
                int day = kalender.get(Calendar.DAY_OF_MONTH);
                int month = kalender.get(Calendar.MONTH);
                int years = kalender.get(Calendar.YEAR);

                picker = new DatePickerDialog(RelativeLayout.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                        eText.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year );

                    }
                }, years, month, day);
                picker.show();
            }
        });
        btnGet=(Button) findViewById(R.id.button1);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtView.setText("Selected Date : "+eText.getText());
            }
        });

    }
}