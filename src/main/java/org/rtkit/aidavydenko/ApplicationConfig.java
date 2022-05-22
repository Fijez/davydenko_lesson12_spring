package org.rtkit.aidavydenko;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class ApplicationConfig{

    @Bean
    public Map<String, String> alphabet(){
        Map<String, String> result = new HashMap<>();
            result.put("о", "л");
            result.put("в", "д");
            result.put("к", "ю");
            result.put("%", " ");
            result.put("~", "я");//в заданной строке стоит '~', а в заданном алфавите '-', я заменил - на ~
            result.put("Ж", "J");
            result.put("п", "v");
        return result;
    }
}
