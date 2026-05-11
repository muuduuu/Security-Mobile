package t7;

import java.util.AbstractMap;

/* renamed from: t7.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4682g0 extends P {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4689h0 f42949c;

    C4682g0(C4689h0 c4689h0) {
        this.f42949c = c4689h0;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.f42949c.f42977e;
        AbstractC4653c.a(i10, i11, "index");
        C4689h0 c4689h0 = this.f42949c;
        int i12 = i10 + i10;
        objArr = c4689h0.f42976d;
        Object obj = objArr[i12];
        obj.getClass();
        objArr2 = c4689h0.f42976d;
        Object obj2 = objArr2[i12 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.f42949c.f42977e;
        return i10;
    }
}
