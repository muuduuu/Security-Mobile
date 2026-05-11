package J9;

import android.os.Build;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4869a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f4870b;

    static {
        f4870b = Build.VERSION.SDK_INT < 30;
    }

    private a() {
    }

    public final boolean a() {
        return f4870b;
    }
}
