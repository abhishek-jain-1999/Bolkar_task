package com.example.bolkar_task.dataHolder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Data{
  @SerializedName("p")
  @Expose
  private String p;
  @SerializedName("pFBig")
  @Expose
  private String pFBig;
  @SerializedName("c")
  @Expose
  private String c;
  @SerializedName("t")
  @Expose
  private String t;
  @SerializedName("d")
  @Expose
  private String d;
  @SerializedName("pF")
  @Expose
  private String pF;
  @SerializedName("cat")
  @Expose
  private String cat;
  @SerializedName("id")
  @Expose
  private String id;
  public void setP(String p){
   this.p=p;
  }
  public String getP(){
   return p;
  }
  public void setPFBig(String pFBig){
   this.pFBig=pFBig;
  }
  public String getPFBig(){
   return pFBig;
  }
  public void setC(String c){
   this.c=c;
  }
  public String getC(){
   return c;
  }
  public void setT(String t){
   this.t=t;
  }
  public String getT(){
   return t;
  }
  public void setD(String d){
   this.d=d;
  }
  public String getD(){
   return d;
  }
  public void setPF(String pF){
   this.pF=pF;
  }
  public String getPF(){
   return pF;
  }
  public void setCat(String cat){
   this.cat=cat;
  }
  public String getCat(){
   return cat;
  }
  public void setId(String id){
   this.id=id;
  }
  public String getId(){
   return id;
  }
}