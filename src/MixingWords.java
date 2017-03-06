import java.util.Random;
import java.util.Scanner;
public class MixingWords {
	 public static void main(String []args){
		 	
		 //Let's define a string to keep our whole sentence or words together.
		 
		 String keeper ="";
		 
		 //Input variable
		 Scanner k = new Scanner(System.in);		 
		 System.out.println("Put your words or sentence here");
		 
		 //Keeping input
		 keeper=k.nextLine();
		 
		 String modchar ;
		 
		 //Empty string to keep the changes
		 String empty ="";
		 
		 //variable a is our cycle number of mixing.
		 int a=0;
		 int counter=0;
		 
		 // we need to seperate keep the sentence as words 
		 // to check  whether we finished the word or not
		 String endOfKeeper=keeper.substring(keeper.lastIndexOf(" ")+1,keeper.length());
		 System.out.println("endOfKeeper :"+endOfKeeper);
		 
		 //char c is defined  to keep  splitted  the characters...of 
		 char []c = null;
		 //Also we need char variable to mix the chars without losing orginal one.
		 char temp;
		 //Actual length of orjinal structure.
		 int length=keeper.length();
		 
		
		//Our condition is up to empty string's length till it get equal length of actual sentence
		 
		 while(empty.length()<=length){
		 
			
			 //Checking if it got equal length at first then transfer process
			 if(keeper.length()==endOfKeeper.length()){
				c=endOfKeeper.toCharArray();
			 }
			 
			 //or 
			 else{
				 
				 //taking word by word delimetering by " "space 
			 modchar=keeper.substring(keeper.indexOf(""),keeper.indexOf(" "));
			 //after delimetered word kept in char array.
			 c=modchar.toCharArray();
			 }
			 
			 	
			 
			
			 
			 // To clean the space characters at the first column of word.
			 //and if the word less then 3 we  won't mix 
			 if(c.length>3){
				 if(c[0]==' '){
					 StringBuilder sb =new StringBuilder();
					 sb.append(c);
					 sb.deleteCharAt(0);
					 c=sb.toString().toCharArray();
			
				// This is main process which is mixing up the words by keeping both 
					 //first letter and last letter constant .
					 
					 //Also we have some rule to mix up 
					 //Mixing cycle is up to our word's length.
					 
				 }
				 do {
					 
					if(c.length==4 && c.length<6){
						 a=1;
					}
					if(c.length==6 && c.length<8){
						 a=2;
					}
					if(c.length==8 && c.length<10){
						 a=3;
					}
					if(c.length==10 && c.length<12){
						 a=4;
					}
					if(c.length>=12){
						 a=5;
					}
				
					
				 for(int i=1;i<=c.length-2;i++){
					 
						 int x=(int)(Math.random()*(c.length-2)+1);
						 temp=c[i];
						 c[i]=c[x];
						 c[x]=temp;
						 
				 	}
				 
				 	counter++;
				 }while(counter==a);
				
				 
				 
			 
			 }
			 
			 //To convert the char array of a word to a new mixed word string.
			 String out=new String(c);
			 //making one the  whole mixed word in
			 empty=empty+out+" ";
			 
			 //After process completed for a word then  we are taking our next word for next mixing.
			 keeper=keeper.substring(keeper.indexOf(" ")+1,keeper.length());
			 
			 }
		
			
		 System.out.print(empty);
		 
		 }
		
		
			
			
		
		 
	
		
		
		 
}


	 
	 
