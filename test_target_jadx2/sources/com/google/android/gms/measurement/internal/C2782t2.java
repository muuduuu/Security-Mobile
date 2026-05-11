package com.google.android.gms.measurement.internal;

import W6.b;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2782t2 extends AbstractC2687h2 {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f26351e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* renamed from: c, reason: collision with root package name */
    private final C2766r2 f26352c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26353d;

    C2782t2(C2760q3 c2760q3) {
        super(c2760q3);
        Context e10 = this.f25694a.e();
        this.f25694a.w();
        this.f26352c = new C2766r2(this, e10, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean z(int i10, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        h();
        boolean z10 = false;
        z10 = false;
        if (!this.f26353d) {
            C2760q3 c2760q3 = this.f25694a;
            C2724m w10 = c2760q3.w();
            C2663e2 c2663e2 = AbstractC2671f2.f25995c1;
            Cursor cursor2 = null;
            n7 o10 = w10.H(null, c2663e2) ? this.f25694a.L().o(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i10));
            contentValues.put("entry", bArr);
            if (c2760q3.w().H(null, c2663e2) && o10 != null) {
                contentValues.put("app_version", o10.f26199c);
                contentValues.put("app_version_int", Long.valueOf(o10.f26206j));
            }
            c2760q3.w();
            int i11 = 0;
            int i12 = 5;
            for (int i13 = 5; i11 < i13; i13 = 5) {
                try {
                    sQLiteDatabase = w();
                    if (sQLiteDatabase == null) {
                        this.f26353d = true;
                    } else {
                        try {
                            sQLiteDatabase.beginTransaction();
                            cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                            long j10 = 0;
                            if (cursor != null) {
                                try {
                                    if (cursor.moveToFirst()) {
                                        j10 = cursor.getLong(z10 ? 1 : 0);
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    SystemClock.sleep(i12);
                                    i12 += 20;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i11++;
                                        z10 = false;
                                    }
                                    sQLiteDatabase.close();
                                    i11++;
                                    z10 = false;
                                } catch (SQLiteFullException e10) {
                                    e = e10;
                                    this.f25694a.a().o().b("Error writing entry; local database full", e);
                                    this.f26353d = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i11++;
                                        z10 = false;
                                    }
                                    sQLiteDatabase.close();
                                    i11++;
                                    z10 = false;
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    if (sQLiteDatabase != null) {
                                        try {
                                            if (sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            cursor2 = cursor;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    this.f25694a.a().o().b("Error writing entry to local database", e);
                                    this.f26353d = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i11++;
                                        z10 = false;
                                    }
                                    sQLiteDatabase.close();
                                    i11++;
                                    z10 = false;
                                }
                            }
                            if (j10 >= 100000) {
                                c2760q3.a().o().a("Data loss, local db full");
                                long j11 = 100001 - j10;
                                long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j11)});
                                if (delete != j11) {
                                    c2760q3.a().o().d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j11), Long.valueOf(delete), Long.valueOf(j11 - delete));
                                }
                            }
                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            if (cursor != null) {
                                cursor.close();
                            }
                            sQLiteDatabase.close();
                            return true;
                        } catch (SQLiteDatabaseLockedException unused2) {
                            cursor = null;
                        } catch (SQLiteFullException e12) {
                            e = e12;
                            cursor = null;
                        } catch (SQLiteException e13) {
                            e = e13;
                            cursor = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused3) {
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteFullException e14) {
                    e = e14;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteException e15) {
                    e = e15;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase = null;
                }
            }
            this.f25694a.a().w().a("Failed to write entry to local database");
            return false;
        }
        return z10;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2687h2
    protected final boolean m() {
        return false;
    }

    public final void o() {
        int delete;
        h();
        try {
            SQLiteDatabase w10 = w();
            if (w10 == null || (delete = w10.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f25694a.a().w().b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e10) {
            this.f25694a.a().o().b("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean p(I i10) {
        Parcel obtain = Parcel.obtain();
        J.a(i10, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return z(0, marshall);
        }
        this.f25694a.a().p().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean q(h7 h7Var) {
        Parcel obtain = Parcel.obtain();
        i7.a(h7Var, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return z(1, marshall);
        }
        this.f25694a.a().p().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean r(C2692i c2692i) {
        C2760q3 c2760q3 = this.f25694a;
        byte[] T10 = c2760q3.C().T(c2692i);
        if (T10.length <= 131072) {
            return z(2, T10);
        }
        c2760q3.a().p().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean s(G g10) {
        C2760q3 c2760q3 = this.f25694a;
        byte[] T10 = c2760q3.C().T(g10);
        if (T10 == null) {
            c2760q3.a().p().a("Null default event parameters; not writing to database");
            return false;
        }
        if (T10.length <= 131072) {
            return z(4, T10);
        }
        c2760q3.a().p().a("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x035a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x035a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List t(int i10) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor2;
        SQLiteDatabase sQLiteDatabase2;
        int i11;
        Cursor cursor3;
        SQLiteDatabase sQLiteDatabase3;
        Cursor cursor4;
        Cursor cursor5;
        long j10;
        String str;
        String[] strArr;
        Cursor cursor6;
        long j11;
        String str2;
        Parcel obtain;
        G g10;
        C2692i c2692i;
        h7 h7Var;
        h();
        ?? r62 = 0;
        if (this.f26353d) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!x()) {
            return arrayList;
        }
        int i12 = 5;
        int i13 = 0;
        int i14 = 5;
        int i15 = 0;
        while (i15 < i12) {
            int i16 = 1;
            try {
                SQLiteDatabase w10 = w();
                if (w10 == null) {
                    this.f26353d = true;
                    return r62;
                }
                try {
                    w10.beginTransaction();
                    try {
                        try {
                            cursor5 = w10.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                            try {
                                long j12 = -1;
                                if (cursor5.moveToFirst()) {
                                    j10 = cursor5.getLong(i13);
                                    try {
                                        cursor5.close();
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        sQLiteDatabase = w10;
                                        i11 = i15;
                                        sQLiteDatabase3 = sQLiteDatabase;
                                        cursor3 = null;
                                        SystemClock.sleep(i14);
                                        i14 += 20;
                                        if (cursor3 != null) {
                                        }
                                        if (sQLiteDatabase3 == null) {
                                        }
                                        i15 = i11 + 1;
                                        r62 = 0;
                                        i12 = 5;
                                        i13 = 0;
                                    } catch (SQLiteFullException e10) {
                                        e = e10;
                                        sQLiteDatabase = w10;
                                        i11 = i15;
                                        cursor4 = null;
                                        try {
                                            this.f25694a.a().o().b("Error reading entries from local database", e);
                                            this.f26353d = true;
                                            if (cursor4 != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            i15 = i11 + 1;
                                            r62 = 0;
                                            i12 = 5;
                                            i13 = 0;
                                        } catch (Throwable th) {
                                            th = th;
                                            cursor = cursor4;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        sQLiteDatabase = w10;
                                        sQLiteDatabase2 = sQLiteDatabase;
                                        cursor2 = null;
                                        if (sQLiteDatabase2 != null) {
                                        }
                                        this.f25694a.a().o().b("Error reading entries from local database", e);
                                        this.f26353d = true;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase2 != null) {
                                        }
                                        i11 = i15;
                                        i15 = i11 + 1;
                                        r62 = 0;
                                        i12 = 5;
                                        i13 = 0;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteDatabase = w10;
                                        cursor = null;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    cursor5.close();
                                    j10 = -1;
                                }
                                if (j10 != -1) {
                                    String[] strArr2 = new String[1];
                                    strArr2[i13] = String.valueOf(j10);
                                    str = "rowid<?";
                                    strArr = strArr2;
                                } else {
                                    str = r62;
                                    strArr = str;
                                }
                                String[] strArr3 = {"rowid", "type", "entry"};
                                C2760q3 c2760q3 = this.f25694a;
                                C2724m w11 = c2760q3.w();
                                C2663e2 c2663e2 = AbstractC2671f2.f25995c1;
                                boolean H10 = w11.H(r62, c2663e2);
                                int i17 = 2;
                                if (H10) {
                                    strArr3 = new String[i12];
                                    strArr3[i13] = "rowid";
                                    strArr3[1] = "type";
                                    strArr3[2] = "entry";
                                    strArr3[3] = "app_version";
                                    strArr3[4] = "app_version_int";
                                }
                                Cursor query = w10.query("messages", strArr3, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                while (query.moveToNext()) {
                                    try {
                                        try {
                                            j12 = query.getLong(i13);
                                            int i18 = query.getInt(i16);
                                            byte[] blob = query.getBlob(i17);
                                            if (c2760q3.w().H(null, c2663e2)) {
                                                String string = query.getString(3);
                                                j11 = query.getLong(4);
                                                str2 = string;
                                            } else {
                                                j11 = 0;
                                                str2 = null;
                                            }
                                            long j13 = j11;
                                            cursor6 = query;
                                            if (i18 == 0) {
                                                try {
                                                    obtain = Parcel.obtain();
                                                    try {
                                                        try {
                                                            obtain.unmarshall(blob, i13, blob.length);
                                                            obtain.setDataPosition(i13);
                                                            I createFromParcel = I.CREATOR.createFromParcel(obtain);
                                                            if (createFromParcel != null) {
                                                                arrayList.add(new C2774s2(createFromParcel, str2, j13));
                                                            }
                                                        } catch (b.a unused2) {
                                                            this.f25694a.a().o().a("Failed to load event from local database");
                                                            obtain.recycle();
                                                        }
                                                    } finally {
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused3) {
                                                    sQLiteDatabase = w10;
                                                    i11 = i15;
                                                    sQLiteDatabase3 = sQLiteDatabase;
                                                    cursor3 = cursor6;
                                                    SystemClock.sleep(i14);
                                                    i14 += 20;
                                                    if (cursor3 != null) {
                                                    }
                                                    if (sQLiteDatabase3 == null) {
                                                    }
                                                    i15 = i11 + 1;
                                                    r62 = 0;
                                                    i12 = 5;
                                                    i13 = 0;
                                                } catch (SQLiteFullException e12) {
                                                    e = e12;
                                                    sQLiteDatabase = w10;
                                                    i11 = i15;
                                                    cursor4 = cursor6;
                                                    this.f25694a.a().o().b("Error reading entries from local database", e);
                                                    this.f26353d = true;
                                                    if (cursor4 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    i15 = i11 + 1;
                                                    r62 = 0;
                                                    i12 = 5;
                                                    i13 = 0;
                                                } catch (SQLiteException e13) {
                                                    e = e13;
                                                    sQLiteDatabase = w10;
                                                    sQLiteDatabase2 = sQLiteDatabase;
                                                    cursor2 = cursor6;
                                                    if (sQLiteDatabase2 != null) {
                                                    }
                                                    this.f25694a.a().o().b("Error reading entries from local database", e);
                                                    this.f26353d = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase2 != null) {
                                                    }
                                                    i11 = i15;
                                                    i15 = i11 + 1;
                                                    r62 = 0;
                                                    i12 = 5;
                                                    i13 = 0;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    sQLiteDatabase = w10;
                                                    cursor = cursor6;
                                                    if (cursor != null) {
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    throw th;
                                                }
                                            } else if (i18 == 1) {
                                                obtain = Parcel.obtain();
                                                try {
                                                    try {
                                                        obtain.unmarshall(blob, i13, blob.length);
                                                        obtain.setDataPosition(i13);
                                                        h7Var = h7.CREATOR.createFromParcel(obtain);
                                                    } finally {
                                                    }
                                                } catch (b.a unused4) {
                                                    this.f25694a.a().o().a("Failed to load user property from local database");
                                                    obtain.recycle();
                                                    h7Var = null;
                                                }
                                                if (h7Var != null) {
                                                    arrayList.add(new C2774s2(h7Var, str2, j13));
                                                }
                                            } else if (i18 == 2) {
                                                obtain = Parcel.obtain();
                                                try {
                                                    try {
                                                        obtain.unmarshall(blob, i13, blob.length);
                                                        obtain.setDataPosition(i13);
                                                        c2692i = C2692i.CREATOR.createFromParcel(obtain);
                                                    } finally {
                                                    }
                                                } catch (b.a unused5) {
                                                    this.f25694a.a().o().a("Failed to load conditional user property from local database");
                                                    obtain.recycle();
                                                    c2692i = null;
                                                }
                                                if (c2692i != null) {
                                                    arrayList.add(new C2774s2(c2692i, str2, j13));
                                                }
                                            } else if (i18 == 4) {
                                                obtain = Parcel.obtain();
                                                try {
                                                    try {
                                                        obtain.unmarshall(blob, i13, blob.length);
                                                        obtain.setDataPosition(i13);
                                                        g10 = G.CREATOR.createFromParcel(obtain);
                                                    } finally {
                                                    }
                                                } catch (b.a unused6) {
                                                    this.f25694a.a().o().a("Failed to load default event parameters from local database");
                                                    obtain.recycle();
                                                    g10 = null;
                                                }
                                                if (g10 != null) {
                                                    arrayList.add(new C2774s2(g10, str2, j13));
                                                }
                                            } else {
                                                if (i18 == 3) {
                                                    this.f25694a.a().w().a("Skipping app launch break");
                                                } else {
                                                    this.f25694a.a().o().a("Unknown record type in local database");
                                                }
                                                query = cursor6;
                                                i17 = 2;
                                                i16 = 1;
                                            }
                                            query = cursor6;
                                            i17 = 2;
                                            i16 = 1;
                                        } catch (SQLiteDatabaseLockedException unused7) {
                                            cursor6 = query;
                                        } catch (SQLiteFullException e14) {
                                            e = e14;
                                            cursor6 = query;
                                        } catch (SQLiteException e15) {
                                            e = e15;
                                            cursor6 = query;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            cursor6 = query;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused8) {
                                        sQLiteDatabase = w10;
                                        cursor6 = query;
                                    } catch (SQLiteFullException e16) {
                                        e = e16;
                                        sQLiteDatabase = w10;
                                        cursor6 = query;
                                    } catch (SQLiteException e17) {
                                        e = e17;
                                        sQLiteDatabase = w10;
                                        cursor6 = query;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        sQLiteDatabase = w10;
                                        cursor6 = query;
                                    }
                                }
                                cursor6 = query;
                                sQLiteDatabase = w10;
                                try {
                                    if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j12)}) < arrayList.size()) {
                                        this.f25694a.a().o().a("Fewer entries removed from local database than expected");
                                    }
                                    sQLiteDatabase.setTransactionSuccessful();
                                    sQLiteDatabase.endTransaction();
                                    cursor6.close();
                                    sQLiteDatabase.close();
                                    return arrayList;
                                } catch (SQLiteDatabaseLockedException unused9) {
                                    i11 = i15;
                                    sQLiteDatabase3 = sQLiteDatabase;
                                    cursor3 = cursor6;
                                    SystemClock.sleep(i14);
                                    i14 += 20;
                                    if (cursor3 != null) {
                                    }
                                    if (sQLiteDatabase3 == null) {
                                    }
                                    i15 = i11 + 1;
                                    r62 = 0;
                                    i12 = 5;
                                    i13 = 0;
                                } catch (SQLiteFullException e18) {
                                    e = e18;
                                    i11 = i15;
                                    cursor4 = cursor6;
                                    this.f25694a.a().o().b("Error reading entries from local database", e);
                                    this.f26353d = true;
                                    if (cursor4 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    i15 = i11 + 1;
                                    r62 = 0;
                                    i12 = 5;
                                    i13 = 0;
                                } catch (SQLiteException e19) {
                                    e = e19;
                                    sQLiteDatabase2 = sQLiteDatabase;
                                    cursor2 = cursor6;
                                    if (sQLiteDatabase2 != null) {
                                    }
                                    this.f25694a.a().o().b("Error reading entries from local database", e);
                                    this.f26353d = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase2 != null) {
                                    }
                                    i11 = i15;
                                    i15 = i11 + 1;
                                    r62 = 0;
                                    i12 = 5;
                                    i13 = 0;
                                } catch (Throwable th6) {
                                    th = th6;
                                    cursor = cursor6;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                sQLiteDatabase = w10;
                                if (cursor5 != null) {
                                    try {
                                        cursor5.close();
                                    } catch (SQLiteDatabaseLockedException unused10) {
                                        i11 = i15;
                                        sQLiteDatabase3 = sQLiteDatabase;
                                        cursor3 = null;
                                        SystemClock.sleep(i14);
                                        i14 += 20;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                        if (sQLiteDatabase3 == null) {
                                            sQLiteDatabase3.close();
                                        }
                                        i15 = i11 + 1;
                                        r62 = 0;
                                        i12 = 5;
                                        i13 = 0;
                                    } catch (SQLiteFullException e20) {
                                        e = e20;
                                        i11 = i15;
                                        cursor4 = null;
                                        this.f25694a.a().o().b("Error reading entries from local database", e);
                                        this.f26353d = true;
                                        if (cursor4 != null) {
                                            cursor4.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            sQLiteDatabase.close();
                                        }
                                        i15 = i11 + 1;
                                        r62 = 0;
                                        i12 = 5;
                                        i13 = 0;
                                    } catch (SQLiteException e21) {
                                        e = e21;
                                        sQLiteDatabase2 = sQLiteDatabase;
                                        cursor2 = null;
                                        if (sQLiteDatabase2 != null) {
                                            try {
                                                if (sQLiteDatabase2.inTransaction()) {
                                                    sQLiteDatabase2.endTransaction();
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                cursor = cursor2;
                                                sQLiteDatabase = sQLiteDatabase2;
                                                if (cursor != null) {
                                                }
                                                if (sQLiteDatabase != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        this.f25694a.a().o().b("Error reading entries from local database", e);
                                        this.f26353d = true;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (sQLiteDatabase2 != null) {
                                            sQLiteDatabase2.close();
                                        }
                                        i11 = i15;
                                        i15 = i11 + 1;
                                        r62 = 0;
                                        i12 = 5;
                                        i13 = 0;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        cursor = null;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            sQLiteDatabase = w10;
                            cursor5 = null;
                            if (cursor5 != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        sQLiteDatabase = w10;
                    }
                } catch (SQLiteDatabaseLockedException unused11) {
                    sQLiteDatabase = w10;
                } catch (SQLiteFullException e22) {
                    e = e22;
                    sQLiteDatabase = w10;
                } catch (SQLiteException e23) {
                    e = e23;
                    sQLiteDatabase = w10;
                } catch (Throwable th12) {
                    th = th12;
                    sQLiteDatabase = w10;
                }
            } catch (SQLiteDatabaseLockedException unused12) {
                i11 = i15;
                cursor3 = null;
                sQLiteDatabase3 = null;
            } catch (SQLiteFullException e24) {
                e = e24;
                i11 = i15;
                sQLiteDatabase = null;
            } catch (SQLiteException e25) {
                e = e25;
                cursor2 = null;
                sQLiteDatabase2 = null;
            } catch (Throwable th13) {
                th = th13;
                cursor = null;
                sQLiteDatabase = null;
            }
        }
        this.f25694a.a().r().a("Failed to read events from database in reasonable time");
        return null;
    }

    public final boolean u() {
        return z(3, new byte[0]);
    }

    public final boolean v() {
        h();
        if (!this.f26353d && x()) {
            int i10 = 5;
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    this.f25694a.a().r().a("Error deleting app launch break from local database in reasonable time");
                    break;
                }
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase w10 = w();
                            if (w10 != null) {
                                w10.beginTransaction();
                                w10.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                w10.setTransactionSuccessful();
                                w10.endTransaction();
                                w10.close();
                                return true;
                            }
                            this.f26353d = true;
                        } catch (SQLiteException e10) {
                            if (0 != 0) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            this.f25694a.a().o().b("Error deleting app launch break from local database", e10);
                            this.f26353d = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i10);
                        i10 += 20;
                        if (0 == 0) {
                        }
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e11) {
                    this.f25694a.a().o().b("Error deleting app launch break from local database", e11);
                    this.f26353d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
                i11++;
            }
        }
        return false;
    }

    final SQLiteDatabase w() {
        if (this.f26353d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f26352c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f26353d = true;
        return null;
    }

    final boolean x() {
        C2760q3 c2760q3 = this.f25694a;
        Context e10 = c2760q3.e();
        c2760q3.w();
        return e10.getDatabasePath("google_app_measurement_local.db").exists();
    }
}
