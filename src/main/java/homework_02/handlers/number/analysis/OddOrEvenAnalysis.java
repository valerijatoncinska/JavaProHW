package homework_02.handlers.number.analysis;

public class OddOrEvenAnalysis {
    public void manageNumber (double givenNumber) {
        int workingNumber = (int) Math.round(givenNumber);
        if (workingNumber % 2 == 0) {
            System.out.println(givenNumber + "(rounded up to " + workingNumber + ") is an even number.");
        } else {
            System.out.println(givenNumber + "(rounded up to " + workingNumber + ") is an odd number.");
        }
    }
}
