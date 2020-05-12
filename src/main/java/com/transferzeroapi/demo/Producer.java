package com.transferzeroapi.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Producer
{
    final Logger LOGGER = LoggerFactory.getLogger(Producer.class);

    @Scheduled(fixedDelay = 3000)
    public void doSomething()
    {
        LOGGER.info("Logging!");
    }
}
