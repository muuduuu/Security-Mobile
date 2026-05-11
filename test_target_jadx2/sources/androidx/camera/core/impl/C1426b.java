package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* renamed from: androidx.camera.core.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1426b extends AbstractC1424a {

    /* renamed from: a, reason: collision with root package name */
    private final b1 f14529a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14530b;

    /* renamed from: c, reason: collision with root package name */
    private final Size f14531c;

    /* renamed from: d, reason: collision with root package name */
    private final A.B f14532d;

    /* renamed from: e, reason: collision with root package name */
    private final List f14533e;

    /* renamed from: f, reason: collision with root package name */
    private final V f14534f;

    /* renamed from: g, reason: collision with root package name */
    private final Range f14535g;

    C1426b(b1 b1Var, int i10, Size size, A.B b10, List list, V v10, Range range) {
        if (b1Var == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f14529a = b1Var;
        this.f14530b = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f14531c = size;
        if (b10 == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f14532d = b10;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f14533e = list;
        this.f14534f = v10;
        this.f14535g = range;
    }

    @Override // androidx.camera.core.impl.AbstractC1424a
    public List b() {
        return this.f14533e;
    }

    @Override // androidx.camera.core.impl.AbstractC1424a
    public A.B c() {
        return this.f14532d;
    }

    @Override // androidx.camera.core.impl.AbstractC1424a
    public int d() {
        return this.f14530b;
    }

    @Override // androidx.camera.core.impl.AbstractC1424a
    public V e() {
        return this.f14534f;
    }

    public boolean equals(Object obj) {
        V v10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1424a)) {
            return false;
        }
        AbstractC1424a abstractC1424a = (AbstractC1424a) obj;
        if (this.f14529a.equals(abstractC1424a.g()) && this.f14530b == abstractC1424a.d() && this.f14531c.equals(abstractC1424a.f()) && this.f14532d.equals(abstractC1424a.c()) && this.f14533e.equals(abstractC1424a.b()) && ((v10 = this.f14534f) != null ? v10.equals(abstractC1424a.e()) : abstractC1424a.e() == null)) {
            Range range = this.f14535g;
            if (range == null) {
                if (abstractC1424a.h() == null) {
                    return true;
                }
            } else if (range.equals(abstractC1424a.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.AbstractC1424a
    public Size f() {
        return this.f14531c;
    }

    @Override // androidx.camera.core.impl.AbstractC1424a
    public b1 g() {
        return this.f14529a;
    }

    @Override // androidx.camera.core.impl.AbstractC1424a
    public Range h() {
        return this.f14535g;
    }

    public int hashCode() {
        int hashCode = (((((((((this.f14529a.hashCode() ^ 1000003) * 1000003) ^ this.f14530b) * 1000003) ^ this.f14531c.hashCode()) * 1000003) ^ this.f14532d.hashCode()) * 1000003) ^ this.f14533e.hashCode()) * 1000003;
        V v10 = this.f14534f;
        int hashCode2 = (hashCode ^ (v10 == null ? 0 : v10.hashCode())) * 1000003;
        Range range = this.f14535g;
        return hashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f14529a + ", imageFormat=" + this.f14530b + ", size=" + this.f14531c + ", dynamicRange=" + this.f14532d + ", captureTypes=" + this.f14533e + ", implementationOptions=" + this.f14534f + ", targetFrameRate=" + this.f14535g + "}";
    }
}
