package org.rtkit.aidavydenko.components;

import org.rtkit.aidavydenko.StringModifier;
import org.springframework.stereotype.Component;

@Component
public class ToLowerCase implements StringModifier {
    @Override
    public String modify(String source) {
        String resultString;
        resultString = source.toLowerCase();
        return  resultString;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
