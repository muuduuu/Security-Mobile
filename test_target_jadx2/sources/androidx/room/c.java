package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.AbstractC1604v;
import h1.C3225c;
import h1.m;
import h1.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.collections.O;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l1.C3598a;
import l1.g;
import l1.k;
import n.C3701b;

/* loaded from: classes.dex */
public class c {

    /* renamed from: q, reason: collision with root package name */
    public static final a f17770q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    private static final String[] f17771r = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    private final s f17772a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f17773b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f17774c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f17775d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f17776e;

    /* renamed from: f, reason: collision with root package name */
    private C3225c f17777f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f17778g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f17779h;

    /* renamed from: i, reason: collision with root package name */
    private volatile k f17780i;

    /* renamed from: j, reason: collision with root package name */
    private final b f17781j;

    /* renamed from: k, reason: collision with root package name */
    private final m f17782k;

    /* renamed from: l, reason: collision with root package name */
    private final C3701b f17783l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.room.d f17784m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f17785n;

    /* renamed from: o, reason: collision with root package name */
    private final Object f17786o;

    /* renamed from: p, reason: collision with root package name */
    public final Runnable f17787p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(g database) {
            Intrinsics.checkNotNullParameter(database, "database");
            if (database.K1()) {
                database.K0();
            } else {
                database.P();
            }
        }

