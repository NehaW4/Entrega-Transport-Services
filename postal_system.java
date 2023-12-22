//set path=C:\Program Files (x86)\Java\jdk1.8.0_301\bin
import java.util.*;
import java.awt.*;
import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.text.*;
import java.time.LocalDate;
import java.util.Date;
import java.io.*;

public class postal_system
{
	public postal_system()
	{


	}

	private static final long MILLIS_IN_A_DAY = 1000 * 60 * 60 * 24;
	
	//public static void main (String[] args)
	public static void main(String[] args) throws FileNotFoundException
	{

	try{

  		Thread.sleep(500);//Time in milliseconds->5000==5 seconds 
  		System.out.print("\n\n\n\t\t\t\t\t---|| W ");//Appears after 5 seconds
	
		Thread.sleep(200);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" E ");

		Thread.sleep(200);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" L ");

		Thread.sleep(200);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" C ");
		
		Thread.sleep(200);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" O ");

		Thread.sleep(200);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" M ");

		Thread.sleep(200);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" E ");
		
		Thread.sleep(200);//Time in milliseconds->5000==5 seconds 
  		System.out.print("\tT ");

		Thread.sleep(300);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" O ");

		Thread.sleep(300);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" \tE ");

		Thread.sleep(400);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" N ");

		Thread.sleep(200);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" T ");
		
		Thread.sleep(200);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" R ");

		Thread.sleep(200);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" E ");
		
		Thread.sleep(200);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" G ");

		Thread.sleep(200);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" A ");
		
		Thread.sleep(200);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" \tS ");

		Thread.sleep(200);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" E ");

		Thread.sleep(300);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" R ");
		
		Thread.sleep(300);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" V ");

		Thread.sleep(300);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" I ");
		
		Thread.sleep(300);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" C ");

		Thread.sleep(300);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" E ");

		Thread.sleep(300);//Time in milliseconds->5000==5 seconds 
  		System.out.print(" S ||---\n\n");
		

		/*System.out.print(" \n\n\t\t\t\t\t\t\t\tAGREEMENT TO TERMS \n\n\t\t\tThese Terms of Use constitute a legally binding agreement made between you whether personaly or on \n\t\t\tbehalf of an entity `you` and_________( `Company` `we` `us` or `our`) concerning your access to and \n\t\t\tuse of the________website as well as any other media form, media channel, mobile website or mobile \n\t\t\tapplication related, linked, or otherwise connected there to (collectively, the `Site`). You agree \n\t\t\tthat by accessing the Site, you have read, understood, and agreed to be bound by all of these Terms \n\t\t\tof Use. IF YOU DO NOT AGREE WITH ALL OF THESE TERMS OF USE, THEN YOU ARE EXPRESSLY PROHIBITED FROM \n\t\t\t\t\tUSING THE SITE AND YOU MUST DISCONTINUE USE IMMEDIATELY.");*/

		}
	        catch(InterruptedException e)
		{
  		    System.err.println(e.getMessage());
		}

		Registration re = new Registration ();

		 try {
                      	File obj = new File("Registration.txt");
                        if (obj.createNewFile()) 
              	        {
                	System.out.println("File is created");
                	} 
     		} 
            	catch (IOException e) 
            	{
              		System.out.println("An error occurred.");
              		e.printStackTrace();
                }
	
         
         
        	int choice;
        	Scanner in=new Scanner(System.in);
        	System.out.println("\n\n|----- 1. Registration ");
        	System.out.println("\n|----- 2. Login ");
         
        	System.out.print("\n\nEnter your Choice   : ");
        	choice=in.nextInt();
        	in.nextLine();
         
        	if(choice==1)
        	{
            		Registration user = new Registration();
            		user.register();
        	}
        	else if(choice==2)
        	{
            		Registration user = new Registration();
            		user.login();
        	}
        	else
       	        {
            		System.out.println("Choose Proper Option");
        	}
       // in.close();
    			

		//Scanner in = new Scanner(System.in);
		Package pf = new Package ();
		Owner of = new Owner ();
		InsuredPackage ip = new InsuredPackage ();


		int userChoice;
		boolean quit = false;

		/*System.out.println("\t\t\nSender's Information ---> ");
		System.out.print ("\nEnter Companys's Name           : " );
		Owner ob1 = new Owner ();
		String name = in.next();

		System.out.print ("Enter Manager/Owner Name        : " );
		Owner ob13 = new Owner ();
		String msname = in.next();

		System.out.print ("Enter your Company's Address    : " );
		Owner ob2 = new Owner ();
		String address = in.next();

		System.out.print ("Enter your phone number         : ");
		Owner ob5 = new Owner ();
	        int phno = in.nextInt();

		System.out.print ("Enter your pin-code number      : ");
		Owner ob6 = new Owner ();
	        int spincode = in.nextInt();

		System.out.print ("Enter your city name            : " );
		Owner ob7 = new Owner ();
		String scity = in.next();

		System.out.print ("Enter your state name           : " );
		Owner ob8 = new Owner ();
		String sstate = in.next();

		System.out.println("\t\t\n\nReciver's Information ---> ");
                System.out.print ("\nEnter Compnay's Name            : " );
		Owner ob3 = new Owner ();
		String rname = in.next();

		System.out.print ("Enter Manager/Owner Name        : " );
		Owner ob14 = new Owner ();
		String mrname = in.next();

		System.out.print ("Enter Compnays's Address        : " );
		Owner ob4 = new Owner ();
		String raddress = in.next();

		System.out.print ("Enter your phone number         : ");
		Owner ob9 = new Owner ();
	        int rphno = in.nextInt();

		System.out.print ("Enter your pin-code number      : ");
		Owner ob10 = new Owner ();
	        int rpincode = in.nextInt();

		System.out.print ("Enter your city name            : " );
		Owner ob11 = new Owner ();
		String rcity = in.next();

		System.out.print ("Enter your state name           : " );
		Owner ob12 = new Owner ();
		String rstate = in.next();
		*/

		CensusApp CensusApp = new CensusApp();
		

		System.out.println ("\n\n\n*************************** SUCCESFULLY ADDED *****************************"
				+ "\n\nUser ID and Package No. - "+"\n\t\t\t Unique User ID : " + of.getOwnerID()
				+ "\n\t\t\t Package number : " + pf.getPackageID() + " belongs to you.");




		do {
                       System.out.println("\n\n\n\n*************************** SELECT YOUR CHOICE *****************************\n");
			System.out.println("1 ----->  Air Transport");
			System.out.println("2 ----->  Road Transport");
			System.out.println("3 ----->  Cargo Transport");
			System.out.println("\n0 <-->  EXIT - To place ordered");
			System.out.print("\n\nYour choice is : ");
			userChoice = in.nextInt();



			switch (userChoice) {
			case 1:
				System.out.println ("\nYou have choosen to Ship by ----> AIR WAY \n");
				System.out.println ("\n\n\n---------------------------|| AIR WAY ||----------------------------------\n");
				System.out.print ("\nPlease enter the package weight-kg   : ");


				double weight = in.nextDouble();
				pf.weight = weight;

				System.out.println("\n\n$ Cost - ");
				System.out.println("\tYour Shipment Will cost  : Rs." + pf.getAir());							
				ip.setCost(pf.getCost());            // repair
				System.out.println("\tInsurance will cost      : Rs." + ip.getRange());
				System.out.println("\n\n\nTip - If you want to check prices of other ways.\n      Please check it, before placing order.");

				break;

			case 2:
				System.out.println ("\nYou have choosen to Ship by ----> TRUCK WAY");
				System.out.println ("\n\n\n---------------------------|| TRUCK WAY ||----------------------------------\n");

				System.out.print("\nPlease enter the package weight-kg    : ");

				pf.weight = in.nextDouble();

				System.out.println("\n\n$ Cost - ");
				System.out.println("\tYour Shipment Will cost  : Rs." + pf.getTruck());							
				ip.setCost(pf.getCost());            // repair
				System.out.println("\tInsurance will cost      : Rs." + ip.getRange());
				System.out.println("\n\n\nTip - If you want to check prices of other ways.\n      Please check it, before placing order.");

				break;

			case 3:
				System.out.println ("\nYou have choosen to Ship by ----> CARGO WAY ");
				System.out.println ("\n\n\n---------------------------|| CARGO WAY ||----------------------------------\n");
				System.out.print("\nPlease enter the package weight-kg    : ");

				pf.weight = in.nextDouble();

				System.out.println("\n\n$ Cost - ");
				System.out.println("\tYour Shipment Will cost  : Rs." + pf.getMail());
				ip.setCost(pf.getCost());  
				System.out.println("\tInsurance will cost      : Rs." + ip.getRange());
				System.out.println("\n\n\nTip - If you want to check prices of other ways.\n      Please check it, before placing order.");

				break;

			case 0:
				quit = true;
				UserID UserID = new UserID();
				System.out.println("\n\n\t\t\t\tDONE - Thank you !!\n");
				System.out.println("\n\n\n--------------------------------$ Please Pay $--------------------------------\n");
				System.out.println("---1. Debit ");
       				System.out.println("---2. Credit ");
				System.out.println("---3. Google Pay. ");
        			System.out.println("---4. PayPal. ");
				System.out.println("---5. Bhim. ");
        			System.out.println("---6. Cash On delivery. ");
         
        			System.out.print("\nEnter your Choice   : ");
        			choice=in.nextInt();
        			in.nextLine();
         
        			if(choice==1)
        			{
            				pay_debit pay_debit = new pay_debit();
         
        			}
        			else if(choice==2)
        			{
            				pay_credit pay_credit = new pay_credit();
        			}
				else if(choice==3)
        			{
           				google_pay google_pay = new google_pay();
        			}
				else if(choice==4)
        			{
            				PayPal PayPal = new PayPal();
        			}
				else if(choice==5)
        			{
            				Bhim Bhim= new Bhim();
        			}
				else if(choice==6)
        			{
            				cash cash = new cash();
        			}
				else
       			        {
            				System.out.println("Choose Proper Option");
        			}
				break;

			default:
				System.out.println("\n\tOOPS.....Wrong choice.");
			break;
			}

			System.out.println();
		} while (!quit);
		
 
        	SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss z");

       	  	Date date = new Date();
        
  		System.out.println("\n********************************** Succesfully Placed !! ***************************************\n\n");
        	formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
        	System.out.println("\t\t\tOrdered Confirmed - " +formatDate.format(date));

		System.out.println("\n\nDelivery Status---------->\n");	
		Date today = new Date();

		System.out.println("\n------------------------------------------------------------");         
        	System.out.println("\n| Ordered Time & Date    ::  " + today + "  |");
        	System.out.println("\n| Dilivery Time & Date   ::  " + postal_system(today)+ "  |");        
         
        	LocalDate todayDate = LocalDate.now();
         
        	System.out.println("\n| Dispatched             ::  " + todayDate + "                    |");
  		System.out.println("\n| Arriving               ::  " + postal_system(todayDate)+ "                    |");
		System.out.println("\n------------------------------------------------------------"); 
		System.out.println("\n\n\n\tThank you for placing Order !"); 
		System.out.println("\t<Entrega Transport Services>"); 
		 

		try{
  			Thread.sleep(2000);//Time in milliseconds->5000==5 seconds 
  			System.out.print("\n\n\n------------------------------>>>>>>>>>>> ON THE WAY <<<<<<<<<<<<-------------------------------\n\n");
		}
	        catch(InterruptedException e)
		{
  		    System.err.println(e.getMessage());
		}

           

	        }


	 	public static Date postal_system(Date date)
    		{
        		return new Date(date.getTime() + MILLIS_IN_A_DAY);
    		}
     
     
    		public static LocalDate postal_system(LocalDate localdate)
    		{
        		return localdate.plusDays(5);
		}
	  
}



