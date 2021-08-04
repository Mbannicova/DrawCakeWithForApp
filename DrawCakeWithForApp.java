import java.util.Scanner;

public class DrawCakeWithForApp {
	public static void main(String[] args) {

	       final int SMOKE  = 1; 
	       final int FIRE   = 2; 
	       final int CANDLE = 3; 
	       final int CREAM  = 4; 
	       final int BASE   = 5; 
	       
	       System.out.println("Input cake width: ");
	       Scanner in = new Scanner (System.in);
	       int width = in. nextInt();
	       		


	       for(int level=1; level<=5 ;level++) {
	           switch(level) {
	               case SMOKE:
	            	   for(int lines5=1; lines5<=2; lines5++) {
	                        for(int elements5=1; elements5<=width; elements5++) {
	                            System.out.print(".");
	                        }
	                        System.out.println();
	                        } 
	            	   break;
	            	   
	               case FIRE:
	            	   
	                        for(int elements4=1; elements4<=width; elements4++) {
	                            System.out.print("^");
	                        }
	                        System.out.println();
	                         break;
	                        
	               case CANDLE: 
	            	   
	                        for(int elements3=1; elements3<=width; elements3++) {
	                            System.out.print("|");
	                        }
	                        System.out.println();
	                        break;
	                        
	               case CREAM: 
	            	   
	                        for(int elements2=1; elements2<=width; elements2++) {
	                            System.out.print("~");
	                        }
	                        System.out.println();
	                        break;
	                        
	               case BASE:
	            	   
	                    for(int lines=1; lines<=3; lines++) {
	                        for(int elements=1; elements<=width; elements++) {
	                            System.out.print("#");
	                        }
	                        System.out.println();}
	                    
	               break;
	               
	               }// switch
	           
	       }//for main
	       
	     } //main
	}//class

	        
	    

