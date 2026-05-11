package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2504r2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f24922a = -1;

    /* renamed from: b, reason: collision with root package name */
    private boolean f24923b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f24924c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC2524v2 f24925d;

    /* synthetic */ C2504r2(AbstractC2524v2 abstractC2524v2, AbstractC2500q2 abstractC2500q2) {
        this.f24925d = abstractC2524v2;
    }

    private final Iterator a() {
        Map map;
        if (this.f24924c == null) {
            map = this.f24925d.f24962c;
            this.f24924c = map.entrySet().iterator();
        }
        return this.f24924c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i10 = this.f24922a + 1;
        list = this.f24925d.f24961b;
        if (i10 < list.size()) {
            return true;
        }
        map = this.f24925d.f24962c;
        return !map.isEmpty() && a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.f24923b = true;
        int i10 = this.f24922a + 1;
        this.f24922a = i10;
        list = this.f24925d.f24961b;
        if (i10 >= list.size()) {
            return (Map.Entry) a().next();
        }
        list2 = this.f24925d.f24961b;
        return (Map.Entry) list2.get(this.f24922a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f24923b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f24923b = false;
        this.f24925d.o();
        int i10 = this.f24922a;
        list = this.f24925d.f24961b;
        if (i10 >= list.size()) {
            a().remove();
            return;
        }
        AbstractC2524v2 abstractC2524v2 = this.f24925d;
        int i11 = this.f24922a;
        this.f24922a = i11 - 1;
        abstractC2524v2.m(i11);
    }
}
