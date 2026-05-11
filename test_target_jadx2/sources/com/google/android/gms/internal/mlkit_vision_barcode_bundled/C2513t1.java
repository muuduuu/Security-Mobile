package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2513t1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f24948a;

    public C2513t1(Iterator it) {
        this.f24948a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24948a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f24948a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f24948a.remove();
    }
}
