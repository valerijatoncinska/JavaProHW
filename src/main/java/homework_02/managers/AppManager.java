package homework_02.managers;

import homework_02.handlers.AppHandler;
import homework_02.managers.number.NumberManager;
import org.springframework.beans.factory.annotation.Autowired;

public class AppManager {
    @Autowired
    private AppHandler appCommands;
    @Autowired
    private NumberManager numberManager;

//    public void setNumberManager(NumberManager numberManager) {
//        this.numberManager = numberManager;
//    }
//
//    public void setAppCommands(AppHandler appCommands) {
//        this.appCommands = appCommands;
//    }

    public void manageApp() {
        appCommands.greeting();
        numberManager.analyseNumber(appCommands.scannerManager());
        appCommands.goodbye();
    }
}
