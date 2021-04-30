import java.util.*;
import java.net.*;

public class AddressBook {


   //declear details variables
 static String firstName;
 static String lastName;
 static String city;
 static String state;
 static String address;
 static String email;
 static  long zipCode;
 static long phoneNumber;



    // Constructor allocate the variables


 public AddressBook(String firstName, String lastName, String city, String state, String address, String email, long zipCode, long phoneNumber)
{
      AddressBook.firstName = firstName;
      AddressBook.lastName = lastName;
      AddressBook.city = city;
      AddressBook.state = state;
      AddressBook.address = address;
      AddressBook.email = email;
      AddressBook.zipCode = zipCode;
      AddressBook.phoneNumber = phoneNumber;
}
         /////Method, take inputs from user

        public void details()
        {
            Scanner a=new Scanner(System.in);
            System.out.println("Enter your details:");
            System.out.println("Enter your First Name: ");
            AddressBook.firstName=a.nextLine();

            Scanner b=new Scanner(System.in);
            System.out.println("Enter your Last Name: ");
            AddressBook.lastName=b.nextLine();

            Scanner c=new Scanner(System.in);
            System.out.println("Enter your Address: ");
            AddressBook.address=c.nextLine();

            Scanner d=new Scanner(System.in);
            System.out.println("City : ");
            AddressBook.city=d.nextLine();

            Scanner e=new Scanner(System.in);
            System.out.println("State : ");
            AddressBook.state=e.nextLine();

            Scanner f=new Scanner(System.in);
            System.out.println("Zip Code: ");
            AddressBook.zipCode =f.nextLong();

            Scanner g=new Scanner(System.in);
            System.out.println("Phone Number: ");
            AddressBook.phoneNumber =g.nextLong();

            Scanner h=new Scanner(System.in);
            System.out.println("Email Id : ");
            AddressBook.email=h.next();

        }

        // toString() method returns the string representation of the object

        public String toString()
        {
            return ("Your Entered Details Are\nFirst Name: "+firstName+"\nLast Name: "+lastName+"\nAddress: "+address+"\nCity: "+city+"\nState: "+state+"\nZip Code: "+zipCode+"\nPhone Number :"+phoneNumber+"\nEmail: "+email+"\n");

        }
        //main method
        public static void main(String args[])
        {
            System.out.println("Welcome to Address Book System");

            List<AddressBook> list=new ArrayList<>();//list object for the Array List
            AddressBook person_1=new AddressBook(firstName, lastName, city, state, address, email, zipCode, phoneNumber);


            AddressBook newPerson=new AddressBook(firstName, lastName, city, state, address, email, zipCode, phoneNumber);


            Scanner k=new Scanner(System.in);
            System.out.println("Press 1 to Enter the contact details\nPress 2 for Add New Contact Details\nPress 3 for exit");



            int option=k.nextInt();

            switch(option)
            {
                case 1:
                    person_1.details();//calling the details method using the object
                    person_1.toString();//calling the toString method return the details
                    list.add(person_1);//adding the details to the ArrayList (store the dynemic size data)
                    System.out.println(list.get(0));//printing the list using index
                    break;
                case 2:
                    newPerson.details();//calling the details method using the object
                    newPerson.toString();//calling the toString method return the details
                    list.add(newPerson);//adding the details to the ArrayList (store the dynemic size data)
                    System.out.println(list.get(1));//printing the list using index
                    break; 
                default:
            }
    }
}
