package Nd;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient Object f6743a;

    public a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f6743a = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
