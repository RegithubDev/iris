package com.resustainability.reisp.controller;

import org.apache.tomcat.util.IntrospectionUtils.PropertySource;
import org.jasypt.util.text.BasicTextEncryptor;

public class CustomPropertySource implements PropertySource{

	  @Override
	    public String getProperty(String key) {
	        // Implement decryption logic here
	        if (key != null && key.startsWith("ENC(") && key.endsWith(")")) {
	            // Decrypt encrypted property value
	            String encryptedValue = key.substring(4, key.length() - 1); // Remove "ENC(" and ")"
	            String decryptedValue = decrypt(encryptedValue); // Implement your decryption logic
	            return decryptedValue;
	        } else {
	            // Return as is if not encrypted
	            return key;
	        }
	    }

	    // Implement your decryption method here
	  private String decrypt(String encryptedValue) {
	        // Implement decryption logic using Jasypt or any other encryption library
	        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
	        textEncryptor.setPassword(encryptedValue);
	        return textEncryptor.decrypt(encryptedValue);
	    }

}
