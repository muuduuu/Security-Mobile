package m1;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;
import l1.k;

/* loaded from: classes.dex */
public final class h extends g implements k {

    /* renamed from: b, reason: collision with root package name */
    private final SQLiteStatement f37293b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f37293b = delegate;
    }

    @Override // l1.k
    public long W1() {
        return this.f37293b.executeInsert();
    }

    @Override // l1.k
    public int j0() {
        return this.f37293b.executeUpdateDelete();
    }
}
