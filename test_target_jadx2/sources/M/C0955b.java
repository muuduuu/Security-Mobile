package M;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC1469x;

/* renamed from: M.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0955b extends z {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5890a;

    /* renamed from: b, reason: collision with root package name */
    private final E.g f5891b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5892c;

    /* renamed from: d, reason: collision with root package name */
    private final Size f5893d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f5894e;

    /* renamed from: f, reason: collision with root package name */
    private final int f5895f;

    /* renamed from: g, reason: collision with root package name */
    private final Matrix f5896g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC1469x f5897h;

    C0955b(Object obj, E.g gVar, int i10, Size size, Rect rect, int i11, Matrix matrix, InterfaceC1469x interfaceC1469x) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.f5890a = obj;
        this.f5891b = gVar;
        this.f5892c = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f5893d = size;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f5894e = rect;
        this.f5895f = i11;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransform");
        }
        this.f5896g = matrix;
        if (interfaceC1469x == null) {
            throw new NullPointerException("Null cameraCaptureResult");
        }
        this.f5897h = interfaceC1469x;
    }

    @Override // M.z
    public InterfaceC1469x a() {
        return this.f5897h;
    }

    @Override // M.z
    public Rect b() {
        return this.f5894e;
    }

    @Override // M.z
    public Object c() {
        return this.f5890a;
    }

    @Override // M.z
    public E.g d() {
        return this.f5891b;
    }

    @Override // M.z
    public int e() {
        return this.f5892c;
    }

    public boolean equals(Object obj) {
        E.g gVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f5890a.equals(zVar.c()) && ((gVar = this.f5891b) != null ? gVar.equals(zVar.d()) : zVar.d() == null) && this.f5892c == zVar.e() && this.f5893d.equals(zVar.h()) && this.f5894e.equals(zVar.b()) && this.f5895f == zVar.f() && this.f5896g.equals(zVar.g()) && this.f5897h.equals(zVar.a());
    }

    @Override // M.z
    public int f() {
        return this.f5895f;
    }

    @Override // M.z
    public Matrix g() {
        return this.f5896g;
    }

    @Override // M.z
    public Size h() {
        return this.f5893d;
    }

    public int hashCode() {
        int hashCode = (this.f5890a.hashCode() ^ 1000003) * 1000003;
        E.g gVar = this.f5891b;
        return ((((((((((((hashCode ^ (gVar == null ? 0 : gVar.hashCode())) * 1000003) ^ this.f5892c) * 1000003) ^ this.f5893d.hashCode()) * 1000003) ^ this.f5894e.hashCode()) * 1000003) ^ this.f5895f) * 1000003) ^ this.f5896g.hashCode()) * 1000003) ^ this.f5897h.hashCode();
    }

    public String toString() {
        return "Packet{data=" + this.f5890a + ", exif=" + this.f5891b + ", format=" + this.f5892c + ", size=" + this.f5893d + ", cropRect=" + this.f5894e + ", rotationDegrees=" + this.f5895f + ", sensorToBufferTransform=" + this.f5896g + ", cameraCaptureResult=" + this.f5897h + "}";
    }
}
