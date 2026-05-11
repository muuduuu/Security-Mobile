package A;

import A.I0;
import android.view.Surface;

/* renamed from: A.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0699h extends I0.g {

    /* renamed from: a, reason: collision with root package name */
    private final int f183a;

    /* renamed from: b, reason: collision with root package name */
    private final Surface f184b;

    C0699h(int i10, Surface surface) {
        this.f183a = i10;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f184b = surface;
    }

    @Override // A.I0.g
    public int a() {
        return this.f183a;
    }

    @Override // A.I0.g
    public Surface b() {
        return this.f184b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I0.g)) {
            return false;
        }
        I0.g gVar = (I0.g) obj;
        return this.f183a == gVar.a() && this.f184b.equals(gVar.b());
    }

    public int hashCode() {
        return ((this.f183a ^ 1000003) * 1000003) ^ this.f184b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f183a + ", surface=" + this.f184b + "}";
    }
}
