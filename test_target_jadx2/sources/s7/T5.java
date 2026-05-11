package s7;

import java.util.AbstractMap;

/* loaded from: classes2.dex */
final class T5 extends N5 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ U5 f41052c;

    T5(U5 u52) {
        this.f41052c = u52;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.f41052c.f41064e;
        G1.a(i10, i11, "index");
        U5 u52 = this.f41052c;
        objArr = u52.f41063d;
        int i12 = i10 + i10;
        Object obj = objArr[i12];
        obj.getClass();
        objArr2 = u52.f41063d;
        Object obj2 = objArr2[i12 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.f41052c.f41064e;
        return i10;
    }
}
