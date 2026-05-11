package u;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import u.P;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final b f43406a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f43407b = new ArrayMap(4);

    static final class a extends CameraManager.AvailabilityCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f43408a;

        /* renamed from: b, reason: collision with root package name */
        final CameraManager.AvailabilityCallback f43409b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f43410c = new Object();

        /* renamed from: d, reason: collision with root package name */
        private boolean f43411d = false;

        a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f43408a = executor;
            this.f43409b = availabilityCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            AbstractC4843g.a(this.f43409b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(String str) {
            this.f43409b.onCameraAvailable(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(String str) {
            this.f43409b.onCameraUnavailable(str);
        }

        void g() {
            synchronized (this.f43410c) {
                this.f43411d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f43410c) {
                try {
                    if (!this.f43411d) {
                        this.f43408a.execute(new Runnable() { // from class: u.N
                            @Override // java.lang.Runnable
                            public final void run() {
                                P.a.this.d();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.f43410c) {
                try {
                    if (!this.f43411d) {
                        this.f43408a.execute(new Runnable() { // from class: u.M
                            @Override // java.lang.Runnable
                            public final void run() {
                                P.a.this.e(str);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.f43410c) {
                try {
                    if (!this.f43411d) {
                        this.f43408a.execute(new Runnable() { // from class: u.O
                            @Override // java.lang.Runnable
                            public final void run() {
                                P.a.this.f(str);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public interface b {
        static b d(Context context, Handler handler) {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 30 ? new T(context) : i10 >= 29 ? new S(context) : i10 >= 28 ? Q.i(context) : U.h(context, handler);
        }

        void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        void b(CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics c(String str);

        Set e();

        void f(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        String[] g();
    }

    private P(b bVar) {
        this.f43406a = bVar;
    }

    public static P a(Context context) {
        return b(context, E.m.a());
    }

    public static P b(Context context, Handler handler) {
        return new P(b.d(context, handler));
    }

    public C4832C c(String str) {
        C4832C c4832c;
        synchronized (this.f43407b) {
            c4832c = (C4832C) this.f43407b.get(str);
            if (c4832c == null) {
                try {
                    c4832c = C4832C.e(this.f43406a.c(str), str);
                    this.f43407b.put(str, c4832c);
                } catch (AssertionError e10) {
                    throw new C4844h(10002, e10.getMessage(), e10);
                }
            }
        }
        return c4832c;
    }

    public String[] d() {
        return this.f43406a.g();
    }

    public Set e() {
        return this.f43406a.e();
    }

    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f43406a.f(str, executor, stateCallback);
    }

    public void g(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f43406a.a(executor, availabilityCallback);
    }

    public void h(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f43406a.b(availabilityCallback);
    }
}
