package expo.modules.filesystem.next;

import Pa.a;
import Pa.g;
import android.os.Build;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.EnumSet;
import kb.InterfaceC3558b;
import kb.c;
import kotlin.Metadata;
import kotlin.io.j;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import pb.C3862a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0005¨\u0006\u001c"}, d2 = {"Lexpo/modules/filesystem/next/FileSystemPath;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "fileOrDirectory", BuildConfig.FLAVOR, "t", "F", "()V", "destination", "y", "(Lexpo/modules/filesystem/next/FileSystemPath;)Ljava/io/File;", "Lkb/c;", "permission", BuildConfig.FLAVOR, "C", "(Lkb/c;)Z", "to", "s", "(Lexpo/modules/filesystem/next/FileSystemPath;)V", "z", "c", "Ljava/io/File;", "x", "()Ljava/io/File;", "setFile", "expo-file-system_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class FileSystemPath extends SharedObject {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private File file;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileSystemPath(File file) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(file, "file");
        this.file = file;
    }

    public static /* synthetic */ void u(FileSystemPath fileSystemPath, File file, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 1) != 0) {
            file = fileSystemPath.file;
        }
        fileSystemPath.t(file);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r0 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(c permission) {
        EnumSet noneOf;
        InterfaceC3558b n10;
        Intrinsics.checkNotNullParameter(permission, "permission");
        C3862a f10 = f();
        if (f10 != null && (n10 = f10.n()) != null) {
            C3862a f11 = f();
            noneOf = n10.a(f11 != null ? f11.w() : null, this.file.getPath());
        }
        noneOf = EnumSet.noneOf(c.class);
        if (noneOf.contains(permission)) {
            return true;
        }
        throw new g(permission);
    }

    public abstract void F();

    public final void s(FileSystemPath to) {
        Intrinsics.checkNotNullParameter(to, "to");
        F();
        to.F();
        C(c.READ);
        to.C(c.WRITE);
        j.q(this.file, y(to), false, null, 6, null);
    }

    public final void t(File fileOrDirectory) {
        File[] listFiles;
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        if (!fileOrDirectory.exists()) {
            throw new Pa.j("path '" + fileOrDirectory.getPath() + "' does not exist");
        }
        if (fileOrDirectory.isDirectory() && (listFiles = fileOrDirectory.listFiles()) != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    Intrinsics.d(file);
                    t(file);
                } else if (!file.delete()) {
                    throw new Pa.j("failed to delete '" + file.getPath() + "'");
                }
            }
        }
        if (fileOrDirectory.delete()) {
            return;
        }
        throw new Pa.j("failed to delete '" + fileOrDirectory.getPath() + "'");
    }

    /* renamed from: x, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    public final File y(FileSystemPath destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (!(destination instanceof FileSystemDirectory)) {
            if (!(this instanceof FileSystemFile)) {
                throw new a();
            }
            File parentFile = destination.file.getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                throw new Pa.c();
            }
            return destination.file;
        }
        if (this instanceof FileSystemFile) {
            if (((FileSystemDirectory) destination).K()) {
                return new File(destination.file, this.file.getName());
            }
            throw new Pa.c();
        }
        if (((FileSystemDirectory) destination).K()) {
            return new File(destination.file, this.file.getName());
        }
        File parentFile2 = destination.file.getParentFile();
        if (parentFile2 == null || !parentFile2.exists()) {
            throw new Pa.c();
        }
        return destination.file;
    }

    public final void z(FileSystemPath to) {
        Path path;
        Path path2;
        Path move;
        Intrinsics.checkNotNullParameter(to, "to");
        F();
        to.F();
        c cVar = c.WRITE;
        C(cVar);
        to.C(cVar);
        if (Build.VERSION.SDK_INT < 26) {
            j.s(this.file, y(to), false, 0, 6, null);
            this.file.delete();
            this.file = y(to);
            return;
        }
        File y10 = y(to);
        path = this.file.toPath();
        Intrinsics.checkNotNullExpressionValue(path, "toPath(...)");
        path2 = y10.toPath();
        Intrinsics.checkNotNullExpressionValue(path2, "toPath(...)");
        move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(new CopyOption[0], 0));
        Intrinsics.checkNotNullExpressionValue(move, "move(...)");
        this.file = y10;
    }
}
