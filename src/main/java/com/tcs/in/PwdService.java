package com.tcs.in;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdService {
	
	public PwdService()
	{
		System.out.println("PwdService::Constructor");
	}

	public String Encode_Password(String Pwd)
	{
		Encoder encoder = Base64.getEncoder();
		
		String encodeToString = encoder.encodeToString(Pwd.getBytes());
		
		return encodeToString;
	}
}
