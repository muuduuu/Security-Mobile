package androidx.camera.core.impl;

import A.AbstractC0700h0;
import androidx.camera.core.impl.E0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import y0.InterfaceC5159a;

/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: b, reason: collision with root package name */
    public static final L0 f14434b = L0.b();

    /* renamed from: c, reason: collision with root package name */
    private static final M0 f14435c = new M0();

    /* renamed from: a, reason: collision with root package name */
    private final C0 f14436a = C0.l(f14434b);

    private static class a implements E0.a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5159a f14437a;

        a(InterfaceC5159a interfaceC5159a) {
            this.f14437a = interfaceC5159a;
        }

        @Override // androidx.camera.core.impl.E0.a
        public void a(Object obj) {
            this.f14437a.accept(obj);
        }

        @Override // androidx.camera.core.impl.E0.a
        public void onError(Throwable th) {
            AbstractC0700h0.d("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
        }
    }

    public static M0 b() {
        return f14435c;
    }

    public L0 a() {
        try {
            return (L0) this.f14436a.c().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e10);
        }
    }

    public void c(Executor executor, InterfaceC5159a interfaceC5159a) {
        this.f14436a.e(executor, new a(interfaceC5159a));
    }

    public void d(L0 l02) {
        this.f14436a.k(l02);
    }
}
