package h8;

import g8.h;
import i8.AbstractC3332a;
import i8.AbstractC3333b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: h8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3297b extends AbstractC3298c {

    /* renamed from: h8.b$a */
    private static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Future f33983a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC3296a f33984b;

        a(Future future, InterfaceC3296a interfaceC3296a) {
            this.f33983a = future;
            this.f33984b = interfaceC3296a;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable a10;
            Object obj = this.f33983a;
            if ((obj instanceof AbstractC3332a) && (a10 = AbstractC3333b.a((AbstractC3332a) obj)) != null) {
                this.f33984b.onFailure(a10);
                return;
            }
            try {
                this.f33984b.onSuccess(AbstractC3297b.b(this.f33983a));
            } catch (Error e10) {
                e = e10;
                this.f33984b.onFailure(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f33984b.onFailure(e);
            } catch (ExecutionException e12) {
                this.f33984b.onFailure(e12.getCause());
            }
        }

        public String toString() {
            return g8.d.a(this).c(this.f33984b).toString();
        }
    }

    public static void a(d dVar, InterfaceC3296a interfaceC3296a, Executor executor) {
        h.h(interfaceC3296a);
        dVar.e(new a(dVar, interfaceC3296a), executor);
    }

    public static Object b(Future future) {
        h.o(future.isDone(), "Future was expected to be done: %s", future);
        return e.a(future);
    }
}
