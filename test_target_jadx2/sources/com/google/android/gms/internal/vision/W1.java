package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class W1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f25090a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25091b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f25092c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ O1 f25093d;

    private W1(O1 o12) {
        this.f25093d = o12;
        this.f25090a = -1;
    }

    private final Iterator a() {
        Map map;
        if (this.f25092c == null) {
            map = this.f25093d.f25064c;
            this.f25092c = map.entrySet().iterator();
        }
        return this.f25092c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i10 = this.f25090a + 1;
        list = this.f25093d.f25063b;
        if (i10 >= list.size()) {
            map = this.f25093d.f25064c;
            if (map.isEmpty() || !a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.f25091b = true;
        int i10 = this.f25090a + 1;
        this.f25090a = i10;
        list = this.f25093d.f25063b;
        if (i10 >= list.size()) {
            return (Map.Entry) a().next();
        }
        list2 = this.f25093d.f25063b;
        return (Map.Entry) list2.get(this.f25090a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f25091b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f25091b = false;
        this.f25093d.q();
        int i10 = this.f25090a;
        list = this.f25093d.f25063b;
        if (i10 >= list.size()) {
            a().remove();
            return;
        }
        O1 o12 = this.f25093d;
        int i11 = this.f25090a;
        this.f25090a = i11 - 1;
        o12.l(i11);
    }

    /* synthetic */ W1(O1 o12, N1 n12) {
        this(o12);
    }
}
