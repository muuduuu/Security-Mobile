package G0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.AbstractC1484a0;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c {

    /* renamed from: x, reason: collision with root package name */
    private static final Interpolator f2781x = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f2782a;

    /* renamed from: b, reason: collision with root package name */
    private int f2783b;

    /* renamed from: d, reason: collision with root package name */
    private float[] f2785d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f2786e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f2787f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f2788g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f2789h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f2790i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f2791j;

    /* renamed from: k, reason: collision with root package name */
    private int f2792k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f2793l;

    /* renamed from: m, reason: collision with root package name */
    private float f2794m;

    /* renamed from: n, reason: collision with root package name */
    private float f2795n;

    /* renamed from: o, reason: collision with root package name */
    private int f2796o;

    /* renamed from: p, reason: collision with root package name */
    private final int f2797p;

    /* renamed from: q, reason: collision with root package name */
    private int f2798q;

    /* renamed from: r, reason: collision with root package name */
    private OverScroller f2799r;

    /* renamed from: s, reason: collision with root package name */
    private final AbstractC0063c f2800s;

    /* renamed from: t, reason: collision with root package name */
    private View f2801t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f2802u;

    /* renamed from: v, reason: collision with root package name */
    private final ViewGroup f2803v;

    /* renamed from: c, reason: collision with root package name */
    private int f2784c = -1;

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f2804w = new b();

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.K(0);
        }
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0063c abstractC0063c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0063c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f2803v = viewGroup;
        this.f2800s = abstractC0063c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f2797p = i10;
        this.f2796o = i10;
        this.f2783b = viewConfiguration.getScaledTouchSlop();
        this.f2794m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2795n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2799r = new OverScroller(context, f2781x);
    }

    private boolean D(int i10) {
        if (C(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void G() {
        this.f2793l.computeCurrentVelocity(1000, this.f2794m);
        p(g(this.f2793l.getXVelocity(this.f2784c), this.f2795n, this.f2794m), g(this.f2793l.getYVelocity(this.f2784c), this.f2795n, this.f2794m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [G0.c$c] */
    private void H(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        boolean z10 = c10;
        if (c(f11, f10, i10, 4)) {
            z10 = (c10 ? 1 : 0) | 4;
        }
        boolean z11 = z10;
        if (c(f10, f11, i10, 2)) {
            z11 = (z10 ? 1 : 0) | 2;
        }
        ?? r02 = z11;
        if (c(f11, f10, i10, 8)) {
            r02 = (z11 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f2790i;
            iArr[i10] = iArr[i10] | r02;
            this.f2800s.f(r02, i10);
        }
    }

    private void I(float f10, float f11, int i10) {
        s(i10);
        float[] fArr = this.f2785d;
        this.f2787f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f2786e;
        this.f2788g[i10] = f11;
        fArr2[i10] = f11;
        this.f2789h[i10] = y((int) f10, (int) f11);
        this.f2792k |= 1 << i10;
    }

    private void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (D(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f2787f[pointerId] = x10;
                this.f2788g[pointerId] = y10;
            }
        }
    }

    private boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f2789h[i10] & i11) != i11 || (this.f2798q & i11) == 0 || (this.f2791j[i10] & i11) == i11 || (this.f2790i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f2783b;
        if (abs <= i12 && abs2 <= i12) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f2800s.g(i11)) {
            return (this.f2790i[i10] & i11) == 0 && abs > ((float) this.f2783b);
        }
        int[] iArr = this.f2791j;
        iArr[i10] = iArr[i10] | i11;
        return false;
    }

    private boolean f(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f2800s.d(view) > 0;
        boolean z11 = this.f2800s.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f2783b) : z11 && Math.abs(f11) > ((float) this.f2783b);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i10 = this.f2783b;
        return f12 > ((float) (i10 * i10));
    }

    private float g(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        return abs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    private int h(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        return abs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    private void i() {
        float[] fArr = this.f2785d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f2786e, 0.0f);
        Arrays.fill(this.f2787f, 0.0f);
        Arrays.fill(this.f2788g, 0.0f);
        Arrays.fill(this.f2789h, 0);
        Arrays.fill(this.f2790i, 0);
        Arrays.fill(this.f2791j, 0);
        this.f2792k = 0;
    }

    private void j(int i10) {
        if (this.f2785d == null || !C(i10)) {
            return;
        }
        this.f2785d[i10] = 0.0f;
        this.f2786e[i10] = 0.0f;
        this.f2787f[i10] = 0.0f;
        this.f2788g[i10] = 0.0f;
        this.f2789h[i10] = 0;
        this.f2790i[i10] = 0;
        this.f2791j[i10] = 0;
        this.f2792k = (~(1 << i10)) & this.f2792k;
    }

    private int k(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f2803v.getWidth();
        float f10 = width / 2;
        float q10 = f10 + (q(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int abs = Math.abs(i11);
        return Math.min(abs > 0 ? Math.round(Math.abs(q10 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    private int l(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int h10 = h(i12, (int) this.f2795n, (int) this.f2794m);
        int h11 = h(i13, (int) this.f2795n, (int) this.f2794m);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(h10);
        int abs4 = Math.abs(h11);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (h10 != 0) {
            f10 = abs3;
            f11 = i14;
        } else {
            f10 = abs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (h11 != 0) {
            f12 = abs4;
            f13 = i14;
        } else {
            f12 = abs2;
            f13 = i15;
        }
        return (int) ((k(i10, h10, this.f2800s.d(view)) * f14) + (k(i11, h11, this.f2800s.e(view)) * (f12 / f13)));
    }

    public static c n(ViewGroup viewGroup, float f10, AbstractC0063c abstractC0063c) {
        c o10 = o(viewGroup, abstractC0063c);
        o10.f2783b = (int) (o10.f2783b * (1.0f / f10));
        return o10;
    }

    public static c o(ViewGroup viewGroup, AbstractC0063c abstractC0063c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0063c);
    }

    private void p(float f10, float f11) {
        this.f2802u = true;
        this.f2800s.l(this.f2801t, f10, f11);
        this.f2802u = false;
        if (this.f2782a == 1) {
            K(0);
        }
    }

    private float q(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void r(int i10, int i11, int i12, int i13) {
        int left = this.f2801t.getLeft();
        int top = this.f2801t.getTop();
        if (i12 != 0) {
            i10 = this.f2800s.a(this.f2801t, i10, i12);
            AbstractC1484a0.a0(this.f2801t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f2800s.b(this.f2801t, i11, i13);
            AbstractC1484a0.b0(this.f2801t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f2800s.k(this.f2801t, i14, i15, i14 - left, i15 - top);
    }

    private void s(int i10) {
        float[] fArr = this.f2785d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2786e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2787f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2788g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2789h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2790i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2791j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2785d = fArr2;
            this.f2786e = fArr3;
            this.f2787f = fArr4;
            this.f2788g = fArr5;
            this.f2789h = iArr;
            this.f2790i = iArr2;
            this.f2791j = iArr3;
        }
    }

    private boolean u(int i10, int i11, int i12, int i13) {
        int left = this.f2801t.getLeft();
        int top = this.f2801t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f2799r.abortAnimation();
            K(0);
            return false;
        }
        this.f2799r.startScroll(left, top, i14, i15, l(this.f2801t, i14, i15, i12, i13));
        K(2);
        return true;
    }

    private int y(int i10, int i11) {
        int i12 = i10 < this.f2803v.getLeft() + this.f2796o ? 1 : 0;
        if (i11 < this.f2803v.getTop() + this.f2796o) {
            i12 |= 4;
        }
        if (i10 > this.f2803v.getRight() - this.f2796o) {
            i12 |= 2;
        }
        return i11 > this.f2803v.getBottom() - this.f2796o ? i12 | 8 : i12;
    }

    public int A() {
        return this.f2782a;
    }

    public boolean B(int i10, int i11) {
        return E(this.f2801t, i10, i11);
    }

    public boolean C(int i10) {
        return ((1 << i10) & this.f2792k) != 0;
    }

    public boolean E(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void F(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2793l == null) {
            this.f2793l = VelocityTracker.obtain();
        }
        this.f2793l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View t10 = t((int) x10, (int) y10);
            I(x10, y10, pointerId);
            R(t10, pointerId);
            int i12 = this.f2789h[pointerId];
            int i13 = this.f2798q;
            if ((i12 & i13) != 0) {
                this.f2800s.h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f2782a == 1) {
                G();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f2782a == 1) {
                if (D(this.f2784c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2784c);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float y11 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f2787f;
                    int i14 = this.f2784c;
                    int i15 = (int) (x11 - fArr[i14]);
                    int i16 = (int) (y11 - this.f2788g[i14]);
                    r(this.f2801t.getLeft() + i15, this.f2801t.getTop() + i16, i15, i16);
                    J(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i11 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i11);
                if (D(pointerId2)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f2785d[pointerId2];
                    float f11 = y12 - this.f2786e[pointerId2];
                    H(f10, f11, pointerId2);
                    if (this.f2782a != 1) {
                        View t11 = t((int) x12, (int) y12);
                        if (f(t11, f10, f11) && R(t11, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            J(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f2782a == 1) {
                p(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            I(x13, y13, pointerId3);
            if (this.f2782a != 0) {
                if (B((int) x13, (int) y13)) {
                    R(this.f2801t, pointerId3);
                    return;
                }
                return;
            } else {
                R(t((int) x13, (int) y13), pointerId3);
                int i17 = this.f2789h[pointerId3];
                int i18 = this.f2798q;
                if ((i17 & i18) != 0) {
                    this.f2800s.h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f2782a == 1 && pointerId4 == this.f2784c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f2784c) {
                    View t12 = t((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f2801t;
                    if (t12 == view && R(view, pointerId5)) {
                        i10 = this.f2784c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                G();
            }
        }
        j(pointerId4);
    }

    void K(int i10) {
        this.f2803v.removeCallbacks(this.f2804w);
        if (this.f2782a != i10) {
            this.f2782a = i10;
            this.f2800s.j(i10);
            if (this.f2782a == 0) {
                this.f2801t = null;
            }
        }
    }

    public void L(int i10) {
        this.f2796o = i10;
    }

    public void M(int i10) {
        this.f2798q = i10;
    }

    public void N(float f10) {
        this.f2795n = f10;
    }

    public boolean O(int i10, int i11) {
        if (this.f2802u) {
            return u(i10, i11, (int) this.f2793l.getXVelocity(this.f2784c), (int) this.f2793l.getYVelocity(this.f2784c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:
    
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean P(MotionEvent motionEvent) {
        boolean z10;
        View t10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2793l == null) {
            this.f2793l = VelocityTracker.obtain();
        }
        this.f2793l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x10 = motionEvent.getX(actionIndex);
                            float y10 = motionEvent.getY(actionIndex);
                            I(x10, y10, pointerId);
                            int i10 = this.f2782a;
                            if (i10 == 0) {
                                int i11 = this.f2789h[pointerId];
                                int i12 = this.f2798q;
                                if ((i11 & i12) != 0) {
                                    this.f2800s.h(i11 & i12, pointerId);
                                }
                            } else if (i10 == 2 && (t10 = t((int) x10, (int) y10)) == this.f2801t) {
                                R(t10, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            j(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f2785d != null && this.f2786e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i13 = 0; i13 < pointerCount; i13++) {
                        int pointerId2 = motionEvent.getPointerId(i13);
                        if (D(pointerId2)) {
                            float x11 = motionEvent.getX(i13);
                            float y11 = motionEvent.getY(i13);
                            float f10 = x11 - this.f2785d[pointerId2];
                            float f11 = y11 - this.f2786e[pointerId2];
                            View t11 = t((int) x11, (int) y11);
                            boolean z11 = t11 != null && f(t11, f10, f11);
                            if (z11) {
                                int left = t11.getLeft();
                                int i14 = (int) f10;
                                int a10 = this.f2800s.a(t11, left + i14, i14);
                                int top = t11.getTop();
                                int i15 = (int) f11;
                                int b10 = this.f2800s.b(t11, top + i15, i15);
                                int d10 = this.f2800s.d(t11);
                                int e10 = this.f2800s.e(t11);
                                if (d10 != 0) {
                                    if (d10 > 0) {
                                    }
                                }
                                if (e10 == 0) {
                                    break;
                                }
                                if (e10 > 0 && b10 == top) {
                                    break;
                                }
                            }
                            H(f10, f11, pointerId2);
                            if (this.f2782a == 1) {
                                break;
                            }
                            if (z11 && R(t11, pointerId2)) {
                                break;
                            }
                        }
                    }
                    J(motionEvent);
                }
                z10 = false;
            }
            a();
            z10 = false;
        } else {
            float x12 = motionEvent.getX();
            float y12 = motionEvent.getY();
            z10 = false;
            int pointerId3 = motionEvent.getPointerId(0);
            I(x12, y12, pointerId3);
            View t12 = t((int) x12, (int) y12);
            if (t12 == this.f2801t && this.f2782a == 2) {
                R(t12, pointerId3);
            }
            int i16 = this.f2789h[pointerId3];
            int i17 = this.f2798q;
            if ((i16 & i17) != 0) {
                this.f2800s.h(i16 & i17, pointerId3);
            }
        }
        if (this.f2782a == 1) {
            return true;
        }
        return z10;
    }

    public boolean Q(View view, int i10, int i11) {
        this.f2801t = view;
        this.f2784c = -1;
        boolean u10 = u(i10, i11, 0, 0);
        if (!u10 && this.f2782a == 0 && this.f2801t != null) {
            this.f2801t = null;
        }
        return u10;
    }

    boolean R(View view, int i10) {
        if (view == this.f2801t && this.f2784c == i10) {
            return true;
        }
        if (view == null || !this.f2800s.m(view, i10)) {
            return false;
        }
        this.f2784c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f2784c = -1;
        i();
        VelocityTracker velocityTracker = this.f2793l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2793l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f2803v) {
            this.f2801t = view;
            this.f2784c = i10;
            this.f2800s.i(view, i10);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f2803v + ")");
    }

    public boolean d(int i10) {
        int length = this.f2785d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (e(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i10, int i11) {
        if (!C(i11)) {
            return false;
        }
        boolean z10 = (i10 & 1) == 1;
        boolean z11 = (i10 & 2) == 2;
        float f10 = this.f2787f[i11] - this.f2785d[i11];
        float f11 = this.f2788g[i11] - this.f2786e[i11];
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f2783b) : z11 && Math.abs(f11) > ((float) this.f2783b);
        }
        float f12 = (f10 * f10) + (f11 * f11);
        int i12 = this.f2783b;
        return f12 > ((float) (i12 * i12));
    }

    public boolean m(boolean z10) {
        if (this.f2782a == 2) {
            boolean computeScrollOffset = this.f2799r.computeScrollOffset();
            int currX = this.f2799r.getCurrX();
            int currY = this.f2799r.getCurrY();
            int left = currX - this.f2801t.getLeft();
            int top = currY - this.f2801t.getTop();
            if (left != 0) {
                AbstractC1484a0.a0(this.f2801t, left);
            }
            if (top != 0) {
                AbstractC1484a0.b0(this.f2801t, top);
            }
            if (left != 0 || top != 0) {
                this.f2800s.k(this.f2801t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f2799r.getFinalX() && currY == this.f2799r.getFinalY()) {
                this.f2799r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z10) {
                    this.f2803v.post(this.f2804w);
                } else {
                    K(0);
                }
            }
        }
        return this.f2782a == 2;
    }

    public View t(int i10, int i11) {
        for (int childCount = this.f2803v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f2803v.getChildAt(this.f2800s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View v() {
        return this.f2801t;
    }

    public int w() {
        return this.f2797p;
    }

    public int x() {
        return this.f2796o;
    }

    public int z() {
        return this.f2783b;
    }

    /* renamed from: G0.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0063c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public boolean g(int i10) {
            return false;
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);

        public int c(int i10) {
            return i10;
        }

        public void f(int i10, int i11) {
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }
    }
}
