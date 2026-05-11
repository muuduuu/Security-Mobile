package R6;

import D7.AbstractC0789m;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c7.ThreadFactoryC1738b;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: R6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1144b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static SoftReference f8578a;

    /* renamed from: b, reason: collision with root package name */
    private static SoftReference f8579b;

    private final int e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    protected Executor a() {
        ExecutorService executorService;
        synchronized (AbstractC1144b.class) {
            try {
                SoftReference softReference = f8578a;
                executorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService == null) {
                    m7.e.a();
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ThreadFactoryC1738b("firebase-iid-executor")));
                    f8578a = new SoftReference(executorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    protected abstract int b(Context context, C1143a c1143a);

    protected abstract void c(Context context, Bundle bundle);

    final /* synthetic */ void d(Intent intent, final Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        Executor executor;
        int i10;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i10 = e(context, intent2);
            } else if (intent.getExtras() == null) {
                i10 = 500;
            } else {
                final C1143a c1143a = new C1143a(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (AbstractC1144b.class) {
                    try {
                        SoftReference softReference = f8579b;
                        executor = softReference != null ? (Executor) softReference.get() : null;
                        if (executor == null) {
                            m7.e.a();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1738b("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            f8579b = new SoftReference(executor);
                        }
                    } finally {
                    }
                }
                executor.execute(new Runnable() { // from class: R6.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task c10;
                        C1143a c1143a2 = c1143a;
                        if (TextUtils.isEmpty(c1143a2.u())) {
                            c10 = AbstractC0789m.g(null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("google.message_id", c1143a2.u());
                            Integer F10 = c1143a2.F();
                            if (F10 != null) {
                                bundle.putInt("google.product_id", F10.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            c10 = D.b(context2).c(2, bundle);
                        }
                        final CountDownLatch countDownLatch2 = countDownLatch;
                        c10.c(new Executor() { // from class: R6.m
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new OnCompleteListener() { // from class: R6.n
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(Task task) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int b10 = b(context, c1143a);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e10) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e10.toString()));
                }
                i10 = b10;
            }
            if (z10 && pendingResult != null) {
                pendingResult.setResultCode(i10);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        a().execute(new Runnable() { // from class: R6.p
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1144b.this.d(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }
}
