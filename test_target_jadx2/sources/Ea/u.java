package ea;

import android.view.MotionEvent;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final a f32466a;

    /* renamed from: b, reason: collision with root package name */
    private long f32467b;

    /* renamed from: c, reason: collision with root package name */
    private long f32468c;

    /* renamed from: d, reason: collision with root package name */
    private double f32469d;

    /* renamed from: e, reason: collision with root package name */
    private double f32470e;

    /* renamed from: f, reason: collision with root package name */
    private float f32471f;

    /* renamed from: g, reason: collision with root package name */
    private float f32472g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f32473h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f32474i = new int[2];

    public interface a {
        boolean a(u uVar);

        void b(u uVar);

        boolean c(u uVar);
    }

    public u(a aVar) {
        this.f32466a = aVar;
    }

    private final void a() {
        if (this.f32473h) {
            this.f32473h = false;
            a aVar = this.f32466a;
            if (aVar != null) {
                aVar.b(this);
            }
        }
    }

    private final void g(MotionEvent motionEvent) {
        this.f32468c = this.f32467b;
        this.f32467b = motionEvent.getEventTime();
        int findPointerIndex = motionEvent.findPointerIndex(this.f32474i[0]);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.f32474i[1]);
        float x10 = motionEvent.getX(findPointerIndex);
        float y10 = motionEvent.getY(findPointerIndex);
        float x11 = motionEvent.getX(findPointerIndex2);
        float y11 = motionEvent.getY(findPointerIndex2);
        this.f32471f = (x10 + x11) * 0.5f;
        this.f32472g = (y10 + y11) * 0.5f;
        double d10 = -Math.atan2(y11 - y10, x11 - x10);
        double d11 = Double.isNaN(this.f32469d) ? 0.0d : this.f32469d - d10;
        this.f32470e = d11;
        this.f32469d = d10;
        if (d11 > 3.141592653589793d) {
            this.f32470e = d11 - 3.141592653589793d;
        } else if (d11 < -3.141592653589793d) {
            this.f32470e = d11 + 3.141592653589793d;
        }
        double d12 = this.f32470e;
        if (d12 > 1.5707963267948966d) {
            this.f32470e = d12 - 3.141592653589793d;
        } else if (d12 < -1.5707963267948966d) {
            this.f32470e = d12 + 3.141592653589793d;
        }
    }

    public final float b() {
        return this.f32471f;
    }

    public final float c() {
        return this.f32472g;
    }

    public final double d() {
        return this.f32470e;
    }

    public final long e() {
        return this.f32467b - this.f32468c;
    }

    public final boolean f(MotionEvent event) {
        a aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f32473h = false;
            this.f32474i[0] = event.getPointerId(event.getActionIndex());
            this.f32474i[1] = -1;
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked != 5) {
                if (actionMasked == 6) {
                    int pointerId = event.getPointerId(event.getActionIndex());
                    if (!this.f32473h && pointerId == this.f32474i[0] && (aVar = this.f32466a) != null) {
                        aVar.b(this);
                    }
                    if (this.f32473h && AbstractC3574i.u(this.f32474i, pointerId)) {
                        int[] iArr = this.f32474i;
                        if (pointerId == iArr[0]) {
                            iArr[0] = iArr[1];
                        }
                        iArr[1] = -1;
                        this.f32473h = false;
                    }
                }
            } else if (!this.f32473h) {
                this.f32474i[1] = event.getPointerId(event.getActionIndex());
                this.f32473h = true;
                this.f32468c = event.getEventTime();
                this.f32469d = Double.NaN;
                g(event);
                a aVar2 = this.f32466a;
                if (aVar2 != null) {
                    aVar2.c(this);
                }
            }
        } else if (this.f32473h) {
            g(event);
            a aVar3 = this.f32466a;
            if (aVar3 != null) {
                aVar3.a(this);
            }
        }
        return true;
    }
}
