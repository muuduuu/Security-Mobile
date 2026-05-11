package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1547n {

    /* renamed from: a, reason: collision with root package name */
    static final Class f16420a = c();

    public static C1548o a() {
        C1548o b10 = b("getEmptyRegistry");
        return b10 != null ? b10 : C1548o.f16428c;
    }

    private static final C1548o b(String str) {
        Class cls = f16420a;
        if (cls == null) {
            return null;
        }
        try {
            return (C1548o) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
