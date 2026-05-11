package v4;

import java.util.HashMap;
import java.util.Map;

/* renamed from: v4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4929e {

    /* renamed from: v4.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Map f43924a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f43925b;

        public Map a() {
            if (!this.f43925b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f43925b = false;
            return this.f43924a;
        }

        public a b(Object obj, Object obj2) {
            if (!this.f43925b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f43924a.put(obj, obj2);
            return this;
        }

        private a() {
            this.f43924a = AbstractC4929e.b();
            this.f43925b = true;
        }
    }

    public static a a() {
        return new a();
    }

    public static HashMap b() {
        return new HashMap();
    }

    public static Map c() {
        return b();
    }

    public static Map d(Object obj, Object obj2) {
        Map c10 = c();
        c10.put(obj, obj2);
        return c10;
    }

    public static Map e(Object obj, Object obj2, Object obj3, Object obj4) {
        Map c10 = c();
        c10.put(obj, obj2);
        c10.put(obj3, obj4);
        return c10;
    }

    public static Map f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Map c10 = c();
        c10.put(obj, obj2);
        c10.put(obj3, obj4);
        c10.put(obj5, obj6);
        return c10;
    }

    public static Map g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Map c10 = c();
        c10.put(obj, obj2);
        c10.put(obj3, obj4);
        c10.put(obj5, obj6);
        c10.put(obj7, obj8);
        return c10;
    }

    public static Map h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Map c10 = c();
        c10.put(obj, obj2);
        c10.put(obj3, obj4);
        c10.put(obj5, obj6);
        c10.put(obj7, obj8);
        c10.put(obj9, obj10);
        return c10;
    }

    public static Map i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        Map c10 = c();
        c10.put(obj, obj2);
        c10.put(obj3, obj4);
        c10.put(obj5, obj6);
        c10.put(obj7, obj8);
        c10.put(obj9, obj10);
        c10.put(obj11, obj12);
        return c10;
    }

    public static Map j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        Map c10 = c();
        c10.put(obj, obj2);
        c10.put(obj3, obj4);
        c10.put(obj5, obj6);
        c10.put(obj7, obj8);
        c10.put(obj9, obj10);
        c10.put(obj11, obj12);
        c10.put(obj13, obj14);
        return c10;
    }
}
