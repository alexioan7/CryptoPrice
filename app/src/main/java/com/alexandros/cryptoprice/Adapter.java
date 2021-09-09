package com.alexandros.cryptoprice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.alexandros.cryptoprice.api.response_model.CryptoData;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    List<CryptoData> cryptoList;



    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView nameTextView;
        private final TextView priceTextView;
        private final ImageView cryptoLogo;


        public ViewHolder(View view) {
            super(view);
            nameTextView = (TextView) view.findViewById(R.id.nameTextView);
            priceTextView = (TextView) view.findViewById(R.id.priceTextView);
            cryptoLogo = (ImageView) view.findViewById(R.id.imageView);
        }


        public TextView getNameTextView() {
            return nameTextView;
        }
        public TextView getPriceTextView() {
            return priceTextView;
        }
        public ImageView getCryptoLogo() {
            return cryptoLogo;
        }
    }


    public Adapter(MainActivity mainActivity, List<CryptoData> cryptoList) {
        this.cryptoList = cryptoList;
    }

    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cryptos_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {


        holder.getNameTextView().setText(cryptoList.get(position).getName());
        holder.getPriceTextView().setText(cryptoList.get(position).getCurrentPrice().toString());
        Picasso.get().load(cryptoList.get(position).getImage()).into(holder.getCryptoLogo());

    }

    @Override
    public int getItemCount() {

        return cryptoList.size();
    }

}
