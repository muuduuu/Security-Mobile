package a3;

import b3.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class c {

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    public static class b extends IOException {
        public b(String str) {
            super(str);
        }
    }

    /* renamed from: a3.c$c, reason: collision with other inner class name */
    public static class C0233c extends FileNotFoundException {
        public C0233c(String str) {
            super(str);
        }
    }

    public static class d extends IOException {
        public d(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    public static void a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                throw new a(file.getAbsolutePath(), new b(file.getAbsolutePath()));
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new a(file.getAbsolutePath());
        }
    }

    public static void b(File file, File file2) {
        l.g(file);
        l.g(file2);
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        throw new d("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), !file2.exists() ? file.getParentFile().exists() ? !file.exists() ? new FileNotFoundException(file.getAbsolutePath()) : null : new C0233c(file.getAbsolutePath()) : new b(file2.getAbsolutePath()));
    }
}
