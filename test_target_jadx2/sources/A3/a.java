package A3;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    InterfaceC0002a f313a;

    /* renamed from: b, reason: collision with root package name */
    final float f314b;

    /* renamed from: c, reason: collision with root package name */
    boolean f315c;

    /* renamed from: d, reason: collision with root package name */
    boolean f316d;

    /* renamed from: e, reason: collision with root package name */
    long f317e;

    /* renamed from: f, reason: collision with root package name */
    float f318f;

    /* renamed from: g, reason: collision with root package name */
    float f319g;

    /* renamed from: A3.a$a, reason: collision with other inner class name */
    public interface InterfaceC0002a {
        boolean e();
    }

    public a(Context context) {
        this.f314b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static a c(Context context) {
        return new a(context);
    }

    public void a() {
        this.f313a = null;
        e();
    }

    public boolean b() {
        return this.f315c;
    }

    public boolean d(MotionEvent motionEvent) {
        InterfaceC0002a interfaceC0002a;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f315c = true;
            this.f316d = true;
            this.f317e = motionEvent.getEventTime();
            this.f318f = motionEvent.getX();
            this.f319g = motionEvent.getY();
        } else if (action == 1) {
            this.f315c = false;
            if (Math.abs(motionEvent.getX() - this.f318f) > this.f314b || Math.abs(motionEvent.getY() - this.f319g) > this.f314b) {
                this.f316d = false;
            }
            if (this.f316d && motionEvent.getEventTime() - this.f317e <= ViewConfiguration.getLongPressTimeout() && (interfaceC0002a = this.f313a) != null) {
                interfaceC0002a.e();
            }
            this.f316d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f315c = false;
                this.f316d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f318f) > this.f314b || Math.abs(motionEvent.getY() - this.f319g) > this.f314b) {
            this.f316d = false;
        }
        return true;
    }

    public void e() {
        this.f315c = false;
        this.f316d = false;
    }

    public void f(InterfaceC0002a interfaceC0002a) {
        this.f313a = interfaceC0002a;
    }
}
