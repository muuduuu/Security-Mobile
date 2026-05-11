package j2;

import java.io.File;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3480a {
    C3480a() {
    }

    public boolean a(File file) {
        return file.exists();
    }

    public File b(String str) {
        return new File(str);
    }

    public long c(File file) {
        return file.length();
    }
}
