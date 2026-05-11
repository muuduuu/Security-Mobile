package F5;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class i {
    public static i b() {
        return a.b();
    }

    public abstract Object a(Object obj);

    public abstract i c(Object obj, Object obj2);

    public static class a extends i implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        protected static final a f2531c = new a(Collections.emptyMap());

        /* renamed from: d, reason: collision with root package name */
        protected static final Object f2532d = new Object();

        /* renamed from: a, reason: collision with root package name */
        protected final Map f2533a;

        /* renamed from: b, reason: collision with root package name */
        protected transient Map f2534b;

        protected a(Map map) {
            this.f2533a = map;
            this.f2534b = null;
        }

        public static i b() {
            return f2531c;
        }

        @Override // F5.i
        public Object a(Object obj) {
            Object obj2;
            Map map = this.f2534b;
            if (map == null || (obj2 = map.get(obj)) == null) {
                return this.f2533a.get(obj);
            }
            if (obj2 == f2532d) {
                return null;
            }
            return obj2;
        }

        @Override // F5.i
        public i c(Object obj, Object obj2) {
            if (obj2 == null) {
                if (!this.f2533a.containsKey(obj)) {
                    Map map = this.f2534b;
                    if (map != null && map.containsKey(obj)) {
                        this.f2534b.remove(obj);
                    }
                    return this;
                }
                obj2 = f2532d;
            }
            Map map2 = this.f2534b;
            if (map2 == null) {
                return d(obj, obj2);
            }
            map2.put(obj, obj2);
            return this;
        }

        protected i d(Object obj, Object obj2) {
            HashMap hashMap = new HashMap();
            if (obj2 == null) {
                obj2 = f2532d;
            }
            hashMap.put(obj, obj2);
            return new a(this.f2533a, hashMap);
        }

        protected a(Map map, Map map2) {
            this.f2533a = map;
            this.f2534b = map2;
        }
    }
}
