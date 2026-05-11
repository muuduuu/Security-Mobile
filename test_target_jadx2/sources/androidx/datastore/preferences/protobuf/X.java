package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class X {

    /* renamed from: a, reason: collision with root package name */
    private static final V f16329a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final V f16330b = new W();

    static V a() {
        return f16329a;
    }

    static V b() {
        return f16330b;
    }

    private static V c() {
        if (b0.f16333d) {
            return null;
        }
        try {
            return (V) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
