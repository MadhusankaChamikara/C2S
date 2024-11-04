package com.example.c2s;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    CardView clothingCard;
    CardView otherCard;
    CardView electricDiagramCard;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //Slider start
        ImageSlider imageSlider = view.findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.image1, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.image2, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.image3, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.image4, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.image5, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.image6, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.image7, ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
        //Slider end


        // Find the CardView within the inflated view
        clothingCard = view.findViewById(R.id.clothingCard);
        electricDiagramCard = view.findViewById(R.id.electricDiagramCard);
        otherCard = view.findViewById(R.id.OtherCard);

        // Set up click listener for the CardView
        setupClothingCardClickListener();
        setupOtherCardClickListener();
        setupElectricDiagramCardClickListener();


        return view;


    }

    private void setupClothingCardClickListener() {
        clothingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Use the current activity context to start a new activity
                Intent intent = new Intent(getActivity(), ClothingActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupOtherCardClickListener() {
        otherCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Use the current activity context to start a new activity
                Intent intent = new Intent(getActivity(), OtherActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupElectricDiagramCardClickListener() {
        electricDiagramCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Use the current activity context to start a new activity
                Intent intent = new Intent(getActivity(), ElectricalDiagramActivity.class);
                startActivity(intent);
            }
        });
    }



}
