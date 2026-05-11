package V6;

import S6.h;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C2010b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class M implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    private final L f10860a;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f10867h;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f10861b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f10862c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f10863d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f10864e = false;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f10865f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    private boolean f10866g = false;

    /* renamed from: i, reason: collision with root package name */
    private final Object f10868i = new Object();

    public M(Looper looper, L l10) {
        this.f10860a = l10;
        this.f10867h = new l7.l(looper, this);
    }

    public final void a() {
        this.f10864e = false;
        this.f10865f.incrementAndGet();
    }

    public final void b() {
        this.f10864e = true;
    }

    public final void c(C2010b c2010b) {
        AbstractC1287s.e(this.f10867h, "onConnectionFailure must only be called on the Handler thread");
        this.f10867h.removeMessages(1);
        synchronized (this.f10868i) {
            try {
                ArrayList arrayList = new ArrayList(this.f10863d);
                int i10 = this.f10865f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    h.c cVar = (h.c) it.next();
                    if (this.f10864e && this.f10865f.get() == i10) {
                        if (this.f10863d.contains(cVar)) {
                            cVar.onConnectionFailed(c2010b);
                        }
                    }
                    return;
                }
            } finally {
            }
        }
    }

    public final void d(Bundle bundle) {
        AbstractC1287s.e(this.f10867h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f10868i) {
            try {
                AbstractC1287s.p(!this.f10866g);
                this.f10867h.removeMessages(1);
                this.f10866g = true;
                AbstractC1287s.p(this.f10862c.isEmpty());
                ArrayList arrayList = new ArrayList(this.f10861b);
                int i10 = this.f10865f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    h.b bVar = (h.b) it.next();
                    if (!this.f10864e || !this.f10860a.a() || this.f10865f.get() != i10) {
                        break;
                    } else if (!this.f10862c.contains(bVar)) {
                        bVar.onConnected(bundle);
                    }
                }
                this.f10862c.clear();
                this.f10866g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i10) {
        AbstractC1287s.e(this.f10867h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f10867h.removeMessages(1);
        synchronized (this.f10868i) {
            try {
                this.f10866g = true;
                ArrayList arrayList = new ArrayList(this.f10861b);
                int i11 = this.f10865f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    h.b bVar = (h.b) it.next();
                    if (!this.f10864e || this.f10865f.get() != i11) {
                        break;
                    } else if (this.f10861b.contains(bVar)) {
                        bVar.onConnectionSuspended(i10);
                    }
                }
                this.f10862c.clear();
                this.f10866g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(h.b bVar) {
        AbstractC1287s.m(bVar);
        synchronized (this.f10868i) {
            try {
                if (this.f10861b.contains(bVar)) {
                    Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(bVar) + " is already registered");
                } else {
                    this.f10861b.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f10860a.a()) {
            Handler handler = this.f10867h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void g(h.c cVar) {
        AbstractC1287s.m(cVar);
        synchronized (this.f10868i) {
            try {
                if (this.f10863d.contains(cVar)) {
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(cVar) + " is already registered");
                } else {
                    this.f10863d.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(h.c cVar) {
        AbstractC1287s.m(cVar);
        synchronized (this.f10868i) {
            try {
                if (!this.f10863d.remove(cVar)) {
                    Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + String.valueOf(cVar) + " not found");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i10, new Exception());
            return false;
        }
        h.b bVar = (h.b) message.obj;
        synchronized (this.f10868i) {
            try {
                if (this.f10864e && this.f10860a.a() && this.f10861b.contains(bVar)) {
                    bVar.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