//public 
class CensusApp
{
    BufferedWriter out;

    public CensusApp()
    {
        try
            {
               // out = new BufferedWriter(new FileWriter("TESTING.txt"/*,true*/));

		BufferedWriter out = new BufferedWriter(new FileWriter("userInput.txt", true));
		
                
                String userInput = ("");
        
                //needed for user to input selection
                Scanner input = new Scanner(System.in);

		System.out.println("\t\t\n\nSender's Information ---> ");
                //Request the City Name
		out.append("Sender- ");
                System.out.print("\nEnter Companys's Name           : " );
                userInput = input.nextLine();
		out.write(userInput);
		out.append(" ");		
		
                //Request the magner/owener Name
                System.out.print ("Enter Manager/Owner Name        : " );
                userInput = input.nextLine();
		out.write(userInput);
		out.append(" ");

		//Request the phone 
                System.out.print("Enter your phone number         : ");
                userInput = input.nextLine();
		out.write(userInput);
		out.append(" ");

		//Request the City Name
                System.out.print ("Enter your City Name            : ");
                userInput = input.nextLine();
		out.write(userInput);
		out.append(" ");
		
		//Request the pincode
                System.out.print ("Enter your pin-code number      : ");
                userInput = input.nextLine();
		out.write(userInput);
		out.append("  ");
		
                //Request the State Name
                System.out.print("Enter your State name           : " );
                userInput = input.nextLine();
		out.write(userInput);
		out.append("  ");
				
              
		out.append(" Reciver- ");
		System.out.println("\t\t\n\nReciver's Information ---> ");
		//Request the City Name
                System.out.print("\nEnter Companys's Name           : " );
                userInput = input.nextLine();
		out.write(userInput);
		out.append("  ");

                //Request the magner/owener Name
                System.out.print ("Enter Manager/Owner Name        : " );
                userInput = input.nextLine();
		out.write(userInput);
		out.append(" ");

		//Request the phone 
                System.out.print("Enter your phone number         : ");
                userInput = input.nextLine();
		out.write(userInput);
		out.append(" ");

		//Request the City Name
                System.out.print ("Enter your City Name            : ");
                userInput = input.nextLine();
		out.write(userInput);
		out.append(" ");
		
		//Request the City Name
                System.out.print ("Enter your pin-code number      : ");
                userInput = input.nextLine();
		out.write(userInput);
		out.append(" ");
		
                //Request the State Name
                System.out.print("Enter your state name           : " );
                userInput = input.nextLine();
		out.write(userInput);
		out.append(" ");
		
                out.write(userInput);//Write out the specfied string to the file
		
		
                out.newLine(); //write a new line to the file on the next line

                out.close();//flushes and closes the stream
            }
            catch(IOException e)
                {
                System.out.println("There was a problem:" + e);
                }
    }

}


