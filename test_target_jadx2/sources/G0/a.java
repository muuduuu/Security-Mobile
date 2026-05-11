package G0;

import G0.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.C1483a;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import j0.j;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.PSKKeyManager;
import z0.AbstractC5230C;
import z0.C5228A;
import z0.C5229B;

/* loaded from: classes.dex */
public abstract class a extends C1483a {

    /* renamed from: n, reason: collision with root package name */
    private static final Rect f2763n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    private static final b.a f2764o = new C0061a();

    /* renamed from: p, reason: collision with root package name */
    private static final b.InterfaceC0062b f2765p = new b();

    /* renamed from: h, reason: collision with root package name */
    private final AccessibilityManager f2770h;

    /* renamed from: i, reason: collision with root package name */
    private final View f2771i;

    /* renamed from: j, reason: collision with root package name */
    private c f2772j;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f2766d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final Rect f2767e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    private final Rect f2768f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    private final int[] f2769g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    int f2773k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    int f2774l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    private int f2775m = Integer.MIN_VALUE;

    /* renamed from: G0.a$a, reason: collision with other inner class name */
    class C0061a implements b.a {
        C0061a() {
        }

        @Override // G0.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C5228A c5228a, Rect rect) {
            c5228a.m(rect);
        }
    }

    class b implements b.InterfaceC0062b {
        b() {
        }

        @Override // G0.b.InterfaceC0062b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C5228A a(j jVar, int i10) {
            return (C5228A) jVar.p(i10);
        }

        @Override // G0.b.InterfaceC0062b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(j jVar) {
            return jVar.o();
        }
    }

    private class c extends C5229B {
        c() {
        }

        @Override // z0.C5229B
        public C5228A b(int i10) {
            return C5228A.f0(a.this.H(i10));
        }

        @Override // z0.C5229B
        public C5228A d(int i10) {
            int i11 = i10 == 2 ? a.this.f2773k : a.this.f2774l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // z0.C5229B
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f2771i = view;
        this.f2770h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (AbstractC1484a0.y(view) == 0) {
            AbstractC1484a0.B0(view, 1);
        }
    }

    private static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f2771i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f2771i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i10, Rect rect) {
        C5228A c5228a;
        j y10 = y();
        int i11 = this.f2774l;
        C5228A c5228a2 = i11 == Integer.MIN_VALUE ? null : (C5228A) y10.i(i11);
        if (i10 == 1 || i10 == 2) {
            c5228a = (C5228A) G0.b.d(y10, f2765p, f2764o, c5228a2, i10, AbstractC1484a0.A(this.f2771i) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.f2774l;
            if (i12 != Integer.MIN_VALUE) {
                z(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f2771i, i10, rect2);
            }
            c5228a = (C5228A) G0.b.c(y10, f2765p, f2764o, c5228a2, rect2, i10);
        }
        return T(c5228a != null ? y10.m(y10.l(c5228a)) : Integer.MIN_VALUE);
    }

    private boolean Q(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? J(i10, i11, bundle) : n(i10) : S(i10) : o(i10) : T(i10);
    }

    private boolean R(int i10, Bundle bundle) {
        return AbstractC1484a0.f0(this.f2771i, i10, bundle);
    }

    private boolean S(int i10) {
        int i11;
        if (!this.f2770h.isEnabled() || !this.f2770h.isTouchExplorationEnabled() || (i11 = this.f2773k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f2773k = i10;
        this.f2771i.invalidate();
        U(i10, 32768);
        return true;
    }

    private void V(int i10) {
        int i11 = this.f2775m;
        if (i11 == i10) {
            return;
        }
        this.f2775m = i10;
        U(i10, 128);
        U(i11, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    private boolean n(int i10) {
        if (this.f2773k != i10) {
            return false;
        }
        this.f2773k = Integer.MIN_VALUE;
        this.f2771i.invalidate();
        U(i10, 65536);
        return true;
    }

    private boolean p() {
        int i10 = this.f2774l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, null);
    }

    private AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    private AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        C5228A H10 = H(i10);
        obtain.getText().add(H10.E());
        obtain.setContentDescription(H10.u());
        obtain.setScrollable(H10.Y());
        obtain.setPassword(H10.W());
        obtain.setEnabled(H10.Q());
        obtain.setChecked(H10.N());
        L(i10, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(H10.q());
        AbstractC5230C.c(obtain, this.f2771i, i10);
        obtain.setPackageName(this.f2771i.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent s(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.f2771i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private C5228A t(int i10) {
        C5228A d02 = C5228A.d0();
        d02.w0(true);
        d02.y0(true);
        d02.q0("android.view.View");
        Rect rect = f2763n;
        d02.m0(rect);
        d02.n0(rect);
        d02.H0(this.f2771i);
        N(i10, d02);
        if (d02.E() == null && d02.u() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        d02.m(this.f2767e);
        if (this.f2767e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int k10 = d02.k();
        if ((k10 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((k10 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        d02.F0(this.f2771i.getContext().getPackageName());
        d02.Q0(this.f2771i, i10);
        if (this.f2773k == i10) {
            d02.k0(true);
            d02.a(128);
        } else {
            d02.k0(false);
            d02.a(64);
        }
        boolean z10 = this.f2774l == i10;
        if (z10) {
            d02.a(2);
        } else if (d02.R()) {
            d02.a(1);
        }
        d02.z0(z10);
        this.f2771i.getLocationOnScreen(this.f2769g);
        d02.n(this.f2766d);
        if (this.f2766d.equals(rect)) {
            d02.m(this.f2766d);
            if (d02.f45599b != -1) {
                C5228A d03 = C5228A.d0();
                for (int i11 = d02.f45599b; i11 != -1; i11 = d03.f45599b) {
                    d03.I0(this.f2771i, -1);
                    d03.m0(f2763n);
                    N(i11, d03);
                    d03.m(this.f2767e);
                    Rect rect2 = this.f2766d;
                    Rect rect3 = this.f2767e;
                    rect2.offset(rect3.left, rect3.top);
                }
                d03.h0();
            }
            this.f2766d.offset(this.f2769g[0] - this.f2771i.getScrollX(), this.f2769g[1] - this.f2771i.getScrollY());
        }
        if (this.f2771i.getLocalVisibleRect(this.f2768f)) {
            this.f2768f.offset(this.f2769g[0] - this.f2771i.getScrollX(), this.f2769g[1] - this.f2771i.getScrollY());
            if (this.f2766d.intersect(this.f2768f)) {
                d02.n0(this.f2766d);
                if (E(this.f2766d)) {
                    d02.W0(true);
                }
            }
        }
        return d02;
    }

    private C5228A u() {
        C5228A e02 = C5228A.e0(this.f2771i);
        AbstractC1484a0.d0(this.f2771i, e02);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (e02.p() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e02.d(this.f2771i, ((Integer) arrayList.get(i10)).intValue());
        }
        return e02;
    }

    private j y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        j jVar = new j();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jVar.n(((Integer) arrayList.get(i10)).intValue(), t(((Integer) arrayList.get(i10)).intValue()));
        }
        return jVar;
    }

    private void z(int i10, Rect rect) {
        H(i10).m(rect);
    }

    public final int A() {
        return this.f2774l;
    }

    protected abstract int B(float f10, float f11);

    protected abstract void C(List list);

    C5228A H(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f2774l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    protected abstract boolean J(int i10, int i11, Bundle bundle);

    protected abstract void N(int i10, C5228A c5228a);

    boolean P(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? Q(i10, i11, bundle) : R(i11, bundle);
    }

    public final boolean T(int i10) {
        int i11;
        if ((!this.f2771i.isFocused() && !this.f2771i.requestFocus()) || (i11 = this.f2774l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f2774l = i10;
        O(i10, true);
        U(i10, 8);
        return true;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f2770h.isEnabled() || (parent = this.f2771i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f2771i, q(i10, i11));
    }

    @Override // androidx.core.view.C1483a
    public C5229B b(View view) {
        if (this.f2772j == null) {
            this.f2772j = new c();
        }
        return this.f2772j;
    }

    @Override // androidx.core.view.C1483a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // androidx.core.view.C1483a
    public void g(View view, C5228A c5228a) {
        super.g(view, c5228a);
        M(c5228a);
    }

    public final boolean o(int i10) {
        if (this.f2774l != i10) {
            return false;
        }
        this.f2774l = Integer.MIN_VALUE;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f2770h.isEnabled() || !this.f2770h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B10 = B(motionEvent.getX(), motionEvent.getY());
            V(B10);
            return B10 != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f2775m == Integer.MIN_VALUE) {
            return false;
        }
        V(Integer.MIN_VALUE);
        return true;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return G(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                case HVError.FACE_DETECTION_ERROR /* 22 */:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int F10 = F(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z10 = false;
                    while (i10 < repeatCount && G(F10, null)) {
                        i10++;
                        z10 = true;
                    }
                    return z10;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p();
        return true;
    }

    public final int x() {
        return this.f2773k;
    }

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void M(C5228A c5228a) {
    }

    protected void L(int i10, AccessibilityEvent accessibilityEvent) {
    }

    protected void O(int i10, boolean z10) {
    }
}
