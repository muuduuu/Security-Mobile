package j4;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f35820a = new n();

    /* renamed from: b, reason: collision with root package name */
    private static final SparseIntArray f35821b = new SparseIntArray(0);

    private n() {
    }

    public static final C3492F a() {
        return new C3492F(0, f35820a.b(), f35821b);
    }

    private final int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return min > 16777216 ? (min / 4) * 3 : min / 2;
    }
}
