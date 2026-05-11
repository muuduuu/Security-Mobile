package j0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import yc.InterfaceC5191a;

/* loaded from: classes.dex */
public abstract class e implements Iterator, InterfaceC5191a {

    /* renamed from: a, reason: collision with root package name */
    private int f35685a;

    /* renamed from: b, reason: collision with root package name */
    private int f35686b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35687c;

    public e(int i10) {
        this.f35685a = i10;
    }

    protected abstract Object a(int i10);

    protected abstract void b(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f35686b < this.f35685a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a10 = a(this.f35686b);
        this.f35686b++;
        this.f35687c = true;
        return a10;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f35687c) {
            k0.d.b("Call next() before removing an element.");
        }
        int i10 = this.f35686b - 1;
        this.f35686b = i10;
        b(i10);
        this.f35685a--;
        this.f35687c = false;
    }
}
