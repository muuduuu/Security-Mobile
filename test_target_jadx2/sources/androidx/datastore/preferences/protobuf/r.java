package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class r {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1549p f16457a = new C1550q();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC1549p f16458b = c();

    static AbstractC1549p a() {
        AbstractC1549p abstractC1549p = f16458b;
        if (abstractC1549p != null) {
            return abstractC1549p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC1549p b() {
        return f16457a;
    }

    private static AbstractC1549p c() {
        if (b0.f16333d) {
            return null;
        }
        try {
            return (AbstractC1549p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
