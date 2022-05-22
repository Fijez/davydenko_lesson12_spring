package org.rtkit.aidavydenko;

import org.rtkit.aidavydenko.components.GetResult;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Demo {
    private static final String FOR_ENCODING = "Vа%во~%окве…жа";

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        GetResult result = applicationContext.getBean(GetResult.class);
        System.out.println(result.modify(FOR_ENCODING));
    }
}
