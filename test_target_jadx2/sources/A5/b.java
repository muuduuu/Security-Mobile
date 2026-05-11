package A5;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    protected final int f343c;

    /* renamed from: a, reason: collision with root package name */
    protected final b f341a = null;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f345e = true;

    /* renamed from: d, reason: collision with root package name */
    protected final int f344d = -1;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f347g = false;

    /* renamed from: f, reason: collision with root package name */
    protected int f346f = 0;

    /* renamed from: b, reason: collision with root package name */
    protected final AtomicReference f342b = new AtomicReference(C0004b.a(64));

    static final class a {
    }

    /* renamed from: A5.b$b, reason: collision with other inner class name */
    private static final class C0004b {

        /* renamed from: a, reason: collision with root package name */
        final int f348a;

        /* renamed from: b, reason: collision with root package name */
        final int f349b;

        /* renamed from: c, reason: collision with root package name */
        final String[] f350c;

        /* renamed from: d, reason: collision with root package name */
        final a[] f351d;

        public C0004b(int i10, int i11, String[] strArr, a[] aVarArr) {
            this.f348a = i10;
            this.f349b = i11;
            this.f350c = strArr;
            this.f351d = aVarArr;
        }

        public static C0004b a(int i10) {
            return new C0004b(0, 0, new String[i10], new a[i10 >> 1]);
        }
    }

    private b(int i10) {
        this.f343c = i10;
    }

    public static b a() {
        long currentTimeMillis = System.currentTimeMillis();
        return b((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    protected static b b(int i10) {
        return new b(i10);
    }
}
