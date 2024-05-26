package homework_02.managers.number;

import homework_02.converters.BinaryCodeConverter;
import homework_02.converters.OctalCodeConverter;
import org.springframework.beans.factory.annotation.Autowired;

public class CodeConverterManager {
    @Autowired
    private BinaryCodeConverter binaryCodeConverter;
    @Autowired
    private OctalCodeConverter octalCodeConverter;

    /*
    public void setBinaryCodeConverter(BinaryCodeConverter binaryCodeConverter) {
        this.binaryCodeConverter = binaryCodeConverter;
    }

    public void setOctalCodeConverter(OctalCodeConverter octalCodeConverter) {
        this.octalCodeConverter = octalCodeConverter;
    }
*/
    public void manageNumber (double givenNumber) {
        binaryCodeConverter.numberToBinary(givenNumber);
        octalCodeConverter.numberToOctal(givenNumber);
    }
}
