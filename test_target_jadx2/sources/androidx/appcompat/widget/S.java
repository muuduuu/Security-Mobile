package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import l.InterfaceC3588e;

/* loaded from: classes.dex */
public abstract class S implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final float f13787a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13788b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13789c;

    /* renamed from: d, reason: collision with root package name */
    final View f13790d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f13791e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f13792f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13793g;

    /* renamed from: h, reason: collision with root package name */
    private int f13794h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f13795i = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = S.this.f13790d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            S.this.e();
        }
    }

    public S(View view) {
        this.f13790d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f13787a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f13788b = tapTimeout;
        this.f13789c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f13792f;
        if (runnable != null) {
            this.f13790d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f13791e;
        if (runnable2 != null) {
            this.f13790d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        P p10;
        View view = this.f13790d;
        InterfaceC3588e b10 = b();
        if (b10 == null || !b10.a() || (p10 = (P) b10.j()) == null || !p10.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(p10, obtainNoHistory);
        boolean e10 = p10.e(obtainNoHistory, this.f13794h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e10 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean g(MotionEvent motionEvent) {
        View view = this.f13790d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f13794h);
                    if (findPointerIndex >= 0 && !h(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f13787a)) {
                        a();
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            }
            a();
        } else {
            this.f13794h = motionEvent.getPointerId(0);
            if (this.f13791e == null) {
                this.f13791e = new a();
            }
            view.postDelayed(this.f13791e, this.f13788b);
            if (this.f13792f == null) {
                this.f13792f = new b();
            }
            view.postDelayed(this.f13792f, this.f13789c);
        }
        return false;
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f13795i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f13795i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract InterfaceC3588e b();

    protected abstract boolean c();

    protected boolean d() {
        InterfaceC3588e b10 = b();
        if (b10 == null || !b10.a()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f13790d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f13793g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f13793g;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f13790d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f13793g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f13793g = false;
        this.f13794h = -1;
        Runnable runnable = this.f13791e;
        if (runnable != null) {
            this.f13790d.removeCallbacks(runnable);
        }
    }
}
