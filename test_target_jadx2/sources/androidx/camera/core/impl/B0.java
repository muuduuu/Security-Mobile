package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.V;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class B0 extends G0 implements A0 {

    /* renamed from: L, reason: collision with root package name */
    private static final V.c f14406L = V.c.OPTIONAL;

    private B0(TreeMap treeMap) {
        super(treeMap);
    }

    public static B0 d0() {
        return new B0(new TreeMap(G0.f14412J));
    }

    public static B0 e0(V v10) {
        TreeMap treeMap = new TreeMap(G0.f14412J);
        for (V.a aVar : v10.e()) {
            Set<V.c> h10 = v10.h(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (V.c cVar : h10) {
                arrayMap.put(cVar, v10.d(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new B0(treeMap);
    }

    public Object f0(V.a aVar) {
        return this.f14414I.remove(aVar);
    }

    @Override // androidx.camera.core.impl.A0
    public void r(V.a aVar, V.c cVar, Object obj) {
        Map map = (Map) this.f14414I.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f14414I.put(aVar, arrayMap);
            arrayMap.put(cVar, obj);
            return;
        }
        V.c cVar2 = (V.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), obj) || !V.L(cVar2, cVar)) {
            map.put(cVar, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + obj);
    }

    @Override // androidx.camera.core.impl.A0
    public void x(V.a aVar, Object obj) {
        r(aVar, f14406L, obj);
    }
}
