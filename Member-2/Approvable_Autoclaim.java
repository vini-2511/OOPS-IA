import java.util.Scanner;

interface Approvable {
    void approveClaim();
}

class AutoClaim implements Approvable {

    int claimId;
    double amount;

    AutoClaim(int claimId, double amount) {
        this.claimId = claimId;
        this.amount = amount;
    }

    void display() {
        System.out.println("\n--- Auto Claim Details ---");
        System.out.println("Claim ID: " + claimId);
        System.out.println("Amount: " + amount);
    }

    // Implementing interface method
    public void approveClaim() {
        System.out.println("Auto Claim Approved");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Claim ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Claim Amount: ");
        double amount = sc.nextDouble();

        AutoClaim claim =
            new AutoClaim(id, amount);

        claim.display();

        System.out.print("Do you want to approve the claim? (yes/no): ");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("yes")) {
            claim.approveClaim();
        } else {
            System.out.println("Auto Claim Not Approved");
        }

        sc.close();
    }
}
