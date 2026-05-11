package C6;

import D6.b;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;
import s6.C4317c;
import s6.EnumC4319e;
import u6.i;
import x6.C5111a;
import x6.C5112b;
import x6.C5113c;
import x6.C5114d;
import x6.C5115e;
import y6.AbstractC5177a;

/* loaded from: classes2.dex */
public class M implements InterfaceC0753d, D6.b, InterfaceC0752c {

    /* renamed from: f, reason: collision with root package name */
    private static final C4317c f946f = C4317c.b("proto");

    /* renamed from: a, reason: collision with root package name */
    private final U f947a;

    /* renamed from: b, reason: collision with root package name */
    private final E6.a f948b;

    /* renamed from: c, reason: collision with root package name */
    private final E6.a f949c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC0754e f950d;

    /* renamed from: e, reason: collision with root package name */
    private final Provider f951e;

    interface b {
        Object apply(Object obj);
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f952a;

        /* renamed from: b, reason: collision with root package name */
        final String f953b;

        private c(String str, String str2) {
            this.f952a = str;
            this.f953b = str2;
        }
    }

    interface d {
        Object a();
    }

    M(E6.a aVar, E6.a aVar2, AbstractC0754e abstractC0754e, U u10, Provider provider) {
        this.f947a = u10;
        this.f948b = aVar;
        this.f949c = aVar2;
        this.f950d = abstractC0754e;
        this.f951e = provider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase A1(Throwable th) {
        throw new D6.a("Timed out while trying to open db.", th);
    }

    private static C4317c A2(String str) {
        return str == null ? f946f : C4317c.b(str);
    }

    private static String B2(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((AbstractC0760k) it.next()).c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    static Object C2(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long M1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x6.f N1(long j10, Cursor cursor) {
        cursor.moveToNext();
        return x6.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x6.f O1(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (x6.f) C2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: C6.D
            @Override // C6.M.b
            public final Object apply(Object obj) {
                x6.f N12;
                N12 = M.N1(j10, (Cursor) obj);
                return N12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long U1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    private C5112b Z0() {
        return C5112b.b().b(C5115e.c().b(A0()).c(AbstractC0754e.f985a.f()).a()).a();
    }

    private long a1() {
        return O0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean e2(u6.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long l12 = l1(sQLiteDatabase, oVar);
        return l12 == null ? Boolean.FALSE : (Boolean) C2(O0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{l12.toString()}), new b() { // from class: C6.u
            @Override // C6.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List f2(SQLiteDatabase sQLiteDatabase) {
        return (List) C2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: C6.K
            @Override // C6.M.b
            public final Object apply(Object obj) {
                List g22;
                g22 = M.g2((Cursor) obj);
                return g22;
            }
        });
    }

    private long g1() {
        return O0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List g2(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(u6.o.a().b(cursor.getString(1)).d(F6.a.b(cursor.getInt(2))).c(w2(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List h2(u6.o oVar, SQLiteDatabase sQLiteDatabase) {
        List u22 = u2(sQLiteDatabase, oVar, this.f950d.d());
        for (EnumC4319e enumC4319e : EnumC4319e.values()) {
            if (enumC4319e != oVar.d()) {
                int d10 = this.f950d.d() - u22.size();
                if (d10 <= 0) {
                    break;
                }
                u22.addAll(u2(sQLiteDatabase, oVar.f(enumC4319e), d10));
            }
        }
        return t1(u22, v2(sQLiteDatabase, u22));
    }

    private x6.f i1() {
        final long a10 = this.f948b.a();
        return (x6.f) m1(new b() { // from class: C6.C
            @Override // C6.M.b
            public final Object apply(Object obj) {
                x6.f O12;
                O12 = M.O1(a10, (SQLiteDatabase) obj);
                return O12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C5111a i2(Map map, C5111a.C0653a c0653a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C5113c.b o02 = o0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C5113c.c().c(o02).b(j10).a());
        }
        x2(c0653a, map);
        c0653a.e(i1());
        c0653a.d(Z0());
        c0653a.c((String) this.f951e.get());
        return c0653a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C5111a j2(String str, final Map map, final C5111a.C0653a c0653a, SQLiteDatabase sQLiteDatabase) {
        return (C5111a) C2(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: C6.A
            @Override // C6.M.b
            public final Object apply(Object obj) {
                C5111a i22;
                i22 = M.this.i2(map, c0653a, (Cursor) obj);
                return i22;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object k2(List list, u6.o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            i.a k10 = u6.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                k10.h(new u6.h(A2(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k10.h(new u6.h(A2(cursor.getString(4)), y2(j10)));
            }
            if (!cursor.isNull(6)) {
                k10.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC0760k.a(j10, oVar, k10.d()));
        }
        return null;
    }

    private Long l1(SQLiteDatabase sQLiteDatabase, u6.o oVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(F6.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) C2(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: C6.n
            @Override // C6.M.b
            public final Object apply(Object obj) {
                Long U12;
                U12 = M.U1((Cursor) obj);
                return U12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object l2(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long m2(u6.i iVar, u6.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (o1()) {
            b(1L, C5113c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long z02 = z0(sQLiteDatabase, oVar);
        int e10 = this.f950d.e();
        byte[] a10 = iVar.e().a();
        boolean z10 = a10.length <= e10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(z02));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put(AppConstants.RETAKE_ERROR_CODE, iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? a10 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(a10.length / e10);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e10, Math.min(i10 * e10, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] n2(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    private C5113c.b o0(int i10) {
        C5113c.b bVar = C5113c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        C5113c.b bVar2 = C5113c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        C5113c.b bVar3 = C5113c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        C5113c.b bVar4 = C5113c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        C5113c.b bVar5 = C5113c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        C5113c.b bVar6 = C5113c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        C5113c.b bVar7 = C5113c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        AbstractC5177a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private boolean o1() {
        return a1() * g1() >= this.f950d.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o2(Cursor cursor) {
        while (cursor.moveToNext()) {
            b(cursor.getInt(0), C5113c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p2(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        C2(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: C6.v
            @Override // C6.M.b
            public final Object apply(Object obj) {
                Object o22;
                o22 = M.this.o2((Cursor) obj);
                return o22;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean q2(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r2(String str, C5113c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) C2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: C6.y
            @Override // C6.M.b
            public final Object apply(Object obj) {
                Boolean q22;
                q22 = M.q2((Cursor) obj);
                return q22;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object s2(long j10, u6.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(F6.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(F6.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private List t1(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC0760k abstractC0760k = (AbstractC0760k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC0760k.c()))) {
                i.a l10 = abstractC0760k.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC0760k.c()))) {
                    l10.c(cVar.f952a, cVar.f953b);
                }
                listIterator.set(AbstractC0760k.a(abstractC0760k.c(), abstractC0760k.d(), l10.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object t2(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f948b.a()).execute();
        return null;
    }

    private List u2(SQLiteDatabase sQLiteDatabase, final u6.o oVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long l12 = l1(sQLiteDatabase, oVar);
        if (l12 == null) {
            return arrayList;
        }
        C2(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", AppConstants.RETAKE_ERROR_CODE, "inline"}, "context_id = ?", new String[]{l12.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: C6.x
            @Override // C6.M.b
            public final Object apply(Object obj) {
                Object k22;
                k22 = M.this.k2(arrayList, oVar, (Cursor) obj);
                return k22;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object v1(Cursor cursor) {
        while (cursor.moveToNext()) {
            b(cursor.getInt(0), C5113c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    private Map v2(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((AbstractC0760k) list.get(i10)).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        C2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: C6.z
            @Override // C6.M.b
            public final Object apply(Object obj) {
                Object l22;
                l22 = M.l2(hashMap, (Cursor) obj);
                return l22;
            }
        });
        return hashMap;
    }

    private static byte[] w2(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer x1(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        C2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: C6.s
            @Override // C6.M.b
            public final Object apply(Object obj) {
                Object v12;
                v12 = M.this.v1((Cursor) obj);
                return v12;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    private void x2(C5111a.C0653a c0653a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0653a.a(C5114d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    private void y0(final SQLiteDatabase sQLiteDatabase) {
        z2(new d() { // from class: C6.l
            @Override // C6.M.d
            public final Object a() {
                Object y12;
                y12 = M.y1(sQLiteDatabase);
                return y12;
            }
        }, new b() { // from class: C6.w
            @Override // C6.M.b
            public final Object apply(Object obj) {
                Object z12;
                z12 = M.z1((Throwable) obj);
                return z12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object y1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    private byte[] y2(long j10) {
        return (byte[]) C2(O0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: C6.B
            @Override // C6.M.b
            public final Object apply(Object obj) {
                byte[] n22;
                n22 = M.n2((Cursor) obj);
                return n22;
            }
        });
    }

    private long z0(SQLiteDatabase sQLiteDatabase, u6.o oVar) {
        Long l12 = l1(sQLiteDatabase, oVar);
        if (l12 != null) {
            return l12.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(F6.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object z1(Throwable th) {
        throw new D6.a("Timed out while trying to acquire the lock.", th);
    }

    private Object z2(d dVar, b bVar) {
        long a10 = this.f949c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f949c.a() >= this.f950d.b() + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    long A0() {
        return a1() * g1();
    }

    @Override // C6.InterfaceC0753d
    public long H1(u6.o oVar) {
        return ((Long) C2(O0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(F6.a.a(oVar.d()))}), new b() { // from class: C6.H
            @Override // C6.M.b
            public final Object apply(Object obj) {
                Long M12;
                M12 = M.M1((Cursor) obj);
                return M12;
            }
        })).longValue();
    }

    SQLiteDatabase O0() {
        final U u10 = this.f947a;
        Objects.requireNonNull(u10);
        return (SQLiteDatabase) z2(new d() { // from class: C6.E
            @Override // C6.M.d
            public final Object a() {
                return U.this.getWritableDatabase();
            }
        }, new b() { // from class: C6.F
            @Override // C6.M.b
            public final Object apply(Object obj) {
                SQLiteDatabase A12;
                A12 = M.A1((Throwable) obj);
                return A12;
            }
        });
    }

    @Override // C6.InterfaceC0753d
    public void R1(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + B2(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            m1(new b() { // from class: C6.L
                @Override // C6.M.b
                public final Object apply(Object obj) {
                    Object p22;
                    p22 = M.this.p2(str, str2, (SQLiteDatabase) obj);
                    return p22;
                }
            });
        }
    }

    @Override // C6.InterfaceC0753d
    public boolean T1(final u6.o oVar) {
        return ((Boolean) m1(new b() { // from class: C6.o
            @Override // C6.M.b
            public final Object apply(Object obj) {
                Boolean e22;
                e22 = M.this.e2(oVar, (SQLiteDatabase) obj);
                return e22;
            }
        })).booleanValue();
    }

    @Override // C6.InterfaceC0753d
    public void V(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            O0().compileStatement("DELETE FROM events WHERE _id in " + B2(iterable)).execute();
        }
    }

    @Override // D6.b
    public Object a(b.a aVar) {
        SQLiteDatabase O02 = O0();
        y0(O02);
        try {
            Object j10 = aVar.j();
            O02.setTransactionSuccessful();
            return j10;
        } finally {
            O02.endTransaction();
        }
    }

    @Override // C6.InterfaceC0753d
    public Iterable a0(final u6.o oVar) {
        return (Iterable) m1(new b() { // from class: C6.m
            @Override // C6.M.b
            public final Object apply(Object obj) {
                List h22;
                h22 = M.this.h2(oVar, (SQLiteDatabase) obj);
                return h22;
            }
        });
    }

    @Override // C6.InterfaceC0752c
    public void b(final long j10, final C5113c.b bVar, final String str) {
        m1(new b() { // from class: C6.r
            @Override // C6.M.b
            public final Object apply(Object obj) {
                Object r22;
                r22 = M.r2(str, bVar, j10, (SQLiteDatabase) obj);
                return r22;
            }
        });
    }

    @Override // C6.InterfaceC0752c
    public void c() {
        m1(new b() { // from class: C6.q
            @Override // C6.M.b
            public final Object apply(Object obj) {
                Object t22;
                t22 = M.this.t2((SQLiteDatabase) obj);
                return t22;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f947a.close();
    }

    @Override // C6.InterfaceC0752c
    public C5111a d() {
        final C5111a.C0653a e10 = C5111a.e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C5111a) m1(new b() { // from class: C6.t
            @Override // C6.M.b
            public final Object apply(Object obj) {
                C5111a j22;
                j22 = M.this.j2(str, hashMap, e10, (SQLiteDatabase) obj);
                return j22;
            }
        });
    }

    @Override // C6.InterfaceC0753d
    public void f1(final u6.o oVar, final long j10) {
        m1(new b() { // from class: C6.p
            @Override // C6.M.b
            public final Object apply(Object obj) {
                Object s22;
                s22 = M.s2(j10, oVar, (SQLiteDatabase) obj);
                return s22;
            }
        });
    }

    Object m1(b bVar) {
        SQLiteDatabase O02 = O0();
        O02.beginTransaction();
        try {
            Object apply = bVar.apply(O02);
            O02.setTransactionSuccessful();
            return apply;
        } finally {
            O02.endTransaction();
        }
    }

    @Override // C6.InterfaceC0753d
    public AbstractC0760k q1(final u6.o oVar, final u6.i iVar) {
        AbstractC5177a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long longValue = ((Long) m1(new b() { // from class: C6.I
            @Override // C6.M.b
            public final Object apply(Object obj) {
                Long m22;
                m22 = M.this.m2(iVar, oVar, (SQLiteDatabase) obj);
                return m22;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC0760k.a(longValue, oVar, iVar);
    }

    @Override // C6.InterfaceC0753d
    public Iterable u0() {
        return (Iterable) m1(new b() { // from class: C6.G
            @Override // C6.M.b
            public final Object apply(Object obj) {
                List f22;
                f22 = M.f2((SQLiteDatabase) obj);
                return f22;
            }
        });
    }

    @Override // C6.InterfaceC0753d
    public int w() {
        final long a10 = this.f948b.a() - this.f950d.c();
        return ((Integer) m1(new b() { // from class: C6.J
            @Override // C6.M.b
            public final Object apply(Object obj) {
                Integer x12;
                x12 = M.this.x1(a10, (SQLiteDatabase) obj);
                return x12;
            }
        })).intValue();
    }
}
