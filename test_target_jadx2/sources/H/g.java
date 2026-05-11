package H;

import A.M0;

/* loaded from: classes.dex */
public abstract class g implements M0 {
    public static M0 e(float f10, float f11, float f12, float f13) {
        return new b(f10, f11, f12, f13);
    }

    public static M0 f(M0 m02) {
        return new b(m02.c(), m02.a(), m02.b(), m02.d());
    }

    @Override // A.M0
    public abstract float a();

    @Override // A.M0
    public abstract float b();

    @Override // A.M0
    public abstract float c();

    @Override // A.M0
    public abstract float d();
}
