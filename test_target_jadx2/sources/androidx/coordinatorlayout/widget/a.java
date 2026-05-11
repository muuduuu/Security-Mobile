package androidx.coordinatorlayout.widget;

import androidx.core.util.Pools$SimplePool;
import j0.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import y0.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final d f15690a = new Pools$SimplePool(10);

    /* renamed from: b, reason: collision with root package name */
    private final i f15691b = new i();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f15692c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f15693d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f15691b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f15690a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void l(ArrayList arrayList) {
        arrayList.clear();
        this.f15690a.a(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f15691b.containsKey(obj) || !this.f15691b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f15691b.get(obj);
        if (arrayList == null) {
            arrayList = f();
            this.f15691b.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    public void b(Object obj) {
        if (this.f15691b.containsKey(obj)) {
            return;
        }
        this.f15691b.put(obj, null);
    }

    public void c() {
        int size = this.f15691b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f15691b.j(i10);
            if (arrayList != null) {
                l(arrayList);
            }
        }
        this.f15691b.clear();
    }

    public boolean d(Object obj) {
        return this.f15691b.containsKey(obj);
    }

    public List g(Object obj) {
        ArrayList h10 = h(obj);
        if (h10 == null) {
            return null;
        }
        return new ArrayList(h10);
    }

    ArrayList h(Object obj) {
        return (ArrayList) this.f15691b.get(obj);
    }

    public List i(Object obj) {
        int size = this.f15691b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f15691b.j(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f15691b.f(i10));
            }
        }
        return arrayList;
    }

    public ArrayList j() {
        this.f15692c.clear();
        this.f15693d.clear();
        int size = this.f15691b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f15691b.f(i10), this.f15692c, this.f15693d);
        }
        return this.f15692c;
    }

    public boolean k(Object obj) {
        int size = this.f15691b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f15691b.j(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
