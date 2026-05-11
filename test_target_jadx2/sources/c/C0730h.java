package C;

import A.W;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: C.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0730h extends f0 {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f692b;

    /* renamed from: c, reason: collision with root package name */
    private final W.e f693c;

    /* renamed from: d, reason: collision with root package name */
    private final W.f f694d;

    /* renamed from: e, reason: collision with root package name */
    private final W.g f695e;

    /* renamed from: f, reason: collision with root package name */
    private final Rect f696f;

    /* renamed from: g, reason: collision with root package name */
    private final Matrix f697g;

    /* renamed from: h, reason: collision with root package name */
    private final int f698h;

    /* renamed from: i, reason: collision with root package name */
    private final int f699i;

    /* renamed from: j, reason: collision with root package name */
    private final int f700j;

    /* renamed from: k, reason: collision with root package name */
    private final List f701k;

    C0730h(Executor executor, W.e eVar, W.f fVar, W.g gVar, Rect rect, Matrix matrix, int i10, int i11, int i12, List list) {
        if (executor == null) {
            throw new NullPointerException("Null appExecutor");
        }
        this.f692b = executor;
        this.f693c = eVar;
        this.f694d = fVar;
        this.f695e = gVar;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f696f = rect;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f697g = matrix;
        this.f698h = i10;
        this.f699i = i11;
        this.f700j = i12;
        if (list == null) {
            throw new NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.f701k = list;
    }

    public boolean equals(Object obj) {
        W.e eVar;
        W.f fVar;
        W.g gVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f692b.equals(f0Var.g()) && ((eVar = this.f693c) != null ? eVar.equals(f0Var.j()) : f0Var.j() == null) && ((fVar = this.f694d) != null ? fVar.equals(f0Var.l()) : f0Var.l() == null) && ((gVar = this.f695e) != null ? gVar.equals(f0Var.m()) : f0Var.m() == null) && this.f696f.equals(f0Var.i()) && this.f697g.equals(f0Var.o()) && this.f698h == f0Var.n() && this.f699i == f0Var.k() && this.f700j == f0Var.h() && this.f701k.equals(f0Var.p());
    }

    @Override // C.f0
    Executor g() {
        return this.f692b;
    }

    @Override // C.f0
    int h() {
        return this.f700j;
    }

    public int hashCode() {
        int hashCode = (this.f692b.hashCode() ^ 1000003) * 1000003;
        W.e eVar = this.f693c;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        W.f fVar = this.f694d;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        W.g gVar = this.f695e;
        return ((((((((((((hashCode3 ^ (gVar != null ? gVar.hashCode() : 0)) * 1000003) ^ this.f696f.hashCode()) * 1000003) ^ this.f697g.hashCode()) * 1000003) ^ this.f698h) * 1000003) ^ this.f699i) * 1000003) ^ this.f700j) * 1000003) ^ this.f701k.hashCode();
    }

    @Override // C.f0
    Rect i() {
        return this.f696f;
    }

    @Override // C.f0
    public W.e j() {
        return this.f693c;
    }

    @Override // C.f0
    int k() {
        return this.f699i;
    }

    @Override // C.f0
    public W.f l() {
        return this.f694d;
    }

    @Override // C.f0
    W.g m() {
        return this.f695e;
    }

    @Override // C.f0
    int n() {
        return this.f698h;
    }

    @Override // C.f0
    Matrix o() {
        return this.f697g;
    }

    @Override // C.f0
    List p() {
        return this.f701k;
    }

    public String toString() {
        return "TakePictureRequest{appExecutor=" + this.f692b + ", inMemoryCallback=" + this.f693c + ", onDiskCallback=" + this.f694d + ", outputFileOptions=" + this.f695e + ", cropRect=" + this.f696f + ", sensorToBufferTransform=" + this.f697g + ", rotationDegrees=" + this.f698h + ", jpegQuality=" + this.f699i + ", captureMode=" + this.f700j + ", sessionConfigCameraCaptureCallbacks=" + this.f701k + "}";
    }
}
