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
        this.stringModifierList = stringModifierList;}

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
