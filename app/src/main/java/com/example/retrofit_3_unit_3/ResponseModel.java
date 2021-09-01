package com.example.retrofit_3_unit_3;


import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class ResponseModel implements Serializable {

	@SerializedName("data")
	private DataModel data;

	@SerializedName("success")
	private boolean success;

	@SerializedName("status")
	private int status;

	public DataModel getData(){
		return data;
	}

	public boolean isSuccess(){
		return success;
	}

	public int getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResponseModel{" + 
			"data = '" + data + '\'' + 
			",success = '" + success + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}