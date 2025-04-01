package OOPS;

// Define a custom exception class
class VoteEligibilityException extends Exception {
    public VoteEligibilityException(String message) {
        super(message); // Pass the message to the parent (Exception) class
    }
}

// Class that checks eligibility
public class VotingEligibility {

    // Method to check vote eligibility
    public static void checkEligibility(int age, boolean isCitizen, boolean isResident, boolean hasCriminalRecord) throws VoteEligibilityException {
        if (age < 18) {
            throw new VoteEligibilityException("You must be at least 18 years old to vote.");
        }
        if (!isCitizen) {
            throw new VoteEligibilityException("You must be a citizen to vote.");
        }
        if (!isResident) {
            throw new VoteEligibilityException("You must be a resident to vote.");
        }
        if (hasCriminalRecord) {
            throw new VoteEligibilityException("You are not eligible to vote due to a criminal record.");
        }
        System.out.println("You are eligible to vote!");
    }

    public static void main(String[] args) {
        try {
            // Sample input
            int age = 20;
            boolean isCitizen = true;
            boolean isResident = true;
            boolean hasCriminalRecord = false;

            // Check eligibility
            checkEligibility(age, isCitizen, isResident, hasCriminalRecord);
        } catch (VoteEligibilityException e) {
            System.out.println("Eligibility check failed: " + e.getMessage());
        }
    }
}

