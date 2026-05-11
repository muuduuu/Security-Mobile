package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class T4 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile T4 f24380b;

    /* renamed from: c, reason: collision with root package name */
    static final T4 f24381c = new T4(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f24382a = Collections.emptyMap();

    T4(boolean z10) {
    }

    public static T4 a() {
        T4 t42 = f24380b;
        if (t42 != null) {
            return t42;
        }
        synchronized (T4.class) {
            try {
                T4 t43 = f24380b;
                if (t43 != null) {
                    return t43;
                }
                int i10 = P5.f24329d;
                T4 a10 = AbstractC2200b5.a(T4.class);
                f24380b = a10;
                return a10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractC2236f5 b(H5 h52, int i10) {
        android.support.v4.media.session.b.a(this.f24382a.get(new S4(h52, i10)));
        return null;
    }
}
