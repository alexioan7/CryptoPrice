package com.alexandros.cryptoprice.viewmodels;

import com.alexandros.cryptoprice.api.response_model.CryptoData;
import com.alexandros.cryptoprice.repositories.CryptoRepository;

import java.util.List;

import androidx.lifecycle.LiveData;

import androidx.lifecycle.ViewModel;

public class CryptoListViewModel extends ViewModel {

    private CryptoRepository cryptoRepository;


    public CryptoListViewModel() {
        cryptoRepository = CryptoRepository.getInstance();
        cryptoRepository.loadCryptos("usd", "market_cap_desc", 20, 1);
    }

    public LiveData<List<CryptoData>> getCryptos() {
        return cryptoRepository.getCryptos();
    }
}
