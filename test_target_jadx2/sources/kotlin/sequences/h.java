package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import pc.AbstractC3868b;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
final class h extends i implements Iterator, kotlin.coroutines.d, InterfaceC5191a {

    /* renamed from: a, reason: collision with root package name */
    private int f36769a;

    /* renamed from: b, reason: collision with root package name */
    private Object f36770b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f36771c;

    /* renamed from: d, reason: collision with root package name */
    private kotlin.coroutines.d f36772d;

    private final Throwable g() {
        int i10 = this.f36769a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f36769a);
    }

    private final Object i() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // kotlin.sequences.i
    public Object a(Object obj, kotlin.coroutines.d dVar) {
        this.f36770b = obj;
        this.f36769a = 3;
        this.f36772d = dVar;
        Object e10 = AbstractC3868b.e();
        if (e10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return e10 == AbstractC3868b.e() ? e10 : Unit.f36324a;
    }

    @Override // kotlin.sequences.i
    public Object d(Iterator it, kotlin.coroutines.d dVar) {
        if (!it.hasNext()) {
            return Unit.f36324a;
        }
        this.f36771c = it;
        this.f36769a = 2;
        this.f36772d = dVar;
        Object e10 = AbstractC3868b.e();
        if (e10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return e10 == AbstractC3868b.e() ? e10 : Unit.f36324a;
    }

    @Override // kotlin.coroutines.d
    public CoroutineContext getContext() {
        return kotlin.coroutines.g.f36372a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i10 = this.f36769a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw g();
                }
                Iterator it = this.f36771c;
                Intrinsics.d(it);
                if (it.hasNext()) {
                    this.f36769a = 2;
                    return true;
                }
                this.f36771c = null;
            }
            this.f36769a = 5;
            kotlin.coroutines.d dVar = this.f36772d;
            Intrinsics.d(dVar);
            this.f36772d = null;
            o.a aVar = lc.o.f37128b;
            dVar.resumeWith(lc.o.b(Unit.f36324a));
        }
    }

    public final void j(kotlin.coroutines.d dVar) {
        this.f36772d = dVar;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f36769a;
        if (i10 == 0 || i10 == 1) {
            return i();
        }
        if (i10 == 2) {
            this.f36769a = 1;
            Iterator it = this.f36771c;
            Intrinsics.d(it);
            return it.next();
        }
        if (i10 != 3) {
            throw g();
        }
        this.f36769a = 0;
        Object obj = this.f36770b;
        this.f36770b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
        lc.p.b(obj);
        this.f36769a = 4;
    }
}
