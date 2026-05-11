package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.r0;

/* loaded from: classes2.dex */
class o0 extends Binder {

    /* renamed from: f, reason: collision with root package name */
    private final a f28235f;

    interface a {
        Task a(Intent intent);
    }

    o0(a aVar) {
        this.f28235f = aVar;
    }

    void c(final r0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f28235f.a(aVar.f28247a).c(new androidx.privacysandbox.ads.adservices.measurement.k(), new OnCompleteListener() { // from class: com.google.firebase.messaging.n0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                r0.a.this.d();
            }
        });
    }
}
