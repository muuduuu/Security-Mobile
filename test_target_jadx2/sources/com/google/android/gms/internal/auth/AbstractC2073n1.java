package com.google.android.gms.internal.auth;

/* renamed from: com.google.android.gms.internal.auth.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2073n1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f23745a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2082q1 f23746b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2082q1 f23747c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f23748d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC2082q1 abstractC2082q1 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f23745a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                abstractC2082q1 = (AbstractC2082q1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f23746b = abstractC2082q1;
        f23747c = new C2090t1();
    }

    public static AbstractC2082q1 a() {
        return f23746b;
    }

    public static AbstractC2082q1 b() {
        return f23747c;
    }

    static void c(AbstractC2082q1 abstractC2082q1, Object obj, Object obj2) {
        abstractC2082q1.d(obj, abstractC2082q1.b(abstractC2082q1.a(obj), abstractC2082q1.a(obj2)));
    }

    public static void d(Class cls) {
        Class cls2;
        if (!C0.class.isAssignableFrom(cls) && (cls2 = f23745a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
