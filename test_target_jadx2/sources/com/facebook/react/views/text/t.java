package com.facebook.react.views.text;

import java.text.BreakIterator;

/* loaded from: classes2.dex */
public enum t {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22882a;

        static {
            int[] iArr = new int[t.values().length];
            f22882a = iArr;
            try {
                iArr[t.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22882a[t.LOWERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22882a[t.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String apply(String str, t tVar) {
        if (str == null) {
            return null;
        }
        int i10 = a.f22882a[tVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? str : capitalize(str) : str.toLowerCase() : str.toUpperCase();
    }

    private static String capitalize(String str) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb2 = new StringBuilder(str.length());
        int first = wordInstance.first();
        while (true) {
            int i10 = first;
            first = wordInstance.next();
            if (first == -1) {
                return sb2.toString();
            }
            String substring = str.substring(i10, first);
            if (Character.isLetterOrDigit(substring.charAt(0))) {
                sb2.append(Character.toUpperCase(substring.charAt(0)));
                sb2.append(substring.substring(1).toLowerCase());
            } else {
                sb2.append(substring);
            }
        }
    }
}
