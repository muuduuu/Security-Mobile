package ue;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final BigInteger f43771a;

    /* renamed from: b, reason: collision with root package name */
    public static final BigInteger f43772b;

    /* renamed from: c, reason: collision with root package name */
    public static final BigInteger f43773c;

    /* renamed from: d, reason: collision with root package name */
    public static final BigInteger f43774d;

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f43775e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f43776f;

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f43777g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f43778h;

    /* renamed from: i, reason: collision with root package name */
    public static final File[] f43779i;

    static {
        BigInteger valueOf = BigInteger.valueOf(1024L);
        f43771a = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        f43772b = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        f43773c = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        f43774d = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        f43775e = multiply4;
        f43776f = valueOf.multiply(multiply4);
        BigInteger multiply5 = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L));
        f43777g = multiply5;
        f43778h = valueOf.multiply(multiply5);
        f43779i = new File[0];
    }

    private static void a(File file, File file2) {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (file.exists()) {
            return;
        }
        throw new FileNotFoundException("Source '" + file + "' does not exist");
    }

    public static void b(File file) {
        IOException e10 = null;
        for (File file2 : m(file)) {
            try {
                k(file2);
            } catch (IOException e11) {
                e10 = e11;
            }
        }
        if (e10 != null) {
            throw e10;
        }
    }

    public static void c(File file, File file2) {
        e(file, file2, true);
    }

    public static void d(File file, File file2, FileFilter fileFilter, boolean z10) {
        ArrayList arrayList;
        a(file, file2);
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is not a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
            if (listFiles != null && listFiles.length > 0) {
                arrayList = new ArrayList(listFiles.length);
                for (File file3 : listFiles) {
                    arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
                }
                i(file, file2, fileFilter, z10, arrayList);
            }
        }
        arrayList = null;
        i(file, file2, fileFilter, z10, arrayList);
    }

    public static void e(File file, File file2, boolean z10) {
        d(file, file2, null, z10);
    }

    public static void f(File file, File file2) {
        g(file, file2, true);
    }

    public static void g(File file, File file2, boolean z10) {
        a(file, file2);
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
            throw new IOException("Destination '" + parentFile + "' directory cannot be created");
        }
        if (!file2.exists() || file2.canWrite()) {
            j(file, file2, z10);
            return;
        }
        throw new IOException("Destination '" + file2 + "' exists but is read-only");
    }

    public static void h(File file) {
        if (file.exists()) {
            if (!l(file)) {
                b(file);
            }
            if (file.delete()) {
                return;
            }
            throw new IOException("Unable to delete directory " + file + ".");
        }
    }

    private static void i(File file, File file2, FileFilter fileFilter, boolean z10, List list) {
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (listFiles == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' exists but is not a directory");
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' directory cannot be created");
        }
        if (!file2.canWrite()) {
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        for (File file3 : listFiles) {
            File file4 = new File(file2, file3.getName());
            if (list == null || !list.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    i(file3, file4, fileFilter, z10, list);
                } else {
                    j(file3, file4, z10);
                }
            }
        }
        if (z10) {
            file2.setLastModified(file.lastModified());
        }
    }

    private static void j(File file, File file2, boolean z10) {
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileChannel channel = fileInputStream.getChannel();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    FileChannel channel2 = fileOutputStream.getChannel();
                    try {
                        long size = channel.size();
                        long j10 = 0;
                        while (j10 < size) {
                            long j11 = size - j10;
                            long transferFrom = channel2.transferFrom(channel, j10, j11 > 31457280 ? 31457280L : j11);
                            if (transferFrom == 0) {
                                break;
                            } else {
                                j10 += transferFrom;
                            }
                        }
                        if (channel2 != null) {
                            channel2.close();
                        }
                        fileOutputStream.close();
                        channel.close();
                        fileInputStream.close();
                        long length = file.length();
                        long length2 = file2.length();
                        if (length == length2) {
                            if (z10) {
                                file2.setLastModified(file.lastModified());
                                return;
                            }
                            return;
                        }
                        throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static void k(File file) {
        if (file.isDirectory()) {
            h(file);
            return;
        }
        boolean exists = file.exists();
        if (file.delete()) {
            return;
        }
        if (exists) {
            throw new IOException("Unable to delete file: " + file);
        }
        throw new FileNotFoundException("File does not exist: " + file);
    }

    public static boolean l(File file) {
        Path path;
        boolean isSymbolicLink;
        if (file == null) {
            throw new NullPointerException("File must not be null");
        }
        path = file.toPath();
        isSymbolicLink = Files.isSymbolicLink(path);
        return isSymbolicLink;
    }

    private static File[] m(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            return listFiles;
        }
        throw new IOException("Failed to list contents of " + file);
    }
}
