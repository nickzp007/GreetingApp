package com.brigdelabz.GreetingApp.service;

import com.brigdelabz.GreetingApp.entity.Greeting;
import com.brigdelabz.GreetingApp.entity.User;

public interface GreetingService {

    Greeting addGreeting(User user);
    // Greeting getGreeting(long  id);
    Greeting editGreeting(Long id, String firstName, String lastName);
    String deleteGreeting(Long id);

}
