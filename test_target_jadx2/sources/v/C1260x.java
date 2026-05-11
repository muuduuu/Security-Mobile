package V;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: V.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1260x {

    /* renamed from: b, reason: collision with root package name */
    private static final Map f10740b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f10741c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f10742a = new HashMap();

    /* renamed from: V.x$a */
    static abstract class a {
        a() {
        }

        static a c(AbstractC1258v abstractC1258v, int i10) {
            return new C1246i(abstractC1258v, i10);
        }

        abstract int a();

        abstract AbstractC1258v b();
    }

    static {
        HashMap hashMap = new HashMap();
        f10740b = hashMap;
        hashMap.put(AbstractC1258v.f10729d, Range.create(2160, 4319));
        hashMap.put(AbstractC1258v.f10728c, Range.create(1080, 1439));
        hashMap.put(AbstractC1258v.f10727b, Range.create(720, 1079));
        hashMap.put(AbstractC1258v.f10726a, Range.create(241, 719));
        HashMap hashMap2 = new HashMap();
        f10741c = hashMap2;
        hashMap2.put(0, E.a.f1800a);
        hashMap2.put(1, E.a.f1802c);
    }

    C1260x(List list, Map map) {
        for (AbstractC1258v abstractC1258v : f10740b.keySet()) {
            this.f10742a.put(a.c(abstractC1258v, -1), new ArrayList());
            Iterator it = f10741c.keySet().iterator();
            while (it.hasNext()) {
                this.f10742a.put(a.c(abstractC1258v, ((Integer) it.next()).intValue()), new ArrayList());
            }
        }
        b(map);
        c(list);
        i(map);
    }

    private void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            List f10 = f((AbstractC1258v) entry.getKey(), -1);
            Objects.requireNonNull(f10);
            f10.add((Size) entry.getValue());
        }
    }

    private void c(List list) {
        Integer d10;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            AbstractC1258v e10 = e(size);
            if (e10 != null && (d10 = d(size)) != null) {
                List f10 = f(e10, d10.intValue());
                Objects.requireNonNull(f10);
                f10.add(size);
            }
        }
    }

    private static Integer d(Size size) {
        for (Map.Entry entry : f10741c.entrySet()) {
            if (E.a.b(size, (Rational) entry.getValue(), L.d.f5618b)) {
                return (Integer) entry.getKey();
            }
        }
        return null;
    }

    private static AbstractC1258v e(Size size) {
        for (Map.Entry entry : f10740b.entrySet()) {
            if (((Range) entry.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                return (AbstractC1258v) entry.getKey();
            }
        }
        return null;
    }

    private List f(AbstractC1258v abstractC1258v, int i10) {
        return (List) this.f10742a.get(a.c(abstractC1258v, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int h(int i10, Size size, Size size2) {
        return Math.abs(L.d.c(size) - i10) - Math.abs(L.d.c(size2) - i10);
    }

    private void i(Map map) {
        for (Map.Entry entry : this.f10742a.entrySet()) {
            Size size = (Size) map.get(((a) entry.getKey()).b());
            if (size != null) {
                final int c10 = L.d.c(size);
                Collections.sort((List) entry.getValue(), new Comparator() { // from class: V.w
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int h10;
                        h10 = C1260x.h(c10, (Size) obj, (Size) obj2);
                        return h10;
                    }
                });
            }
        }
    }

    List g(AbstractC1258v abstractC1258v, int i10) {
        List f10 = f(abstractC1258v, i10);
        return f10 != null ? new ArrayList(f10) : new ArrayList(0);
    }
}
