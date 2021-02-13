package com.inforegistru.levelstat.Retrofit;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseModelCl_servicii {

    @SerializedName("resultcu")
    List<Cl_servicii> cl_servicii;

    @SerializedName("codecu")
    private String codecu;

    @SerializedName("messagecu")
    private String messagecu;


    public List<Cl_servicii> getResultCl_servicii () {return  cl_servicii;}

    public void setResultCl_servicii (List<Cl_servicii> cl_servicii) {

        this.cl_servicii = cl_servicii;
    }

    public String getCodecu () {return  codecu;}

    public void setCodecu  ( String codecu) {this.codecu = codecu;}


    public String getMessagecu () {return messagecu;}

    public void setMessagecu (String messagecu) {this.messagecu = messagecu;}

}


