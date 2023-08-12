package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

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
        Within this method, we can add our custom method(s) to handle and attach the events

        Creating an object named "myBtn" of type "Button"
        we need to import the Button class: import android.widget.Button;

        As we have .getElementById() in JavaScript,
        We use findViewById() method
        which is the way to target a GUI object with Android development

        The "id" is from "R" (resources)
        R.id.answerBtn (answerBtn is our answerBtn)
        */
        Button myBtn = findViewById(R.id.answerBtn);

        // As we did with JavaScript also, adding the event listener:
        /*
        For adding a click event listener => setOnClickListener()

        Example:
        myObject.setOnClickListener()

        In our code:
         > myBtn.setOnClickListener();

        HINT#1:
        After the . => myBtn. => IDE will display all the available methods

        within the setOnClickListener() parameter, creating a new view.OnClickListener

        HINT#2:
        Inside the ( ) => type "new" then "space" then Just press the TAB key
        to let the IDE generate the full method template (using the code hinting)
         */
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // adding just a testing code using .log.i():
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


                // Now adding the real code to solve the task:

                // Part#1: Getting the user input:
                // *******************************
                // Getting the user's answer from the text field of type "TextInputEditText":
                // Having a reference to input field:
                TextInputEditText txtAnswer = findViewById(R.id.txtInLayoutFavSubject);

                /*
                getting only the pure string value inside the "TextInputEditText":
                1. Getting the Text input => .getText() method
                2. Convert it into a string:
                    > String.valueOf()
                    > toString()
                */

                // The String Conversion from AS IDE suggestions:
                // String answer = String.valueOf(txtAnswer.getText());

                // OR: The String Conversion using the common way:
                String answer = txtAnswer.getText().toString();


                // Part#2: Displaying the user input:
                // **********************************
                // Same logic: get item reference then target this item
                // 1. get a reference to the id of that text field:
                // Getting the text view of the default text "Hello World!":
                TextView txtView = findViewById(R.id.textView);

                // 2. Finally :-) Place it in the text view:
                txtView.setText("Your favourite subject is: " + answer);

                // More example => getting the username :-)
                /*
                TASK For You :-)
                Modify the application to let the user enter their names:
                > using a new input field
                > reference that input field to get the user's input (name)
                > using a new text view field to display the user's name
                > target the text view field for the user's name to display the name

                NOTE:
                We can also target the outer frame "TextInputLayout"
                for input text field object in the XML design attributes

                so instead of create a reference variable of type "TextInputEditText"
                as we did above,
                we can create a reference variable of type "TextInputLayout"
                 */

                // continue by adding a new text field to display the user's name:
                // complete the code ...
            }
        });
    } // onCreate
} // MainActivity