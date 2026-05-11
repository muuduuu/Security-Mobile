package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import x1.InterfaceC5098b;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18435a = x1.n.i("Schedulers");

    static InterfaceC1636w c(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        androidx.work.impl.background.systemjob.g gVar = new androidx.work.impl.background.systemjob.g(context, workDatabase, aVar);
        D1.p.c(context, SystemJobService.class, true);
        x1.n.e().a(f18435a, "Created SystemJobScheduler and enabled SystemJobService");
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(List list, C1.m mVar, androidx.work.a aVar, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC1636w) it.next()).c(mVar.b());
        }
        h(aVar, workDatabase, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Executor executor, final List list, final androidx.work.a aVar, final WorkDatabase workDatabase, final C1.m mVar, boolean z10) {
        executor.execute(new Runnable() { // from class: androidx.work.impl.y
            @Override // java.lang.Runnable
            public final void run() {
                z.d(list, mVar, aVar, workDatabase);
            }
        });
    }

    private static void f(C1.v vVar, InterfaceC5098b interfaceC5098b, List list) {
        if (list.size() > 0) {
            long a10 = interfaceC5098b.a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vVar.c(((C1.u) it.next()).f790a, a10);
            }
        }
    }

    public static void g(final List list, C1634u c1634u, final Executor executor, final WorkDatabase workDatabase, final androidx.work.a aVar) {
        c1634u.e(new InterfaceC1620f() { // from class: androidx.work.impl.x
            @Override // androidx.work.impl.InterfaceC1620f
            public final void e(C1.m mVar, boolean z10) {
                z.e(executor, list, aVar, workDatabase, mVar, z10);
            }
        });
    }

    public static void h(androidx.work.a aVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        C1.v K10 = workDatabase.K();
        workDatabase.e();
        try {
            List q10 = K10.q();
            f(K10, aVar.a(), q10);
            List f10 = K10.f(aVar.h());
            f(K10, aVar.a(), f10);
            if (q10 != null) {
                f10.addAll(q10);
            }
            List A10 = K10.A(200);
            workDatabase.D();
            workDatabase.i();
            if (f10.size() > 0) {
                C1.u[] uVarArr = (C1.u[]) f10.toArray(new C1.u[f10.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC1636w interfaceC1636w = (InterfaceC1636w) it.next();
                    if (interfaceC1636w.b()) {
                        interfaceC1636w.a(uVarArr);
                    }
                }
            }
            if (A10.size() > 0) {
                C1.u[] uVarArr2 = (C1.u[]) A10.toArray(new C1.u[A10.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC1636w interfaceC1636w2 = (InterfaceC1636w) it2.next();
                    if (!interfaceC1636w2.b()) {
                        interfaceC1636w2.a(uVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.i();
            throw th;
        }
    }
}
