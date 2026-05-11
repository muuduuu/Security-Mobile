package O;

import android.opengl.EGLSurface;

/* loaded from: classes.dex */
final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    private final EGLSurface f6822a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6823b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6824c;

    c(EGLSurface eGLSurface, int i10, int i11) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f6822a = eGLSurface;
        this.f6823b = i10;
        this.f6824c = i11;
    }

    @Override // O.g
    public EGLSurface a() {
        return this.f6822a;
    }

    @Override // O.g
    public int b() {
        return this.f6824c;
    }

    @Override // O.g
    public int c() {
        return this.f6823b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f6822a.equals(gVar.a()) && this.f6823b == gVar.c() && this.f6824c == gVar.b();
    }

    public int hashCode() {
        return ((((this.f6822a.hashCode() ^ 1000003) * 1000003) ^ this.f6823b) * 1000003) ^ this.f6824c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f6822a + ", width=" + this.f6823b + ", height=" + this.f6824c + "}";
    }
}
