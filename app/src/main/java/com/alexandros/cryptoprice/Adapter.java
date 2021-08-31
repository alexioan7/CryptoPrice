package com.alexandros.cryptoprice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alexandros.cryptoprice.response.Crypto;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    List<Crypto> cryptoList;



    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView nameTextView;
        private final TextView priceTextView;
        private final ImageView cryptoLogo;




        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

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


    public Adapter(List<Crypto> cryptoList) {
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

        holder.getNameTextView().setText(cryptoList.get(position).getCoinInfo().getName().toString());
        holder.getPriceTextView().setText(cryptoList.get(position).getAggregatedData().getPrice().toString());
        Picasso.get().load(cryptoList.get(position).getCoinInfo().getImageUrl()).into(holder.cryptoLogo);

    }

    @Override
    public int getItemCount() {

        return cryptoList.size();
    }

}
