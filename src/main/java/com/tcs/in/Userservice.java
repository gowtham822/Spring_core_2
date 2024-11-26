package com.tcs.in;

public class Userservice {
	
	private PwdService Pwd;
	
	public void setPwd(PwdService pwd) 
	 {
			Pwd = pwd;
			
			System.out.println("setter DI");
	 }
	
	public Userservice()
	{
		System.out.println("Userservice::Constructor");
	}
	
	 public Userservice(PwdService Pwd)
	 
	 {
		this.Pwd = Pwd;
		
		System.out.println("Constructor DI");
	 }

	public void save_user(String name , String pwd , long phn)
	{
		String encode_Password = Pwd.Encode_Password(pwd);
		
		System.out.println(encode_Password);
		
		System.out.println("Saved User.....");
	}
}
