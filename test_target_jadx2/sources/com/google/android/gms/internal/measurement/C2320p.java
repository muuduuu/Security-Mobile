package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2320p extends AbstractC2275k implements InterfaceC2293m {

    /* renamed from: c, reason: collision with root package name */
    protected final List f24609c;

    /* renamed from: d, reason: collision with root package name */
    protected final List f24610d;

    /* renamed from: e, reason: collision with root package name */
    protected Y1 f24611e;

    private C2320p(C2320p c2320p) {
        super(c2320p.f24543a);
        ArrayList arrayList = new ArrayList(c2320p.f24609c.size());
        this.f24609c = arrayList;
        arrayList.addAll(c2320p.f24609c);
        ArrayList arrayList2 = new ArrayList(c2320p.f24610d.size());
        this.f24610d = arrayList2;
        arrayList2.addAll(c2320p.f24610d);
        this.f24611e = c2320p.f24611e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2275k
    public final InterfaceC2329q b(Y1 y12, List list) {
        Y1 c10 = this.f24611e.c();
        int i10 = 0;
        while (true) {
            List list2 = this.f24609c;
            if (i10 >= list2.size()) {
                break;
            }
            if (i10 < list.size()) {
                c10.f((String) list2.get(i10), y12.a((InterfaceC2329q) list.get(i10)));
            } else {
                c10.f((String) list2.get(i10), InterfaceC2329q.f24620U);
            }
            i10++;
        }
        for (InterfaceC2329q interfaceC2329q : this.f24610d) {
            InterfaceC2329q a10 = c10.a(interfaceC2329q);
            if (a10 instanceof r) {
                a10 = c10.a(interfaceC2329q);
            }
            if (a10 instanceof C2248h) {
                return ((C2248h) a10).b();
            }
        }
        return InterfaceC2329q.f24620U;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2275k, com.google.android.gms.internal.measurement.InterfaceC2329q
    public final InterfaceC2329q j() {
        return new C2320p(this);
    }

    public C2320p(String str, List list, List list2, Y1 y12) {
        super(str);
        this.f24609c = new ArrayList();
        this.f24611e = y12;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f24609c.add(((InterfaceC2329q) it.next()).a());
            }
        }
        this.f24610d = new ArrayList(list2);
    }
}
