package t7;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: t7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C4723m implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f43058a;

    /* renamed from: b, reason: collision with root package name */
    final Collection f43059b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC4730n f43060c;

    C4723m(AbstractC4730n abstractC4730n, Iterator it) {
        this.f43060c = abstractC4730n;
        this.f43059b = abstractC4730n.f43079b;
        this.f43058a = it;
    }

    final void a() {
        this.f43060c.zzb();
        if (this.f43060c.f43079b != this.f43059b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f43058a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f43058a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f43058a.remove();
        AbstractC4751q.i(this.f43060c.f43082e);
        this.f43060c.e();
    }

    C4723m(AbstractC4730n abstractC4730n) {
        this.f43060c = abstractC4730n;
        Collection collection = abstractC4730n.f43079b;
        this.f43059b = collection;
        this.f43058a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
