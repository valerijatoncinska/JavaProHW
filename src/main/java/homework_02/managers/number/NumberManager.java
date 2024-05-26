package homework_02.managers.number;

import homework_02.handlers.number.analysis.OddOrEvenAnalysis;
import org.springframework.beans.factory.annotation.Autowired;

public class NumberManager {
    @Autowired
    private MultplAndLogManager multplAndLogManager;
    @Autowired
    private CodeConverterManager codeConverterManager;
    @Autowired
    private OddOrEvenAnalysis oddOrEvenAnalysis;

    /*
    public void setMultplAndLogManager(MultplAndLogManager multplAndLogManager) {
        this.multplAndLogManager = multplAndLogManager;
    }

    public void setCodeConverterManager(CodeConverterManager codeConverterManager) {
        this.codeConverterManager = codeConverterManager;
    }

    public void setOddOrEvenAnalysis(OddOrEvenAnalysis oddOrEvenAnalysis) {
        this.oddOrEvenAnalysis = oddOrEvenAnalysis;
    }*/

    public void analyseNumber(double givenNumber) {
        multplAndLogManager.manageNumber(givenNumber);
        codeConverterManager.manageNumber(givenNumber);
        oddOrEvenAnalysis.manageNumber(givenNumber);
    }

}