class UserID
{
    BufferedWriter out;

    public UserID()
    {
        try
            {
               // out = new BufferedWriter(new FileWriter("TESTING.txt"/*,true*/));

		BufferedWriter out = new BufferedWriter(new FileWriter("payment.txt", true));
		
                
                String userInput = ("");
        
                //needed for user to input selection
                Scanner input = new Scanner(System.in);

		System.out.println("\t\t\n\n\n******************************* Confirmation ******************************** ");
                out.append(" Way- ");
                System.out.print("\n\n\nEnter Your Way (AIR/ROAD/CARGO)     : " );
                userInput = input.nextLine();
		out.write(userInput);
		
		out.append(" User ID- ");
                System.out.print("Enter Your Unique User ID           : " );
                userInput = input.nextLine();
		out.write(userInput);
		

		//Request the City Name
		out.append("  Package No- ");
                System.out.print("Enter Your Package Number ID        : " );
                userInput = input.nextLine();
		out.write(userInput);
		
		
		
		
		
                //out.newLine(); //write a new line to the file on the next line

                out.close();//flushes and closes the stream
            }
            catch(IOException e)
                {
                System.out.println("There was a problem:" + e);
                }
    }

}




class Registration {
	 
     
    public void register() throws FileNotFoundException
    {
       

	Scanner in=new Scanner(System.in);
         
        System.out.print("\nEnter User Name   : ");
        String Uname=in.nextLine();
        System.out.println("Check - " + Uname);
         
        System.out.print("\nEnter Password    : ");
        String Pass=in.nextLine();
        System.out.println("Check - " + Pass);
         
        System.out.println("\nConfirm Password  : ");
        String ConPass=in.nextLine();
        System.out.println(ConPass);
        Uname=Uname.trim();
        Pass=Pass.trim();
        ConPass=ConPass.trim();
	 
         
 
        String x= Uname+" "+Pass;
        if(Pass.equals(ConPass))
        {
             
              File f = new File("Registration.txt");
              Scanner content = new Scanner(f);
               
               
              int flag=0;
              while (content.hasNextLine()) {
                String data = content.nextLine();
                if(data.equals(x))
                {
                    System.out.println("\n\n*************************** Already Registered ***************************\n");
                    flag=1;
                    System.out.print("\n\n|----- 1. Registration. ");
                    System.out.print("\n|----- 2. Login. \n");
                     
                    System.out.println("\n\nEnter your Choice");
                    int choice=in.nextInt();
                    if(choice==1)
                    {
                        this.register();
                    }
                    else if(choice==2)
                    {
                        this.login();
                    }
                    else
                    {
                        System.out.println("\n\n*************************** Choose Proper Option ***************************");
                    }
                    break;
                }
                //content.close();
              }
                if(flag==0)
                {
                    try {
                        BufferedWriter out = new BufferedWriter(new FileWriter("Registration.txt", true)); 
                        out.write(Uname+" "+Pass+"\n");
                        out.close();
                    }
                    catch (IOException e) {
                        System.out.println("exception occoured" + e);
                    }
                     
                    System.out.println("\n\n*************************** Successfully Registered  ***************************");
                    System.out.println("\n\n***************************      Please  Login       ***************************\n");
                    this.login();
                }
             
             
        }
        else
        {
            System.out.println("------------Recheck-----------------");
            System.out.println("1. Registration. ");
            System.out.println("2. Login. ");
             
            System.out.println("Enter your Choice");
            int choice=in.nextInt();
            if(choice==1)
            {
                this.register();
            }
            else if(choice==2)
            {
                this.login();
            }
            else
            {
                System.out.println("Choose Proper Option");
            }
        }
        //in.close();
    }
     
