package A;

import A.I0;
import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: A.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0701i extends I0.h {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f186a;

    /* renamed from: b, reason: collision with root package name */
    private final int f187b;

    /* renamed from: c, reason: collision with root package name */
    private final int f188c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f189d;

    /* renamed from: e, reason: collision with root package name */
    private final Matrix f190e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f191f;

    C0701i(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f186a = rect;
        this.f187b = i10;
        this.f188c = i11;
        this.f189d = z10;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f190e = matrix;
        this.f191f = z11;
    }

    @Override // A.I0.h
    public Rect a() {
        return this.f186a;
    }

    @Override // A.I0.h
    public int b() {
        return this.f187b;
    }

    @Override // A.I0.h
    public Matrix c() {
        return this.f190e;
    }

    @Override // A.I0.h
    public int d() {
        return this.f188c;
    }

    @Override // A.I0.h
    public boolean e() {
        return this.f189d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I0.h)) {
            return false;
        }
        I0.h hVar = (I0.h) obj;
        return this.f186a.equals(hVar.a()) && this.f187b == hVar.b() && this.f188c == hVar.d() && this.f189d == hVar.e() && this.f190e.equals(hVar.c()) && this.f191f == hVar.f();
    }

    @Override // A.I0.h
    public boolean f() {
        return this.f191f;
    }

    public int hashCode() {
        return ((((((((((this.f186a.hashCode() ^ 1000003) * 1000003) ^ this.f187b) * 1000003) ^ this.f188c) * 1000003) ^ (this.f189d ? 1231 : 1237)) * 1000003) ^ this.f190e.hashCode()) * 1000003) ^ (this.f191f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f186a + ", getRotationDegrees=" + this.f187b + ", getTargetRotation=" + this.f188c + ", hasCameraTransform=" + this.f189d + ", getSensorToBufferTransform=" + this.f190e + ", isMirroring=" + this.f191f + "}";
    }
}
