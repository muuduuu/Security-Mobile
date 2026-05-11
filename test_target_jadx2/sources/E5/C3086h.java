package e5;

import com.facebook.react.uimanager.C1944g0;

/* renamed from: e5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3086h {

    /* renamed from: a, reason: collision with root package name */
    private final float f32240a;

    /* renamed from: b, reason: collision with root package name */
    private final float f32241b;

    public C3086h(float f10, float f11) {
        this.f32240a = f10;
        this.f32241b = f11;
    }

    public final float a() {
        return this.f32240a;
    }

    public final float b() {
        return this.f32241b;
    }

    public final C3086h c() {
        return new C3086h(C1944g0.g(this.f32240a), C1944g0.g(this.f32241b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3086h)) {
            return false;
        }
        C3086h c3086h = (C3086h) obj;
        return Float.compare(this.f32240a, c3086h.f32240a) == 0 && Float.compare(this.f32241b, c3086h.f32241b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f32240a) * 31) + Float.hashCode(this.f32241b);
    }

    public String toString() {
        return "CornerRadii(horizontal=" + this.f32240a + ", vertical=" + this.f32241b + ")";
    }
}
