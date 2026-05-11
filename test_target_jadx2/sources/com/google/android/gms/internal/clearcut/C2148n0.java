package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.clearcut.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2148n0 extends AbstractC2142l0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class f24083c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C2148n0() {
        super();
    }

    private static List e(Object obj, long j10) {
        return (List) AbstractC2125f1.M(obj, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC2142l0
    final void a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) AbstractC2125f1.M(obj, j10);
        if (list instanceof InterfaceC2139k0) {
            unmodifiableList = ((InterfaceC2139k0) list).N1();
        } else if (f24083c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC2125f1.i(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.clearcut.AbstractC2142l0
    final void b(Object obj, Object obj2, long j10) {
        C2136j0 c2136j0;
        List e10 = e(obj2, j10);
        int size = e10.size();
        List e11 = e(obj, j10);
        if (e11.isEmpty()) {
            e11 = e11 instanceof InterfaceC2139k0 ? new C2136j0(size) : new ArrayList(size);
            AbstractC2125f1.i(obj, j10, e11);
        } else {
            if (f24083c.isAssignableFrom(e11.getClass())) {
                ArrayList arrayList = new ArrayList(e11.size() + size);
                arrayList.addAll(e11);
                c2136j0 = arrayList;
            } else if (e11 instanceof C2116c1) {
                C2136j0 c2136j02 = new C2136j0(e11.size() + size);
                c2136j02.addAll((C2116c1) e11);
                c2136j0 = c2136j02;
            }
            AbstractC2125f1.i(obj, j10, c2136j0);
            e11 = c2136j0;
        }
        int size2 = e11.size();
        int size3 = e10.size();
        if (size2 > 0 && size3 > 0) {
            e11.addAll(e10);
        }
        if (size2 > 0) {
            e10 = e11;
        }
        AbstractC2125f1.i(obj, j10, e10);
    }
}
