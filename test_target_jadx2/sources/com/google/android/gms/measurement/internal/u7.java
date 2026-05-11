package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C2261i3;
import com.google.android.gms.internal.measurement.C2270j3;
import com.google.android.gms.internal.measurement.C2279k3;
import com.google.android.gms.internal.measurement.C2288l3;
import j0.C3476a;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
final class u7 {

    /* renamed from: a, reason: collision with root package name */
    private String f26391a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f26392b;

    /* renamed from: c, reason: collision with root package name */
    private C2270j3 f26393c;

    /* renamed from: d, reason: collision with root package name */
    private BitSet f26394d;

    /* renamed from: e, reason: collision with root package name */
    private BitSet f26395e;

    /* renamed from: f, reason: collision with root package name */
    private Map f26396f;

    /* renamed from: g, reason: collision with root package name */
    private Map f26397g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C2660e f26398h;

    /* synthetic */ u7(C2660e c2660e, String str, C2270j3 c2270j3, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(c2660e);
        this.f26398h = c2660e;
        this.f26391a = str;
        this.f26394d = bitSet;
        this.f26395e = bitSet2;
        this.f26396f = map;
        this.f26397g = new C3476a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f26397g.put(num, arrayList);
        }
        this.f26392b = false;
        this.f26393c = c2270j3;
    }

    final void a(AbstractC2644c abstractC2644c) {
        int a10 = abstractC2644c.a();
        if (abstractC2644c.f25851c != null) {
            this.f26395e.set(a10, true);
        }
        Boolean bool = abstractC2644c.f25852d;
        if (bool != null) {
            this.f26394d.set(a10, bool.booleanValue());
        }
        if (abstractC2644c.f25853e != null) {
            Map map = this.f26396f;
            Integer valueOf = Integer.valueOf(a10);
            Long l10 = (Long) map.get(valueOf);
            long longValue = abstractC2644c.f25853e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f26396f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (abstractC2644c.f25854f != null) {
            Map map2 = this.f26397g;
            Integer valueOf2 = Integer.valueOf(a10);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f26397g.put(valueOf2, list);
            }
            if (abstractC2644c.b()) {
                list.clear();
            }
            com.google.android.gms.internal.measurement.Q6.a();
            C2760q3 c2760q3 = this.f26398h.f25694a;
            C2724m w10 = c2760q3.w();
            String str = this.f26391a;
            C2663e2 c2663e2 = AbstractC2671f2.f25948G0;
            if (w10.H(str, c2663e2) && abstractC2644c.c()) {
                list.clear();
            }
            com.google.android.gms.internal.measurement.Q6.a();
            if (!c2760q3.w().H(this.f26391a, c2663e2)) {
                list.add(Long.valueOf(abstractC2644c.f25854f.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(abstractC2644c.f25854f.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    final com.google.android.gms.internal.measurement.G2 b(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.F2 J10 = com.google.android.gms.internal.measurement.G2.J();
        J10.y(i10);
        J10.B(this.f26392b);
        C2270j3 c2270j3 = this.f26393c;
        if (c2270j3 != null) {
            J10.A(c2270j3);
        }
        C2261i3 K10 = C2270j3.K();
        K10.A(g7.Q(this.f26394d));
        K10.y(g7.Q(this.f26395e));
        Map map = this.f26396f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f26396f.keySet()) {
                int intValue = num.intValue();
                Long l10 = (Long) this.f26396f.get(num);
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.P2 G10 = com.google.android.gms.internal.measurement.Q2.G();
                    G10.y(intValue);
                    G10.z(l10.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.Q2) G10.v());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            K10.C(arrayList);
        }
        Map map2 = this.f26397g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f26397g.keySet()) {
                C2279k3 H10 = C2288l3.H();
                H10.y(num2.intValue());
                List list2 = (List) this.f26397g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    H10.z(list2);
                }
                arrayList3.add((C2288l3) H10.v());
            }
            list = arrayList3;
        }
        K10.E(list);
        J10.z(K10);
        return (com.google.android.gms.internal.measurement.G2) J10.v();
    }

    final /* synthetic */ BitSet c() {
        return this.f26394d;
    }

    /* synthetic */ u7(C2660e c2660e, String str, byte[] bArr) {
        Objects.requireNonNull(c2660e);
        this.f26398h = c2660e;
        this.f26391a = str;
        this.f26392b = true;
        this.f26394d = new BitSet();
        this.f26395e = new BitSet();
        this.f26396f = new C3476a();
        this.f26397g = new C3476a();
    }
}
