package r7;

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

/* renamed from: r7.s8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4217s8 {

    /* renamed from: k, reason: collision with root package name */
    private static AbstractC4140l0 f40262k;

    /* renamed from: l, reason: collision with root package name */
    private static final AbstractC4160n0 f40263l = AbstractC4160n0.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    private final String f40264a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40265b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4118i8 f40266c;

    /* renamed from: d, reason: collision with root package name */
    private final X8.m f40267d;

    /* renamed from: e, reason: collision with root package name */
    private final Task f40268e;

    /* renamed from: f, reason: collision with root package name */
    private final Task f40269f;

    /* renamed from: g, reason: collision with root package name */
    private final String f40270g;

    /* renamed from: h, reason: collision with root package name */
    private final int f40271h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f40272i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f40273j = new HashMap();

    public C4217s8(Context context, final X8.m mVar, InterfaceC4118i8 interfaceC4118i8, String str) {
        this.f40264a = context.getPackageName();
        this.f40265b = AbstractC1297c.a(context);
        this.f40267d = mVar;
        this.f40266c = interfaceC4118i8;
        F8.a();
        this.f40270g = str;
        this.f40268e = C1301g.a().b(new Callable() { // from class: r7.m8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C4217s8.this.b();
            }
        });
        C1301g a10 = C1301g.a();
        mVar.getClass();
        this.f40269f = a10.b(new Callable() { // from class: r7.n8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return X8.m.this.a();
            }
        });
        AbstractC4160n0 abstractC4160n0 = f40263l;
        this.f40271h = abstractC4160n0.containsKey(str) ? DynamiteModule.b(context, (String) abstractC4160n0.get(str)) : -1;
    }

    static long a(List list, double d10) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    private static synchronized AbstractC4140l0 i() {
        synchronized (C4217s8.class) {
            try {
                AbstractC4140l0 abstractC4140l0 = f40262k;
                if (abstractC4140l0 != null) {
                    return abstractC4140l0;
                }
                androidx.core.os.i a10 = androidx.core.os.e.a(Resources.getSystem().getConfiguration());
                C4110i0 c4110i0 = new C4110i0();
                for (int i10 = 0; i10 < a10.f(); i10++) {
                    c4110i0.e(AbstractC1297c.b(a10.c(i10)));
                }
                AbstractC4140l0 g10 = c4110i0.g();
                f40262k = g10;
                return g10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String j() {
        return this.f40268e.isSuccessful() ? (String) this.f40268e.getResult() : C1284o.a().b(this.f40270g);
    }

    private final boolean k(EnumC4086f6 enumC4086f6, long j10, long j11) {
        return this.f40272i.get(enumC4086f6) == null || j10 - ((Long) this.f40272i.get(enumC4086f6)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final /* synthetic */ String b() {
        return C1284o.a().b(this.f40270g);
    }

    final /* synthetic */ void c(InterfaceC4108h8 interfaceC4108h8, EnumC4086f6 enumC4086f6, String str) {
        interfaceC4108h8.a(enumC4086f6);
        String f10 = interfaceC4108h8.f();
        D7 d72 = new D7();
        d72.b(this.f40264a);
        d72.c(this.f40265b);
        d72.h(i());
        d72.g(Boolean.TRUE);
        d72.l(f10);
        d72.j(str);
        d72.i(this.f40269f.isSuccessful() ? (String) this.f40269f.getResult() : this.f40267d.a());
        d72.d(10);
        d72.k(Integer.valueOf(this.f40271h));
        interfaceC4108h8.c(d72);
        this.f40266c.a(interfaceC4108h8);
    }

    public final void d(InterfaceC4108h8 interfaceC4108h8, EnumC4086f6 enumC4086f6) {
        e(interfaceC4108h8, enumC4086f6, j());
    }

    public final void e(final InterfaceC4108h8 interfaceC4108h8, final EnumC4086f6 enumC4086f6, final String str) {
        C1301g.d().execute(new Runnable() { // from class: r7.o8
            @Override // java.lang.Runnable
            public final void run() {
                C4217s8.this.c(interfaceC4108h8, enumC4086f6, str);
            }
        });
    }

    public final void f(InterfaceC4207r8 interfaceC4207r8, EnumC4086f6 enumC4086f6) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (k(enumC4086f6, elapsedRealtime, 30L)) {
            this.f40272i.put(enumC4086f6, Long.valueOf(elapsedRealtime));
            e(interfaceC4207r8.zza(), enumC4086f6, j());
        }
    }

    final /* synthetic */ void g(EnumC4086f6 enumC4086f6, d9.j jVar) {
        InterfaceC4190q0 interfaceC4190q0 = (InterfaceC4190q0) this.f40273j.get(enumC4086f6);
        if (interfaceC4190q0 != null) {
            for (Object obj : interfaceC4190q0.w()) {
                ArrayList arrayList = new ArrayList(interfaceC4190q0.c(obj));
                Collections.sort(arrayList);
                D5 d52 = new D5();
                Iterator it = arrayList.iterator();
                long j10 = 0;
                while (it.hasNext()) {
                    j10 += ((Long) it.next()).longValue();
                }
                d52.a(Long.valueOf(j10 / arrayList.size()));
                d52.c(Long.valueOf(a(arrayList, 100.0d)));
                d52.f(Long.valueOf(a(arrayList, 75.0d)));
                d52.d(Long.valueOf(a(arrayList, 50.0d)));
                d52.b(Long.valueOf(a(arrayList, 25.0d)));
                d52.e(Long.valueOf(a(arrayList, 0.0d)));
                e(jVar.a(obj, arrayList.size(), d52.g()), enumC4086f6, j());
            }
            this.f40273j.remove(enumC4086f6);
        }
    }

    final /* synthetic */ void h(final EnumC4086f6 enumC4086f6, Object obj, long j10, final d9.j jVar) {
        if (!this.f40273j.containsKey(enumC4086f6)) {
            this.f40273j.put(enumC4086f6, N.n());
        }
        ((InterfaceC4190q0) this.f40273j.get(enumC4086f6)).a(obj, Long.valueOf(j10));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (k(enumC4086f6, elapsedRealtime, 30L)) {
            this.f40272i.put(enumC4086f6, Long.valueOf(elapsedRealtime));
            C1301g.d().execute(new Runnable() { // from class: r7.q8
                @Override // java.lang.Runnable
                public final void run() {
                    C4217s8.this.g(enumC4086f6, jVar);
                }
            });
        }
    }
}
