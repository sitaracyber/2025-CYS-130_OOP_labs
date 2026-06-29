import java.util.Scanner;

class JazzCash {

    float balance;

    public JazzCash(float balance) {
        this.balance = balance;
        System.out.println("Current Balance = " + balance);
    }

    public void pay() {
        System.out.println("Payment completed through JazzCash");
    }

    public void withdraw(float amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Remaining Balance = " + balance);
        }
    }

    public void deposit(float amount) {
        balance = balance + amount;
        System.out.println("Updated Balance = " + balance);
    }
}

public class  lab8_Task_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        JazzCash account = new JazzCash(8000);

        account.pay();

        System.out.println("Enter amount to deposit:");
        float depositAmount = input.nextFloat();
        account.deposit(depositAmount);

        System.out.println("Enter amount to withdraw:");
        float withdrawAmount = input.nextFloat();
        account.withdraw(withdrawAmount);
    }
}
