package kmo.docker.basics.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class Controller {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("get")
    public String get() {
        log.info("get triggered");
        return "<html><body><strong>EXAMPLE</strong></body></html>";
    }

    @Scheduled(fixedRate = 2000L, initialDelay = 5000L)
    public void schedule() {
        log.info("some event occurred at time: '{}'.", LocalDateTime.now().withNano(0));
    }
}
