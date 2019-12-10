package main;

public class AppBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BinaryNumber numBin = new BinaryNumber();
	     String LenghEnt1 = "3";
	     String [] resultado1 = BinaryNumber.PutBits(LenghEnt1);
	     System.out.println(" ");
	     System.out.println(" el resultado 1 es; ");
	     System.out.println(" ");
	     
	     for (int i=0;  i < resultado1.length; i++) {
	    	 System.out.println(resultado1[i]);

	     };
	     
	     System.out.println(" ");
	     
	     String LenghEnt2 = "2";
	     String [] resultado2 = BinaryNumber.PutBits(LenghEnt2);
	     System.out.println(" ");
	     System.out.println(" el resultado 2 es; ");
	     System.out.println(" ");
	     
	     for (int i=0;  i < resultado2.length; i++) {
	    	 System.out.println(resultado2[i]);

	     };
	     
	     System.out.println(" ");
	     
	};
	     
};
