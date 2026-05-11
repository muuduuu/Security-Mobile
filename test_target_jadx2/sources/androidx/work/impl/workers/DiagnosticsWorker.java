package androidx.work.impl.workers;

import C1.j;
import C1.o;
import C1.v;
import C1.z;
import F1.e;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.P;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x1.n;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "q", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public c.a q() {
        String str;
        String str2;
        String d10;
        String str3;
        String str4;
        String d11;
        String str5;
        String str6;
        String d12;
        P n10 = P.n(a());
        Intrinsics.checkNotNullExpressionValue(n10, "getInstance(applicationContext)");
        WorkDatabase s10 = n10.s();
        Intrinsics.checkNotNullExpressionValue(s10, "workManager.workDatabase");
        v K10 = s10.K();
        o I10 = s10.I();
        z L10 = s10.L();
        j H10 = s10.H();
        List e10 = K10.e(n10.l().a().a() - TimeUnit.DAYS.toMillis(1L));
        List l10 = K10.l();
        List A10 = K10.A(200);
        if (!e10.isEmpty()) {
            n e11 = n.e();
            str5 = e.f2203a;
            e11.f(str5, "Recently completed work:\n\n");
            n e12 = n.e();
            str6 = e.f2203a;
            d12 = e.d(I10, L10, H10, e10);
            e12.f(str6, d12);
        }
        if (!l10.isEmpty()) {
            n e13 = n.e();
            str3 = e.f2203a;
            e13.f(str3, "Running work:\n\n");
            n e14 = n.e();
            str4 = e.f2203a;
            d11 = e.d(I10, L10, H10, l10);
            e14.f(str4, d11);
        }
        if (!A10.isEmpty()) {
            n e15 = n.e();
            str = e.f2203a;
            e15.f(str, "Enqueued work:\n\n");
            n e16 = n.e();
            str2 = e.f2203a;
            d10 = e.d(I10, L10, H10, A10);
            e16.f(str2, d10);
        }
        c.a c10 = c.a.c();
        Intrinsics.checkNotNullExpressionValue(c10, "success()");
        return c10;
    }
}
