package org.rtkit.aidavydenko.components;

import org.rtkit.aidavydenko.StringModifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetResult implements StringModifier{

    private List<StringModifier> BeansList;

    public GetResult(List<StringModifier> stringModifierList) {
        this.BeansList = stringModifierList;}

    @Override
    public String modify(String source) {
        String result = source;
        for (StringModifier strmd :
                BeansList) {
            result = strmd.modify(result);
        }
        return result;
    }

    @Override
    public int getOrder() {
        return 4;
    }
}
