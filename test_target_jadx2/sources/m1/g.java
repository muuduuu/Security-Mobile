package m1;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;
import l1.i;

/* loaded from: classes.dex */
public class g implements i {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteProgram f37292a;

    public g(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f37292a = delegate;
    }

    @Override // l1.i
    public void G0(int i10, long j10) {
        this.f37292a.bindLong(i10, j10);
    }

    @Override // l1.i
    public void P0(int i10, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f37292a.bindBlob(i10, value);
    }

    @Override // l1.i
    public void b0(int i10, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f37292a.bindString(i10, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37292a.close();
    }

    @Override // l1.i
    public void m0(int i10, double d10) {
        this.f37292a.bindDouble(i10, d10);
    }

    @Override // l1.i
    public void s1(int i10) {
        this.f37292a.bindNull(i10);
    }
}
