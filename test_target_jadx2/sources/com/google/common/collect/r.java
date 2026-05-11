package com.google.common.collect;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class r implements Comparator {
    protected r() {
    }

    public static r a(Comparator comparator) {
        return comparator instanceof r ? (r) comparator : new f(comparator);
    }

    public r b(g8.c cVar) {
        return new c(cVar, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
