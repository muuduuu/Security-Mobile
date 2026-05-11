package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.auth.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2103y {

    /* renamed from: a, reason: collision with root package name */
    private static volatile S f23788a;

    /* JADX WARN: Can't wrap try/catch for region: R(19:6|(5:8|(1:10)|11|12|13)|14|(5:16|(1:18)|11|12|13)|19|(1:23)|24|25|26|27|28|29|30|(1:32)(1:82)|33|(9:35|36|37|38|39|(2:40|(3:42|(3:57|58|59)(7:44|45|(2:47|(1:50))|51|(1:53)|54|55)|56)(1:60))|61|62|63)(1:81)|64|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x006f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0070, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r3);
        r3 = com.google.android.gms.internal.auth.S.c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static S a(Context context) {
        S s10;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        S c10;
        synchronized (AbstractC2103y.class) {
            try {
                s10 = f23788a;
                if (s10 == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        c10 = S.c();
                        s10 = c10;
                        f23788a = s10;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        c10 = S.c();
                        s10 = c10;
                        f23788a = s10;
                    }
                    if (AbstractC2068m.b() && !context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                    File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                    S c11 = file.exists() ? S.d(file) : S.c();
                    if (c11.b()) {
                        Object a10 = c11.a();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) a10)));
                            try {
                                j0.i iVar = new j0.i();
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
                                    if (split.length != 3) {
                                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                                    } else {
                                        String str3 = new String(split[0]);
                                        String decode = Uri.decode(new String(split[1]));
                                        String str4 = (String) hashMap.get(split[2]);
                                        if (str4 == null) {
                                            String str5 = new String(split[2]);
                                            str4 = Uri.decode(str5);
                                            if (str4.length() < 1024 || str4 == str5) {
                                                hashMap.put(str5, str4);
                                            }
                                        }
                                        if (!iVar.containsKey(str3)) {
                                            iVar.put(str3, new j0.i());
                                        }
                                        ((j0.i) iVar.get(str3)).put(decode, str4);
                                    }
                                }
                                Log.w("HermeticFileOverrides", "Parsed " + a10.toString() + " for Android package " + context.getPackageName());
                                r rVar = new r(iVar);
                                bufferedReader.close();
                                c10 = S.d(rVar);
                            } finally {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        } catch (IOException e10) {
                            throw new RuntimeException(e10);
                        }
                    } else {
                        c10 = S.c();
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    s10 = c10;
                    f23788a = s10;
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th2;
            } finally {
            }
        }
        return s10;
    }
}
