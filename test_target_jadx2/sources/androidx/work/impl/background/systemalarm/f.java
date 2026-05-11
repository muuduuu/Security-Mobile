package androidx.work.impl.background.systemalarm;

import C1.m;
import C1.u;
import D1.D;
import D1.x;
import Jd.InterfaceC0915w0;
import Jd.J;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.A;
import androidx.work.impl.background.systemalarm.g;
import java.util.concurrent.Executor;
import x1.n;
import z1.AbstractC5238b;
import z1.AbstractC5242f;
import z1.C5241e;
import z1.InterfaceC5240d;

/* loaded from: classes.dex */
public class f implements InterfaceC5240d, D.a {

    /* renamed from: o, reason: collision with root package name */
    private static final String f18276o = n.i("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f18277a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18278b;

    /* renamed from: c, reason: collision with root package name */
    private final m f18279c;

    /* renamed from: d, reason: collision with root package name */
    private final g f18280d;

    /* renamed from: e, reason: collision with root package name */
    private final C5241e f18281e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f18282f;

    /* renamed from: g, reason: collision with root package name */
    private int f18283g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f18284h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f18285i;

    /* renamed from: j, reason: collision with root package name */
    private PowerManager.WakeLock f18286j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18287k;

    /* renamed from: l, reason: collision with root package name */
    private final A f18288l;

    /* renamed from: m, reason: collision with root package name */
    private final J f18289m;

    /* renamed from: n, reason: collision with root package name */
    private volatile InterfaceC0915w0 f18290n;

    f(Context context, int i10, g gVar, A a10) {
        this.f18277a = context;
        this.f18278b = i10;
        this.f18280d = gVar;
        this.f18279c = a10.a();
        this.f18288l = a10;
        B1.n r10 = gVar.g().r();
        this.f18284h = gVar.f().c();
        this.f18285i = gVar.f().b();
        this.f18289m = gVar.f().a();
        this.f18281e = new C5241e(r10);
        this.f18287k = false;
        this.f18283g = 0;
        this.f18282f = new Object();
    }

    private void e() {
        synchronized (this.f18282f) {
            try {
                if (this.f18290n != null) {
                    this.f18290n.d(null);
                }
                this.f18280d.h().b(this.f18279c);
                PowerManager.WakeLock wakeLock = this.f18286j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    n.e().a(f18276o, "Releasing wakelock " + this.f18286j + "for WorkSpec " + this.f18279c);
                    this.f18286j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f18283g != 0) {
            n.e().a(f18276o, "Already started work for " + this.f18279c);
            return;
        }
        this.f18283g = 1;
        n.e().a(f18276o, "onAllConstraintsMet for " + this.f18279c);
        if (this.f18280d.d().r(this.f18288l)) {
            this.f18280d.h().a(this.f18279c, 600000L, this);
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        String b10 = this.f18279c.b();
        if (this.f18283g >= 2) {
            n.e().a(f18276o, "Already stopped work for " + b10);
            return;
        }
        this.f18283g = 2;
        n e10 = n.e();
        String str = f18276o;
        e10.a(str, "Stopping work for WorkSpec " + b10);
        this.f18285i.execute(new g.b(this.f18280d, b.f(this.f18277a, this.f18279c), this.f18278b));
        if (!this.f18280d.d().k(this.f18279c.b())) {
            n.e().a(str, "Processor does not have WorkSpec " + b10 + ". No need to reschedule");
            return;
        }
        n.e().a(str, "WorkSpec " + b10 + " needs to be rescheduled");
        this.f18285i.execute(new g.b(this.f18280d, b.d(this.f18277a, this.f18279c), this.f18278b));
    }

    @Override // D1.D.a
    public void a(m mVar) {
        n.e().a(f18276o, "Exceeded time limits on execution for " + mVar);
        this.f18284h.execute(new d(this));
    }

    @Override // z1.InterfaceC5240d
    public void d(u uVar, AbstractC5238b abstractC5238b) {
        if (abstractC5238b instanceof AbstractC5238b.a) {
            this.f18284h.execute(new e(this));
        } else {
            this.f18284h.execute(new d(this));
        }
    }

    void f() {
        String b10 = this.f18279c.b();
        this.f18286j = x.b(this.f18277a, b10 + " (" + this.f18278b + ")");
        n e10 = n.e();
        String str = f18276o;
        e10.a(str, "Acquiring wakelock " + this.f18286j + "for WorkSpec " + b10);
        this.f18286j.acquire();
        u s10 = this.f18280d.g().s().K().s(b10);
        if (s10 == null) {
            this.f18284h.execute(new d(this));
            return;
        }
        boolean k10 = s10.k();
        this.f18287k = k10;
        if (k10) {
            this.f18290n = AbstractC5242f.b(this.f18281e, s10, this.f18289m, this);
            return;
        }
        n.e().a(str, "No constraints for " + b10);
        this.f18284h.execute(new e(this));
    }

    void g(boolean z10) {
        n.e().a(f18276o, "onExecuted " + this.f18279c + ", " + z10);
        e();
        if (z10) {
            this.f18285i.execute(new g.b(this.f18280d, b.d(this.f18277a, this.f18279c), this.f18278b));
        }
        if (this.f18287k) {
            this.f18285i.execute(new g.b(this.f18280d, b.a(this.f18277a), this.f18278b));
        }
    }
}
