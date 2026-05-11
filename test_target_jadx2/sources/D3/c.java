package D3;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import i3.InterfaceC3317b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class c extends D3.b {

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3317b f1210e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f1211f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1212g;

    /* renamed from: h, reason: collision with root package name */
    private long f1213h;

    /* renamed from: i, reason: collision with root package name */
    private long f1214i;

    /* renamed from: j, reason: collision with root package name */
    private long f1215j;

    /* renamed from: k, reason: collision with root package name */
    private b f1216k;

    /* renamed from: l, reason: collision with root package name */
    private final Runnable f1217l;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                try {
                    c.this.f1212g = false;
                    if (!c.this.t()) {
                        c.this.u();
                    } else if (c.this.f1216k != null) {
                        c.this.f1216k.f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public interface b {
        void f();
    }

    private c(D3.a aVar, b bVar, InterfaceC3317b interfaceC3317b, ScheduledExecutorService scheduledExecutorService) {
        super(aVar);
        this.f1212g = false;
        this.f1214i = 2000L;
        this.f1215j = 1000L;
        this.f1217l = new a();
        this.f1216k = bVar;
        this.f1210e = interfaceC3317b;
        this.f1211f = scheduledExecutorService;
    }

    public static D3.b r(D3.a aVar, b bVar, InterfaceC3317b interfaceC3317b, ScheduledExecutorService scheduledExecutorService) {
        return new c(aVar, bVar, interfaceC3317b, scheduledExecutorService);
    }

    public static D3.b s(D3.a aVar, InterfaceC3317b interfaceC3317b, ScheduledExecutorService scheduledExecutorService) {
        return r(aVar, (b) aVar, interfaceC3317b, scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t() {
        return this.f1210e.now() - this.f1213h > this.f1214i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u() {
        if (!this.f1212g) {
            this.f1212g = true;
            this.f1211f.schedule(this.f1217l, this.f1215j, TimeUnit.MILLISECONDS);
        }
    }

    @Override // D3.b, D3.a
    public boolean n(Drawable drawable, Canvas canvas, int i10) {
        this.f1213h = this.f1210e.now();
        boolean n10 = super.n(drawable, canvas, i10);
        u();
        return n10;
    }
}
