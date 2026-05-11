package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
public final class p implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    private final Sequence f36782a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f36783b;

    public static final class a implements Iterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f36784a;

        /* renamed from: b, reason: collision with root package name */
        private int f36785b = -1;

        /* renamed from: c, reason: collision with root package name */
        private Object f36786c;

        a() {
            this.f36784a = p.this.f36782a.iterator();
        }

        private final void a() {
            if (this.f36784a.hasNext()) {
                Object next = this.f36784a.next();
                if (((Boolean) p.this.f36783b.invoke(next)).booleanValue()) {
                    this.f36785b = 1;
                    this.f36786c = next;
                    return;
                }
            }
            this.f36785b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f36785b == -1) {
                a();
            }
            return this.f36785b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f36785b == -1) {
                a();
            }
            if (this.f36785b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f36786c;
            this.f36786c = null;
            this.f36785b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public p(Sequence sequence, Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f36782a = sequence;
        this.f36783b = predicate;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
