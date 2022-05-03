package com.example.android1splashscreenandgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.android1splashscreenandgame.adapters.NameAdapter;
import com.example.android1splashscreenandgame.data.NameData;
import com.example.android1splashscreenandgame.data.models.NameModel;
import com.example.android1splashscreenandgame.databinding.ActivityMainBinding;
import com.example.android1splashscreenandgame.interf.OnItemClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    ArrayList<NameModel> list = new ArrayList<>();
    NameAdapter nameAdapter = new NameAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        list = NameData.getName();
        nameAdapter.setData(list);
        binding.recyclerName.setAdapter(nameAdapter);
       nameAdapter.setOnItemClickListener(new OnItemClickListener() {
           @Override
           public void onItemClick(NameModel nameModel) {
               Intent intent = new Intent(MainActivity.this,InfoActivity.class);
               intent.putExtra("key",nameModel);
               startActivity(intent);
           }
       });
    }

}