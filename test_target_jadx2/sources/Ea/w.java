package ea;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes2.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32483a;

    /* renamed from: b, reason: collision with root package name */
    private final b f32484b;

    /* renamed from: c, reason: collision with root package name */
    private float f32485c;

    /* renamed from: d, reason: collision with root package name */
    private float f32486d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f32487e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f32488f;

    /* renamed from: g, reason: collision with root package name */
    private float f32489g;

    /* renamed from: h, reason: collision with root package name */
    private float f32490h;

    /* renamed from: i, reason: collision with root package name */
    private float f32491i;

    /* renamed from: j, reason: collision with root package name */
    private float f32492j;

    /* renamed from: k, reason: collision with root package name */
    private float f32493k;

    /* renamed from: l, reason: collision with root package name */
    private float f32494l;

    /* renamed from: m, reason: collision with root package name */
    private float f32495m;

    /* renamed from: n, reason: collision with root package name */
    private long f32496n;

    /* renamed from: o, reason: collision with root package name */
    private long f32497o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f32498p;

    /* renamed from: q, reason: collision with root package name */
    private int f32499q;

    /* renamed from: r, reason: collision with root package name */
    private int f32500r;

    /* renamed from: s, reason: collision with root package name */
    private final Handler f32501s;

    /* renamed from: t, reason: collision with root package name */
    private float f32502t;

    /* renamed from: u, reason: collision with root package name */
    private float f32503u;

    /* renamed from: v, reason: collision with root package name */
    private int f32504v;

    /* renamed from: w, reason: collision with root package name */
    private GestureDetector f32505w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f32506x;

    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            w.this.f32502t = motionEvent.getX();
            w.this.f32503u = motionEvent.getY();
            w.this.f32504v = 1;
            return true;
        }
    }

    public interface b {
        boolean a(w wVar);

        void b(w wVar);

        boolean c(w wVar);
    }

    public w(Context context, b bVar) {
        this(context, bVar, null);
    }

    private boolean j() {
        return this.f32504v != 0;
    }

    public float d() {
        return this.f32489g;
    }

    public float e() {
        return this.f32485c;
    }

    public float f() {
        return this.f32486d;
    }

    public float g() {
        if (!j()) {
            float f10 = this.f32490h;
            if (f10 > 0.0f) {
                return this.f32489g / f10;
            }
            return 1.0f;
        }
        boolean z10 = this.f32506x;
        boolean z11 = (z10 && this.f32489g < this.f32490h) || (!z10 && this.f32489g > this.f32490h);
        float abs = Math.abs(1.0f - (this.f32489g / this.f32490h)) * 0.5f;
        if (this.f32490h <= this.f32499q) {
            return 1.0f;
        }
        return z11 ? 1.0f + abs : 1.0f - abs;
    }

    public long h() {
        return this.f32496n - this.f32497o;
    }

    public double i() {
        return h() / 1000.0d;
    }

    public boolean k(MotionEvent motionEvent) {
        float f10;
        float f11;
        this.f32496n = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f32487e) {
            this.f32505w.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z10 = (motionEvent.getButtonState() & 32) != 0;
        boolean z11 = this.f32504v == 2 && !z10;
        boolean z12 = actionMasked == 1 || actionMasked == 3 || z11;
        float f12 = 0.0f;
        if (actionMasked == 0 || z12) {
            if (this.f32498p) {
                this.f32484b.b(this);
                this.f32498p = false;
                this.f32491i = 0.0f;
                this.f32504v = 0;
            } else if (j() && z12) {
                this.f32498p = false;
                this.f32491i = 0.0f;
                this.f32504v = 0;
            }
            if (z12) {
                return true;
            }
        }
        if (!this.f32498p && this.f32488f && !j() && !z12 && z10) {
            this.f32502t = motionEvent.getX();
            this.f32503u = motionEvent.getY();
            this.f32504v = 2;
            this.f32491i = 0.0f;
        }
        boolean z13 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z11;
        boolean z14 = actionMasked == 6;
        int actionIndex = z14 ? motionEvent.getActionIndex() : -1;
        int i10 = z14 ? pointerCount - 1 : pointerCount;
        if (j()) {
            f11 = this.f32502t;
            f10 = this.f32503u;
            if (motionEvent.getY() < f10) {
                this.f32506x = true;
            } else {
                this.f32506x = false;
            }
        } else {
            float f13 = 0.0f;
            float f14 = 0.0f;
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (actionIndex != i11) {
                    f13 += motionEvent.getX(i11);
                    f14 += motionEvent.getY(i11);
                }
            }
            float f15 = i10;
            float f16 = f13 / f15;
            f10 = f14 / f15;
            f11 = f16;
        }
        float f17 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f12 += Math.abs(motionEvent.getX(i12) - f11);
                f17 += Math.abs(motionEvent.getY(i12) - f10);
            }
        }
        float f18 = i10;
        float f19 = (f12 / f18) * 2.0f;
        float f20 = (f17 / f18) * 2.0f;
        float hypot = j() ? f20 : (float) Math.hypot(f19, f20);
        boolean z15 = this.f32498p;
        this.f32485c = f11;
        this.f32486d = f10;
        if (!j() && this.f32498p && (hypot < this.f32500r || z13)) {
            this.f32484b.b(this);
            this.f32498p = false;
            this.f32491i = hypot;
        }
        if (z13) {
            this.f32492j = f19;
            this.f32494l = f19;
            this.f32493k = f20;
            this.f32495m = f20;
            this.f32489g = hypot;
            this.f32490h = hypot;
            this.f32491i = hypot;
        }
        int i13 = j() ? this.f32499q : this.f32500r;
        if (!this.f32498p && hypot >= i13 && (z15 || Math.abs(hypot - this.f32491i) > this.f32499q)) {
            this.f32492j = f19;
            this.f32494l = f19;
            this.f32493k = f20;
            this.f32495m = f20;
            this.f32489g = hypot;
            this.f32490h = hypot;
            this.f32497o = this.f32496n;
            this.f32498p = this.f32484b.c(this);
        }
        if (actionMasked == 2) {
            this.f32492j = f19;
            this.f32493k = f20;
            this.f32489g = hypot;
            if (this.f32498p ? this.f32484b.a(this) : true) {
                this.f32494l = this.f32492j;
                this.f32495m = this.f32493k;
                this.f32490h = this.f32489g;
                this.f32497o = this.f32496n;
            }
        }
        return true;
    }

    public void l(boolean z10) {
        this.f32487e = z10;
        if (z10 && this.f32505w == null) {
            this.f32505w = new GestureDetector(this.f32483a, new a(), this.f32501s);
        }
    }

    public void m(boolean z10) {
        this.f32488f = z10;
    }

    public w(Context context, b bVar, Handler handler) {
        this.f32504v = 0;
        this.f32483a = context;
        this.f32484b = bVar;
        this.f32499q = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.f32500r = 0;
        this.f32501s = handler;
        int i10 = context.getApplicationInfo().targetSdkVersion;
        if (i10 > 18) {
            l(true);
        }
        if (i10 > 22) {
            m(true);
        }
    }
}
