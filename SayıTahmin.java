package defaultp;
import java.util.Scanner ;
import java.util.Random ;

public class SayıTahmin {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ;
		Random rndm = new Random() ;
		
		System.out.println("Sayı Tahmin Oyununa Hoşgeldiniz \n "
				+ "Toplamda 5 Tahmin Hakkınız Vardır \n"
				+ "--Oyun Seviyeleri-- \n"
				+ "1-Kolay(0-10) \n "
				+ "2-Orta(0-100) \n"
				+ "3-Zor(0-1000) \n");
		
		System.out.println("Lütfen Seviye Seçimi Yapınız : ") ;
		int lvl = scan.nextInt() ;
		
		int can = 5 ;
		int tahmin ,sayı;
		
       if(lvl == 1) {
			sayı = rndm.nextInt(10) ;
			while(can>0) {
				System.out.println("Bir tahmin yapınız : ") ;
			    tahmin = scan.nextInt() ;
				if(tahmin == sayı ) {
				 System.out.println("Tebrikler Doğru Bildiniz :") ;
					break ;
				
			}else if(tahmin>sayı) {
					System.out.println("Tahmininiz Yüksek !");
					can-- ;
					System.out.println("Kalan Hakkınız : " + can );
					
			}else {
				System.out.println("Tahmininiz Küçük ") ;
				can-- ;
				System.out.println("Kalan Hakkınız : "+can) ;
			}
		}
			
			if(can==0) {
				System.out.println("Tahmin Edilecek Sayı  : " + sayı) ;
			}

	}
       
       else if(lvl == 2) {
    	   can = 8 ;
    	   sayı = (int)(Math.random()*100) ;
    	   while(can>0) {
    		   System.out.println("Bir tahmin yapınız : ") ;
    		    tahmin = scan.nextInt();
    		    if(tahmin==sayı) {
    		    	System.out.println("Tebrikler doğru tahmin ettiniz ") ;
    		    	break ;
    		    }else if(tahmin>sayı) {
    		    	System.out.println("Tahmininiz Yüksek ") ;
    		    	can-- ;
    		    	System.out.println("Kalan Can : "+ can );
    		    }else {
    		    	System.out.println("Tahmininiz Küçük ") ;
    		    	can-- ;
    		    	System.out.println("Kalan Can : "+ can );
    		    	
    		    }
    	   }
    	   
    	   if(can==0) {
    		   System.out.println("Bulmanız Gereken Sayı : "+sayı) ;
    	   }
       }
       
       else if(lvl==3) {
    	   can = 10 ;
    	   sayı = (int)(Math.random()*1000) ;
    	   
    	   while(can >0) {
    		   System.out.println("Bir tahmin yapınız : " ) ;
        	   tahmin = scan.nextInt() ;
        	   if(tahmin==sayı) {
        		   System.out.println("Tebrikler doğru tahmin ettiniz ") ;
        		   break ;
        	   }else if(tahmin>sayı) {
		    	System.out.println("Tahmininiz Yüksek ") ;
		    	can-- ;
		    	System.out.println("Kalan Can : "+ can );
		    	
		       }  else {
		    	System.out.println("Tahmininiz Küçük ") ;
		    	can-- ;
		    	System.out.println("Kalan Can : "+ can );
		    	
		    }
	   }
	   
	   if(can==0) {
		   System.out.println("Bulmanız Gereken Sayı : "+sayı) ;
	   }
    	   }
       
       
       else {
    	   System.out.println("Hatalı Tuşlama Ypatınız ") ; 
       }

  }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
