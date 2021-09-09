package com.alexandros.cryptoprice.api;



import com.alexandros.cryptoprice.api.response_model.CryptoData;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiEndpointInterface {

    @GET("coins/markets/")
    Call<List<CryptoData>> getCoinInfo(@Query("vs_currency") String fiat, @Query("order") String order, @Query("per_page") Integer per_page, @Query("page") Integer page);



}
