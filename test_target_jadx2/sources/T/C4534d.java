package t;

import android.util.Size;
import java.util.List;
import t.M;

/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4534d extends M.k {

    /* renamed from: a, reason: collision with root package name */
    private final String f42036a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f42037b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.camera.core.impl.V0 f42038c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.camera.core.impl.l1 f42039d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f42040e;

    /* renamed from: f, reason: collision with root package name */
    private final androidx.camera.core.impl.Z0 f42041f;

    /* renamed from: g, reason: collision with root package name */
    private final List f42042g;

    C4534d(String str, Class cls, androidx.camera.core.impl.V0 v02, androidx.camera.core.impl.l1 l1Var, Size size, androidx.camera.core.impl.Z0 z02, List list) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f42036a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.f42037b = cls;
        if (v02 == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f42038c = v02;
        if (l1Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f42039d = l1Var;
        this.f42040e = size;
        this.f42041f = z02;
        this.f42042g = list;
    }

    @Override // t.M.k
    List c() {
        return this.f42042g;
    }

    @Override // t.M.k
    androidx.camera.core.impl.V0 d() {
        return this.f42038c;
    }

    @Override // t.M.k
    androidx.camera.core.impl.Z0 e() {
        return this.f42041f;
    }

    public boolean equals(Object obj) {
        Size size;
        androidx.camera.core.impl.Z0 z02;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M.k)) {
            return false;
        }
        M.k kVar = (M.k) obj;
        if (this.f42036a.equals(kVar.h()) && this.f42037b.equals(kVar.i()) && this.f42038c.equals(kVar.d()) && this.f42039d.equals(kVar.g()) && ((size = this.f42040e) != null ? size.equals(kVar.f()) : kVar.f() == null) && ((z02 = this.f42041f) != null ? z02.equals(kVar.e()) : kVar.e() == null)) {
            List list = this.f42042g;
            if (list == null) {
                if (kVar.c() == null) {
                    return true;
                }
            } else if (list.equals(kVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // t.M.k
    Size f() {
        return this.f42040e;
    }

    @Override // t.M.k
    androidx.camera.core.impl.l1 g() {
        return this.f42039d;
    }

    @Override // t.M.k
    String h() {
        return this.f42036a;
    }

    public int hashCode() {
        int hashCode = (((((((this.f42036a.hashCode() ^ 1000003) * 1000003) ^ this.f42037b.hashCode()) * 1000003) ^ this.f42038c.hashCode()) * 1000003) ^ this.f42039d.hashCode()) * 1000003;
        Size size = this.f42040e;
        int hashCode2 = (hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        androidx.camera.core.impl.Z0 z02 = this.f42041f;
        int hashCode3 = (hashCode2 ^ (z02 == null ? 0 : z02.hashCode())) * 1000003;
        List list = this.f42042g;
        return hashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // t.M.k
    Class i() {
        return this.f42037b;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f42036a + ", useCaseType=" + this.f42037b + ", sessionConfig=" + this.f42038c + ", useCaseConfig=" + this.f42039d + ", surfaceResolution=" + this.f42040e + ", streamSpec=" + this.f42041f + ", captureTypes=" + this.f42042g + "}";
    }
}
