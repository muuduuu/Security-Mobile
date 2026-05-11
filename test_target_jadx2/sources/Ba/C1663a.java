package ba;

import ba.AbstractC1664b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: ba.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1663a extends AbstractC1664b {

    /* renamed from: a, reason: collision with root package name */
    private final C1665c f18883a;

    /* renamed from: b, reason: collision with root package name */
    private final C0326a f18884b = new C0326a();

    /* renamed from: c, reason: collision with root package name */
    final AbstractC1664b.a f18885c;

    /* renamed from: ba.a$a, reason: collision with other inner class name */
    private static final class C0326a extends ByteArrayOutputStream {
        C0326a() {
        }

        byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* renamed from: ba.a$b */
    private final class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        final Iterator f18886a;

        b(Iterator it) {
            this.f18886a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18886a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            try {
                return C1663a.this.f18885c.from((byte[]) this.f18886a.next());
            } catch (IOException e10) {
                throw ((Error) C1665c.j(e10));
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f18886a.remove();
        }
    }

    C1663a(C1665c c1665c, AbstractC1664b.a aVar) {
        this.f18883a = c1665c;
        this.f18885c = aVar;
    }

    @Override // ba.AbstractC1664b
    public void c(Object obj) {
        this.f18884b.reset();
        this.f18885c.toStream(obj, this.f18884b);
        this.f18883a.c(this.f18884b.a(), 0, this.f18884b.size());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f18883a.close();
    }

    @Override // ba.AbstractC1664b
    public boolean isEmpty() {
        return this.f18883a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new b(this.f18883a.iterator());
    }

    @Override // ba.AbstractC1664b
    public Object peek() {
        byte[] u10 = this.f18883a.u();
        if (u10 == null) {
            return null;
        }
        return this.f18885c.from(u10);
    }

    @Override // ba.AbstractC1664b
    public int size() {
        return this.f18883a.size();
    }

    @Override // ba.AbstractC1664b
    public void t(int i10) {
        this.f18883a.g1(i10);
    }

    public String toString() {
        return "FileObjectQueue{queueFile=" + this.f18883a + '}';
    }
}
