package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public abstract class SysUtil {

    private static final class LollipopSysdeps {
        private LollipopSysdeps() {
        }

        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j10) {
            int i10;
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j10);
            } catch (ErrnoException e10) {
                if (e10.errno != OsConstants.EOPNOTSUPP && (i10 = e10.errno) != OsConstants.ENOSYS && i10 != OsConstants.EINVAL) {
                    throw new IOException(e10.toString(), e10);
                }
            }
        }

        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (is64Bit()) {
                    treeSet.add("arm64-v8a");
                    treeSet.add("x86_64");
                } else {
                    treeSet.add("armeabi-v7a");
                    treeSet.add("x86");
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e10) {
                p.b("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e10.errno), e10.getMessage()));
                return Build.SUPPORTED_ABIS;
            }
        }

        public static boolean is64Bit() {
            return Os.readlink("/proc/self/exe").contains("64");
        }
    }

    private static final class MarshmallowSysdeps {
        private MarshmallowSysdeps() {
        }

        public static boolean a(Context context) {
            return context != null && (context.getApplicationInfo().flags & 268435456) == 0;
        }

        public static boolean b(Context context, int i10) {
            if (i10 == 2) {
                return true;
            }
            return a(context);
        }

        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (is64Bit()) {
                treeSet.add("arm64-v8a");
                treeSet.add("x86_64");
            } else {
                treeSet.add("armeabi-v7a");
                treeSet.add("x86");
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        public static boolean is64Bit() {
            return Process.is64Bit();
        }
    }

    static int a(RandomAccessFile randomAccessFile, InputStream inputStream, int i10, byte[] bArr) {
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, i10 - i11));
            if (read == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, read);
            i11 += read;
        }
        return i11;
    }

    public static void b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            p.b("SysUtil", "Enable write permission failed: " + parentFile);
        }
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("Could not delete file " + file);
    }

    public static void c(File file) {
        Stack stack = new Stack();
        stack.push(file);
        ArrayList arrayList = new ArrayList();
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                arrayList.add(file2);
                File[] listFiles = file2.listFiles();
                if (listFiles != null) {
                    for (File file3 : listFiles) {
                        stack.push(file3);
                    }
                }
            } else {
                b(file2);
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b((File) arrayList.get(size));
        }
    }

    public static void d(FileDescriptor fileDescriptor, long j10) {
        LollipopSysdeps.fallocateIfSupported(fileDescriptor, j10);
    }

    public static int e(String[] strArr, String str) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str2 = strArr[i10];
            if (str2 != null && str.equals(str2)) {
                return i10;
            }
        }
        return -1;
    }

    public static void f(File file) {
        Stack stack = new Stack();
        stack.push(file);
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                File[] listFiles = file2.listFiles();
                if (listFiles == null) {
                    throw new IOException("cannot list directory " + file2);
                }
                for (File file3 : listFiles) {
                    stack.push(file3);
                }
            } else if (file2.getPath().endsWith("_lock")) {
                continue;
            } else {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
                    try {
                        randomAccessFile.getFD().sync();
                        randomAccessFile.close();
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e10) {
                    p.b("SysUtil", "Syncing failed for " + file2 + ": " + e10.getMessage());
                }
            }
        }
    }

    public static int g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    public static String getClassLoaderLdLoadLibrary() {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", null).invoke((BaseDexClassLoader) classLoader, null);
            } catch (Exception e10) {
                p.c("SysUtil", "Cannot call getLdLibraryPath", e10);
                return null;
            }
        }
        throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
    }

    public static Method getNativeLoadRuntimeMethod() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Exception e10) {
            p.h("SysUtil", "Cannot get nativeLoad method", e10);
            return null;
        }
    }

    public static n h(File file) {
        return n.a(file);
    }

    public static n i(File file, File file2) {
        boolean z10;
        try {
            return h(file2);
        } catch (FileNotFoundException e10) {
            z10 = true;
            try {
                if (!file.setWritable(true)) {
                    throw e10;
                }
                n h10 = h(file2);
                if (!file.setWritable(false)) {
                    p.g("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                }
                return h10;
            } catch (Throwable th) {
                th = th;
                if (z10 && !file.setWritable(false)) {
                    p.g("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z10 = false;
            if (z10) {
                p.g("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
            }
            throw th;
        }
    }

    public static String[] j() {
        return MarshmallowSysdeps.getSupportedAbis();
    }

    public static boolean k() {
        return MarshmallowSysdeps.is64Bit();
    }

    public static boolean l(Context context, int i10) {
        return MarshmallowSysdeps.b(context, i10);
    }

    public static void m(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("cannot mkdir: " + file);
    }
}
