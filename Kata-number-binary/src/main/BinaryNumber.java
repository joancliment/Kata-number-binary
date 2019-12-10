package main;


public class BinaryNumber {

	private static String [] putBitsOuts;

	public static String []  PutBits(String cadena) {
		 
			int BitsY = 0; 
			BitsY = Integer.valueOf(cadena);
			int z;
			z = (int) Math.pow(2, BitsY);
			int long1 = z;
		 	putBitsOuts = new String[long1];
		     
	        int i = 1;
	        int j = 0;
	        int x = 1;
	        int cont = 0;
	        int cont1 = 0;
	        int ind = 0;
	        
	        BitsY = Integer.valueOf(cadena);
	        j = BitsY;
	        cont = z / 2;
	        
	        System.out.println( BitsY);
	        System.out.println( z);
	        System.out.println( cont);
	        
	        cont = 1;
	        cont1 = 2;
	        ind = 0;
        	i = 1;
        	x = 1;
        	System.out.println("z = "+ z);
        	System.out.println("BitsY = "+ BitsY);
	      
	        while ((cont1 <= z) && (x <= BitsY)) {
	        	
	        	j = 1;
	        	ind = 0;
	        	i = 1;
	        	
	        	System.out.println("x = "+ x);
	        	System.out.println("cont1 = "+ cont1);
	        	System.out.println("cont = "+ cont);
	        
	        	
	        while (i <= z) {
	        	
	        	System.out.println("i = "+ i);
	        	
	        	j = 1;
	        	while (j <= cont) {
	        			
	        			if ((x == 1)) {
	        				putBitsOuts[ind] = "0";	
	        			} else {
	        			    putBitsOuts[ind] = putBitsOuts[ind] + "0";
	        			};
	        			
	        			System.out.println("ind = " + ind);
	        			System.out.println("string = " + putBitsOuts[ind]);
	        				
	        			j++;
	        			ind++;
	        			i++;   
	        			
	        	};
	        		
	        	
	        	j = 1;
	        	
	        	while (j <= cont) {
	        			
	        			
	        			if ((x == 1)) {
	        				putBitsOuts[ind] = "1";	
	        			} else {
	        			    putBitsOuts[ind] = putBitsOuts[ind] + "1";
	        			};
	        			
	        			System.out.println("ind = " + ind);
	        			System.out.println("string = " + putBitsOuts[ind]);	
	        			
	        			j++;
	        		    ind++;
	        		    i++;
	        			
	        	};
	        			    
	          
	        };
	        
	        cont = cont * 2;
	        cont1 = cont1 * 2;
	        x++;
	        i = 1;
	        	
	        };
	        
	        return putBitsOuts;
	            
	 };
	      
}
