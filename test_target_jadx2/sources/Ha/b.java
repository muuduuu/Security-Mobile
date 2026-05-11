package Ha;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class b {
    public static File a(File file) {
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        throw new IOException("Couldn't create directory '" + file + "'");
    }

    public static String b(File file, String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file);
        String str3 = File.separator;
        sb2.append(str3);
        sb2.append(str);
        File file2 = new File(sb2.toString());
        a(file2);
        String uuid = UUID.randomUUID().toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(file2);
        sb3.append(str3);
        sb3.append(uuid);
        if (!str2.startsWith(".")) {
            str2 = "." + str2;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
