package Ad;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class a extends ArrayList implements k {
    public a(int i10) {
        super(i10);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof l) {
            return h((l) obj);
        }
        return false;
    }

    public /* bridge */ boolean h(l lVar) {
        return super.contains(lVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof l) {
            return m((l) obj);
        }
        return -1;
    }

    public /* bridge */ int k() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof l) {
            return v((l) obj);
        }
        return -1;
    }

    public /* bridge */ int m(l lVar) {
        return super.indexOf(lVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof l) {
            return w((l) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return k();
    }

    public /* bridge */ int v(l lVar) {
        return super.lastIndexOf(lVar);
    }

    public /* bridge */ boolean w(l lVar) {
        return super.remove(lVar);
    }
}
