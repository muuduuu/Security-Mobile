package n7;

import java.util.List;

/* loaded from: classes2.dex */
final class g extends i {

    /* renamed from: d, reason: collision with root package name */
    private final transient i f37576d;

    g(i iVar) {
        this.f37576d = iVar;
    }

    private final int B(int i10) {
        return (this.f37576d.size() - 1) - i10;
    }

    @Override // n7.i, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f37576d.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i iVar = this.f37576d;
        s.b(i10, iVar.size(), "index");
        return iVar.get(B(i10));
    }

    @Override // n7.i, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f37576d.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return B(lastIndexOf);
        }
        return -1;
    }

    @Override // n7.i
    public final i k() {
        return this.f37576d;
    }

    @Override // n7.i, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f37576d.indexOf(obj);
        if (indexOf >= 0) {
            return B(indexOf);
        }
        return -1;
    }

    @Override // n7.i
    /* renamed from: m */
    public final i subList(int i10, int i11) {
        i iVar = this.f37576d;
        s.d(i10, i11, iVar.size());
        return iVar.subList(iVar.size() - i11, iVar.size() - i10).k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37576d.size();
    }

    @Override // n7.i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
