package Dd;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
public abstract class a implements Iterable, InterfaceC5191a {

    /* renamed from: Dd.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0028a {

        /* renamed from: a, reason: collision with root package name */
        private final int f1496a;

        public AbstractC0028a(int i10) {
            this.f1496a = i10;
        }

        protected final Object c(a thisRef) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            return thisRef.c().get(this.f1496a);
        }
    }

    protected abstract c c();

    protected abstract s e();

    protected abstract void h(String str, Object obj);

    public final boolean isEmpty() {
        return c().c() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return c().iterator();
    }

    protected final void j(kotlin.reflect.d tClass, Object value) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        Intrinsics.checkNotNullParameter(value, "value");
        String e10 = tClass.e();
        Intrinsics.d(e10);
        h(e10, value);
    }
}
