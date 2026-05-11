package D1;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f1150a;

    public k(WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.f1150a = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer d(k this$0) {
        int d10;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d10 = l.d(this$0.f1150a, "next_alarm_manager_id");
        return Integer.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer f(k this$0, int i10, int i11) {
        int d10;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d10 = l.d(this$0.f1150a, "next_job_scheduler_id");
        if (i10 > d10 || d10 > i11) {
            l.e(this$0.f1150a, "next_job_scheduler_id", i10 + 1);
        } else {
            i10 = d10;
        }
        return Integer.valueOf(i10);
    }

    public final int c() {
        Object B10 = this.f1150a.B(new Callable() { // from class: D1.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer d10;
                d10 = k.d(k.this);
                return d10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(B10, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) B10).intValue();
    }

    public final int e(final int i10, final int i11) {
        Object B10 = this.f1150a.B(new Callable() { // from class: D1.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer f10;
                f10 = k.f(k.this, i10, i11);
                return f10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(B10, "workDatabase.runInTransa…            id\n        })");
        return ((Number) B10).intValue();
    }
}
