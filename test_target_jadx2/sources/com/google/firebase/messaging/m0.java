package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    static final long f28227a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f28228b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static C7.a f28229c;

    private static void b(Context context) {
        if (f28229c == null) {
            C7.a aVar = new C7.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f28229c = aVar;
            aVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f28228b) {
            try {
                if (f28229c != null && d(intent)) {
                    g(intent, false);
                    f28229c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    static void f(Context context, r0 r0Var, final Intent intent) {
        synchronized (f28228b) {
            try {
                b(context);
                boolean d10 = d(intent);
                g(intent, true);
                if (!d10) {
                    f28229c.a(f28227a);
                }
                r0Var.d(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.l0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        m0.c(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void g(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    static ComponentName h(Context context, Intent intent) {
        synchronized (f28228b) {
            try {
                b(context);
                boolean d10 = d(intent);
                g(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!d10) {
                    f28229c.a(f28227a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
