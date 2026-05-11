package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.f;
import com.facebook.react.uimanager.C1944g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f29413a = new i();

    private i() {
    }

    private final void j(final View view) {
        view.post(new Runnable() { // from class: com.reactnativepagerview.f
            @Override // java.lang.Runnable
            public final void run() {
                i.k(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(View view) {
        Intrinsics.checkNotNullParameter(view, "$view");
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(androidx.viewpager2.widget.f pager) {
        Intrinsics.checkNotNullParameter(pager, "$pager");
        pager.invalidate();
        pager.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(b host) {
        Intrinsics.checkNotNullParameter(host, "$host");
        host.setDidSetInitialIndex(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(int i10, androidx.viewpager2.widget.f pager, View page, float f10) {
        Intrinsics.checkNotNullParameter(pager, "$pager");
        Intrinsics.checkNotNullParameter(page, "page");
        float f11 = i10 * f10;
        if (pager.getOrientation() != 0) {
            page.setTranslationY(f11);
            return;
        }
        if (pager.getLayoutDirection() == 1) {
            f11 = -f11;
        }
        page.setTranslationX(f11);
    }

    public final void e(b host, View view, int i10) {
        Integer initialIndex;
        Intrinsics.checkNotNullParameter(host, "host");
        if (view == null) {
            return;
        }
        androidx.viewpager2.widget.f h10 = h(host);
        j jVar = (j) h10.getAdapter();
        if (jVar != null) {
            jVar.A(view, i10);
        }
        if (h10.getCurrentItem() == i10) {
            j(h10);
        }
        if (host.getDidSetInitialIndex() || (initialIndex = host.getInitialIndex()) == null || initialIndex.intValue() != i10) {
            return;
        }
        host.setDidSetInitialIndex(true);
        p(h10, i10, false);
    }

    public final View f(b parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        j jVar = (j) h(parent).getAdapter();
        Intrinsics.d(jVar);
        return jVar.B(i10);
    }

    public final int g(b parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView.h adapter = h(parent).getAdapter();
        if (adapter != null) {
            return adapter.e();
        }
        return 0;
    }

    public final androidx.viewpager2.widget.f h(b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!(view.getChildAt(0) instanceof androidx.viewpager2.widget.f)) {
            throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
        }
        View childAt = view.getChildAt(0);
        Intrinsics.e(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        return (androidx.viewpager2.widget.f) childAt;
    }

    public final boolean i() {
        return true;
    }

    public final void l(b parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        androidx.viewpager2.widget.f h10 = h(parent);
        h10.setUserInputEnabled(false);
        j jVar = (j) h10.getAdapter();
        if (jVar != null) {
            jVar.E();
        }
    }

    public final void m(b parent, View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        androidx.viewpager2.widget.f h10 = h(parent);
        j jVar = (j) h10.getAdapter();
        if (jVar != null) {
            jVar.F(view);
        }
        j(h10);
    }

    public final void n(b parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        final androidx.viewpager2.widget.f h10 = h(parent);
        j jVar = (j) h10.getAdapter();
        View B10 = jVar != null ? jVar.B(i10) : null;
        if (B10 != null && B10.getParent() != null) {
            ViewParent parent2 = B10.getParent();
            ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup != null) {
                viewGroup.removeView(B10);
            }
        }
        if (jVar != null) {
            jVar.G(i10);
        }
        h10.post(new Runnable() { // from class: com.reactnativepagerview.g
            @Override // java.lang.Runnable
            public final void run() {
                i.o(androidx.viewpager2.widget.f.this);
            }
        });
    }

    public final void p(androidx.viewpager2.widget.f view, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        j(view);
        view.j(i10, z10);
    }

    public final void q(final b host, int i10) {
        Intrinsics.checkNotNullParameter(host, "host");
        androidx.viewpager2.widget.f h10 = h(host);
        if (host.getInitialIndex() == null) {
            host.setInitialIndex(Integer.valueOf(i10));
            h10.post(new Runnable() { // from class: com.reactnativepagerview.h
                @Override // java.lang.Runnable
                public final void run() {
                    i.r(b.this);
                }
            });
        }
    }

    public final void s(b host, String value) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(value, "value");
        androidx.viewpager2.widget.f h10 = h(host);
        if (Intrinsics.b(value, "rtl")) {
            h10.setLayoutDirection(1);
        } else {
            h10.setLayoutDirection(0);
        }
    }

    public final void t(b host, int i10) {
        Intrinsics.checkNotNullParameter(host, "host");
        h(host).setOffscreenPageLimit(i10);
    }

    public final void u(b host, String value) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(value, "value");
        h(host).setOrientation(Intrinsics.b(value, "vertical") ? 1 : 0);
    }

    public final void v(b host, String value) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(value, "value");
        View childAt = h(host).getChildAt(0);
        if (Intrinsics.b(value, "never")) {
            childAt.setOverScrollMode(2);
        } else if (Intrinsics.b(value, "always")) {
            childAt.setOverScrollMode(0);
        } else {
            childAt.setOverScrollMode(1);
        }
    }

    public final void w(b host, int i10) {
        Intrinsics.checkNotNullParameter(host, "host");
        final androidx.viewpager2.widget.f h10 = h(host);
        final int f10 = (int) C1944g0.f(i10);
        h10.setPageTransformer(new f.k() { // from class: com.reactnativepagerview.e
            @Override // androidx.viewpager2.widget.f.k
            public final void a(View view, float f11) {
                i.x(f10, h10, view, f11);
            }
        });
    }

    public final void y(b host, boolean z10) {
        Intrinsics.checkNotNullParameter(host, "host");
        h(host).setUserInputEnabled(z10);
    }
}
