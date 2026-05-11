package p7;

import D7.C0787k;
import T6.C1182l;
import T6.InterfaceC1167d;
import V6.AbstractC1287s;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import x7.C5128k;
import x7.InterfaceC5120c;
import x7.InterfaceC5130m;

/* renamed from: p7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3816h implements InterfaceC5120c {
    static /* bridge */ /* synthetic */ C0787k d(final InterfaceC1167d interfaceC1167d) {
        C0787k c0787k = new C0787k();
        c0787k.a().addOnCompleteListener(new OnCompleteListener() { // from class: p7.b
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                InterfaceC1167d interfaceC1167d2 = InterfaceC1167d.this;
                if (task.isSuccessful()) {
                    interfaceC1167d2.b(Status.f23339f);
                    return;
                }
                if (task.l()) {
                    interfaceC1167d2.a(Status.f23343j);
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof S6.b) {
                    interfaceC1167d2.a(((S6.b) exception).a());
                } else {
                    interfaceC1167d2.a(Status.f23341h);
                }
            }
        });
        return c0787k;
    }

    @Override // x7.InterfaceC5120c
    public final S6.k a(S6.h hVar, InterfaceC5130m interfaceC5130m) {
        return hVar.h(new C3810e(this, hVar, interfaceC5130m));
    }

    @Override // x7.InterfaceC5120c
    public final S6.k b(S6.h hVar, LocationRequest locationRequest, InterfaceC5130m interfaceC5130m, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            AbstractC1287s.n(looper, "invalid null looper");
        }
        return hVar.h(new C3808d(this, hVar, C1182l.a(interfaceC5130m, looper, InterfaceC5130m.class.getSimpleName()), locationRequest));
    }

    @Override // x7.InterfaceC5120c
    public final Location c(S6.h hVar) {
        boolean await;
        boolean z10 = false;
        AbstractC1287s.b(hVar != null, "GoogleApiClient parameter is required.");
        C3809d0 c3809d0 = (C3809d0) hVar.j(C3837v.f38469k);
        final AtomicReference atomicReference = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        C0787k c0787k = new C0787k();
        try {
            c3809d0.x0(new C5128k.a().a(), c0787k);
            c0787k.a().addOnCompleteListener(new OnCompleteListener() { // from class: p7.c
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AtomicReference atomicReference2 = atomicReference;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    if (task.isSuccessful()) {
                        atomicReference2.set((Location) task.getResult());
                    }
                    countDownLatch2.countDown();
                }
            });
            try {
                long nanos = TimeUnit.SECONDS.toNanos(30L);
                long nanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            await = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            nanos = nanoTime - System.nanoTime();
                            z10 = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z10 = true;
                        if (z10) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                if (await) {
                    return (Location) atomicReference.get();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
