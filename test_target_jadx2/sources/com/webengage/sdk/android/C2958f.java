package com.webengage.sdk.android;

import android.content.Context;
import java.util.Queue;

/* renamed from: com.webengage.sdk.android.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2958f {

    /* renamed from: a, reason: collision with root package name */
    static Analytics f30518a;

    /* renamed from: b, reason: collision with root package name */
    static Analytics f30519b;

    /* renamed from: c, reason: collision with root package name */
    static Analytics f30520c;

    protected static Analytics a() {
        if (f30519b == null) {
            f30519b = new C2960h();
        }
        return f30519b;
    }

    public static Analytics a(Context context) {
        if (f30518a == null) {
            C2961i c2961i = new C2961i(context.getApplicationContext());
            f30518a = new C2959g(context, c2961i, new z2(c2961i, context.getApplicationContext()), new x2(context.getApplicationContext()));
        }
        return f30518a;
    }

    protected static Analytics a(Queue<v3> queue) {
        if (f30520c == null) {
            f30520c = new k2(queue);
        }
        return f30520c;
    }
}
