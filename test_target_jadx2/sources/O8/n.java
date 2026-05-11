package o8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o8.n;
import s8.InterfaceC4505a;
import x8.InterfaceC5135c;
import x8.InterfaceC5136d;

/* loaded from: classes2.dex */
public class n implements InterfaceC3767d, InterfaceC4505a {

    /* renamed from: i, reason: collision with root package name */
    private static final A8.b f38003i = new A8.b() { // from class: o8.j
        @Override // A8.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map f38004a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f38005b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f38006c;

    /* renamed from: d, reason: collision with root package name */
    private final List f38007d;

    /* renamed from: e, reason: collision with root package name */
    private Set f38008e;

    /* renamed from: f, reason: collision with root package name */
    private final u f38009f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f38010g;

    /* renamed from: h, reason: collision with root package name */
    private final i f38011h;

    public static b k(Executor executor) {
        return new b(executor);
    }

    private void l(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f38007d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((A8.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f38011h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C3766c) it2.next()).j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f38008e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f38008e.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f38004a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f38004a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C3766c c3766c = (C3766c) it3.next();
                this.f38004a.put(c3766c, new w(new A8.b() { // from class: o8.k
                    @Override // A8.b
                    public final Object get() {
                        Object p10;
                        p10 = n.this.p(c3766c);
                        return p10;
                    }
                }));
            }
            arrayList.addAll(u(list));
            arrayList.addAll(v());
            t();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        s();
    }

    private void m(Map map, boolean z10) {
        for (Map.Entry entry : map.entrySet()) {
            C3766c c3766c = (C3766c) entry.getKey();
            A8.b bVar = (A8.b) entry.getValue();
            if (c3766c.n() || (c3766c.o() && z10)) {
                bVar.get();
            }
        }
        this.f38009f.f();
    }

    private static List o(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p(C3766c c3766c) {
        return c3766c.h().a(new C3763E(c3766c, this));
    }

    private void s() {
        Boolean bool = (Boolean) this.f38010g.get();
        if (bool != null) {
            m(this.f38004a, bool.booleanValue());
        }
    }

    private void t() {
        for (C3766c c3766c : this.f38004a.keySet()) {
            for (q qVar : c3766c.g()) {
                if (qVar.f() && !this.f38006c.containsKey(qVar.b())) {
                    this.f38006c.put(qVar.b(), x.b(Collections.emptySet()));
                } else if (this.f38005b.containsKey(qVar.b())) {
                    continue;
                } else {
                    if (qVar.e()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", c3766c, qVar.b()));
                    }
                    if (!qVar.f()) {
                        this.f38005b.put(qVar.b(), C3760B.c());
                    }
                }
            }
        }
    }

    private List u(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3766c c3766c = (C3766c) it.next();
            if (c3766c.p()) {
                final A8.b bVar = (A8.b) this.f38004a.get(c3766c);
                for (C3762D c3762d : c3766c.j()) {
                    if (this.f38005b.containsKey(c3762d)) {
                        final C3760B c3760b = (C3760B) ((A8.b) this.f38005b.get(c3762d));
                        arrayList.add(new Runnable() { // from class: o8.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                C3760B.this.f(bVar);
                            }
                        });
                    } else {
                        this.f38005b.put(c3762d, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List v() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f38004a.entrySet()) {
            C3766c c3766c = (C3766c) entry.getKey();
            if (!c3766c.p()) {
                A8.b bVar = (A8.b) entry.getValue();
                for (C3762D c3762d : c3766c.j()) {
                    if (!hashMap.containsKey(c3762d)) {
                        hashMap.put(c3762d, new HashSet());
                    }
                    ((Set) hashMap.get(c3762d)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f38006c.containsKey(entry2.getKey())) {
                final x xVar = (x) this.f38006c.get(entry2.getKey());
                for (final A8.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: o8.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            x.this.a(bVar2);
                        }
                    });
                }
            } else {
                this.f38006c.put((C3762D) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // o8.InterfaceC3767d
    public synchronized A8.b c(C3762D c3762d) {
        AbstractC3761C.c(c3762d, "Null interface requested.");
        return (A8.b) this.f38005b.get(c3762d);
    }

    @Override // o8.InterfaceC3767d
    public synchronized A8.b f(C3762D c3762d) {
        x xVar = (x) this.f38006c.get(c3762d);
        if (xVar != null) {
            return xVar;
        }
        return f38003i;
    }

    public void n(boolean z10) {
        HashMap hashMap;
        if (androidx.camera.view.i.a(this.f38010g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f38004a);
            }
            m(hashMap, z10);
        }
    }

    private n(Executor executor, Iterable iterable, Collection collection, i iVar) {
        this.f38004a = new HashMap();
        this.f38005b = new HashMap();
        this.f38006c = new HashMap();
        this.f38008e = new HashSet();
        this.f38010g = new AtomicReference();
        u uVar = new u(executor);
        this.f38009f = uVar;
        this.f38011h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3766c.s(uVar, u.class, InterfaceC5136d.class, InterfaceC5135c.class));
        arrayList.add(C3766c.s(this, InterfaceC4505a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C3766c c3766c = (C3766c) it.next();
            if (c3766c != null) {
                arrayList.add(c3766c);
            }
        }
        this.f38007d = o(iterable);
        l(arrayList);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f38012a;

        /* renamed from: b, reason: collision with root package name */
        private final List f38013b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List f38014c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private i f38015d = i.f37996a;

        b(Executor executor) {
            this.f38012a = executor;
        }

        public b b(C3766c c3766c) {
            this.f38014c.add(c3766c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f38013b.add(new A8.b() { // from class: o8.o
                @Override // A8.b
                public final Object get() {
                    ComponentRegistrar f10;
                    f10 = n.b.f(ComponentRegistrar.this);
                    return f10;
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f38013b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f38012a, this.f38013b, this.f38014c, this.f38015d);
        }

        public b g(i iVar) {
            this.f38015d = iVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
