package androidx.camera.core.impl;

import A.AbstractC0700h0;
import A.InterfaceC0703j;
import B.a;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.O;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import q1.AbstractC3901a;

/* loaded from: classes.dex */
public final class O implements a.InterfaceC0008a {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f14439a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private final Object f14440b;

    /* renamed from: c, reason: collision with root package name */
    private int f14441c;

    /* renamed from: d, reason: collision with root package name */
    private final B.a f14442d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f14443e;

    /* renamed from: f, reason: collision with root package name */
    private int f14444f;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private H.a f14445a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f14446b;

        /* renamed from: c, reason: collision with root package name */
        private final b f14447c;

        /* renamed from: d, reason: collision with root package name */
        private final c f14448d;

        a(H.a aVar, Executor executor, b bVar, c cVar) {
            this.f14445a = aVar;
            this.f14446b = executor;
            this.f14447c = bVar;
            this.f14448d = cVar;
        }

        H.a a() {
            return this.f14445a;
        }

        void b() {
            try {
                Executor executor = this.f14446b;
                final b bVar = this.f14447c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.N
                    @Override // java.lang.Runnable
                    public final void run() {
                        O.b.this.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC0700h0.d("CameraStateRegistry", "Unable to notify camera to configure.", e10);
            }
        }

        void c() {
            try {
                Executor executor = this.f14446b;
                final c cVar = this.f14448d;
                Objects.requireNonNull(cVar);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.M
                    @Override // java.lang.Runnable
                    public final void run() {
                        O.c.this.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC0700h0.d("CameraStateRegistry", "Unable to notify camera to open.", e10);
            }
        }

        H.a d(H.a aVar) {
            H.a aVar2 = this.f14445a;
            this.f14445a = aVar;
            return aVar2;
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public O(B.a aVar, int i10) {
        Object obj = new Object();
        this.f14440b = obj;
        this.f14443e = new HashMap();
        this.f14441c = i10;
        synchronized (obj) {
            this.f14442d = aVar;
            this.f14444f = this.f14441c;
        }
    }

    private a b(String str) {
        for (InterfaceC0703j interfaceC0703j : this.f14443e.keySet()) {
            if (str.equals(((G) interfaceC0703j.c()).f())) {
                return (a) this.f14443e.get(interfaceC0703j);
            }
        }
        return null;
    }

    private static boolean d(H.a aVar) {
        return aVar != null && aVar.holdsCameraSlot();
    }

    private void f() {
        if (AbstractC0700h0.f("CameraStateRegistry")) {
            this.f14439a.setLength(0);
            this.f14439a.append("Recalculating open cameras:\n");
            this.f14439a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f14439a.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry entry : this.f14443e.entrySet()) {
            if (AbstractC0700h0.f("CameraStateRegistry")) {
                this.f14439a.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC0703j) entry.getKey()).toString(), ((a) entry.getValue()).a() != null ? ((a) entry.getValue()).a().toString() : "UNKNOWN"));
            }
            if (d(((a) entry.getValue()).a())) {
                i10++;
            }
        }
        if (AbstractC0700h0.f("CameraStateRegistry")) {
            this.f14439a.append("-------------------------------------------------------------------\n");
            this.f14439a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i10), Integer.valueOf(this.f14441c)));
            AbstractC0700h0.a("CameraStateRegistry", this.f14439a.toString());
        }
        this.f14444f = Math.max(this.f14441c - i10, 0);
    }

    private static void h(InterfaceC0703j interfaceC0703j, H.a aVar) {
        if (AbstractC3901a.h()) {
            AbstractC3901a.j("CX:State[" + interfaceC0703j + "]", aVar.ordinal());
        }
    }

    private H.a k(InterfaceC0703j interfaceC0703j) {
        a aVar = (a) this.f14443e.remove(interfaceC0703j);
        if (aVar == null) {
            return null;
        }
        f();
        return aVar.a();
    }

    private H.a l(InterfaceC0703j interfaceC0703j, H.a aVar) {
        H.a d10 = ((a) y0.f.h((a) this.f14443e.get(interfaceC0703j), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).d(aVar);
        H.a aVar2 = H.a.OPENING;
        if (aVar == aVar2) {
            y0.f.j(d(aVar) || d10 == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (d10 != aVar) {
            h(interfaceC0703j, aVar);
            f();
        }
        return d10;
    }

    @Override // B.a.InterfaceC0008a
    public void a(int i10, int i11) {
        synchronized (this.f14440b) {
            boolean z10 = true;
            this.f14441c = i11 == 2 ? 2 : 1;
            boolean z11 = i10 != 2 && i11 == 2;
            if (i10 != 2 || i11 == 2) {
                z10 = false;
            }
            if (z11 || z10) {
                f();
            }
        }
    }

    public boolean c() {
        synchronized (this.f14440b) {
            try {
                Iterator it = this.f14443e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((a) ((Map.Entry) it.next()).getValue()).a() == H.a.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(InterfaceC0703j interfaceC0703j, H.a aVar, boolean z10) {
        a aVar2;
        synchronized (this.f14440b) {
            try {
                int i10 = this.f14444f;
                if ((aVar == H.a.RELEASED ? k(interfaceC0703j) : l(interfaceC0703j, aVar)) == aVar) {
                    return;
                }
                HashMap hashMap = null;
                if (this.f14442d.a() == 2 && aVar == H.a.CONFIGURED) {
                    String c10 = this.f14442d.c(((G) interfaceC0703j.c()).f());
                    if (c10 != null) {
                        aVar2 = b(c10);
                        if (i10 >= 1 && this.f14444f > 0) {
                            hashMap = new HashMap();
                            for (Map.Entry entry : this.f14443e.entrySet()) {
                                if (((a) entry.getValue()).a() == H.a.PENDING_OPEN) {
                                    hashMap.put((InterfaceC0703j) entry.getKey(), (a) entry.getValue());
                                }
                            }
                        } else if (aVar == H.a.PENDING_OPEN && this.f14444f > 0) {
                            hashMap = new HashMap();
                            hashMap.put(interfaceC0703j, (a) this.f14443e.get(interfaceC0703j));
                        }
                        if (hashMap != null && !z10) {
                            hashMap.remove(interfaceC0703j);
                        }
                        if (hashMap != null) {
                            Iterator it = hashMap.values().iterator();
                            while (it.hasNext()) {
                                ((a) it.next()).c();
                            }
                        }
                        if (aVar2 == null) {
                            aVar2.b();
                            return;
                        }
                        return;
                    }
                }
                aVar2 = null;
                if (i10 >= 1) {
                }
                if (aVar == H.a.PENDING_OPEN) {
                    hashMap = new HashMap();
                    hashMap.put(interfaceC0703j, (a) this.f14443e.get(interfaceC0703j));
                }
                if (hashMap != null) {
                    hashMap.remove(interfaceC0703j);
                }
                if (hashMap != null) {
                }
                if (aVar2 == null) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(InterfaceC0703j interfaceC0703j, Executor executor, b bVar, c cVar) {
        synchronized (this.f14440b) {
            y0.f.j(!this.f14443e.containsKey(interfaceC0703j), "Camera is already registered: " + interfaceC0703j);
            this.f14443e.put(interfaceC0703j, new a(null, executor, bVar, cVar));
        }
    }

    public boolean i(InterfaceC0703j interfaceC0703j) {
        boolean z10;
        synchronized (this.f14440b) {
            try {
                a aVar = (a) y0.f.h((a) this.f14443e.get(interfaceC0703j), "Camera must first be registered with registerCamera()");
                z10 = false;
                if (AbstractC0700h0.f("CameraStateRegistry")) {
                    this.f14439a.setLength(0);
                    this.f14439a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", interfaceC0703j, Integer.valueOf(this.f14444f), Boolean.valueOf(d(aVar.a())), aVar.a()));
                }
                if (this.f14444f > 0 || d(aVar.a())) {
                    H.a aVar2 = H.a.OPENING;
                    aVar.d(aVar2);
                    h(interfaceC0703j, aVar2);
                    z10 = true;
                }
                if (AbstractC0700h0.f("CameraStateRegistry")) {
                    this.f14439a.append(String.format(Locale.US, " --> %s", z10 ? "SUCCESS" : "FAIL"));
                    AbstractC0700h0.a("CameraStateRegistry", this.f14439a.toString());
                }
                if (z10) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean j(String str, String str2) {
        boolean z10;
        boolean z11;
        synchronized (this.f14440b) {
            try {
                boolean z12 = true;
                if (this.f14442d.a() != 2) {
                    return true;
                }
                a b10 = b(str);
                H.a a10 = b10 != null ? b10.a() : null;
                a b11 = str2 != null ? b(str2) : null;
                H.a a11 = b11 != null ? b11.a() : null;
                H.a aVar = H.a.OPEN;
                if (!aVar.equals(a10) && !H.a.CONFIGURED.equals(a10)) {
                    z10 = false;
                    if (!aVar.equals(a11) && !H.a.CONFIGURED.equals(a11)) {
                        z11 = false;
                        if (z10 || !z11) {
                            z12 = false;
                        }
                        return z12;
                    }
                    z11 = true;
                    if (z10) {
                    }
                    z12 = false;
                    return z12;
                }
                z10 = true;
                if (!aVar.equals(a11)) {
                    z11 = false;
                    if (z10) {
                    }
                    z12 = false;
                    return z12;
                }
                z11 = true;
                if (z10) {
                }
                z12 = false;
                return z12;
            } finally {
            }
        }
    }
}
