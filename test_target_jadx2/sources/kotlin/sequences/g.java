package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
final class g implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f36764a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f36765b;

    public static final class a implements Iterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private Object f36766a;

        /* renamed from: b, reason: collision with root package name */
        private int f36767b = -2;

        a() {
        }

        private final void a() {
            Object invoke;
            if (this.f36767b == -2) {
                invoke = g.this.f36764a.invoke();
            } else {
                Function1 function1 = g.this.f36765b;
                Object obj = this.f36766a;
                Intrinsics.d(obj);
                invoke = function1.invoke(obj);
            }
            this.f36766a = invoke;
            this.f36767b = invoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f36767b < 0) {
                a();
            }
            return this.f36767b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f36767b < 0) {
                a();
            }
            if (this.f36767b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f36766a;
            Intrinsics.e(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f36767b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(Function0 getInitialValue, Function1 getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f36764a = getInitialValue;
        this.f36765b = getNextValue;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
