package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class L0 extends P0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class f23614c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ L0(K0 k02) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.P0
    final void a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) B1.f(obj, j10);
        if (list instanceof J0) {
            unmodifiableList = ((J0) list).g();
        } else {
            if (f23614c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC2055h1) && (list instanceof E0)) {
                E0 e02 = (E0) list;
                if (e02.a()) {
                    e02.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        B1.p(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.P0
    final void b(Object obj, Object obj2, long j10) {
        I0 i02;
        List list = (List) B1.f(obj2, j10);
        int size = list.size();
        List list2 = (List) B1.f(obj, j10);
        if (list2.isEmpty()) {
            list2 = list2 instanceof J0 ? new I0(size) : ((list2 instanceof InterfaceC2055h1) && (list2 instanceof E0)) ? ((E0) list2).l(size) : new ArrayList(size);
            B1.p(obj, j10, list2);
        } else {
            if (f23614c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                B1.p(obj, j10, arrayList);
                i02 = arrayList;
            } else if (list2 instanceof C2099w1) {
                I0 i03 = new I0(list2.size() + size);
                i03.addAll(i03.size(), (C2099w1) list2);
                B1.p(obj, j10, i03);
                i02 = i03;
            } else if ((list2 instanceof InterfaceC2055h1) && (list2 instanceof E0)) {
                E0 e02 = (E0) list2;
                if (!e02.a()) {
                    list2 = e02.l(list2.size() + size);
                    B1.p(obj, j10, list2);
                }
            }
            list2 = i02;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        B1.p(obj, j10, list);
    }
}
