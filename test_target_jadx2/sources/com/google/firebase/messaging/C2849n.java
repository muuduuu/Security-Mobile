package com.google.firebase.messaging;

import D7.AbstractC0789m;
import D7.InterfaceC0779c;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2849n {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f28230c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static r0 f28231d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f28232a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f28233b = new androidx.privacysandbox.ads.adservices.measurement.k();

    public C2849n(Context context) {
        this.f28232a = context;
    }

    private static Task e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        r0 f10 = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return f10.d(intent).i(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC0779c() { // from class: com.google.firebase.messaging.m
                @Override // D7.InterfaceC0779c
                public final Object a(Task task) {
                    Integer g10;
                    g10 = C2849n.g(task);
                    return g10;
                }
            });
        }
        if (b0.b().e(context)) {
            m0.f(context, f10, intent);
        } else {
            f10.d(intent);
        }
        return AbstractC0789m.g(-1);
    }

    private static r0 f(Context context, String str) {
        r0 r0Var;
        synchronized (f28230c) {
            try {
                if (f28231d == null) {
                    f28231d = new r0(context, str);
                }
                r0Var = f28231d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer g(Task task) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer h(Context context, Intent intent) {
        return Integer.valueOf(b0.b().g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer i(Task task) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task j(Context context, Intent intent, boolean z10, Task task) {
        return (com.google.android.gms.common.util.m.e() && ((Integer) task.getResult()).intValue() == 402) ? e(context, intent, z10).i(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC0779c() { // from class: com.google.firebase.messaging.l
            @Override // D7.InterfaceC0779c
            public final Object a(Task task2) {
                Integer i10;
                i10 = C2849n.i(task2);
                return i10;
            }
        }) : task;
    }

    public Task k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.f28232a, intent);
    }

    public Task l(final Context context, final Intent intent) {
        boolean z10 = com.google.android.gms.common.util.m.e() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? AbstractC0789m.d(this.f28233b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer h10;
                h10 = C2849n.h(context, intent);
                return h10;
            }
        }).j(this.f28233b, new InterfaceC0779c() { // from class: com.google.firebase.messaging.k
            @Override // D7.InterfaceC0779c
            public final Object a(Task task) {
                Task j10;
                j10 = C2849n.j(context, intent, z11, task);
                return j10;
            }
        }) : e(context, intent, z11);
    }
}
