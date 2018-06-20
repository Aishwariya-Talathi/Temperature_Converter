package edu.csulb.android.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(EditText)findViewById(R.id.editText2);
    }
    public void onClick(View view)
    {
            switch (view.getId())
            {
                case R.id.button2:
                    RadioButton CelsiusButton=(RadioButton) findViewById(R.id.radioButton4);
                    RadioButton FahrenheitButton=(RadioButton) findViewById(R.id.radioButton5);
                    if(text.getText().length()==0)
                    {
                        Toast.makeText(this,"Please Enter a valid number",Toast.LENGTH_LONG).show();
                        return;
                    }
                    float inputValue = Float.parseFloat(text.getText().toString());
                    if (CelsiusButton.isChecked())
                    {
                        text.setText(String.valueOf(ConverterUtil.convertFahrenheitToCelsius(inputValue)));
                        CelsiusButton.setChecked(false);
                        FahrenheitButton.setChecked(true);
                    }
                    else
                    {
                        text.setText(String.valueOf(ConverterUtil.convertCelsiusToFahrenheit(inputValue)));
                        FahrenheitButton.setChecked(false);
                        CelsiusButton.setChecked(true);
                    }
                    break;
            }
    }
}
