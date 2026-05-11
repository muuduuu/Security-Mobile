package t7;

import java.util.List;

/* loaded from: classes2.dex */
final class O extends P {

    /* renamed from: c, reason: collision with root package name */
    final transient int f42635c;

    /* renamed from: d, reason: collision with root package name */
    final transient int f42636d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ P f42637e;

    O(P p10, int i10, int i11) {
        this.f42637e = p10;
        this.f42635c = i10;
        this.f42636d = i11;
    }

    @Override // t7.K
    final int e() {
        return this.f42637e.h() + this.f42635c + this.f42636d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC4653c.a(i10, this.f42636d, "index");
        return this.f42637e.get(i10 + this.f42635c);
    }

    @Override // t7.K
    final int h() {
        return this.f42637e.h() + this.f42635c;
    }

    @Override // t7.K
    final Object[] j() {
        return this.f42637e.j();
    }

    @Override // t7.P
    /* renamed from: k */
    public final P subList(int i10, int i11) {
        AbstractC4653c.c(i10, i11, this.f42636d);
        P p10 = this.f42637e;
        int i12 = this.f42635c;
        return p10.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42636d;
    }

    @Override // t7.P, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
