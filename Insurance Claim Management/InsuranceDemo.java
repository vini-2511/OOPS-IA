// Interface
interface Approvable {
    void approveClaim();
}

// Parent class
class Claim {
    int claimId;
    double amount;

    Claim(int claimId, double amount) {
        this.claimId = claimId;
        this.amount = amount;
    }

    void display() {
        System.out.println("Claim ID: " + claimId);
        System.out.println("Amount: " + amount);
    }
}

// Child class - Medical Claim
class MedicalClaim extends Claim {
    String hospitalName;

    MedicalClaim(int claimId, double amount, String hospitalName) {
        super(claimId, amount);
        this.hospitalName = hospitalName;
    }

    @Override
    void display() {
        System.out.println("Claim ID: " + claimId);
        System.out.println("Amount: " + amount);
        System.out.println("Hospital Name: " + hospitalName);
    }
}

// Child class - Auto Claim
class AutoClaim extends Claim implements Approvable {

    AutoClaim(int claimId, double amount) {
        super(claimId, amount);
    }

    @Override
    public void approveClaim() {
        System.out.println("Auto Claim Approved");
    }
}

// Main class
public class InsuranceDemo {

    public static void main(String[] args) {

        // Medical Claim
        MedicalClaim medical =
            new MedicalClaim(101, 50000, "Apollo Hospital");

        System.out.println("---- Medical Claim ----");
        medical.display();

        // Auto Claim
        AutoClaim auto =
            new AutoClaim(102, 75000);

        System.out.println("\n---- Auto Claim ----");
        auto.display();
        auto.approveClaim();

        // NullPointerException Handling
        Claim claim = null;

        System.out.println("\n---- Exception Handling ----");

        try {
            claim.display();
        }
        catch (NullPointerException e) {
            System.out.println("Error: Claim object is not assigned.");
            System.out.println("NullPointerException handled.");
        }
    }
}
