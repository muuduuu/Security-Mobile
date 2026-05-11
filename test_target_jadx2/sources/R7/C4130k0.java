package r7;

import java.util.List;

/* renamed from: r7.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4130k0 extends AbstractC4140l0 {

    /* renamed from: d, reason: collision with root package name */
    final transient int f40098d;

    /* renamed from: e, reason: collision with root package name */
    final transient int f40099e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC4140l0 f40100f;

    C4130k0(AbstractC4140l0 abstractC4140l0, int i10, int i11) {
        this.f40100f = abstractC4140l0;
        this.f40098d = i10;
        this.f40099e = i11;
    }

    @Override // r7.AbstractC4090g0
    final int e() {
        return this.f40100f.h() + this.f40098d + this.f40099e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC4248w.a(i10, this.f40099e, "index");
        return this.f40100f.get(i10 + this.f40098d);
    }

    @Override // r7.AbstractC4090g0
    final int h() {
        return this.f40100f.h() + this.f40098d;
    }

    @Override // r7.AbstractC4090g0
    final Object[] j() {
        return this.f40100f.j();
    }

    @Override // r7.AbstractC4140l0
    /* renamed from: k */
    public final AbstractC4140l0 subList(int i10, int i11) {
        AbstractC4248w.d(i10, i11, this.f40099e);
        AbstractC4140l0 abstractC4140l0 = this.f40100f;
        int i12 = this.f40098d;
        return abstractC4140l0.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40099e;
    }

    @Override // r7.AbstractC4140l0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
