package androidx.work.impl;

import android.content.ContentValues;
import i1.InterfaceC3311a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.work.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1616b implements InterfaceC3311a {
    @Override // i1.InterfaceC3311a
    public void a(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.Z("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db2.L0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
