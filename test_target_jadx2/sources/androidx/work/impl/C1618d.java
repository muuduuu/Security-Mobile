package androidx.work.impl;

import h1.s;
import kotlin.jvm.internal.Intrinsics;
import x1.InterfaceC5098b;

/* renamed from: androidx.work.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1618d extends s.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5098b f18323a;

    public C1618d(InterfaceC5098b clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f18323a = clock;
    }

    private final long d() {
        return this.f18323a.a() - E.f18166a;
    }

    private final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @Override // h1.s.b
    public void c(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.c(db2);
        db2.P();
        try {
            db2.Z(e());
            db2.I0();
        } finally {
            db2.b1();
        }
    }
}
