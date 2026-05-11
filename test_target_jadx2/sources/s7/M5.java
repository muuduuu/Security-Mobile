package s7;

import java.util.List;

/* loaded from: classes2.dex */
final class M5 extends N5 {

    /* renamed from: c, reason: collision with root package name */
    final transient int f40975c;

    /* renamed from: d, reason: collision with root package name */
    final transient int f40976d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ N5 f40977e;

    M5(N5 n52, int i10, int i11) {
        this.f40977e = n52;
        this.f40975c = i10;
        this.f40976d = i11;
    }

    @Override // s7.M4
    final int e() {
        return this.f40977e.h() + this.f40975c + this.f40976d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f40976d, "index");
        return this.f40977e.get(i10 + this.f40975c);
    }

    @Override // s7.M4
    final int h() {
        return this.f40977e.h() + this.f40975c;
    }

    @Override // s7.M4
    final Object[] j() {
        return this.f40977e.j();
    }

    @Override // s7.N5
    /* renamed from: k */
    public final N5 subList(int i10, int i11) {
        G1.c(i10, i11, this.f40976d);
        N5 n52 = this.f40977e;
        int i12 = this.f40975c;
        return n52.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40976d;
    }

    @Override // s7.N5, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
