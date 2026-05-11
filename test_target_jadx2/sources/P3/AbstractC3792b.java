package p3;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3792b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Integer f38323a;

    private static int a(Context context) {
        ArrayList arrayList = new ArrayList();
        c(arrayList, f());
        c(arrayList, e());
        c(arrayList, g(context));
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        int size = arrayList.size() / 2;
        int i10 = size - 1;
        return ((Integer) arrayList.get(i10)).intValue() + ((((Integer) arrayList.get(size)).intValue() - ((Integer) arrayList.get(i10)).intValue()) / 2);
    }

    private static int b(Context context) {
        long g10 = AbstractC3791a.g(context);
        if (g10 == -1) {
            return a(context);
        }
        if (g10 <= 805306368) {
            return AbstractC3791a.f() <= 1 ? 2009 : 2010;
        }
        if (g10 <= 1073741824) {
            return AbstractC3791a.b() < 1300000 ? 2011 : 2012;
        }
        if (g10 <= 1610612736) {
            return AbstractC3791a.b() < 1800000 ? 2012 : 2013;
        }
        if (g10 <= 2147483648L) {
            return 2013;
        }
        if (g10 <= 3221225472L) {
            return 2014;
        }
        return g10 <= 5368709120L ? 2015 : 2016;
    }

    private static void c(ArrayList arrayList, int i10) {
        if (i10 != -1) {
            arrayList.add(Integer.valueOf(i10));
        }
    }

    public static int d(Context context) {
        if (f38323a == null) {
            synchronized (AbstractC3792b.class) {
                try {
                    if (f38323a == null) {
                        f38323a = Integer.valueOf(b(context));
                    }
                } finally {
                }
            }
        }
        return f38323a.intValue();
    }

    private static int e() {
        long b10 = AbstractC3791a.b();
        if (b10 == -1) {
            return -1;
        }
        if (b10 <= 528000) {
            return 2008;
        }
        if (b10 <= 620000) {
            return 2009;
        }
        if (b10 <= 1020000) {
            return 2010;
        }
        if (b10 <= 1220000) {
            return 2011;
        }
        if (b10 <= 1520000) {
            return 2012;
        }
        return b10 <= 2020000 ? 2013 : 2014;
    }

    private static int f() {
        int f10 = AbstractC3791a.f();
        if (f10 < 1) {
            return -1;
        }
        if (f10 == 1) {
            return 2008;
        }
        return f10 <= 3 ? 2011 : 2012;
    }

    private static int g(Context context) {
        long g10 = AbstractC3791a.g(context);
        if (g10 <= 0) {
            return -1;
        }
        if (g10 <= 201326592) {
            return 2008;
        }
        if (g10 <= 304087040) {
            return 2009;
        }
        if (g10 <= 536870912) {
            return 2010;
        }
        if (g10 <= 1073741824) {
            return 2011;
        }
        if (g10 <= 1610612736) {
            return 2012;
        }
        return g10 <= 2147483648L ? 2013 : 2014;
    }
}
