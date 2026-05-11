package Od;

/* loaded from: classes3.dex */
abstract /* synthetic */ class F {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7305a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f7305a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
