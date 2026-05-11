package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface f {
    String a(String str);

    default Boolean b(String str) {
        String a10 = a(str);
        if (a10 != null) {
            return Boolean.valueOf(a10);
        }
        return null;
    }

    default Long c(String str) {
        String a10 = a(str);
        if (a10 != null) {
            try {
                return Long.valueOf(a10);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    default Double d(String str) {
        String a10 = a(str);
        if (a10 != null) {
            try {
                return Double.valueOf(a10);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    default String e(String str, String str2) {
        String a10 = a(str);
        return a10 != null ? a10 : str2;
    }

    default List f(String str) {
        String a10 = a(str);
        return a10 != null ? Arrays.asList(a10.split(",")) : Collections.emptyList();
    }

    Map getMap(String str);
}
