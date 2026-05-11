package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.AbstractC1484a0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c extends n {

    /* renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f17607s;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f17608h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f17609i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f17610j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f17611k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    ArrayList f17612l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    ArrayList f17613m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    ArrayList f17614n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    ArrayList f17615o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    ArrayList f17616p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    ArrayList f17617q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    ArrayList f17618r = new ArrayList();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f17619a;

        a(ArrayList arrayList) {
            this.f17619a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f17619a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.f17653a, jVar.f17654b, jVar.f17655c, jVar.f17656d, jVar.f17657e);
            }
            this.f17619a.clear();
            c.this.f17613m.remove(this.f17619a);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f17621a;

        b(ArrayList arrayList) {
            this.f17621a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f17621a.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f17621a.clear();
            c.this.f17614n.remove(this.f17621a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    class RunnableC0301c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f17623a;

        RunnableC0301c(ArrayList arrayList) {
            this.f17623a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f17623a.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.F) it.next());
            }
            this.f17623a.clear();
            c.this.f17612l.remove(this.f17623a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f17625a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f17626b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f17627c;

        d(RecyclerView.F f10, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f17625a = f10;
            this.f17626b = viewPropertyAnimator;
            this.f17627c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17626b.setListener(null);
            this.f17627c.setAlpha(1.0f);
            c.this.G(this.f17625a);
            c.this.f17617q.remove(this.f17625a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f17625a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f17629a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f17630b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f17631c;

        e(RecyclerView.F f10, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f17629a = f10;
            this.f17630b = view;
            this.f17631c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f17630b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17631c.setListener(null);
            c.this.A(this.f17629a);
            c.this.f17615o.remove(this.f17629a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f17629a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f17633a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17634b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f17635c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f17636d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f17637e;

        f(RecyclerView.F f10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f17633a = f10;
            this.f17634b = i10;
            this.f17635c = view;
            this.f17636d = i11;
            this.f17637e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f17634b != 0) {
                this.f17635c.setTranslationX(0.0f);
            }
            if (this.f17636d != 0) {
                this.f17635c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17637e.setListener(null);
            c.this.E(this.f17633a);
            c.this.f17616p.remove(this.f17633a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f17633a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f17639a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f17640b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f17641c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f17639a = iVar;
            this.f17640b = viewPropertyAnimator;
            this.f17641c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17640b.setListener(null);
            this.f17641c.setAlpha(1.0f);
            this.f17641c.setTranslationX(0.0f);
            this.f17641c.setTranslationY(0.0f);
            c.this.C(this.f17639a.f17647a, true);
            c.this.f17618r.remove(this.f17639a.f17647a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f17639a.f17647a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f17643a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f17644b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f17645c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f17643a = iVar;
            this.f17644b = viewPropertyAnimator;
            this.f17645c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17644b.setListener(null);
            this.f17645c.setAlpha(1.0f);
            this.f17645c.setTranslationX(0.0f);
            this.f17645c.setTranslationY(0.0f);
            c.this.C(this.f17643a.f17648b, false);
            c.this.f17618r.remove(this.f17643a.f17648b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f17643a.f17648b, false);
        }
    }

    private static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f17653a;

        /* renamed from: b, reason: collision with root package name */
        public int f17654b;

        /* renamed from: c, reason: collision with root package name */
        public int f17655c;

        /* renamed from: d, reason: collision with root package name */
        public int f17656d;

        /* renamed from: e, reason: collision with root package name */
        public int f17657e;

        j(RecyclerView.F f10, int i10, int i11, int i12, int i13) {
            this.f17653a = f10;
            this.f17654b = i10;
            this.f17655c = i11;
            this.f17656d = i12;
            this.f17657e = i13;
        }
    }

    private void T(RecyclerView.F f10) {
        View view = f10.f17450a;
        ViewPropertyAnimator animate = view.animate();
        this.f17617q.add(f10);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(f10, animate, view)).start();
    }

    private void W(List list, RecyclerView.F f10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, f10) && iVar.f17647a == null && iVar.f17648b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.F f10 = iVar.f17647a;
        if (f10 != null) {
            Y(iVar, f10);
        }
        RecyclerView.F f11 = iVar.f17648b;
        if (f11 != null) {
            Y(iVar, f11);
        }
    }

    private boolean Y(i iVar, RecyclerView.F f10) {
        boolean z10 = false;
        if (iVar.f17648b == f10) {
            iVar.f17648b = null;
        } else {
            if (iVar.f17647a != f10) {
                return false;
            }
            iVar.f17647a = null;
            z10 = true;
        }
        f10.f17450a.setAlpha(1.0f);
        f10.f17450a.setTranslationX(0.0f);
        f10.f17450a.setTranslationY(0.0f);
        C(f10, z10);
        return true;
    }

    private void Z(RecyclerView.F f10) {
        if (f17607s == null) {
            f17607s = new ValueAnimator().getInterpolator();
        }
        f10.f17450a.animate().setInterpolator(f17607s);
        j(f10);
    }

    void Q(RecyclerView.F f10) {
        View view = f10.f17450a;
        ViewPropertyAnimator animate = view.animate();
        this.f17615o.add(f10);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(f10, view, animate)).start();
    }

    void R(i iVar) {
        RecyclerView.F f10 = iVar.f17647a;
        View view = f10 == null ? null : f10.f17450a;
        RecyclerView.F f11 = iVar.f17648b;
        View view2 = f11 != null ? f11.f17450a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f17618r.add(iVar.f17647a);
            duration.translationX(iVar.f17651e - iVar.f17649c);
            duration.translationY(iVar.f17652f - iVar.f17650d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f17618r.add(iVar.f17648b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    void S(RecyclerView.F f10, int i10, int i11, int i12, int i13) {
        View view = f10.f17450a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f17616p.add(f10);
        animate.setDuration(n()).setListener(new f(f10, i14, view, i15, animate)).start();
    }

    void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.F) list.get(size)).f17450a.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.F f10, List list) {
        return !list.isEmpty() || super.g(f10, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.F f10) {
        View view = f10.f17450a;
        view.animate().cancel();
        int size = this.f17610j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f17610j.get(size)).f17653a == f10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(f10);
                this.f17610j.remove(size);
            }
        }
        W(this.f17611k, f10);
        if (this.f17608h.remove(f10)) {
            view.setAlpha(1.0f);
            G(f10);
        }
        if (this.f17609i.remove(f10)) {
            view.setAlpha(1.0f);
            A(f10);
        }
        for (int size2 = this.f17614n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f17614n.get(size2);
            W(arrayList, f10);
            if (arrayList.isEmpty()) {
                this.f17614n.remove(size2);
            }
        }
        for (int size3 = this.f17613m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f17613m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f17653a == f10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(f10);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f17613m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f17612l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f17612l.get(size5);
            if (arrayList3.remove(f10)) {
                view.setAlpha(1.0f);
                A(f10);
                if (arrayList3.isEmpty()) {
                    this.f17612l.remove(size5);
                }
            }
        }
        this.f17617q.remove(f10);
        this.f17615o.remove(f10);
        this.f17618r.remove(f10);
        this.f17616p.remove(f10);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f17610j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f17610j.get(size);
            View view = jVar.f17653a.f17450a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f17653a);
            this.f17610j.remove(size);
        }
        for (int size2 = this.f17608h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.F) this.f17608h.get(size2));
            this.f17608h.remove(size2);
        }
        int size3 = this.f17609i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.F f10 = (RecyclerView.F) this.f17609i.get(size3);
            f10.f17450a.setAlpha(1.0f);
            A(f10);
            this.f17609i.remove(size3);
        }
        for (int size4 = this.f17611k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f17611k.get(size4));
        }
        this.f17611k.clear();
        if (p()) {
            for (int size5 = this.f17613m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f17613m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f17653a.f17450a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f17653a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f17613m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f17612l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f17612l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.F f11 = (RecyclerView.F) arrayList2.get(size8);
                    f11.f17450a.setAlpha(1.0f);
                    A(f11);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f17612l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f17614n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f17614n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f17614n.remove(arrayList3);
                    }
                }
            }
            U(this.f17617q);
            U(this.f17616p);
            U(this.f17615o);
            U(this.f17618r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f17609i.isEmpty() && this.f17611k.isEmpty() && this.f17610j.isEmpty() && this.f17608h.isEmpty() && this.f17616p.isEmpty() && this.f17617q.isEmpty() && this.f17615o.isEmpty() && this.f17618r.isEmpty() && this.f17613m.isEmpty() && this.f17612l.isEmpty() && this.f17614n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void u() {
        boolean isEmpty = this.f17608h.isEmpty();
        boolean isEmpty2 = this.f17610j.isEmpty();
        boolean isEmpty3 = this.f17611k.isEmpty();
        boolean isEmpty4 = this.f17609i.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        Iterator it = this.f17608h.iterator();
        while (it.hasNext()) {
            T((RecyclerView.F) it.next());
        }
        this.f17608h.clear();
        if (!isEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f17610j);
            this.f17613m.add(arrayList);
            this.f17610j.clear();
            a aVar = new a(arrayList);
            if (isEmpty) {
                aVar.run();
            } else {
                AbstractC1484a0.j0(((j) arrayList.get(0)).f17653a.f17450a, aVar, o());
            }
        }
        if (!isEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f17611k);
            this.f17614n.add(arrayList2);
            this.f17611k.clear();
            b bVar = new b(arrayList2);
            if (isEmpty) {
                bVar.run();
            } else {
                AbstractC1484a0.j0(((i) arrayList2.get(0)).f17647a.f17450a, bVar, o());
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f17609i);
        this.f17612l.add(arrayList3);
        this.f17609i.clear();
        RunnableC0301c runnableC0301c = new RunnableC0301c(arrayList3);
        if (isEmpty && isEmpty2 && isEmpty3) {
            runnableC0301c.run();
        } else {
            AbstractC1484a0.j0(((RecyclerView.F) arrayList3.get(0)).f17450a, runnableC0301c, (!isEmpty ? o() : 0L) + Math.max(!isEmpty2 ? n() : 0L, isEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.n
    public boolean w(RecyclerView.F f10) {
        Z(f10);
        f10.f17450a.setAlpha(0.0f);
        this.f17609i.add(f10);
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean x(RecyclerView.F f10, RecyclerView.F f11, int i10, int i11, int i12, int i13) {
        if (f10 == f11) {
            return y(f10, i10, i11, i12, i13);
        }
        float translationX = f10.f17450a.getTranslationX();
        float translationY = f10.f17450a.getTranslationY();
        float alpha = f10.f17450a.getAlpha();
        Z(f10);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        f10.f17450a.setTranslationX(translationX);
        f10.f17450a.setTranslationY(translationY);
        f10.f17450a.setAlpha(alpha);
        if (f11 != null) {
            Z(f11);
            f11.f17450a.setTranslationX(-i14);
            f11.f17450a.setTranslationY(-i15);
            f11.f17450a.setAlpha(0.0f);
        }
        this.f17611k.add(new i(f10, f11, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean y(RecyclerView.F f10, int i10, int i11, int i12, int i13) {
        View view = f10.f17450a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) f10.f17450a.getTranslationY());
        Z(f10);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(f10);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f17610j.add(new j(f10, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean z(RecyclerView.F f10) {
        Z(f10);
        this.f17608h.add(f10);
        return true;
    }

    private static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f17647a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.F f17648b;

        /* renamed from: c, reason: collision with root package name */
        public int f17649c;

        /* renamed from: d, reason: collision with root package name */
        public int f17650d;

        /* renamed from: e, reason: collision with root package name */
        public int f17651e;

        /* renamed from: f, reason: collision with root package name */
        public int f17652f;

        private i(RecyclerView.F f10, RecyclerView.F f11) {
            this.f17647a = f10;
            this.f17648b = f11;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f17647a + ", newHolder=" + this.f17648b + ", fromX=" + this.f17649c + ", fromY=" + this.f17650d + ", toX=" + this.f17651e + ", toY=" + this.f17652f + '}';
        }

        i(RecyclerView.F f10, RecyclerView.F f11, int i10, int i11, int i12, int i13) {
            this(f10, f11);
            this.f17649c = i10;
            this.f17650d = i11;
            this.f17651e = i12;
            this.f17652f = i13;
        }
    }
}
