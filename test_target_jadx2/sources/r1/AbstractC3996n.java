package r1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC1484a0;
import j0.C3476a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: r1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3996n {

    /* renamed from: a, reason: collision with root package name */
    private static AbstractC3994l f39085a = new C3984b();

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal f39086b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    static ArrayList f39087c = new ArrayList();

    public static void a(ViewGroup viewGroup, AbstractC3994l abstractC3994l) {
        if (f39087c.contains(viewGroup) || !AbstractC1484a0.U(viewGroup)) {
            return;
        }
        f39087c.add(viewGroup);
        if (abstractC3994l == null) {
            abstractC3994l = f39085a;
        }
        AbstractC3994l clone = abstractC3994l.clone();
        d(viewGroup, clone);
        AbstractC3993k.b(viewGroup, null);
        c(viewGroup, clone);
    }

    static C3476a b() {
        C3476a c3476a;
        WeakReference weakReference = (WeakReference) f39086b.get();
        if (weakReference != null && (c3476a = (C3476a) weakReference.get()) != null) {
            return c3476a;
        }
        C3476a c3476a2 = new C3476a();
        f39086b.set(new WeakReference(c3476a2));
        return c3476a2;
    }

    private static void c(ViewGroup viewGroup, AbstractC3994l abstractC3994l) {
        if (abstractC3994l == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC3994l, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, AbstractC3994l abstractC3994l) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC3994l) it.next()).W(viewGroup);
            }
        }
        if (abstractC3994l != null) {
            abstractC3994l.o(viewGroup, true);
        }
        AbstractC3993k.a(viewGroup);
    }

    /* renamed from: r1.n$a */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        AbstractC3994l f39088a;

        /* renamed from: b, reason: collision with root package name */
        ViewGroup f39089b;

        /* renamed from: r1.n$a$a, reason: collision with other inner class name */
        class C0602a extends AbstractC3995m {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3476a f39090a;

            C0602a(C3476a c3476a) {
                this.f39090a = c3476a;
            }

            @Override // r1.AbstractC3994l.f
            public void a(AbstractC3994l abstractC3994l) {
                ((ArrayList) this.f39090a.get(a.this.f39089b)).remove(abstractC3994l);
                abstractC3994l.Y(this);
            }
        }

        a(AbstractC3994l abstractC3994l, ViewGroup viewGroup) {
            this.f39088a = abstractC3994l;
            this.f39089b = viewGroup;
        }

        private void a() {
            this.f39089b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f39089b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!AbstractC3996n.f39087c.remove(this.f39089b)) {
                return true;
            }
            C3476a b10 = AbstractC3996n.b();
            ArrayList arrayList = (ArrayList) b10.get(this.f39089b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b10.put(this.f39089b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f39088a);
            this.f39088a.a(new C0602a(b10));
            this.f39088a.o(this.f39089b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC3994l) it.next()).a0(this.f39089b);
                }
            }
            this.f39088a.X(this.f39089b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            AbstractC3996n.f39087c.remove(this.f39089b);
            ArrayList arrayList = (ArrayList) AbstractC3996n.b().get(this.f39089b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC3994l) it.next()).a0(this.f39089b);
                }
            }
            this.f39088a.p(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
