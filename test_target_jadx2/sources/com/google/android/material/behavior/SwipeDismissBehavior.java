package com.google.android.material.behavior;

import G0.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1484a0;
import z0.C5228A;
import z0.InterfaceC5231D;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    G0.c f26615a;

    /* renamed from: b, reason: collision with root package name */
    c f26616b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26617c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f26619e;

    /* renamed from: d, reason: collision with root package name */
    private float f26618d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    int f26620f = 2;

    /* renamed from: g, reason: collision with root package name */
    float f26621g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    float f26622h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    float f26623i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    private final c.AbstractC0063c f26624j = new a();

    class a extends c.AbstractC0063c {

        /* renamed from: a, reason: collision with root package name */
        private int f26625a;

        /* renamed from: b, reason: collision with root package name */
        private int f26626b = -1;

        a() {
        }

        private boolean n(View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f26625a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f26621g);
            }
            boolean z10 = AbstractC1484a0.A(view) == 1;
            int i10 = SwipeDismissBehavior.this.f26620f;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                if (z10) {
                    if (f10 >= 0.0f) {
                        return false;
                    }
                } else if (f10 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            if (z10) {
                if (f10 <= 0.0f) {
                    return false;
                }
            } else if (f10 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // G0.c.AbstractC0063c
        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = AbstractC1484a0.A(view) == 1;
            int i12 = SwipeDismissBehavior.this.f26620f;
            if (i12 == 0) {
                if (z10) {
                    width = this.f26625a - view.getWidth();
                    width2 = this.f26625a;
                } else {
                    width = this.f26625a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f26625a - view.getWidth();
                width2 = view.getWidth() + this.f26625a;
            } else if (z10) {
                width = this.f26625a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f26625a - view.getWidth();
                width2 = this.f26625a;
            }
            return SwipeDismissBehavior.G(width, i10, width2);
        }

        @Override // G0.c.AbstractC0063c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // G0.c.AbstractC0063c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // G0.c.AbstractC0063c
        public void i(View view, int i10) {
            this.f26626b = i10;
            this.f26625a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // G0.c.AbstractC0063c
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f26616b;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // G0.c.AbstractC0063c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = this.f26625a + (view.getWidth() * SwipeDismissBehavior.this.f26622h);
            float width2 = this.f26625a + (view.getWidth() * SwipeDismissBehavior.this.f26623i);
            float f10 = i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f10), 1.0f));
            }
        }

        @Override // G0.c.AbstractC0063c
        public void l(View view, float f10, float f11) {
            int i10;
            boolean z10;
            c cVar;
            this.f26626b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                int left = view.getLeft();
                int i11 = this.f26625a;
                i10 = left < i11 ? i11 - width : i11 + width;
                z10 = true;
            } else {
                i10 = this.f26625a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f26615a.O(i10, view.getTop())) {
                AbstractC1484a0.i0(view, new d(view, z10));
            } else {
                if (!z10 || (cVar = SwipeDismissBehavior.this.f26616b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // G0.c.AbstractC0063c
        public boolean m(View view, int i10) {
            int i11 = this.f26626b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.E(view);
        }
    }

    class b implements InterfaceC5231D {
        b() {
        }

        @Override // z0.InterfaceC5231D
        public boolean a(View view, InterfaceC5231D.a aVar) {
            if (!SwipeDismissBehavior.this.E(view)) {
                return false;
            }
            boolean z10 = AbstractC1484a0.A(view) == 1;
            int i10 = SwipeDismissBehavior.this.f26620f;
            AbstractC1484a0.a0(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f26616b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i10);
    }

    private class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final View f26629a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26630b;

        d(View view, boolean z10) {
            this.f26629a = view;
            this.f26630b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            G0.c cVar2 = SwipeDismissBehavior.this.f26615a;
            if (cVar2 != null && cVar2.m(true)) {
                AbstractC1484a0.i0(this.f26629a, this);
            } else {
                if (!this.f26630b || (cVar = SwipeDismissBehavior.this.f26616b) == null) {
                    return;
                }
                cVar.a(this.f26629a);
            }
        }
    }

    static float F(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int G(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void H(ViewGroup viewGroup) {
        if (this.f26615a == null) {
            this.f26615a = this.f26619e ? G0.c.n(viewGroup, this.f26618d, this.f26624j) : G0.c.o(viewGroup, this.f26624j);
        }
    }

    static float I(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void N(View view) {
        AbstractC1484a0.k0(view, 1048576);
        if (E(view)) {
            AbstractC1484a0.m0(view, C5228A.a.f45643y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        G0.c cVar = this.f26615a;
        if (cVar == null) {
            return false;
        }
        cVar.F(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f10) {
        this.f26623i = F(0.0f, f10, 1.0f);
    }

    public void K(c cVar) {
        this.f26616b = cVar;
    }

    public void L(float f10) {
        this.f26622h = F(0.0f, f10, 1.0f);
    }

    public void M(int i10) {
        this.f26620f = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10 = this.f26617c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.C(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f26617c = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f26617c = false;
        }
        if (!z10) {
            return false;
        }
        H(coordinatorLayout);
        return this.f26615a.P(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean l10 = super.l(coordinatorLayout, view, i10);
        if (AbstractC1484a0.y(view) == 0) {
            AbstractC1484a0.B0(view, 1);
            N(view);
        }
        return l10;
    }
}
