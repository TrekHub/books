
package com.example.books.utils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Pdf {

    @SerializedName("isAvailable")
    @Expose
    private Boolean isAvailable;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pdf() {
    }

    /**
     * 
     * @param isAvailable
     */
    public Pdf(Boolean isAvailable) {
        super();
        this.isAvailable = isAvailable;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
