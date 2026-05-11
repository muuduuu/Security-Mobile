package pb;

import Jd.C0874b0;
import Jd.M;
import Jd.N;
import Jd.O;
import Jd.O0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import q1.AbstractC3901a;
import vb.EnumC5010e;
import xb.AbstractC5139a;
import yc.InterfaceC5191a;

/* loaded from: classes2.dex */
public final class k implements Iterable, InterfaceC5191a {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f38570a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f38571b;

    /* renamed from: c, reason: collision with root package name */
    private final List f38572c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f38573d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC5010e f38574a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f38575b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f38576c;

        public a(EnumC5010e eventName, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            this.f38574a = eventName;
            this.f38575b = obj;
            this.f38576c = obj2;
        }

        public final void a(j moduleHolder) {
            Object obj;
            Intrinsics.checkNotNullParameter(moduleHolder, "moduleHolder");
            Object obj2 = this.f38575b;
            if (obj2 != null && (obj = this.f38576c) != null) {
                moduleHolder.l(this.f38574a, obj2, obj);
            } else if (obj2 != null) {
                moduleHolder.k(this.f38574a, obj2);
            } else {
                moduleHolder.j(this.f38574a);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f38574a == aVar.f38574a && Intrinsics.b(this.f38575b, aVar.f38575b) && Intrinsics.b(this.f38576c, aVar.f38576c);
        }

        public int hashCode() {
            int hashCode = this.f38574a.hashCode() * 31;
            Object obj = this.f38575b;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f38576c;
            return hashCode2 + (obj2 != null ? obj2.hashCode() : 0);
        }

        public String toString() {
            return "PostponedEvent(eventName=" + this.f38574a + ", sender=" + this.f38575b + ", payload=" + this.f38576c + ")";
        }
    }

    static final class b extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f38577a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(0);
            this.f38577a = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N invoke() {
            return O.a(C0874b0.a().l(O0.b(null, 1, null)).l(new M(this.f38577a.e().e())));
        }
    }

    public k(WeakReference runtimeContext) {
        Intrinsics.checkNotNullParameter(runtimeContext, "runtimeContext");
        this.f38570a = runtimeContext;
        this.f38571b = new LinkedHashMap();
        this.f38572c = new ArrayList();
    }

    private final void F() {
        synchronized (this) {
            this.f38573d = true;
            Unit unit = Unit.f36324a;
        }
    }

    private final boolean e(EnumC5010e enumC5010e, Object obj, Object obj2) {
        synchronized (this) {
            if (this.f38573d) {
                return false;
            }
            this.f38572c.add(new a(enumC5010e, obj, obj2));
            return true;
        }
    }

    static /* synthetic */ boolean h(k kVar, EnumC5010e enumC5010e, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            obj2 = null;
        }
        return kVar.e(enumC5010e, obj, obj2);
    }

    private final void m() {
        synchronized (this) {
            try {
                for (a aVar : this.f38572c) {
                    Iterator it = iterator();
                    while (it.hasNext()) {
                        aVar.a((j) it.next());
                    }
                }
                this.f38572c.clear();
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void A(EnumC5010e eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (h(this, eventName, null, null, 6, null)) {
            return;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            ((j) it.next()).j(eventName);
        }
    }

    public final void B(EnumC5010e eventName, Object obj) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (h(this, eventName, obj, null, 4, null)) {
            return;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            ((j) it.next()).k(eventName, obj);
        }
    }

    public final void D(EnumC5010e eventName, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (e(eventName, obj, obj2)) {
            return;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            ((j) it.next()).l(eventName, obj, obj2);
        }
    }

    public final void E() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((j) it.next()).j(EnumC5010e.MODULE_CREATE);
        }
        J();
        F();
        m();
    }

    public final k G(l provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Iterator it = provider.getModulesList().iterator();
        while (it.hasNext()) {
            I((AbstractC5139a) ((Class) it.next()).getDeclaredConstructor(null).newInstance(null));
        }
        return this;
    }

    public final void I(AbstractC5139a module) {
        Intrinsics.checkNotNullParameter(module, "module");
        AbstractC3901a.c("[ExpoModulesCore] " + ("ModuleRegistry.register(" + module.getClass() + ")"));
        try {
            Object obj = this.f38570a.get();
            if (obj == null) {
                throw new IllegalArgumentException("Cannot create a module for invalid runtime context.");
            }
            module.h((r) obj);
            j jVar = new j(module);
            module.g(lc.i.a(new b(jVar)));
            v().put(jVar.h(), jVar);
            Unit unit = Unit.f36324a;
        } finally {
            AbstractC3901a.f();
        }
    }

    public final void J() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((j) it.next()).m();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f38571b.values().iterator();
    }

    public final void j() {
        this.f38571b.clear();
        AbstractC3864c.a().c("✅ ModuleRegistry was destroyed");
    }

    public final j r(Class viewClass) {
        j jVar;
        Intrinsics.checkNotNullParameter(viewClass, "viewClass");
        Iterator it = this.f38571b.entrySet().iterator();
        do {
            jVar = null;
            if (!it.hasNext()) {
                break;
            }
            j jVar2 = (j) ((Map.Entry) it.next()).getValue();
            expo.modules.kotlin.views.o h10 = jVar2.e().h();
            if (Intrinsics.b(h10 != null ? h10.j() : null, viewClass)) {
                jVar = jVar2;
            }
        } while (jVar == null);
        return jVar;
    }

    public final j t(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (j) this.f38571b.get(name);
    }

    public final j u(AbstractC5139a module) {
        Object obj;
        Intrinsics.checkNotNullParameter(module, "module");
        Iterator it = this.f38571b.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((j) obj).g() == module) {
                break;
            }
        }
        if (obj instanceof j) {
            return (j) obj;
        }
        return null;
    }

    public final Map v() {
        return this.f38571b;
    }

    public final boolean w(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f38571b.containsKey(name);
    }
}