    public void login()
    {
         
        Scanner in=new Scanner(System.in);
	
         
        System.out.print("\n\nEnter User Name     : ");
        String Uname=in.nextLine();
        //System.out.println(Uname);
         
        System.out.print("Enter Password      : ");
        String Pass=in.nextLine();
       // System.out.println(Pass);
        Uname=Uname.trim();
        Pass=Pass.trim();
        String x= Uname+" "+Pass;
         
         
        try {
             
              File f = new File("Registration.txt");
              Scanner content = new Scanner(f);
              int flag=0;
              while (content.hasNextLine()) {
                String data = content.nextLine();
                if(data.equals(x))
                {
                    System.out.println("\n\n**************************       Login Successful      ***************************");
                    System.out.println("\n\n*************************** Welcome to the Application ***************************");
                    flag=1;
                    break;
                }
              }
                if(flag==0)
                {
                    System.out.println("\n\n*************************** Login Failed ***************************");
                    System.out.println("\n|---- 1. Registration. ");
                    System.out.println("|---- 2. Login. ");
                     
                    System.out.println("\n\nEnter your Choice");
                    int choice=in.nextInt();
                    if(choice==1)
                    {
                        this.register();
                    }
                    else if(choice==2)
                    {
                        this.login();
                    }
                    else
                    {
                        System.out.println("Choose Proper Option");
                    }
                }
               
             // content.close();
            } 
            catch (FileNotFoundException e) {
             
                 
              System.out.println("Error.");
              e.printStackTrace();
            }
         
        //in.close();
    }


}




