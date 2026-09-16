import java.util.Scanner;

class Claim {
    int claimId;
    double amount;

    // Constructor
    Claim(int claimId, double amount) {
        this.claimId = claimId;
        this.amount = amount;
    }

    void display() {
        System.out.println("Claim ID: " + claimId);
        System.out.println("Amount: " + amount);
    }
}

class MedicalClaim extends Claim {
    String hospitalName;

    // Constructor
    MedicalClaim(int claimId, double amount, String hospitalName) {
        super(claimId, amount);
        this.hospitalName = hospitalName;
    }

    // Method Overriding
    @Override
    void display() {
        System.out.println("\n--- Medical Claim Details ---");
        System.out.println("Claim ID: " + claimId);
        System.out.println("Amount: " + amount);
        System.out.println("Hospital Name: " + hospitalName);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Claim ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Claim Amount: ");
        double amount = sc.nextDouble();

        sc.nextLine(); // clear buffer

        System.out.print("Enter Hospital Name: ");
        String hospital = sc.nextLine();

        MedicalClaim claim =
            new MedicalClaim(id, amount, hospital);

        claim.display();

        sc.close();
    }
}
