package androidx.core.os;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.o;

/* loaded from: classes.dex */
final class f extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.coroutines.d<Object> f15971a;

    public f(kotlin.coroutines.d dVar) {
        super(false);
        this.f15971a = dVar;
    }

    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.d<Object> dVar = this.f15971a;
            o.a aVar = lc.o.f37128b;
            dVar.resumeWith(lc.o.b(lc.p.a(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f15971a.resumeWith(lc.o.b(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
