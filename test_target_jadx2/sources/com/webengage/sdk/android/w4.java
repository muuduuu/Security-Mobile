package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes2.dex */
class w4 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private ScheduledThreadPoolExecutor f31094a;

    /* renamed from: b, reason: collision with root package name */
    private Messenger f31095b;

    /* renamed from: c, reason: collision with root package name */
    private Context f31096c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f31097d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f31098e;

    /* renamed from: f, reason: collision with root package name */
    private Queue<u4> f31099f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f31100g;

    /* renamed from: h, reason: collision with root package name */
    private int f31101h;

    /* renamed from: i, reason: collision with root package name */
    private int f31102i;

    /* renamed from: j, reason: collision with root package name */
    private Map<Integer, u4> f31103j;

    /* renamed from: k, reason: collision with root package name */
    private String f31104k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f31105l;

    /* renamed from: m, reason: collision with root package name */
    private final a f31106m;

    /* renamed from: n, reason: collision with root package name */
    private Messenger f31107n;

    private class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            synchronized (w4.this.f31105l) {
                try {
                    int i10 = message.arg1;
                    try {
                        if (w4.this.f31103j.get(Integer.valueOf(i10)) != null) {
                            ((u4) w4.this.f31103j.get(Integer.valueOf(i10))).a();
                            w4.this.f31103j.remove(Integer.valueOf(i10));
                        }
                        if (i10 == w4.this.f31102i) {
                            w4.this.f31096c.unbindService(w4.this);
                            w4.this.f31097d = false;
                        }
                    } catch (Exception unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private w4() {
        this.f31094a = new ScheduledThreadPoolExecutor(1);
        this.f31095b = null;
        this.f31096c = null;
        this.f31097d = false;
        this.f31098e = false;
        this.f31099f = null;
        this.f31100g = null;
        this.f31101h = 0;
        this.f31102i = 0;
        this.f31103j = null;
        this.f31104k = null;
        this.f31105l = new Object();
        a aVar = new a(Looper.getMainLooper());
        this.f31106m = aVar;
        this.f31107n = new Messenger(aVar);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f31105l) {
            try {
                if (iBinder != null) {
                    this.f31095b = new Messenger(iBinder);
                    this.f31097d = true;
                    this.f31098e = false;
                    b();
                } else {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f31105l) {
            this.f31097d = false;
            this.f31095b = null;
            b();
        }
    }

    public w4(Context context, Intent intent) {
        this.f31094a = new ScheduledThreadPoolExecutor(1);
        this.f31095b = null;
        this.f31096c = null;
        this.f31097d = false;
        this.f31098e = false;
        this.f31099f = null;
        this.f31100g = null;
        this.f31101h = 0;
        this.f31102i = 0;
        this.f31103j = null;
        this.f31104k = null;
        this.f31105l = new Object();
        a aVar = new a(Looper.getMainLooper());
        this.f31106m = aVar;
        this.f31107n = new Messenger(aVar);
        this.f31096c = context.getApplicationContext();
        this.f31099f = new ArrayDeque();
        this.f31100g = intent;
        this.f31103j = new HashMap();
        this.f31104k = intent.getComponent().getClassName();
    }

    private void a() {
        while (!this.f31099f.isEmpty()) {
            this.f31099f.poll().a();
        }
    }

    private void b() {
        Messenger messenger;
        while (!this.f31099f.isEmpty()) {
            if (!this.f31097d || (messenger = this.f31095b) == null || !messenger.getBinder().isBinderAlive()) {
                if (this.f31098e) {
                    return;
                }
                this.f31098e = true;
                try {
                    this.f31096c.bindService(this.f31100g, this, 1);
                    return;
                } catch (Exception e10) {
                    Logger.e("WebEngage", "YAIS: Exception while binding to service: " + this.f31100g, e10);
                    this.f31098e = false;
                    a();
                    return;
                }
            }
            a(this.f31099f.poll());
        }
    }

    public void a(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        synchronized (this.f31105l) {
            this.f31099f.add(new u4(intent, this.f31094a, pendingResult));
            b();
        }
    }

    private void a(u4 u4Var) {
        synchronized (this.f31105l) {
            Message obtain = Message.obtain();
            obtain.obj = u4Var.b();
            obtain.arg1 = this.f31101h;
            obtain.replyTo = this.f31107n;
            try {
                this.f31095b.send(obtain);
                this.f31103j.put(Integer.valueOf(this.f31101h), u4Var);
                int i10 = this.f31101h;
                this.f31102i = i10;
                this.f31101h = i10 + 1;
            } catch (Exception e10) {
                Logger.e("WebEngage", "YAIS: Exception while sending message to service: " + u4Var.b(), e10);
            }
        }
    }
}
