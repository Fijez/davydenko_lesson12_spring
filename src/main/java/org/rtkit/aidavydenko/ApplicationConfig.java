package org.rtkit.aidavydenko;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class ApplicationConfig{

    @Bean
    public Map<String, String> alphabet(){
        Map<String, String> result = new HashMap<>();
            result.put("�", "�");
            result.put("�", "�");
            result.put("�", "�");
            result.put("%", " ");
            result.put("~", "�");//� �������� ������ ����� '~', � � �������� �������� '-', � ������� - �� ~
            result.put("�", "J");
            result.put("�", "v");
        return result;
    }
}
