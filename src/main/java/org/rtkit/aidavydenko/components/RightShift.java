package org.rtkit.aidavydenko.components;

import org.rtkit.aidavydenko.StringModifier;
import org.springframework.stereotype.Component;

@Component
public class RightShift implements StringModifier {
    @Override
    public String modify(String source) {
        String resultString;
        resultString = source.
                substring(source.length() - 2);
        resultString = resultString.
                concat(source.substring(0, source.length() - 2));
        return resultString;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
