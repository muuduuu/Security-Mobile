package D1;

import android.os.Build;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import x1.AbstractC5095B;
import x1.C5100d;

/* renamed from: D1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0774d {
    public static final void a(WorkDatabase workDatabase, androidx.work.a configuration, androidx.work.impl.C continuation) {
        int i10;
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        List p10 = CollectionsKt.p(continuation);
        int i11 = 0;
        while (!p10.isEmpty()) {
            androidx.work.impl.C c10 = (androidx.work.impl.C) CollectionsKt.F(p10);
            List f10 = c10.f();
            Intrinsics.checkNotNullExpressionValue(f10, "current.work");
            List list = f10;
            if ((list instanceof Collection) && list.isEmpty()) {
                i10 = 0;
            } else {
                Iterator it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((AbstractC5095B) it.next()).d().f799j.e() && (i10 = i10 + 1) < 0) {
                        CollectionsKt.s();
                    }
                }
            }
            i11 += i10;
            List e10 = c10.e();
            if (e10 != null) {
                p10.addAll(e10);
            }
        }
        if (i11 == 0) {
            return;
        }
        int x10 = workDatabase.K().x();
        int b10 = configuration.b();
        if (x10 + i11 <= b10) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + b10 + ";\nalready enqueued count: " + x10 + ";\ncurrent enqueue operation count: " + i11 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    public static final C1.u b(C1.u workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        C5100d c5100d = workSpec.f799j;
        String str = workSpec.f792c;
        if (Intrinsics.b(str, ConstraintTrackingWorker.class.getName())) {
            return workSpec;
        }
        if (!c5100d.f() && !c5100d.i()) {
            return workSpec;
        }
        androidx.work.b a10 = new b.a().c(workSpec.f794e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).a();
        Intrinsics.checkNotNullExpressionValue(a10, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = ConstraintTrackingWorker.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        return C1.u.e(workSpec, null, null, name, null, a10, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 8388587, null);
    }

    public static final C1.u c(List schedulers, C1.u workSpec) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return Build.VERSION.SDK_INT < 26 ? b(workSpec) : workSpec;
    }
}
