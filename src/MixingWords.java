import java.util.Random;
import java.util.Scanner;
public class MixingWords {
	 public static void main(String []args){
		 	
		 //�imdi girilen c�mleyi tutacak bir string bulay�m.
		 
		 String c�mle ="";
		 Scanner k = new Scanner(System.in);
		 System.out.println("C�mlenizi girin");
		 c�mle=k.nextLine();
		 String modchar ;
		 String bos ="";
		 int a=0;
		 int sayac=0;
		 String c�mlesonu=c�mle.substring(c�mle.lastIndexOf(" ")+1,c�mle.length());
		 char []c = null;
		 char temp;
		 int leng=c�mle.length();
		 
		
		
		 while(bos.length()<=leng){
			// System.out.println(c�mle.substring(c�mle.indexOf(""),c�mle.lastIndexOf("")));
			
			 
			 if(c�mle.length()==c�mlesonu.length()){
				c=c�mlesonu.toCharArray();
			 }
			 
				else
				{
				 modchar=c�mle.substring(c�mle.indexOf(""),c�mle.indexOf(" "));
				 c=modchar.toCharArray();
				}
			 
			 	
			 
			
			 
			 // C�mle ba�� space silme i�in
			 if(c.length>3){
				 if(c[0]==' '){
					 StringBuilder sb =new StringBuilder();
					 sb.append(c);
					 sb.deleteCharAt(0);
					 c=sb.toString().toCharArray();
			
				// ilk ve son eleman� sabit tutup harfleri kar��t�rmak i�in	 
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
				
				 for(int i=1;i<=c.length-2;i++)
				 {
				 int x=(int)(Math.random()*(c.length-2)+1);
				 temp=c[i];
				 c[i]=c[x];
				 c[x]=temp;
				 
				 }sayac++;
				 }while(sayac==a);
				 
				 
			 
			 }
			 
			 //char dizisnini stringte toplay�p eskisini silip yenisini eklmek i�in
			 String out=new String(c);
			 //kar���k char dizilierini tekrar birle�tirme
			 bos=bos+out+" ";
			 //s�radaki kelimeye ge�mek i�in
			 c�mle=c�mle.substring(c�mle.indexOf(" ")+1,c�mle.length());
			 
			 }
		
			
		 System.out.print(bos);
		 String ll=k.nextLine();
		 }
		
		
			
			
		
		 
	
		
		
		 
}


	 
	 
