package com.epam.multiproject.util;

import com.epam.library.util.StringUtils;

public class Utils {
    public boolean isAllPositiveNumbers(String... str) {
        StringUtils stringUtils = new StringUtils();
        for (String s : str) {
            if (!stringUtils.isPositiveNumber(s)) {
                return false;
            }
        }
        return true;
    }
}
