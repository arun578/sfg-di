package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.*;

@Configuration
public class GreetingServiceConfig {

    /*1. Stereotype annotations (like @Service, @Component) are best used for your own code because they make it easier to manage Spring beans through automatic scanning.
     2. For third-party libraries or components you don’t own, Java-based configuration is often necessary to bring those objects into the Spring context, particularly when custom configuration is required.

    Java-based configuration offers more flexibility, allowing you to define beans in whatever way is necessary, using the full power of the Java programming language.*/
    @Bean
    ConstructorGreetingService constructorGreetingService(){
        /*when it creates this bean, the bean name that's generated in the context is going to be the name of the method that you use.*/
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(){
        return new I18nEnglishGreetingService();
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18NSpanishService i18nSpanishGreetingService(){
        return new I18NSpanishService();
    }
}
