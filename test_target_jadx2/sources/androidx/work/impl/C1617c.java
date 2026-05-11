package androidx.work.impl;

import i1.InterfaceC3311a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.work.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1617c implements InterfaceC3311a {
    @Override // i1.InterfaceC3311a
    public void a(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.Z("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
