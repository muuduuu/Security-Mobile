package androidx.camera.core.impl;

import androidx.camera.core.impl.InterfaceC1441i0;

/* renamed from: androidx.camera.core.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1432e extends InterfaceC1441i0.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f14564a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14565b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14566c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14567d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14568e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14569f;

    C1432e(int i10, String str, int i11, int i12, int i13, int i14) {
        this.f14564a = i10;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f14565b = str;
        this.f14566c = i11;
        this.f14567d = i12;
        this.f14568e = i13;
        this.f14569f = i14;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.a
    public int b() {
        return this.f14566c;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.a
    public int c() {
        return this.f14568e;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.a
    public int d() {
        return this.f14564a;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.a
    public String e() {
        return this.f14565b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC1441i0.a)) {
            return false;
        }
        InterfaceC1441i0.a aVar = (InterfaceC1441i0.a) obj;
        return this.f14564a == aVar.d() && this.f14565b.equals(aVar.e()) && this.f14566c == aVar.b() && this.f14567d == aVar.g() && this.f14568e == aVar.c() && this.f14569f == aVar.f();
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.a
    public int f() {
        return this.f14569f;
    }

    @Override // androidx.camera.core.impl.InterfaceC1441i0.a
    public int g() {
        return this.f14567d;
    }

    public int hashCode() {
        return ((((((((((this.f14564a ^ 1000003) * 1000003) ^ this.f14565b.hashCode()) * 1000003) ^ this.f14566c) * 1000003) ^ this.f14567d) * 1000003) ^ this.f14568e) * 1000003) ^ this.f14569f;
    }

    public String toString() {
        return "AudioProfileProxy{codec=" + this.f14564a + ", mediaType=" + this.f14565b + ", bitrate=" + this.f14566c + ", sampleRate=" + this.f14567d + ", channels=" + this.f14568e + ", profile=" + this.f14569f + "}";
    }
}
