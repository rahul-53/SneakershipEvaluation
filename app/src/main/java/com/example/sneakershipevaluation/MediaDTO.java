package com.example.sneakershipevaluation;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class MediaDTO implements Serializable {

	@SerializedName("imageUrl")
	private String imageUrl;

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	@Override
 	public String toString(){
		return 
			"MediaDTO{" + 
			"imageUrl = '" + imageUrl + '\'' + 
			"}";
		}
}