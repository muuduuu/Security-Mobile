package h1;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3226d implements l1.h, i {

    /* renamed from: a, reason: collision with root package name */
    private final l1.h f33820a;

    /* renamed from: b, reason: collision with root package name */
    public final C3225c f33821b;

    /* renamed from: c, reason: collision with root package name */
    private final a f33822c;

    /* renamed from: h1.d$a */
    public static final class a implements l1.g {

        /* renamed from: a, reason: collision with root package name */
        private final C3225c f33823a;

        /* renamed from: h1.d$a$a, reason: collision with other inner class name */
        static final class C0499a extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0499a f33824a = new C0499a();

            C0499a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(l1.g obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.W();
            }
        }

        /* renamed from: h1.d$a$b */
        static final class b extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f33825a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f33825a = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(l1.g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.Z(this.f33825a);
                return null;
            }
        }

        /* renamed from: h1.d$a$c */
        static final class c extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f33826a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object[] f33827b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.f33826a = str;
                this.f33827b = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(l1.g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.J0(this.f33826a, this.f33827b);
                return null;
            }
        }

        /* renamed from: h1.d$a$d, reason: collision with other inner class name */
        /* synthetic */ class C0500d extends xc.j implements Function1 {

            /* renamed from: j, reason: collision with root package name */
            public static final C0500d f33828j = new C0500d();

            C0500d() {
                super(1, l1.g.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: I, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(l1.g p02) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                return Boolean.valueOf(p02.D1());
            }
        }

        /* renamed from: h1.d$a$e */
        static final class e extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final e f33829a = new e();

            e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(l1.g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                return Boolean.valueOf(db2.K1());
            }
        }

        /* renamed from: h1.d$a$f */
        static final class f extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final f f33830a = new f();

            f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(l1.g obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.J();
            }
        }

        /* renamed from: h1.d$a$g */
        static final class g extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final g f33831a = new g();

            g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(l1.g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return null;
            }
        }

        /* renamed from: h1.d$a$h */
        static final class h extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f33832a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f33833b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ContentValues f33834c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f33835d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object[] f33836e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f33832a = str;
                this.f33833b = i10;
                this.f33834c = contentValues;
                this.f33835d = str2;
                this.f33836e = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(l1.g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                return Integer.valueOf(db2.L0(this.f33832a, this.f33833b, this.f33834c, this.f33835d, this.f33836e));
            }
        }

        public a(C3225c autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f33823a = autoCloser;
        }

        @Override // l1.g
        public boolean D1() {
            if (this.f33823a.h() == null) {
                return false;
            }
            return ((Boolean) this.f33823a.g(C0500d.f33828j)).booleanValue();
        }

        @Override // l1.g
        public void I0() {
            Unit unit;
            l1.g h10 = this.f33823a.h();
            if (h10 != null) {
                h10.I0();
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // l1.g
        public String J() {
            return (String) this.f33823a.g(f.f33830a);
        }

        @Override // l1.g
        public void J0(String sql, Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.f33823a.g(new c(sql, bindArgs));
        }

        @Override // l1.g
        public void K0() {
            try {
                this.f33823a.j().K0();
            } catch (Throwable th) {
                this.f33823a.e();
                throw th;
            }
        }

        @Override // l1.g
        public boolean K1() {
            return ((Boolean) this.f33823a.g(e.f33829a)).booleanValue();
        }

        @Override // l1.g
        public int L0(String table, int i10, ContentValues values, String str, Object[] objArr) {
            Intrinsics.checkNotNullParameter(table, "table");
            Intrinsics.checkNotNullParameter(values, "values");
            return ((Number) this.f33823a.g(new h(table, i10, values, str, objArr))).intValue();
        }

        @Override // l1.g
        public void P() {
            try {
                this.f33823a.j().P();
            } catch (Throwable th) {
                this.f33823a.e();
                throw th;
            }
        }

        @Override // l1.g
        public Cursor T(l1.j query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f33823a.j().T(query), this.f33823a);
            } catch (Throwable th) {
                this.f33823a.e();
                throw th;
            }
        }

        @Override // l1.g
        public List W() {
            return (List) this.f33823a.g(C0499a.f33824a);
        }

        @Override // l1.g
        public Cursor X0(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f33823a.j().X0(query), this.f33823a);
            } catch (Throwable th) {
                this.f33823a.e();
                throw th;
            }
        }

        @Override // l1.g
        public void Z(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.f33823a.g(new b(sql));
        }

        public final void a() {
            this.f33823a.g(g.f33831a);
        }

        @Override // l1.g
        public void b1() {
            if (this.f33823a.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                l1.g h10 = this.f33823a.h();
                Intrinsics.d(h10);
                h10.b1();
            } finally {
                this.f33823a.e();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f33823a.d();
        }

        @Override // l1.g
        public boolean isOpen() {
            l1.g h10 = this.f33823a.h();
            if (h10 == null) {
                return false;
            }
            return h10.isOpen();
        }

        @Override // l1.g
        public l1.k k0(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new b(sql, this.f33823a);
        }

        @Override // l1.g
        public Cursor r0(l1.j query, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f33823a.j().r0(query, cancellationSignal), this.f33823a);
            } catch (Throwable th) {
                this.f33823a.e();
                throw th;
            }
        }
    }

    /* renamed from: h1.d$c */
    private static final class c implements Cursor {

        /* renamed from: a, reason: collision with root package name */
        private final Cursor f33844a;

        /* renamed from: b, reason: collision with root package name */
        private final C3225c f33845b;

        public c(Cursor delegate, C3225c autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f33844a = delegate;
            this.f33845b = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f33844a.close();
            this.f33845b.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f33844a.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f33844a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f33844a.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f33844a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f33844a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f33844a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f33844a.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f33844a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f33844a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f33844a.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f33844a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f33844a.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f33844a.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f33844a.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return l1.c.a(this.f33844a);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return l1.f.a(this.f33844a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f33844a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f33844a.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f33844a.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f33844a.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f33844a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f33844a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f33844a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f33844a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f33844a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f33844a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f33844a.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f33844a.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f33844a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f33844a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f33844a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f33844a.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f33844a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f33844a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f33844a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f33844a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f33844a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            l1.e.a(this.f33844a, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f33844a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List uris) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            l1.f.b(this.f33844a, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f33844a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f33844a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public C3226d(l1.h delegate, C3225c autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f33820a = delegate;
        this.f33821b = autoCloser;
        autoCloser.k(a());
        this.f33822c = new a(autoCloser);
    }

    @Override // l1.h
    public l1.g U0() {
        this.f33822c.a();
        return this.f33822c;
    }

    @Override // h1.i
    public l1.h a() {
        return this.f33820a;
    }

    @Override // l1.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f33822c.close();
    }

    @Override // l1.h
    public String getDatabaseName() {
        return this.f33820a.getDatabaseName();
    }

    @Override // l1.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f33820a.setWriteAheadLoggingEnabled(z10);
    }

    /* renamed from: h1.d$b */
    private static final class b implements l1.k {

        /* renamed from: a, reason: collision with root package name */
        private final String f33837a;

        /* renamed from: b, reason: collision with root package name */
        private final C3225c f33838b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f33839c;

        /* renamed from: h1.d$b$a */
        static final class a extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f33840a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(l1.k obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Long.valueOf(obj.W1());
            }
        }

        /* renamed from: h1.d$b$b, reason: collision with other inner class name */
        static final class C0501b extends xc.m implements Function1 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f33842b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0501b(Function1 function1) {
                super(1);
                this.f33842b = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(l1.g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                l1.k k02 = db2.k0(b.this.f33837a);
                b.this.c(k02);
                return this.f33842b.invoke(k02);
            }
        }

        /* renamed from: h1.d$b$c */
        static final class c extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final c f33843a = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(l1.k obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Integer.valueOf(obj.j0());
            }
        }

        public b(String sql, C3225c autoCloser) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f33837a = sql;
            this.f33838b = autoCloser;
            this.f33839c = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(l1.k kVar) {
            Iterator it = this.f33839c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.t();
                }
                Object obj = this.f33839c.get(i10);
                if (obj == null) {
                    kVar.s1(i11);
                } else if (obj instanceof Long) {
                    kVar.G0(i11, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.m0(i11, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.b0(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.P0(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private final Object d(Function1 function1) {
            return this.f33838b.g(new C0501b(function1));
        }

        private final void e(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            if (i11 >= this.f33839c.size() && (size = this.f33839c.size()) <= i11) {
                while (true) {
                    this.f33839c.add(null);
                    if (size == i11) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f33839c.set(i11, obj);
        }

        @Override // l1.i
        public void G0(int i10, long j10) {
            e(i10, Long.valueOf(j10));
        }

        @Override // l1.i
        public void P0(int i10, byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            e(i10, value);
        }

        @Override // l1.k
        public long W1() {
            return ((Number) d(a.f33840a)).longValue();
        }

        @Override // l1.i
        public void b0(int i10, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            e(i10, value);
        }

        @Override // l1.k
        public int j0() {
            return ((Number) d(c.f33843a)).intValue();
        }

        @Override // l1.i
        public void m0(int i10, double d10) {
            e(i10, Double.valueOf(d10));
        }

        @Override // l1.i
        public void s1(int i10) {
            e(i10, null);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
