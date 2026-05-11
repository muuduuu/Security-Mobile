package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: androidx.core.view.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1511o {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16152a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1513p f16153b;

    /* renamed from: c, reason: collision with root package name */
    private final b f16154c;

    /* renamed from: d, reason: collision with root package name */
    private final a f16155d;

    /* renamed from: e, reason: collision with root package name */
    private VelocityTracker f16156e;

    /* renamed from: f, reason: collision with root package name */
    private float f16157f;

    /* renamed from: g, reason: collision with root package name */
    private int f16158g;

    /* renamed from: h, reason: collision with root package name */
    private int f16159h;

    /* renamed from: i, reason: collision with root package name */
    private int f16160i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f16161j;

    /* renamed from: androidx.core.view.o$a */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* renamed from: androidx.core.view.o$b */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public C1511o(Context context, InterfaceC1513p interfaceC1513p) {
        this(context, interfaceC1513p, new b() { // from class: androidx.core.view.m
            @Override // androidx.core.view.C1511o.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                C1511o.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: androidx.core.view.n
            @Override // androidx.core.view.C1511o.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                float f10;
                f10 = C1511o.f(velocityTracker, motionEvent, i10);
                return f10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = AbstractC1492e0.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = AbstractC1492e0.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f16159h == source && this.f16160i == deviceId && this.f16158g == i10) {
            return false;
        }
        this.f16154c.a(this.f16152a, this.f16161j, motionEvent, i10);
        this.f16159h = source;
        this.f16160i = deviceId;
        this.f16158g = i10;
        return true;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f16156e == null) {
            this.f16156e = VelocityTracker.obtain();
        }
        return this.f16155d.a(this.f16156e, motionEvent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        X.a(velocityTracker, motionEvent);
        X.b(velocityTracker, 1000);
        return X.d(velocityTracker, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean d10 = d(motionEvent, i10);
        if (this.f16161j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f16156e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f16156e = null;
                return;
            }
            return;
        }
        float e10 = e(motionEvent, i10) * this.f16153b.b();
        float signum = Math.signum(e10);
        if (d10 || (signum != Math.signum(this.f16157f) && signum != 0.0f)) {
            this.f16153b.c();
        }
        float abs = Math.abs(e10);
        int[] iArr = this.f16161j;
        if (abs < iArr[0]) {
            return;
        }
        float max = Math.max(-r6, Math.min(e10, iArr[1]));
        this.f16157f = this.f16153b.a(max) ? max : 0.0f;
    }

    C1511o(Context context, InterfaceC1513p interfaceC1513p, b bVar, a aVar) {
        this.f16158g = -1;
        this.f16159h = -1;
        this.f16160i = -1;
        this.f16161j = new int[]{Integer.MAX_VALUE, 0};
        this.f16152a = context;
        this.f16153b = interfaceC1513p;
        this.f16154c = bVar;
        this.f16155d = aVar;
    }
}
