package MyRedBus;
import java.util.Scanner;
public class RedBusApp {
	String name;
	String email;
	long contact;
	String password;
	String boarding;
	String desti;
	double kilometer;
	String date;
	String time;
	int seats;
	double amount_pkm;
	double total_amount;
	String placename;
	String payname;
	boolean signup;
	boolean login;
	boolean reservation;
	static RedBusApp red= new RedBusApp();
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		boolean b =true;
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! WELCOME TO RED BUS - MAKE YOUR JOURNEY SMART !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \n");
		while(b==true) {
			System.out.println("--------------------> PLEASE SELECT THE OPTIONS YOU NEED TO PERFORM \n");
			System.out.println("\t \t @@@@ 1. SIGN UP            ----- PRESS 1 TO SIGN UP ");
			System.out.println("\t \t @@@@ 2. LOGIN              ----- PRESS 2 TO LOGIN ");
			System.out.println("\t \t @@@@ 3. RESERVATION        ----- PRESS 3 TO RESERVE YOUR TRAVEL");
			System.out.println("\t \t @@@@ 4. PAYMENT            ----- PRESS 4 TO PAY");
			System.out.println("\t \t @@@@ 5. MY ACCOUNT         ----- PRESS 5 TO SEE YOUR ACCOUNT");
			System.out.println("\t \t @@@@ 6. FORGOTTEN PASSWORD ----- PRESS 6 TO CHANGE PASSWORD ");
			System.out.println("\t \t @@@@ 7. EXIT               ----- PRESS 7 TO EXIT \n ");
			System.out.println("__________________________________________________________________________________________________________________________________ ");
			int press= s.nextInt();
			switch(press) {
			case 1 : System.out.println(" \t \t WELCOME TO THE SIGN UP PAGE OF RED BUS --- EXPLORE YOUR TRAVELLING BY CONNECTING WITH US \n");
			red.signUp();
			System.out.println("______________________________________________________________________________________________________________________________ ");
			break;
			case 2 : System.out.println(" \t \t WELCOME TO THE LOGIN PAGE OF RED BUS --- PLEASE ENTER THE BELOW ASKED DETAILS \n");
			red.login();
			System.out.println("______________________________________________________________________________________________________________________________ ");
			break;
			case 3 : System.out.println(" \t \t WELCOME TO THE RESERVATION PAGE OF RED BUS ---- PLEASE FILL THE BELOW ASKED DETAILS TO BOOK YOUR TRAVEL \n");
			red.reservation();
			System.out.println("______________________________________________________________________________________________________________________________ ");
			break;
			case 4 : System.out.println(" \t \t WELCOME TO THE PAYMENT OPTIONS ---- PAY TO CONFIRM YOUR BOOKING \n");
			red.payment();
			System.out.println("______________________________________________________________________________________________________________________________ ");
			break;
			case 5 : System.out.println(" \t \t WELCOME TO YOUR ACCOUNT ---- PLACE TO SEE YOUR BOOKED DETAILS \n");
			red.myAccount();
			System.out.println("______________________________________________________________________________________________________________________________ ");
			break;
			case 6 : System.out.println(" \t \t WELCOME TO FORGOT PASSWORD PAGE OF RED BUS ---- CHANGE YOUR PASSWORD AS YOU WISH \n");
			red.forgottenPassword();
			System.out.println("______________________________________________________________________________________________________________________________ ");
			break;
			case 7 : System.out.println(" \t \t WELCOME TO EXIT PAGE OF OUR RED BUS ---- STAY SAFE AND HAVE A NICE JOURNEY \n");
			red.exit();
			System.out.println("______________________________________________________________________________________________________________________________ ");
			b=false;
			break;
			default : System.out.println(" \t \t SORRY FOR THE INCONVINIENCE PLEASE SELECT YOUR OPTIONS PROPERLY \n ");
			break;
			}
		}
	}
	public void signUp() {
		System.out.println("** ENTER YOUR NAME : ");
		name =s.next();
		System.out.println("\n");
		//this.name= name;
		System.out.println("** ENTER YOUR MAIL ID : ");
		email =s.next();
		System.out.println("\n");
		//this.email=email;
		System.out.println("** ENTER YOUR CONTACT NUMBER (Enter the 10 digit number properly) : ");
		contact = s.nextLong();
		System.out.println("\n");
		String no = Long.toString(contact);
		if(no.length()==10) {
			//this.contact=contact;
			System.out.println("** ENTER YOUR PASSWORD : ");
			password = s.next();
			System.out.println("\n");
			//this.password=password;
			System.out.println("** CONFIRM PASSWORD : ");
			String password1 = s.next();
			System.out.println("\n");
			if(this.password.equalsIgnoreCase(password1)) {
				this.password=password1;
				System.out.println("\t \t SIGN UP DONE SUCCESSFULLY ---- YOU ARE NOW CONNECTED WITH US TO EXPLORE THE WORLD ---- STAY TUNED ");
			    signup =true;
				}else System.out.println("\t \t SORRY !!! PLEASE ENTER THE SAME PASSWORD IN BOTH THE FIELDS \n");
		}else System.out.println("\t \t SORRY !!! PLEASE ENTER THE 10 DIGIT MOBILE NUMBER  \n");
	}
	public void login() {
		if(signup) {
		System.out.println("** ENTER YOUR CONTACT NUMBER (Enter the 10 digit number properly) : ");
		long contact1 = s.nextLong();
		System.out.println("\n");
		System.out.println("** ENTER YOUR PASSWORD : ");
		String password2 = s.next();
		System.out.println("\n");
		if(this.contact==contact1) {
			if(this.password.equalsIgnoreCase(password2)) {
				System.out.println("\t \t LOGIN DONE SUCCESSFULLY ---- DO YOUR RESERVATION AS YOU WISH  ---- STAY TUNED ");
			    login=true;
			}else	System.out.println("\t \t SORRY !!! INVALID PASSWORD ---- PLEASE ENTER THE VALID PASSWORD  \n");
		}else System.out.println("\t \t SORRY !!! INVALID CONTACT NUMBER ---- PLEASE ENTER THE VALID CONTACT NUMBER ");
	}else {
			System.out.println("\t \t SORRY YOU ARE NOT SUPPOSED TO DO LOGIN --------- PLEASE COMPLETE THE SIGN UP PROCESS \n  ");
			
		}
	}
	public void reservation() {
		if(signup) {
		if(login) {
			System.out.println("SELECT YOUR BOARDING PLACE :");
			System.out.println("1. CHENNAI CENTRAL ");
			System.out.println("2. TAMBARAM");
			System.out.println("3. CHENNAI EGMORE ");
			int press1 =s.nextInt();
			switch(press1) {
			case 1 : placename="CHENNAI CENTRAL";
				System.out.println("\t \t YOUR BOARDING PLACE IS : CHENNAI CENTRAL \n");
				amount_pkm=20;
				reserve();
				System.out.println("______________________________________________________________________________________________________________________________ ");
				break;
			case 2 : placename= "TAMBARAM";
				     System.out.println("\t \t YOUR BOARDING PLACE IS : TAMBARAM \n");
			         amount_pkm=40;
			         reserve();
			         System.out.println("______________________________________________________________________________________________________________________________ ");
		             break;
			case 3 : placename="CHENNAI EGMORE";
			System.out.println("\t \t YOUR BOARDING PLACE IS : CHENNAI EGMORE\n");
			amount_pkm=30;
			reserve();
			System.out.println("______________________________________________________________________________________________________________________________ ");
			break;
			default : System.out.println(" \t \t SORRY FOR THE INCONVINIENCE PLEASE SELECT YOUR OPTIONS PROPERLY \n ");
			System.out.println("______________________________________________________________________________________________________________________________ ");
			break;
		}
	}else System.out.println("\t \t SORRY YOU ARE NOT SUPPOSED TO DO RESERVATION --------- PLEASE COMPLETE THE LOGIN PROCESS \n  ");
		}else System.out.println("\t \t SORRY YOU ARE NOT SUPPOSED TO DO RESERVATION --------- PLEASE COMPLETE THE SIGN UP PROCESS \n ");
	}
	public void reserve() {
		System.out.println("ENTER YOUR DESTINATION :"+"\n");
		desti =s.next();
		System.out.println("ENTER YOUR DESTINATION KILOMETER :"+"\n");
		kilometer =s.nextInt();
		System.out.println("ENTER THE DATE OF TRAVEL :"+"\n");
		date= s.next();
		System.out.println("ENTER THE TIME OF TRAVEL :"+"\n");
		time=s.next();
		System.out.println("ENTER THE NUMBER OF SEATS :"+"\n");
		seats=s.nextInt();
		System.out.println("****************** YOUR RESERVATION DETAILS ARE ****************** \n");
		System.out.println("YOUR BOARDING PLACE              : "+placename );
		System.out.println("YOUR DESTINATION IS              : "+desti);
		System.out.println("YOUR DESTINATION KILOMETER IS    : "+kilometer);
		System.out.println("YOUR DATE OF TRAVEL IS           : "+date);
		System.out.println("YOUR TIME OF TRAVEL IS           : "+time);
		System.out.println("NUMBER OF SEATS BOOKED IS        : "+seats);
		System.out.println("AMOUNT PER KILOMETER IS          : "+amount_pkm);
		total_amount =(seats*kilometer*amount_pkm);
		System.out.println("-----------------------------------------------");
		System.out.println("TOTAL AMOUNT                  Rs.: "+total_amount);
		System.out.println("-----------------------------------------------");
		reservation=true;
		}
	public void payment() {
		if(signup) {
		if(login) {
			if(reservation) {
				System.out.println("SELECT YOUR PAYMENT OPTIONS \n ");
				System.out.println("1. GOOGLE PAY");
				System.out.println("2. PAYTM");
				System.out.println("3. PHONE PAY");
				int press =s.nextInt();
				switch(press) {
				case 1 : payname= "GOOGLE PAY";
				pay();
				System.out.println("______________________________________________________________________________________________________________________________ ");
				break;
				case 2 : payname ="PAYTM";
				pay();
				System.out.println("______________________________________________________________________________________________________________________________ ");
				break;
				case 3: payname="PHONE PAY";
				pay();
				System.out.println("______________________________________________________________________________________________________________________________ ");
				break;
				default : System.out.println(" \t \t SORRY FOR THE INCONVINIENCE PLEASE SELECT YOUR OPTIONS PROPERLY \n ");
				System.out.println("______________________________________________________________________________________________________________________________ ");
				break;
				}
			}else System.out.println("\t \t SORRY YOU ARE NOT SUPPOSED TO DO PAYMENT --------- PLEASE COMPLETE THE RESERVATION PROCESS \n ");
		}else System.out.println("\t \t SORRY YOU ARE NOT SUPPOSED TO DO PAYMENT --------- PLEASE COMPLETE THE LOGIN PROCESS \n ");
		}else System.out.println("\t \t SORRY YOU ARE NOT SUPPOSED TO DO PAYMENT --------- PLEASE COMPLETE THE SIGN UP PROCESS \n ");
	}
	public void pay() {
		System.out.println("ENTER THE AMOUNT TO BE PAID : ");
		int amou = s.nextInt();
		if(total_amount==amou) {
			int randomPin=(int) (Math.random()*230000)+4000;
			String otp = String.valueOf(randomPin);
			System.out.println("YOUR OTP IS GENERATED BELOW :");
			   try{
			       Thread.sleep(3000);
			   }
			   catch(InterruptedException ex)
			   {
			       Thread.currentThread().interrupt();
			   }
			     System.out.println(otp);
			     System.out.println("ENTER THE OTP : ");
			     String otp1 = s.next();
			     if(otp.equalsIgnoreCase(otp1)) {
			    	 System.out.println("\t \t PAYMENT DONE SUCCESSFULLY ----------- HAVE A HAPPY JOURNEY \n");
			    	 System.out.println("******************************* YOUR PAYMENT DETAILS *******************************");
			    	 System.out.println("PAYMENT DONE VIA "+payname);
			    	 System.out.println("PAID AMOUNT "+total_amount);
			     }else System.out.println("\t \t SORRY ! INVALID OTP ---- PLEASE ENTER THE VALID OTP \n");
			     }else System.out.println("\t \t INVALID AMOUNT ----- ENTER THE VALID AMOUNT \n");
	}
	public void forgottenPassword() {
		System.out.println("ENTER THE CONTACT NUMBER : ");
		long con =s.nextLong();
		String co=Long.toString(con);
		if(co.length()==10) {
			if(this.contact==con) {
				int randomPin=(int) (Math.random()*230000)+4000;
				String otp = String.valueOf(randomPin);
				System.out.println("YOUR OTP IS GENERATED BELOW :");
				   try{
				       Thread.sleep(3000);
				   }
				   catch(InterruptedException ex)
				   {
				       Thread.currentThread().interrupt();
				   }
				     System.out.println(otp);
				     System.out.println("ENTER THE OTP : ");
				     String otp1 = s.next();
				     if(otp.equalsIgnoreCase(otp1)) {
				    	 System.out.println("ENTER YOUR NEW PASSWORD : ");
				    	 String newpa= s.next();
				    	 System.out.println("CONFIRM YOUR PASSWORD : ");
				    	 String newpa1= s.next();
				    	 if(newpa.equals(newpa1)) {
				    		 this.password=newpa;
				    		 System.out.println("\t \t YOUR PASSWORD HAS BEEN CHANGED SUCCESSFULLY \n");
				     }else System.out.println("\t \t SORRY !!! PLEASE ENTER THE SAME PASSWORD IN BOTH THE FIELDS \n");
				    		 
				     }else System.out.println("\t \t SORRY ! INVALID OTP ---- PLEASE ENTER THE VALID OTP \n");
				}else System.out.println("\t \t SORRY !!! INVALID CONTACT NUMBER ---- PLEASE ENTER THE VALID CONTACT NUMBER \n ");
		}else System.out.println("\t \t SORRY !!! PLEASE ENTER THE 10 DIGIT MOBILE NUMBER  \n");
	}
