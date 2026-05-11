package Cb;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import yc.InterfaceC5191a;

/* loaded from: classes2.dex */
public final class k implements Iterator, InterfaceC5191a {

    /* renamed from: a, reason: collision with root package name */
    private final e f1077a;

    /* renamed from: b, reason: collision with root package name */
    private int f1078b;

    public k(e typedArray) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        this.f1077a = typedArray;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1078b < this.f1077a.getLength();
    }

    @Override // java.util.Iterator
    public Object next() {
        e eVar = this.f1077a;
        int i10 = this.f1078b;
        this.f1078b = i10 + 1;
        return eVar.get(i10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
