package com.centrica.test;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

@Component
public class ManagementEndPoint implements Endpoint<Greeting> {
     
    public String getId() {
        return "internal-greetings";
    }
 
    public boolean isEnabled() {
        return true;
    }
 
    public boolean isSensitive() {
        return true;
    }
 
    public Greeting invoke() {
        return new Greeting("Hello Management");
    }
}
