package r7;

import java.util.AbstractMap;

/* loaded from: classes2.dex */
final class B0 extends AbstractC4140l0 {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C0 f39277d;

    B0(C0 c02) {
        this.f39277d = c02;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.f39277d.f39303e;
        AbstractC4248w.a(i10, i11, "index");
        C0 c02 = this.f39277d;
        objArr = c02.f39302d;
        int i12 = i10 + i10;
        Object obj = objArr[i12];
        obj.getClass();
        objArr2 = c02.f39302d;
        Object obj2 = objArr2[i12 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.f39277d.f39303e;
        return i10;
    }
}
