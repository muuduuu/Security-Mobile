package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.V;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class G0 implements V {

    /* renamed from: J, reason: collision with root package name */
    protected static final Comparator f14412J;

    /* renamed from: K, reason: collision with root package name */
    private static final G0 f14413K;

    /* renamed from: I, reason: collision with root package name */
    protected final TreeMap f14414I;

    static {
        Comparator comparator = new Comparator() { // from class: androidx.camera.core.impl.F0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c02;
                c02 = G0.c0((V.a) obj, (V.a) obj2);
                return c02;
            }
        };
        f14412J = comparator;
        f14413K = new G0(new TreeMap(comparator));
    }

    G0(TreeMap treeMap) {
        this.f14414I = treeMap;
    }

    public static G0 a0() {
        return f14413K;
    }

    public static G0 b0(V v10) {
        if (G0.class.equals(v10.getClass())) {
            return (G0) v10;
        }
        TreeMap treeMap = new TreeMap(f14412J);
        for (V.a aVar : v10.e()) {
            Set<V.c> h10 = v10.h(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (V.c cVar : h10) {
                arrayMap.put(cVar, v10.d(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new G0(treeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int c0(V.a aVar, V.a aVar2) {
        return aVar.c().compareTo(aVar2.c());
    }

    @Override // androidx.camera.core.impl.V
    public Object a(V.a aVar) {
        Map map = (Map) this.f14414I.get(aVar);
        if (map != null) {
            return map.get((V.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // androidx.camera.core.impl.V
    public boolean b(V.a aVar) {
        return this.f14414I.containsKey(aVar);
    }

    @Override // androidx.camera.core.impl.V
    public void c(String str, V.b bVar) {
        for (Map.Entry entry : this.f14414I.tailMap(V.a.a(str, Void.class)).entrySet()) {
            if (!((V.a) entry.getKey()).c().startsWith(str) || !bVar.a((V.a) entry.getKey())) {
                return;
            }
        }
    }

    @Override // androidx.camera.core.impl.V
    public Object d(V.a aVar, V.c cVar) {
        Map map = (Map) this.f14414I.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(cVar)) {
            return map.get(cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
    }

    @Override // androidx.camera.core.impl.V
    public Set e() {
        return Collections.unmodifiableSet(this.f14414I.keySet());
    }

    @Override // androidx.camera.core.impl.V
    public Object f(V.a aVar, Object obj) {
        try {
            return a(aVar);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // androidx.camera.core.impl.V
    public V.c g(V.a aVar) {
        Map map = (Map) this.f14414I.get(aVar);
        if (map != null) {
            return (V.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // androidx.camera.core.impl.V
    public Set h(V.a aVar) {
        Map map = (Map) this.f14414I.get(aVar);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }
}