public void myAccount() {
	    System.out.println("\t \t ******************     ACCOUNT DETAILS   ****************** \n");
		System.out.println("NAME OF THE USER                 : "+name);
		System.out.println("MAIL ID OF THE USER              : "+email);
		System.out.println("CONTACT NUMBER OF THE USER       : "+contact+"\n");
		System.out.println("\t \t ******************   RESERVATION DETAILS ****************** \n");
		System.out.println("YOUR BOARDING PLACE              : "+placename );
		System.out.println("YOUR DESTINATION IS              : "+desti);
		System.out.println("YOUR DESTINATION KILOMETER IS    : "+kilometer);
		System.out.println("YOUR DATE OF TRAVEL IS           : "+date);
		System.out.println("YOUR TIME OF TRAVEL IS           : "+time);
		System.out.println("NUMBER OF SEATS BOOKED IS        : "+seats);
		System.out.println("TOTAL AMOUNT                  Rs.: "+total_amount+"\n");
		System.out.println("\t \t ******************   PAYMENT DETAILS     ****************** \n");
		System.out.println("PAYMENT DONE VIA                 : "+payname);
   	    System.out.println("PAID AMOUNT                      : "+total_amount);	
	}
	public void exit() {
		System.out.println("\t \t THANKYOU FOR VISITING OUR PAGE ========  COME AGAIN !!!!!!!!!!! WAITING FOR YOU ");
	}
}
