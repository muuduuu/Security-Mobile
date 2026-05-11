package com.webengage.sdk.android;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.camera.core.impl.O0;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class m0 extends i0 {

    /* renamed from: a, reason: collision with root package name */
    private static m0 f30722a;

    private m0(Context context) {
        super(context, "event_data.db", 2);
    }

    public int a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return a("events", "id IN (" + O0.a(",", Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]));
    }

    public int b(List<String> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_state", "FAILED");
        return a("events", contentValues, "id IN (" + O0.a(",", Collections.nCopies(list.size(), "?")) + ")", (String[]) list.toArray(new String[0]));
    }

    public synchronized Boolean d() {
        new ArrayList();
        Cursor a10 = a("SELECT * FROM events WHERE event_name = ?", new String[]{"user_logged_out"});
        if (a10 == null || a10.getCount() <= 0) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public int e() {
        Cursor a10 = a("SELECT COUNT(*) FROM events WHERE sync_state = ? OR sync_state = ?", new String[]{"NOT_SYNCED", "FAILED"});
        if (a10 != null) {
            r1 = a10.moveToFirst() ? a10.getInt(0) : 0;
            a10.close();
        }
        return r1;
    }

    public int f() {
        Cursor a10 = a("SELECT id FROM events ORDER BY event_time ASC LIMIT ?, ?", new String[]{"0", "1"});
        int i10 = (a10 == null || !a10.moveToFirst()) ? -1 : a10.getInt(0);
        if (a10 != null && !a10.isClosed()) {
            a10.close();
        }
        return i10;
    }

    public int g() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_state", "NOT_SYNCED");
        return a("events", contentValues, "sync_state = ?", new String[]{"SYNCING"});
    }

    public static m0 b(Context context) {
        if (f30722a == null) {
            synchronized (m0.class) {
                try {
                    if (f30722a == null) {
                        f30722a = new m0(context);
                    }
                } finally {
                }
            }
        }
        return f30722a;
    }

    public long a(p0 p0Var) {
        int f10;
        if (c() > 3145728 && (f10 = f()) != -1) {
            a("events", "id = ?", new String[]{Integer.toString(f10)});
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("license_code", p0Var.j());
        contentValues.put("interface_id", p0Var.h());
        contentValues.put("luid", p0Var.i());
        contentValues.put("suid", p0Var.k());
        contentValues.put("cuid", p0Var.a());
        contentValues.put("category", p0Var.b());
        contentValues.put("event_name", p0Var.d());
        contentValues.put("event_time", WebEngageUtils.a(p0Var.e()));
        contentValues.put("event_data", WebEngageUtils.a(p0Var.c()));
        if (p0Var.l() == null) {
            contentValues.put("system_data", WebEngageUtils.a((Object) new HashMap()));
        } else {
            contentValues.put("system_data", WebEngageUtils.a(p0Var.l()));
        }
        contentValues.put("sync_state", "NOT_SYNCED");
        return a("events", contentValues);
    }

    public synchronized Boolean a(String str) {
        new ArrayList();
        Cursor a10 = a("SELECT * FROM events WHERE luid = ?", new String[]{str});
        if (a10 == null || a10.getCount() >= 1) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override // com.webengage.sdk.android.i0
    public void b(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.rawQuery(String.format("SELECT * FROM %s LIMIT 0", "events"), null);
                if (cursor.getColumnIndex("interface_id") == -1) {
                    sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "events"));
                    a(sQLiteDatabase);
                }
            } catch (SQLException unused) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "events"));
                a(sQLiteDatabase);
                if (cursor == null) {
                    return;
                }
            }
            cursor.close();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public synchronized ArrayList<p0> a(int i10) {
        try {
            ArrayList<p0> arrayList = new ArrayList<>();
            Cursor a10 = a("SELECT * FROM events WHERE sync_state = ? OR sync_state = ? ORDER BY event_time ASC LIMIT ?, ?", new String[]{"NOT_SYNCED", "FAILED", "0", String.valueOf(i10)});
            ContentValues contentValues = new ContentValues();
            contentValues.put("sync_state", "SYNCING");
            if (a10 != null) {
                if (a10.moveToFirst()) {
                    String string = a10.getString(a10.getColumnIndex("luid"));
                    String string2 = a10.getString(a10.getColumnIndex("cuid"));
                    ArrayList arrayList2 = new ArrayList();
                    do {
                        String string3 = a10.getString(a10.getColumnIndex("luid"));
                        String string4 = a10.getString(a10.getColumnIndex("cuid"));
                        if (!string3.equals(string) || !string4.equals(string2)) {
                            break;
                        }
                        p0 p0Var = new p0();
                        p0Var.a(Integer.valueOf(a10.getInt(a10.getColumnIndex("id"))));
                        p0Var.d(a10.getString(a10.getColumnIndex("interface_id")));
                        p0Var.f(a10.getString(a10.getColumnIndex("license_code")));
                        p0Var.e(a10.getString(a10.getColumnIndex("luid")));
                        p0Var.g(a10.getString(a10.getColumnIndex("suid")));
                        p0Var.a(a10.getString(a10.getColumnIndex("cuid")));
                        p0Var.b(a10.getString(a10.getColumnIndex("category")));
                        p0Var.c(a10.getString(a10.getColumnIndex("event_name")));
                        p0Var.a((Date) WebEngageUtils.a(a10.getBlob(a10.getColumnIndex("event_time"))));
                        p0Var.a((Map<String, Object>) WebEngageUtils.a(a10.getBlob(a10.getColumnIndex("event_data"))));
                        p0Var.c((Map<String, Object>) WebEngageUtils.a(a10.getBlob(a10.getColumnIndex("system_data"))));
                        arrayList2.add(Integer.toString(p0Var.g().intValue()));
                        arrayList.add(p0Var);
                    } while (a10.moveToNext());
                    a10.close();
                    if (arrayList2.size() > 0) {
                        a("events", contentValues, "id in (" + new String(new char[arrayList2.size() - 1]).replaceAll("\u0000", "?,") + "?)", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
                    }
                    return arrayList;
                }
                a10.close();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b(String str) {
        a("events", "luid != ?", new String[]{str});
    }

    @Override // com.webengage.sdk.android.i0
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %S (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s TEXT,%s TEXT, %s TEXT, %s TEXT,%s TEXT ,%s BLOB,%s BLOB ,%s BLOB,%s TEXT)", "events", "id", "license_code", "interface_id", "luid", "suid", "cuid", "category", "event_name", "event_time", "event_data", "system_data", "sync_state"));
    }

    @Override // com.webengage.sdk.android.i0
    public void a(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "events"));
        a(sQLiteDatabase);
    }

    public static boolean a(Context context) {
        return context.deleteDatabase("event_data.db");
    }
}
