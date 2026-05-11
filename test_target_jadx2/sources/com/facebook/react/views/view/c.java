package com.facebook.react.views.view;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f22984a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static Method f22985b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f22986c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f22987d;

    private c() {
    }

    public static final void a(Canvas canvas, boolean z10) {
        Method method;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (Build.VERSION.SDK_INT >= 29) {
            if (z10) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        f22984a.b();
        if (z10) {
            try {
                Method method2 = f22985b;
                if (method2 != null) {
                    if (method2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return;
            }
        }
        if (z10 || (method = f22986c) == null) {
            return;
        }
        if (method == null) {
            throw new IllegalStateException("Required value was null.");
        }
        method.invoke(canvas, null);
    }

    private final void b() {
        Method method;
        if (f22987d) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT == 28) {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Object[].class);
                Object invoke = declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                Intrinsics.e(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
                f22985b = (Method) invoke;
                Object invoke2 = declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                Intrinsics.e(invoke2, "null cannot be cast to non-null type java.lang.reflect.Method");
                f22986c = (Method) invoke2;
            } else {
                f22985b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                f22986c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
            }
            method = f22985b;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (method != null && f22986c != null) {
            if (method != null) {
                method.setAccessible(true);
            }
            Method method2 = f22986c;
            if (method2 != null) {
                method2.setAccessible(true);
            }
            f22987d = true;
        }
    }
}
