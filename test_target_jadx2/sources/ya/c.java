package ya;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f45384a = new c();

    private c() {
    }

    public final File a(File dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.isDirectory() || dir.mkdirs()) {
            return dir;
        }
        throw new IOException("Couldn't create directory '" + dir + "'");
    }

    public final File b(File internalDirectory, String dirName, String extension) {
        Intrinsics.checkNotNullParameter(internalDirectory, "internalDirectory");
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        Intrinsics.checkNotNullParameter(extension, "extension");
        String file = internalDirectory.toString();
        String str = File.separator;
        File file2 = new File(file + str + dirName);
        a(file2);
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        return new File(file2.toString() + str + uuid + extension);
    }

    public final String c(File internalDirectory, String dirName, String extension) {
        Intrinsics.checkNotNullParameter(internalDirectory, "internalDirectory");
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        Intrinsics.checkNotNullParameter(extension, "extension");
        String file = internalDirectory.toString();
        String str = File.separator;
        File file2 = new File(file + str + dirName);
        a(file2);
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        return file2.toString() + str + uuid + extension;
    }
}
