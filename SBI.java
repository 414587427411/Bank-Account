package oops;

import java.util.Scanner;
import encapsulation.Encapsulation;

public class SBI {

    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.run();
    }

    public void run() {
        Encapsulation I1 = new Encapsulation();
        boolean flag = false;

        while (!flag) {
            collectUserInfo(I1);
            displayUserInfo(I1);

            System.out.println("for continue press : 1");
            System.out.println("to end press : 2");
            int a = scan.nextInt();
            scan.nextLine(); // Consume the newline left-over
            if (a >= 2) {
                flag = true;   
                System.out.println("Thankyou");
            } 
        }
    }

    private void collectUserInfo(Encapsulation I1) {
        System.out.println("Enter a name");
        String name = scan.nextLine();
        I1.setName(name);

        System.out.println("Enter a pancard");
        String panCard = scan.nextLine();
        I1.setPanCard(panCard);

        System.out.println("Enter an adhaarNumber");
        long adhaarNumber = scan.nextLong();
        I1.setAdhaarNumber(adhaarNumber);

        System.out.println("Enter a phoneNumber");
        long phoneNumber = scan.nextLong();
        I1.setPhoneNumber(phoneNumber);

        scan.nextLine(); // Consume the newline left-over
    }

    private void displayUserInfo(Encapsulation I1) {
        System.out.println("==================================");    
        System.out.println("NAME :" + I1.getName());
        System.out.println("PANCARD NUMBER:" + I1.getPanCard());
        System.out.println("ADHAAR NUMBER :" + I1.getAdhaarNumber());
        System.out.println("PHONE NUMBER:" + I1.getPhoneNumber());
        System.out.println("ACCOUNT NUMBER:" + I1.getAccountNumber());
        System.out.println("==================================");
    }
}
