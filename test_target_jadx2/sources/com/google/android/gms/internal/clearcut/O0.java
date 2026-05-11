package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC2109a0;

/* loaded from: classes2.dex */
final class O0 implements InterfaceC2183z0 {

    /* renamed from: a, reason: collision with root package name */
    private final B0 f23897a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23898b;

    /* renamed from: c, reason: collision with root package name */
    private final P0 f23899c;

    O0(B0 b02, String str, Object[] objArr) {
        this.f23897a = b02;
        this.f23898b = str;
        this.f23899c = new P0(b02.getClass(), str, objArr);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2183z0
    public final int a() {
        int i10;
        i10 = this.f23899c.f23910d;
        return (i10 & 1) == 1 ? AbstractC2109a0.c.f24001i : AbstractC2109a0.c.f24002j;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2183z0
    public final boolean b() {
        int i10;
        i10 = this.f23899c.f23910d;
        return (i10 & 2) == 2;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC2183z0
    public final B0 c() {
        return this.f23897a;
    }

    public final int d() {
        int i10;
        i10 = this.f23899c.f23911e;
        return i10;
    }

    final P0 e() {
        return this.f23899c;
    }

    public final int f() {
        int i10;
        i10 = this.f23899c.f23914h;
        return i10;
    }

    public final int g() {
        int i10;
        i10 = this.f23899c.f23915i;
        return i10;
    }

    public final int h() {
        int i10;
        i10 = this.f23899c.f23916j;
        return i10;
    }

    public final int i() {
        int i10;
        i10 = this.f23899c.f23919m;
        return i10;
    }

    final int[] j() {
        int[] iArr;
        iArr = this.f23899c.f23920n;
        return iArr;
    }

    public final int k() {
        int i10;
        i10 = this.f23899c.f23918l;
        return i10;
    }

    public final int l() {
        int i10;
        i10 = this.f23899c.f23917k;
        return i10;
    }
}
