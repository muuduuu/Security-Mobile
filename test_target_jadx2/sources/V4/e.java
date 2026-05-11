package V4;

import Td.B;
import Td.D;
import Td.F;
import Td.J;
import Td.K;
import android.os.Handler;
import android.os.Looper;
import c3.AbstractC1721a;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;
import pe.C3880h;

/* loaded from: classes.dex */
public final class e extends K {

    /* renamed from: i, reason: collision with root package name */
    private static final String f10838i = "e";

    /* renamed from: a, reason: collision with root package name */
    private final String f10839a;

    /* renamed from: c, reason: collision with root package name */
    private final B f10841c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10843e;

    /* renamed from: f, reason: collision with root package name */
    private J f10844f;

    /* renamed from: g, reason: collision with root package name */
    private c f10845g;

    /* renamed from: h, reason: collision with root package name */
    private b f10846h;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10842d = false;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f10840b = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.l();
        }
    }

    public interface b {
        void a();

        void b();
    }

    public interface c {
        void a(C3880h c3880h);

        void onMessage(String str);
    }

    public e(String str, c cVar, b bVar) {
        this.f10839a = str;
        this.f10845g = cVar;
        this.f10846h = bVar;
        B.a aVar = new B.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f10841c = aVar.g(10L, timeUnit).i0(10L, timeUnit).d0(0L, TimeUnit.MINUTES).c();
    }

    private void h(String str, Throwable th) {
        AbstractC1721a.n(f10838i, "Error occurred, shutting down websocket connection: " + str, th);
        j();
    }

    private void j() {
        J j10 = this.f10844f;
        if (j10 != null) {
            try {
                j10.f(1000, "End of session");
            } catch (Exception unused) {
            }
            this.f10844f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l() {
        if (!this.f10842d) {
            k();
        }
    }

    private void m() {
        if (this.f10842d) {
            throw new IllegalStateException("Can't reconnect closed client");
        }
        if (!this.f10843e) {
            AbstractC1721a.J(f10838i, "Couldn't connect to \"" + this.f10839a + "\", will silently retry");
            this.f10843e = true;
        }
        this.f10840b.postDelayed(new a(), 2000L);
    }

    @Override // Td.K
    public synchronized void a(J j10, int i10, String str) {
        try {
            this.f10844f = null;
            if (!this.f10842d) {
                b bVar = this.f10846h;
                if (bVar != null) {
                    bVar.a();
                }
                m();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Td.K
    public synchronized void c(J j10, Throwable th, F f10) {
        try {
            if (this.f10844f != null) {
                h("Websocket exception", th);
            }
            if (!this.f10842d) {
                b bVar = this.f10846h;
                if (bVar != null) {
                    bVar.a();
                }
                m();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Td.K
    public synchronized void d(J j10, String str) {
        c cVar = this.f10845g;
        if (cVar != null) {
            cVar.onMessage(str);
        }
    }

    @Override // Td.K
    public synchronized void e(J j10, C3880h c3880h) {
        c cVar = this.f10845g;
        if (cVar != null) {
            cVar.a(c3880h);
        }
    }

    @Override // Td.K
    public synchronized void f(J j10, F f10) {
        this.f10844f = j10;
        this.f10843e = false;
        b bVar = this.f10846h;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void i() {
        this.f10842d = true;
        j();
        this.f10845g = null;
        b bVar = this.f10846h;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void k() {
        if (this.f10842d) {
            throw new IllegalStateException("Can't connect closed client");
        }
        this.f10841c.B(new D.a().x(this.f10839a).b(), this);
    }

    public synchronized void n(String str) {
        J j10 = this.f10844f;
        if (j10 == null) {
            throw new ClosedChannelException();
        }
        j10.a(str);
    }
}
