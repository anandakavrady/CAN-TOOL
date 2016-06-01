package com.test;

public class CanMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int message = 1200; //0x04B0
		int channel =1;
		
		if(channel == 0)
		{
			message =  message | 0x00000000;   //channel zero
			System.out.println("The message ID is " + Integer.toHexString(message));
		}
		else if(channel == 1)
		message = message |  0x40000000;   //channel one
		else if(channel == 2)
		message = message |  0x80000000;   //channel two
		else 
		message = message |  0xc0000000;   //channel Three
		
		
		StringBuilder sb = new StringBuilder();
		sb.append(Integer.toHexString(message));
		int length = sb.length();
		while (length < 8) {
			sb.insert(0, "0");
			length++;
		}
		String hexString = sb.toString();
		System.out.println("The message ID is " + hexString);
	}

}
