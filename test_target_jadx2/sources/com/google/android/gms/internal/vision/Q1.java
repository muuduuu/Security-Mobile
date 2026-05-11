package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class Q1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f25073a;

    /* renamed from: b, reason: collision with root package name */
    private Iterator f25074b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ O1 f25075c;

    private Q1(O1 o12) {
        List list;
        this.f25075c = o12;
        list = o12.f25063b;
        this.f25073a = list.size();
    }

    private final Iterator a() {
        Map map;
        if (this.f25074b == null) {
            map = this.f25075c.f25067f;
            this.f25074b = map.entrySet().iterator();
        }
        return this.f25074b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i10 = this.f25073a;
        if (i10 > 0) {
            list = this.f25075c.f25063b;
            if (i10 <= list.size()) {
                return true;
            }
        }
        return a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        list = this.f25075c.f25063b;
        int i10 = this.f25073a - 1;
        this.f25073a = i10;
        return (Map.Entry) list.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ Q1(O1 o12, N1 n12) {
        this(o12);
    }
}
