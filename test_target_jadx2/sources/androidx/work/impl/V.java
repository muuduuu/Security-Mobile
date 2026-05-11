package androidx.work.impl;

import C1.u;
import D1.AbstractC0774d;
import D1.RunnableC0773c;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x1.AbstractC5094A;
import x1.AbstractC5095B;
import x1.EnumC5103g;
import x1.r;
import x1.z;

/* loaded from: classes.dex */
public abstract class V {

    static final class a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5095B f18202a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ P f18203b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f18204c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1631q f18205d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC5095B abstractC5095B, P p10, String str, C1631q c1631q) {
            super(0);
            this.f18202a = abstractC5095B;
            this.f18203b = p10;
            this.f18204c = str;
            this.f18205d = c1631q;
        }

        public final void a() {
            new RunnableC0773c(new C(this.f18203b, this.f18204c, EnumC5103g.KEEP, CollectionsKt.e(this.f18202a)), this.f18205d).run();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18206a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C1.u spec) {
            Intrinsics.checkNotNullParameter(spec, "spec");
            return spec.m() ? "Periodic" : "OneTime";
        }
    }

    public static final x1.r c(final P p10, final String name, final AbstractC5095B workRequest) {
        Intrinsics.checkNotNullParameter(p10, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workRequest, "workRequest");
        final C1631q c1631q = new C1631q();
        final a aVar = new a(workRequest, p10, name, c1631q);
        p10.t().c().execute(new Runnable() { // from class: androidx.work.impl.T
            @Override // java.lang.Runnable
            public final void run() {
                V.d(P.this, name, c1631q, aVar, workRequest);
            }
        });
        return c1631q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(P this_enqueueUniquelyNamedPeriodic, String name, C1631q operation, Function0 enqueueNew, AbstractC5095B workRequest) {
        Intrinsics.checkNotNullParameter(this_enqueueUniquelyNamedPeriodic, "$this_enqueueUniquelyNamedPeriodic");
        Intrinsics.checkNotNullParameter(name, "$name");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        Intrinsics.checkNotNullParameter(enqueueNew, "$enqueueNew");
        Intrinsics.checkNotNullParameter(workRequest, "$workRequest");
        C1.v K10 = this_enqueueUniquelyNamedPeriodic.s().K();
        List d10 = K10.d(name);
        if (d10.size() > 1) {
            e(operation, "Can't apply UPDATE policy to the chains of work.");
            return;
        }
        u.b bVar = (u.b) CollectionsKt.firstOrNull(d10);
        if (bVar == null) {
            enqueueNew.invoke();
            return;
        }
        C1.u s10 = K10.s(bVar.f813a);
        if (s10 == null) {
            operation.a(new r.b.a(new IllegalStateException("WorkSpec with " + bVar.f813a + ", that matches a name \"" + name + "\", wasn't found")));
            return;
        }
        if (!s10.m()) {
            e(operation, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            return;
        }
        if (bVar.f814b == z.c.CANCELLED) {
            K10.a(bVar.f813a);
            enqueueNew.invoke();
            return;
        }
        C1.u e10 = C1.u.e(workRequest.d(), bVar.f813a, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 8388606, null);
        try {
            C1634u processor = this_enqueueUniquelyNamedPeriodic.p();
            Intrinsics.checkNotNullExpressionValue(processor, "processor");
            WorkDatabase workDatabase = this_enqueueUniquelyNamedPeriodic.s();
            Intrinsics.checkNotNullExpressionValue(workDatabase, "workDatabase");
            androidx.work.a configuration = this_enqueueUniquelyNamedPeriodic.l();
            Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
            List schedulers = this_enqueueUniquelyNamedPeriodic.q();
            Intrinsics.checkNotNullExpressionValue(schedulers, "schedulers");
            f(processor, workDatabase, configuration, schedulers, e10, workRequest.c());
            operation.a(x1.r.f44711a);
        } catch (Throwable th) {
            operation.a(new r.b.a(th));
        }
    }

    private static final void e(C1631q c1631q, String str) {
        c1631q.a(new r.b.a(new UnsupportedOperationException(str)));
    }

    private static final AbstractC5094A.a f(C1634u c1634u, final WorkDatabase workDatabase, androidx.work.a aVar, final List list, final C1.u uVar, final Set set) {
        final String str = uVar.f790a;
        final C1.u s10 = workDatabase.K().s(str);
        if (s10 == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (s10.f791b.isFinished()) {
            return AbstractC5094A.a.NOT_APPLIED;
        }
        if (s10.m() ^ uVar.m()) {
            b bVar = b.f18206a;
            throw new UnsupportedOperationException("Can't update " + ((String) bVar.invoke(s10)) + " Worker to " + ((String) bVar.invoke(uVar)) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean k10 = c1634u.k(str);
        if (!k10) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC1636w) it.next()).c(str);
            }
        }
        workDatabase.C(new Runnable() { // from class: androidx.work.impl.U
            @Override // java.lang.Runnable
            public final void run() {
                V.g(WorkDatabase.this, s10, uVar, list, str, set, k10);
            }
        });
        if (!k10) {
            z.h(aVar, workDatabase, list);
        }
        return k10 ? AbstractC5094A.a.APPLIED_FOR_NEXT_RUN : AbstractC5094A.a.APPLIED_IMMEDIATELY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(WorkDatabase workDatabase, C1.u oldWorkSpec, C1.u newWorkSpec, List schedulers, String workSpecId, Set tags, boolean z10) {
        Intrinsics.checkNotNullParameter(workDatabase, "$workDatabase");
        Intrinsics.checkNotNullParameter(oldWorkSpec, "$oldWorkSpec");
        Intrinsics.checkNotNullParameter(newWorkSpec, "$newWorkSpec");
        Intrinsics.checkNotNullParameter(schedulers, "$schedulers");
        Intrinsics.checkNotNullParameter(workSpecId, "$workSpecId");
        Intrinsics.checkNotNullParameter(tags, "$tags");
        C1.v K10 = workDatabase.K();
        C1.z L10 = workDatabase.L();
        C1.u e10 = C1.u.e(newWorkSpec, null, oldWorkSpec.f791b, null, null, null, null, 0L, 0L, 0L, null, oldWorkSpec.f800k, null, 0L, oldWorkSpec.f803n, 0L, 0L, false, null, oldWorkSpec.i(), oldWorkSpec.f() + 1, oldWorkSpec.g(), oldWorkSpec.h(), 0, 4447229, null);
        if (newWorkSpec.h() == 1) {
            e10.n(newWorkSpec.g());
            e10.o(e10.h() + 1);
        }
        K10.h(AbstractC0774d.c(schedulers, e10));
        L10.d(workSpecId);
        L10.c(workSpecId, tags);
        if (z10) {
            return;
        }
        K10.c(workSpecId, -1L);
        workDatabase.J().a(workSpecId);
    }
}
