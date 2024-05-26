package homework_02.managers.number;

import homework_02.handlers.number.LogarithmHandler;
import homework_02.handlers.number.MultiplicationHandler;
import org.springframework.beans.factory.annotation.Autowired;

public class MultplAndLogManager {
    @Autowired
    private MultiplicationHandler multiplicationHandler;
    @Autowired
    private LogarithmHandler logarithmHandler;

    /*
    public void setMultiplicationHandler(MultiplicationHandler multiplicationHandler) {
        this.multiplicationHandler = multiplicationHandler;
    }

    public void setLogarithmHandler(LogarithmHandler logarithmHandler) {
        this.logarithmHandler = logarithmHandler;
    }
*/
    public void manageNumber (double givenNumber) {
        multiplicationHandler.multiplyBySelf(givenNumber);
        logarithmHandler.log10OfNumber(givenNumber);
    }
}
