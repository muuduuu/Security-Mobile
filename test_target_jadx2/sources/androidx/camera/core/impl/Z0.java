package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C1444k;

/* loaded from: classes.dex */
public abstract class Z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Range f14526a = new Range(0, 0);

    public static abstract class a {
        a() {
        }

        public abstract Z0 a();

        public abstract a b(A.B b10);

        public abstract a c(Range range);

        public abstract a d(V v10);

        public abstract a e(Size size);

        public abstract a f(boolean z10);
    }

    public static a a(Size size) {
        return new C1444k.b().e(size).c(f14526a).b(A.B.f7d).f(false);
    }

    public abstract A.B b();

    public abstract Range c();

    public abstract V d();

    public abstract Size e();

    public abstract boolean f();

    public abstract a g();
}
