package Jd;

import java.util.concurrent.locks.LockSupport;

/* renamed from: Jd.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0886h0 extends AbstractC0882f0 {
    protected abstract Thread v1();

    protected final void x1() {
        Thread v12 = v1();
        if (Thread.currentThread() != v12) {
            AbstractC0875c.a();
            LockSupport.unpark(v12);
        }
    }
}
