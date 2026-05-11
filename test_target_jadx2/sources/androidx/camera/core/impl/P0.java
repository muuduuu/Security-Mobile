package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class P0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f14449a;

    public P0(List list) {
        this.f14449a = new ArrayList(list);
    }

    public static String d(P0 p02) {
        ArrayList arrayList = new ArrayList();
        Iterator it = p02.f14449a.iterator();
        while (it.hasNext()) {
            arrayList.add(((K0) it.next()).getClass().getSimpleName());
        }
        return O0.a(" | ", arrayList);
    }

    public boolean a(Class cls) {
        Iterator it = this.f14449a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((K0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public K0 b(Class cls) {
        for (K0 k02 : this.f14449a) {
            if (k02.getClass() == cls) {
                return k02;
            }
        }
        return null;
    }

    public List c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (K0 k02 : this.f14449a) {
            if (cls.isAssignableFrom(k02.getClass())) {
                arrayList.add(k02);
            }
        }
        return arrayList;
    }
}
