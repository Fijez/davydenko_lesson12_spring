package org.rtkit.aidavydenko.components;

import org.rtkit.aidavydenko.StringModifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


@Component
public class RebaseSymbols implements StringModifier {

    private final Map<String, String> alphabet;

    public RebaseSymbols(Map<String, String> alphabet) {
        this.alphabet = alphabet;
    }

    @Override
    public String modify(String source) {
        String result;
        result = Arrays.stream(source.split("")).map(c -> {
            if (alphabet.containsKey(c)) {return alphabet.get(c);}
            return c;
        }).collect(Collectors.joining());
        return result;
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
