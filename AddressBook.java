package addressBk;

import java.util.Scanner;
class AddressBook {
	Scanner s = new Scanner(System.in);
	//Nested class for each entry
	class Entry{
		String firstName;
	    String lastName;
	    String address;
	    String city;
	    String state;
	    String zipCode;
	    long phoneNumber;
	    String email;
	    Entry(String firstname, String lastname, String address, String city, String state, int zip, long phonenumber, String email) {
            this.firstName = firstname;
        	this.lastName = lastname;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            this.phoneNumber = phonenumber;
            this.email = email;
            }
	    Entry(){
	    	String firstName="";
		    String lastName="";
		    String address="";
		    String city="";
		    String state="";
		    String zipCode="";
		    String phoneNumber="";
		    String email="";
		    }
        
	    public void show_details() {
	    	System.out.println("First Name is: "+firstName);
	    	System.out.println("Last Name is: "+lastName);
    		System.out.println("Address  is: "+address);
    		System.out.println("City is: "+city);
    		System.out.println("State Name is: "+state);
    	    System.out.println("Zip Code is: "+zipCode);
    	    System.out.println("Phone Number is: "+phoneNumber);
    	    System.out.println("Email ID is : "+email);
        }
    }


	//Keeps track of how many entries are in the book
	private int entries = 0;
	Entry[] contents;
	public void initEntries(int e){
		contents = new Entry[e];
		for (int i = 0;i<contents.length;i++){      //Initializes an array of entries, then loops through to initialize each individual entry
			contents[i] = new Entry();
        }
    }
    public int getEntries(){
        return contents.length;
    }
    //Adds an entry to the book
    public void add(String firstname, String lastname, String address, String city, String state, int zip, long phonenumber, String email) {
    	if (entries<contents.length){
        contents[entries] = new Entry(firstname, lastname, address, city, state, zip, phonenumber, email);
        entries++;
        }
        else System.out.println("Error: Address book is full");
    }

    //Removes an entry from the book
    public void remove(int entry){
    	if (entries>0){
            contents[entry] = new Entry();
            for (int i = 0;i<entries-entry;i++){
                if (entry+1==entries) contents[entry] = new Entry();
                else{
                    Entry temp = contents[entry+i];
                    contents[entry+i] = contents[entry+i+1]; //Removes an entry end moves each entry after it one backwards.
                    contents[entry+i+1] = temp;
                }
            }
            entries--;
    	}
    	else System.out.println("Error: Address book is empty.");
    }

    //Changes the values of an entry
    public void edit(String first, String last, String address, String email, int selection){
        String firstName = null;
		contents[selection].firstName = firstName;
        String lastName = null;
		contents[selection].lastName = lastName;
        contents[selection].address = address;
        String city = null;
		contents[selection].city = city;
        String state = null;
		contents[selection].state = state;
        String zipCode = null;
		contents[selection].zipCode = zipCode;
        long phoneNumber = 0;
		contents[selection].phoneNumber = phoneNumber;
        contents[selection].city = city;
        contents[selection].email = email;
    }

    //Sorts the book based on a part of the entry
    //int n is used to tell which part of the entries to base the sort on
    public void sort(int n){
        for(int i = 0;i<contents.length;i++){
            for (int j = 0;j<contents.length;j++){
                switch(n){
                    case 1:
                        if (contents[i].firstName.compareTo(contents[j].firstName)<0){
                            Entry temp = contents[i];
                            contents[i] = contents[j];
                            contents[j] = temp;
                        }
                        break;
                    case 2:
                        if (contents[i].lastName.compareTo(contents[j].lastName)<0){
                            Entry temp = contents[i];
                            contents[i] = contents[j];
                            contents[j] = temp;
                        }
                        break;
                    case 3:
                        if (contents[i].address.compareTo(contents[j].address)<0){
                            Entry temp = contents[i];
                            contents[i] = contents[j];
                            contents[j] = temp;
                        }
                        break;
                    case 4:
                        if (contents[i].email.compareTo(contents[j].email)<0){
                            Entry temp = contents[i];
                            contents[i] = contents[j];
                            contents[j] = temp;
                        }
                        break;
                    default: 
                        System.out.println("Error: invalid field");
                        break;
                }
            }
        }
    }
    public void addFromCopy(Entry e){
        if (entries<contents.length){
            contents[entries] = e;
            entries++;
            }
            else System.out.println("Error: Address book is full");
    }

}
