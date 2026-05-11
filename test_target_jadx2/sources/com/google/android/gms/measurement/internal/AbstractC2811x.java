package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC2231f0;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: com.google.android.gms.measurement.internal.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2811x {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r2 == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void a(C2 c22, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        SQLiteException e10;
        Cursor cursor;
        if (c22 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor2 = null;
        try {
            cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                try {
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                } catch (SQLiteException e11) {
                    e10 = e11;
                    c22.r().c("Error querying for table", str, e10);
                    if (cursor != null) {
                        cursor.close();
                    }
                    sQLiteDatabase.execSQL(str2);
                    try {
                        HashSet hashSet = new HashSet();
                        StringBuilder sb2 = new StringBuilder(str.length() + 22);
                        sb2.append("SELECT * FROM ");
                        sb2.append(str);
                        sb2.append(" LIMIT 0");
                        Cursor rawQuery = sQLiteDatabase.rawQuery(sb2.toString(), null);
                        try {
                            Collections.addAll(hashSet, rawQuery.getColumnNames());
                            rawQuery.close();
                            for (String str4 : str3.split(",")) {
                                if (!hashSet.remove(str4)) {
                                    StringBuilder sb3 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                    sb3.append("Table ");
                                    sb3.append(str);
                                    sb3.append(" is missing required column: ");
                                    sb3.append(str4);
                                    throw new SQLiteException(sb3.toString());
                                }
                            }
                            if (strArr != null) {
                                for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                                    if (!hashSet.remove(strArr[i10])) {
                                        sQLiteDatabase.execSQL(strArr[i10 + 1]);
                                    }
                                }
                            }
                            if (hashSet.isEmpty()) {
                                return;
                            }
                            c22.r().c("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    } catch (SQLiteException e12) {
                        c22.o().b("Failed to verify columns on table that was just created", str);
                        throw e12;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e13) {
            e10 = e13;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    static void b(C2 c22, SQLiteDatabase sQLiteDatabase) {
        if (c22 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        com.google.android.gms.internal.measurement.Z.a();
        String path = sQLiteDatabase.getPath();
        int i10 = AbstractC2231f0.f24500b;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            c22.r().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c22.r().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c22.r().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c22.r().a("Failed to turn on database write permission for owner");
    }
}
