package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import y1.C5161b;

/* loaded from: classes.dex */
public abstract class Q {

    /* synthetic */ class a extends xc.j implements wc.q {

        /* renamed from: j, reason: collision with root package name */
        public static final a f18188j = new a();

        a() {
            super(6, Q.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        @Override // wc.q
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final List w(Context p02, androidx.work.a p12, E1.b p22, WorkDatabase p32, B1.n p42, C1634u p52) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            Intrinsics.checkNotNullParameter(p22, "p2");
            Intrinsics.checkNotNullParameter(p32, "p3");
            Intrinsics.checkNotNullParameter(p42, "p4");
            Intrinsics.checkNotNullParameter(p52, "p5");
            return Q.b(p02, p12, p22, p32, p42, p52);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(Context context, androidx.work.a aVar, E1.b bVar, WorkDatabase workDatabase, B1.n nVar, C1634u c1634u) {
        InterfaceC1636w c10 = z.c(context, workDatabase, aVar);
        Intrinsics.checkNotNullExpressionValue(c10, "createBestAvailableBackg…kDatabase, configuration)");
        return CollectionsKt.m(c10, new C5161b(context, aVar, nVar, c1634u, new O(c1634u, bVar), bVar));
    }

    public static final P c(Context context, androidx.work.a configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return e(context, configuration, null, null, null, null, null, 124, null);
    }

    public static final P d(Context context, androidx.work.a configuration, E1.b workTaskExecutor, WorkDatabase workDatabase, B1.n trackers, C1634u processor, wc.q schedulersCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(schedulersCreator, "schedulersCreator");
        return new P(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, (List) schedulersCreator.w(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }

    public static /* synthetic */ P e(Context context, androidx.work.a aVar, E1.b bVar, WorkDatabase workDatabase, B1.n nVar, C1634u c1634u, wc.q qVar, int i10, Object obj) {
        WorkDatabase workDatabase2;
        B1.n nVar2;
        E1.b cVar = (i10 & 4) != 0 ? new E1.c(aVar.m()) : bVar;
        if ((i10 & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            E1.a c10 = cVar.c();
            Intrinsics.checkNotNullExpressionValue(c10, "workTaskExecutor.serialTaskExecutor");
            workDatabase2 = companion.b(applicationContext, c10, aVar.a(), context.getResources().getBoolean(x1.v.f44715a));
        } else {
            workDatabase2 = workDatabase;
        }
        if ((i10 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            nVar2 = new B1.n(applicationContext2, cVar, null, null, null, null, 60, null);
        } else {
            nVar2 = nVar;
        }
        return d(context, aVar, cVar, workDatabase2, nVar2, (i10 & 32) != 0 ? new C1634u(context.getApplicationContext(), aVar, cVar, workDatabase2) : c1634u, (i10 & 64) != 0 ? a.f18188j : qVar);
    }
}
