package com.alexandros.cryptoprice.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoinInfo {


    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("FullName")
    @Expose
    private String fullName;
    @SerializedName("Internal")
    @Expose
    private String internal;
    @SerializedName("ImageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("Url")
    @Expose
    private String url;
    @SerializedName("Algorithm")
    @Expose
    private String algorithm;
    @SerializedName("ProofType")
    @Expose
    private String proofType;
    @SerializedName("TotalCoinsMined")
    @Expose
    private Integer totalCoinsMined;
    @SerializedName("BlockNumber")
    @Expose
    private Integer blockNumber;
    @SerializedName("NetHashesPerSecond")
    @Expose
    private Integer netHashesPerSecond;
    @SerializedName("BlockReward")
    @Expose
    private Double blockReward;
    @SerializedName("BlockTime")
    @Expose
    private Integer blockTime;
    @SerializedName("AssetLaunchDate")
    @Expose
    private String assetLaunchDate;
    @SerializedName("MaxSupply")
    @Expose
    private Double maxSupply;
    @SerializedName("MktCapPenalty")
    @Expose
    private Integer mktCapPenalty;
    @SerializedName("TotalVolume24H")
    @Expose
    private Double totalVolume24H;
    @SerializedName("TotalTopTierVolume24H")
    @Expose
    private Double totalTopTierVolume24H;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInternal() {
        return internal;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getProofType() {
        return proofType;
    }

    public void setProofType(String proofType) {
        this.proofType = proofType;
    }

    public Integer getTotalCoinsMined() {
        return totalCoinsMined;
    }

    public void setTotalCoinsMined(Integer totalCoinsMined) {
        this.totalCoinsMined = totalCoinsMined;
    }

    public Integer getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(Integer blockNumber) {
        this.blockNumber = blockNumber;
    }

    public Integer getNetHashesPerSecond() {
        return netHashesPerSecond;
    }

    public void setNetHashesPerSecond(Integer netHashesPerSecond) {
        this.netHashesPerSecond = netHashesPerSecond;
    }

    public Double getBlockReward() {
        return blockReward;
    }

    public void setBlockReward(Double blockReward) {
        this.blockReward = blockReward;
    }

    public Integer getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(Integer blockTime) {
        this.blockTime = blockTime;
    }

    public String getAssetLaunchDate() {
        return assetLaunchDate;
    }

    public void setAssetLaunchDate(String assetLaunchDate) {
        this.assetLaunchDate = assetLaunchDate;
    }

    public Double getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(Double maxSupply) {
        this.maxSupply = maxSupply;
    }

    public Integer getMktCapPenalty() {
        return mktCapPenalty;
    }

    public void setMktCapPenalty(Integer mktCapPenalty) {
        this.mktCapPenalty = mktCapPenalty;
    }

    public Double getTotalVolume24H() {
        return totalVolume24H;
    }

    public void setTotalVolume24H(Double totalVolume24H) {
        this.totalVolume24H = totalVolume24H;
    }

    public Double getTotalTopTierVolume24H() {
        return totalTopTierVolume24H;
    }

    public void setTotalTopTierVolume24H(Double totalTopTierVolume24H) {
        this.totalTopTierVolume24H = totalTopTierVolume24H;
    }
}
