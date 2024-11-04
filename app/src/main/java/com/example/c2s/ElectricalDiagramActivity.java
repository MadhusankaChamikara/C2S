package com.example.c2s;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;


public class ElectricalDiagramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical_diagram);

        //button 1
        Button btn1 = findViewById(R.id.btn1);
        // Set a click listener for the button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "YOUR_GOOGLE_DRIVE_FOLDER_LINK" with the actual link to your Google Drive folder
                String googleDriveFolderLink1 = "https://drive.google.com/drive/folders/19M1sFi0aaUSvxdwAJ1nYVkrdNS2yClb_?usp=sharing";

                // Create an intent with the ACTION_VIEW action
                Intent intent1 = new Intent(Intent.ACTION_VIEW);

                // Set the data of the intent to the Google Drive folder link
                intent1.setData(Uri.parse(googleDriveFolderLink1));

                // Start the activity with the intent
                startActivity(intent1);
            }
        });


//        //button
//        Button btn2 = findViewById(R.id.btn2);
//        // Set a click listener for the button
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Replace "YOUR_GOOGLE_DRIVE_FOLDER_LINK" with the actual link to your Google Drive folder
//                String googleDriveFolderLink2 = "https://drive.google.com/file/d/1nMQRVeQel15UhjBvHTA0_ifTrETcfcFW/view?usp=sharing";
//
//                // Create an intent with the ACTION_VIEW action
//                Intent intent2 = new Intent(Intent.ACTION_VIEW);
//
//                // Set the data of the intent to the Google Drive folder link
//                intent2.setData(Uri.parse(googleDriveFolderLink2));
//
//                // Start the activity with the intent
//                startActivity(intent2);
//            }
//        });
//
//        //button 3
//        Button btn3 = findViewById(R.id.btn3);
//        // Set a click listener for the button
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Replace "YOUR_GOOGLE_DRIVE_FOLDER_LINK" with the actual link to your Google Drive folder
//                String googleDriveFolderLink3 = "https://drive.google.com/file/d/1x6j91AQjnnES4W6b2x63645EKf4lpZSn/view?usp=sharing";
//
//                // Create an intent with the ACTION_VIEW action
//                Intent intent3 = new Intent(Intent.ACTION_VIEW);
//
//                // Set the data of the intent to the Google Drive folder link
//                intent3.setData(Uri.parse(googleDriveFolderLink3));
//
//                // Start the activity with the intent
//                startActivity(intent3);
//            }
//        });




    }
}