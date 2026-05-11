package androidx.work.impl;

import i1.AbstractC3312b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.work.impl.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1628n extends AbstractC3312b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1628n f18361c = new C1628n();

    private C1628n() {
        super(6, 7);
    }

    @Override // i1.AbstractC3312b
    public void a(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.Z("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
