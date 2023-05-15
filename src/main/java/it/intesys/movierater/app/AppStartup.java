package it.intesys.movierater.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartup {

    private final Logger log = LoggerFactory.getLogger(AppStartup.class);
    @EventListener(ApplicationReadyEvent.class)
    public void calculateActorsWithLongestCareer() {
        log.info("Calculate actors with longest career");
    }
}
