package z2;

import i2.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: z2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5247e {

    /* renamed from: a, reason: collision with root package name */
    private final List f45687a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Map f45688b = new HashMap();

    /* renamed from: z2.e$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f45689a;

        /* renamed from: b, reason: collision with root package name */
        final Class f45690b;

        /* renamed from: c, reason: collision with root package name */
        final j f45691c;

        public a(Class cls, Class cls2, j jVar) {
            this.f45689a = cls;
            this.f45690b = cls2;
            this.f45691c = jVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f45689a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f45690b);
        }
    }

    private synchronized List c(String str) {
        List list;
        try {
            if (!this.f45687a.contains(str)) {
                this.f45687a.add(str);
            }
            list = (List) this.f45688b.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f45688b.put(str, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }

    public synchronized void a(String str, j jVar, Class cls, Class cls2) {
        c(str).add(new a(cls, cls2, jVar));
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f45687a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f45688b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f45691c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f45687a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f45688b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f45690b)) {
                        arrayList.add(aVar.f45690b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(String str, j jVar, Class cls, Class cls2) {
        c(str).add(0, new a(cls, cls2, jVar));
    }

    public synchronized void f(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f45687a);
            this.f45687a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f45687a.add((String) it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f45687a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
