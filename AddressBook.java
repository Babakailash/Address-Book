import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {
	
    public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		 addressBook addressObject = new addressBook();
		String choice = "yes";
        System.out.println("Wellcome to Address Book Program!");

		while(choice.equals("yes") || choice.equals("YES")) {
	    	System.out.println("Firstname : ");
 			String firstname = scan.nextLine();
	    	System.out.println("Lastname : ");
			String lastname = scan.nextLine();
	    	System.out.println("Address : ");
			String address = scan.nextLine();
	    	System.out.println("City : ");
			String city = scan.nextLine();
	    	System.out.println("State : ");
			String state = scan.nextLine();
	    	System.out.println("Zip : ");
			int zip = scan.nextInt();
	    	System.out.println("PhoneNumber : ");
			long phonenumber = scan.nextLong();
	    	System.out.println("Email : ");
			String email = scan.next();
			
			choice = scan.nextLine();

			contactDetail contact = new contactDetail(firstname, lastname, address, city, state, zip, phonenumber, email);
			addressObject.insertContact(contact);
		}
		addressObject.printContactDetails();
    }
}

      class contactDetail {
            public String firstname, lastname;
            public String address, city, state;
            public int zip;
            public long phoneNumber;
            public String email;

            public contactDetail(String firstname, String lastname, String address, String city, String state, int zip, long phonenumber, String email) {
            	this.firstname = firstname;
            	this.lastname = lastname;
                this.address = address;
                this.city = city;
                this.state = state;
                this.zip = zip;
                this.phoneNumber = phonenumber;
                this.email = email;
            }

            public String getFirstName() {
            	return firstname;
           }
            
           public void setFirstName(String firstName) {
           this.firstname = firstName;
           }
           
           public String getLastName() {
           return lastname;
           }
           
           public void setLastName(String lastName) {
           this.lastname = lastName;
           }
           
           public String getAddress() {
           return address;
           }
           
           public void setAddress(String address) {
           this.address = address;
           }
           
           public String getCity() {
           return city;
           }
           
           public void setCity(String city) {
           this.city = city;
           }
           
           public String getState() {
           return state;
           }
           
           public void setState(String state) {
           this.state = state;
           }
           
           public int getZip() {
           return zip;
           }
           
           public void setZip(int zip) {
           this.zip = zip;
           }
           
           public long getPhoneNo() {
           return phoneNumber;
           }
           
           public void setPhoneNo(long phone) {
           this.phoneNumber = phone;
           }
           
           public String getEmail() {
           return email;
           }
           
           public void setEmail(String emails) {
    	   this.email = emails;
           }
           
      }
      class addressBook {
           private ArrayList<contactDetail> contactList = new ArrayList<contactDetail>();
	
		   public void insertContact(contactDetail contactDetailObject) {
			contactList.add(contactDetailObject);
			}
		   
		   

		   public void added(String nameToAdded) {
			 int i=0;
			 for(i=0;i<contactList.size();i++) {
				 Object added = null;
				if(contactList.get(i).firstname.equals(added)) {
					 contactList.remove(i);
					 System.out.println("Contact is Added");
        	
			System.out.println("Added Firstname : ");
	        Scanner scan = new Scanner(System.in);
			String firstname = scan.nextLine();
	        contactDetail added1 = null;
			added1.setFirstName(firstname);
	        	
			System.out.println("Added Lastname : ");
	        String lastname = scan.nextLine();
			added1.setLastName(lastname);
                
			System.out.println("Added Address : ");
            String address = scan.nextLine();
			added1.setAddress(address);
                
			System.out.println("Added City : ");
            String city = scan.nextLine();
		    added1.setCity(city);
                
		    System.out.println("Added State : ");
            String state = scan.nextLine();
			added1.setState(state);
                
		    System.out.println("Added Zip : ");
            int zip = scan.nextInt();
			added1.setZip(zip);
                
			System.out.println("Added PhoneNumber : ");
            long phonenumber = scan.nextLong();
			scan.nextLine();
			added1.setPhoneNo(phonenumber);
                
			System.out.println("Added Email : ");
            String email = scan.nextLine();
		    added1.setEmail(email);
			 } 
		    else {
				 System.out.println("All Contact Show !");
				 }
			 }
	     }
	 
          public void printContactDetails() {
            for(contactDetail getInfo: contactList) {
            System.out.println("Firstname : " + getInfo.getFirstName());
            System.out.println("Lastname : " + getInfo.getLastName());
            System.out.println("Address : " + getInfo.getAddress());
            System.out.println("City : " + getInfo.getCity());
            System.out.println("State : " + getInfo.getState());
            System.out.println("Zip : " + getInfo.getZip());
            System.out.println("PhoneNumber : " + getInfo.getPhoneNo());
            System.out.println("Email : " + getInfo.getEmail());
    
            }
          }
      }
