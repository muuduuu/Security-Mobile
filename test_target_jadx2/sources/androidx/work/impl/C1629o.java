package androidx.work.impl;

import i1.AbstractC3312b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.work.impl.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1629o extends AbstractC3312b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1629o f18362c = new C1629o();

    private C1629o() {
        super(7, 8);
    }

    @Override // i1.AbstractC3312b
    public void a(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.Z("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
