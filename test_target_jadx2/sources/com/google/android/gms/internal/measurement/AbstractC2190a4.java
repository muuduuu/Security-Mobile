package com.google.android.gms.internal.measurement;

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

/* renamed from: com.google.android.gms.internal.measurement.a4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2190a4 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile g8.g f24446a;

    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:90)(1:24)|25|26|27|28|29|30|31|(1:33)(1:82)|34|(9:36|37|38|39|40|(2:41|(3:43|(3:58|59|60)(7:45|46|(2:48|(1:51))|52|(1:54)|55|56)|57)(1:61))|62|63|64)(1:81)|65|14) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0078, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0079, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r0);
        r0 = g8.g.a();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g8.g a(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads;
        g8.g gVar = f24446a;
        if (gVar == null) {
            synchronized (AbstractC2190a4.class) {
                try {
                    gVar = f24446a;
                    if (gVar == null) {
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        int i10 = AbstractC2217d4.f24478b;
                        if (!str.equals("eng")) {
                            if (str.equals("userdebug")) {
                            }
                            gVar = g8.g.a();
                            f24446a = gVar;
                        }
                        if (!str2.contains("dev-keys")) {
                            if (str2.contains("test-keys")) {
                            }
                            gVar = g8.g.a();
                            f24446a = gVar;
                        }
                        Context createDeviceProtectedStorageContext = (!O3.a() || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        StrictMode.allowThreadDiskWrites();
                        char c10 = 0;
                        File file = new File(createDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                        g8.g a10 = file.exists() ? g8.g.d(file) : g8.g.a();
                        if (a10.c()) {
                            File file2 = (File) a10.b();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
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
                                            StringBuilder sb2 = new StringBuilder(readLine.length() + 9);
                                            sb2.append("Invalid: ");
                                            sb2.append(readLine);
                                            Log.e("HermeticFileOverrides", sb2.toString());
                                        } else {
                                            String str3 = new String(split[c10]);
                                            String decode = Uri.decode(new String(split[1]));
                                            String str4 = (String) hashMap.get(split[2]);
                                            if (str4 == null) {
                                                String str5 = new String(split[2]);
                                                str4 = Uri.decode(str5);
                                                if (str4.length() < 1024 || str4 == str5) {
                                                    hashMap.put(str5, str4);
                                                }
                                            }
                                            j0.i iVar2 = (j0.i) iVar.get(str3);
                                            if (iVar2 == null) {
                                                iVar2 = new j0.i();
                                                iVar.put(str3, iVar2);
                                            }
                                            iVar2.put(decode, str4);
                                            c10 = 0;
                                        }
                                    }
                                    String obj = file2.toString();
                                    String packageName = createDeviceProtectedStorageContext.getPackageName();
                                    StringBuilder sb3 = new StringBuilder(obj.length() + 28 + String.valueOf(packageName).length());
                                    sb3.append("Parsed ");
                                    sb3.append(obj);
                                    sb3.append(" for Android package ");
                                    sb3.append(packageName);
                                    Log.w("HermeticFileOverrides", sb3.toString());
                                    U3 u32 = new U3(iVar);
                                    bufferedReader.close();
                                    gVar = g8.g.d(u32);
                                } catch (Throwable th) {
                                    try {
                                        bufferedReader.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (IOException e10) {
                                throw new RuntimeException(e10);
                            }
                        } else {
                            gVar = g8.g.a();
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        f24446a = gVar;
                    }
                } catch (Throwable th3) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th3;
                } finally {
                }
            }
        }
        return gVar;
    }
}
