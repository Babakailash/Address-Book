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
		   
		   

		   public void delete(String nameToDelete) {
			 int i=0;
			 for(i=0;i<contactList.size();i++) {
				 if(contactList.get(i).firstname.equals(nameToDelete)) {
					 contactList.remove(i);
					 System.out.println("Contact is Deleted");
        	
			System.out.println("Delete Firstname : ");
	        Scanner scan = new Scanner(System.in);
			String firstname = scan.nextLine();
	        contactDetail delete = null;
			delete.setFirstName(firstname);
	        	
			System.out.println("Delete Lastname : ");
	        String lastname = scan.nextLine();
			delete.setLastName(lastname);
                
			System.out.println("Delete Address : ");
            String address = scan.nextLine();
			delete.setAddress(address);
                
			System.out.println("Delete City : ");
            String city = scan.nextLine();
		    delete.setCity(city);
                
		    System.out.println("Delete State : ");
            String state = scan.nextLine();
			delete.setState(state);
                
		    System.out.println("Delete Zip : ");
            int zip = scan.nextInt();
			delete.setZip(zip);
                
			System.out.println("Delete PhoneNumber : ");
            long phonenumber = scan.nextLong();
			scan.nextLine();
			delete.setPhoneNo(phonenumber);
                
			System.out.println("Delete Email : ");
            String email = scan.nextLine();
		    delete.setEmail(email);
			 } 
		    else {
				 System.out.println("Contact not found!");
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
