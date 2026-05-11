package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import yc.InterfaceC5191a;

/* loaded from: classes3.dex */
final class o implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    private final BufferedReader f36412a;

    public static final class a implements Iterator, InterfaceC5191a {

        /* renamed from: a, reason: collision with root package name */
        private String f36413a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f36414b;

        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f36413a;
            this.f36413a = null;
            Intrinsics.d(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f36413a == null && !this.f36414b) {
                String readLine = o.this.f36412a.readLine();
                this.f36413a = readLine;
                if (readLine == null) {
                    this.f36414b = true;
                }
            }
            return this.f36413a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o(BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f36412a = reader;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
