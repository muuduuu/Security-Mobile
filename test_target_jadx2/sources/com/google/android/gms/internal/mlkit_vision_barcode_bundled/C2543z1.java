package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2543z1 extends E1 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class f24985c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ C2543z1(AbstractC2538y1 abstractC2538y1) {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E1
    final void a(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) J2.k(obj, j10);
        if (list instanceof InterfaceC2533x1) {
            unmodifiableList = ((InterfaceC2533x1) list).g();
        } else {
            if (f24985c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof W1) && (list instanceof InterfaceC2484n1)) {
                InterfaceC2484n1 interfaceC2484n1 = (InterfaceC2484n1) list;
                if (interfaceC2484n1.a()) {
                    interfaceC2484n1.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        J2.x(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E1
    final void b(Object obj, Object obj2, long j10) {
        C2528w1 c2528w1;
        List list = (List) J2.k(obj2, j10);
        int size = list.size();
        List list2 = (List) J2.k(obj, j10);
        if (list2.isEmpty()) {
            list2 = list2 instanceof InterfaceC2533x1 ? new C2528w1(size) : ((list2 instanceof W1) && (list2 instanceof InterfaceC2484n1)) ? ((InterfaceC2484n1) list2).l(size) : new ArrayList(size);
            J2.x(obj, j10, list2);
        } else {
            if (f24985c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                J2.x(obj, j10, arrayList);
                c2528w1 = arrayList;
            } else if (list2 instanceof E2) {
                C2528w1 c2528w12 = new C2528w1(list2.size() + size);
                c2528w12.addAll(c2528w12.size(), (E2) list2);
                J2.x(obj, j10, c2528w12);
                c2528w1 = c2528w12;
            } else if ((list2 instanceof W1) && (list2 instanceof InterfaceC2484n1)) {
                InterfaceC2484n1 interfaceC2484n1 = (InterfaceC2484n1) list2;
                if (!interfaceC2484n1.a()) {
                    list2 = interfaceC2484n1.l(list2.size() + size);
                    J2.x(obj, j10, list2);
                }
            }
            list2 = c2528w1;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        J2.x(obj, j10, list);
    }
}
