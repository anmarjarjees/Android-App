package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    /*
    This method "onCreate" is run when the activity is created
    and all the application components are ready
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Within this method, we can add our custom method to handle the click event
        create an object btn of Button
        we need to import the Button class: import android.widget.Button;
        using findViewById() method
        the id is from R (resources)
        R.id.answerBtn (answerBtn is our answerBtn)

        which is the way to target a GUI object with Android development
        */

        Button myBtn = findViewById(R.id.answerBtn);

        // As we did with JavaScript, adding the event listener:
        /*
        within the setOnClickListener(), creating a new view.OnClickListener
        HINT: Just press the TAB key to let the IDE generate the full method template (using the code hinting)
         */
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // adding our code:
                /*
                As we use alert() in JS for quick test,
                we can use Log class to quickly log (output) anything to test our code
                just to confirm that the method is called on click

                this class "Log" needs to be imported: import android.util.Log;

                using log.i() (for info) with any text:

                i() methods needs two parameters of type string:
                - string TAG
                - string Message
                */
                Log.i("btnTest","Get Answer Button");

                // adding the real code:
                // target the the text field
                TextInputEditText txtAnswer = findViewById(R.id.txtInLayouFavSubject);

                // Getting the text view of the default text "Hello World!":
                TextView textView = findViewById(R.id.textView);

                // getting the string value inside the "TextInputEditText":
                String answer = txtAnswer.getText().toString();

                // place it in the text view
                textView.setText("Your favourite subject is: "+answer);
            }
        });
    } // onCreate
} // MainActivity