package com.google.android.gms.common.util;

import V6.AbstractC1287s;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private static String f23536a;

    /* renamed from: b, reason: collision with root package name */
    private static int f23537b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f23538c;

    public static String a() {
        BufferedReader bufferedReader;
        String processName;
        if (f23536a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f23536a = processName;
            } else {
                int i10 = f23537b;
                if (i10 == 0) {
                    i10 = Process.myPid();
                    f23537b = i10;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i10 > 0) {
                    try {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 14);
                        sb2.append("/proc/");
                        sb2.append(i10);
                        sb2.append("/cmdline");
                        String sb3 = sb2.toString();
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(sb3));
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        String readLine = bufferedReader.readLine();
                        AbstractC1287s.m(readLine);
                        str = readLine.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        l.a(bufferedReader2);
                        throw th;
                    }
                    l.a(bufferedReader);
                }
                f23536a = str;
            }
        }
        return f23536a;
    }

    public static boolean b() {
        boolean isIsolated;
        Boolean bool = f23538c;
        if (bool == null) {
            if (m.f()) {
                isIsolated = Process.isIsolated();
                bool = Boolean.valueOf(isIsolated);
            } else {
                try {
                    Object a10 = n7.r.a(Process.class, "isIsolated", new n7.q[0]);
                    Object[] objArr = new Object[0];
                    if (a10 == null) {
                        throw new n7.u(n7.t.a("expected a non-null reference", objArr));
                    }
                    bool = (Boolean) a10;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            f23538c = bool;
        }
        return bool.booleanValue();
    }
}
