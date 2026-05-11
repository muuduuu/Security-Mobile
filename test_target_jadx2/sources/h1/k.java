package h1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class k extends AbstractC3222A {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    protected abstract void i(l1.k kVar, Object obj);

    public final void j(Object obj) {
        l1.k b10 = b();
        try {
            i(b10, obj);
            b10.W1();
        } finally {
            h(b10);
        }
    }

    public final long k(Object obj) {
        l1.k b10 = b();
        try {
            i(b10, obj);
            return b10.W1();
        } finally {
            h(b10);
        }
    }
}
