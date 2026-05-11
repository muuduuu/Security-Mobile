package p3;

import android.app.ActivityManager;
import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3791a {

    /* renamed from: a, reason: collision with root package name */
    private static final FileFilter f38322a = new C0591a();

    /* renamed from: p3.a$a, reason: collision with other inner class name */
    static class C0591a implements FileFilter {
        C0591a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i10 = 3; i10 < name.length(); i10++) {
                if (!Character.isDigit(name.charAt(i10))) {
                    return false;
                }
            }
            return true;
        }
    }

    private static int a(byte[] bArr, int i10) {
        byte b10;
        while (i10 < bArr.length && (b10 = bArr[i10]) != 10) {
            if (Character.isDigit(b10)) {
                int i11 = i10 + 1;
                while (i11 < bArr.length && Character.isDigit(bArr[i11])) {
                    i11++;
                }
                return Integer.parseInt(new String(bArr, 0, i10, i11 - i10));
            }
            i10++;
        }
        return -1;
    }

    public static int b() {
        int i10 = -1;
        for (int i11 = 0; i11 < f(); i11++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i11 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i12 = 0;
                        while (Character.isDigit(bArr[i12]) && i12 < 128) {
                            i12++;
                        }
                        int parseInt = Integer.parseInt(new String(bArr, 0, i12));
                        if (parseInt > i10) {
                            i10 = parseInt;
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
                return -1;
            }
        }
        if (i10 == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int h10 = h("cpu MHz", fileInputStream2) * 1000;
                if (h10 > i10) {
                    i10 = h10;
                }
            } finally {
                fileInputStream2.close();
            }
        }
        return i10;
    }

    private static int c() {
        return new File("/sys/devices/system/cpu/").listFiles(f38322a).length;
    }

    private static int d(String str) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            int e10 = e(readLine);
            try {
                fileInputStream.close();
            } catch (IOException unused2) {
            }
            return e10;
        } catch (IOException unused3) {
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 == null) {
                return -1;
            }
            try {
                fileInputStream2.close();
                return -1;
            } catch (IOException unused4) {
                return -1;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    static int e(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    public static int f() {
        try {
            int d10 = d("/sys/devices/system/cpu/possible");
            if (d10 == -1) {
                d10 = d("/sys/devices/system/cpu/present");
            }
            return d10 == -1 ? c() : d10;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static long g(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    private static int h(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i10 = 0;
            while (i10 < read) {
                byte b10 = bArr[i10];
                if (b10 == 10 || i10 == 0) {
                    if (b10 == 10) {
                        i10++;
                    }
                    for (int i11 = i10; i11 < read; i11++) {
                        int i12 = i11 - i10;
                        if (bArr[i11] != str.charAt(i12)) {
                            break;
                        }
                        if (i12 == str.length() - 1) {
                            return a(bArr, i11);
                        }
                    }
                }
                i10++;
            }
            return -1;
        } catch (IOException | NumberFormatException unused) {
            return -1;
        }
    }
}
