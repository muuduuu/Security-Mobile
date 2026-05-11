package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2548a1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Iterator f25101a;

    public C2548a1(Iterator it) {
        this.f25101a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25101a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f25101a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f25101a.remove();
    }
}
