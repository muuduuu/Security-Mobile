package q7;

import java.util.List;

/* renamed from: q7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3938l extends AbstractC3939m {

    /* renamed from: d, reason: collision with root package name */
    final transient int f38804d;

    /* renamed from: e, reason: collision with root package name */
    final transient int f38805e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC3939m f38806f;

    C3938l(AbstractC3939m abstractC3939m, int i10, int i11) {
        this.f38806f = abstractC3939m;
        this.f38804d = i10;
        this.f38805e = i11;
    }

    @Override // q7.AbstractC3936j
    final int e() {
        return this.f38806f.h() + this.f38804d + this.f38805e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC3929c.a(i10, this.f38805e, "index");
        return this.f38806f.get(i10 + this.f38804d);
    }

    @Override // q7.AbstractC3936j
    final int h() {
        return this.f38806f.h() + this.f38804d;
    }

    @Override // q7.AbstractC3936j
    final Object[] j() {
        return this.f38806f.j();
    }

    @Override // q7.AbstractC3939m
    /* renamed from: k */
    public final AbstractC3939m subList(int i10, int i11) {
        AbstractC3929c.c(i10, i11, this.f38805e);
        AbstractC3939m abstractC3939m = this.f38806f;
        int i12 = this.f38804d;
        return abstractC3939m.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f38805e;
    }

    @Override // q7.AbstractC3939m, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
