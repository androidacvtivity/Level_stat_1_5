package com.inforegistru.levelstat.Retrofit;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Let's Create our Cl_servicii class to represent a single Cl_servicii.
 * It will implement java.io.Serializable interface, a marker interface that will allow
 *  our  class to support serialization and deserialization.
 */
public class Cl_servicii  implements Serializable {


    /**
     * Let' now come define instance fields for this class. We decorate them with
     * @SerializedName
     * attribute. Through this we are specifying the keys in our json data.
     */

    @SerializedName("id")
    private String mId;

    @SerializedName("CODUL")
    private String CODUL;

    @SerializedName("DENUMIRE")
    private String DENUMIRE;



    /**
     * Let's now come define our getter and setter methods.
     */

    public String getmId() {
        return mId;
    }

    public void setmId(String id) {
        mId = id;
    }



    public  String getCODUL () {

        return CODUL;
    }

    public void setCODUL(String CODUL) {
        this.CODUL =  CODUL;

    }


    public  String getDENUMIRE () {

        return DENUMIRE;
    }

    public void setDENUMIRE(String DENUMIRE) {
        this.DENUMIRE =  DENUMIRE;

    }



    @Override
    public String toString() {
        return getDENUMIRE();
    }
}
