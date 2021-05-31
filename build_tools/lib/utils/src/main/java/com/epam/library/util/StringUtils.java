package com.epam.library.util;

import static org.apache.commons.lang3.StringUtils.compare;

public class StringUtils {
    public boolean isPositiveNumber(String number) {
        return compare(number, "0") > 0;
    }
}
