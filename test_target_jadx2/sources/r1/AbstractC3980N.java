package r1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import r1.AbstractC3994l;

/* renamed from: r1.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3980N extends AbstractC3994l {

    /* renamed from: K, reason: collision with root package name */
    private static final String[] f38965K = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: J, reason: collision with root package name */
    private int f38966J = 3;

    /* renamed from: r1.N$a */
    class a extends AbstractC3995m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f38967a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f38968b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f38969c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f38967a = viewGroup;
            this.f38968b = view;
            this.f38969c = view2;
        }

        @Override // r1.AbstractC3994l.f
        public void a(AbstractC3994l abstractC3994l) {
            this.f38969c.setTag(AbstractC3991i.f39039a, null);
            x.a(this.f38967a).d(this.f38968b);
            abstractC3994l.Y(this);
        }

        @Override // r1.AbstractC3995m, r1.AbstractC3994l.f
        public void c(AbstractC3994l abstractC3994l) {
            if (this.f38968b.getParent() == null) {
                x.a(this.f38967a).c(this.f38968b);
            } else {
                AbstractC3980N.this.cancel();
            }
        }

        @Override // r1.AbstractC3995m, r1.AbstractC3994l.f
        public void e(AbstractC3994l abstractC3994l) {
            x.a(this.f38967a).d(this.f38968b);
        }
    }

    /* renamed from: r1.N$c */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        boolean f38977a;

        /* renamed from: b, reason: collision with root package name */
        boolean f38978b;

        /* renamed from: c, reason: collision with root package name */
        int f38979c;

        /* renamed from: d, reason: collision with root package name */
        int f38980d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f38981e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f38982f;

        c() {
        }
    }

    private void l0(s sVar) {
        sVar.f39103a.put("android:visibility:visibility", Integer.valueOf(sVar.f39104b.getVisibility()));
        sVar.f39103a.put("android:visibility:parent", sVar.f39104b.getParent());
        int[] iArr = new int[2];
        sVar.f39104b.getLocationOnScreen(iArr);
        sVar.f39103a.put("android:visibility:screenLocation", iArr);
    }

    private c m0(s sVar, s sVar2) {
        c cVar = new c();
        cVar.f38977a = false;
        cVar.f38978b = false;
        if (sVar == null || !sVar.f39103a.containsKey("android:visibility:visibility")) {
            cVar.f38979c = -1;
            cVar.f38981e = null;
        } else {
            cVar.f38979c = ((Integer) sVar.f39103a.get("android:visibility:visibility")).intValue();
            cVar.f38981e = (ViewGroup) sVar.f39103a.get("android:visibility:parent");
        }
        if (sVar2 == null || !sVar2.f39103a.containsKey("android:visibility:visibility")) {
            cVar.f38980d = -1;
            cVar.f38982f = null;
        } else {
            cVar.f38980d = ((Integer) sVar2.f39103a.get("android:visibility:visibility")).intValue();
            cVar.f38982f = (ViewGroup) sVar2.f39103a.get("android:visibility:parent");
        }
        if (sVar != null && sVar2 != null) {
            int i10 = cVar.f38979c;
            int i11 = cVar.f38980d;
            if (i10 == i11 && cVar.f38981e == cVar.f38982f) {
                return cVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    cVar.f38978b = false;
                    cVar.f38977a = true;
                } else if (i11 == 0) {
                    cVar.f38978b = true;
                    cVar.f38977a = true;
                }
            } else if (cVar.f38982f == null) {
                cVar.f38978b = false;
                cVar.f38977a = true;
            } else if (cVar.f38981e == null) {
                cVar.f38978b = true;
                cVar.f38977a = true;
            }
        } else if (sVar == null && cVar.f38980d == 0) {
            cVar.f38978b = true;
            cVar.f38977a = true;
        } else if (sVar2 == null && cVar.f38979c == 0) {
            cVar.f38978b = false;
            cVar.f38977a = true;
        }
        return cVar;
    }

    @Override // r1.AbstractC3994l
    public String[] M() {
        return f38965K;
    }

    @Override // r1.AbstractC3994l
    public boolean O(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f39103a.containsKey("android:visibility:visibility") != sVar.f39103a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c m02 = m0(sVar, sVar2);
        if (m02.f38977a) {
            return m02.f38979c == 0 || m02.f38980d == 0;
        }
        return false;
    }

    @Override // r1.AbstractC3994l
    public void k(s sVar) {
        l0(sVar);
    }

    @Override // r1.AbstractC3994l
    public void n(s sVar) {
        l0(sVar);
    }

    public abstract Animator n0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator o0(ViewGroup viewGroup, s sVar, int i10, s sVar2, int i11) {
        if ((this.f38966J & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f39104b.getParent();
            if (m0(A(view, false), N(view, false)).f38977a) {
                return null;
            }
        }
        return n0(viewGroup, sVar2.f39104b, sVar, sVar2);
    }

    public abstract Animator p0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        if (r10.f39073w != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator q0(ViewGroup viewGroup, s sVar, int i10, s sVar2, int i11) {
        View view;
        boolean z10;
        boolean z11;
        View view2;
        if ((this.f38966J & 2) != 2 || sVar == null) {
            return null;
        }
        View view3 = sVar.f39104b;
        View view4 = sVar2 != null ? sVar2.f39104b : null;
        View view5 = (View) view3.getTag(AbstractC3991i.f39039a);
        if (view5 != null) {
            view2 = null;
            z11 = true;
        } else if (view4 == null || view4.getParent() == null) {
            if (view4 != null) {
                view = null;
                z10 = false;
                if (z10) {
                    if (view3.getParent() != null) {
                        if (view3.getParent() instanceof View) {
                            View view6 = (View) view3.getParent();
                            if (m0(N(view6, true), A(view6, true)).f38977a) {
                                int id2 = view6.getId();
                                if (view6.getParent() == null) {
                                    if (id2 != -1) {
                                        if (viewGroup.findViewById(id2) != null) {
                                        }
                                    }
                                }
                            } else {
                                view4 = r.a(viewGroup, view3, view6);
                            }
                        }
                    }
                    view2 = view;
                    z11 = false;
                    view5 = view3;
                }
                z11 = false;
                View view7 = view;
                view5 = view4;
                view2 = view7;
            }
            view4 = null;
            view = null;
            z10 = true;
            if (z10) {
            }
            z11 = false;
            View view72 = view;
            view5 = view4;
            view2 = view72;
        } else {
            if (i11 == 4 || view3 == view4) {
                view = view4;
                z10 = false;
                view4 = null;
                if (z10) {
                }
                z11 = false;
                View view722 = view;
                view5 = view4;
                view2 = view722;
            }
            view4 = null;
            view = null;
            z10 = true;
            if (z10) {
            }
            z11 = false;
            View view7222 = view;
            view5 = view4;
            view2 = view7222;
        }
        if (view5 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            AbstractC3967A.h(view2, 0);
            Animator p02 = p0(viewGroup, view2, sVar, sVar2);
            if (p02 != null) {
                b bVar = new b(view2, i11, true);
                p02.addListener(bVar);
                AbstractC3983a.a(p02, bVar);
                a(bVar);
            } else {
                AbstractC3967A.h(view2, visibility);
            }
            return p02;
        }
        if (!z11) {
            int[] iArr = (int[]) sVar.f39103a.get("android:visibility:screenLocation");
            int i12 = iArr[0];
            int i13 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view5.offsetLeftAndRight((i12 - iArr2[0]) - view5.getLeft());
            view5.offsetTopAndBottom((i13 - iArr2[1]) - view5.getTop());
            x.a(viewGroup).c(view5);
        }
        Animator p03 = p0(viewGroup, view5, sVar, sVar2);
        if (!z11) {
            if (p03 == null) {
                x.a(viewGroup).d(view5);
            } else {
                view3.setTag(AbstractC3991i.f39039a, view5);
                a(new a(viewGroup, view5, view3));
            }
        }
        return p03;
    }

    public void r0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f38966J = i10;
    }

    @Override // r1.AbstractC3994l
    public Animator s(ViewGroup viewGroup, s sVar, s sVar2) {
        c m02 = m0(sVar, sVar2);
        if (!m02.f38977a) {
            return null;
        }
        if (m02.f38981e == null && m02.f38982f == null) {
            return null;
        }
        return m02.f38978b ? o0(viewGroup, sVar, m02.f38979c, sVar2, m02.f38980d) : q0(viewGroup, sVar, m02.f38979c, sVar2, m02.f38980d);
    }

    /* renamed from: r1.N$b */
    private static class b extends AnimatorListenerAdapter implements AbstractC3994l.f {

        /* renamed from: a, reason: collision with root package name */
        private final View f38971a;

        /* renamed from: b, reason: collision with root package name */
        private final int f38972b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f38973c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f38974d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f38975e;

        /* renamed from: f, reason: collision with root package name */
        boolean f38976f = false;

        b(View view, int i10, boolean z10) {
            this.f38971a = view;
            this.f38972b = i10;
            this.f38973c = (ViewGroup) view.getParent();
            this.f38974d = z10;
            g(true);
        }

        private void f() {
            if (!this.f38976f) {
                AbstractC3967A.h(this.f38971a, this.f38972b);
                ViewGroup viewGroup = this.f38973c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f38974d || this.f38975e == z10 || (viewGroup = this.f38973c) == null) {
                return;
            }
            this.f38975e = z10;
            x.c(viewGroup, z10);
        }

        @Override // r1.AbstractC3994l.f
        public void a(AbstractC3994l abstractC3994l) {
            f();
            abstractC3994l.Y(this);
        }

        @Override // r1.AbstractC3994l.f
        public void c(AbstractC3994l abstractC3994l) {
            g(true);
        }

        @Override // r1.AbstractC3994l.f
        public void e(AbstractC3994l abstractC3994l) {
            g(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f38976f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f38976f) {
                return;
            }
            AbstractC3967A.h(this.f38971a, this.f38972b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f38976f) {
                return;
            }
            AbstractC3967A.h(this.f38971a, 0);
        }

        @Override // r1.AbstractC3994l.f
        public void b(AbstractC3994l abstractC3994l) {
        }

        @Override // r1.AbstractC3994l.f
        public void d(AbstractC3994l abstractC3994l) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
