package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes.dex */
public final class B implements Iterable, InterfaceC5191a {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f36326a;

    public B(Function0 iteratorFactory) {
        Intrinsics.checkNotNullParameter(iteratorFactory, "iteratorFactory");
        this.f36326a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C((Iterator) this.f36326a.invoke());
    }
}
