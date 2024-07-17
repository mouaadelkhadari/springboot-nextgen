package com.spproject.spproject.config;

import com.spproject.spproject.common.Coach;
import com.spproject.spproject.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportCoach {

    @Bean("mouaad")
    public Coach swimCoach()
    {
        return new SwimCoach();
    }
}
