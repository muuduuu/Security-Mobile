package Jd;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Jd.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0917x0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC0915w0 f5072a;

    public C0917x0(String str, Throwable th, InterfaceC0915w0 interfaceC0915w0) {
        super(str);
        this.f5072a = interfaceC0915w0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0917x0) {
                C0917x0 c0917x0 = (C0917x0) obj;
                if (!Intrinsics.b(c0917x0.getMessage(), getMessage()) || !Intrinsics.b(c0917x0.f5072a, this.f5072a) || !Intrinsics.b(c0917x0.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics.d(message);
        int hashCode = ((message.hashCode() * 31) + this.f5072a.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f5072a;
    }
}
