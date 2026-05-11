package C;

import A.InterfaceC0692d0;
import C.C0742u;
import M.C0973u;
import android.util.Size;

/* renamed from: C.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0724b extends C0742u.c {

    /* renamed from: d, reason: collision with root package name */
    private final Size f663d;

    /* renamed from: e, reason: collision with root package name */
    private final int f664e;

    /* renamed from: f, reason: collision with root package name */
    private final int f665f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f666g;

    /* renamed from: h, reason: collision with root package name */
    private final Size f667h;

    /* renamed from: i, reason: collision with root package name */
    private final int f668i;

    /* renamed from: j, reason: collision with root package name */
    private final C0973u f669j;

    /* renamed from: k, reason: collision with root package name */
    private final C0973u f670k;

    C0724b(Size size, int i10, int i11, boolean z10, InterfaceC0692d0 interfaceC0692d0, Size size2, int i12, C0973u c0973u, C0973u c0973u2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f663d = size;
        this.f664e = i10;
        this.f665f = i11;
        this.f666g = z10;
        this.f667h = size2;
        this.f668i = i12;
        if (c0973u == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f669j = c0973u;
        if (c0973u2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f670k = c0973u2;
    }

    @Override // C.C0742u.c
    C0973u b() {
        return this.f670k;
    }

    @Override // C.C0742u.c
    InterfaceC0692d0 c() {
        return null;
    }

    @Override // C.C0742u.c
    int d() {
        return this.f664e;
    }

    @Override // C.C0742u.c
    int e() {
        return this.f665f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0742u.c)) {
            return false;
        }
        C0742u.c cVar = (C0742u.c) obj;
        if (this.f663d.equals(cVar.j()) && this.f664e == cVar.d() && this.f665f == cVar.e() && this.f666g == cVar.l()) {
            cVar.c();
            Size size = this.f667h;
            if (size != null ? size.equals(cVar.g()) : cVar.g() == null) {
                if (this.f668i == cVar.f() && this.f669j.equals(cVar.i()) && this.f670k.equals(cVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // C.C0742u.c
    int f() {
        return this.f668i;
    }

    @Override // C.C0742u.c
    Size g() {
        return this.f667h;
    }

    public int hashCode() {
        int hashCode = (((((((this.f663d.hashCode() ^ 1000003) * 1000003) ^ this.f664e) * 1000003) ^ this.f665f) * 1000003) ^ (this.f666g ? 1231 : 1237)) * (-721379959);
        Size size = this.f667h;
        return ((((((hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003) ^ this.f668i) * 1000003) ^ this.f669j.hashCode()) * 1000003) ^ this.f670k.hashCode();
    }

    @Override // C.C0742u.c
    C0973u i() {
        return this.f669j;
    }

    @Override // C.C0742u.c
    Size j() {
        return this.f663d;
    }

    @Override // C.C0742u.c
    boolean l() {
        return this.f666g;
    }

    public String toString() {
        return "In{size=" + this.f663d + ", inputFormat=" + this.f664e + ", outputFormat=" + this.f665f + ", virtualCamera=" + this.f666g + ", imageReaderProxyProvider=" + ((Object) null) + ", postviewSize=" + this.f667h + ", postviewImageFormat=" + this.f668i + ", requestEdge=" + this.f669j + ", errorEdge=" + this.f670k + "}";
    }
}
