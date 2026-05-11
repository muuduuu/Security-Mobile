package B1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class e extends h {

    /* renamed from: f, reason: collision with root package name */
    private final BroadcastReceiver f417f;

    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            e.this.k(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, E1.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f417f = new a();
    }

    @Override // B1.h
    public void h() {
        String str;
        x1.n e10 = x1.n.e();
        str = f.f419a;
        e10.a(str, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f417f, j());
    }

    @Override // B1.h
    public void i() {
        String str;
        x1.n e10 = x1.n.e();
        str = f.f419a;
        e10.a(str, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f417f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
