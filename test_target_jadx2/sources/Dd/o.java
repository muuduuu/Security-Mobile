package Dd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
public final class o extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1524a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1525b;

    public static final class a implements Iterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1526a = true;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1526a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f1526a) {
                throw new NoSuchElementException();
            }
            this.f1526a = false;
            return o.this.j();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Object value, int i10) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f1524a = value;
        this.f1525b = i10;
    }

    @Override // Dd.c
    public int c() {
        return 1;
    }

    @Override // Dd.c
    public void e(int i10, Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }

    @Override // Dd.c
    public Object get(int i10) {
        if (i10 == this.f1525b) {
            return this.f1524a;
        }
        return null;
    }

    public final int h() {
        return this.f1525b;
    }

    @Override // Dd.c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    public final Object j() {
        return this.f1524a;
    }
}
