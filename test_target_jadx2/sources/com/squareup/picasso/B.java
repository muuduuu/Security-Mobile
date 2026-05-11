package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
class B {

    /* renamed from: a, reason: collision with root package name */
    final HandlerThread f29499a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC2927d f29500b;

    /* renamed from: c, reason: collision with root package name */
    final Handler f29501c;

    /* renamed from: d, reason: collision with root package name */
    long f29502d;

    /* renamed from: e, reason: collision with root package name */
    long f29503e;

    /* renamed from: f, reason: collision with root package name */
    long f29504f;

    /* renamed from: g, reason: collision with root package name */
    long f29505g;

    /* renamed from: h, reason: collision with root package name */
    long f29506h;

    /* renamed from: i, reason: collision with root package name */
    long f29507i;

    /* renamed from: j, reason: collision with root package name */
    long f29508j;

    /* renamed from: k, reason: collision with root package name */
    long f29509k;

    /* renamed from: l, reason: collision with root package name */
    int f29510l;

    /* renamed from: m, reason: collision with root package name */
    int f29511m;

    /* renamed from: n, reason: collision with root package name */
    int f29512n;

    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final B f29513a;

        /* renamed from: com.squareup.picasso.B$a$a, reason: collision with other inner class name */
        class RunnableC0434a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Message f29514a;

            RunnableC0434a(Message message) {
                this.f29514a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f29514a.what);
            }
        }

        a(Looper looper, B b10) {
            super(looper);
            this.f29513a = b10;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f29513a.j();
                return;
            }
            if (i10 == 1) {
                this.f29513a.k();
                return;
            }
            if (i10 == 2) {
                this.f29513a.h(message.arg1);
                return;
            }
            if (i10 == 3) {
                this.f29513a.i(message.arg1);
            } else if (i10 != 4) {
                u.f29623o.post(new RunnableC0434a(message));
            } else {
                this.f29513a.l((Long) message.obj);
            }
        }
    }

    B(InterfaceC2927d interfaceC2927d) {
        this.f29500b = interfaceC2927d;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f29499a = handlerThread;
        handlerThread.start();
        G.h(handlerThread.getLooper());
        this.f29501c = new a(handlerThread.getLooper(), this);
    }

    private static long g(int i10, long j10) {
        return j10 / i10;
    }

    private void m(Bitmap bitmap, int i10) {
        int i11 = G.i(bitmap);
        Handler handler = this.f29501c;
        handler.sendMessage(handler.obtainMessage(i10, i11, 0));
    }

    C a() {
        return new C(this.f29500b.b(), this.f29500b.size(), this.f29502d, this.f29503e, this.f29504f, this.f29505g, this.f29506h, this.f29507i, this.f29508j, this.f29509k, this.f29510l, this.f29511m, this.f29512n, System.currentTimeMillis());
    }

    void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    void d() {
        this.f29501c.sendEmptyMessage(0);
    }

    void e() {
        this.f29501c.sendEmptyMessage(1);
    }

    void f(long j10) {
        Handler handler = this.f29501c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j10)));
    }

    void h(long j10) {
        int i10 = this.f29511m + 1;
        this.f29511m = i10;
        long j11 = this.f29505g + j10;
        this.f29505g = j11;
        this.f29508j = g(i10, j11);
    }

    void i(long j10) {
        this.f29512n++;
        long j11 = this.f29506h + j10;
        this.f29506h = j11;
        this.f29509k = g(this.f29511m, j11);
    }

    void j() {
        this.f29502d++;
    }

    void k() {
        this.f29503e++;
    }

    void l(Long l10) {
        this.f29510l++;
        long longValue = this.f29504f + l10.longValue();
        this.f29504f = longValue;
        this.f29507i = g(this.f29510l, longValue);
    }
}
