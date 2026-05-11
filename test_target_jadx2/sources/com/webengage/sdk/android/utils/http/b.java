package com.webengage.sdk.android.utils.http;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.camera.core.impl.O0;
import com.webengage.sdk.android.i0;
import com.webengage.sdk.android.utils.WebEngageUtils;
import com.webengage.sdk.android.utils.http.Response;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class b extends i0 {

    /* renamed from: b, reason: collision with root package name */
    private static b f30999b;

    /* renamed from: a, reason: collision with root package name */
    private Context f31000a;

    private b(Context context) {
        super(context, "http_data.db", 3);
        this.f31000a = context;
    }

    private static File c(Context context) {
        return new File(context.getFilesDir(), "we_http_cache");
    }

    private long e() {
        Cursor a10 = a("SELECT SUM(file_size) FROM cache_table", (String[]) null);
        if (a10 != null) {
            try {
                if (!a10.moveToFirst()) {
                    if (!a10.isClosed()) {
                        a10.close();
                    }
                    return 0L;
                }
                long j10 = a10.getInt(0);
                if (!a10.isClosed()) {
                    a10.close();
                }
                return j10;
            } catch (Exception unused) {
                if (!a10.isClosed()) {
                    a10.close();
                }
            } catch (Throwable th) {
                if (!a10.isClosed()) {
                    a10.close();
                }
                throw th;
            }
        }
        return 0L;
    }

    private File g() {
        File c10 = c(this.f31000a);
        if (!c10.exists()) {
            c10.mkdir();
        }
        return c10;
    }

    public int a(Set<String> set) {
        if (set != null && !set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (a(String.valueOf(str.hashCode()))) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                return a("cache_table", "url IN (" + O0.a(",", Collections.nCopies(hashSet.size(), "?")) + ")", (String[]) hashSet.toArray(new String[0]));
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a0, code lost:
    
        if (r0.isClosed() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b3, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b1, code lost:
    
        if (r0.isClosed() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response b(String str) {
        Cursor a10 = a("SELECT * FROM cache_table WHERE url = ?", new String[]{str});
        Response.Builder builder = new Response.Builder();
        if (a10 != null) {
            try {
                if (a10.moveToFirst()) {
                    builder.b(a10.getInt(0));
                    builder.a(a10.getString(a10.getColumnIndex("url")));
                    builder.setInputStream(new FileInputStream(g().getAbsolutePath() + "/" + a10.getString(a10.getColumnIndex("file"))));
                    builder.a((Exception) null);
                    builder.a(false);
                    builder.c(304);
                    builder.setResponseHeaders(c(a10.getBlob(a10.getColumnIndex("headers"))));
                    builder.a(Long.valueOf(a10.getString(a10.getColumnIndex("timestamp"))).longValue());
                    Response build = builder.build();
                    if (!a10.isClosed()) {
                        a10.close();
                    }
                    return build;
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                if (!a10.isClosed()) {
                    a10.close();
                }
                throw th;
            }
        }
        builder.a(str);
        builder.a(new FileNotFoundException("Unable to find file in cache : " + str));
        builder.a(false);
        return builder.build();
    }

    public Set<String> d() {
        HashSet hashSet = new HashSet();
        Cursor a10 = a("SELECT url FROM cache_table WHERE flags & ? != ?", new String[]{String.valueOf(1), String.valueOf(1)});
        if (a10 != null) {
            if (a10.moveToFirst()) {
                do {
                    hashSet.add(a10.getString(a10.getColumnIndex("url")));
                } while (a10.moveToNext());
            }
            a10.close();
        }
        return hashSet;
    }

    public int f() {
        Cursor a10 = a("SELECT id FROM cache_table ORDER BY timestamp ASC LIMIT 0,1", (String[]) null);
        int i10 = (a10 == null || !a10.moveToFirst()) ? -1 : a10.getInt(0);
        if (a10 != null && !a10.isClosed()) {
            a10.close();
        }
        return i10;
    }

    public static b b(Context context) {
        if (f30999b == null) {
            synchronized (b.class) {
                try {
                    if (f30999b == null) {
                        f30999b = new b(context);
                    }
                } finally {
                }
            }
        }
        return f30999b;
    }

    private Map<String, List<String>> c(byte[] bArr) {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
            try {
                Map<String, List<String>> map = (Map) objectInputStream.readObject();
                try {
                    objectInputStream.close();
                } catch (Exception unused) {
                }
                return map;
            } catch (Exception unused2) {
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                objectInputStream2 = objectInputStream;
                th = th;
                if (objectInputStream2 != null) {
                    try {
                        objectInputStream2.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            objectInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.webengage.sdk.android.i0
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(String.format("CREATE TABLE %S (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s BLOB, %s TEXT, %s REAL, %s INTEGER)", "cache_table", "id", "url", "timestamp", "headers", "file", "file_size", "flags"));
    }

    @Override // com.webengage.sdk.android.i0
    public void a(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "cache_table"));
        a(sQLiteDatabase);
        try {
            a(g());
        } catch (Exception unused) {
        }
    }

    public void b(int i10) {
        if (a(i10)) {
            a("cache_table", "id= ?", new String[]{Integer.toString(i10)});
        }
    }

    private boolean a(int i10) {
        Cursor a10 = a("SELECT file FROM cache_table WHERE id = ?", new String[]{String.valueOf(i10)});
        if (a10 == null) {
            return false;
        }
        try {
        } catch (Exception unused) {
            if (a10.isClosed()) {
                return false;
            }
        } catch (Throwable th) {
            if (!a10.isClosed()) {
                a10.close();
            }
            throw th;
        }
        if (a10.moveToFirst()) {
            boolean a11 = a(a10.getString(a10.getColumnIndex("file")));
            if (!a10.isClosed()) {
                a10.close();
            }
            return a11;
        }
        if (a10.isClosed()) {
            return false;
        }
        a10.close();
        return false;
    }

    @Override // com.webengage.sdk.android.i0
    public void b(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", "cache_table"));
        a(sQLiteDatabase);
        try {
            a(g());
        } catch (Exception unused) {
        }
    }

    public static boolean a(Context context) {
        try {
            if (context.deleteDatabase("http_data.db")) {
                return a(c(context));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a(File file) {
        if (file == null || !file.isDirectory()) {
            if (file == null || !file.isFile()) {
                return false;
            }
            return file.delete();
        }
        for (String str : file.list()) {
            if (!a(new File(file, str))) {
                return false;
            }
        }
        return file.delete();
    }

    private boolean a(String str) {
        if (WebEngageUtils.c(str)) {
            return false;
        }
        try {
            return new File(g(), str).delete();
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean a(String str, byte[] bArr) {
        Throwable th;
        if (bArr == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(g(), str);
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                try {
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            } catch (Exception unused2) {
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream == null) {
                    return false;
                }
                try {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return false;
                } catch (Exception unused3) {
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public byte[] a(Response response) {
        int f10;
        if (c() + e() > 20971520 && (f10 = f()) != -1) {
            b(f10);
        }
        String c10 = response.c();
        String valueOf = String.valueOf(c10.hashCode());
        byte[] a10 = a(response.getInputStream());
        if (a(valueOf, a10)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", c10);
            contentValues.put("timestamp", String.valueOf(response.f()));
            contentValues.put("headers", a(response.getResponseHeaders()));
            contentValues.put("file", valueOf);
            contentValues.put("file_size", Long.valueOf(a10 != null ? a10.length : 0L));
            contentValues.put("flags", Integer.valueOf(response.d()));
            if (a("cache_table", contentValues, "url = ?", new String[]{response.c()}) <= 0) {
                a("cache_table", contentValues);
            }
        }
        return a10;
    }

    private byte[] a(InputStream inputStream) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Exception unused) {
                    return null;
                }
            } catch (Exception unused2) {
                inputStream.close();
                return null;
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (Exception unused3) {
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            inputStream.close();
        } catch (Exception unused4) {
        }
        return byteArray;
    }

    private byte[] a(Map<String, List<String>> map) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(map);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            objectOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            return null;
        }
    }
}
