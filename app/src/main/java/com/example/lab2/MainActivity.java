package com.example.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import static com.example.lab2.utils.ElementsCalculator.getCharsCount;
import static com.example.lab2.utils.ElementsCalculator.getWordsCount;

public class MainActivity extends AppCompatActivity {

    Spinner ddSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ddSelection = (Spinner) findViewById(R.id.ddSelection);
        ArrayList<String> selectionOptionsList = new ArrayList<>();
        selectionOptionsList.add("Words");
        selectionOptionsList.add("Chars");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, selectionOptionsList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.ddSelection.setAdapter(arrayAdapter);
    }

    public void btnCalculateOnClick(View view) {
        EditText edUserInput = findViewById(R.id.edUserInput);
        TextView tvOutput = findViewById(R.id.tvOutput);
        String userInputText = edUserInput.getText().toString();

        String selection = this.ddSelection.getSelectedItem().toString();
        if (userInputText.isEmpty()) {
            Toast.makeText(getApplicationContext(),"There is no text", Toast.LENGTH_SHORT).show();
        }
        else if(selection.equalsIgnoreCase("Chars")){
            int count = getCharsCount(userInputText);
            tvOutput.setText(String.valueOf(count));
        }
        else if(selection.equalsIgnoreCase("Words")) {
            int count = getWordsCount(userInputText);
            tvOutput.setText(String.valueOf(count));
        }
    }
}