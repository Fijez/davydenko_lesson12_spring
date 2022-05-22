package org.rtkit.aidavydenko;

import org.springframework.core.Ordered;

public interface StringModifier extends Ordered {

    String modify(String source);
}