//public
class Package 
{

	private double pnumber;
	public double weight;
	private double Air;
	private double Truck;
	private double Mail;
	private double cost;

	public Package (double cost, double pnumber, double weight, double Air, double Truck, double Mail){
		this.cost = cost;
		this.pnumber = pnumber;
		this.weight = weight;
		this.Air = Air;
		this.Truck = Truck;
		this.Mail = Mail;
	}

	/**
	 *
	 */
	public Package(){

	}



	public void setPackageID (double pnumber){

		this.pnumber = pnumber;

	}

	public double getPackageID (){

		Random rand = new Random();
		int pick = rand.nextInt(40)+1;

		return pick;

	}




	public void setAir (double Air){

		this.Air = Air;

	}

	public double getAir ()
	{

		if (weight <= 1) 
		{
			System.out.println("Please enter the correct amount of weight.");
		}
		else    // repair
		{
			if (weight <= 8)
			{
				cost =  weight * 2;				
			}		
			else if ((weight >= 9) && (weight <= 16)) 
			{
				cost = weight * 3;
			}
			else if (weight >= 17) 
			{
				cost = weight * 4.50;
			}
		}
		return cost;

	}

	public void setTruck (double Truck){

		this.Truck = Truck;

	}

	public double getTruck (){

		if (weight <= 8)
		{
			//System.out.println("The Shipment of package will cost Rs." + weight * 1.50);
			cost = weight *1.50;
		}
		else 
		{
			if ((weight >= 9) && (weight <= 16)) 
			{
				//System.out.println("The Shipment of package will cost Rs." + weight * 2.35);
				cost = weight *2.35;
			}
			else {
				if (weight >= 17) {
					//System.out.println("The Shipment of package will cost Rs." + weight * 3.25);
					cost = weight *3.25;
				}
			}
		}

		return getCost();

	}

