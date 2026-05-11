package com.google.android.gms.internal.clearcut;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
final class M0 {

    /* renamed from: c, reason: collision with root package name */
    private static final M0 f23864c = new M0();

    /* renamed from: a, reason: collision with root package name */
    private final S0 f23865a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f23866b = new ConcurrentHashMap();

    private M0() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        S0 s02 = null;
        for (int i10 = 0; i10 <= 0; i10++) {
            s02 = c(strArr[0]);
            if (s02 != null) {
                break;
            }
        }
        this.f23865a = s02 == null ? new C2157q0() : s02;
    }

    public static M0 a() {
        return f23864c;
    }

    private static S0 c(String str) {
        try {
            return (S0) Class.forName(str).getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final R0 b(Class cls) {
        AbstractC2115c0.e(cls, "messageType");
        R0 r02 = (R0) this.f23866b.get(cls);
        if (r02 != null) {
            return r02;
        }
        R0 a10 = this.f23865a.a(cls);
        AbstractC2115c0.e(cls, "messageType");
        AbstractC2115c0.e(a10, "schema");
        R0 r03 = (R0) this.f23866b.putIfAbsent(cls, a10);
        return r03 != null ? r03 : a10;
    }

    public final R0 d(Object obj) {
        return b(obj.getClass());
    }
}
