package com.alexandros.cryptoprice.repositories;

import android.util.Log;

import com.alexandros.cryptoprice.api.RetrofitInstance;
import com.alexandros.cryptoprice.api.response_model.CryptoData;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CryptoRepository {
    List<CryptoData> cryptoList;
    private static CryptoRepository instance;
    private MutableLiveData<List<CryptoData>> mCryptos;

    public static CryptoRepository getInstance() {
        if (instance == null) {
            instance = new CryptoRepository();
        }
        return instance;
    }

    private CryptoRepository() {
        mCryptos = new MutableLiveData<>();
    }

    public LiveData<List<CryptoData>> getCryptos() {
        return mCryptos;
    }


    public void loadCryptos(String fiat, String order, Integer per_page, Integer page) {
        Call<List<CryptoData>> call = RetrofitInstance.getRetrofitInstance().getApiService().getCoinInfo("usd", "market_cap_desc", 20, 1);
        call.enqueue(new Callback<List<CryptoData>>() {
            @Override
            public void onResponse(Call<List<CryptoData>> call, Response<List<CryptoData>> response) {
                if (!response.isSuccessful()) {
                    Log.e("Code:", String.valueOf(response.code()));
                    return;
                }

                assert response.body() != null;
                cryptoList = response.body();
                Log.i("TAG", "onResponse: " + cryptoList.size());

                mCryptos.postValue(cryptoList);


            }

            @Override
            public void onFailure(Call<List<CryptoData>> call, Throwable t) {
                Log.e("TAG", "onFailure: ", t);
            }
        });


    }


}
