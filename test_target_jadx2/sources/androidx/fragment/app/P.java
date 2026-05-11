package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1592i;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC1581x f16803a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f16804b;

    /* renamed from: d, reason: collision with root package name */
    int f16806d;

    /* renamed from: e, reason: collision with root package name */
    int f16807e;

    /* renamed from: f, reason: collision with root package name */
    int f16808f;

    /* renamed from: g, reason: collision with root package name */
    int f16809g;

    /* renamed from: h, reason: collision with root package name */
    int f16810h;

    /* renamed from: i, reason: collision with root package name */
    boolean f16811i;

    /* renamed from: k, reason: collision with root package name */
    String f16813k;

    /* renamed from: l, reason: collision with root package name */
    int f16814l;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f16815m;

    /* renamed from: n, reason: collision with root package name */
    int f16816n;

    /* renamed from: o, reason: collision with root package name */
    CharSequence f16817o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList f16818p;

    /* renamed from: q, reason: collision with root package name */
    ArrayList f16819q;

    /* renamed from: s, reason: collision with root package name */
    ArrayList f16821s;

    /* renamed from: c, reason: collision with root package name */
    ArrayList f16805c = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    boolean f16812j = true;

    /* renamed from: r, reason: collision with root package name */
    boolean f16820r = false;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f16822a;

        /* renamed from: b, reason: collision with root package name */
        ComponentCallbacksC1573o f16823b;

        /* renamed from: c, reason: collision with root package name */
        boolean f16824c;

        /* renamed from: d, reason: collision with root package name */
        int f16825d;

        /* renamed from: e, reason: collision with root package name */
        int f16826e;

        /* renamed from: f, reason: collision with root package name */
        int f16827f;

        /* renamed from: g, reason: collision with root package name */
        int f16828g;

        /* renamed from: h, reason: collision with root package name */
        AbstractC1592i.b f16829h;

        /* renamed from: i, reason: collision with root package name */
        AbstractC1592i.b f16830i;

        a() {
        }

        a(int i10, ComponentCallbacksC1573o componentCallbacksC1573o) {
            this.f16822a = i10;
            this.f16823b = componentCallbacksC1573o;
            this.f16824c = false;
            AbstractC1592i.b bVar = AbstractC1592i.b.RESUMED;
            this.f16829h = bVar;
            this.f16830i = bVar;
        }

        a(int i10, ComponentCallbacksC1573o componentCallbacksC1573o, boolean z10) {
            this.f16822a = i10;
            this.f16823b = componentCallbacksC1573o;
            this.f16824c = z10;
            AbstractC1592i.b bVar = AbstractC1592i.b.RESUMED;
            this.f16829h = bVar;
            this.f16830i = bVar;
        }

        a(int i10, ComponentCallbacksC1573o componentCallbacksC1573o, AbstractC1592i.b bVar) {
            this.f16822a = i10;
            this.f16823b = componentCallbacksC1573o;
            this.f16824c = false;
            this.f16829h = componentCallbacksC1573o.mMaxState;
            this.f16830i = bVar;
        }
    }

    P(AbstractC1581x abstractC1581x, ClassLoader classLoader) {
        this.f16803a = abstractC1581x;
        this.f16804b = classLoader;
    }

    public P b(int i10, ComponentCallbacksC1573o componentCallbacksC1573o) {
        l(i10, componentCallbacksC1573o, null, 1);
        return this;
    }

    public P c(int i10, ComponentCallbacksC1573o componentCallbacksC1573o, String str) {
        l(i10, componentCallbacksC1573o, str, 1);
        return this;
    }

    P d(ViewGroup viewGroup, ComponentCallbacksC1573o componentCallbacksC1573o, String str) {
        componentCallbacksC1573o.mContainer = viewGroup;
        return c(viewGroup.getId(), componentCallbacksC1573o, str);
    }

    public P e(ComponentCallbacksC1573o componentCallbacksC1573o, String str) {
        l(0, componentCallbacksC1573o, str, 1);
        return this;
    }

    void f(a aVar) {
        this.f16805c.add(aVar);
        aVar.f16825d = this.f16806d;
        aVar.f16826e = this.f16807e;
        aVar.f16827f = this.f16808f;
        aVar.f16828g = this.f16809g;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    public P k() {
        if (this.f16811i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f16812j = false;
        return this;
    }

    void l(int i10, ComponentCallbacksC1573o componentCallbacksC1573o, String str, int i11) {
        String str2 = componentCallbacksC1573o.mPreviousWho;
        if (str2 != null) {
            U0.c.f(componentCallbacksC1573o, str2);
        }
        Class<?> cls = componentCallbacksC1573o.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = componentCallbacksC1573o.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + componentCallbacksC1573o + ": was " + componentCallbacksC1573o.mTag + " now " + str);
            }
            componentCallbacksC1573o.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC1573o + " with tag " + str + " to container view with no id");
            }
            int i12 = componentCallbacksC1573o.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC1573o + ": was " + componentCallbacksC1573o.mFragmentId + " now " + i10);
            }
            componentCallbacksC1573o.mFragmentId = i10;
            componentCallbacksC1573o.mContainerId = i10;
        }
        f(new a(i11, componentCallbacksC1573o));
    }

    public P m(ComponentCallbacksC1573o componentCallbacksC1573o) {
        f(new a(3, componentCallbacksC1573o));
        return this;
    }

    public P n(int i10, ComponentCallbacksC1573o componentCallbacksC1573o) {
        return o(i10, componentCallbacksC1573o, null);
    }

    public P o(int i10, ComponentCallbacksC1573o componentCallbacksC1573o, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        l(i10, componentCallbacksC1573o, str, 2);
        return this;
    }

    public P p(Runnable runnable) {
        k();
        if (this.f16821s == null) {
            this.f16821s = new ArrayList();
        }
        this.f16821s.add(runnable);
        return this;
    }

    public P q(int i10, int i11) {
        return r(i10, i11, 0, 0);
    }

    public P r(int i10, int i11, int i12, int i13) {
        this.f16806d = i10;
        this.f16807e = i11;
        this.f16808f = i12;
        this.f16809g = i13;
        return this;
    }

    public P s(ComponentCallbacksC1573o componentCallbacksC1573o, AbstractC1592i.b bVar) {
        f(new a(10, componentCallbacksC1573o, bVar));
        return this;
    }

    public P t(boolean z10) {
        this.f16820r = z10;
        return this;
    }
}
