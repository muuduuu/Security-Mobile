package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1448m extends c1 {

    /* renamed from: a, reason: collision with root package name */
    private final Size f14642a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f14643b;

    /* renamed from: c, reason: collision with root package name */
    private final Size f14644c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f14645d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f14646e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f14647f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f14648g;

    C1448m(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f14642a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f14643b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f14644c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f14645d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f14646e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f14647f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f14648g = map4;
    }

    @Override // androidx.camera.core.impl.c1
    public Size b() {
        return this.f14642a;
    }

    @Override // androidx.camera.core.impl.c1
    public Map d() {
        return this.f14647f;
    }

    @Override // androidx.camera.core.impl.c1
    public Size e() {
        return this.f14644c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f14642a.equals(c1Var.b()) && this.f14643b.equals(c1Var.j()) && this.f14644c.equals(c1Var.e()) && this.f14645d.equals(c1Var.h()) && this.f14646e.equals(c1Var.f()) && this.f14647f.equals(c1Var.d()) && this.f14648g.equals(c1Var.l());
    }

    @Override // androidx.camera.core.impl.c1
    public Size f() {
        return this.f14646e;
    }

    @Override // androidx.camera.core.impl.c1
    public Map h() {
        return this.f14645d;
    }

    public int hashCode() {
        return ((((((((((((this.f14642a.hashCode() ^ 1000003) * 1000003) ^ this.f14643b.hashCode()) * 1000003) ^ this.f14644c.hashCode()) * 1000003) ^ this.f14645d.hashCode()) * 1000003) ^ this.f14646e.hashCode()) * 1000003) ^ this.f14647f.hashCode()) * 1000003) ^ this.f14648g.hashCode();
    }

    @Override // androidx.camera.core.impl.c1
    public Map j() {
        return this.f14643b;
    }

    @Override // androidx.camera.core.impl.c1
    public Map l() {
        return this.f14648g;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f14642a + ", s720pSizeMap=" + this.f14643b + ", previewSize=" + this.f14644c + ", s1440pSizeMap=" + this.f14645d + ", recordSize=" + this.f14646e + ", maximumSizeMap=" + this.f14647f + ", ultraMaximumSizeMap=" + this.f14648g + "}";
    }
}
