import java.util.Random;
import java.util.Scanner;
public class MixingWords {
	 public static void main(String []args){
		 	
		 //þimdi girilen cümleyi tutacak bir string bulayým.
		 
		 String cümle ="";
		 Scanner k = new Scanner(System.in);
		 System.out.println("Cümlenizi girin");
		 cümle=k.nextLine();
		 String modchar ;
		 String bos ="";
		 int a=0;
		 int sayac=0;
		 String cümlesonu=cümle.substring(cümle.lastIndexOf(" ")+1,cümle.length());
		 char []c = null;
		 char temp;
		 int leng=cümle.length();
		 
		
		
		 while(bos.length()<=leng){
			// System.out.println(cümle.substring(cümle.indexOf(""),cümle.lastIndexOf("")));
			
			 
			 if(cümle.length()==cümlesonu.length()){
				c=cümlesonu.toCharArray();
			 }
			 
				else
				{
				 modchar=cümle.substring(cümle.indexOf(""),cümle.indexOf(" "));
				 c=modchar.toCharArray();
				}
			 
			 	
			 
			
			 
			 // Cümle baþý space silme için
			 if(c.length>3){
				 if(c[0]==' '){
					 StringBuilder sb =new StringBuilder();
					 sb.append(c);
					 sb.deleteCharAt(0);
					 c=sb.toString().toCharArray();
			
				// ilk ve son elemaný sabit tutup harfleri karýþtýrmak için	 
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
			 
			 //char dizisnini stringte toplayýp eskisini silip yenisini eklmek için
			 String out=new String(c);
			 //karýþýk char dizilierini tekrar birleþtirme
			 bos=bos+out+" ";
			 //sýradaki kelimeye geçmek için
			 cümle=cümle.substring(cümle.indexOf(" ")+1,cümle.length());
			 
			 }
		
			
		 System.out.print(bos);
		 String ll=k.nextLine();
		 }
		
		
			
			
		
		 
	
		
		
		 
}


	 
	 
