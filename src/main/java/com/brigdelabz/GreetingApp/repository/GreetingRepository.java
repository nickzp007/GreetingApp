package com.brigdelabz.GreetingApp.repository;


import com.brigdelabz.GreetingApp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long>{

}
