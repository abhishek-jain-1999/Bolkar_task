package com.example.bolkar_task.dataHolder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Awesome Pojo Generator
 * */
public class AllDataClass{
  @SerializedName("data")
  @Expose
  private List<Data> data;
  @SerializedName("title")
  @Expose
  private String title;
  public void setData(List<Data> data){
   this.data=data;
  }
  public List<Data> getData(){
   return data;
  }
  public void setTitle(String title){
   this.title=title;
  }
  public String getTitle(){
   return title;
  }
}