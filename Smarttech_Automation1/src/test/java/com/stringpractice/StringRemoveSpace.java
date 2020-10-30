package com.stringpractice;

import java.util.StringTokenizer;

import org.testng.reporters.jq.Main;

public class StringRemoveSpace {
	
	  
	

	   public static void tokenizerTest() {
	
	    String name = new String("    we    came     from      Bangladesh ");
	    StringTokenizer obj = new StringTokenizer (name );
         StringBuffer sb = new StringBuffer();
       
         while(obj.hasMoreElements()) {
         sb.append(obj.nextElement()).append( " ");}
         
         System.out.println( " before remove space :" + name);
         System.out.println( " after remove space : " + sb.toString().trim());
       
}
         public static void main(String[] args) {
        	 tokenizerTest();
}  
  
   
}  
   
   
   
   
