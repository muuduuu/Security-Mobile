package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class M {

    /* renamed from: a, reason: collision with root package name */
    private static final K f16303a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final K f16304b = new L();

    static K a() {
        return f16303a;
    }

    static K b() {
        return f16304b;
    }

    private static K c() {
        if (b0.f16333d) {
            return null;
        }
        try {
            return (K) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
