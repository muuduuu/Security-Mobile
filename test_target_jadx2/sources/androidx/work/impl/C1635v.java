package androidx.work.impl;

import android.content.Context;
import i1.AbstractC3312b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.work.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1635v extends AbstractC3312b {

    /* renamed from: c, reason: collision with root package name */
    private final Context f18421c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1635v(Context mContext, int i10, int i11) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f18421c = mContext;
    }

    @Override // i1.AbstractC3312b
    public void a(l1.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        if (this.f34127b >= 10) {
            db2.J0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f18421c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
