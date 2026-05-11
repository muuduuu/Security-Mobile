package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes2.dex */
abstract class z {

    /* renamed from: a, reason: collision with root package name */
    private static w f27873a;

    static synchronized w a(Context context) {
        w wVar;
        synchronized (z.class) {
            try {
                if (f27873a == null) {
                    v vVar = new v(null);
                    vVar.a(e8.h.a(context));
                    f27873a = vVar.b();
                }
                wVar = f27873a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }
}
