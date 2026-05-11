package t7;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: t7.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4638A implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    int f42404a;

    /* renamed from: b, reason: collision with root package name */
    int f42405b;

    /* renamed from: c, reason: collision with root package name */
    int f42406c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ F f42407d;

    /* synthetic */ AbstractC4638A(F f10, C4792w c4792w) {
        int i10;
        this.f42407d = f10;
        i10 = f10.f42489e;
        this.f42404a = i10;
        this.f42405b = f10.g();
        this.f42406c = -1;
    }

    private final void b() {
        int i10;
        i10 = this.f42407d.f42489e;
        if (i10 != this.f42404a) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object a(int i10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42405b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f42405b;
        this.f42406c = i10;
        Object a10 = a(i10);
        this.f42405b = this.f42407d.h(this.f42405b);
        return a10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        AbstractC4653c.d(this.f42406c >= 0, "no calls to next() since the last call to remove()");
        this.f42404a += 32;
        F f10 = this.f42407d;
        f10.remove(F.i(f10, this.f42406c));
        this.f42405b--;
        this.f42406c = -1;
    }
}
