package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class F {

    /* renamed from: a, reason: collision with root package name */
    private static final D f16288a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final D f16289b = new E();

    static D a() {
        return f16288a;
    }

    static D b() {
        return f16289b;
    }

    private static D c() {
        if (b0.f16333d) {
            return null;
        }
        try {
            return (D) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
