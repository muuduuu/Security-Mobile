package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import x1.AbstractC5094A;
import x1.n;
import x1.q;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18324a = n.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        n.e().a(f18324a, "Requesting diagnostics");
        try {
            AbstractC5094A.f(context).b(q.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            n.e().d(f18324a, "WorkManager is not initialized", e10);
        }
    }
}
