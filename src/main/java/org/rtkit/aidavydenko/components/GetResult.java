package org.rtkit.aidavydenko.components;

import lombok.Getter;
import org.rtkit.aidavydenko.ApplicationConfig;
import org.rtkit.aidavydenko.StringModifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Component
public class GetResult implements StringModifier{

    private List<StringModifier> stringModifierList;

    @Autowired
    public GetResult(List<StringModifier> stringModifierList) {
        this.stringModifierList = stringModifierList;
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        stringModifierList.add(applicationContext.getBean(FirstToUpperCase.class));
//        stringModifierList.add(applicationContext.getBean(RebaseSymbols.class));
//        stringModifierList.add(applicationContext.getBean(RightShift.class));
//        stringModifierList.add(applicationContext.getBean(ToLowerCase.class));
//        stringModifierList.sort(Comparator.comparingInt(Ordered::getOrder));
    }

//    private String doPipeline(String source) {
//        String result = source;
//        for (StringModifier strmd :
//                stringModifierList) {
//            result = strmd.modify(result);
//        }
//        return result;
//    }

    @Override
    public String modify(String source) {
        String result = source;
        for (StringModifier strmd :
                stringModifierList) {
            result = strmd.modify(result);
        }
        return result;
    }

    @Override
    public int getOrder() {
        return 4;
    }
}
