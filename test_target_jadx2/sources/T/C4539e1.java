package t;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import t.C4539e1;

/* renamed from: t.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4539e1 {

    /* renamed from: a, reason: collision with root package name */
    final Executor f42053a;

    /* renamed from: b, reason: collision with root package name */
    final Object f42054b = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Set f42055c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    final Set f42056d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    final Set f42057e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    private final CameraDevice.StateCallback f42058f = new a();

    C4539e1(Executor executor) {
        this.f42053a = executor;
    }

    private void a(K1 k12) {
        K1 k13;
        Iterator it = f().iterator();
        while (it.hasNext() && (k13 = (K1) it.next()) != k12) {
            k13.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            K1 k12 = (K1) it.next();
            k12.c().q(k12);
        }
    }

    CameraDevice.StateCallback c() {
        return this.f42058f;
    }

    List d() {
        ArrayList arrayList;
        synchronized (this.f42054b) {
            arrayList = new ArrayList(this.f42055c);
        }
        return arrayList;
    }

    List e() {
        ArrayList arrayList;
        synchronized (this.f42054b) {
            arrayList = new ArrayList(this.f42057e);
        }
        return arrayList;
    }

    List f() {
        ArrayList arrayList;
        synchronized (this.f42054b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(e());
        }
        return arrayList;
    }

    void g(K1 k12) {
        synchronized (this.f42054b) {
            this.f42055c.remove(k12);
            this.f42056d.remove(k12);
        }
    }

    void h(K1 k12) {
        synchronized (this.f42054b) {
            this.f42056d.add(k12);
        }
    }

    void i(K1 k12) {
        a(k12);
        synchronized (this.f42054b) {
            this.f42057e.remove(k12);
        }
    }

    void j(K1 k12) {
        synchronized (this.f42054b) {
            this.f42055c.add(k12);
            this.f42057e.remove(k12);
        }
        a(k12);
    }

    void k(K1 k12) {
        synchronized (this.f42054b) {
            this.f42057e.add(k12);
        }
    }

    /* renamed from: t.e1$a */
    class a extends CameraDevice.StateCallback {
        a() {
        }

        private void c() {
            List f10;
            synchronized (C4539e1.this.f42054b) {
                f10 = C4539e1.this.f();
                C4539e1.this.f42057e.clear();
                C4539e1.this.f42055c.clear();
                C4539e1.this.f42056d.clear();
            }
            Iterator it = f10.iterator();
            while (it.hasNext()) {
                ((K1) it.next()).e();
            }
        }

        private void d(final int i10) {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C4539e1.this.f42054b) {
                linkedHashSet.addAll(C4539e1.this.f42057e);
                linkedHashSet.addAll(C4539e1.this.f42055c);
            }
            C4539e1.this.f42053a.execute(new Runnable() { // from class: t.d1
                @Override // java.lang.Runnable
                public final void run() {
                    C4539e1.a.f(linkedHashSet, i10);
                }
            });
        }

        private void e() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C4539e1.this.f42054b) {
                linkedHashSet.addAll(C4539e1.this.f42057e);
                linkedHashSet.addAll(C4539e1.this.f42055c);
            }
            C4539e1.this.f42053a.execute(new Runnable() { // from class: t.c1
                @Override // java.lang.Runnable
                public final void run() {
                    C4539e1.b(linkedHashSet);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(LinkedHashSet linkedHashSet, int i10) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((K1) it.next()).i(i10);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            e();
            d(i10);
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }
}
