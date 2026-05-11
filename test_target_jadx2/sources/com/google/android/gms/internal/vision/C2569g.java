package com.google.android.gms.internal.vision;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.vision.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2569g extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    private final int f25132a;

    public C2569g(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f25132a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C2569g.class) {
            if (this == obj) {
                return true;
            }
            C2569g c2569g = (C2569g) obj;
            if (this.f25132a == c2569g.f25132a && get() == c2569g.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f25132a;
    }
}
