package com.yunku.demo.tool.util;
import java.util.UUID;

public class UUIDGenerator {   
    public UUIDGenerator() {   
    }   
  
    public static String getUUID() {   
        UUID uuid = UUID.randomUUID();   
        String str = uuid.toString();   
        // 去掉"-"符号   
        String temp = str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);   
        return str+","+temp;   
    }
    public static String getUUID32(){
    	String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
	            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
	            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
	            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
	            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
	            "W", "X", "Y", "Z" };
			StringBuffer shortBuffer = new StringBuffer();
		    String uuid = UUID.randomUUID().toString().replace("-", "");
		    for (int i = 0; i < 8; i++) {
		        String str = uuid.substring(i * 4, i * 4 + 4);
		        int x = Integer.parseInt(str, 16);
		        shortBuffer.append(chars[x % 0x3E]);
		    }
		    String suffix = shortBuffer.toString();
			return suffix;
    }
    public static String getToken64(){
    	return getUUID32()+getUUID32();
    }
    public static String getCaptcha4(){
    	String uuid = getUUID32();
    	String captcha = "";
    	for(int i =0;i<4;i++){
    		int n =(int)(Math.random()*32);
    		captcha+=uuid.substring(n,n+1);
    	}
    	return captcha;
    }
    public static String getCaptcha4Num(){
    	int random = (int)((Math.random()*9+1)*1000);
    	return random+"";  
    }
}
