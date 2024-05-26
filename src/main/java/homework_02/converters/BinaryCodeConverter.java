package homework_02.converters;

public class BinaryCodeConverter {
    public void numberToBinary(double givenNumber){
        int doubleToInt = (int) Math.round(givenNumber);
        String result = Integer.toBinaryString(doubleToInt);
        System.out.println(givenNumber + " (rounded up to " + doubleToInt + ") in binary code is " + result);
    }
}
