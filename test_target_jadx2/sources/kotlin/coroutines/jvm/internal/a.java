package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import lc.p;
import pc.AbstractC3868b;

/* loaded from: classes.dex */
public abstract class a implements kotlin.coroutines.d, e, Serializable {
    private final kotlin.coroutines.d<Object> completion;

    public a(kotlin.coroutines.d dVar) {
        this.completion = dVar;
    }

    public kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        kotlin.coroutines.d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final kotlin.coroutines.d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.d
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        kotlin.coroutines.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            kotlin.coroutines.d dVar2 = aVar.completion;
            Intrinsics.d(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                o.a aVar2 = o.f37128b;
                obj = o.b(p.a(th));
            }
            if (invokeSuspend == AbstractC3868b.e()) {
                return;
            }
            obj = o.b(invokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
