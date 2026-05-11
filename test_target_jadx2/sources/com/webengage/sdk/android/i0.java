package com.webengage.sdk.android;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.io.File;

/* loaded from: classes2.dex */
public abstract class i0 extends SQLiteOpenHelper {
    public i0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
    }

    public int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                return b().update(str, contentValues, str2, strArr);
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    public abstract void a(SQLiteDatabase sQLiteDatabase);

    public abstract void a(SQLiteDatabase sQLiteDatabase, int i10, int i11);

    protected SQLiteDatabase b() {
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                return getWritableDatabase();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public abstract void b(SQLiteDatabase sQLiteDatabase, int i10, int i11);

    public long c() {
        try {
            return new File(a().getPath()).length();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        a(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        b(sQLiteDatabase, i10, i11);
    }

    public int a(String str, String str2, String[] strArr) {
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                return b().delete(str, str2, strArr);
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    public byte[] b(byte[] bArr) {
        return l4.c().b(bArr);
    }

    public long a(String str, ContentValues contentValues) {
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                return b().insertOrThrow(str, null, contentValues);
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public Cursor a(String str, String[] strArr) {
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                return a().rawQuery(str, strArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    protected SQLiteDatabase a() {
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                return getReadableDatabase();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public Object a(String str, byte[] bArr, String str2) {
        try {
            return WebEngageUtils.a(a(bArr));
        } catch (Exception e10) {
            Logger.e("WebEngage", "Unable to decrypt " + str + "\n" + e10);
            return null;
        }
    }

    public byte[] a(Object obj) {
        return b(WebEngageUtils.a(obj));
    }

    public byte[] a(String str, Object obj, h0 h0Var) {
        if (!h0Var.e() || obj == null || !WebEngage.get().getWebEngageConfig().getShouldEncryptUserStorage()) {
            return null;
        }
        try {
            return a(obj);
        } catch (Exception unused) {
            Logger.e("WebEngage", "Unable to encrypt " + str + "\n");
            return null;
        }
    }

    public byte[] a(byte[] bArr) {
        return l4.c().a(bArr);
    }
}
