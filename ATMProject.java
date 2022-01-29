import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right>0) {
            System.out.print("Enter your username: ");
            userName = input.nextLine();

            System.out.print("Enter your password: ");
            password = input.nextLine();

            if (userName.equals("domo1905") && password.equals("domo123")){
                System.out.println("You are logged in");
                do {
                    System.out.println("Please select the action you want to do");
                    System.out.println("1- Deposit money\n" +
                            "2- Withdraw Money\n" +
                            "3- Balance Inquiry\n" +
                            "4- Sign Out");
                    select = input.nextInt();
                    switch (select){
                        case 1 :
                            System.out.print("Amount of Money: ");
                            int price = input.nextInt();
                            balance+=price;
                            break;
                        case 2 :
                            System.out.print("Amount of money");
                            int price2= input.nextInt();
                            if (balance>price2) {
                                balance -= price2;
                            }else{
                                System.out.println("Insufficient balance");
                            }
                            break;
                        case 3 :
                            System.out.println("Your balance is " + balance);
                            break;
                    }
                }while (select!=4);
                System.out.println("See you later :)");
                break;
            }else{
                System.out.println("Wrong username or password");
                System.out.println("Your remaining right " + --right);
            }
        }

    }
}
