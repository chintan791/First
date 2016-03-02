import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 
		 int custNumber;
		 double saleAmount ;
		 String custName, taxCode;
		 double taxPercent=0; 
		 double total;
		 
		 
		 System.out.println("Enter cust number");
		 custNumber = in.nextInt();
		 
		 System.out.println("enter name ");
		 custName = in.next();
		 
		 System.out.println(" enter sales amount");
		 saleAmount = in.nextDouble();
		 
		 System.out.println("enter tax code ");
		 taxCode=in.next();
		 
		 System.out.println(taxCode);

		 if (taxCode.equals("NRM"))
			 taxPercent = 0.06;
		 
		 else if (taxCode.equals("NPF"))
			 taxPercent= 0;
		 
		 else if (taxCode.equals("BIZ"))
			 taxPercent= 0.45;
			 
			
		 else 
			 System.out.println("Invalid tax code");
		 
		 total = saleAmount + (saleAmount * taxPercent);
		 
		 System.out.println("Total amount owed is " + total);
		 
		 
		 
	}


}

