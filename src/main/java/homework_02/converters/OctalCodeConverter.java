package homework_02.converters;

public class OctalCodeConverter {

    public void numberToOctal(double givenNumber){

        int doubleToInt = (int) Math.round(givenNumber);
        String result = Integer.toOctalString(doubleToInt);
        System.out.println(givenNumber + " (rounded up to " + doubleToInt + ") in octal code is " + result);
    }

}
