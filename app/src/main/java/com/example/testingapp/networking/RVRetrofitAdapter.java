package com.example.testingapp.networking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.testingapp.R;

import java.util.List;

public class RVRetrofitAdapter extends RecyclerView.Adapter<RVRetrofitAdapter.RVHolderRetrofit> {

    Context mContext;
    List<ProductResult> productResults;

    public RVRetrofitAdapter(Context mContext, List<ProductResult> productResults){
        this.productResults = productResults;
        this.mContext = mContext;

    }
    @NonNull
    @Override
    public RVHolderRetrofit onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(mContext).inflate(R.layout.rv_product_item,parent,false);
        return new RVHolderRetrofit(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVHolderRetrofit holder, int position) {
        holder.tvTitle.setText(productResults.get(position).getEmail());
        holder.tvUsername.setText(productResults.get(position).getUsername());
        Glide.with(mContext)
                .load(productResults.get(position).getProfile()).placeholder(R.drawable.photo)
                .error(R.drawable.ic_launcher_background).into(holder.ivImage);

    }

    @Override
    public int getItemCount() {
        return productResults.size();
    }

    public class RVHolderRetrofit extends RecyclerView.ViewHolder {
        TextView tvTitle,tvUsername;
        ImageView ivImage;
        public RVHolderRetrofit(@NonNull View itemView){
            super(itemView);
            ivImage = itemView.findViewById(R.id.ivImage);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvUsername = itemView.findViewById(R.id.tvUsername);
        }
    }
}
