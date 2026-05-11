package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lc.InterfaceC3624c;
import wc.InterfaceC5055a;
import wc.InterfaceC5056b;
import wc.InterfaceC5057c;
import wc.InterfaceC5058d;
import wc.InterfaceC5059e;
import wc.InterfaceC5060f;
import wc.InterfaceC5061g;
import wc.InterfaceC5062h;
import wc.InterfaceC5063i;
import wc.InterfaceC5064j;
import wc.InterfaceC5065k;
import wc.InterfaceC5066l;
import wc.InterfaceC5067m;
import wc.InterfaceC5068n;
import wc.o;
import wc.p;
import wc.q;
import wc.r;
import wc.s;
import wc.t;
import xc.InterfaceC5155h;
import yc.InterfaceC5191a;
import yc.InterfaceC5192b;
import yc.c;
import yc.d;
import yc.e;
import yc.f;

/* loaded from: classes3.dex */
public class a {
    public static Collection a(Object obj) {
        if ((obj instanceof InterfaceC5191a) && !(obj instanceof InterfaceC5192b)) {
            q(obj, "kotlin.collections.MutableCollection");
        }
        return g(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof InterfaceC5191a) && !(obj instanceof c)) {
            q(obj, "kotlin.collections.MutableIterable");
        }
        return h(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof InterfaceC5191a) && !(obj instanceof d)) {
            q(obj, "kotlin.collections.MutableList");
        }
        return i(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof InterfaceC5191a) && !(obj instanceof e)) {
            q(obj, "kotlin.collections.MutableMap");
        }
        return j(obj);
    }

    public static Set e(Object obj) {
        if ((obj instanceof InterfaceC5191a) && !(obj instanceof f)) {
            q(obj, "kotlin.collections.MutableSet");
        }
        return k(obj);
    }

    public static Object f(Object obj, int i10) {
        if (obj != null && !m(obj, i10)) {
            q(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection g(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw p(e10);
        }
    }

    public static Iterable h(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw p(e10);
        }
    }

    public static List i(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw p(e10);
        }
    }

    public static Map j(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw p(e10);
        }
    }

    public static Set k(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw p(e10);
        }
    }

    public static int l(Object obj) {
        if (obj instanceof InterfaceC5155h) {
            return ((InterfaceC5155h) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof InterfaceC5068n) {
            return 3;
        }
        if (obj instanceof o) {
            return 4;
        }
        if (obj instanceof p) {
            return 5;
        }
        if (obj instanceof q) {
            return 6;
        }
        if (obj instanceof r) {
            return 7;
        }
        if (obj instanceof s) {
            return 8;
        }
        if (obj instanceof t) {
            return 9;
        }
        if (obj instanceof InterfaceC5055a) {
            return 10;
        }
        if (obj instanceof InterfaceC5056b) {
            return 11;
        }
        if (obj instanceof InterfaceC5057c) {
            return 12;
        }
        if (obj instanceof InterfaceC5058d) {
            return 13;
        }
        if (obj instanceof InterfaceC5059e) {
            return 14;
        }
        if (obj instanceof InterfaceC5060f) {
            return 15;
        }
        if (obj instanceof InterfaceC5061g) {
            return 16;
        }
        if (obj instanceof InterfaceC5062h) {
            return 17;
        }
        if (obj instanceof InterfaceC5063i) {
            return 18;
        }
        if (obj instanceof InterfaceC5064j) {
            return 19;
        }
        if (obj instanceof InterfaceC5065k) {
            return 20;
        }
        if (obj instanceof InterfaceC5066l) {
            return 21;
        }
        return obj instanceof InterfaceC5067m ? 22 : -1;
    }

    public static boolean m(Object obj, int i10) {
        return (obj instanceof InterfaceC3624c) && l(obj) == i10;
    }

    public static boolean n(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof InterfaceC5191a) || (obj instanceof e));
    }

    private static Throwable o(Throwable th) {
        return Intrinsics.l(th, a.class.getName());
    }

    public static ClassCastException p(ClassCastException classCastException) {
        throw ((ClassCastException) o(classCastException));
    }

    public static void q(Object obj, String str) {
        r((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void r(String str) {
        throw p(new ClassCastException(str));
    }
}
