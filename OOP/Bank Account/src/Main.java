
public class Main {
    public static void main(String[] args) {

        Account A1 = new Account();
        A1.setAccount_balance(1000);
        A1.setAccount_number(123);
        A1.setCustomer_name("Janea Celine Celo");
        A1.setEmail("Janea@gmail.com");
        A1.setPhone_number(10890);

        System.out.println(A1.toString());

        A1.deposit(1000);
        System.out.println(A1.toString());

        A1.withdraw(1000);
        System.out.println(A1.toString());

        A1.withdraw(2000);
        System.out.println(A1.toString());


    }
}