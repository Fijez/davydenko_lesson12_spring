package org.rtkit.aidavydenko.components;

import org.rtkit.aidavydenko.StringModifier;
import org.springframework.stereotype.Component;

@Component
public class FirstToUpperCase implements StringModifier {
    @Override
    public String modify(String source) {
        String resultStr;
        resultStr = source.substring(0,1).toUpperCase();
        resultStr = resultStr.concat(source.substring(1));
        return resultStr;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
