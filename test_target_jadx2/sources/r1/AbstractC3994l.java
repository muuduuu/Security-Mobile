package r1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.AbstractC1484a0;
import j0.C3476a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* renamed from: r1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3994l implements Cloneable {

    /* renamed from: G, reason: collision with root package name */
    private static final int[] f39042G = {2, 1, 3, 4};

    /* renamed from: H, reason: collision with root package name */
    private static final AbstractC3989g f39043H = new a();

    /* renamed from: I, reason: collision with root package name */
    private static ThreadLocal f39044I = new ThreadLocal();

    /* renamed from: D, reason: collision with root package name */
    private e f39048D;

    /* renamed from: E, reason: collision with root package name */
    private C3476a f39049E;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList f39070t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList f39071u;

    /* renamed from: a, reason: collision with root package name */
    private String f39051a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    private long f39052b = -1;

    /* renamed from: c, reason: collision with root package name */
    long f39053c = -1;

    /* renamed from: d, reason: collision with root package name */
    private TimeInterpolator f39054d = null;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f39055e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    ArrayList f39056f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f39057g = null;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f39058h = null;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f39059i = null;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f39060j = null;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f39061k = null;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList f39062l = null;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f39063m = null;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f39064n = null;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList f39065o = null;

    /* renamed from: p, reason: collision with root package name */
    private t f39066p = new t();

    /* renamed from: q, reason: collision with root package name */
    private t f39067q = new t();

    /* renamed from: r, reason: collision with root package name */
    C3998p f39068r = null;

    /* renamed from: s, reason: collision with root package name */
    private int[] f39069s = f39042G;

    /* renamed from: v, reason: collision with root package name */
    private ViewGroup f39072v = null;

    /* renamed from: w, reason: collision with root package name */
    boolean f39073w = false;

    /* renamed from: x, reason: collision with root package name */
    ArrayList f39074x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    private int f39075y = 0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f39076z = false;

    /* renamed from: A, reason: collision with root package name */
    private boolean f39045A = false;

    /* renamed from: B, reason: collision with root package name */
    private ArrayList f39046B = null;

    /* renamed from: C, reason: collision with root package name */
    private ArrayList f39047C = new ArrayList();

    /* renamed from: F, reason: collision with root package name */
    private AbstractC3989g f39050F = f39043H;

    /* renamed from: r1.l$a */
    static class a extends AbstractC3989g {
        a() {
        }

        @Override // r1.AbstractC3989g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* renamed from: r1.l$b */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3476a f39077a;

        b(C3476a c3476a) {
            this.f39077a = c3476a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f39077a.remove(animator);
            AbstractC3994l.this.f39074x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC3994l.this.f39074x.add(animator);
        }
    }

    /* renamed from: r1.l$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3994l.this.w();
            animator.removeListener(this);
        }
    }

    /* renamed from: r1.l$d */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        View f39080a;

        /* renamed from: b, reason: collision with root package name */
        String f39081b;

        /* renamed from: c, reason: collision with root package name */
        s f39082c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC3982P f39083d;

        /* renamed from: e, reason: collision with root package name */
        AbstractC3994l f39084e;

        d(View view, String str, AbstractC3994l abstractC3994l, InterfaceC3982P interfaceC3982P, s sVar) {
            this.f39080a = view;
            this.f39081b = str;
            this.f39082c = sVar;
            this.f39083d = interfaceC3982P;
            this.f39084e = abstractC3994l;
        }
    }

    /* renamed from: r1.l$e */
    public static abstract class e {
    }

    /* renamed from: r1.l$f */
    public interface f {
        void a(AbstractC3994l abstractC3994l);

        void b(AbstractC3994l abstractC3994l);

        void c(AbstractC3994l abstractC3994l);

        void d(AbstractC3994l abstractC3994l);

        void e(AbstractC3994l abstractC3994l);
    }

    private static C3476a E() {
        C3476a c3476a = (C3476a) f39044I.get();
        if (c3476a != null) {
            return c3476a;
        }
        C3476a c3476a2 = new C3476a();
        f39044I.set(c3476a2);
        return c3476a2;
    }

    private static boolean Q(s sVar, s sVar2, String str) {
        Object obj = sVar.f39103a.get(str);
        Object obj2 = sVar2.f39103a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void R(C3476a c3476a, C3476a c3476a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) sparseArray.valueAt(i10);
            if (view2 != null && P(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && P(view)) {
                s sVar = (s) c3476a.get(view2);
                s sVar2 = (s) c3476a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f39070t.add(sVar);
                    this.f39071u.add(sVar2);
                    c3476a.remove(view2);
                    c3476a2.remove(view);
                }
            }
        }
    }

    private void S(C3476a c3476a, C3476a c3476a2) {
        s sVar;
        for (int size = c3476a.size() - 1; size >= 0; size--) {
            View view = (View) c3476a.f(size);
            if (view != null && P(view) && (sVar = (s) c3476a2.remove(view)) != null && P(sVar.f39104b)) {
                this.f39070t.add((s) c3476a.h(size));
                this.f39071u.add(sVar);
            }
        }
    }

    private void T(C3476a c3476a, C3476a c3476a2, j0.f fVar, j0.f fVar2) {
        View view;
        int o10 = fVar.o();
        for (int i10 = 0; i10 < o10; i10++) {
            View view2 = (View) fVar.p(i10);
            if (view2 != null && P(view2) && (view = (View) fVar2.h(fVar.k(i10))) != null && P(view)) {
                s sVar = (s) c3476a.get(view2);
                s sVar2 = (s) c3476a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f39070t.add(sVar);
                    this.f39071u.add(sVar2);
                    c3476a.remove(view2);
                    c3476a2.remove(view);
                }
            }
        }
    }

    private void U(C3476a c3476a, C3476a c3476a2, C3476a c3476a3, C3476a c3476a4) {
        View view;
        int size = c3476a3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) c3476a3.j(i10);
            if (view2 != null && P(view2) && (view = (View) c3476a4.get(c3476a3.f(i10))) != null && P(view)) {
                s sVar = (s) c3476a.get(view2);
                s sVar2 = (s) c3476a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f39070t.add(sVar);
                    this.f39071u.add(sVar2);
                    c3476a.remove(view2);
                    c3476a2.remove(view);
                }
            }
        }
    }

    private void V(t tVar, t tVar2) {
        C3476a c3476a = new C3476a(tVar.f39106a);
        C3476a c3476a2 = new C3476a(tVar2.f39106a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f39069s;
            if (i10 >= iArr.length) {
                d(c3476a, c3476a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                S(c3476a, c3476a2);
            } else if (i11 == 2) {
                U(c3476a, c3476a2, tVar.f39109d, tVar2.f39109d);
            } else if (i11 == 3) {
                R(c3476a, c3476a2, tVar.f39107b, tVar2.f39107b);
            } else if (i11 == 4) {
                T(c3476a, c3476a2, tVar.f39108c, tVar2.f39108c);
            }
            i10++;
        }
    }

    private void b0(Animator animator, C3476a c3476a) {
        if (animator != null) {
            animator.addListener(new b(c3476a));
            i(animator);
        }
    }

    private void d(C3476a c3476a, C3476a c3476a2) {
        for (int i10 = 0; i10 < c3476a.size(); i10++) {
            s sVar = (s) c3476a.j(i10);
            if (P(sVar.f39104b)) {
                this.f39070t.add(sVar);
                this.f39071u.add(null);
            }
        }
        for (int i11 = 0; i11 < c3476a2.size(); i11++) {
            s sVar2 = (s) c3476a2.j(i11);
            if (P(sVar2.f39104b)) {
                this.f39071u.add(sVar2);
                this.f39070t.add(null);
            }
        }
    }

    private static void h(t tVar, View view, s sVar) {
        tVar.f39106a.put(view, sVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (tVar.f39107b.indexOfKey(id2) >= 0) {
                tVar.f39107b.put(id2, null);
            } else {
                tVar.f39107b.put(id2, view);
            }
        }
        String J10 = AbstractC1484a0.J(view);
        if (J10 != null) {
            if (tVar.f39109d.containsKey(J10)) {
                tVar.f39109d.put(J10, null);
            } else {
                tVar.f39109d.put(J10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f39108c.i(itemIdAtPosition) < 0) {
                    AbstractC1484a0.A0(view, true);
                    tVar.f39108c.l(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) tVar.f39108c.h(itemIdAtPosition);
                if (view2 != null) {
                    AbstractC1484a0.A0(view2, false);
                    tVar.f39108c.l(itemIdAtPosition, null);
                }
            }
        }
    }

    private void l(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList arrayList = this.f39059i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList arrayList2 = this.f39060j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f39061k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (((Class) this.f39061k.get(i10)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z10) {
                        n(sVar);
                    } else {
                        k(sVar);
                    }
                    sVar.f39105c.add(this);
                    m(sVar);
                    if (z10) {
                        h(this.f39066p, view, sVar);
                    } else {
                        h(this.f39067q, view, sVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f39063m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList arrayList5 = this.f39064n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f39065o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (((Class) this.f39065o.get(i11)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                l(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    s A(View view, boolean z10) {
        C3998p c3998p = this.f39068r;
        if (c3998p != null) {
            return c3998p.A(view, z10);
        }
        ArrayList arrayList = z10 ? this.f39070t : this.f39071u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            s sVar = (s) arrayList.get(i10);
            if (sVar == null) {
                return null;
            }
            if (sVar.f39104b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (s) (z10 ? this.f39071u : this.f39070t).get(i10);
        }
        return null;
    }

    public String B() {
        return this.f39051a;
    }

    public AbstractC3989g C() {
        return this.f39050F;
    }

    public AbstractC3997o D() {
        return null;
    }

    public long G() {
        return this.f39052b;
    }

    public List H() {
        return this.f39055e;
    }

    public List J() {
        return this.f39057g;
    }

    public List K() {
        return this.f39058h;
    }

    public List L() {
        return this.f39056f;
    }

    public String[] M() {
        return null;
    }

    public s N(View view, boolean z10) {
        C3998p c3998p = this.f39068r;
        if (c3998p != null) {
            return c3998p.N(view, z10);
        }
        return (s) (z10 ? this.f39066p : this.f39067q).f39106a.get(view);
    }

    public boolean O(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] M10 = M();
        if (M10 == null) {
            Iterator it = sVar.f39103a.keySet().iterator();
            while (it.hasNext()) {
                if (Q(sVar, sVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : M10) {
            if (!Q(sVar, sVar2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean P(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id2 = view.getId();
        ArrayList arrayList3 = this.f39059i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList arrayList4 = this.f39060j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f39061k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Class) this.f39061k.get(i10)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f39062l != null && AbstractC1484a0.J(view) != null && this.f39062l.contains(AbstractC1484a0.J(view))) {
            return false;
        }
        if ((this.f39055e.size() == 0 && this.f39056f.size() == 0 && (((arrayList = this.f39058h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f39057g) == null || arrayList2.isEmpty()))) || this.f39055e.contains(Integer.valueOf(id2)) || this.f39056f.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f39057g;
        if (arrayList6 != null && arrayList6.contains(AbstractC1484a0.J(view))) {
            return true;
        }
        if (this.f39058h != null) {
            for (int i11 = 0; i11 < this.f39058h.size(); i11++) {
                if (((Class) this.f39058h.get(i11)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void W(View view) {
        if (this.f39045A) {
            return;
        }
        C3476a E10 = E();
        int size = E10.size();
        InterfaceC3982P d10 = AbstractC3967A.d(view);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            d dVar = (d) E10.j(i10);
            if (dVar.f39080a != null && d10.equals(dVar.f39083d)) {
                AbstractC3983a.b((Animator) E10.f(i10));
            }
        }
        ArrayList arrayList = this.f39046B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f39046B.clone();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((f) arrayList2.get(i11)).e(this);
            }
        }
        this.f39076z = true;
    }

    void X(ViewGroup viewGroup) {
        d dVar;
        this.f39070t = new ArrayList();
        this.f39071u = new ArrayList();
        V(this.f39066p, this.f39067q);
        C3476a E10 = E();
        int size = E10.size();
        InterfaceC3982P d10 = AbstractC3967A.d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = (Animator) E10.f(i10);
            if (animator != null && (dVar = (d) E10.get(animator)) != null && dVar.f39080a != null && d10.equals(dVar.f39083d)) {
                s sVar = dVar.f39082c;
                View view = dVar.f39080a;
                s N10 = N(view, true);
                s A10 = A(view, true);
                if (N10 == null && A10 == null) {
                    A10 = (s) this.f39067q.f39106a.get(view);
                }
                if ((N10 != null || A10 != null) && dVar.f39084e.O(sVar, A10)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        E10.remove(animator);
                    }
                }
            }
        }
        v(viewGroup, this.f39066p, this.f39067q, this.f39070t, this.f39071u);
        c0();
    }

    public AbstractC3994l Y(f fVar) {
        ArrayList arrayList = this.f39046B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f39046B.size() == 0) {
            this.f39046B = null;
        }
        return this;
    }

    public AbstractC3994l Z(View view) {
        this.f39056f.remove(view);
        return this;
    }

    public AbstractC3994l a(f fVar) {
        if (this.f39046B == null) {
            this.f39046B = new ArrayList();
        }
        this.f39046B.add(fVar);
        return this;
    }

    public void a0(View view) {
        if (this.f39076z) {
            if (!this.f39045A) {
                C3476a E10 = E();
                int size = E10.size();
                InterfaceC3982P d10 = AbstractC3967A.d(view);
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    d dVar = (d) E10.j(i10);
                    if (dVar.f39080a != null && d10.equals(dVar.f39083d)) {
                        AbstractC3983a.c((Animator) E10.f(i10));
                    }
                }
                ArrayList arrayList = this.f39046B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f39046B.clone();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((f) arrayList2.get(i11)).c(this);
                    }
                }
            }
            this.f39076z = false;
        }
    }

    public AbstractC3994l b(View view) {
        this.f39056f.add(view);
        return this;
    }

    protected void c0() {
        j0();
        C3476a E10 = E();
        Iterator it = this.f39047C.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (E10.containsKey(animator)) {
                j0();
                b0(animator, E10);
            }
        }
        this.f39047C.clear();
        w();
    }

    protected void cancel() {
        for (int size = this.f39074x.size() - 1; size >= 0; size--) {
            ((Animator) this.f39074x.get(size)).cancel();
        }
        ArrayList arrayList = this.f39046B;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f39046B.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((f) arrayList2.get(i10)).d(this);
        }
    }

    public AbstractC3994l d0(long j10) {
        this.f39053c = j10;
        return this;
    }

    public void e0(e eVar) {
        this.f39048D = eVar;
    }

    public AbstractC3994l f0(TimeInterpolator timeInterpolator) {
        this.f39054d = timeInterpolator;
        return this;
    }

    public void g0(AbstractC3989g abstractC3989g) {
        if (abstractC3989g == null) {
            this.f39050F = f39043H;
        } else {
            this.f39050F = abstractC3989g;
        }
    }

    protected void i(Animator animator) {
        if (animator == null) {
            w();
            return;
        }
        if (x() >= 0) {
            animator.setDuration(x());
        }
        if (G() >= 0) {
            animator.setStartDelay(G() + animator.getStartDelay());
        }
        if (z() != null) {
            animator.setInterpolator(z());
        }
        animator.addListener(new c());
        animator.start();
    }

    public AbstractC3994l i0(long j10) {
        this.f39052b = j10;
        return this;
    }

    protected void j0() {
        if (this.f39075y == 0) {
            ArrayList arrayList = this.f39046B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f39046B.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).b(this);
                }
            }
            this.f39045A = false;
        }
        this.f39075y++;
    }

    public abstract void k(s sVar);

    String k0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f39053c != -1) {
            str2 = str2 + "dur(" + this.f39053c + ") ";
        }
        if (this.f39052b != -1) {
            str2 = str2 + "dly(" + this.f39052b + ") ";
        }
        if (this.f39054d != null) {
            str2 = str2 + "interp(" + this.f39054d + ") ";
        }
        if (this.f39055e.size() <= 0 && this.f39056f.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f39055e.size() > 0) {
            for (int i10 = 0; i10 < this.f39055e.size(); i10++) {
                if (i10 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f39055e.get(i10);
            }
        }
        if (this.f39056f.size() > 0) {
            for (int i11 = 0; i11 < this.f39056f.size(); i11++) {
                if (i11 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f39056f.get(i11);
            }
        }
        return str3 + ")";
    }

    public abstract void n(s sVar);

    void o(ViewGroup viewGroup, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C3476a c3476a;
        p(z10);
        if ((this.f39055e.size() > 0 || this.f39056f.size() > 0) && (((arrayList = this.f39057g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f39058h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f39055e.size(); i10++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f39055e.get(i10)).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z10) {
                        n(sVar);
                    } else {
                        k(sVar);
                    }
                    sVar.f39105c.add(this);
                    m(sVar);
                    if (z10) {
                        h(this.f39066p, findViewById, sVar);
                    } else {
                        h(this.f39067q, findViewById, sVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f39056f.size(); i11++) {
                View view = (View) this.f39056f.get(i11);
                s sVar2 = new s(view);
                if (z10) {
                    n(sVar2);
                } else {
                    k(sVar2);
                }
                sVar2.f39105c.add(this);
                m(sVar2);
                if (z10) {
                    h(this.f39066p, view, sVar2);
                } else {
                    h(this.f39067q, view, sVar2);
                }
            }
        } else {
            l(viewGroup, z10);
        }
        if (z10 || (c3476a = this.f39049E) == null) {
            return;
        }
        int size = c3476a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.f39066p.f39109d.remove((String) this.f39049E.f(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f39066p.f39109d.put((String) this.f39049E.j(i13), view2);
            }
        }
    }

    void p(boolean z10) {
        if (z10) {
            this.f39066p.f39106a.clear();
            this.f39066p.f39107b.clear();
            this.f39066p.f39108c.a();
        } else {
            this.f39067q.f39106a.clear();
            this.f39067q.f39107b.clear();
            this.f39067q.f39108c.a();
        }
    }

    @Override // 
    /* renamed from: q */
    public AbstractC3994l clone() {
        try {
            AbstractC3994l abstractC3994l = (AbstractC3994l) super.clone();
            abstractC3994l.f39047C = new ArrayList();
            abstractC3994l.f39066p = new t();
            abstractC3994l.f39067q = new t();
            abstractC3994l.f39070t = null;
            abstractC3994l.f39071u = null;
            return abstractC3994l;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator s(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    public String toString() {
        return k0(BuildConfig.FLAVOR);
    }

    protected void v(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        s sVar;
        int i10;
        Animator animator2;
        s sVar2;
        C3476a E10 = E();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            s sVar3 = (s) arrayList.get(i11);
            s sVar4 = (s) arrayList2.get(i11);
            if (sVar3 != null && !sVar3.f39105c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f39105c.contains(this)) {
                sVar4 = null;
            }
            if ((sVar3 != null || sVar4 != null) && (sVar3 == null || sVar4 == null || O(sVar3, sVar4))) {
                Animator s10 = s(viewGroup, sVar3, sVar4);
                if (s10 != null) {
                    if (sVar4 != null) {
                        View view2 = sVar4.f39104b;
                        String[] M10 = M();
                        if (M10 != null && M10.length > 0) {
                            sVar2 = new s(view2);
                            s sVar5 = (s) tVar2.f39106a.get(view2);
                            if (sVar5 != null) {
                                int i12 = 0;
                                while (i12 < M10.length) {
                                    Map map = sVar2.f39103a;
                                    Animator animator3 = s10;
                                    String str = M10[i12];
                                    map.put(str, sVar5.f39103a.get(str));
                                    i12++;
                                    s10 = animator3;
                                    M10 = M10;
                                }
                            }
                            Animator animator4 = s10;
                            int size2 = E10.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                d dVar = (d) E10.get((Animator) E10.f(i13));
                                if (dVar.f39082c != null && dVar.f39080a == view2 && dVar.f39081b.equals(B()) && dVar.f39082c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            animator2 = s10;
                            sVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        view = sVar3.f39104b;
                        animator = s10;
                        sVar = null;
                    }
                    if (animator != null) {
                        i10 = size;
                        E10.put(animator, new d(view, B(), this, AbstractC3967A.d(viewGroup), sVar));
                        this.f39047C.add(animator);
                        i11++;
                        size = i10;
                    }
                    i10 = size;
                    i11++;
                    size = i10;
                }
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator5 = (Animator) this.f39047C.get(sparseIntArray.keyAt(i14));
                animator5.setStartDelay((sparseIntArray.valueAt(i14) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    protected void w() {
        int i10 = this.f39075y - 1;
        this.f39075y = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f39046B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f39046B.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).a(this);
                }
            }
            for (int i12 = 0; i12 < this.f39066p.f39108c.o(); i12++) {
                View view = (View) this.f39066p.f39108c.p(i12);
                if (view != null) {
                    AbstractC1484a0.A0(view, false);
                }
            }
            for (int i13 = 0; i13 < this.f39067q.f39108c.o(); i13++) {
                View view2 = (View) this.f39067q.f39108c.p(i13);
                if (view2 != null) {
                    AbstractC1484a0.A0(view2, false);
                }
            }
            this.f39045A = true;
        }
    }

    public long x() {
        return this.f39053c;
    }

    public e y() {
        return this.f39048D;
    }

    public TimeInterpolator z() {
        return this.f39054d;
    }

    public void h0(AbstractC3997o abstractC3997o) {
    }

    void m(s sVar) {
    }
}
