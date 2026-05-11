package androidx.work.impl;

import i1.AbstractC3312b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.work.impl.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1626l extends AbstractC3312b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1626l f18359c = new C1626l();

    private C1626l() {
        super(3, 4);
    }

    @Override // i1.AbstractC3312b
    public void a(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.Z("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