        public final String b(String tableName, String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        public static final a f17788e = new a(null);

        /* renamed from: a, reason: collision with root package name */
        private final long[] f17789a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f17790b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f17791c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f17792d;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(int i10) {
            this.f17789a = new long[i10];
            this.f17790b = new boolean[i10];
            this.f17791c = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f17792d) {
                        return null;
                    }
                    long[] jArr = this.f17789a;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z10 = jArr[i10] > 0;
                        boolean[] zArr = this.f17790b;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.f17791c;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.f17791c[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.f17792d = false;
                    return (int[]) this.f17791c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean b(int... tableIds) {
            boolean z10;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.f17789a;
                        long j10 = jArr[i10];
                        jArr[i10] = 1 + j10;
                        if (j10 == 0) {
                            this.f17792d = true;
                            z10 = true;
                        }
                    }
                    Unit unit = Unit.f36324a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z10;
        }

        public final boolean c(int... tableIds) {
            boolean z10;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.f17789a;
                        long j10 = jArr[i10];
                        jArr[i10] = j10 - 1;
                        if (j10 == 1) {
                            this.f17792d = true;
                            z10 = true;
                        }
                    }
                    Unit unit = Unit.f36324a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z10;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f17790b, false);
                this.f17792d = true;
                Unit unit = Unit.f36324a;
            }
        }
    }

    /* renamed from: androidx.room.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0305c {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f17793a;

        public AbstractC0305c(String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.f17793a = tables;
        }

        public final String[] a() {
            return this.f17793a;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(Set set);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC0305c f17794a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f17795b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f17796c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f17797d;

        public d(AbstractC0305c observer, int[] tableIds, String[] tableNames) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.f17794a = observer;
            this.f17795b = tableIds;
            this.f17796c = tableNames;
            this.f17797d = !(tableNames.length == 0) ? O.c(tableNames[0]) : O.d();
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.f17795b;
        }

        public final void b(Set invalidatedTablesIds) {
            Set d10;
            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f17795b;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    Set b10 = O.b();
                    int[] iArr2 = this.f17795b;
                    int length2 = iArr2.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                            b10.add(this.f17796c[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    d10 = O.a(b10);
                } else {
                    d10 = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f17797d : O.d();
                }
            } else {
                d10 = O.d();
            }
            if (d10.isEmpty()) {
                return;
            }
            this.f17794a.c(d10);
        }

        public final void c(String[] tables) {
            Set d10;
            Intrinsics.checkNotNullParameter(tables, "tables");
            int length = this.f17796c.length;
            if (length == 0) {
                d10 = O.d();
            } else if (length == 1) {
                int length2 = tables.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        d10 = O.d();
                        break;
                    } else {
                        if (StringsKt.r(tables[i10], this.f17796c[0], true)) {
                            d10 = this.f17797d;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                Set b10 = O.b();
                for (String str : tables) {
                    for (String str2 : this.f17796c) {
                        if (StringsKt.r(str2, str, true)) {
                            b10.add(str2);
                        }
                    }
                }
                d10 = O.a(b10);
            }
            if (d10.isEmpty()) {
                return;
            }
            this.f17794a.c(d10);
        }
    }

    public static final class e extends AbstractC0305c {

        /* renamed from: b, reason: collision with root package name */
        private final c f17798b;

        /* renamed from: c, reason: collision with root package name */
        private final WeakReference f17799c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c tracker, AbstractC0305c delegate) {
            super(delegate.a());
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f17798b = tracker;
            this.f17799c = new WeakReference(delegate);
        }

        @Override // androidx.room.c.AbstractC0305c
        public void c(Set tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            AbstractC0305c abstractC0305c = (AbstractC0305c) this.f17799c.get();
            if (abstractC0305c == null) {
                this.f17798b.p(this);
            } else {
                abstractC0305c.c(tables);
            }
        }
    }

    public static final class f implements Runnable {
        f() {
        }

        private final Set a() {
            c cVar = c.this;
            Set b10 = O.b();
            Cursor A10 = s.A(cVar.h(), new C3598a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            try {
                Cursor cursor = A10;
                while (cursor.moveToNext()) {
                    b10.add(Integer.valueOf(cursor.getInt(0)));
                }
                Unit unit = Unit.f36324a;
                kotlin.io.c.a(A10, null);
                Set a10 = O.a(b10);
                if (!a10.isEmpty()) {
                    if (c.this.g() == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    k g10 = c.this.g();
                    if (g10 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    g10.j0();
                }
                return a10;
            } finally {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        
            if (r0 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        
            r0.e();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
        
            if (r2.isEmpty() != false) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
        
            r0 = r4.f17800a.i();
            r1 = r4.f17800a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
        
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
        
            r1 = r1.i().iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
        
            if (r1.hasNext() == false) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
        
            ((androidx.room.c.d) ((java.util.Map.Entry) r1.next()).getValue()).b(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
        
            r1 = kotlin.Unit.f36324a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
        
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f5, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00a6, code lost:
        
            if (r0 == null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00bd, code lost:
        
            if (r0 == null) goto L44;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            Set d10;
            C3225c c3225c;
            C3225c c3225c2;
            Lock l10 = c.this.h().l();
            l10.lock();
            try {
                try {
                    if (!c.this.f()) {
                        if (c3225c2 != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (!c.this.j().compareAndSet(true, false)) {
                        l10.unlock();
                        C3225c c3225c3 = c.this.f17777f;
                        if (c3225c3 != null) {
                            c3225c3.e();
                            return;
                        }
                        return;
                    }
                    if (c.this.h().s()) {
                        l10.unlock();
                        C3225c c3225c4 = c.this.f17777f;
                        if (c3225c4 != null) {
                            c3225c4.e();
                            return;
                        }
                        return;
                    }
                    g U02 = c.this.h().n().U0();
                    U02.K0();
                    try {
                        d10 = a();
                        U02.I0();
                        l10.unlock();
                        c3225c = c.this.f17777f;
                    } finally {
                        U02.b1();
                    }
                } finally {
                    l10.unlock();
                    c3225c2 = c.this.f17777f;
                    if (c3225c2 != null) {
                        c3225c2.e();
                    }
                }
            } catch (SQLiteException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                d10 = O.d();
                l10.unlock();
                c3225c = c.this.f17777f;
            } catch (IllegalStateException e11) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                d10 = O.d();
                l10.unlock();
                c3225c = c.this.f17777f;
            }
        }
    }

    public c(s database, Map shadowTablesMap, Map viewTables, String... tableNames) {
        String str;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f17772a = database;
        this.f17773b = shadowTablesMap;
        this.f17774c = viewTables;
        this.f17778g = new AtomicBoolean(false);
        this.f17781j = new b(tableNames.length);
        this.f17782k = new m(database);
        this.f17783l = new C3701b();
        this.f17785n = new Object();
        this.f17786o = new Object();
        this.f17775d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = tableNames[i10];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f17775d.put(lowerCase, Integer.valueOf(i10));
            String str3 = (String) this.f17773b.get(tableNames[i10]);
            if (str3 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = str3.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i10] = lowerCase;
        }
        this.f17776e = strArr;
        for (Map.Entry entry : this.f17773b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase2 = str4.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f17775d.containsKey(lowerCase2)) {
                String str5 = (String) entry.getKey();
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase3 = str5.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map map = this.f17775d;
                map.put(lowerCase3, G.i(map, lowerCase2));
            }
        }
        this.f17787p = new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        synchronized (this.f17786o) {
            this.f17779h = false;
            this.f17781j.d();
            k kVar = this.f17780i;
            if (kVar != null) {
                kVar.close();
                Unit unit = Unit.f36324a;
            }
        }
    }

    private final String[] q(String[] strArr) {
        Set b10 = O.b();
        for (String str : strArr) {
            Map map = this.f17774c;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f17774c;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                Intrinsics.d(obj);
                b10.addAll((Collection) obj);
            } else {
                b10.add(str);
            }
        }
        return (String[]) O.a(b10).toArray(new String[0]);
    }

    private final void t(g gVar, int i10) {
        gVar.Z("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f17776e[i10];
        for (String str2 : f17771r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f17770q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.Z(str3);
        }
    }

    private final void u(g gVar, int i10) {
        String str = this.f17776e[i10];
        for (String str2 : f17771r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f17770q.b(str, str2);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.Z(str3);
        }
    }

    private final String[] x(String[] strArr) {
        String[] q10 = q(strArr);
        for (String str : q10) {
            Map map = this.f17775d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return q10;
    }

    public void c(AbstractC0305c observer) {
        d dVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] q10 = q(observer.a());
        ArrayList arrayList = new ArrayList(q10.length);
        for (String str : q10) {
            Map map = this.f17775d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] N02 = CollectionsKt.N0(arrayList);
        d dVar2 = new d(observer, N02, q10);
        synchronized (this.f17783l) {
            dVar = (d) this.f17783l.r(observer, dVar2);
        }
        if (dVar == null && this.f17781j.b(Arrays.copyOf(N02, N02.length))) {
            v();
        }
    }

    public void d(AbstractC0305c observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        c(new e(this, observer));
    }

    public AbstractC1604v e(String[] tableNames, boolean z10, Callable computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return this.f17782k.a(x(tableNames), z10, computeFunction);
    }

    public final boolean f() {
        if (!this.f17772a.y()) {
            return false;
        }
        if (!this.f17779h) {
            this.f17772a.n().U0();
        }
        if (this.f17779h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final k g() {
        return this.f17780i;
    }

    public final s h() {
        return this.f17772a;
    }

    public final C3701b i() {
        return this.f17783l;
    }

    public final AtomicBoolean j() {
        return this.f17778g;
    }

    public final Map k() {
        return this.f17775d;
    }

    public final void l(g database) {
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.f17786o) {
            if (this.f17779h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.Z("PRAGMA temp_store = MEMORY;");
            database.Z("PRAGMA recursive_triggers='ON';");
            database.Z("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            w(database);
            this.f17780i = database.k0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f17779h = true;
            Unit unit = Unit.f36324a;
        }
    }

    public final void m(String... tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        synchronized (this.f17783l) {
            try {
                for (Map.Entry entry : this.f17783l) {
                    Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                    AbstractC0305c abstractC0305c = (AbstractC0305c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!abstractC0305c.b()) {
                        dVar.c(tables);
                    }
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o() {
        if (this.f17778g.compareAndSet(false, true)) {
            C3225c c3225c = this.f17777f;
            if (c3225c != null) {
                c3225c.j();
            }
            this.f17772a.o().execute(this.f17787p);
        }
    }

    public void p(AbstractC0305c observer) {
        d dVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f17783l) {
            dVar = (d) this.f17783l.t(observer);
        }
        if (dVar != null) {
            b bVar = this.f17781j;
            int[] a10 = dVar.a();
            if (bVar.c(Arrays.copyOf(a10, a10.length))) {
                v();
            }
        }
    }

    public final void r(C3225c autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f17777f = autoCloser;
        autoCloser.l(new Runnable() { // from class: h1.n
            @Override // java.lang.Runnable
            public final void run() {
                androidx.room.c.this.n();
            }
        });
    }

    public final void s(Context context, String name, Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.f17784m = new androidx.room.d(context, name, serviceIntent, this, this.f17772a.o());
    }

    public final void v() {
        if (this.f17772a.y()) {
            w(this.f17772a.n().U0());
        }
    }

    public final void w(g database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.D1()) {
            return;
        }
        try {
            Lock l10 = this.f17772a.l();
            l10.lock();
            try {
                synchronized (this.f17785n) {
                    int[] a10 = this.f17781j.a();
                    if (a10 == null) {
                        return;
                    }
                    f17770q.a(database);
                    try {
                        int length = a10.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            int i12 = a10[i10];
                            int i13 = i11 + 1;
                            if (i12 == 1) {
                                t(database, i11);
                            } else if (i12 == 2) {
                                u(database, i11);
                            }
                            i10++;
                            i11 = i13;
                        }
                        database.I0();
                        database.b1();
                        Unit unit = Unit.f36324a;
                    } catch (Throwable th) {
                        database.b1();
                        throw th;
                    }
                }
            } finally {
                l10.unlock();
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}
