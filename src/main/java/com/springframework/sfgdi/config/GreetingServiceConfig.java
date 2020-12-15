package com.springframework.sfgdi.config;

import com.springframework.sfgdi.services.GreetingRepository;
import com.springframework.sfgdi.services.GreetingService;
import com.springframework.sfgdi.services.GreetingServiceFactory;
import com.springframework.sfgdi.services.PrimaryGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository)
    {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"default","en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.getGreetingsService("en");
    }

    @Bean
    @Primary
    @Profile({"es"})
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.getGreetingsService("es");
    }

    @Bean
    @Primary
    @Profile({"de"})
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.getGreetingsService("de");
    }

}
