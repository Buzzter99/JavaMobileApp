package com.example.firstproject;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class TrainingRecViewAdapter extends RecyclerView.Adapter<TrainingRecViewAdapter.ViewHolder> {
    private static final String TAG = "TrainingRecViewAdapter";

    private Context mContext;

    public TrainingRecViewAdapter(Context mContext){
        this.mContext = mContext;

    }

    public TrainingRecViewAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View view = LayoutInflater.from()
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

         private TextView txtName, txtShortDesc;
         private ImageView image;
         private CardView parent;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.trainingName);
            txtShortDesc = itemView.findViewById(R.id.trainingShortDescription);

            image = itemView.findViewById(R.id.trainingImage);
            parent = itemView.findViewById(R.id.parent);



        }
    }
}
