package com.google.android.gms.internal.vision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.vision.e1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2564e1 extends AbstractC2556c1 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class f25122c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C2564e1() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List e(Object obj, long j10, int i10) {
        C2552b1 c2552b1;
        List f10 = f(obj, j10);
        if (f10.isEmpty()) {
            List c2552b12 = f10 instanceof InterfaceC2560d1 ? new C2552b1(i10) : ((f10 instanceof D1) && (f10 instanceof X0)) ? ((X0) f10).b(i10) : new ArrayList(i10);
            h2.j(obj, j10, c2552b12);
            return c2552b12;
        }
        if (f25122c.isAssignableFrom(f10.getClass())) {
            ArrayList arrayList = new ArrayList(f10.size() + i10);
            arrayList.addAll(f10);
            h2.j(obj, j10, arrayList);
            c2552b1 = arrayList;
        } else {
            if (!(f10 instanceof f2)) {
                if (!(f10 instanceof D1) || !(f10 instanceof X0)) {
                    return f10;
                }
                X0 x02 = (X0) f10;
                if (x02.zza()) {
                    return f10;
                }
                X0 b10 = x02.b(f10.size() + i10);
                h2.j(obj, j10, b10);
                return b10;
            }
            C2552b1 c2552b13 = new C2552b1(f10.size() + i10);
            c2552b13.addAll((f2) f10);
            h2.j(obj, j10, c2552b13);
            c2552b1 = c2552b13;
        }
        return c2552b1;
    }

    private static List f(Object obj, long j10) {
        return (List) h2.F(obj, j10);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2556c1
    final void b(Object obj, Object obj2, long j10) {
        List f10 = f(obj2, j10);
        List e10 = e(obj, j10, f10.size());
        int size = e10.size();
        int size2 = f10.size();
        if (size > 0 && size2 > 0) {
            e10.addAll(f10);
        }
        if (size > 0) {
            f10 = e10;
        }
        h2.j(obj, j10, f10);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2556c1
    final void d(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) h2.F(obj, j10);
        if (list instanceof InterfaceC2560d1) {
            unmodifiableList = ((InterfaceC2560d1) list).g();
        } else {
            if (f25122c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof D1) && (list instanceof X0)) {
                X0 x02 = (X0) list;
                if (x02.zza()) {
                    x02.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        h2.j(obj, j10, unmodifiableList);
    }
}
