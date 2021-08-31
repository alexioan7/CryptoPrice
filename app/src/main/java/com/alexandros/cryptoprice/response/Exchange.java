package com.alexandros.cryptoprice.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Exchange {
    @SerializedName("TYPE")
    @Expose
    private String type;
    @SerializedName("MARKET")
    @Expose
    private String market;
    @SerializedName("FROMSYMBOL")
    @Expose
    private String fromsymbol;
    @SerializedName("TOSYMBOL")
    @Expose
    private String tosymbol;
    @SerializedName("FLAGS")
    @Expose
    private String flags;
    @SerializedName("PRICE")
    @Expose
    private Integer price;
    @SerializedName("LASTUPDATE")
    @Expose
    private Integer lastupdate;
    @SerializedName("LASTVOLUME")
    @Expose
    private Double lastvolume;
    @SerializedName("LASTVOLUMETO")
    @Expose
    private Double lastvolumeto;
    @SerializedName("LASTTRADEID")
    @Expose
    private String lasttradeid;
    @SerializedName("VOLUMEDAY")
    @Expose
    private Double volumeday;
    @SerializedName("VOLUMEDAYTO")
    @Expose
    private Double volumedayto;
    @SerializedName("VOLUME24HOUR")
    @Expose
    private Double volume24hour;
    @SerializedName("VOLUME24HOURTO")
    @Expose
    private Double volume24hourto;
    @SerializedName("OPENDAY")
    @Expose
    private Double openday;
    @SerializedName("HIGHDAY")
    @Expose
    private Integer highday;
    @SerializedName("LOWDAY")
    @Expose
    private Integer lowday;
    @SerializedName("OPEN24HOUR")
    @Expose
    private Integer open24hour;
    @SerializedName("HIGH24HOUR")
    @Expose
    private Integer high24hour;
    @SerializedName("LOW24HOUR")
    @Expose
    private Integer low24hour;
    @SerializedName("VOLUMEHOUR")
    @Expose
    private Double volumehour;
    @SerializedName("VOLUMEHOURTO")
    @Expose
    private Double volumehourto;
    @SerializedName("OPENHOUR")
    @Expose
    private Integer openhour;
    @SerializedName("HIGHHOUR")
    @Expose
    private Integer highhour;
    @SerializedName("LOWHOUR")
    @Expose
    private Integer lowhour;
    @SerializedName("CHANGE24HOUR")
    @Expose
    private Integer change24hour;
    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    private Double changepct24hour;
    @SerializedName("CHANGEDAY")
    @Expose
    private Double changeday;
    @SerializedName("CHANGEPCTDAY")
    @Expose
    private Double changepctday;
    @SerializedName("CHANGEHOUR")
    @Expose
    private Integer changehour;
    @SerializedName("CHANGEPCTHOUR")
    @Expose
    private Double changepcthour;
    @SerializedName("CONVERSIONTYPE")
    @Expose
    private String conversiontype;
    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    private String conversionsymbol;
    @SerializedName("SUPPLY")
    @Expose
    private Integer supply;
    @SerializedName("MKTCAP")
    @Expose
    private Double mktcap;
    @SerializedName("MKTCAPPENALTY")
    @Expose
    private Integer mktcappenalty;
    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    private Integer totalvolume24hto;
    @SerializedName("TOTALVOLUME24H")
    @Expose
    private Integer totalvolume24h;
    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    private Integer totaltoptiervolume24hto;
    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    private Integer totaltoptiervolume24h;
    @SerializedName("IMAGEURL")
    @Expose
    private String imageurl;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getFromsymbol() {
        return fromsymbol;
    }

    public void setFromsymbol(String fromsymbol) {
        this.fromsymbol = fromsymbol;
    }

    public String getTosymbol() {
        return tosymbol;
    }

    public void setTosymbol(String tosymbol) {
        this.tosymbol = tosymbol;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Integer lastupdate) {
        this.lastupdate = lastupdate;
    }

    public Double getLastvolume() {
        return lastvolume;
    }

    public void setLastvolume(Double lastvolume) {
        this.lastvolume = lastvolume;
    }

    public Double getLastvolumeto() {
        return lastvolumeto;
    }

    public void setLastvolumeto(Double lastvolumeto) {
        this.lastvolumeto = lastvolumeto;
    }

    public String getLasttradeid() {
        return lasttradeid;
    }

    public void setLasttradeid(String lasttradeid) {
        this.lasttradeid = lasttradeid;
    }

    public Double getVolumeday() {
        return volumeday;
    }

    public void setVolumeday(Double volumeday) {
        this.volumeday = volumeday;
    }

    public Double getVolumedayto() {
        return volumedayto;
    }

    public void setVolumedayto(Double volumedayto) {
        this.volumedayto = volumedayto;
    }

    public Double getVolume24hour() {
        return volume24hour;
    }

    public void setVolume24hour(Double volume24hour) {
        this.volume24hour = volume24hour;
    }

    public Double getVolume24hourto() {
        return volume24hourto;
    }

    public void setVolume24hourto(Double volume24hourto) {
        this.volume24hourto = volume24hourto;
    }

    public Double getOpenday() {
        return openday;
    }

    public void setOpenday(Double openday) {
        this.openday = openday;
    }

    public Integer getHighday() {
        return highday;
    }

    public void setHighday(Integer highday) {
        this.highday = highday;
    }

    public Integer getLowday() {
        return lowday;
    }

    public void setLowday(Integer lowday) {
        this.lowday = lowday;
    }

    public Integer getOpen24hour() {
        return open24hour;
    }

    public void setOpen24hour(Integer open24hour) {
        this.open24hour = open24hour;
    }

    public Integer getHigh24hour() {
        return high24hour;
    }

    public void setHigh24hour(Integer high24hour) {
        this.high24hour = high24hour;
    }

    public Integer getLow24hour() {
        return low24hour;
    }

    public void setLow24hour(Integer low24hour) {
        this.low24hour = low24hour;
    }

    public Double getVolumehour() {
        return volumehour;
    }

    public void setVolumehour(Double volumehour) {
        this.volumehour = volumehour;
    }

    public Double getVolumehourto() {
        return volumehourto;
    }

    public void setVolumehourto(Double volumehourto) {
        this.volumehourto = volumehourto;
    }

    public Integer getOpenhour() {
        return openhour;
    }

    public void setOpenhour(Integer openhour) {
        this.openhour = openhour;
    }

    public Integer getHighhour() {
        return highhour;
    }

    public void setHighhour(Integer highhour) {
        this.highhour = highhour;
    }

    public Integer getLowhour() {
        return lowhour;
    }

    public void setLowhour(Integer lowhour) {
        this.lowhour = lowhour;
    }

    public Integer getChange24hour() {
        return change24hour;
    }

    public void setChange24hour(Integer change24hour) {
        this.change24hour = change24hour;
    }

    public Double getChangepct24hour() {
        return changepct24hour;
    }

    public void setChangepct24hour(Double changepct24hour) {
        this.changepct24hour = changepct24hour;
    }

    public Double getChangeday() {
        return changeday;
    }

    public void setChangeday(Double changeday) {
        this.changeday = changeday;
    }

    public Double getChangepctday() {
        return changepctday;
    }

    public void setChangepctday(Double changepctday) {
        this.changepctday = changepctday;
    }

    public Integer getChangehour() {
        return changehour;
    }

    public void setChangehour(Integer changehour) {
        this.changehour = changehour;
    }

    public Double getChangepcthour() {
        return changepcthour;
    }

    public void setChangepcthour(Double changepcthour) {
        this.changepcthour = changepcthour;
    }

    public String getConversiontype() {
        return conversiontype;
    }

    public void setConversiontype(String conversiontype) {
        this.conversiontype = conversiontype;
    }

    public String getConversionsymbol() {
        return conversionsymbol;
    }

    public void setConversionsymbol(String conversionsymbol) {
        this.conversionsymbol = conversionsymbol;
    }

    public Integer getSupply() {
        return supply;
    }

    public void setSupply(Integer supply) {
        this.supply = supply;
    }

    public Double getMktcap() {
        return mktcap;
    }

    public void setMktcap(Double mktcap) {
        this.mktcap = mktcap;
    }

    public Integer getMktcappenalty() {
        return mktcappenalty;
    }

    public void setMktcappenalty(Integer mktcappenalty) {
        this.mktcappenalty = mktcappenalty;
    }

    public Integer getTotalvolume24hto() {
        return totalvolume24hto;
    }

    public void setTotalvolume24hto(Integer totalvolume24hto) {
        this.totalvolume24hto = totalvolume24hto;
    }

    public Integer getTotalvolume24h() {
        return totalvolume24h;
    }

    public void setTotalvolume24h(Integer totalvolume24h) {
        this.totalvolume24h = totalvolume24h;
    }

    public Integer getTotaltoptiervolume24hto() {
        return totaltoptiervolume24hto;
    }

    public void setTotaltoptiervolume24hto(Integer totaltoptiervolume24hto) {
        this.totaltoptiervolume24hto = totaltoptiervolume24hto;
    }

    public Integer getTotaltoptiervolume24h() {
        return totaltoptiervolume24h;
    }

    public void setTotaltoptiervolume24h(Integer totaltoptiervolume24h) {
        this.totaltoptiervolume24h = totaltoptiervolume24h;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }



}
