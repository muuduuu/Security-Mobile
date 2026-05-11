package R6;

import V6.AbstractC1287s;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import b7.C1653b;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class x implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    y f8619c;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ D f8622f;

    /* renamed from: a, reason: collision with root package name */
    int f8617a = 0;

    /* renamed from: b, reason: collision with root package name */
    final Messenger f8618b = new Messenger(new m7.f(Looper.getMainLooper(), new Handler.Callback() { // from class: R6.u
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i10);
            }
            x xVar = x.this;
            synchronized (xVar) {
                try {
                    A a10 = (A) xVar.f8621e.get(i10);
                    if (a10 == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                        return true;
                    }
                    xVar.f8621e.remove(i10);
                    xVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        a10.c(new B(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    a10.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: d, reason: collision with root package name */
    final Queue f8620d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    final SparseArray f8621e = new SparseArray();

    /* synthetic */ x(D d10, w wVar) {
        this.f8622f = d10;
    }

    final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    final synchronized void b(int i10, String str, Throwable th) {
        Context context;
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i11 = this.f8617a;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f8617a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f8617a = 4;
            D d10 = this.f8622f;
            C1653b b10 = C1653b.b();
            context = d10.f8566a;
            b10.c(context, this);
            B b11 = new B(i10, str, th);
            Iterator it = this.f8620d.iterator();
            while (it.hasNext()) {
                ((A) it.next()).c(b11);
            }
            this.f8620d.clear();
            for (int i12 = 0; i12 < this.f8621e.size(); i12++) {
                ((A) this.f8621e.valueAt(i12)).c(b11);
            }
            this.f8621e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final void c() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f8622f.f8567b;
        scheduledExecutorService.execute(new Runnable() { // from class: R6.r
            @Override // java.lang.Runnable
            public final void run() {
                final A a10;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                while (true) {
                    final x xVar = x.this;
                    synchronized (xVar) {
                        try {
                            if (xVar.f8617a != 2) {
                                return;
                            }
                            if (xVar.f8620d.isEmpty()) {
                                xVar.f();
                                return;
                            }
                            a10 = (A) xVar.f8620d.poll();
                            xVar.f8621e.put(a10.f8561a, a10);
                            scheduledExecutorService2 = xVar.f8622f.f8567b;
                            scheduledExecutorService2.schedule(new Runnable() { // from class: R6.v
                                @Override // java.lang.Runnable
                                public final void run() {
                                    x.this.e(a10.f8561a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(a10)));
                    }
                    D d10 = xVar.f8622f;
                    Messenger messenger = xVar.f8618b;
                    int i10 = a10.f8563c;
                    context = d10.f8566a;
                    Message obtain = Message.obtain();
                    obtain.what = i10;
                    obtain.arg1 = a10.f8561a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", a10.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", a10.f8564d);
                    obtain.setData(bundle);
                    try {
                        xVar.f8619c.a(obtain);
                    } catch (RemoteException e10) {
                        xVar.a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void d() {
        if (this.f8617a == 1) {
            a(1, "Timed out while binding");
        }
    }

    final synchronized void e(int i10) {
        A a10 = (A) this.f8621e.get(i10);
        if (a10 != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i10);
            this.f8621e.remove(i10);
            a10.c(new B(3, "Timed out waiting for response", null));
            f();
        }
    }

    final synchronized void f() {
        Context context;
        try {
            if (this.f8617a == 2 && this.f8620d.isEmpty() && this.f8621e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f8617a = 3;
                D d10 = this.f8622f;
                C1653b b10 = C1653b.b();
                context = d10.f8566a;
                b10.c(context, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized boolean g(A a10) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i10 = this.f8617a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f8620d.add(a10);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f8620d.add(a10);
            c();
            return true;
        }
        this.f8620d.add(a10);
        AbstractC1287s.p(this.f8617a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f8617a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            C1653b b10 = C1653b.b();
            context = this.f8622f.f8566a;
            if (b10.a(context, intent, this, 1)) {
                scheduledExecutorService = this.f8622f.f8567b;
                scheduledExecutorService.schedule(new Runnable() { // from class: R6.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.this.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        scheduledExecutorService = this.f8622f.f8567b;
        scheduledExecutorService.execute(new Runnable() { // from class: R6.q
            @Override // java.lang.Runnable
            public final void run() {
                x xVar = x.this;
                IBinder iBinder2 = iBinder;
                synchronized (xVar) {
                    if (iBinder2 == null) {
                        xVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        xVar.f8619c = new y(iBinder2);
                        xVar.f8617a = 2;
                        xVar.c();
                    } catch (RemoteException e10) {
                        xVar.a(0, e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        scheduledExecutorService = this.f8622f.f8567b;
        scheduledExecutorService.execute(new Runnable() { // from class: R6.t
            @Override // java.lang.Runnable
            public final void run() {
                x.this.a(2, "Service disconnected");
            }
        });
    }
}
