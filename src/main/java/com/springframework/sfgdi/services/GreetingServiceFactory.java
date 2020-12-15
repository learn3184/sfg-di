package com.springframework.sfgdi.services;


public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService getGreetingsService(String lang) {
        switch (lang) {
            case "en":
                return new I18nEnglishGreetingService();
            case "de":
                return new I18nGermanGreetingService();
            case "es":
                return new I18nSpanishGreetingService();
            default:
                return new PrimaryGreetingService();
        }
    }
}
