package m1;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.h;
import lc.i;
import m1.d;
import n1.C3703a;
import xc.m;

/* loaded from: classes.dex */
public final class d implements l1.h {

    /* renamed from: h, reason: collision with root package name */
    public static final a f37269h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f37270a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37271b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a f37272c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37273d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f37274e;

    /* renamed from: f, reason: collision with root package name */
    private final Lazy f37275f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37276g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private C3638c f37277a;

        public b(C3638c c3638c) {
            this.f37277a = c3638c;
        }

        public final C3638c a() {
            return this.f37277a;
        }

        public final void b(C3638c c3638c) {
            this.f37277a = c3638c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends SQLiteOpenHelper {

        /* renamed from: h, reason: collision with root package name */
        public static final C0553c f37278h = new C0553c(null);

        /* renamed from: a, reason: collision with root package name */
        private final Context f37279a;

        /* renamed from: b, reason: collision with root package name */
        private final b f37280b;

        /* renamed from: c, reason: collision with root package name */
        private final h.a f37281c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f37282d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f37283e;

        /* renamed from: f, reason: collision with root package name */
        private final C3703a f37284f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f37285g;

        private static final class a extends RuntimeException {

            /* renamed from: a, reason: collision with root package name */
            private final b f37286a;

            /* renamed from: b, reason: collision with root package name */
            private final Throwable f37287b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f37286a = callbackName;
                this.f37287b = cause;
            }

            public final b a() {
                return this.f37286a;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f37287b;
            }
        }

        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* renamed from: m1.d$c$c, reason: collision with other inner class name */
        public static final class C0553c {
            public /* synthetic */ C0553c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C3638c a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                C3638c a10 = refHolder.a();
                if (a10 != null && a10.c(sqLiteDatabase)) {
                    return a10;
                }
                C3638c c3638c = new C3638c(sqLiteDatabase);
                refHolder.b(c3638c);
                return c3638c;
            }

            private C0553c() {
            }
        }

        /* renamed from: m1.d$c$d, reason: collision with other inner class name */
        public /* synthetic */ class C0554d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f37288a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f37288a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final h.a callback, boolean z10) {
            super(context, str, null, callback.f37001a, new DatabaseErrorHandler() { // from class: m1.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    d.c.b(h.a.this, dbRef, sQLiteDatabase);
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f37279a = context;
            this.f37280b = dbRef;
            this.f37281c = callback;
            this.f37282d = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this.f37284f = new C3703a(str, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(h.a callback, b dbRef, SQLiteDatabase dbObj) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(dbRef, "$dbRef");
            C0553c c0553c = f37278h;
            Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
            callback.c(c0553c.a(dbRef, dbObj));
        }

        private final SQLiteDatabase e(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase f(boolean z10) {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.f37285g;
            if (databaseName != null && !z11 && (parentFile = this.f37279a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return e(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return e(z10);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i10 = C0554d.f37288a[aVar.a().ordinal()];
                        if (i10 == 1) {
                            throw cause;
                        }
                        if (i10 == 2) {
                            throw cause;
                        }
                        if (i10 == 3) {
                            throw cause;
                        }
                        if (i10 == 4) {
                            throw cause;
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else {
                        if (!(th instanceof SQLiteException)) {
                            throw th;
                        }
                        if (databaseName == null || !this.f37282d) {
                            throw th;
                        }
                    }
                    this.f37279a.deleteDatabase(databaseName);
                    try {
                        return e(z10);
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        public final l1.g c(boolean z10) {
            try {
                this.f37284f.b((this.f37285g || getDatabaseName() == null) ? false : true);
                this.f37283e = false;
                SQLiteDatabase f10 = f(z10);
                if (!this.f37283e) {
                    C3638c d10 = d(f10);
                    this.f37284f.d();
                    return d10;
                }
                close();
                l1.g c10 = c(z10);
                this.f37284f.d();
                return c10;
            } catch (Throwable th) {
                this.f37284f.d();
                throw th;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                C3703a.c(this.f37284f, false, 1, null);
                super.close();
                this.f37280b.b(null);
                this.f37285g = false;
            } finally {
                this.f37284f.d();
            }
        }

        public final C3638c d(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return f37278h.a(this.f37280b, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            if (!this.f37283e && this.f37281c.f37001a != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                this.f37281c.b(d(db2));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f37281c.d(d(sqLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
            Intrinsics.checkNotNullParameter(db2, "db");
            this.f37283e = true;
            try {
                this.f37281c.e(d(db2), i10, i11);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            if (!this.f37283e) {
                try {
                    this.f37281c.f(d(db2));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.f37285g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.f37283e = true;
            try {
                this.f37281c.g(d(sqLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    /* renamed from: m1.d$d, reason: collision with other inner class name */
    static final class C0555d extends m implements Function0 {
        C0555d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (d.this.f37271b == null || !d.this.f37273d) {
                cVar = new c(d.this.f37270a, d.this.f37271b, new b(null), d.this.f37272c, d.this.f37274e);
            } else {
                cVar = new c(d.this.f37270a, new File(l1.d.a(d.this.f37270a), d.this.f37271b).getAbsolutePath(), new b(null), d.this.f37272c, d.this.f37274e);
            }
            l1.b.f(cVar, d.this.f37276g);
            return cVar;
        }
    }

    public d(Context context, String str, h.a callback, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f37270a = context;
        this.f37271b = str;
        this.f37272c = callback;
        this.f37273d = z10;
        this.f37274e = z11;
        this.f37275f = i.a(new C0555d());
    }

    private final c g() {
        return (c) this.f37275f.getValue();
    }

    @Override // l1.h
    public l1.g U0() {
        return g().c(true);
    }

    @Override // l1.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f37275f.a()) {
            g().close();
        }
    }

    @Override // l1.h
    public String getDatabaseName() {
        return this.f37271b;
    }

    @Override // l1.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f37275f.a()) {
            l1.b.f(g(), z10);
        }
        this.f37276g = z10;
    }
}
