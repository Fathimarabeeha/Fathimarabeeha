package com.example.program2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText usernameInput, passwordInput, addressInput, genderInput, ageInput;
    Button submitButton;
    TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameInput = findViewById(R.id.username_input);
        passwordInput = findViewById(R.id.password_input);
        addressInput = findViewById(R.id.address_input);
        genderInput = findViewById(R.id.gender_input);
        ageInput = findViewById(R.id.age_input);
        submitButton = findViewById(R.id.submit_button);
        outputText = findViewById(R.id.output_text);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameInput.getText().toString();
                String password = passwordInput.getText().toString();
                String address = addressInput.getText().toString();
                String gender = genderInput.getText().toString();
                String age = ageInput.getText().toString();

                String message = "Submitted Data:\n\n" +
                        "Username: " + username + "\n" +
                        "Password: " + password + "\n" +
                        "Address: " + address + "\n" +
                        "Gender: " + gender + "\n" +
                        "Age: " + age;

                outputText.setText(message);
            }
        });
    }
}

