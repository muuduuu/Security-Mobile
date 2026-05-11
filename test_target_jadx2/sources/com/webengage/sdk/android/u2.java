package com.webengage.sdk.android;

import com.webengage.sdk.android.actions.rules.RuleExecutor;

/* loaded from: classes2.dex */
public class u2 {

    /* renamed from: a, reason: collision with root package name */
    static RuleExecutor f30850a;

    /* renamed from: b, reason: collision with root package name */
    static RuleExecutor f30851b;

    public static RuleExecutor a() {
        if (f30851b == null) {
            f30851b = new w2();
        }
        return f30851b;
    }

    public static RuleExecutor b() {
        if (f30850a == null) {
            synchronized (u2.class) {
                try {
                    if (f30850a == null) {
                        f30850a = new v2();
                    }
                } finally {
                }
            }
        }
        return f30850a;
    }
}
