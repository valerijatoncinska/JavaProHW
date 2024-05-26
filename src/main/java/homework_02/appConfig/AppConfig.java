package homework_02.appConfig;

import homework_02.converters.BinaryCodeConverter;
import homework_02.converters.OctalCodeConverter;
import homework_02.handlers.number.MultiplicationHandler;
import homework_02.handlers.AppHandler;
import homework_02.handlers.number.LogarithmHandler;
import homework_02.handlers.number.analysis.OddOrEvenAnalysis;
import homework_02.managers.AppManager;
import homework_02.managers.number.CodeConverterManager;
import homework_02.managers.number.MultplAndLogManager;
import homework_02.managers.number.NumberManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public BinaryCodeConverter binaryCodeConverter() {
        return new BinaryCodeConverter();
    }
    @Bean
    public OctalCodeConverter octalCodeConverter() {
        return new OctalCodeConverter();
    }
    @Bean
    public OddOrEvenAnalysis oddOrEvenAnalysis() {
        return new OddOrEvenAnalysis();
    }
    @Bean
    public AppHandler appHandler() {
        return new AppHandler();
    }
    @Bean
    public LogarithmHandler logarithmHandler() {
        return new LogarithmHandler();
    }
    @Bean
    public MultiplicationHandler multiplicationHandler() {
        return new MultiplicationHandler();
    }
    @Bean
    public CodeConverterManager codeConverterManager() {
        return new CodeConverterManager();
    }
    @Bean
    public MultplAndLogManager multplAndLogManager() {
        return new MultplAndLogManager();
    }
    @Bean
    public NumberManager numberManager() {
        return new NumberManager();
    }
    @Bean
    public AppManager appManager() {
        return new AppManager();
    }
}
