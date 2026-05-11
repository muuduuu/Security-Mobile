package androidx.work.impl;

import i1.AbstractC3312b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.work.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1627m extends AbstractC3312b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1627m f18360c = new C1627m();

    private C1627m() {
        super(4, 5);
    }

    @Override // i1.AbstractC3312b
    public void a(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.Z("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        db2.Z("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
