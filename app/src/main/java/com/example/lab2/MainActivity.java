package com.example.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.lab2.utils.ElementsCalculator.getCharsCount;
import static com.example.lab2.utils.ElementsCalculator.getWordsCount;

public class MainActivity extends AppCompatActivity {

    Spinner ddSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ddSelection = (Spinner) findViewById(R.id.ddSelection);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this, R.array.counterArray, android.R.layout.simple_spinner_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.ddSelection.setAdapter(arrayAdapter);
    }

    public void btnCalculateOnClick(View view) {
        EditText edUserInput = findViewById(R.id.edUserInput);
        TextView tvOutput = findViewById(R.id.tvOutput);
        String userInputText = edUserInput.getText().toString();

        String selection = this.ddSelection.getSelectedItem().toString();

        String[] stringArray = getResources().getStringArray(R.array.counterArray);

        if (userInputText.isEmpty()) {
            Toast.makeText(getApplicationContext(), R.string.msgNoText, Toast.LENGTH_SHORT).show();
            tvOutput.setText(R.string.tvResult);
        }
        else if(selection.equalsIgnoreCase(stringArray[0].toString())){
            int count = getCharsCount(userInputText);
            tvOutput.setText(String.valueOf(count));
        }
        else if(selection.equalsIgnoreCase(stringArray[1].toString())) {
            int count = getWordsCount(userInputText);
            tvOutput.setText(String.valueOf(count));
        }
    }
}