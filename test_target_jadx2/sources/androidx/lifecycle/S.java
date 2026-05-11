package androidx.lifecycle;

import a1.C1341f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    private final C1341f f17091a = new C1341f();

    public final void a(String key, AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        C1341f c1341f = this.f17091a;
        if (c1341f != null) {
            c1341f.d(key, closeable);
        }
    }

    public final void b() {
        C1341f c1341f = this.f17091a;
        if (c1341f != null) {
            c1341f.e();
        }
        d();
    }

    public final AutoCloseable c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        C1341f c1341f = this.f17091a;
        if (c1341f != null) {
            return c1341f.g(key);
        }
        return null;
    }

    protected void d() {
    }
}
