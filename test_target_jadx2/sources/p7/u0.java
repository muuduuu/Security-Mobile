package p7;

import java.util.List;

/* loaded from: classes2.dex */
final class u0 extends v0 {

    /* renamed from: c, reason: collision with root package name */
    final transient int f38466c;

    /* renamed from: d, reason: collision with root package name */
    final transient int f38467d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ v0 f38468e;

    u0(v0 v0Var, int i10, int i11) {
        this.f38468e = v0Var;
        this.f38466c = i10;
        this.f38467d = i11;
    }

    @Override // p7.s0
    final int e() {
        return this.f38468e.h() + this.f38466c + this.f38467d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        p0.a(i10, this.f38467d, "index");
        return this.f38468e.get(i10 + this.f38466c);
    }

    @Override // p7.s0
    final int h() {
        return this.f38468e.h() + this.f38466c;
    }

    @Override // p7.s0
    final boolean k() {
        return true;
    }

    @Override // p7.s0
    final Object[] m() {
        return this.f38468e.m();
    }

    @Override // p7.v0
    /* renamed from: r */
    public final v0 subList(int i10, int i11) {
        p0.c(i10, i11, this.f38467d);
        v0 v0Var = this.f38468e;
        int i12 = this.f38466c;
        return v0Var.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f38467d;
    }

    @Override // p7.v0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
