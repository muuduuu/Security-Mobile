package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final Status f23471c = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: a, reason: collision with root package name */
    final Set f23472a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b, reason: collision with root package name */
    private final y f23473b = new y(this);

    final void a(BasePendingResult basePendingResult) {
        this.f23472a.add(basePendingResult);
        basePendingResult.q(this.f23473b);
    }

    public final void b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f23472a.toArray(new BasePendingResult[0])) {
            basePendingResult.q(null);
            if (basePendingResult.p()) {
                this.f23472a.remove(basePendingResult);
            }
        }
    }
}
