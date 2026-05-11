package C5;

import java.lang.ref.SoftReference;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final k f892a;

    /* renamed from: b, reason: collision with root package name */
    protected static final ThreadLocal f893b;

    static {
        boolean z10;
        try {
            z10 = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f892a = z10 ? k.a() : null;
        f893b = new ThreadLocal();
    }

    public static a a() {
        ThreadLocal threadLocal = f893b;
        SoftReference softReference = (SoftReference) threadLocal.get();
        a aVar = softReference == null ? null : (a) softReference.get();
        if (aVar == null) {
            aVar = new a();
            k kVar = f892a;
            threadLocal.set(kVar != null ? kVar.c(aVar) : new SoftReference(aVar));
        }
        return aVar;
    }
}
