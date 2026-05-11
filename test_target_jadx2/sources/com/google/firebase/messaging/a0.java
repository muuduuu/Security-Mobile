package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class a0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f28149a;

    a0(String str) {
        super(str);
        this.f28149a = a(str);
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase) {
        }
        return 0;
    }
}
