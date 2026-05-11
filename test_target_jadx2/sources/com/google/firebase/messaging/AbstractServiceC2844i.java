package com.google.firebase.messaging;

import D7.AbstractC0789m;
import D7.C0787k;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.o0;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.firebase.messaging.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC2844i extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = AbstractC2850o.d();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* renamed from: com.google.firebase.messaging.i$a */
    class a implements o0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.o0.a
        public Task a(Intent intent) {
            return AbstractServiceC2844i.this.f(intent);
        }
    }

    private void c(Intent intent) {
        if (intent != null) {
            m0.c(intent);
        }
        synchronized (this.lock) {
            try {
                int i10 = this.runningTasks - 1;
                this.runningTasks = i10;
                if (i10 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Intent intent, Task task) {
        c(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Intent intent, C0787k c0787k) {
        try {
            handleIntent(intent);
        } finally {
            c0787k.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task f(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return AbstractC0789m.g(null);
        }
        final C0787k c0787k = new C0787k();
        this.executor.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC2844i.this.e(intent, c0787k);
            }
        });
        return c0787k.a();
    }

    protected abstract Intent getStartCommandIntent(Intent intent);

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new o0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.lock) {
            this.lastStartId = i11;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            c(intent);
            return 2;
        }
        Task f10 = f(startCommandIntent);
        if (f10.m()) {
            c(intent);
            return 2;
        }
        f10.c(new androidx.privacysandbox.ads.adservices.measurement.k(), new OnCompleteListener() { // from class: com.google.firebase.messaging.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AbstractServiceC2844i.this.d(intent, task);
            }
        });
        return 3;
    }

    boolean stopSelfResultHook(int i10) {
        return stopSelfResult(i10);
    }
}
