package androidx.work.impl;

import i1.AbstractC3312b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.work.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1621g extends AbstractC3312b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1621g f18354c = new C1621g();

    private C1621g() {
        super(11, 12);
    }

    @Override // i1.AbstractC3312b
    public void a(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.Z("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
