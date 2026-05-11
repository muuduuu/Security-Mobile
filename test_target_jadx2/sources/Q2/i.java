package Q2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f8090a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicLong f8091b = new AtomicLong();

    private i() {
    }

    public final File a(File directory) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        return b(directory, Intrinsics.m("chucker-", Long.valueOf(f8091b.getAndIncrement())));
    }

    public final File b(File directory, String fileName) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        try {
            File file = new File(directory, fileName);
            if (file.exists() && !file.delete()) {
                throw new IOException(Intrinsics.m("Failed to delete file ", file));
            }
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            if (file.createNewFile()) {
                return file;
            }
            throw new IOException("File " + file + " already exists");
        } catch (IOException e10) {
            new IOException("An error occurred while creating a Chucker file", e10).printStackTrace();
            return null;
        }
    }
}
