package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class b {

    /* renamed from: e, reason: collision with root package name */
    private static b f27440e;

    /* renamed from: a, reason: collision with root package name */
    private final Object f27441a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f27442b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c, reason: collision with root package name */
    private c f27443c;

    /* renamed from: d, reason: collision with root package name */
    private c f27444d;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.d((c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b, reason: collision with other inner class name */
    interface InterfaceC0404b {
        void b();

        void c(int i10);
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final WeakReference f27446a;

        /* renamed from: b, reason: collision with root package name */
        int f27447b;

        /* renamed from: c, reason: collision with root package name */
        boolean f27448c;

        c(int i10, InterfaceC0404b interfaceC0404b) {
            this.f27446a = new WeakReference(interfaceC0404b);
            this.f27447b = i10;
        }

        boolean a(InterfaceC0404b interfaceC0404b) {
            return interfaceC0404b != null && this.f27446a.get() == interfaceC0404b;
        }
    }

    private b() {
    }

    private boolean a(c cVar, int i10) {
        InterfaceC0404b interfaceC0404b = (InterfaceC0404b) cVar.f27446a.get();
        if (interfaceC0404b == null) {
            return false;
        }
        this.f27442b.removeCallbacksAndMessages(cVar);
        interfaceC0404b.c(i10);
        return true;
    }

    static b c() {
        if (f27440e == null) {
            f27440e = new b();
        }
        return f27440e;
    }

    private boolean f(InterfaceC0404b interfaceC0404b) {
        c cVar = this.f27443c;
        return cVar != null && cVar.a(interfaceC0404b);
    }

    private boolean g(InterfaceC0404b interfaceC0404b) {
        c cVar = this.f27444d;
        return cVar != null && cVar.a(interfaceC0404b);
    }

    private void l(c cVar) {
        int i10 = cVar.f27447b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f27442b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f27442b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }

    private void n() {
        c cVar = this.f27444d;
        if (cVar != null) {
            this.f27443c = cVar;
            this.f27444d = null;
            InterfaceC0404b interfaceC0404b = (InterfaceC0404b) cVar.f27446a.get();
            if (interfaceC0404b != null) {
                interfaceC0404b.b();
            } else {
                this.f27443c = null;
            }
        }
    }

    public void b(InterfaceC0404b interfaceC0404b, int i10) {
        synchronized (this.f27441a) {
            try {
                if (f(interfaceC0404b)) {
                    a(this.f27443c, i10);
                } else if (g(interfaceC0404b)) {
                    a(this.f27444d, i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d(c cVar) {
        synchronized (this.f27441a) {
            try {
                if (this.f27443c != cVar) {
                    if (this.f27444d == cVar) {
                    }
                }
                a(cVar, 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(InterfaceC0404b interfaceC0404b) {
        boolean z10;
        synchronized (this.f27441a) {
            try {
                z10 = f(interfaceC0404b) || g(interfaceC0404b);
            } finally {
            }
        }
        return z10;
    }

    public void h(InterfaceC0404b interfaceC0404b) {
        synchronized (this.f27441a) {
            try {
                if (f(interfaceC0404b)) {
                    this.f27443c = null;
                    if (this.f27444d != null) {
                        n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(InterfaceC0404b interfaceC0404b) {
        synchronized (this.f27441a) {
            try {
                if (f(interfaceC0404b)) {
                    l(this.f27443c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(InterfaceC0404b interfaceC0404b) {
        synchronized (this.f27441a) {
            try {
                if (f(interfaceC0404b)) {
                    c cVar = this.f27443c;
                    if (!cVar.f27448c) {
                        cVar.f27448c = true;
                        this.f27442b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(InterfaceC0404b interfaceC0404b) {
        synchronized (this.f27441a) {
            try {
                if (f(interfaceC0404b)) {
                    c cVar = this.f27443c;
                    if (cVar.f27448c) {
                        cVar.f27448c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(int i10, InterfaceC0404b interfaceC0404b) {
        synchronized (this.f27441a) {
            try {
                if (f(interfaceC0404b)) {
                    c cVar = this.f27443c;
                    cVar.f27447b = i10;
                    this.f27442b.removeCallbacksAndMessages(cVar);
                    l(this.f27443c);
                    return;
                }
                if (g(interfaceC0404b)) {
                    this.f27444d.f27447b = i10;
                } else {
                    this.f27444d = new c(i10, interfaceC0404b);
                }
                c cVar2 = this.f27443c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.f27443c = null;
                    n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