	public void setMail (double Mail){

		this.Mail = Mail;

	}

	public double getMail (){

		if (weight <= 8) {
			//System.out.println("The Shipment of package will cost Rs." + weight * 2.50);
			cost = weight *2.50;
		}
		else {
			if ((weight >= 9) && (weight <= 16)) {
				//System.out.println("The Shipment of package will cost Rs." + weight * 3.50);
				cost = weight *3.50;
			}
			else {
				if (weight >= 17) {
					//System.out.println("The Shipment of package will cost Rs." + weight * 4.15);
					cost = weight *4.15;
				}
			}
		}

		return getCost();

	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}



}


//public 
class InsuredPackage extends Package
{

	   private double range;

	    public InsuredPackage (double cost, double pnumber, double weight, double Air, double Truck, double Mail){
	        super (cost, pnumber, weight, Air, Truck, Mail);
	    }

	    public InsuredPackage (){
	        super ();
	    }




	    public void setRange (double range){
	        this.range = range;
	    }

	    public double getRange()   // repair
	    {

	        if (getCost() >= 10 && getCost() <= 100)   // you should write like this 
	        {
	            return getCost() + 15;
	        }

	        if (getCost() >= 100.01 && getCost() <= 300) 
	        {
	            return getCost() + 25.50;
	        }

	        if (getCost() >= 300.01) 
	        {
	            return getCost() + 34;
	        }

	        
	        return range;
	        
	    }
}



class pay_debit
{
    BufferedWriter out;

    public pay_debit()
    {
        try
            {
              
		BufferedWriter out = new BufferedWriter(new FileWriter("payment.txt", true));
		
                
                String userInput = ("");
        
                Scanner input = new Scanner(System.in);

		System.out.println("\t\t\n\n\n\n**------------------Debit card------------------**");
                out.append(" Debit Card : account number - ");
                System.out.print("\n\nEnter last 6 digits          : ********" );
                userInput = input.nextLine();
		out.write(userInput);
		

		//Request the City Name
		out.append("  expiry date- ");
                System.out.print("Enter expiry date            : " );
                userInput = input.nextLine();
		out.write(userInput);

		out.append(" Cost - ");
                System.out.print("\n\nPay (Including Insurance) ---> Rs." );
                userInput = input.nextLine();
		out.write(userInput);

				
                System.out.print("\n\nTranscation Status -----> $ SUCCESFULLY PAID \n\n\n" );

		out.newLine(); //write a new line to the file on the next line

                out.close();//flushes and closes the stream
            }
            catch(IOException e)
                {
                System.out.println("There was a problem:" + e);
                }
    }

}


class pay_credit
{
    BufferedWriter out;

    public pay_credit()
    {
        try
            {
              
		BufferedWriter out = new BufferedWriter(new FileWriter("payment.txt", true));
		
                
                String userInput = ("");
        
                Scanner input = new Scanner(System.in);

		System.out.println("\t\t\n\n\n\n**------------------Credit card------------------**");
                out.append(" Credit Card: account number - ");
                System.out.print("\n\nEnter last 6 digits     : ********" );
                userInput = input.nextLine();
		out.write(userInput);
		

		//Request the City Name
		out.append("  expiry date- ");
                System.out.print("Enter expiry date       : " );
                userInput = input.nextLine();
		out.write(userInput);
		
		out.append(" Cost - ");
                System.out.print("\n\nPay (Including Insurance) ---> Rs." );
                userInput = input.nextLine();
		out.write(userInput);

				
                System.out.print("\n\nTranscation Status -----> $ SUCCESFULLY PAID \n\n\n" );

				
                out.newLine(); //write a new line to the file on the next line

                out.close();//flushes and closes the stream
            }
            catch(IOException e)
                {
                System.out.println("There was a problem:" + e);
                }
    }

}


class google_pay
{
    BufferedWriter out;

