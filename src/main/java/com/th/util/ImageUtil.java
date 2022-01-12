package com.th.util;

import java.util.Base64;

/**
 * converts byte[] of an image to String 
 * @author Rohith S
 *
 */
public class ImageUtil {
	
	/**
	 * converts byte[] of an image to String using Base64 encoder
	 * @param byteData
	 * @return
	 */
    public String getImgData(byte[] byteData) {
        return Base64.getMimeEncoder().encodeToString(byteData);
        	
    }
}