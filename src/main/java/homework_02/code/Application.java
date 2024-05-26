package homework_02.code;

import homework_02.managers.AppManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {
    public static void main(String[] args) {
        /*
        App variant without Spring

        MultiplicationHandler multiplicationHandler = new MultiplicationHandler();
        LogarithmHandler logarithmHandler = new LogarithmHandler();
        BinaryCodeConverter binaryCodeConverter = new BinaryCodeConverter();
        OctalCodeConverter octalCodeConverter = new OctalCodeConverter();
        OddOrEvenAnalysis oddOrEvenAnalysis = new OddOrEvenAnalysis();

        CodeConverterManager codeConverterManager = new CodeConverterManager();
        codeConverterManager.setBinaryCodeConverter(binaryCodeConverter);
        codeConverterManager.setOctalCodeConverter(octalCodeConverter);

        MultplAndLogManager multplAndLogManager = new MultplAndLogManager();
        multplAndLogManager.setLogarithmHandler(logarithmHandler);
        multplAndLogManager.setMultiplicationHandler(multiplicationHandler);

        NumberManager numberManager = new NumberManager();
        numberManager.setCodeConverterManager(codeConverterManager);
        numberManager.setOddOrEvenAnalysis(oddOrEvenAnalysis);
        numberManager.setMultplAndLogManager(multplAndLogManager);

        AppHandler appCommands = new AppHandler();
        AppManager appManager = new AppManager();
        appManager.setAppCommands(appCommands);
        appManager.setNumberManager(numberManager);

        appManager.handleApp();
         */

        // App variant WITH Spring
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("homework_02.appConfig");
        AppManager appManager = context.getBean(AppManager.class);
        appManager.manageApp();

    }
}
