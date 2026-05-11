package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1537d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f16340a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f16341b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f16342c;

    static {
        f16342c = (f16340a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f16341b;
    }

    static boolean c() {
        return f16340a || !(f16341b == null || f16342c);
    }
}
