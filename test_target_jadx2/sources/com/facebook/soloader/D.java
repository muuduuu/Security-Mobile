package com.facebook.soloader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class D {
    private static boolean a(String str) {
        Matcher matcher = Pattern.compile("\\P{ASCII}+").matcher(str);
        if (!matcher.find()) {
            return false;
        }
        p.g("SoLoader", "Library name is corrupted, contains non-ASCII characters " + matcher.group());
        return true;
    }

    public static C b(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        C c10;
        if (unsatisfiedLinkError.getMessage() != null && unsatisfiedLinkError.getMessage().contains("ELF")) {
            p.a("SoLoader", "Corrupted lib file detected");
            c10 = new z(str, unsatisfiedLinkError.toString());
        } else if (a(str)) {
            p.a("SoLoader", "Corrupted lib name detected");
            c10 = new A(str, "corrupted lib name: " + unsatisfiedLinkError.toString());
        } else {
            c10 = new C(str, unsatisfiedLinkError.toString());
        }
        c10.initCause(unsatisfiedLinkError);
        return c10;
    }
}
