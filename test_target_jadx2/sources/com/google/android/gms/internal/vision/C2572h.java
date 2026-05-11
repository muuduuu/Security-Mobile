package com.google.android.gms.internal.vision;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.vision.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2572h {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f25138a = new ConcurrentHashMap(16, 0.75f, 10);

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue f25139b = new ReferenceQueue();

    C2572h() {
    }

    public final List a(Throwable th, boolean z10) {
        Reference poll = this.f25139b.poll();
        while (poll != null) {
            this.f25138a.remove(poll);
            poll = this.f25139b.poll();
        }
        List list = (List) this.f25138a.get(new C2569g(th, null));
        if (!z10) {
            return list;
        }
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List list2 = (List) this.f25138a.putIfAbsent(new C2569g(th, this.f25139b), vector);
        return list2 == null ? vector : list2;
    }
}
