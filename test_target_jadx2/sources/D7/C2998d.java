package d7;

import android.content.Context;

/* renamed from: d7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2998d {

    /* renamed from: b, reason: collision with root package name */
    private static final C2998d f31278b = new C2998d();

    /* renamed from: a, reason: collision with root package name */
    private C2997c f31279a = null;

    public static C2997c a(Context context) {
        return f31278b.b(context);
    }

    public final synchronized C2997c b(Context context) {
        try {
            if (this.f31279a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f31279a = new C2997c(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f31279a;
    }
}
