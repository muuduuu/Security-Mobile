package pe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3893v extends AbstractC3884l {
    private final List r(S s10, boolean z10) {
        File v10 = s10.v();
        String[] list = v10.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Intrinsics.d(str);
                arrayList.add(s10.s(str));
            }
            CollectionsKt.x(arrayList);
            return arrayList;
        }
        if (!z10) {
            return null;
        }
        if (v10.exists()) {
            throw new IOException("failed to list " + s10);
        }
        throw new FileNotFoundException("no such file: " + s10);
    }

    private final void s(S s10) {
        if (j(s10)) {
            throw new IOException(s10 + " already exists.");
        }
    }

    private final void t(S s10) {
        if (j(s10)) {
            return;
        }
        throw new IOException(s10 + " doesn't exist.");
    }

    @Override // pe.AbstractC3884l
    public Z b(S file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z10) {
            t(file);
        }
        return M.f(file.v(), true);
    }

    @Override // pe.AbstractC3884l
    public void c(S source, S target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.v().renameTo(target.v())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // pe.AbstractC3884l
    public void g(S dir, boolean z10) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.v().mkdir()) {
            return;
        }
        C3883k m10 = m(dir);
        if (m10 == null || !m10.e()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z10) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // pe.AbstractC3884l
    public void i(S path, boolean z10) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File v10 = path.v();
        if (v10.delete()) {
            return;
        }
        if (v10.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z10) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // pe.AbstractC3884l
    public List k(S dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List r10 = r(dir, true);
        Intrinsics.d(r10);
        return r10;
    }

    @Override // pe.AbstractC3884l
    public C3883k m(S path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File v10 = path.v();
        boolean isFile = v10.isFile();
        boolean isDirectory = v10.isDirectory();
        long lastModified = v10.lastModified();
        long length = v10.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || v10.exists()) {
            return new C3883k(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // pe.AbstractC3884l
    public AbstractC3882j n(S file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new C3892u(false, new RandomAccessFile(file.v(), "r"));
    }

    @Override // pe.AbstractC3884l
    public Z p(S file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z10) {
            s(file);
        }
        return N.g(file.v(), false, 1, null);
    }

    @Override // pe.AbstractC3884l
    public b0 q(S file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return M.j(file.v());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
