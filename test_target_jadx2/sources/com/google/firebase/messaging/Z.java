package com.google.firebase.messaging;

import D7.InterfaceC0779c;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import j0.C3476a;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
class Z {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f28126a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f28127b = new C3476a();

    interface a {
        Task start();
    }

    Z(Executor executor) {
        this.f28126a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task c(String str, Task task) {
        synchronized (this) {
            this.f28127b.remove(str);
        }
        return task;
    }

    synchronized Task b(final String str, a aVar) {
        Task task = (Task) this.f28127b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task j10 = aVar.start().j(this.f28126a, new InterfaceC0779c() { // from class: com.google.firebase.messaging.Y
            @Override // D7.InterfaceC0779c
            public final Object a(Task task2) {
                Task c10;
                c10 = Z.this.c(str, task2);
                return c10;
            }
        });
        this.f28127b.put(str, j10);
        return j10;
    }
}
