package org.rtkit.aidavydenko;

import org.rtkit.aidavydenko.components.GetResult;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
@ComponentScan
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
