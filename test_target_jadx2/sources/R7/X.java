package r7;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class X implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    int f39813a;

    /* renamed from: b, reason: collision with root package name */
    int f39814b;

    /* renamed from: c, reason: collision with root package name */
    int f39815c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4040b0 f39816d;

    /* synthetic */ X(C4040b0 c4040b0, W w10) {
        int i10;
        this.f39816d = c4040b0;
        i10 = c4040b0.f39914e;
        this.f39813a = i10;
        this.f39814b = c4040b0.e();
        this.f39815c = -1;
    }

    private final void b() {
        int i10;
        i10 = this.f39816d.f39914e;
        if (i10 != this.f39813a) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object a(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39814b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f39814b;
        this.f39815c = i10;
        Object a10 = a(i10);
        this.f39814b = this.f39816d.f(this.f39814b);
        return a10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        AbstractC4248w.e(this.f39815c >= 0, "no calls to next() since the last call to remove()");
        this.f39813a += 32;
        C4040b0 c4040b0 = this.f39816d;
        int i10 = this.f39815c;
        Object[] objArr = c4040b0.f39912c;
        objArr.getClass();
        c4040b0.remove(objArr[i10]);
        this.f39814b--;
        this.f39815c = -1;
    }
}
