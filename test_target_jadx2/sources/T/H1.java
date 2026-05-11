package t;

import A.AbstractC0700h0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.AbstractC1424a;
import androidx.camera.core.impl.AbstractC1429c0;
import androidx.camera.core.impl.C1453o0;
import androidx.camera.core.impl.InterfaceC1455p0;
import androidx.camera.core.impl.V;
import androidx.camera.core.impl.m1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s.C4301a;
import t.J1;
import u.C4832C;

/* loaded from: classes.dex */
public abstract class H1 {

    /* renamed from: a, reason: collision with root package name */
    public static final V.a f41743a = V.a.a("camera2.streamSpec.streamUseCase", Long.TYPE);

    /* renamed from: b, reason: collision with root package name */
    private static final Map f41744b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f41745c;

    static {
        HashMap hashMap = new HashMap();
        f41744b = hashMap;
        HashMap hashMap2 = new HashMap();
        f41745c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            m1.b bVar = m1.b.PREVIEW;
            hashSet.add(bVar);
            m1.b bVar2 = m1.b.METERING_REPEATING;
            hashSet.add(bVar2);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(bVar);
            hashSet2.add(bVar2);
            hashSet2.add(m1.b.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            m1.b bVar3 = m1.b.IMAGE_CAPTURE;
            hashSet3.add(bVar3);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            m1.b bVar4 = m1.b.VIDEO_CAPTURE;
            hashSet4.add(bVar4);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(bVar);
            hashSet5.add(bVar3);
            hashSet5.add(bVar4);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(bVar);
            hashSet6.add(bVar4);
            hashMap2.put(3L, hashSet6);
        }
    }

