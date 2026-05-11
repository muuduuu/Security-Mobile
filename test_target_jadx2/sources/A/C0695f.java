package A;

import A.x0;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: A.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0695f extends x0.a {

    /* renamed from: a, reason: collision with root package name */
    private final Size f165a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f166b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.camera.core.impl.H f167c;

    /* renamed from: d, reason: collision with root package name */
    private final int f168d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f169e;

    C0695f(Size size, Rect rect, androidx.camera.core.impl.H h10, int i10, boolean z10) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f165a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f166b = rect;
        this.f167c = h10;
        this.f168d = i10;
        this.f169e = z10;
    }

    @Override // A.x0.a
    public androidx.camera.core.impl.H a() {
        return this.f167c;
    }

    @Override // A.x0.a
    public Rect b() {
        return this.f166b;
    }

    @Override // A.x0.a
    public Size c() {
        return this.f165a;
    }

    @Override // A.x0.a
    public boolean d() {
        return this.f169e;
    }

    @Override // A.x0.a
    public int e() {
        return this.f168d;
    }

    public boolean equals(Object obj) {
        androidx.camera.core.impl.H h10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0.a)) {
            return false;
        }
        x0.a aVar = (x0.a) obj;
        return this.f165a.equals(aVar.c()) && this.f166b.equals(aVar.b()) && ((h10 = this.f167c) != null ? h10.equals(aVar.a()) : aVar.a() == null) && this.f168d == aVar.e() && this.f169e == aVar.d();
    }

    public int hashCode() {
        int hashCode = (((this.f165a.hashCode() ^ 1000003) * 1000003) ^ this.f166b.hashCode()) * 1000003;
        androidx.camera.core.impl.H h10 = this.f167c;
        return ((((hashCode ^ (h10 == null ? 0 : h10.hashCode())) * 1000003) ^ this.f168d) * 1000003) ^ (this.f169e ? 1231 : 1237);
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f165a + ", inputCropRect=" + this.f166b + ", cameraInternal=" + this.f167c + ", rotationDegrees=" + this.f168d + ", mirroring=" + this.f169e + "}";
    }
}
