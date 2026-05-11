package androidx.lifecycle;

import androidx.lifecycle.AbstractC1592i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n.C3700a;
import n.C3701b;

/* loaded from: classes.dex */
public class r extends AbstractC1592i {

    /* renamed from: k, reason: collision with root package name */
    public static final a f17138k = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17139b;

    /* renamed from: c, reason: collision with root package name */
    private C3700a f17140c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC1592i.b f17141d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference f17142e;

    /* renamed from: f, reason: collision with root package name */
    private int f17143f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17144g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17145h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f17146i;

    /* renamed from: j, reason: collision with root package name */
    private final Md.s f17147j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1592i.b a(AbstractC1592i.b state1, AbstractC1592i.b bVar) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC1592i.b f17148a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1596m f17149b;

        public b(InterfaceC1598o interfaceC1598o, AbstractC1592i.b initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.d(interfaceC1598o);
            this.f17149b = C1603u.f(interfaceC1598o);
            this.f17148a = initialState;
        }

        public final void a(InterfaceC1599p interfaceC1599p, AbstractC1592i.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            AbstractC1592i.b targetState = event.getTargetState();
            this.f17148a = r.f17138k.a(this.f17148a, targetState);
            InterfaceC1596m interfaceC1596m = this.f17149b;
            Intrinsics.d(interfaceC1599p);
            interfaceC1596m.d(interfaceC1599p, event);
            this.f17148a = targetState;
        }

