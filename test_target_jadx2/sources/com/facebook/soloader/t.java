package com.facebook.soloader;

import android.os.StrictMode;
import com.facebook.soloader.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import q5.AbstractC3922b;

/* loaded from: classes2.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    private static final int f23078a = 3;

    /* renamed from: b, reason: collision with root package name */
    private static final int f23079b = 3;

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f23081d = false;

    /* renamed from: e, reason: collision with root package name */
    private static byte[] f23082e = null;

    /* renamed from: f, reason: collision with root package name */
    private static List f23083f = null;

    /* renamed from: g, reason: collision with root package name */
    private static Map f23084g = null;

    /* renamed from: h, reason: collision with root package name */
    private static volatile boolean f23085h = false;

    /* renamed from: c, reason: collision with root package name */
    private static final int f23080c = 3 + 3;

    /* renamed from: i, reason: collision with root package name */
    private static final ReentrantReadWriteLock f23086i = new ReentrantReadWriteLock();

    /* renamed from: j, reason: collision with root package name */
    private static final HashSet f23087j = new a();

    class a extends HashSet {
        a() {
            add("libEGL.so");
            add("libGLESv2.so");
            add("libGLESv3.so");
            add("libOpenSLES.so");
            add("libandroid.so");
            add("libc.so");
            add("libdl.so");
            add("libjnigraphics.so");
            add("liblog.so");
            add("libm.so");
            add("libstdc++.so");
            add("libz.so");
        }
    }

    private static String[] a(String str) {
        if (f23081d) {
            return i(str);
        }
        if (!f23085h) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f23086i;
        reentrantReadWriteLock.readLock().lock();
        try {
            String[] i10 = i(str);
            reentrantReadWriteLock.readLock().unlock();
            return i10;
        } catch (Throwable th) {
            f23086i.readLock().unlock();
            throw th;
        }
    }

    public static String[] b(String str, h hVar) {
        boolean z10 = SoLoader.f23024a;
        if (z10) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        AbstractC3922b.b();
        try {
            try {
                String[] a10 = a(str);
                if (a10 != null) {
                    AbstractC3922b.a(null);
                    if (z10) {
                        Api18TraceUtils.b();
                    }
                    return a10;
                }
                String[] a11 = s.a(hVar);
                AbstractC3922b.a(null);
                if (z10) {
                    Api18TraceUtils.b();
                }
                return a11;
            } catch (s.a e10) {
                throw D.b(str, e10);
            } catch (Error e11) {
                e = e11;
                throw e;
            } catch (RuntimeException e12) {
                e = e12;
                throw e;
            }
        } catch (Throwable th) {
            AbstractC3922b.a(null);
            if (SoLoader.f23024a) {
                Api18TraceUtils.b();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String[] c(int i10, int i11) {
        byte b10;
        ArrayList arrayList = new ArrayList();
        int i12 = (i10 + i11) - f23080c;
        int i13 = 0;
        boolean z10 = false;
        while (true) {
            byte[] bArr = f23082e;
            if (i12 >= bArr.length || (b10 = bArr[i12]) == 10) {
                break;
            }
            if (b10 == 32) {
                if (z10) {
                    String d10 = d(i13);
                    if (d10 == null) {
                        return null;
                    }
                    arrayList.add(d10);
                    i13 = 0;
                    z10 = false;
                } else {
                    continue;
                }
            } else {
                if (b10 < 48 || b10 > 57) {
                    break;
                }
                i13 = (i13 * 10) + (b10 - 48);
                z10 = true;
            }
            i12++;
        }
        if (z10) {
            String d11 = d(i13);
            if (d11 == null) {
                return null;
            }
            arrayList.add(d11);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static String d(int i10) {
        if (i10 >= f23083f.size()) {
            return null;
        }
        int intValue = ((Integer) f23083f.get(i10)).intValue();
        int i11 = intValue;
        while (true) {
            byte[] bArr = f23082e;
            if (i11 >= bArr.length || bArr[i11] <= 32) {
                break;
            }
            i11++;
        }
        int i12 = (i11 - intValue) + f23080c;
        char[] cArr = new char[i12];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i13 = 0; i13 < i12 - f23080c; i13++) {
            cArr[f23078a + i13] = (char) f23082e[intValue + i13];
        }
        cArr[i12 - 3] = '.';
        cArr[i12 - 2] = 's';
        cArr[i12 - 1] = 'o';
        return new String(cArr);
    }

    private static int e(String str) {
        List list = (List) f23084g.get(Integer.valueOf(f(str)));
        if (list == null) {
            return -1;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (g(str, intValue)) {
                return intValue;
            }
        }
        return -1;
    }

    private static int f(String str) {
        int i10 = 5381;
        for (int i11 = f23078a; i11 < str.length() - f23079b; i11++) {
            i10 = str.codePointAt(i11) + (i10 << 5) + i10;
        }
        return i10;
    }

    private static boolean g(String str, int i10) {
        int i11;
        int i12 = f23078a;
        while (true) {
            int length = str.length();
            i11 = f23079b;
            if (i12 >= length - i11 || i10 >= f23082e.length || (str.codePointAt(i12) & 255) != f23082e[i10]) {
                break;
            }
            i12++;
            i10++;
        }
        return i12 == str.length() - i11;
    }

    public static void h(String str, h hVar, int i10, StrictMode.ThreadPolicy threadPolicy) {
        String[] b10 = b(str, hVar);
        p.a("SoLoader", "Loading " + str + "'s dependencies: " + Arrays.toString(b10));
        for (String str2 : b10) {
            if (!str2.startsWith("/") && !f23087j.contains(str2)) {
                SoLoader.s(str2, i10, threadPolicy);
            }
        }
    }

    static String[] i(String str) {
        int e10;
        if (f23081d && str.length() > f23080c && (e10 = e(str)) != -1) {
            return c(e10, str.length());
        }
        return null;
    }
}
