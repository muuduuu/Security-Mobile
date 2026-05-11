package V6;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.C2012d;
import com.google.android.gms.common.C2018j;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: V6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1267c {

    /* renamed from: A, reason: collision with root package name */
    private boolean f10891A;

    /* renamed from: B, reason: collision with root package name */
    private volatile r0 f10892B;

    /* renamed from: C, reason: collision with root package name */
    protected AtomicInteger f10893C;

    /* renamed from: a, reason: collision with root package name */
    private int f10894a;

    /* renamed from: b, reason: collision with root package name */
    private long f10895b;

    /* renamed from: c, reason: collision with root package name */
    private long f10896c;

    /* renamed from: d, reason: collision with root package name */
    private int f10897d;

    /* renamed from: e, reason: collision with root package name */
    private long f10898e;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f10899f;

    /* renamed from: g, reason: collision with root package name */
    A0 f10900g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f10901h;

    /* renamed from: i, reason: collision with root package name */
    private final Looper f10902i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC1278i f10903j;

    /* renamed from: k, reason: collision with root package name */
    private final C2018j f10904k;

    /* renamed from: l, reason: collision with root package name */
    final Handler f10905l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f10906m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f10907n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC1283n f10908o;

    /* renamed from: p, reason: collision with root package name */
    protected InterfaceC0202c f10909p;

    /* renamed from: q, reason: collision with root package name */
    private IInterface f10910q;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList f10911r;

    /* renamed from: s, reason: collision with root package name */
    private o0 f10912s;

    /* renamed from: t, reason: collision with root package name */
    private int f10913t;

    /* renamed from: u, reason: collision with root package name */
    private final a f10914u;

    /* renamed from: v, reason: collision with root package name */
    private final b f10915v;

    /* renamed from: w, reason: collision with root package name */
    private final int f10916w;

    /* renamed from: x, reason: collision with root package name */
    private final String f10917x;

    /* renamed from: y, reason: collision with root package name */
    private volatile String f10918y;

    /* renamed from: z, reason: collision with root package name */
    private C2010b f10919z;

    /* renamed from: E, reason: collision with root package name */
    private static final C2012d[] f10890E = new C2012d[0];

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f10889D = {"service_esmobile", "service_googleme"};

    /* renamed from: V6.c$a */
    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i10);
    }

    /* renamed from: V6.c$b */
    public interface b {
        void onConnectionFailed(C2010b c2010b);
    }

    /* renamed from: V6.c$c, reason: collision with other inner class name */
    public interface InterfaceC0202c {
        void a(C2010b c2010b);
    }

    /* renamed from: V6.c$d */
    protected class d implements InterfaceC0202c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1267c f10920a;

        public d(AbstractC1267c abstractC1267c) {
            Objects.requireNonNull(abstractC1267c);
            this.f10920a = abstractC1267c;
        }

        @Override // V6.AbstractC1267c.InterfaceC0202c
        public final void a(C2010b c2010b) {
            if (c2010b.Z0()) {
                AbstractC1267c abstractC1267c = this.f10920a;
                abstractC1267c.q(null, abstractC1267c.H());
            } else {
                AbstractC1267c abstractC1267c2 = this.f10920a;
                if (abstractC1267c2.j0() != null) {
                    abstractC1267c2.j0().onConnectionFailed(c2010b);
                }
            }
        }
    }

    /* renamed from: V6.c$e */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected AbstractC1267c(Context context, Looper looper, int i10, a aVar, b bVar, String str) {
        this(context, looper, r3, r4, i10, aVar, bVar, str);
        AbstractC1278i b10 = AbstractC1278i.b(context);
        C2018j h10 = C2018j.h();
        AbstractC1287s.m(aVar);
        AbstractC1287s.m(bVar);
    }

    private final void n0(int i10, IInterface iInterface) {
        A0 a02;
        AbstractC1287s.a((i10 == 4) == (iInterface != null));
        synchronized (this.f10906m) {
            try {
                this.f10913t = i10;
                this.f10910q = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    o0 o0Var = this.f10912s;
                    if (o0Var != null) {
                        AbstractC1278i abstractC1278i = this.f10903j;
                        String a10 = this.f10900g.a();
                        AbstractC1287s.m(a10);
                        abstractC1278i.f(a10, this.f10900g.b(), 4225, o0Var, Y(), this.f10900g.c());
                        this.f10912s = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    o0 o0Var2 = this.f10912s;
                    if (o0Var2 != null && (a02 = this.f10900g) != null) {
                        String a11 = a02.a();
                        String b10 = a02.b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(a11).length() + 70 + String.valueOf(b10).length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(a11);
                        sb2.append(" on ");
                        sb2.append(b10);
                        Log.e("GmsClient", sb2.toString());
                        AbstractC1278i abstractC1278i2 = this.f10903j;
                        String a12 = this.f10900g.a();
                        AbstractC1287s.m(a12);
                        abstractC1278i2.f(a12, this.f10900g.b(), 4225, o0Var2, Y(), this.f10900g.c());
                        this.f10893C.incrementAndGet();
                    }
                    o0 o0Var3 = new o0(this, this.f10893C.get());
                    this.f10912s = o0Var3;
                    A0 a03 = (this.f10913t != 3 || G() == null) ? new A0(L(), K(), false, 4225, N()) : new A0(D().getPackageName(), G(), true, 4225, false);
                    this.f10900g = a03;
                    if (a03.c() && m() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f10900g.a())));
                    }
                    AbstractC1278i abstractC1278i3 = this.f10903j;
                    String a13 = this.f10900g.a();
                    AbstractC1287s.m(a13);
                    C2010b e10 = abstractC1278i3.e(new v0(a13, this.f10900g.b(), 4225, this.f10900g.c()), o0Var3, Y(), B());
                    if (!e10.Z0()) {
                        String a14 = this.f10900g.a();
                        String b11 = this.f10900g.b();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(a14).length() + 34 + String.valueOf(b11).length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(a14);
                        sb3.append(" on ");
                        sb3.append(b11);
                        Log.w("GmsClient", sb3.toString());
                        int u10 = e10.u() == -1 ? 16 : e10.u();
                        if (e10.I() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", e10.I());
                        }
                        Z(u10, bundle, this.f10893C.get());
                    }
                } else if (i10 == 4) {
                    AbstractC1287s.m(iInterface);
                    P(iInterface);
                }
            } finally {
            }
        }
    }

    public C2012d[] A() {
        return f10890E;
    }

    protected Executor B() {
        return null;
    }

    public Bundle C() {
        return null;
    }

    public final Context D() {
        return this.f10901h;
    }

    public int E() {
        return this.f10916w;
    }

    protected Bundle F() {
        return new Bundle();
    }

    protected String G() {
        return null;
    }

    protected Set H() {
        return Collections.emptySet();
    }

    public final IInterface I() {
        IInterface iInterface;
        synchronized (this.f10906m) {
            try {
                if (this.f10913t == 5) {
                    throw new DeadObjectException();
                }
                w();
                IInterface iInterface2 = this.f10910q;
                AbstractC1287s.n(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    protected abstract String J();

    protected abstract String K();

    protected String L() {
        return "com.google.android.gms";
    }

    public C1273f M() {
        r0 r0Var = this.f10892B;
        if (r0Var == null) {
            return null;
        }
        return r0Var.f11010d;
    }

    protected boolean N() {
        return m() >= 211700000;
    }

    public boolean O() {
        return this.f10892B != null;
    }

    protected void P(IInterface iInterface) {
        this.f10896c = System.currentTimeMillis();
    }

    protected void Q(C2010b c2010b) {
        this.f10897d = c2010b.u();
        this.f10898e = System.currentTimeMillis();
    }

    protected void R(int i10) {
        this.f10894a = i10;
        this.f10895b = System.currentTimeMillis();
    }

    protected void S(int i10, IBinder iBinder, Bundle bundle, int i11) {
        p0 p0Var = new p0(this, i10, iBinder, bundle);
        Handler handler = this.f10905l;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, p0Var));
    }

    public boolean T() {
        return false;
    }

    public void U(String str) {
        this.f10918y = str;
    }

    public void V(int i10) {
        int i11 = this.f10893C.get();
        Handler handler = this.f10905l;
        handler.sendMessage(handler.obtainMessage(6, i11, i10));
    }

    protected void W(InterfaceC0202c interfaceC0202c, int i10, PendingIntent pendingIntent) {
        AbstractC1287s.n(interfaceC0202c, "Connection progress callbacks cannot be null.");
        this.f10909p = interfaceC0202c;
        int i11 = this.f10893C.get();
        Handler handler = this.f10905l;
        handler.sendMessage(handler.obtainMessage(3, i11, i10, pendingIntent));
    }

    public boolean X() {
        return false;
    }

    protected final String Y() {
        String str = this.f10917x;
        return str == null ? this.f10901h.getClass().getName() : str;
    }

    protected final void Z(int i10, Bundle bundle, int i11) {
        q0 q0Var = new q0(this, i10, bundle);
        Handler handler = this.f10905l;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, q0Var));
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f10906m) {
            z10 = this.f10913t == 4;
        }
        return z10;
    }

    final /* synthetic */ void a0(r0 r0Var) {
        this.f10892B = r0Var;
        if (X()) {
            C1273f c1273f = r0Var.f11010d;
            C1288t.b().c(c1273f == null ? null : c1273f.Z0());
        }
    }

    public boolean b() {
        return false;
    }

    final /* synthetic */ void b0(int i10, IInterface iInterface) {
        n0(i10, null);
    }

    final /* synthetic */ boolean c0(int i10, int i11, IInterface iInterface) {
        synchronized (this.f10906m) {
            try {
                if (this.f10913t != i10) {
                    return false;
                }
                n0(i11, iInterface);
                return true;
            } finally {
            }
        }
    }

    public void d(String str) {
        this.f10899f = str;
        h();
    }

    final /* synthetic */ void d0(int i10) {
        int i11;
        int i12;
        synchronized (this.f10906m) {
            i11 = this.f10913t;
        }
        if (i11 == 3) {
            this.f10891A = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = this.f10905l;
        handler.sendMessage(handler.obtainMessage(i12, this.f10893C.get(), 16));
    }

    public boolean e() {
        boolean z10;
        synchronized (this.f10906m) {
            int i10 = this.f10913t;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    final /* synthetic */ boolean e0() {
        if (this.f10891A || TextUtils.isEmpty(J()) || TextUtils.isEmpty(G())) {
            return false;
        }
        try {
            Class.forName(J());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public String f() {
        A0 a02;
        if (!a() || (a02 = this.f10900g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return a02.b();
    }

    final /* synthetic */ Object f0() {
        return this.f10907n;
    }

    public void g(e eVar) {
        eVar.a();
    }

    final /* synthetic */ void g0(InterfaceC1283n interfaceC1283n) {
        this.f10908o = interfaceC1283n;
    }

    public void h() {
        this.f10893C.incrementAndGet();
        ArrayList arrayList = this.f10911r;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((m0) arrayList.get(i10)).d();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f10907n) {
            this.f10908o = null;
        }
        n0(1, null);
    }

    final /* synthetic */ ArrayList h0() {
        return this.f10911r;
    }

    final /* synthetic */ a i0() {
        return this.f10914u;
    }

    public void j(InterfaceC0202c interfaceC0202c) {
        AbstractC1287s.n(interfaceC0202c, "Connection progress callbacks cannot be null.");
        this.f10909p = interfaceC0202c;
        n0(2, null);
    }

    final /* synthetic */ b j0() {
        return this.f10915v;
    }

    public void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        InterfaceC1283n interfaceC1283n;
        synchronized (this.f10906m) {
            i10 = this.f10913t;
            iInterface = this.f10910q;
        }
        synchronized (this.f10907n) {
            interfaceC1283n = this.f10908o;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) J()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC1283n == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC1283n.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f10896c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f10896c;
            String format = simpleDateFormat.format(new Date(j10));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 1 + String.valueOf(format).length());
            sb2.append(j10);
            sb2.append(" ");
            sb2.append(format);
            append.println(sb2.toString());
        }
        if (this.f10895b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f10894a;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.f10895b;
            String format2 = simpleDateFormat.format(new Date(j11));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 1 + String.valueOf(format2).length());
            sb3.append(j11);
            sb3.append(" ");
            sb3.append(format2);
            append2.println(sb3.toString());
        }
        if (this.f10898e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) S6.d.a(this.f10897d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.f10898e;
            String format3 = simpleDateFormat.format(new Date(j12));
            StringBuilder sb4 = new StringBuilder(String.valueOf(j12).length() + 1 + String.valueOf(format3).length());
            sb4.append(j12);
            sb4.append(" ");
            sb4.append(format3);
            append3.println(sb4.toString());
        }
    }

    final /* synthetic */ C2010b k0() {
        return this.f10919z;
    }

    public boolean l() {
        return true;
    }

    final /* synthetic */ void l0(C2010b c2010b) {
        this.f10919z = c2010b;
    }

    public abstract int m();

    final /* synthetic */ boolean m0() {
        return this.f10891A;
    }

    public final C2012d[] n() {
        r0 r0Var = this.f10892B;
        if (r0Var == null) {
            return null;
        }
        return r0Var.f11008b;
    }

    public String p() {
        return this.f10899f;
    }

    public void q(InterfaceC1280k interfaceC1280k, Set set) {
        Bundle F10 = F();
        String str = Build.VERSION.SDK_INT < 31 ? this.f10918y : this.f10918y;
        int i10 = this.f10916w;
        int i11 = C2018j.f23505a;
        Scope[] scopeArr = C1275g.f10948o;
        Bundle bundle = new Bundle();
        C2012d[] c2012dArr = C1275g.f10949p;
        C1275g c1275g = new C1275g(6, i10, i11, null, null, scopeArr, bundle, null, c2012dArr, c2012dArr, true, 0, false, str);
        c1275g.f10953d = this.f10901h.getPackageName();
        c1275g.f10956g = F10;
        if (set != null) {
            c1275g.f10955f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (s()) {
            Account z10 = z();
            if (z10 == null) {
                z10 = new Account("<<default account>>", "com.google");
            }
            c1275g.f10957h = z10;
            if (interfaceC1280k != null) {
                c1275g.f10954e = interfaceC1280k.asBinder();
            }
        } else if (T()) {
            c1275g.f10957h = z();
        }
        c1275g.f10958i = f10890E;
        c1275g.f10959j = A();
        if (X()) {
            c1275g.f10962m = true;
        }
        try {
            synchronized (this.f10907n) {
                try {
                    InterfaceC1283n interfaceC1283n = this.f10908o;
                    if (interfaceC1283n != null) {
                        interfaceC1283n.H0(new n0(this, this.f10893C.get()), c1275g);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            V(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            S(8, null, null, this.f10893C.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            S(8, null, null, this.f10893C.get());
        }
    }

    public Intent r() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean s() {
        return false;
    }

    public void v() {
        int j10 = this.f10904k.j(this.f10901h, m());
        if (j10 == 0) {
            j(new d(this));
        } else {
            n0(1, null);
            W(new d(this), j10, null);
        }
    }

    protected final void w() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract IInterface x(IBinder iBinder);

    protected boolean y() {
        return false;
    }

    public Account z() {
        return null;
    }

    protected AbstractC1267c(Context context, Looper looper, AbstractC1278i abstractC1278i, C2018j c2018j, int i10, a aVar, b bVar, String str) {
        this.f10899f = null;
        this.f10906m = new Object();
        this.f10907n = new Object();
        this.f10911r = new ArrayList();
        this.f10913t = 1;
        this.f10919z = null;
        this.f10891A = false;
        this.f10892B = null;
        this.f10893C = new AtomicInteger(0);
        AbstractC1287s.n(context, "Context must not be null");
        this.f10901h = context;
        AbstractC1287s.n(looper, "Looper must not be null");
        this.f10902i = looper;
        AbstractC1287s.n(abstractC1278i, "Supervisor must not be null");
        this.f10903j = abstractC1278i;
        AbstractC1287s.n(c2018j, "API availability must not be null");
        this.f10904k = c2018j;
        this.f10905l = new l0(this, looper);
        this.f10916w = i10;
        this.f10914u = aVar;
        this.f10915v = bVar;
        this.f10917x = str;
    }
}
