package androidx.camera.core.impl;

import androidx.camera.core.impl.E0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class X implements E0 {

    /* renamed from: b, reason: collision with root package name */
    private static final X f14505b = new X(null);

    /* renamed from: a, reason: collision with root package name */
    private final h8.d f14506a;

    private X(Object obj) {
        this.f14506a = G.n.p(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(E0.a aVar) {
        try {
            aVar.a(this.f14506a.get());
        } catch (InterruptedException | ExecutionException e10) {
            aVar.onError(e10);
        }
    }

    public static E0 g(Object obj) {
        return obj == null ? f14505b : new X(obj);
    }

    @Override // androidx.camera.core.impl.E0
    public void a(E0.a aVar) {
    }

    @Override // androidx.camera.core.impl.E0
    public h8.d c() {
        return this.f14506a;
    }

    @Override // androidx.camera.core.impl.E0
    public void e(Executor executor, final E0.a aVar) {
        this.f14506a.e(new Runnable() { // from class: androidx.camera.core.impl.W
            @Override // java.lang.Runnable
            public final void run() {
                X.this.f(aVar);
            }
        }, executor);
    }
}
