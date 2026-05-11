package androidx.work.impl;

import i1.AbstractC3312b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.work.impl.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1630p extends AbstractC3312b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1630p f18363c = new C1630p();

    private C1630p() {
        super(8, 9);
    }

    @Override // i1.AbstractC3312b
    public void a(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.Z("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
