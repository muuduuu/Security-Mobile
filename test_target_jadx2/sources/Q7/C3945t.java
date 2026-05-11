package q7;

import java.util.AbstractMap;

/* renamed from: q7.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3945t extends AbstractC3939m {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3946u f38822d;

    C3945t(C3946u c3946u) {
        this.f38822d = c3946u;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.f38822d.f38825e;
        AbstractC3929c.a(i10, i11, "index");
        C3946u c3946u = this.f38822d;
        objArr = c3946u.f38824d;
        int i12 = i10 + i10;
        Object obj = objArr[i12];
        obj.getClass();
        objArr2 = c3946u.f38824d;
        Object obj2 = objArr2[i12 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.f38822d.f38825e;
        return i10;
    }
}