        public final AbstractC1592i.b b() {
            return this.f17148a;
        }
    }

    private r(InterfaceC1599p interfaceC1599p, boolean z10) {
        this.f17139b = z10;
        this.f17140c = new C3700a();
        AbstractC1592i.b bVar = AbstractC1592i.b.INITIALIZED;
        this.f17141d = bVar;
        this.f17146i = new ArrayList();
        this.f17142e = new WeakReference(interfaceC1599p);
        this.f17147j = Md.y.a(bVar);
    }

    private final void e(InterfaceC1599p interfaceC1599p) {
        Iterator c10 = this.f17140c.c();
        Intrinsics.checkNotNullExpressionValue(c10, "observerMap.descendingIterator()");
        while (c10.hasNext() && !this.f17145h) {
            Map.Entry entry = (Map.Entry) c10.next();
            Intrinsics.checkNotNullExpressionValue(entry, "next()");
            InterfaceC1598o interfaceC1598o = (InterfaceC1598o) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f17141d) > 0 && !this.f17145h && this.f17140c.contains(interfaceC1598o)) {
                AbstractC1592i.a a10 = AbstractC1592i.a.Companion.a(bVar.b());
                if (a10 == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                m(a10.getTargetState());
                bVar.a(interfaceC1599p, a10);
                l();
            }
        }
    }

    private final AbstractC1592i.b f(InterfaceC1598o interfaceC1598o) {
        b bVar;
        Map.Entry u10 = this.f17140c.u(interfaceC1598o);
        AbstractC1592i.b bVar2 = null;
        AbstractC1592i.b b10 = (u10 == null || (bVar = (b) u10.getValue()) == null) ? null : bVar.b();
        if (!this.f17146i.isEmpty()) {
            bVar2 = (AbstractC1592i.b) this.f17146i.get(r0.size() - 1);
        }
        a aVar = f17138k;
        return aVar.a(aVar.a(this.f17141d, b10), bVar2);
    }

    private final void g(String str) {
        if (!this.f17139b || AbstractC1601s.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void h(InterfaceC1599p interfaceC1599p) {
        C3701b.d j10 = this.f17140c.j();
        Intrinsics.checkNotNullExpressionValue(j10, "observerMap.iteratorWithAdditions()");
        while (j10.hasNext() && !this.f17145h) {
            Map.Entry entry = (Map.Entry) j10.next();
            InterfaceC1598o interfaceC1598o = (InterfaceC1598o) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f17141d) < 0 && !this.f17145h && this.f17140c.contains(interfaceC1598o)) {
                m(bVar.b());
                AbstractC1592i.a c10 = AbstractC1592i.a.Companion.c(bVar.b());
                if (c10 == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(interfaceC1599p, c10);
                l();
            }
        }
    }

    private final boolean j() {
        if (this.f17140c.size() == 0) {
            return true;
        }
        Map.Entry e10 = this.f17140c.e();
        Intrinsics.d(e10);
        AbstractC1592i.b b10 = ((b) e10.getValue()).b();
        Map.Entry k10 = this.f17140c.k();
        Intrinsics.d(k10);
        AbstractC1592i.b b11 = ((b) k10.getValue()).b();
        return b10 == b11 && this.f17141d == b11;
    }

    private final void k(AbstractC1592i.b bVar) {
        AbstractC1592i.b bVar2 = this.f17141d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC1592i.b.INITIALIZED && bVar == AbstractC1592i.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + bVar + ", but was " + this.f17141d + " in component " + this.f17142e.get()).toString());
        }
        this.f17141d = bVar;
        if (this.f17144g || this.f17143f != 0) {
            this.f17145h = true;
            return;
        }
        this.f17144g = true;
        o();
        this.f17144g = false;
        if (this.f17141d == AbstractC1592i.b.DESTROYED) {
            this.f17140c = new C3700a();
        }
    }

    private final void l() {
        this.f17146i.remove(r0.size() - 1);
    }

    private final void m(AbstractC1592i.b bVar) {
        this.f17146i.add(bVar);
    }

    private final void o() {
        InterfaceC1599p interfaceC1599p = (InterfaceC1599p) this.f17142e.get();
        if (interfaceC1599p == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!j()) {
            this.f17145h = false;
            AbstractC1592i.b bVar = this.f17141d;
            Map.Entry e10 = this.f17140c.e();
            Intrinsics.d(e10);
            if (bVar.compareTo(((b) e10.getValue()).b()) < 0) {
                e(interfaceC1599p);
            }
            Map.Entry k10 = this.f17140c.k();
            if (!this.f17145h && k10 != null && this.f17141d.compareTo(((b) k10.getValue()).b()) > 0) {
                h(interfaceC1599p);
            }
        }
        this.f17145h = false;
        this.f17147j.setValue(b());
    }

    @Override // androidx.lifecycle.AbstractC1592i
    public void a(InterfaceC1598o observer) {
        InterfaceC1599p interfaceC1599p;
        Intrinsics.checkNotNullParameter(observer, "observer");
        g("addObserver");
        AbstractC1592i.b bVar = this.f17141d;
        AbstractC1592i.b bVar2 = AbstractC1592i.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC1592i.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f17140c.r(observer, bVar3)) == null && (interfaceC1599p = (InterfaceC1599p) this.f17142e.get()) != null) {
            boolean z10 = this.f17143f != 0 || this.f17144g;
            AbstractC1592i.b f10 = f(observer);
            this.f17143f++;
            while (bVar3.b().compareTo(f10) < 0 && this.f17140c.contains(observer)) {
                m(bVar3.b());
                AbstractC1592i.a c10 = AbstractC1592i.a.Companion.c(bVar3.b());
                if (c10 == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(interfaceC1599p, c10);
                l();
                f10 = f(observer);
            }
            if (!z10) {
                o();
            }
            this.f17143f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1592i
    public AbstractC1592i.b b() {
        return this.f17141d;
    }

    @Override // androidx.lifecycle.AbstractC1592i
    public void d(InterfaceC1598o observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        g("removeObserver");
        this.f17140c.t(observer);
    }

    public void i(AbstractC1592i.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        g("handleLifecycleEvent");
        k(event.getTargetState());
    }

    public void n(AbstractC1592i.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        g("setCurrentState");
        k(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC1599p provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
