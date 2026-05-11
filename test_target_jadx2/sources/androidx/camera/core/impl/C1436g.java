package androidx.camera.core.impl;

import androidx.camera.core.impl.InterfaceC1441i0;

/* renamed from: androidx.camera.core.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1436g extends InterfaceC1441i0.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f14579a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14580b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14581c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14582d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14583e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14584f;

    /* renamed from: g, reason: collision with root package name */
    private final int f14585g;

    /* renamed from: h, reason: collision with root package name */
    private final int f14586h;

    /* renamed from: i, reason: collision with root package name */
    private final int f14587i;

    /* renamed from: j, reason: collision with root package name */
    private final int f14588j;

    C1436g(int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f14579a = i10;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f14580b = str;
        this.f14581c = i11;
        this.f14582d = i12;
        this.f14583e = i13;
        this.f14584f = i14;
        this.f14585g = i15;
        this.f14586h = i16;
        this.f14587i = i17;
        this.f14588j = i18;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.c
    public int b() {
        return this.f14586h;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.c
    public int c() {
        return this.f14581c;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.c
    public int d() {
        return this.f14587i;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.c
    public int e() {
        return this.f14579a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC1441i0.c)) {
            return false;
        }
        InterfaceC1441i0.c cVar = (InterfaceC1441i0.c) obj;
        return this.f14579a == cVar.e() && this.f14580b.equals(cVar.i()) && this.f14581c == cVar.c() && this.f14582d == cVar.f() && this.f14583e == cVar.k() && this.f14584f == cVar.h() && this.f14585g == cVar.j() && this.f14586h == cVar.b() && this.f14587i == cVar.d() && this.f14588j == cVar.g();
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.c
    public int f() {
        return this.f14582d;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.c
    public int g() {
        return this.f14588j;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.c
    public int h() {
        return this.f14584f;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f14579a ^ 1000003) * 1000003) ^ this.f14580b.hashCode()) * 1000003) ^ this.f14581c) * 1000003) ^ this.f14582d) * 1000003) ^ this.f14583e) * 1000003) ^ this.f14584f) * 1000003) ^ this.f14585g) * 1000003) ^ this.f14586h) * 1000003) ^ this.f14587i) * 1000003) ^ this.f14588j;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.c
    public String i() {
        return this.f14580b;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.c
    public int j() {
        return this.f14585g;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.c
    public int k() {
        return this.f14583e;
    }

    public String toString() {
        return "VideoProfileProxy{codec=" + this.f14579a + ", mediaType=" + this.f14580b + ", bitrate=" + this.f14581c + ", frameRate=" + this.f14582d + ", width=" + this.f14583e + ", height=" + this.f14584f + ", profile=" + this.f14585g + ", bitDepth=" + this.f14586h + ", chromaSubsampling=" + this.f14587i + ", hdrFormat=" + this.f14588j + "}";
    }
}
