package com.alexandros.cryptoprice.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Crypto {
    @SerializedName("CoinInfo")
    @Expose
    private CoinInfo coinInfo;
    @SerializedName("AggregatedData")
    @Expose
    private AggregatedData aggregatedData;
    @SerializedName("Exchanges")
    @Expose
    private List<Exchange> exchanges = null;

    public CoinInfo getCoinInfo() {
        return coinInfo;
    }

    public void setCoinInfo(CoinInfo coinInfo) {
        this.coinInfo = coinInfo;
    }

    public AggregatedData getAggregatedData() {
        return aggregatedData;
    }

    public void setAggregatedData(AggregatedData aggregatedData) {
        this.aggregatedData = aggregatedData;
    }

    public List<Exchange> getExchanges() {
        return exchanges;
    }

    public void setExchanges(List<Exchange> exchanges) {
        this.exchanges = exchanges;
    }

}
