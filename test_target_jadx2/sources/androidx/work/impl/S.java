package androidx.work.impl;

import android.content.Context;
import i1.AbstractC3312b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class S extends AbstractC3312b {

    /* renamed from: c, reason: collision with root package name */
    private final Context f18189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f18189c = context;
    }

    @Override // i1.AbstractC3312b
    public void a(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.Z("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        D1.q.c(this.f18189c, db2);
        D1.l.c(this.f18189c, db2);
    }
}
