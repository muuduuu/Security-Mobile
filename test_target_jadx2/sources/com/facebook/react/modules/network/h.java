package com.facebook.react.modules.network;

import Td.B;
import Td.C1227c;
import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static B f21844a;

    public static B a() {
        return c().c();
    }

    public static B b(Context context) {
        return d(context).c();
    }

    public static B.a c() {
        B.a aVar = new B.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return aVar.g(0L, timeUnit).d0(0L, timeUnit).i0(0L, timeUnit).j(new n());
    }

    public static B.a d(Context context) {
        return e(context, 10485760);
    }

    public static B.a e(Context context, int i10) {
        B.a c10 = c();
        return i10 == 0 ? c10 : c10.d(new C1227c(new File(context.getCacheDir(), "http-cache"), i10));
    }

    public static B f() {
        if (f21844a == null) {
            f21844a = a();
        }
        return f21844a;
    }
}
