package CustomerData;

import java.util.Scanner;

public class Customer {

        String[] customers = new String[5];
        Scanner input = new Scanner(System.in);
        String firstname;
        String lastname;
        public void inputCustomerData() {

            for(int i=0; i< customers.length; i++) {
                do {
                    System.out.print("Enter customer first name: ");
                    firstname= input.nextLine();
                    System.out.print("Enter customer last name: ");
                    lastname= input.nextLine();
                    if(firstname.trim().isEmpty()||lastname.trim().isEmpty())
                        System.out.println("First name and last name can not be empty");
                }
                while(firstname.trim().isEmpty()||lastname.trim().isEmpty());
                customers[i]= firstname + " " + lastname;
            }
            input.close();
        }

        //method display customer data
        public void displayCustomerData() {
            for(String str: customers) {
                System.out.println(str);
            }
        }
}
