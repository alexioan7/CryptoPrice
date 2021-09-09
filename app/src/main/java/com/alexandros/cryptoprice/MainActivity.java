package com.alexandros.cryptoprice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;


import com.alexandros.cryptoprice.api.RetrofitInstance;
import com.alexandros.cryptoprice.api.response_model.CryptoData;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<CryptoData> cryptoList;
    //CompositeDisposable disposable = new CompositeDisposable();
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cryptoList = new ArrayList<>();
        recyclerView = findViewById(R.id.crypto_list);
        loadCryptos("usd","market_cap_desc", 20, 1);
        //getCrypto();

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
                Log.i(TAG, "onResponse: "+ cryptoList.size());
                PutDataIntoRecyclerView(cryptoList);


            }

            @Override
            public void onFailure(Call<List<CryptoData>> call, Throwable t) {
                Log.e(TAG, "onFailure: ",t );
            }
        });
       // return RetrofitInstance.getRetrofitInstance().getApiService().getCoinInfo(limit, usd, apiKey);


    }



    /*
    private void getCrypto(){
        disposable.add(loadCryptos(10,"usd",API_KEY).subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribeWith(new DisposableSingleObserver<Response<JSONresponse>>() {
            @Override
            public void onSuccess(@NotNull Response<JSONresponse> jsoNresponse) {
                if (jsoNresponse.isSuccessful() && jsoNresponse.body()!= null){
                    List<Datum> tempList = jsoNresponse.body().getData();
                    for (Datum datum :tempList){
                        Log.i(TAG, "onSuccess: "+datum.getCoinInfo().getFullName());
                    }

                }
            }

            @Override
            public void onError(@NotNull Throwable e) {
                Log.i(TAG, "onError: "+e.getMessage());
            }
        }));
    }

     */

    private void PutDataIntoRecyclerView(List<CryptoData> cryptoList){
        Adapter adapter = new Adapter(this, cryptoList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}