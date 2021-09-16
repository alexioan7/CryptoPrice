package com.alexandros.cryptoprice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;


import com.alexandros.cryptoprice.api.response_model.CryptoData;
import com.alexandros.cryptoprice.repositories.CryptoRepository;
import com.alexandros.cryptoprice.viewmodels.CryptoListViewModel;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    private CryptoListViewModel cryptoListViewModel;
    RecyclerView recyclerView;
    SwipeRefreshLayout swipeRefreshLayout;
    CryptoRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cryptoListViewModel = new ViewModelProvider(this).get(CryptoListViewModel.class);
        recyclerView = findViewById(R.id.crypto_list);
        swipeRefreshLayout = findViewById(R.id.swiperefresh);
        ObserveAnyChange();
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                ObserveAnyChange();
                swipeRefreshLayout.setRefreshing(false);
            }
        });


    }


    public void ObserveAnyChange(){
        cryptoListViewModel.getCryptos().observe(this, new Observer<List<CryptoData>>() {
            @Override
            public void onChanged(List<CryptoData> cryptoData) {
                PutDataIntoRecyclerView(cryptoData);
            }
        });
    }


    public void PutDataIntoRecyclerView(List<CryptoData> cryptoList) {
        Adapter adapter = new Adapter(this, cryptoList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}