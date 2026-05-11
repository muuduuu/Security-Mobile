package androidx.work.impl;

import D1.AbstractRunnableC0772b;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import x1.AbstractC5094A;
import x1.EnumC5102f;
import x1.EnumC5103g;
import x1.n;

/* loaded from: classes.dex */
public class P extends AbstractC5094A {

    /* renamed from: k, reason: collision with root package name */
    private static final String f18174k = x1.n.i("WorkManagerImpl");

    /* renamed from: l, reason: collision with root package name */
    private static P f18175l = null;

    /* renamed from: m, reason: collision with root package name */
    private static P f18176m = null;

    /* renamed from: n, reason: collision with root package name */
    private static final Object f18177n = new Object();

    /* renamed from: a, reason: collision with root package name */
    private Context f18178a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.work.a f18179b;

    /* renamed from: c, reason: collision with root package name */
    private WorkDatabase f18180c;

    /* renamed from: d, reason: collision with root package name */
    private E1.b f18181d;

    /* renamed from: e, reason: collision with root package name */
    private List f18182e;

    /* renamed from: f, reason: collision with root package name */
    private C1634u f18183f;

    /* renamed from: g, reason: collision with root package name */
    private D1.q f18184g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18185h = false;

    /* renamed from: i, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f18186i;

    /* renamed from: j, reason: collision with root package name */
    private final B1.n f18187j;

    static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public P(Context context, androidx.work.a aVar, E1.b bVar, WorkDatabase workDatabase, List list, C1634u c1634u, B1.n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        x1.n.h(new n.a(aVar.j()));
        this.f18178a = applicationContext;
        this.f18181d = bVar;
        this.f18180c = workDatabase;
        this.f18183f = c1634u;
        this.f18187j = nVar;
        this.f18179b = aVar;
        this.f18182e = list;
        this.f18184g = new D1.q(workDatabase);
        z.g(list, this.f18183f, bVar.c(), this.f18180c, aVar);
        this.f18181d.d(new ForceStopRunnable(applicationContext, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (androidx.work.impl.P.f18176m != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        androidx.work.impl.P.f18176m = androidx.work.impl.Q.c(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        androidx.work.impl.P.f18175l = androidx.work.impl.P.f18176m;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(Context context, androidx.work.a aVar) {
        synchronized (f18177n) {
            try {
                P p10 = f18175l;
                if (p10 != null && f18176m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } finally {
            }
        }
    }

    public static P m() {
        synchronized (f18177n) {
            try {
                P p10 = f18175l;
                if (p10 != null) {
                    return p10;
                }
                return f18176m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static P n(Context context) {
        P m10;
        synchronized (f18177n) {
            try {
                m10 = m();
                if (m10 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m10;
    }

    @Override // x1.AbstractC5094A
    public x1.r a(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new C(this, list).a();
    }

    @Override // x1.AbstractC5094A
    public x1.r c(String str, EnumC5102f enumC5102f, x1.t tVar) {
        return enumC5102f == EnumC5102f.UPDATE ? V.c(this, str, tVar) : j(str, enumC5102f, tVar).a();
    }

    @Override // x1.AbstractC5094A
    public x1.r d(String str, EnumC5103g enumC5103g, List list) {
        return new C(this, str, enumC5103g, list).a();
    }

    @Override // x1.AbstractC5094A
    public h8.d g(String str) {
        D1.u a10 = D1.u.a(this, str);
        this.f18181d.c().execute(a10);
        return a10.b();
    }

    public x1.r i(UUID uuid) {
        AbstractRunnableC0772b b10 = AbstractRunnableC0772b.b(uuid, this);
        this.f18181d.d(b10);
        return b10.d();
    }

    public C j(String str, EnumC5102f enumC5102f, x1.t tVar) {
        return new C(this, str, enumC5102f == EnumC5102f.KEEP ? EnumC5103g.KEEP : EnumC5103g.REPLACE, Collections.singletonList(tVar));
    }

    public Context k() {
        return this.f18178a;
    }

    public androidx.work.a l() {
        return this.f18179b;
    }

    public D1.q o() {
        return this.f18184g;
    }

    public C1634u p() {
        return this.f18183f;
    }

    public List q() {
        return this.f18182e;
    }

    public B1.n r() {
        return this.f18187j;
    }

    public WorkDatabase s() {
        return this.f18180c;
    }

    public E1.b t() {
        return this.f18181d;
    }

    public void u() {
        synchronized (f18177n) {
            try {
                this.f18185h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f18186i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f18186i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v() {
        androidx.work.impl.background.systemjob.g.d(k());
        s().K().B();
        z.h(l(), s(), q());
    }

    public void w(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f18177n) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f18186i;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f18186i = pendingResult;
                if (this.f18185h) {
                    pendingResult.finish();
                    this.f18186i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x(C1.m mVar) {
        this.f18181d.d(new D1.v(this.f18183f, new A(mVar), true));
    }
}
