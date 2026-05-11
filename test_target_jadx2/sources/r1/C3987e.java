package r1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.T;
import java.util.ArrayList;
import java.util.List;
import r1.AbstractC3994l;

/* renamed from: r1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3987e extends T {

    /* renamed from: r1.e$a */
    class a extends AbstractC3994l.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f39025a;

        a(Rect rect) {
            this.f39025a = rect;
        }
    }

    /* renamed from: r1.e$c */
    class c extends AbstractC3995m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f39030a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f39031b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f39032c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f39033d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f39034e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f39035f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f39030a = obj;
            this.f39031b = arrayList;
            this.f39032c = obj2;
            this.f39033d = arrayList2;
            this.f39034e = obj3;
            this.f39035f = arrayList3;
        }

        @Override // r1.AbstractC3994l.f
        public void a(AbstractC3994l abstractC3994l) {
            abstractC3994l.Y(this);
        }

        @Override // r1.AbstractC3995m, r1.AbstractC3994l.f
        public void b(AbstractC3994l abstractC3994l) {
            Object obj = this.f39030a;
            if (obj != null) {
                C3987e.this.w(obj, this.f39031b, null);
            }
            Object obj2 = this.f39032c;
            if (obj2 != null) {
                C3987e.this.w(obj2, this.f39033d, null);
            }
            Object obj3 = this.f39034e;
            if (obj3 != null) {
                C3987e.this.w(obj3, this.f39035f, null);
            }
        }
    }

    /* renamed from: r1.e$d */
    class d extends AbstractC3994l.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f39037a;

        d(Rect rect) {
            this.f39037a = rect;
        }
    }

    private static boolean v(AbstractC3994l abstractC3994l) {
        return (T.i(abstractC3994l.H()) && T.i(abstractC3994l.J()) && T.i(abstractC3994l.K())) ? false : true;
    }

    @Override // androidx.fragment.app.T
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC3994l) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.T
    public void b(Object obj, ArrayList arrayList) {
        AbstractC3994l abstractC3994l = (AbstractC3994l) obj;
        if (abstractC3994l == null) {
            return;
        }
        int i10 = 0;
        if (abstractC3994l instanceof C3998p) {
            C3998p c3998p = (C3998p) abstractC3994l;
            int q02 = c3998p.q0();
            while (i10 < q02) {
                b(c3998p.p0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (v(abstractC3994l) || !T.i(abstractC3994l.L())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            abstractC3994l.b((View) arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.T
    public void c(ViewGroup viewGroup, Object obj) {
        AbstractC3996n.a(viewGroup, (AbstractC3994l) obj);
    }

    @Override // androidx.fragment.app.T
    public boolean e(Object obj) {
        return obj instanceof AbstractC3994l;
    }

    @Override // androidx.fragment.app.T
    public Object f(Object obj) {
        if (obj != null) {
            return ((AbstractC3994l) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.T
    public Object j(Object obj, Object obj2, Object obj3) {
        AbstractC3994l abstractC3994l = (AbstractC3994l) obj;
        AbstractC3994l abstractC3994l2 = (AbstractC3994l) obj2;
        AbstractC3994l abstractC3994l3 = (AbstractC3994l) obj3;
        if (abstractC3994l != null && abstractC3994l2 != null) {
            abstractC3994l = new C3998p().n0(abstractC3994l).n0(abstractC3994l2).v0(1);
        } else if (abstractC3994l == null) {
            abstractC3994l = abstractC3994l2 != null ? abstractC3994l2 : null;
        }
        if (abstractC3994l3 == null) {
            return abstractC3994l;
        }
        C3998p c3998p = new C3998p();
        if (abstractC3994l != null) {
            c3998p.n0(abstractC3994l);
        }
        c3998p.n0(abstractC3994l3);
        return c3998p;
    }

    @Override // androidx.fragment.app.T
    public Object k(Object obj, Object obj2, Object obj3) {
        C3998p c3998p = new C3998p();
        if (obj != null) {
            c3998p.n0((AbstractC3994l) obj);
        }
        if (obj2 != null) {
            c3998p.n0((AbstractC3994l) obj2);
        }
        if (obj3 != null) {
            c3998p.n0((AbstractC3994l) obj3);
        }
        return c3998p;
    }

    @Override // androidx.fragment.app.T
    public void m(Object obj, View view, ArrayList arrayList) {
        ((AbstractC3994l) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.T
    public void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC3994l) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.T
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC3994l) obj).e0(new d(rect));
        }
    }

    @Override // androidx.fragment.app.T
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((AbstractC3994l) obj).e0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.T
    public void s(Object obj, View view, ArrayList arrayList) {
        C3998p c3998p = (C3998p) obj;
        List L10 = c3998p.L();
        L10.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            T.d(L10, (View) arrayList.get(i10));
        }
        L10.add(view);
        arrayList.add(view);
        b(c3998p, arrayList);
    }

    @Override // androidx.fragment.app.T
    public void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C3998p c3998p = (C3998p) obj;
        if (c3998p != null) {
            c3998p.L().clear();
            c3998p.L().addAll(arrayList2);
            w(c3998p, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.T
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        C3998p c3998p = new C3998p();
        c3998p.n0((AbstractC3994l) obj);
        return c3998p;
    }

    public void w(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC3994l abstractC3994l = (AbstractC3994l) obj;
        int i10 = 0;
        if (abstractC3994l instanceof C3998p) {
            C3998p c3998p = (C3998p) abstractC3994l;
            int q02 = c3998p.q0();
            while (i10 < q02) {
                w(c3998p.p0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (v(abstractC3994l)) {
            return;
        }
        List L10 = abstractC3994l.L();
        if (L10.size() == arrayList.size() && L10.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                abstractC3994l.b((View) arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC3994l.Z((View) arrayList.get(size2));
            }
        }
    }

    /* renamed from: r1.e$b */
    class b implements AbstractC3994l.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f39027a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f39028b;

        b(View view, ArrayList arrayList) {
            this.f39027a = view;
            this.f39028b = arrayList;
        }

        @Override // r1.AbstractC3994l.f
        public void a(AbstractC3994l abstractC3994l) {
            abstractC3994l.Y(this);
            this.f39027a.setVisibility(8);
            int size = this.f39028b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f39028b.get(i10)).setVisibility(0);
            }
        }

        @Override // r1.AbstractC3994l.f
        public void b(AbstractC3994l abstractC3994l) {
        }

        @Override // r1.AbstractC3994l.f
        public void c(AbstractC3994l abstractC3994l) {
        }

        @Override // r1.AbstractC3994l.f
        public void d(AbstractC3994l abstractC3994l) {
        }

        @Override // r1.AbstractC3994l.f
        public void e(AbstractC3994l abstractC3994l) {
        }
    }
}
