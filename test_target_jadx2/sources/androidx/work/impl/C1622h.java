package androidx.work.impl;

import i1.AbstractC3312b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.work.impl.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1622h extends AbstractC3312b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1622h f18355c = new C1622h();

    private C1622h() {
        super(12, 13);
    }

    @Override // i1.AbstractC3312b
    public void a(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.Z("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db2.Z("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
