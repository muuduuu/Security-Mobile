package O;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final UUID f6814a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6815b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6816c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f6817d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f6818e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6819f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f6820g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f6821h;

    b(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z10, boolean z11) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f6814a = uuid;
        this.f6815b = i10;
        this.f6816c = i11;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f6817d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f6818e = size;
        this.f6819f = i12;
        this.f6820g = z10;
        this.f6821h = z11;
    }

    @Override // O.f
    public Rect a() {
        return this.f6817d;
    }

    @Override // O.f
    public int b() {
        return this.f6816c;
    }

    @Override // O.f
    public int c() {
        return this.f6819f;
    }

    @Override // O.f
    public Size d() {
        return this.f6818e;
    }

    @Override // O.f
    public int e() {
        return this.f6815b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f6814a.equals(fVar.f()) && this.f6815b == fVar.e() && this.f6816c == fVar.b() && this.f6817d.equals(fVar.a()) && this.f6818e.equals(fVar.d()) && this.f6819f == fVar.c() && this.f6820g == fVar.g() && this.f6821h == fVar.k();
    }

    @Override // O.f
    UUID f() {
        return this.f6814a;
    }

    @Override // O.f
    public boolean g() {
        return this.f6820g;
    }

    public int hashCode() {
        return ((((((((((((((this.f6814a.hashCode() ^ 1000003) * 1000003) ^ this.f6815b) * 1000003) ^ this.f6816c) * 1000003) ^ this.f6817d.hashCode()) * 1000003) ^ this.f6818e.hashCode()) * 1000003) ^ this.f6819f) * 1000003) ^ (this.f6820g ? 1231 : 1237)) * 1000003) ^ (this.f6821h ? 1231 : 1237);
    }

    @Override // O.f
    public boolean k() {
        return this.f6821h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f6814a + ", getTargets=" + this.f6815b + ", getFormat=" + this.f6816c + ", getCropRect=" + this.f6817d + ", getSize=" + this.f6818e + ", getRotationDegrees=" + this.f6819f + ", isMirroring=" + this.f6820g + ", shouldRespectInputCropRect=" + this.f6821h + "}";
    }
}
