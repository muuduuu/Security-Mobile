package p7;

import D7.AbstractC0777a;
import D7.C0787k;
import D7.InterfaceC0784h;
import T6.C1181k;
import T6.C1182l;
import T6.InterfaceC1169e;
import T6.InterfaceC1184n;
import V6.AbstractC1277h;
import V6.AbstractC1287s;
import V6.C1271e;
import V6.InterfaceC1281l;
import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.C2012d;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import x7.C5118a;
import x7.C5127j;
import x7.C5128k;

/* renamed from: p7.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3809d0 extends AbstractC1277h {

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f38414L = 0;

    /* renamed from: I, reason: collision with root package name */
    private final j0.i f38415I;

    /* renamed from: J, reason: collision with root package name */
    private final j0.i f38416J;

    /* renamed from: K, reason: collision with root package name */
    private final j0.i f38417K;

    public C3809d0(Context context, Looper looper, C1271e c1271e, InterfaceC1169e interfaceC1169e, InterfaceC1184n interfaceC1184n) {
        super(context, looper, 23, c1271e, interfaceC1169e, interfaceC1184n);
        this.f38415I = new j0.i();
        this.f38416J = new j0.i();
        this.f38417K = new j0.i();
    }

    private final boolean u0(C2012d c2012d) {
        C2012d c2012d2;
        C2012d[] n10 = n();
        if (n10 == null) {
            return false;
        }
        int length = n10.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                c2012d2 = null;
                break;
            }
            c2012d2 = n10[i10];
            if (c2012d.u().equals(c2012d2.u())) {
                break;
            }
            i10++;
        }
        return c2012d2 != null && c2012d2.F() >= c2012d.F();
    }

    @Override // V6.AbstractC1267c
    public final C2012d[] A() {
        return x7.E.f44821l;
    }

    public final void A0(PendingIntent pendingIntent, LocationRequest locationRequest, C0787k c0787k) {
        D();
        if (u0(x7.E.f44819j)) {
            ((K0) I()).h0(C3811e0.j(pendingIntent, null, null), locationRequest, new M(this, null, c0787k));
            return;
        }
        K0 k02 = (K0) I();
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        aVar.k(null);
        k02.z0(new C3819i0(1, C3815g0.j(null, aVar.a()), null, null, pendingIntent, new O(null, c0787k), "PendingIntent@" + pendingIntent.hashCode()));
    }

    public final void B0(PendingIntent pendingIntent, C0787k c0787k) {
        AbstractC1287s.n(pendingIntent, "PendingIntent must be specified.");
        ((K0) I()).j1(pendingIntent, new J(c0787k), D().getPackageName());
    }

    @Override // V6.AbstractC1267c
    protected final String J() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // V6.AbstractC1267c
    protected final String K() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // V6.AbstractC1267c
    public final void R(int i10) {
        super.R(i10);
        synchronized (this.f38415I) {
            this.f38415I.clear();
        }
        synchronized (this.f38416J) {
            this.f38416J.clear();
        }
        synchronized (this.f38417K) {
            this.f38417K.clear();
        }
    }

    @Override // V6.AbstractC1267c
    public final boolean X() {
        return true;
    }

    @Override // V6.AbstractC1267c, S6.a.f
    public final int m() {
        return 11717000;
    }

    public final void r0(C1181k.a aVar, boolean z10, C0787k c0787k) {
        synchronized (this.f38416J) {
            try {
                Y y10 = (Y) this.f38416J.remove(aVar);
                if (y10 == null) {
                    c0787k.c(Boolean.FALSE);
                    return;
                }
                y10.n1();
                if (!z10) {
                    c0787k.c(Boolean.TRUE);
                } else if (u0(x7.E.f44819j)) {
                    ((K0) I()).I0(C3811e0.u(null, y10, null, null), new M(this, Boolean.TRUE, c0787k));
                } else {
                    ((K0) I()).z0(new C3819i0(2, null, null, y10, null, new O(Boolean.TRUE, c0787k), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s0(C1181k.a aVar, boolean z10, C0787k c0787k) {
        synchronized (this.f38415I) {
            try {
                BinderC3805b0 binderC3805b0 = (BinderC3805b0) this.f38415I.remove(aVar);
                if (binderC3805b0 == null) {
                    c0787k.c(Boolean.FALSE);
                    return;
                }
                binderC3805b0.n1();
                if (!z10) {
                    c0787k.c(Boolean.TRUE);
                } else if (u0(x7.E.f44819j)) {
                    ((K0) I()).I0(C3811e0.F(null, binderC3805b0, null, null), new M(this, Boolean.TRUE, c0787k));
                } else {
                    ((K0) I()).z0(new C3819i0(2, null, binderC3805b0, null, null, new O(Boolean.TRUE, c0787k), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t0(PendingIntent pendingIntent, C0787k c0787k, Object obj) {
        if (u0(x7.E.f44819j)) {
            ((K0) I()).I0(C3811e0.j(pendingIntent, null, null), new M(this, null, c0787k));
        } else {
            ((K0) I()).z0(new C3819i0(2, null, null, null, pendingIntent, new O(null, c0787k), null));
        }
    }

    public final void v0(C5127j c5127j, PendingIntent pendingIntent, C0787k c0787k) {
        AbstractC1287s.n(c5127j, "geofencingRequest can't be null.");
        AbstractC1287s.n(pendingIntent, "PendingIntent must be specified.");
        ((K0) I()).M0(c5127j, pendingIntent, new J(c0787k));
    }

    public final void w0(C5118a c5118a, AbstractC0777a abstractC0777a, final C0787k c0787k) {
        D();
        if (u0(x7.E.f44814e)) {
            final InterfaceC1281l l02 = ((K0) I()).l0(c5118a, new N(this, c0787k));
            if (abstractC0777a != null) {
                abstractC0777a.b(new InterfaceC0784h() { // from class: p7.G
                    @Override // D7.InterfaceC0784h
                    public final void a() {
                        InterfaceC1281l interfaceC1281l = InterfaceC1281l.this;
                        int i10 = C3809d0.f38414L;
                        try {
                            interfaceC1281l.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        C1181k b10 = C1182l.b(new K(this, c0787k), A0.a(), "GetCurrentLocation");
        final C1181k.a b11 = b10.b();
        b11.getClass();
        L l10 = new L(this, b10, c0787k);
        C0787k c0787k2 = new C0787k();
        LocationRequest.a aVar = new LocationRequest.a(c5118a.I(), 0L);
        aVar.g(0L);
        aVar.b(c5118a.j());
        aVar.c(c5118a.u());
        aVar.d(c5118a.F());
        aVar.j(c5118a.g1());
        aVar.l(c5118a.y0());
        aVar.i(true);
        aVar.k(c5118a.a1());
        aVar.m(c5118a.Z0());
        y0(l10, aVar.a(), c0787k2);
        c0787k2.a().addOnCompleteListener(new OnCompleteListener() { // from class: p7.H
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C0787k c0787k3 = C0787k.this;
                int i10 = C3809d0.f38414L;
                if (task.isSuccessful()) {
                    return;
                }
                Exception exception = task.getException();
                exception.getClass();
                c0787k3.d(exception);
            }
        });
        if (abstractC0777a != null) {
            abstractC0777a.b(new InterfaceC0784h() { // from class: p7.I
                @Override // D7.InterfaceC0784h
                public final void a() {
                    try {
                        C3809d0.this.r0(b11, true, new C0787k());
                    } catch (RemoteException unused) {
                    }
                }
            });
        }
    }

    @Override // V6.AbstractC1267c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof K0 ? (K0) queryLocalInterface : new J0(iBinder);
    }

    public final void x0(C5128k c5128k, C0787k c0787k) {
        D();
        if (u0(x7.E.f44815f)) {
            ((K0) I()).S(c5128k, new N(this, c0787k));
        } else {
            c0787k.c(((K0) I()).f());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003d, B:11:0x0046, B:12:0x0082, B:16:0x0059, B:17:0x0030), top: B:3:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003d, B:11:0x0046, B:12:0x0082, B:16:0x0059, B:17:0x0030), top: B:3:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(U u10, LocationRequest locationRequest, C0787k c0787k) {
        Y y10;
        C1181k zza = u10.zza();
        C1181k.a b10 = zza.b();
        b10.getClass();
        boolean u02 = u0(x7.E.f44819j);
        synchronized (this.f38416J) {
            try {
                Y y11 = (Y) this.f38416J.get(b10);
                if (y11 != null && !u02) {
                    y11.m1(zza);
                    y10 = y11;
                    y11 = null;
                    D();
                    String a10 = b10.a();
                    if (u02) {
                        K0 k02 = (K0) I();
                        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
                        aVar.k(null);
                        k02.z0(new C3819i0(1, C3815g0.j(null, aVar.a()), null, y10, null, new Q(c0787k, y10), a10));
                    } else {
                        ((K0) I()).h0(C3811e0.u(y11, y10, null, a10), locationRequest, new M(this, null, c0787k));
                    }
                }
                Y y12 = new Y(u10);
                this.f38416J.put(b10, y12);
                y10 = y12;
                D();
                String a102 = b10.a();
                if (u02) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003d, B:11:0x0046, B:12:0x0082, B:16:0x0059, B:17:0x0030), top: B:3:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x001a, B:8:0x0028, B:9:0x003d, B:11:0x0046, B:12:0x0082, B:16:0x0059, B:17:0x0030), top: B:3:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0(U u10, LocationRequest locationRequest, C0787k c0787k) {
        BinderC3805b0 binderC3805b0;
        C1181k zza = u10.zza();
        C1181k.a b10 = zza.b();
        b10.getClass();
        boolean u02 = u0(x7.E.f44819j);
        synchronized (this.f38415I) {
            try {
                BinderC3805b0 binderC3805b02 = (BinderC3805b0) this.f38415I.get(b10);
                if (binderC3805b02 != null && !u02) {
                    binderC3805b02.m1(zza);
                    binderC3805b0 = binderC3805b02;
                    binderC3805b02 = null;
                    D();
                    String a10 = b10.a();
                    if (u02) {
                        K0 k02 = (K0) I();
                        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
                        aVar.k(null);
                        k02.z0(new C3819i0(1, C3815g0.j(null, aVar.a()), binderC3805b0, null, null, new P(c0787k, binderC3805b0), a10));
                    } else {
                        ((K0) I()).h0(C3811e0.F(binderC3805b02, binderC3805b0, null, a10), locationRequest, new M(this, null, c0787k));
                    }
                }
                BinderC3805b0 binderC3805b03 = new BinderC3805b0(u10);
                this.f38415I.put(b10, binderC3805b03);
                binderC3805b0 = binderC3805b03;
                D();
                String a102 = b10.a();
                if (u02) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
