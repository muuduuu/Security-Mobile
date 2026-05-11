package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
public final class e implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    private final Sequence f36750a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36751b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f36752c;

    public static final class a implements Iterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f36753a;

        /* renamed from: b, reason: collision with root package name */
        private int f36754b = -1;

        /* renamed from: c, reason: collision with root package name */
        private Object f36755c;

        a() {
            this.f36753a = e.this.f36750a.iterator();
        }

        private final void a() {
            while (this.f36753a.hasNext()) {
                Object next = this.f36753a.next();
                if (((Boolean) e.this.f36752c.invoke(next)).booleanValue() == e.this.f36751b) {
                    this.f36755c = next;
                    this.f36754b = 1;
                    return;
                }
            }
            this.f36754b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f36754b == -1) {
                a();
            }
            return this.f36754b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f36754b == -1) {
                a();
            }
            if (this.f36754b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f36755c;
            this.f36755c = null;
            this.f36754b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(Sequence sequence, boolean z10, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f36750a = sequence;
        this.f36751b = z10;
        this.f36752c = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
