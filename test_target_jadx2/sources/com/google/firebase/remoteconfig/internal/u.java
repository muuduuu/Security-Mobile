package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: c, reason: collision with root package name */
    private static final Map f28436c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f28437a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28438b;

    private u(Context context, String str) {
        this.f28437a = context;
        this.f28438b = str;
    }

    public static synchronized u c(Context context, String str) {
        u uVar;
        synchronized (u.class) {
            try {
                Map map = f28436c;
                if (!map.containsKey(str)) {
                    map.put(str, new u(context, str));
                }
                uVar = (u) map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVar;
    }

    public synchronized Void a() {
        this.f28437a.deleteFile(this.f28438b);
        return null;
    }

    String b() {
        return this.f28438b;
    }

    public synchronized g d() {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = this.f28437a.openFileInput(this.f28438b);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStream = null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
        }
        try {
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr, 0, available);
            g b10 = g.b(new JSONObject(new String(bArr, "UTF-8")));
            fileInputStream.close();
            return b10;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public synchronized Void e(g gVar) {
        FileOutputStream openFileOutput = this.f28437a.openFileOutput(this.f28438b, 0);
        try {
            openFileOutput.write(gVar.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}
