package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1483a;
import java.util.Map;
import java.util.WeakHashMap;
import z0.C5228A;
import z0.C5229B;

/* loaded from: classes.dex */
public class l extends C1483a {

    /* renamed from: d, reason: collision with root package name */
    final RecyclerView f17737d;

    /* renamed from: e, reason: collision with root package name */
    private final a f17738e;

    public static class a extends C1483a {

        /* renamed from: d, reason: collision with root package name */
        final l f17739d;

        /* renamed from: e, reason: collision with root package name */
        private Map f17740e = new WeakHashMap();

        public a(l lVar) {
            this.f17739d = lVar;
        }

        @Override // androidx.core.view.C1483a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C1483a c1483a = (C1483a) this.f17740e.get(view);
            return c1483a != null ? c1483a.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1483a
        public C5229B b(View view) {
            C1483a c1483a = (C1483a) this.f17740e.get(view);
            return c1483a != null ? c1483a.b(view) : super.b(view);
        }

        @Override // androidx.core.view.C1483a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            C1483a c1483a = (C1483a) this.f17740e.get(view);
            if (c1483a != null) {
                c1483a.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1483a
        public void g(View view, C5228A c5228a) {
            if (this.f17739d.o() || this.f17739d.f17737d.getLayoutManager() == null) {
                super.g(view, c5228a);
                return;
            }
            this.f17739d.f17737d.getLayoutManager().O0(view, c5228a);
            C1483a c1483a = (C1483a) this.f17740e.get(view);
            if (c1483a != null) {
                c1483a.g(view, c5228a);
            } else {
                super.g(view, c5228a);
            }
        }

        @Override // androidx.core.view.C1483a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            C1483a c1483a = (C1483a) this.f17740e.get(view);
            if (c1483a != null) {
                c1483a.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1483a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1483a c1483a = (C1483a) this.f17740e.get(viewGroup);
            return c1483a != null ? c1483a.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1483a
        public boolean j(View view, int i10, Bundle bundle) {
            if (this.f17739d.o() || this.f17739d.f17737d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            C1483a c1483a = (C1483a) this.f17740e.get(view);
            if (c1483a != null) {
                if (c1483a.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f17739d.f17737d.getLayoutManager().i1(view, i10, bundle);
        }

        @Override // androidx.core.view.C1483a
        public void l(View view, int i10) {
            C1483a c1483a = (C1483a) this.f17740e.get(view);
            if (c1483a != null) {
                c1483a.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // androidx.core.view.C1483a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            C1483a c1483a = (C1483a) this.f17740e.get(view);
            if (c1483a != null) {
                c1483a.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        C1483a n(View view) {
            return (C1483a) this.f17740e.remove(view);
        }

        void o(View view) {
            C1483a l10 = AbstractC1484a0.l(view);
            if (l10 == null || l10 == this) {
                return;
            }
            this.f17740e.put(view, l10);
        }
    }

    public l(RecyclerView recyclerView) {
        this.f17737d = recyclerView;
        C1483a n10 = n();
        if (n10 == null || !(n10 instanceof a)) {
            this.f17738e = new a(this);
        } else {
            this.f17738e = (a) n10;
        }
    }

    @Override // androidx.core.view.C1483a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().K0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C1483a
    public void g(View view, C5228A c5228a) {
        super.g(view, c5228a);
        if (o() || this.f17737d.getLayoutManager() == null) {
            return;
        }
        this.f17737d.getLayoutManager().N0(c5228a);
    }

    @Override // androidx.core.view.C1483a
    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f17737d.getLayoutManager() == null) {
            return false;
        }
        return this.f17737d.getLayoutManager().g1(i10, bundle);
    }

    public C1483a n() {
        return this.f17738e;
    }

    boolean o() {
        return this.f17737d.t0();
    }
}
