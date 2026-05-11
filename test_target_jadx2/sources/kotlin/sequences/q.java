package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
public final class q implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    private final Sequence f36788a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f36789b;

    public static final class a implements Iterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f36790a;

        a() {
            this.f36790a = q.this.f36788a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36790a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return q.this.f36789b.invoke(this.f36790a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q(Sequence sequence, Function1 transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f36788a = sequence;
        this.f36789b = transformer;
    }

    public final Sequence d(Function1 iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new f(this.f36788a, this.f36789b, iterator);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