    public google_pay()
    {
        try
            {
              
		BufferedWriter out = new BufferedWriter(new FileWriter("payment.txt", true));
		
                
                String userInput = ("");
        
                Scanner input = new Scanner(System.in);

		System.out.println("\t\t\n\n\n\n**------------------Google_pay------------------**");
                out.append(" Google_pay : Phone number - ");
                System.out.print("\nEnter phone number     : " );
                userInput = input.nextLine();
		out.write(userInput);
		

		//Request the City Name
		out.append("  Bank - ");
                System.out.print("Name of bank           : " );
                userInput = input.nextLine();
		out.write(userInput);

		out.append(" Cost - ");
                System.out.print("\n\nPay (Including Insurance) ---> Rs." );
                userInput = input.nextLine();
		out.write(userInput);

				
                System.out.print("\n\nTranscation Status -----> $ SUCCESFULLY PAID \n\n\n" );

				
                out.newLine(); //write a new line to the file on the next line

                out.close();//flushes and closes the stream
            }
            catch(IOException e)
                {
                System.out.println("There was a problem:" + e);
                }
    }

}

class  PayPal 
{
    BufferedWriter out;

    public  PayPal()
    {
        try
            {
              
		BufferedWriter out = new BufferedWriter(new FileWriter("payment.txt", true));
		
                
                String userInput = ("");
        
                Scanner input = new Scanner(System.in);

		System.out.println("\t\t\n\n\n\n**------------------PayPal------------------**");
                out.append(" PayPal : Phone number - ");
                System.out.print("\n\n\nEnter phone number    : " );
                userInput = input.nextLine();
		out.write(userInput);
		

		//Request the City Name
		out.append("  Bank - ");
                System.out.print("Name of bank          : " );
                userInput = input.nextLine();
		out.write(userInput);

		out.append(" Cost - ");
                System.out.print("\nPay (Including Insurance) ---> Rs." );
                userInput = input.nextLine();
		out.write(userInput);

				
                System.out.print("\n\nTranscation Status -----> $ SUCCESFULLY PAID \n\n\n" );

				
                out.newLine(); //write a new line to the file on the next line

                out.close();//flushes and closes the stream
            }
            catch(IOException e)
                {
                System.out.println("There was a problem:" + e);
                }
    }

}


class  Bhim 
{
    BufferedWriter out;

    public  Bhim()
    {
        try
            {
              
		BufferedWriter out = new BufferedWriter(new FileWriter("payment.txt", true));
		
                
                String userInput = ("");
        
                Scanner input = new Scanner(System.in);

		System.out.println("\t\t\n\n\n\n**------------------BHIM------------------**");
                out.append(" BHIM : Phone number - ");
                System.out.print("\n\nEnter UPI          : " );
                userInput = input.nextLine();
		out.write(userInput);
		

		//Request the City Name
		out.append("  Bank - ");
                System.out.print("Name of bank       : " );
                userInput = input.nextLine();
		out.write(userInput);

		out.append(" Cost - ");
                System.out.print("\n\nPay (Including Insurance) ---> Rs." );
                userInput = input.nextLine();
		out.write(userInput);

				
                System.out.print("\n\nTranscation Status -----> $ SUCCESFULLY PAID \n\n\n" );

				
                out.newLine(); //write a new line to the file on the next line

                out.close();//flushes and closes the stream
            }
            catch(IOException e)
                {
                System.out.println("There was a problem:" + e);
                }
    }

}


class  cash
{
    BufferedWriter out;

    public  cash()
    {
        try
            {
              
		BufferedWriter out = new BufferedWriter(new FileWriter("payment.txt", true));
		
                
                String userInput = ("");
        
                Scanner input = new Scanner(System.in);

		System.out.println("\t\t\n\n\n\n**------------------Cash on Delivery------------------**");
                out.append(" Cash : Phone number - ");
                System.out.print("\n\nEnter phone number    : " );
                userInput = input.nextLine();
		out.write(userInput);
		

		//Request the City Name
		out.append("  Bank - ");
                System.out.print("Addres                : " );
                userInput = input.nextLine();
		out.write(userInput);

		out.append(" Cost - ");
                System.out.print("\nCash will be collected after delivery." );
                userInput = input.nextLine();
		out.write(userInput);

				
                System.out.print("\n\nTranscation Status -----> $ PENDING \n\n\n" );

				
                out.newLine(); //write a new line to the file on the next line

                out.close();//flushes and closes the stream
            }
            catch(IOException e)
                {
                System.out.println("There was a problem:" + e);
                }
    }

}




