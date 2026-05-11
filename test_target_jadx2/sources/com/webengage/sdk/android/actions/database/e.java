package com.webengage.sdk.android.actions.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.b2;
import com.webengage.sdk.android.c2;
import com.webengage.sdk.android.h0;
import com.webengage.sdk.android.i0;
import com.webengage.sdk.android.utils.DataType;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class e extends i0 implements b2 {

    /* renamed from: a, reason: collision with root package name */
    private static e f30291a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30292a;

        static {
            int[] iArr = new int[c2.values().length];
            f30292a = iArr;
            try {
                iArr[c2.FORCE_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30292a[c2.INCREMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private e(Context context) {
        super(context, "user_data.db", 4);
    }

    public static e b(Context context) {
        if (f30291a == null) {
            synchronized (e.class) {
                try {
                    if (f30291a == null) {
                        f30291a = new e(context);
                    }
                } finally {
                }
            }
        }
        return f30291a;
    }

    public Object a(String str, String str2) {
        Cursor a10 = a("SELECT * FROM user WHERE cuid = ? AND user_attribute_name  = ?", new String[]{str, str2});
        Object obj = null;
        if (a10 != null) {
            if (a10.moveToFirst()) {
                do {
                    String string = a10.getString(a10.getColumnIndex("user_attribute_name"));
                    String string2 = a10.getString(a10.getColumnIndex("user_attribute_container"));
                    byte[] blob = a10.getBlob(a10.getColumnIndex("user_attribute_value"));
                    obj = a10.getInt(a10.getColumnIndex("user_encryption_flag")) == 1 ? a(string, blob, string2) : WebEngageUtils.a(blob);
                } while (a10.moveToNext());
            }
            if (!a10.isClosed()) {
                a10.close();
            }
        }
        return obj;
    }

    public Map<String, Set<String>> d() {
        Cursor a10 = a("SELECT * FROM user WHERE user_attribute_container = ?", new String[]{h0.EVENT_CRITERIA.toString()});
        HashMap hashMap = new HashMap();
        if (a10 != null) {
            if (a10.moveToFirst()) {
                do {
                    String string = a10.getString(a10.getColumnIndex("user_attribute_name"));
                    String string2 = a10.getString(a10.getColumnIndex("cuid"));
                    if (hashMap.get(string2) == null) {
                        hashMap.put(string2, new HashSet());
                    }
                    ((Set) hashMap.get(string2)).add(string);
                } while (a10.moveToNext());
            }
            if (!a10.isClosed()) {
                a10.close();
            }
        }
        return hashMap;
    }

    public Map<String, Set<String>> e() {
        Cursor a10 = a("SELECT * FROM user WHERE user_attribute_container = ?", new String[]{h0.SCOPES.toString()});
        HashMap hashMap = new HashMap();
        if (a10 != null) {
            if (a10.moveToFirst()) {
                do {
                    String string = a10.getString(a10.getColumnIndex("user_attribute_name"));
                    String string2 = a10.getString(a10.getColumnIndex("cuid"));
                    if (hashMap.get(string2) == null) {
                        hashMap.put(string2, new HashSet());
                    }
                    ((Set) hashMap.get(string2)).add(string);
                } while (a10.moveToNext());
            }
            if (!a10.isClosed()) {
                a10.close();
            }
        }
        return hashMap;
    }

    public Map<String, Set<String>> f() {
        Cursor a10 = a("SELECT * FROM user WHERE user_attribute_container = ?", new String[]{h0.STATIC_LIST.toString()});
        HashMap hashMap = new HashMap();
        if (a10 != null) {
            if (a10.moveToFirst()) {
                do {
                    String string = a10.getString(a10.getColumnIndex("user_attribute_name"));
                    String string2 = a10.getString(a10.getColumnIndex("cuid"));
                    if (hashMap.get(string2) == null) {
                        hashMap.put(string2, new HashSet());
                    }
                    ((Set) hashMap.get(string2)).add(string);
                } while (a10.moveToNext());
            }
            if (!a10.isClosed()) {
                a10.close();
            }
        }
        return hashMap;
    }

    public Map<String, Object> a(String str) {
        h0 a10;
        HashMap hashMap = new HashMap();
        for (h0 h0Var : h0.values()) {
            if (h0Var.a()) {
                hashMap.put(h0Var.toString(), new HashMap());
            }
        }
        Cursor a11 = a("SELECT * FROM user WHERE cuid = ?", new String[]{str});
        if (a11 != null) {
            if (a11.moveToFirst()) {
                do {
                    String string = a11.getString(a11.getColumnIndex("user_attribute_name"));
                    String string2 = a11.getString(a11.getColumnIndex("user_attribute_container"));
                    byte[] blob = a11.getBlob(a11.getColumnIndex("user_attribute_value"));
                    Object a12 = a11.getInt(a11.getColumnIndex("user_encryption_flag")) == 1 ? a(string, blob, string2) : WebEngageUtils.a(blob);
                    if (a12 != null && (a10 = h0.a(string2)) != null && hashMap.get(a10.toString()) != null) {
                        ((Map) hashMap.get(a10.toString())).put(string, a12);
                    }
                } while (a11.moveToNext());
            }
            if (!a11.isClosed()) {
                a11.close();
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (r2 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        if (r14 >= 4) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        r13.execSQL("ALTER TABLE user ADD COLUMN user_encryption_flag INTEGER DEFAULT 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        if (r2 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0039, code lost:
    
        if (r3 == null) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    @Override // com.webengage.sdk.android.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                cursor = sQLiteDatabase.rawQuery("SELECT * FROM user LIMIT 0", null);
                try {
                    if (cursor.getColumnIndex("user_attribute_container") == -1) {
                        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "user"));
                        a(sQLiteDatabase);
                    }
                } catch (SQLException unused) {
                    sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "user"));
                    a(sQLiteDatabase);
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLException unused2) {
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        cursor.close();
        try {
            try {
                cursor2 = sQLiteDatabase.query("user", null, "user_attribute_container = ?", new String[]{h0.ANDROID.toString()}, null, null, null);
                if (cursor2 != null && cursor2.moveToFirst()) {
                    do {
                        String string = cursor2.getString(cursor2.getColumnIndex("user_attribute_name"));
                        if (string != null) {
                            if (!string.endsWith("_view")) {
                                if (string.endsWith("_click")) {
                                }
                            }
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("user_attribute_container", h0.SCOPES.toString());
                            sQLiteDatabase.update("user", contentValues, "id = ?", new String[]{Integer.toString(cursor2.getInt(cursor2.getColumnIndex("id")))});
                        }
                    } while (cursor2.moveToNext());
                }
            } catch (Exception e10) {
                Logger.e("WebEngage", "Error during database upgrade: ", e10);
            }
        } catch (Throwable th3) {
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th3;
        }
    }

    @Override // com.webengage.sdk.android.i0
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %S (%s INTEGER PRIMARY KEY AUTOINCREMENT,%s TEXT, %s TEXT, %s BLOB,%s TEXT,%s TEXT,%s TEXT, %s INTEGER)", "user", "id", "cuid", "user_attribute_name", "user_attribute_value", "operation", "use_attribute_data_type", "user_attribute_container", "user_encryption_flag"));
    }

    void b(String str, String str2) {
        Object a10;
        ArrayList arrayList = new ArrayList();
        Cursor a11 = a("SELECT * FROM user WHERE cuid = ? AND user_attribute_name IN (SELECT user_attribute_name FROM user WHERE cuid = ?)", new String[]{str, str2});
        if (a11 != null) {
            if (a11.moveToFirst()) {
                do {
                    Cursor a12 = a("SELECT * FROM user WHERE cuid = ? AND user_attribute_name = ? AND user_attribute_container = ?", new String[]{str2, a11.getString(a11.getColumnIndex("user_attribute_name")), a11.getString(a11.getColumnIndex("user_attribute_container"))});
                    if (a12 != null) {
                        if (a12.moveToFirst()) {
                            if (a12.getString(a12.getColumnIndex("operation")).equalsIgnoreCase(c2.INCREMENT.toString()) && (a10 = WebEngageUtils.a(a12.getBlob(a12.getColumnIndex("user_attribute_value")))) != null && DataType.isNumber(DataType.valueByString(a11.getString(a11.getColumnIndex("use_attribute_data_type"))))) {
                                Number number = (Number) a10;
                                Object a13 = WebEngageUtils.a(a11.getBlob(a11.getColumnIndex("user_attribute_value")));
                                if (a13 != null) {
                                    number = Double.valueOf(number.doubleValue() + ((Number) a13).doubleValue());
                                }
                                ContentValues contentValues = new ContentValues();
                                try {
                                    contentValues.put("user_attribute_value", WebEngageUtils.a(DataType.convert(number, DataType.detect(a13), false)));
                                } catch (Exception unused) {
                                    contentValues.put("user_attribute_value", WebEngageUtils.a(number));
                                }
                                a("user", contentValues, "id = ?", new String[]{Integer.toString(a12.getInt(a12.getColumnIndex("id")))});
                            }
                            arrayList.add(String.valueOf(a11.getInt(a11.getColumnIndex("id"))));
                        }
                        a12.close();
                    }
                } while (a11.moveToNext());
            }
            a11.close();
        }
        if (!arrayList.isEmpty()) {
            a("user", "id IN (" + new String(new char[arrayList.size()]).replace("\u0000", "?,").replaceAll(",$", BuildConfig.FLAVOR) + ")", (String[]) arrayList.toArray(new String[0]));
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("cuid", str);
        a("user", contentValues2, "cuid = ?", new String[]{str2});
    }

    @Override // com.webengage.sdk.android.i0
    public void a(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "user"));
        a(sQLiteDatabase);
    }

    public void b(ArrayList<String> arrayList) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            sb2.append("?");
            if (i10 < arrayList.size() - 1) {
                sb2.append(" , ");
            }
        }
        arrayList.add(String.valueOf(0));
        Cursor a10 = a("SELECT  * FROM user WHERE user_attribute_container in ( " + ((Object) sb2) + " ) AND user_encryption_flag = ?", (String[]) arrayList.toArray(new String[0]));
        if (a10 != null) {
            if (a10.moveToFirst()) {
                do {
                    try {
                        byte[] b10 = b(a10.getBlob(a10.getColumnIndex("user_attribute_value")));
                        if (b10 != null) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("user_attribute_value", b10);
                            contentValues.put("user_encryption_flag", (Integer) 1);
                            a("user", contentValues, "id = ?", new String[]{Integer.toString(a10.getInt(a10.getColumnIndex("id")))});
                        }
                    } catch (Exception e10) {
                        Logger.e("WebEngage", "failed to encrypt value for " + a10.getString(a10.getColumnIndex("user_attribute_name")) + "\n" + e10);
                    }
                } while (a10.moveToNext());
            }
            if (a10.isClosed()) {
                return;
            }
            a10.close();
        }
    }

    public void a(String str, h0 h0Var) {
        a("user", "cuid = ? AND user_attribute_container = ?", new String[]{str, h0Var.toString()});
    }

    private void a(String str, String str2, h0 h0Var) {
        a("user", "user_attribute_name = ? AND cuid = ? AND user_attribute_container = ?", new String[]{str2, str, h0Var.toString()});
    }

    private void a(String str, String str2, Object obj, h0 h0Var, c2 c2Var) {
        int i10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("cuid", str);
        contentValues.put("user_attribute_name", str2);
        byte[] a10 = a(str2, obj, h0Var);
        if (a10 != null) {
            contentValues.put("user_attribute_value", a10);
            i10 = 1;
        } else {
            contentValues.put("user_attribute_value", WebEngageUtils.a(obj));
            i10 = 0;
        }
        contentValues.put("user_encryption_flag", Integer.valueOf(i10));
        contentValues.put("operation", c2Var.toString());
        DataType detect = DataType.detect(obj);
        if (detect != null) {
            contentValues.put("use_attribute_data_type", detect.toString());
            contentValues.put("user_attribute_container", h0Var.toString());
            if (a("user", contentValues, "user_attribute_name = ? AND cuid = ? AND user_attribute_container = ?", new String[]{str2, str, h0Var.toString()}) <= 0) {
                a("user", contentValues);
            }
        }
    }

    public void a(ArrayList<String> arrayList) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            sb2.append("?");
            if (i10 < arrayList.size() - 1) {
                sb2.append(" , ");
            }
        }
        arrayList.add(String.valueOf(1));
        Cursor a10 = a("SELECT  * FROM user WHERE user_attribute_container in ( " + ((Object) sb2) + " ) AND user_encryption_flag = ?", (String[]) arrayList.toArray(new String[0]));
        if (a10 != null) {
            if (a10.moveToFirst()) {
                do {
                    try {
                        byte[] a11 = a(a10.getBlob(a10.getColumnIndex("user_attribute_value")));
                        if (a11 != null) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("user_attribute_value", a11);
                            contentValues.put("user_encryption_flag", (Integer) 0);
                            a("user", contentValues, "id = ?", new String[]{Integer.toString(a10.getInt(a10.getColumnIndex("id")))});
                        }
                    } catch (Exception e10) {
                        Logger.e("WebEngage", "failed to decrypt for " + a10.getString(a10.getColumnIndex("user_attribute_name")) + "\n " + e10);
                    }
                } while (a10.moveToNext());
            }
            if (a10.isClosed()) {
                return;
            }
            a10.close();
        }
    }

    @Override // com.webengage.sdk.android.b2
    public void a(List<Object> list, Object obj, String str, c2 c2Var) {
        h0 a10;
        c2 c2Var2;
        if (list == null || list.size() <= 1 || str == null || str.isEmpty() || (a10 = h0.a(list.get(0).toString())) == null || !a10.a()) {
            return;
        }
        if (c2Var == null) {
            c2Var = c2.FORCE_UPDATE;
        }
        String obj2 = list.get(1).toString();
        int i10 = a.f30292a[c2Var.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 || obj == null) {
                return;
            } else {
                c2Var2 = c2.INCREMENT;
            }
        } else {
            if (obj == null) {
                a(str, obj2, a10);
                return;
            }
            c2Var2 = c2.FORCE_UPDATE;
        }
        a(str, obj2, obj, a10, c2Var2);
    }

    public static boolean a(Context context) {
        return context.deleteDatabase("user_data.db");
    }
}
