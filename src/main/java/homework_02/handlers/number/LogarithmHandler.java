package homework_02.handlers.number;

public class LogarithmHandler {
    public void log10OfNumber(double givenNumber){
        if (givenNumber > 0) {
            System.out.println("log10 of " + givenNumber + " is equals to " + (Math.log10(givenNumber)));
        } else if (givenNumber == 0) {
            System.out.println("Log of a 0 is always undefined.");
        } else {
            System.out.println("A number cannot be a negative number.");
        }
    }
}
