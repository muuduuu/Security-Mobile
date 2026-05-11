package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
public final class f implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    private final Sequence f36757a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f36758b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f36759c;

    public static final class a implements Iterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f36760a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator f36761b;

        /* renamed from: c, reason: collision with root package name */
        private int f36762c;

        a() {
            this.f36760a = f.this.f36757a.iterator();
        }

        private final boolean a() {
            Iterator it = this.f36761b;
            if (it != null && it.hasNext()) {
                this.f36762c = 1;
                return true;
            }
            while (this.f36760a.hasNext()) {
                Iterator it2 = (Iterator) f.this.f36759c.invoke(f.this.f36758b.invoke(this.f36760a.next()));
                if (it2.hasNext()) {
                    this.f36761b = it2;
                    this.f36762c = 1;
                    return true;
                }
            }
            this.f36762c = 2;
            this.f36761b = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f36762c;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f36762c;
            if (i10 == 2) {
                throw new NoSuchElementException();
            }
            if (i10 == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.f36762c = 0;
            Iterator it = this.f36761b;
            Intrinsics.d(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(Sequence sequence, Function1 transformer, Function1 iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f36757a = sequence;
        this.f36758b = transformer;
        this.f36759c = iterator;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
