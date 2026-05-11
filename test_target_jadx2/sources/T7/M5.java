package t7;

import V6.C1284o;
import X8.AbstractC1297c;
import X8.C1301g;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class M5 {

    /* renamed from: k, reason: collision with root package name */
    private static P f42596k;

    /* renamed from: l, reason: collision with root package name */
    private static final S f42597l = S.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    private final String f42598a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42599b;

    /* renamed from: c, reason: collision with root package name */
    private final L5 f42600c;

    /* renamed from: d, reason: collision with root package name */
    private final X8.m f42601d;

    /* renamed from: e, reason: collision with root package name */
    private final Task f42602e;

    /* renamed from: f, reason: collision with root package name */
    private final Task f42603f;

    /* renamed from: g, reason: collision with root package name */
    private final String f42604g;

    /* renamed from: h, reason: collision with root package name */
    private final int f42605h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f42606i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f42607j = new HashMap();

    public M5(Context context, final X8.m mVar, L5 l52, String str) {
        this.f42598a = context.getPackageName();
        this.f42599b = AbstractC1297c.a(context);
        this.f42601d = mVar;
        this.f42600c = l52;
        Z5.a();
        this.f42604g = str;
        this.f42602e = C1301g.a().b(new Callable() { // from class: t7.J5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return M5.this.b();
            }
        });
        C1301g a10 = C1301g.a();
        mVar.getClass();
        this.f42603f = a10.b(new Callable() { // from class: t7.I5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return X8.m.this.a();
            }
        });
        S s10 = f42597l;
        this.f42605h = s10.containsKey(str) ? DynamiteModule.b(context, (String) s10.get(str)) : -1;
    }

    static long a(List list, double d10) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    private static synchronized P i() {
        synchronized (M5.class) {
            try {
                P p10 = f42596k;
                if (p10 != null) {
                    return p10;
                }
                androidx.core.os.i a10 = androidx.core.os.e.a(Resources.getSystem().getConfiguration());
                M m10 = new M();
                for (int i10 = 0; i10 < a10.f(); i10++) {
                    m10.c(AbstractC1297c.b(a10.c(i10)));
                }
                P d10 = m10.d();
                f42596k = d10;
                return d10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String j() {
        return this.f42602e.isSuccessful() ? (String) this.f42602e.getResult() : C1284o.a().b(this.f42604g);
    }

    private final boolean k(EnumC4728m4 enumC4728m4, long j10, long j11) {
        return this.f42606i.get(enumC4728m4) == null || j10 - ((Long) this.f42606i.get(enumC4728m4)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final /* synthetic */ String b() {
        return C1284o.a().b(this.f42604g);
    }

    public final void c(K5 k52, EnumC4728m4 enumC4728m4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (k(enumC4728m4, elapsedRealtime, 30L)) {
            this.f42606i.put(enumC4728m4, Long.valueOf(elapsedRealtime));
            h(k52.zza(), enumC4728m4, j());
        }
    }

    final /* synthetic */ void d(Q5 q52, EnumC4728m4 enumC4728m4, String str) {
        q52.f(enumC4728m4);
        String b10 = q52.b();
        C4666d5 c4666d5 = new C4666d5();
        c4666d5.b(this.f42598a);
        c4666d5.c(this.f42599b);
        c4666d5.h(i());
        c4666d5.g(Boolean.TRUE);
        c4666d5.l(b10);
        c4666d5.j(str);
        c4666d5.i(this.f42603f.isSuccessful() ? (String) this.f42603f.getResult() : this.f42601d.a());
        c4666d5.d(10);
        c4666d5.k(Integer.valueOf(this.f42605h));
        q52.g(c4666d5);
        this.f42600c.a(q52);
    }

    final /* synthetic */ void e(EnumC4728m4 enumC4728m4, h9.g gVar) {
        V v10 = (V) this.f42607j.get(enumC4728m4);
        if (v10 != null) {
            for (Object obj : v10.k()) {
                ArrayList arrayList = new ArrayList(v10.a(obj));
                Collections.sort(arrayList);
                L3 l32 = new L3();
                Iterator it = arrayList.iterator();
                long j10 = 0;
                while (it.hasNext()) {
                    j10 += ((Long) it.next()).longValue();
                }
                l32.a(Long.valueOf(j10 / arrayList.size()));
                l32.c(Long.valueOf(a(arrayList, 100.0d)));
                l32.f(Long.valueOf(a(arrayList, 75.0d)));
                l32.d(Long.valueOf(a(arrayList, 50.0d)));
                l32.b(Long.valueOf(a(arrayList, 25.0d)));
                l32.e(Long.valueOf(a(arrayList, 0.0d)));
                h(gVar.a(obj, arrayList.size(), l32.g()), enumC4728m4, j());
            }
            this.f42607j.remove(enumC4728m4);
        }
    }

    final /* synthetic */ void f(final EnumC4728m4 enumC4728m4, Object obj, long j10, final h9.g gVar) {
        if (!this.f42607j.containsKey(enumC4728m4)) {
            this.f42607j.put(enumC4728m4, C4771t.r());
        }
        ((V) this.f42607j.get(enumC4728m4)).c(obj, Long.valueOf(j10));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (k(enumC4728m4, elapsedRealtime, 30L)) {
            this.f42606i.put(enumC4728m4, Long.valueOf(elapsedRealtime));
            final byte[] bArr = null;
            C1301g.d().execute(new Runnable(enumC4728m4, gVar, bArr) { // from class: t7.F5

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ EnumC4728m4 f42516b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ h9.g f42517c;

                @Override // java.lang.Runnable
                public final void run() {
                    M5.this.e(this.f42516b, this.f42517c);
                }
            });
        }
    }

    public final void g(Q5 q52, EnumC4728m4 enumC4728m4) {
        h(q52, enumC4728m4, j());
    }

    public final void h(final Q5 q52, final EnumC4728m4 enumC4728m4, final String str) {
        final byte[] bArr = null;
        C1301g.d().execute(new Runnable(q52, enumC4728m4, str, bArr) { // from class: t7.H5

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnumC4728m4 f42541b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f42542c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Q5 f42543d;

            @Override // java.lang.Runnable
            public final void run() {
                M5.this.d(this.f42543d, this.f42541b, this.f42542c);
            }
        });
    }
}
