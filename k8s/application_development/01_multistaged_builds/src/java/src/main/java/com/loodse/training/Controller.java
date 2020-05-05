package com.loodse.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static final Logger LOG = LoggerFactory.getLogger(Controller.class);

    @Value("${my.property}")
    private String myProperty;

	@GetMapping("/")
	public String root() {
        LOG.info("root request");
		return "hello";
    }

    @GetMapping("/applicationProperty")
	public String getApplicationProperty() {
        LOG.info("applicationProperty request");
		return "my.property is set to " + myProperty;
    }
   
}