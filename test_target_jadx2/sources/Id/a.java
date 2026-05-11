package Id;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f4428a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal[] f4429b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal();
        }
        f4429b = threadLocalArr;
    }

    public static final boolean a() {
        return f4428a;
    }
}
