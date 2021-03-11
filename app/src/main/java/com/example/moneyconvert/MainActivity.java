package com.example.moneyconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editInputMoneda, resultado;
    RadioButton btnDolar, btnEuro, btnLibra, btnYen, btnHongkones, btnFSuizo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editInputMoneda = (EditText) findViewById(R.id.Main_editTextMoneda);
        btnDolar = (RadioButton) findViewById(R.id.Main_radioButtonDolar);
        btnEuro = (RadioButton) findViewById(R.id.Main_radioButtonEuro);
        btnLibra = (RadioButton) findViewById(R.id.Main_radioButtonLibra);
        btnYen = (RadioButton) findViewById(R.id.Main_radioButtonYan);
        btnFSuizo = (RadioButton) findViewById(R.id.Main_radioButtonFrancoSuizo);
        btnHongkones = (RadioButton) findViewById(R.id.Main_radioButtonHongkones);
        resultado = (EditText) findViewById(R.id.Main_editTextPeso);
    }

    public void btnConvertir_OnClick(View v) {
        String campo = editInputMoneda.getText().toString();
        if (campo.isEmpty()) {
            return;
        }

        else if (btnDolar.isChecked()) {
            convertirADolar();
            return;
        }
        else if (btnEuro.isChecked()) {
            convertirAEuro();
            return;
        }
        else if (btnLibra.isChecked()) {
            convertirALibra(); return;
        }

        else if (btnYen.isChecked()) {
            convertirAYen();
            return;
        }
        else if (btnHongkones.isChecked()) {
            convertirAHongkones();
            return;
        }
        else if (btnFSuizo.isChecked()) {
            convertirFSuizo();
            return;
        }
    }

    public void convertirADolar() {
        double numberConverToDolar = Double.parseDouble(editInputMoneda.getText().toString()) * 58;
        resultado.setText(String.valueOf(numberConverToDolar));
    }

    public void convertirAEuro() {
        double numberConverToEuro = Double.parseDouble(editInputMoneda.getText().toString()) * 70;
        resultado.setText(String.valueOf(numberConverToEuro));
    }

    public void convertirALibra() {
        double numberConverToLibra = Double.parseDouble(editInputMoneda.getText().toString()) * 80;
        resultado.setText(String.valueOf(numberConverToLibra));
    }

    public void convertirAYen() {
        double numberConverToYen = Double.parseDouble(editInputMoneda.getText().toString()) * 0.53;
        resultado.setText(String.valueOf(numberConverToYen));
    }

    public void convertirAHongkones() {
        double numberConverToHongkones = Double.parseDouble(editInputMoneda.getText().toString()) * 0.13;
        resultado.setText(String.valueOf(numberConverToHongkones));
    }

    public void convertirFSuizo() {
        double numberConverToFSuizo = Double.parseDouble(editInputMoneda.getText().toString()) * 62.10;
        resultado.setText(String.valueOf(numberConverToFSuizo));
    }

}