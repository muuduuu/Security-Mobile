package X8;

import X8.C1295a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes2.dex */
final class r extends PhantomReference implements C1295a.InterfaceC0219a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f11831a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f11832b;

    /* synthetic */ r(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, q qVar) {
        super(obj, referenceQueue);
        this.f11831a = set;
        this.f11832b = runnable;
    }

    @Override // X8.C1295a.InterfaceC0219a
    public final void a() {
        if (this.f11831a.remove(this)) {
            clear();
            this.f11832b.run();
        }
    }
}