    public static boolean a(Map map, Map map2, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            long f10 = ((androidx.camera.core.impl.b1) list.get(i10)).f();
            if (map.containsKey(Integer.valueOf(i10))) {
                AbstractC1424a abstractC1424a = (AbstractC1424a) map.get(Integer.valueOf(i10));
                if (!g(abstractC1424a.b().size() == 1 ? (m1.b) abstractC1424a.b().get(0) : m1.b.STREAM_SHARING, f10, abstractC1424a.b())) {
                    return false;
                }
            } else {
                if (!map2.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                androidx.camera.core.impl.l1 l1Var = (androidx.camera.core.impl.l1) map2.get(Integer.valueOf(i10));
                if (!g(l1Var.F(), f10, l1Var.F() == m1.b.STREAM_SHARING ? ((Q.j) l1Var).Z() : Collections.emptyList())) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean b(Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains((Long) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(C4832C c4832c, List list) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        long[] jArr = (long[]) c4832c.a(key);
        if (jArr == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j10 : jArr) {
            hashSet.add(Long.valueOf(j10));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(Long.valueOf(((androidx.camera.core.impl.b1) it.next()).f()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1424a abstractC1424a = (AbstractC1424a) it.next();
            if (j(abstractC1424a.e(), (m1.b) abstractC1424a.b().get(0))) {
                return true;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.impl.l1 l1Var = (androidx.camera.core.impl.l1) it2.next();
            if (j(l1Var, l1Var.F())) {
                return true;
            }
        }
        return false;
    }

    public static C4301a e(androidx.camera.core.impl.l1 l1Var) {
        androidx.camera.core.impl.B0 d02 = androidx.camera.core.impl.B0.d0();
        V.a aVar = C4301a.f40675K;
        if (l1Var.b(aVar)) {
            d02.x(aVar, (Long) l1Var.a(aVar));
        }
        V.a aVar2 = androidx.camera.core.impl.l1.f14634D;
        if (l1Var.b(aVar2)) {
            d02.x(aVar2, (Boolean) l1Var.a(aVar2));
        }
        V.a aVar3 = C1453o0.f14658J;
        if (l1Var.b(aVar3)) {
            d02.x(aVar3, (Integer) l1Var.a(aVar3));
        }
        V.a aVar4 = InterfaceC1455p0.f14673l;
        if (l1Var.b(aVar4)) {
            d02.x(aVar4, (Integer) l1Var.a(aVar4));
        }
        return new C4301a(d02);
    }

    private static androidx.camera.core.impl.V f(androidx.camera.core.impl.V v10, long j10) {
        V.a aVar = f41743a;
        if (v10.b(aVar) && ((Long) v10.a(aVar)).longValue() == j10) {
            return null;
        }
        androidx.camera.core.impl.B0 e02 = androidx.camera.core.impl.B0.e0(v10);
        e02.x(aVar, Long.valueOf(j10));
        return new C4301a(e02);
    }

    private static boolean g(m1.b bVar, long j10, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar != m1.b.STREAM_SHARING) {
            Map map = f41744b;
            return map.containsKey(Long.valueOf(j10)) && ((Set) map.get(Long.valueOf(j10))).contains(bVar);
        }
        Map map2 = f41745c;
        if (!map2.containsKey(Long.valueOf(j10))) {
            return false;
        }
        Set set = (Set) map2.get(Long.valueOf(j10));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((m1.b) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(C4832C c4832c) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        long[] jArr = (long[]) c4832c.a(key);
        return (jArr == null || jArr.length == 0) ? false : true;
    }

    private static boolean i(List list, List list2, Set set) {
        boolean z10;
        boolean z11;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC1424a abstractC1424a = (AbstractC1424a) it.next();
            androidx.camera.core.impl.V e10 = abstractC1424a.e();
            V.a aVar = C4301a.f40675K;
            if (e10.b(aVar) && ((Long) abstractC1424a.e().a(aVar)).longValue() != 0) {
                z10 = true;
                z11 = false;
            } else {
                z11 = true;
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.impl.l1 l1Var = (androidx.camera.core.impl.l1) it2.next();
            V.a aVar2 = C4301a.f40675K;
            if (l1Var.b(aVar2)) {
                Long l10 = (Long) l1Var.a(aVar2);
                if (l10.longValue() != 0) {
                    if (z11) {
                        o();
                    }
                    hashSet.add(l10);
                    z10 = true;
                } else if (z10) {
                    o();
                }
            } else if (z10) {
                o();
            }
            z11 = true;
        }
        return !z11 && b(set, hashSet);
    }

    private static boolean j(androidx.camera.core.impl.V v10, m1.b bVar) {
        if (((Boolean) v10.f(androidx.camera.core.impl.l1.f14634D, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        V.a aVar = C1453o0.f14658J;
        return v10.b(aVar) && W1.b(bVar, ((Integer) v10.a(aVar)).intValue()) == 5;
    }

    public static boolean k(C4832C c4832c, List list, Map map, Map map2) {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList<androidx.camera.core.impl.l1> arrayList = new ArrayList(map.keySet());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y0.f.g(((AbstractC1424a) it.next()).e());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            y0.f.g(((androidx.camera.core.impl.Z0) y0.f.g((androidx.camera.core.impl.Z0) map.get((androidx.camera.core.impl.l1) it2.next()))).d());
        }
        key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        long[] jArr = (long[]) c4832c.a(key);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j10 : jArr) {
                hashSet.add(Long.valueOf(j10));
            }
            if (i(list, arrayList, hashSet)) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    AbstractC1424a abstractC1424a = (AbstractC1424a) it3.next();
                    androidx.camera.core.impl.V e10 = abstractC1424a.e();
                    androidx.camera.core.impl.V f10 = f(e10, ((Long) e10.a(C4301a.f40675K)).longValue());
                    if (f10 != null) {
                        map2.put(abstractC1424a, abstractC1424a.i(f10));
                    }
                }
                for (androidx.camera.core.impl.l1 l1Var : arrayList) {
                    androidx.camera.core.impl.Z0 z02 = (androidx.camera.core.impl.Z0) map.get(l1Var);
                    androidx.camera.core.impl.V d10 = z02.d();
                    androidx.camera.core.impl.V f11 = f(d10, ((Long) d10.a(C4301a.f40675K)).longValue());
                    if (f11 != null) {
                        map.put(l1Var, z02.g().d(f11).a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void l(Map map, Map map2, Map map3, Map map4, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            long f10 = ((androidx.camera.core.impl.b1) list.get(i10)).f();
            if (map3.containsKey(Integer.valueOf(i10))) {
                AbstractC1424a abstractC1424a = (AbstractC1424a) map3.get(Integer.valueOf(i10));
                androidx.camera.core.impl.V f11 = f(abstractC1424a.e(), f10);
                if (f11 != null) {
                    map2.put(abstractC1424a, abstractC1424a.i(f11));
                }
            } else {
                if (!map4.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                androidx.camera.core.impl.l1 l1Var = (androidx.camera.core.impl.l1) map4.get(Integer.valueOf(i10));
                androidx.camera.core.impl.Z0 z02 = (androidx.camera.core.impl.Z0) map.get(l1Var);
                androidx.camera.core.impl.V f12 = f(z02.d(), f10);
                if (f12 != null) {
                    map.put(l1Var, z02.g().d(f12).a());
                }
            }
        }
    }

    public static void m(Collection collection, Collection collection2, Map map) {
        ArrayList arrayList = new ArrayList(collection2);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.V0 v02 = (androidx.camera.core.impl.V0) it.next();
            androidx.camera.core.impl.V f10 = v02.f();
            V.a aVar = f41743a;
            if (f10.b(aVar) && v02.n().size() != 1) {
                AbstractC0700h0.c("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(v02.n().size())));
                return;
            }
            if (v02.f().b(aVar)) {
                Iterator it2 = collection.iterator();
                int i10 = 0;
                while (it2.hasNext()) {
                    androidx.camera.core.impl.V0 v03 = (androidx.camera.core.impl.V0) it2.next();
                    if (((androidx.camera.core.impl.l1) arrayList.get(i10)).F() == m1.b.METERING_REPEATING) {
                        y0.f.j(!v03.n().isEmpty(), "MeteringRepeating should contain a surface");
                        map.put((AbstractC1429c0) v03.n().get(0), 1L);
                    } else {
                        androidx.camera.core.impl.V f11 = v03.f();
                        V.a aVar2 = f41743a;
                        if (f11.b(aVar2) && !v03.n().isEmpty()) {
                            map.put((AbstractC1429c0) v03.n().get(0), (Long) v03.f().a(aVar2));
                        }
                    }
                    i10++;
                }
                return;
            }
        }
    }

    public static boolean n(J1.b bVar) {
        return bVar.a() == 0 && bVar.b() == 8;
    }

    private static void o() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}
