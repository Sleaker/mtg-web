package net.roguelite.controller;

import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    
    Logger LOGGER = LoggerFactory.getLogger(AppController.class);

    @Value("${application.message:Got There!}")
    private String message = "Got there!";

    @GetMapping("/mtg")
    public String index(Map<String, Object> model) {
        LOGGER.info("Attempted to access index.");
        model.put("message", message);
        model.put("time", new Date());
        return "index";
    }
}