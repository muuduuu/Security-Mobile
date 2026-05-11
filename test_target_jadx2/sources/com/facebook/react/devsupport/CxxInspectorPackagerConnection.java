package com.facebook.react.devsupport;

import Td.B;
import Td.D;
import android.os.Handler;
import android.os.Looper;
import com.facebook.jni.HybridData;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class CxxInspectorPackagerConnection implements N {
    private final HybridData mHybridData;

    private static class DelegateImpl {

        /* renamed from: a, reason: collision with root package name */
        private final Td.B f21452a;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f21453b;

        class a extends Td.K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WebSocketDelegate f21454a;

            /* renamed from: com.facebook.react.devsupport.CxxInspectorPackagerConnection$DelegateImpl$a$a, reason: collision with other inner class name */
            class RunnableC0375a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Throwable f21456a;

                RunnableC0375a(Throwable th) {
                    this.f21456a = th;
                }

                @Override // java.lang.Runnable
                public void run() {
                    String message = this.f21456a.getMessage();
                    WebSocketDelegate webSocketDelegate = a.this.f21454a;
                    if (message == null) {
                        message = "<Unknown error>";
                    }
                    webSocketDelegate.didFailWithError(null, message);
                    a.this.f21454a.close();
                }
            }

            class b implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f21458a;

                b(String str) {
                    this.f21458a = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f21454a.didReceiveMessage(this.f21458a);
                }
            }

            class c implements Runnable {
                c() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.f21454a.didClose();
                    a.this.f21454a.close();
                }
            }

            a(WebSocketDelegate webSocketDelegate) {
                this.f21454a = webSocketDelegate;
            }

            @Override // Td.K
            public void a(Td.J j10, int i10, String str) {
                DelegateImpl.this.scheduleCallback(new c(), 0L);
            }

            @Override // Td.K
            public void c(Td.J j10, Throwable th, Td.F f10) {
                DelegateImpl.this.scheduleCallback(new RunnableC0375a(th), 0L);
            }

            @Override // Td.K
            public void d(Td.J j10, String str) {
                DelegateImpl.this.scheduleCallback(new b(str), 0L);
            }
        }

        class b implements a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Td.J f21461a;

            b(Td.J j10) {
                this.f21461a = j10;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f21461a.f(1000, "End of session");
            }
        }

        public a connectWebSocket(String str, WebSocketDelegate webSocketDelegate) {
            return new b(this.f21452a.B(new D.a().x(str).b(), new a(webSocketDelegate)));
        }

        public void scheduleCallback(Runnable runnable, long j10) {
            this.f21453b.postDelayed(runnable, j10);
        }

        private DelegateImpl() {
            B.a aVar = new B.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.f21452a = aVar.g(10L, timeUnit).i0(10L, timeUnit).d0(0L, TimeUnit.MINUTES).c();
            this.f21453b = new Handler(Looper.getMainLooper());
        }
    }

    private static class WebSocketDelegate implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final HybridData f21463a;

        private WebSocketDelegate(HybridData hybridData) {
            this.f21463a = hybridData;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f21463a.resetNative();
        }

        public native void didClose();

        public native void didFailWithError(Integer num, String str);

        public native void didReceiveMessage(String str);
    }

    private interface a extends Closeable {
    }

    static {
        J.a();
    }

    public CxxInspectorPackagerConnection(String str, String str2) {
        this.mHybridData = initHybrid(str, str2, new DelegateImpl());
    }

    private static native HybridData initHybrid(String str, String str2, DelegateImpl delegateImpl);

    @Override // com.facebook.react.devsupport.N
    public native void closeQuietly();

    @Override // com.facebook.react.devsupport.N
    public native void connect();

    @Override // com.facebook.react.devsupport.N
    public native void sendEventToAllConnections(String str);
}
