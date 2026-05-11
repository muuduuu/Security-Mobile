package A;

import android.graphics.Matrix;
import androidx.camera.core.impl.d1;

/* renamed from: A.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0691d extends AbstractC0694e0 {

    /* renamed from: a, reason: collision with root package name */
    private final d1 f155a;

    /* renamed from: b, reason: collision with root package name */
    private final long f156b;

    /* renamed from: c, reason: collision with root package name */
    private final int f157c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f158d;

    C0691d(d1 d1Var, long j10, int i10, Matrix matrix) {
        if (d1Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f155a = d1Var;
        this.f156b = j10;
        this.f157c = i10;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f158d = matrix;
    }

    @Override // A.AbstractC0694e0, A.Y
    public long a() {
        return this.f156b;
    }

    @Override // A.AbstractC0694e0, A.Y
    public d1 c() {
        return this.f155a;
    }

    @Override // A.AbstractC0694e0, A.Y
    public int d() {
        return this.f157c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0694e0)) {
            return false;
        }
        AbstractC0694e0 abstractC0694e0 = (AbstractC0694e0) obj;
        return this.f155a.equals(abstractC0694e0.c()) && this.f156b == abstractC0694e0.a() && this.f157c == abstractC0694e0.d() && this.f158d.equals(abstractC0694e0.f());
    }

    @Override // A.AbstractC0694e0
    public Matrix f() {
        return this.f158d;
    }

    public int hashCode() {
        int hashCode = (this.f155a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f156b;
        return ((((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f157c) * 1000003) ^ this.f158d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f155a + ", timestamp=" + this.f156b + ", rotationDegrees=" + this.f157c + ", sensorToBufferTransformMatrix=" + this.f158d + "}";
    }
}
