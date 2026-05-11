package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
public final class b implements Sequence, c {

    /* renamed from: a, reason: collision with root package name */
    private final Sequence f36745a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36746b;

    public static final class a implements Iterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f36747a;

        /* renamed from: b, reason: collision with root package name */
        private int f36748b;

        a(b bVar) {
            this.f36747a = bVar.f36745a.iterator();
            this.f36748b = bVar.f36746b;
        }

        private final void a() {
            while (this.f36748b > 0 && this.f36747a.hasNext()) {
                this.f36747a.next();
                this.f36748b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f36747a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            return this.f36747a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(Sequence sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f36745a = sequence;
        this.f36746b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // kotlin.sequences.c
    public Sequence a(int i10) {
        int i11 = this.f36746b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f36745a, i11);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a(this);
    }
}
