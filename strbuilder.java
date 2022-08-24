package demo;

public class strbuilder {
	public static void main(String[] args){  
		
        StringBuilder builder=new StringBuilder();
        
        String str1="hello hi";
        builder.append(str1); 
        String str2=" java.";
        builder.append(str2);
        
        System.out.println(builder);  
    }  

}
