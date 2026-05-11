package C7;

import V6.AbstractC1287s;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.f;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.q;
import com.google.android.gms.common.util.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import v7.AbstractC4969h;
import v7.C4963b;
import v7.C4970i;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: r, reason: collision with root package name */
    private static final long f1011r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s, reason: collision with root package name */
    private static volatile ScheduledExecutorService f1012s = null;

    /* renamed from: t, reason: collision with root package name */
    private static final Object f1013t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static volatile e f1014u = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f1015a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f1016b;

    /* renamed from: c, reason: collision with root package name */
    private int f1017c;

    /* renamed from: d, reason: collision with root package name */
    private Future f1018d;

    /* renamed from: e, reason: collision with root package name */
    private long f1019e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f1020f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1021g;

    /* renamed from: h, reason: collision with root package name */
    private int f1022h;

    /* renamed from: i, reason: collision with root package name */
    C4963b f1023i;

    /* renamed from: j, reason: collision with root package name */
    private f f1024j;

    /* renamed from: k, reason: collision with root package name */
    private WorkSource f1025k;

    /* renamed from: l, reason: collision with root package name */
    private final String f1026l;

    /* renamed from: m, reason: collision with root package name */
    private final String f1027m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f1028n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f1029o;

    /* renamed from: p, reason: collision with root package name */
    private AtomicInteger f1030p;

    /* renamed from: q, reason: collision with root package name */
    private final ScheduledExecutorService f1031q;

    public a(Context context, int i10, String str) {
        String packageName = context.getPackageName();
        this.f1015a = new Object();
        this.f1017c = 0;
        this.f1020f = new HashSet();
        this.f1021g = true;
        this.f1024j = i.d();
        this.f1029o = new HashMap();
        this.f1030p = new AtomicInteger(0);
        AbstractC1287s.n(context, "WakeLock: context must not be null");
        AbstractC1287s.h(str, "WakeLock: wakeLockName must not be empty");
        this.f1028n = context.getApplicationContext();
        this.f1027m = str;
        this.f1023i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f1026l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.f1026l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new C4970i(sb2.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i10, str);
        this.f1016b = newWakeLock;
        if (s.c(context)) {
            WorkSource b10 = s.b(context, q.a(packageName) ? context.getPackageName() : packageName);
            this.f1025k = b10;
            if (b10 != null) {
                i(newWakeLock, b10);
            }
        }
        ScheduledExecutorService scheduledExecutorService = f1012s;
        if (scheduledExecutorService == null) {
            synchronized (f1013t) {
                try {
                    scheduledExecutorService = f1012s;
                    if (scheduledExecutorService == null) {
                        AbstractC4969h.a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f1012s = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f1031q = scheduledExecutorService;
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f1015a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.f1026l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.g();
                    if (aVar.b()) {
                        aVar.f1017c = 1;
                        aVar.h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String f(String str) {
        if (this.f1021g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void g() {
        if (this.f1020f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f1020f);
        this.f1020f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(arrayList.get(0));
        throw null;
    }

    private final void h(int i10) {
        synchronized (this.f1015a) {
            try {
                if (b()) {
                    if (this.f1021g) {
                        int i11 = this.f1017c - 1;
                        this.f1017c = i11;
                        if (i11 > 0) {
                            return;
                        }
                    } else {
                        this.f1017c = 0;
                    }
                    g();
                    Iterator it = this.f1029o.values().iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).f1033a = 0;
                    }
                    this.f1029o.clear();
                    Future future = this.f1018d;
                    if (future != null) {
                        future.cancel(false);
                        this.f1018d = null;
                        this.f1019e = 0L;
                    }
                    this.f1022h = 0;
                    if (this.f1016b.isHeld()) {
                        try {
                            try {
                                this.f1016b.release();
                                if (this.f1023i != null) {
                                    this.f1023i = null;
                                }
                            } catch (RuntimeException e10) {
                                if (!e10.getClass().equals(RuntimeException.class)) {
                                    throw e10;
                                }
                                Log.e("WakeLock", String.valueOf(this.f1026l).concat(" failed to release!"), e10);
                                if (this.f1023i != null) {
                                    this.f1023i = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f1023i != null) {
                                this.f1023i = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f1026l).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f1030p.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f1011r), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f1015a) {
            try {
                if (!b()) {
                    this.f1023i = C4963b.a(false, null);
                    this.f1016b.acquire();
                    this.f1024j.c();
                }
                this.f1017c++;
                this.f1022h++;
                f(null);
                d dVar = (d) this.f1029o.get(null);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f1029o.put(null, dVar);
                }
                dVar.f1033a++;
                long c10 = this.f1024j.c();
                long j11 = Long.MAX_VALUE - c10 > max ? c10 + max : Long.MAX_VALUE;
                if (j11 > this.f1019e) {
                    this.f1019e = j11;
                    Future future = this.f1018d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f1018d = this.f1031q.schedule(new Runnable() { // from class: C7.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.e(a.this);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f1015a) {
            z10 = this.f1017c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f1030p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f1026l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f1015a) {
            try {
                f(null);
                if (this.f1029o.containsKey(null)) {
                    d dVar = (d) this.f1029o.get(null);
                    if (dVar != null) {
                        int i10 = dVar.f1033a - 1;
                        dVar.f1033a = i10;
                        if (i10 == 0) {
                            this.f1029o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f1026l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z10) {
        synchronized (this.f1015a) {
            this.f1021g = z10;
        }
    }
}
