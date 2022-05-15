package com.example.android1splashscreenandgame.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1splashscreenandgame.R;
import com.example.android1splashscreenandgame.data.models.NameModel;
import com.example.android1splashscreenandgame.databinding.ActivityInfoBinding;
import com.example.android1splashscreenandgame.databinding.ListNameHolderBinding;
import com.example.android1splashscreenandgame.interf.OnItemClickListener;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameHolder> {
    ArrayList<NameModel> list = new ArrayList<>();

    OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public NameAdapter.NameHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameHolder(ListNameHolderBinding.inflate(
                LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameAdapter.NameHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setData(ArrayList<NameModel> list) {
        this.list = list;
    }

    public class NameHolder extends RecyclerView.ViewHolder {
        private ListNameHolderBinding binding;
        private ActivityInfoBinding infoBinding;

        public NameHolder(@NonNull ListNameHolderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public NameHolder(ActivityInfoBinding infoBinding) {
            super(infoBinding.getRoot());
        }

        public void onBind(NameModel nameModel) {
            binding.tvName.setText(nameModel.getName());
            binding.tvNumber.setText(nameModel.getNumber());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickListener.onItemClick(nameModel);
                }
            });
        }
    }
}
