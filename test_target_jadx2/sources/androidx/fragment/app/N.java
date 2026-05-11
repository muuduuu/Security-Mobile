package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC1573o;
import androidx.lifecycle.AbstractC1592i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class N extends androidx.viewpager.widget.a {

    /* renamed from: c, reason: collision with root package name */
    private final G f16792c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16793d;

    /* renamed from: e, reason: collision with root package name */
    private P f16794e = null;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f16795f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f16796g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private ComponentCallbacksC1573o f16797h = null;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16798i;

    public N(G g10, int i10) {
        this.f16792c = g10;
        this.f16793d = i10;
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i10, Object obj) {
        ComponentCallbacksC1573o componentCallbacksC1573o = (ComponentCallbacksC1573o) obj;
        if (this.f16794e == null) {
            this.f16794e = this.f16792c.n();
        }
        while (this.f16795f.size() <= i10) {
            this.f16795f.add(null);
        }
        this.f16795f.set(i10, componentCallbacksC1573o.isAdded() ? this.f16792c.r1(componentCallbacksC1573o) : null);
        this.f16796g.set(i10, null);
        this.f16794e.m(componentCallbacksC1573o);
        if (componentCallbacksC1573o.equals(this.f16797h)) {
            this.f16797h = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void b(ViewGroup viewGroup) {
        P p10 = this.f16794e;
        if (p10 != null) {
            if (!this.f16798i) {
                try {
                    this.f16798i = true;
                    p10.j();
                } finally {
                    this.f16798i = false;
                }
            }
            this.f16794e = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public Object g(ViewGroup viewGroup, int i10) {
        ComponentCallbacksC1573o.C0289o c0289o;
        ComponentCallbacksC1573o componentCallbacksC1573o;
        if (this.f16796g.size() > i10 && (componentCallbacksC1573o = (ComponentCallbacksC1573o) this.f16796g.get(i10)) != null) {
            return componentCallbacksC1573o;
        }
        if (this.f16794e == null) {
            this.f16794e = this.f16792c.n();
        }
        ComponentCallbacksC1573o p10 = p(i10);
        if (this.f16795f.size() > i10 && (c0289o = (ComponentCallbacksC1573o.C0289o) this.f16795f.get(i10)) != null) {
            p10.setInitialSavedState(c0289o);
        }
        while (this.f16796g.size() <= i10) {
            this.f16796g.add(null);
        }
        p10.setMenuVisibility(false);
        if (this.f16793d == 0) {
            p10.setUserVisibleHint(false);
        }
        this.f16796g.set(i10, p10);
        this.f16794e.b(viewGroup.getId(), p10);
        if (this.f16793d == 1) {
            this.f16794e.s(p10, AbstractC1592i.b.STARTED);
        }
        return p10;
    }

    @Override // androidx.viewpager.widget.a
    public boolean h(View view, Object obj) {
        return ((ComponentCallbacksC1573o) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void j(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f16795f.clear();
            this.f16796g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f16795f.add((ComponentCallbacksC1573o.C0289o) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    ComponentCallbacksC1573o s02 = this.f16792c.s0(bundle, str);
                    if (s02 != null) {
                        while (this.f16796g.size() <= parseInt) {
                            this.f16796g.add(null);
                        }
                        s02.setMenuVisibility(false);
                        this.f16796g.set(parseInt, s02);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable k() {
        Bundle bundle;
        if (this.f16795f.size() > 0) {
            bundle = new Bundle();
            ComponentCallbacksC1573o.C0289o[] c0289oArr = new ComponentCallbacksC1573o.C0289o[this.f16795f.size()];
            this.f16795f.toArray(c0289oArr);
            bundle.putParcelableArray("states", c0289oArr);
        } else {
            bundle = null;
        }
        for (int i10 = 0; i10 < this.f16796g.size(); i10++) {
            ComponentCallbacksC1573o componentCallbacksC1573o = (ComponentCallbacksC1573o) this.f16796g.get(i10);
            if (componentCallbacksC1573o != null && componentCallbacksC1573o.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f16792c.i1(bundle, "f" + i10, componentCallbacksC1573o);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.a
    public void l(ViewGroup viewGroup, int i10, Object obj) {
        ComponentCallbacksC1573o componentCallbacksC1573o = (ComponentCallbacksC1573o) obj;
        ComponentCallbacksC1573o componentCallbacksC1573o2 = this.f16797h;
        if (componentCallbacksC1573o != componentCallbacksC1573o2) {
            if (componentCallbacksC1573o2 != null) {
                componentCallbacksC1573o2.setMenuVisibility(false);
                if (this.f16793d == 1) {
                    if (this.f16794e == null) {
                        this.f16794e = this.f16792c.n();
                    }
                    this.f16794e.s(this.f16797h, AbstractC1592i.b.STARTED);
                } else {
                    this.f16797h.setUserVisibleHint(false);
                }
            }
            componentCallbacksC1573o.setMenuVisibility(true);
            if (this.f16793d == 1) {
                if (this.f16794e == null) {
                    this.f16794e = this.f16792c.n();
                }
                this.f16794e.s(componentCallbacksC1573o, AbstractC1592i.b.RESUMED);
            } else {
                componentCallbacksC1573o.setUserVisibleHint(true);
            }
            this.f16797h = componentCallbacksC1573o;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void n(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract ComponentCallbacksC1573o p(int i10);
}
