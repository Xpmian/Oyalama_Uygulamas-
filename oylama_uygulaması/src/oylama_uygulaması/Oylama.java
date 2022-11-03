package oylama_uygulaması;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Oylama 
{
	public static void tablo_yazdir()
	{
		
		for(int i =0;i<5;i++)
		 {
			for(int j =0; j<10;j++)
			{
				System.out.printf("%d ",tablo[i][j]);
			}
			System.out.println(" \n");
		}
	}
	static int[][] tablo = new int [5][10];
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> item = new ArrayList<String>();
		item.add("sorun 1 = Ekonomi");
		item.add("sorun 2 = Ulasim");
		item.add("sorun 3 = Kuresel");
		item.add("sorun 4 = Siyasi");
		item.add("sorun 5 = Askeri");
		int[][] cevaplar= {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
		System.out.println("***************************************");
    	String islemler="1.Ankete Devam\n"
                        +"2.Anketten Cikis\n";
    	System.out.println(islemler);
    	System.out.println("***************************************");
    	int sayac = 0;
    	while(true)
	    {
			System.out.println("Islem seciniz...");
			String d = sc.nextLine();
			if(d.equals("1"))
			{
				sayac+=1;
			}
			if(d.equals("1"))
		 {   
			 
			for(int k=0;k<5;k++)
	        {  
	          System.out.println(item.get(k)+" Ne kadar onemli");
	          System.out.println("1 den 10 a kadar derecelendir");
	          int derece=sc.nextInt();
	    
	    	     if(derece == 1)
	    	      {
	    		    tablo[k][0]=tablo[k][0]+1;
	    		    cevaplar[k][0]=cevaplar[k][0]+1;
	    	      }
	    	      else if(derece ==2 ) 
	    	      {
	    		    tablo[k][1]=tablo[k][1]+1;
	    		    cevaplar[k][1]=cevaplar[k][1]+1;
	    	      }
	    	      else if(derece == 3)
	    	      {
	    		    tablo[k][2]=tablo[k][2]+1;
	    		    cevaplar[k][2]=cevaplar[k][2]+1;
    	  
	    	      }
	    	      else if (derece == 4)
	    	      {
	    		     tablo[k][3]=tablo[k][3]+1;
	    		     cevaplar[k][3]=cevaplar[k][3]+1;
	    	      }
	    	      else if(derece == 5)
	    	      { 
	    		     tablo[k][4]=tablo[k][4]+1;
	    		     cevaplar[k][4]=cevaplar[k][4]+1;
	    	      }
	    	      else if(derece == 6)
	    	      { 
	    		     tablo[k][5]=tablo[k][5]+1;
	    		     cevaplar[k][5]=cevaplar[k][5]+1;
	    	      }
	    	      else if(derece == 7)
	    	      { 
	    		     tablo[k][6]=tablo[k][6]+1;
	    		     cevaplar[k][6]=cevaplar[k][6]+1;
	    	      }
	    	      else if(derece == 8)
	    	      { 
	    		     tablo[k][7]=tablo[k][7]+1; 
	    		     cevaplar[k][7]=cevaplar[k][7]+1;
	    	      }
	    	      else if(derece == 9)
	    	      { 
	    		     tablo[k][8]=tablo[k][8]+1;  
	    		     cevaplar[k][8]=cevaplar[k][8]+1;
	    	      }
	    	      else 
	    	      { 
	    		     tablo[k][9]=tablo[k][9]+1;
	    		     cevaplar[k][9]=cevaplar[k][9]+1;
	    	      }
	    	     
	           
	           
	        }
			 tablo_yazdir();  
	    } 
			else if (d.equals("2"))
			{
				int toplam1=0;
				int toplam2=0;
				int toplam3=0;
				int toplam4=0;
				int toplam5=0;	
		           for(int j=1;j<11;j++)
 					{
		        	   int temp =(cevaplar[0][j-1]*j);
		        	   toplam1+=temp;
 					}
		           for(int j=1;j<11;j++)
					{
		        	   int temp =(cevaplar[1][j-1]*j);
		        	   toplam2+=temp;
					}
		           for(int j=1;j<11;j++)
 					{
			        	   int temp =(cevaplar[2][j-1]*j);
			        	   toplam3+=temp;
	 					}
		            for(int j=1;j<11;j++)
	 					{
	 		        	   int temp =(cevaplar[3][j-1]*j);
	 		        	   toplam4+=temp;
	  					}
		              for(int j=1;j<11;j++)
	 					{
	 		        	   int temp =(cevaplar[4][j-1]*j);
	 		        	   toplam5+=temp;
	  					}
				
				//System.out.println(sayac);
 				System.out.println("****************************************************");
		        System.out.println("Birinci sorunun puan degeri: "+toplam1);
 				System.out.println("Ikinci sorunun puan degeri: "+toplam2);
 				System.out.println("Ucuncu sorunun puan degeri: "+toplam3);
 				System.out.println("Dorduncu sorunun puan degeri: "+toplam4);
 				System.out.println("Besinci sorunun puan degeri: "+toplam5);
 				System.out.println("****************************************************");
 				double ortalama1=(double)toplam1/(double)sayac;
 				double ortalama2=(double)toplam2/(double)sayac;
 				double ortalama3=(double)toplam3/(double)sayac;
 				double ortalama4=(double)toplam4/(double)sayac;
 				double ortalama5=(double)toplam5/(double)sayac;
 				double[] ortalama= {(double)ortalama1,(double)ortalama2,(double)ortalama3,(double)ortalama4,(double) ortalama5};
 				System.out.println("****************************************************");
 				System.out.println("Birinci sorunun puan ortalamasi: "+ortalama1);
 				System.out.println("Ikinci sorunun puan ortalamasi: "+ortalama2);
 				System.out.println("Ucuncu sorunun puan ortalamasi: "+ortalama3);
 				System.out.println("Dorduncu sorunun puan ortalamasi: "+ortalama4);
 				System.out.println("Besinci sorunun puan ortalamasi: "+ortalama5);
 				System.out.println("****************************************************");
 				double enKucuk =ortalama[0];
 				double enBuyuk =ortalama[0];
 				for (double sayi: ortalama) 
 				{
 		            if(enKucuk > sayi)
 		                enKucuk = sayi;
 		            else if(enBuyuk < sayi)
		                enBuyuk = sayi;
 		        }
 				if(enKucuk == ortalama[0])
 				{
 					System.out.println("En dusuk ortalamaya sahip soru birinci sorudur...");
 				}
 				else if (enKucuk == ortalama[1])
 				{
 					System.out.println("En dusuk ortalamaya sahip soru ikinci sorudur...");
 				}
 				else if(enKucuk == ortalama[2])
 				{
 					System.out.println("En dusuk ortalamaya sahip soru ucuncu sorudur...");
 				}
 				else if(enKucuk == ortalama[3])
 				{
 					System.out.println("En dusuk ortalamaya sahip soru dorduncu sorudur...");
 				}
 				else if(enKucuk == ortalama[4])
 				{
 					System.out.println("En dusuk ortalamaya sahip soru besinci sorudur...");
 				}
 				if(enBuyuk == ortalama[0])
 				{
 					System.out.println("En yuksek ortalamaya sahip soru birinci sorudur...");
 				}
 				else if (enBuyuk == ortalama[1])
 				{
 					System.out.println("En yuksek ortalamaya sahip soru ikinci sorudur...");
 				}
 				else if(enBuyuk == ortalama[2])
 				{
 					System.out.println("En yuksek ortalamaya sahip soru ucuncu sorudur...");
 				}
 				else if(enBuyuk == ortalama[3])
 				{
 					System.out.println("En yuksek ortalamaya sahip soru dorduncu sorudur...");
 				}
 				else if(enBuyuk == ortalama[4])
 				{
 					System.out.println("En yuksek ortalamaya sahip soru besinci sorudur...");
 				}
				break;
			}
			
	}

}
}