/*
AGREEMENT TO TERMS
These Terms of Use constitute a legally binding agreement made between you, whether personaly or on
 behalf of an entity("you") and_________-("Company", "we", "us", or "our"), concerning your access 
to and use of the________website as well as any other media form, media channel, mobile website or 
mobile application related, linked, or otherwise connected there to (collectively, the "Site").
 You agree that by accessing the Site, you have read, understood, and agreed to be bound by all 
of these Terms of Use. IF YOU DO NOT AGREE WITH ALL OF THESE TERMS OF USE, THEN YOU ARE EXPRESSLY
 PROHIBITED FROM USING THE SITE AND YOU MUST DISCONTINUE USE IMMEDIATELY.




*/




/*

import java.util.*;   

class product{
	String p_name;
        int p_weight;

	void product_details(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Product Name : ");
			String p_name= sc.nextLine();
			System.out.println("Enter Products weight in kg : ");
			int p_weight = sc.nextInt();           
	   }
	void product_display(){
			System.out.println("Product is "+p_name+" with size "+ p_weight);
	  }
}   

class postal
{
	public String sname, rname, saddress, raddress;
	public int pid, phnumber, items;
	
	postal(String s_name, String r_name, String s_address, String r_address, int ph_number, int t_items)
	{
		System.out.println("\n\t\t************Succefully Added**************\n");
		sname = s_name;
		rname = r_name;
		saddress = s_address;
		raddress = r_address;
		phnumber = ph_number;
		items = t_items;
	}
	
	public void showDetails()
	{
		System.out.println("Details - \n\t Sender " + sname + "\n\t is sending this parcel to " + rname+ "\n\t from Address "+ saddress +"\n\t to this Address "+ raddress +"\n\t and Phone number is " + phnumber+"\n\t number of Total items is "+items);
	}

	public static void main(String[] args)
	{	
		product p1 = new product();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Senders Name : ");
		String sname = sc.next();
		System.out.print("Enter Recivers Name : ");
		String rname = sc.next();
		System.out.print("Enter Senders Address : ");
		String saddress = sc.next();
		System.out.print("Enter Recivers Address : ");
		String raddress = sc.next();
		System.out.print("Enter Phone Number : ");
		int phnumber = sc.nextInt();
		System.out.print("Enter Total items : ");
		int items = sc.nextInt();
		postal information = new postal(sname, rname, saddress, raddress, phnumber, items);
		information.showDetails();
		p1.product_details();
		p1.product_display();
	}

}
*/


/*
//public 
class Owner extends Package {
    
    private double onumber;
    private int phno;
    private int rphno;
    private String name;
    private String msname;
    private String mrname;
    private String address;
    private String rname;
    private String raddress;
    private int spincode;
    private String scity;
    private String sstate;
    private int rpincode;
    private String rcity;
    private String rstate;
   
    public void setOwnerID (double onumber){

        this.onumber = onumber;

    }

    public double getOwnerID (){

        Random rand = new Random();
        int opick = rand.nextInt(40)+1;
        return opick;
    }

    public void setphno (int phno){
        this.phno = phno;
    }

    public int getphno (){
        return phno;
    }

    public void setrphno (int rphno){
        this.rphno = rphno;
    }

    public int getrphno (){
        return rphno;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName (){
        return name;
    }

    
    public void setmsName (String msname){
        this.msname = msname;
    }

    public String getmsName (){
        return msname;
    }

    
    public void setmrName (String mrname){
        this.mrname = mrname;
    }

    public String getmrName (){
        return mrname;
    }

    public void setAddress (String address){
        this.address = address;
    }

    public String getAddress (){
        return address;
    }

    public void setrName (String rname){
        this.rname = rname;
    }

    public String getrName (){
        return rname;
    }

    public void setrAddress (String raddress){
        this.raddress = raddress;
    }

    public String getrAddress (){
        return raddress;
    }

    public void setspincode (int spincode){
        this.spincode = spincode;
    }

    public int getspincode (){
        return spincode;
    }
	
    public void setscity (String scity){
        this.scity = scity;
    }

    public String getscity (){
        return scity;
    }

     public void setsstate (String sstate){
        this.sstate = sstate;
    }

    public String getsstate (){
        return sstate;
    }

     public void setrpincode (int rpincode){
        this.rpincode = rpincode;
    }

    public int getrpincode (){
        return rpincode;
    }
	
    public void setrcity (String rcity){
        this.rcity = rcity;
    }

    public String getrcity (){
        return rcity;
    }

     public void setrstate (String rstate){
        this.rstate = rstate;
    }

    public String getrstate (){
        return rstate;
    }

}

*/