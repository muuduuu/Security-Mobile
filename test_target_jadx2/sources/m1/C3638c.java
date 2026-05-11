package m1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C3598a;
import l1.j;
import l1.k;
import org.conscrypt.BuildConfig;
import wc.o;
import xc.m;

/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3638c implements l1.g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f37264b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f37265c = {BuildConfig.FLAVOR, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f37266d = new String[0];

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f37267a;

    /* renamed from: m1.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: m1.c$b */
    static final class b extends m implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f37268a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(4);
            this.f37268a = jVar;
        }

        @Override // wc.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor r(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f37268a;
            Intrinsics.d(sQLiteQuery);
            jVar.a(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C3638c(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f37267a = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor d(o tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Cursor) tmp0.r(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor e(j query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.d(sQLiteQuery);
        query.a(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // l1.g
    public boolean D1() {
        return this.f37267a.inTransaction();
    }

    @Override // l1.g
    public void I0() {
        this.f37267a.setTransactionSuccessful();
    }

    @Override // l1.g
    public String J() {
        return this.f37267a.getPath();
    }

    @Override // l1.g
    public void J0(String sql, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f37267a.execSQL(sql, bindArgs);
    }

    @Override // l1.g
    public void K0() {
        this.f37267a.beginTransactionNonExclusive();
    }

    @Override // l1.g
    public boolean K1() {
        return l1.b.d(this.f37267a);
    }

    @Override // l1.g
    public int L0(String table, int i10, ContentValues values, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(f37265c[i10]);
        sb2.append(table);
        sb2.append(" SET ");
        int i11 = 0;
        for (String str2 : values.keySet()) {
            sb2.append(i11 > 0 ? "," : BuildConfig.FLAVOR);
            sb2.append(str2);
            objArr2[i11] = values.get(str2);
            sb2.append("=?");
            i11++;
        }
        if (objArr != null) {
            for (int i12 = size; i12 < length; i12++) {
                objArr2[i12] = objArr[i12 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        k k02 = k0(sb3);
        C3598a.f36992c.b(k02, objArr2);
        return k02.j0();
    }

    @Override // l1.g
    public void P() {
        this.f37267a.beginTransaction();
    }

    @Override // l1.g
    public Cursor T(j query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final b bVar = new b(query);
        Cursor rawQueryWithFactory = this.f37267a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: m1.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor d10;
                d10 = C3638c.d(o.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return d10;
            }
        }, query.b(), f37266d, null);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // l1.g
    public List W() {
        return this.f37267a.getAttachedDbs();
    }

    @Override // l1.g
    public Cursor X0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return T(new C3598a(query));
    }

    @Override // l1.g
    public void Z(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f37267a.execSQL(sql);
    }

    @Override // l1.g
    public void b1() {
        this.f37267a.endTransaction();
    }

    public final boolean c(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.b(this.f37267a, sqLiteDatabase);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f37267a.close();
    }

    @Override // l1.g
    public boolean isOpen() {
        return this.f37267a.isOpen();
    }

    @Override // l1.g
    public k k0(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.f37267a.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "delegate.compileStatement(sql)");
        return new h(compileStatement);
    }

    @Override // l1.g
    public Cursor r0(final j query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f37267a;
        String b10 = query.b();
        String[] strArr = f37266d;
        Intrinsics.d(cancellationSignal);
        return l1.b.e(sQLiteDatabase, b10, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: m1.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor e10;
                e10 = C3638c.e(j.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return e10;
            }
        });
    }
}
