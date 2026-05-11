package n7;

import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
final class h extends i {

    /* renamed from: d, reason: collision with root package name */
    final transient int f37577d;

    /* renamed from: e, reason: collision with root package name */
    final transient int f37578e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f37579f;

    h(i iVar, int i10, int i11) {
        Objects.requireNonNull(iVar);
        this.f37579f = iVar;
        this.f37577d = i10;
        this.f37578e = i11;
    }

    @Override // n7.d
    final Object[] c() {
        return this.f37579f.c();
    }

    @Override // n7.d
    final int e() {
        return this.f37579f.e() + this.f37577d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        s.b(i10, this.f37578e, "index");
        return this.f37579f.get(i10 + this.f37577d);
    }

    @Override // n7.d
    final int h() {
        return this.f37579f.e() + this.f37577d + this.f37578e;
    }

    @Override // n7.i
    /* renamed from: m */
    public final i subList(int i10, int i11) {
        s.d(i10, i11, this.f37578e);
        int i12 = this.f37577d;
        return this.f37579f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37578e;
    }

    @Override // n7.i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
