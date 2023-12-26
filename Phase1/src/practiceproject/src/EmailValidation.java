package practiceproject.src;

import java.util.regex.*;    
import java.util.*;    
public class EmailValidation{  
    public static void main(String args[]){ 
    	
        ArrayList<String> emails = new ArrayList<String>(); 
        
        emails.add("biswaranjan@domain.co.in");  
        emails.add("biswa@domain.com");  
        emails.add("prusty.name@domain.com");  
        emails.add("biswa#@domain.co.in");  
        emails.add("ranjan@domain.com");  
        emails.add("biswaprusty@domaincom"); 
        
        //Add invalid email in list  
        emails.add("@yahoo.com");  
        emails.add("biswaranjanprusty#domain.com"); 
        
        //Regular Expression   
        String regex = "^(.+)@(.+)$";  
        
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        
        //Iterate email array list  
        for(String email : emails){  
        	
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}
