package com.example.khaing.unb.ModelData;

import java.util.ArrayList;

/**
 * Created by Khaing on 6/30/2018.
 */

public class MemberModel {
    private String Id;
    private String MemberName;
   // @SerializedName("length-in-seconds")
   // private String lengthInSec;
  //  @SerializedName("file-path")
    private String filePath;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String name) {
        this.MemberName = name;
    }
//
//    public String getLengthInSec() {
//        return lengthInSec;
//    }
//
//    public void setLengthInSec(String lengthInSec) {
//        this.lengthInSec = lengthInSec;
//    }

}
