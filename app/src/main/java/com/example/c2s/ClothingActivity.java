package com.example.c2s;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClothingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing);

        //button 1
        Button btn1 = findViewById(R.id.btn1);
        // Set a click listener for the button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YOUR_GOOGLE_DRIVE_FOLDER_LINK" with the actual link to your Google Drive folder
                String googleDriveFolderLink1 = "https://drive.google.com/file/d/1vIAszdC2fWaL4-tyWNm_uLtBKp4lGZbZ/view?usp=drive_link";

                // Create an intent with the ACTION_VIEW action
                Intent intent1 = new Intent(Intent.ACTION_VIEW);

                // Set the data of the intent to the Google Drive folder link
                intent1.setData(Uri.parse(googleDriveFolderLink1));

                // Start the activity with the intent
                startActivity(intent1);
            }
        });

        //button
        Button btn2 = findViewById(R.id.btn2);
        // Set a click listener for the button
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YOUR_GOOGLE_DRIVE_FOLDER_LINK" with the actual link to your Google Drive folder
                String googleDriveFolderLink2 = "https://drive.google.com/file/d/1nMQRVeQel15UhjBvHTA0_ifTrETcfcFW/view?usp=sharing";

                // Create an intent with the ACTION_VIEW action
                Intent intent2 = new Intent(Intent.ACTION_VIEW);

                // Set the data of the intent to the Google Drive folder link
                intent2.setData(Uri.parse(googleDriveFolderLink2));

                // Start the activity with the intent
                startActivity(intent2);
            }
        });

        //button 3
        Button btn3 = findViewById(R.id.btn3);
        // Set a click listener for the button
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YOUR_GOOGLE_DRIVE_FOLDER_LINK" with the actual link to your Google Drive folder
                String googleDriveFolderLink3 = "https://drive.google.com/file/d/1x6j91AQjnnES4W6b2x63645EKf4lpZSn/view?usp=sharing";

                // Create an intent with the ACTION_VIEW action
                Intent intent3 = new Intent(Intent.ACTION_VIEW);

                // Set the data of the intent to the Google Drive folder link
                intent3.setData(Uri.parse(googleDriveFolderLink3));

                // Start the activity with the intent
                startActivity(intent3);
            }
        });

        //button 4
        Button btn4 = findViewById(R.id.btn4);
        // Set a click listener for the button
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YOUR_GOOGLE_DRIVE_FOLDER_LINK" with the actual link to your Google Drive folder
                String googleDriveFolderLink4 = "https://drive.google.com/file/d/1lc2BrQjkYIwQnyVVc5P7R5P7WFtqA8MD/view?usp=sharing";

                // Create an intent with the ACTION_VIEW action
                Intent intent4 = new Intent(Intent.ACTION_VIEW);

                // Set the data of the intent to the Google Drive folder link
                intent4.setData(Uri.parse(googleDriveFolderLink4));

                // Start the activity with the intent
                startActivity(intent4);
            }
        });

        //button 5
        Button btn5 = findViewById(R.id.btn5);
        // Set a click listener for the button
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YOUR_GOOGLE_DRIVE_FOLDER_LINK" with the actual link to your Google Drive folder
                String googleDriveFolderLink5 = "https://drive.google.com/file/d/1983VyVyZcS6-A1unC4fCvLOeYa9M_3VX/view?usp=sharing";

                // Create an intent with the ACTION_VIEW action
                Intent intent5 = new Intent(Intent.ACTION_VIEW);

                // Set the data of the intent to the Google Drive folder link
                intent5.setData(Uri.parse(googleDriveFolderLink5));

                // Start the activity with the intent
                startActivity(intent5);
            }
        });

        //button 6
        Button btn6 = findViewById(R.id.btn6);
        // Set a click listener for the button
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YOUR_GOOGLE_DRIVE_FOLDER_LINK" with the actual link to your Google Drive folder
                String googleDriveFolderLink6 = "https://drive.google.com/file/d/1GtL2bLkljiWXoB1BrtN_VgYwfyCfpsVu/view?usp=sharing";

                // Create an intent with the ACTION_VIEW action
                Intent intent6 = new Intent(Intent.ACTION_VIEW);

                // Set the data of the intent to the Google Drive folder link
                intent6.setData(Uri.parse(googleDriveFolderLink6));

                // Start the activity with the intent
                startActivity(intent6);
            }
        });

        //button 7
        Button btn7 = findViewById(R.id.btn7);
        // Set a click listener for the button
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YOUR_GOOGLE_DRIVE_FOLDER_LINK" with the actual link to your Google Drive folder
                String googleDriveFolderLink7 = "https://drive.google.com/file/d/1GtL2bLkljiWXoB1BrtN_VgYwfyCfpsVu/view?usp=sharing";

                // Create an intent with the ACTION_VIEW action
                Intent intent7 = new Intent(Intent.ACTION_VIEW);

                // Set the data of the intent to the Google Drive folder link
                intent7.setData(Uri.parse(googleDriveFolderLink7));

                // Start the activity with the intent
                startActivity(intent7);
            }
        });

        //button 8
        Button btn8 = findViewById(R.id.btn8);
        // Set a click listener for the button
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YOUR_GOOGLE_DRIVE_FOLDER_LINK" with the actual link to your Google Drive folder
                String googleDriveFolderLink8 = "https://drive.google.com/file/d/1MTBqz-lGYnYxgKpgZWBUrWxw6uVExuMS/view?usp=sharing";

                // Create an intent with the ACTION_VIEW action
                Intent intent8 = new Intent(Intent.ACTION_VIEW);

                // Set the data of the intent to the Google Drive folder link
                intent8.setData(Uri.parse(googleDriveFolderLink8));

                // Start the activity with the intent
                startActivity(intent8);
            }
        });

        //button 9
        Button btn9 = findViewById(R.id.btn9);
        // Set a click listener for the button
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YOUR_GOOGLE_DRIVE_FOLDER_LINK" with the actual link to your Google Drive folder
                String googleDriveFolderLink9 = "https://drive.google.com/file/d/1WatbCagPOMFVI1CheGluWiHdV1tP4-Ya/view?usp=sharing";

                // Create an intent with the ACTION_VIEW action
                Intent intent9 = new Intent(Intent.ACTION_VIEW);

                // Set the data of the intent to the Google Drive folder link
                intent9.setData(Uri.parse(googleDriveFolderLink9));

                // Start the activity with the intent
                startActivity(intent9);
            }
        });

        //button 10
        Button btn10 = findViewById(R.id.btn10);
        // Set a click listener for the button
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YOUR_GOOGLE_DRIVE_FOLDER_LINK" with the actual link to your Google Drive folder
                String googleDriveFolderLink10 = "https://drive.google.com/file/d/1VTEWcb8-ezOrvtF4g2RKIKinFJBUG9IG/view?usp=sharing";

                // Create an intent with the ACTION_VIEW action
                Intent intent10 = new Intent(Intent.ACTION_VIEW);

                // Set the data of the intent to the Google Drive folder link
                intent10.setData(Uri.parse(googleDriveFolderLink10));

                // Start the activity with the intent
                startActivity(intent10);
            }
        });

        //button 11
        Button btn11 = findViewById(R.id.btn11);
        // Set a click listener for the button
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YOUR_GOOGLE_DRIVE_FOLDER_LINK" with the actual link to your Google Drive folder
                String googleDriveFolderLink11 = "https://drive.google.com/file/d/1L73iyhnj1KoKFQ4YgyUZjlHq_eE_Ec4X/view?usp=sharing";

                // Create an intent with the ACTION_VIEW action
                Intent intent11 = new Intent(Intent.ACTION_VIEW);

                // Set the data of the intent to the Google Drive folder link
                intent11.setData(Uri.parse(googleDriveFolderLink11));

                // Start the activity with the intent
                startActivity(intent11);
            }
        });



    }
}