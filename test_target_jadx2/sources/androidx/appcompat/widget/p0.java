package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC1484a0;
import androidx.core.view.AbstractC1492e0;

/* loaded from: classes.dex */
class p0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    private static p0 f14226k;

    /* renamed from: l, reason: collision with root package name */
    private static p0 f14227l;

    /* renamed from: a, reason: collision with root package name */
    private final View f14228a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f14229b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14230c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f14231d = new Runnable() { // from class: androidx.appcompat.widget.n0
        @Override // java.lang.Runnable
        public final void run() {
            p0.this.e();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f14232e = new Runnable() { // from class: androidx.appcompat.widget.o0
        @Override // java.lang.Runnable
        public final void run() {
            p0.this.d();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private int f14233f;

    /* renamed from: g, reason: collision with root package name */
    private int f14234g;

    /* renamed from: h, reason: collision with root package name */
    private q0 f14235h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14236i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14237j;

    private p0(View view, CharSequence charSequence) {
        this.f14228a = view;
        this.f14229b = charSequence;
        this.f14230c = AbstractC1492e0.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f14228a.removeCallbacks(this.f14231d);
    }

    private void c() {
        this.f14237j = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f14228a.postDelayed(this.f14231d, ViewConfiguration.getLongPressTimeout());
    }

    private static void g(p0 p0Var) {
        p0 p0Var2 = f14226k;
        if (p0Var2 != null) {
            p0Var2.b();
        }
        f14226k = p0Var;
        if (p0Var != null) {
            p0Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        p0 p0Var = f14226k;
        if (p0Var != null && p0Var.f14228a == view) {
            g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new p0(view, charSequence);
            return;
        }
        p0 p0Var2 = f14227l;
        if (p0Var2 != null && p0Var2.f14228a == view) {
            p0Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean j(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f14237j && Math.abs(x10 - this.f14233f) <= this.f14230c && Math.abs(y10 - this.f14234g) <= this.f14230c) {
            return false;
        }
        this.f14233f = x10;
        this.f14234g = y10;
        this.f14237j = false;
        return true;
    }

    void d() {
        if (f14227l == this) {
            f14227l = null;
            q0 q0Var = this.f14235h;
            if (q0Var != null) {
                q0Var.c();
                this.f14235h = null;
                c();
                this.f14228a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f14226k == this) {
            g(null);
        }
        this.f14228a.removeCallbacks(this.f14232e);
    }

    void i(boolean z10) {
        long longPressTimeout;
        long j10;
        long j11;
        if (this.f14228a.isAttachedToWindow()) {
            g(null);
            p0 p0Var = f14227l;
            if (p0Var != null) {
                p0Var.d();
            }
            f14227l = this;
            this.f14236i = z10;
            q0 q0Var = new q0(this.f14228a.getContext());
            this.f14235h = q0Var;
            q0Var.e(this.f14228a, this.f14233f, this.f14234g, this.f14236i, this.f14229b);
            this.f14228a.addOnAttachStateChangeListener(this);
            if (this.f14236i) {
                j11 = 2500;
            } else {
                if ((AbstractC1484a0.M(this.f14228a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f14228a.removeCallbacks(this.f14232e);
            this.f14228a.postDelayed(this.f14232e, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f14235h != null && this.f14236i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f14228a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f14228a.isEnabled() && this.f14235h == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f14233f = view.getWidth() / 2;
        this.f14234g = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
