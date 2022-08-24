package demo;

public class strbuffer{  
    public static void main(String[] args){  
    	
    	
        String str1 = "This is Java Weblog. ";
 
        // create StringBuffer object
        StringBuffer sb = new StringBuffer();
 
        // 1. convert String to StringBuffer
        // using append() method
        sb.append(str1);
 
        String str2 = "And there are over 500+ articles on Java.";
 
        sb.append(str2);
        System.out.println(sb);
    }  
}  
