package D1;

import C1.C0748a;
import C1.InterfaceC0749b;
import C1.u;
import android.text.TextUtils;
import androidx.work.impl.C1631q;
import androidx.work.impl.P;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import x1.AbstractC5095B;
import x1.EnumC5103g;
import x1.r;
import x1.z;

/* renamed from: D1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC0773c implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private static final String f1143c = x1.n.i("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.C f1144a;

    /* renamed from: b, reason: collision with root package name */
    private final C1631q f1145b;

    public RunnableC0773c(androidx.work.impl.C c10) {
        this(c10, new C1631q());
    }

    private static boolean b(androidx.work.impl.C c10) {
        boolean c11 = c(c10.g(), c10.f(), (String[]) androidx.work.impl.C.l(c10).toArray(new String[0]), c10.d(), c10.b());
        c10.k();
        return c11;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean c(P p10, List list, String[] strArr, String str, EnumC5103g enumC5103g) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Iterator it;
        InterfaceC0749b interfaceC0749b;
        String[] strArr2 = strArr;
        long a10 = p10.l().a().a();
        WorkDatabase s10 = p10.s();
        boolean z14 = strArr2 != null && strArr2.length > 0;
        if (z14) {
            z10 = false;
            z11 = false;
            z12 = true;
            for (String str2 : strArr2) {
                C1.u s11 = s10.K().s(str2);
                if (s11 == null) {
                    x1.n.e().c(f1143c, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                z.c cVar = s11.f791b;
                z12 &= cVar == z.c.SUCCEEDED;
                if (cVar == z.c.FAILED) {
                    z11 = true;
                } else if (cVar == z.c.CANCELLED) {
                    z10 = true;
                }
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!isEmpty && !z14) {
            List<u.b> d10 = s10.K().d(str);
            if (!d10.isEmpty()) {
                if (enumC5103g != EnumC5103g.APPEND && enumC5103g != EnumC5103g.APPEND_OR_REPLACE) {
                    if (enumC5103g == EnumC5103g.KEEP) {
                        Iterator it2 = d10.iterator();
                        while (it2.hasNext()) {
                            z.c cVar2 = ((u.b) it2.next()).f814b;
                            if (cVar2 == z.c.ENQUEUED || cVar2 == z.c.RUNNING) {
                                return false;
                            }
                        }
                    }
                    AbstractRunnableC0772b.c(str, p10, false).run();
                    C1.v K10 = s10.K();
                    Iterator it3 = d10.iterator();
                    while (it3.hasNext()) {
                        K10.a(((u.b) it3.next()).f813a);
                    }
                    z13 = true;
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    return z13;
                }
                InterfaceC0749b F10 = s10.F();
                List arrayList = new ArrayList();
                for (u.b bVar : d10) {
                    if (F10.d(bVar.f813a)) {
                        interfaceC0749b = F10;
                    } else {
                        z.c cVar3 = bVar.f814b;
                        interfaceC0749b = F10;
                        boolean z15 = (cVar3 == z.c.SUCCEEDED) & z12;
                        if (cVar3 == z.c.FAILED) {
                            z11 = true;
                        } else if (cVar3 == z.c.CANCELLED) {
                            z10 = true;
                        }
                        arrayList.add(bVar.f813a);
                        z12 = z15;
                    }
                    F10 = interfaceC0749b;
                }
                if (enumC5103g == EnumC5103g.APPEND_OR_REPLACE && (z10 || z11)) {
                    C1.v K11 = s10.K();
                    Iterator it4 = K11.d(str).iterator();
                    while (it4.hasNext()) {
                        K11.a(((u.b) it4.next()).f813a);
                    }
                    arrayList = Collections.emptyList();
                    z10 = false;
                    z11 = false;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                z14 = strArr2.length > 0;
                z13 = false;
                it = list.iterator();
                while (it.hasNext()) {
                    AbstractC5095B abstractC5095B = (AbstractC5095B) it.next();
                    C1.u d11 = abstractC5095B.d();
                    if (!z14 || z12) {
                        d11.f803n = a10;
                    } else if (z11) {
                        d11.f791b = z.c.FAILED;
                    } else if (z10) {
                        d11.f791b = z.c.CANCELLED;
                    } else {
                        d11.f791b = z.c.BLOCKED;
                    }
                    Iterator it5 = it;
                    if (d11.f791b == z.c.ENQUEUED) {
                        z13 = true;
                    }
                    s10.K().o(AbstractC0774d.c(p10.q(), d11));
                    if (z14) {
                        int length = strArr2.length;
                        int i10 = 0;
                        while (i10 < length) {
                            s10.F().a(new C0748a(abstractC5095B.b(), strArr2[i10]));
                            i10++;
                            length = length;
                            strArr2 = strArr2;
                        }
                    }
                    String[] strArr3 = strArr2;
                    s10.L().c(abstractC5095B.b(), abstractC5095B.c());
                    if (!isEmpty) {
                        s10.I().a(new C1.n(str, abstractC5095B.b()));
                    }
                    it = it5;
                    strArr2 = strArr3;
                }
                return z13;
            }
        }
        z13 = false;
        it = list.iterator();
        while (it.hasNext()) {
        }
        return z13;
    }

    private static boolean e(androidx.work.impl.C c10) {
        List<androidx.work.impl.C> e10 = c10.e();
        boolean z10 = false;
        if (e10 != null) {
            for (androidx.work.impl.C c11 : e10) {
                if (c11.j()) {
                    x1.n.e().k(f1143c, "Already enqueued work ids (" + TextUtils.join(", ", c11.c()) + ")");
                } else {
                    z10 |= e(c11);
                }
            }
        }
        return b(c10) | z10;
    }

    public boolean a() {
        P g10 = this.f1144a.g();
        WorkDatabase s10 = g10.s();
        s10.e();
        try {
            AbstractC0774d.a(s10, g10.l(), this.f1144a);
            boolean e10 = e(this.f1144a);
            s10.D();
            return e10;
        } finally {
            s10.i();
        }
    }

    public x1.r d() {
        return this.f1145b;
    }

    public void f() {
        P g10 = this.f1144a.g();
        androidx.work.impl.z.h(g10.l(), g10.s(), g10.q());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f1144a.h()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.f1144a + ")");
            }
            if (a()) {
                p.c(this.f1144a.g().k(), RescheduleReceiver.class, true);
                f();
            }
            this.f1145b.a(x1.r.f44711a);
        } catch (Throwable th) {
            this.f1145b.a(new r.b.a(th));
        }
    }

    public RunnableC0773c(androidx.work.impl.C c10, C1631q c1631q) {
        this.f1144a = c10;
        this.f1145b = c1631q;
    }
}
