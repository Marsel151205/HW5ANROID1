package com.example.android1splashscreenandgame.data;

import com.example.android1splashscreenandgame.R;
import com.example.android1splashscreenandgame.data.models.NameModel;

import java.util.ArrayList;

public class NameData {
   public static ArrayList<NameModel> list = new ArrayList<>();

    public static ArrayList<NameModel> getName(){
        list.add(new NameModel("Marsel","05005252555", R.drawable.brand, "Kara-Balta"));
        list.add(new NameModel("Jusup","05005252555", R.drawable.brand,"Kara-Balta"));
        list.add(new NameModel("Kamilla","05005252555", R.drawable.brand,"Kara-Balta"));
        list.add(new NameModel("Adilet","05005252555", R.drawable.brand,"Kara-Balta"));
        list.add(new NameModel("Daniel","05005252555", R.drawable.brand,"Kara-Balta"));
        list.add(new NameModel("Insan","05005252555", R.drawable.brand,"Kara-Balta"));
        list.add(new NameModel("Nurdoolot","05005252555", R.drawable.brand,"Kara-Balta"));
        return list;
    }
}
