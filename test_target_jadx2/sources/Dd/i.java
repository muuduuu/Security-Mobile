package Dd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
public final class i extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1515a = new i();

    public static final class a implements Iterator, InterfaceC5191a {
        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private i() {
        super(null);
    }

    @Override // Dd.c
    public int c() {
        return 0;
    }

    @Override // Dd.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Void get(int i10) {
        return null;
    }

    @Override // Dd.c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // Dd.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void e(int i10, Void value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }
}
