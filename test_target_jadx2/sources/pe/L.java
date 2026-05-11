package pe;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.Intrinsics;
import pe.S;

/* loaded from: classes3.dex */
public class L extends C3893v {
    private final Long v(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // pe.C3893v, pe.AbstractC3884l
    public void c(S source, S target) {
        String message;
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Path w10 = source.w();
            Path w11 = target.w();
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            Files.move(w10, w11, standardCopyOption, standardCopyOption2);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            message = e10.getMessage();
            throw new FileNotFoundException(message);
        }
    }

    @Override // pe.C3893v, pe.AbstractC3884l
    public C3883k m(S path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return u(path.w());
    }

    @Override // pe.C3893v
    public String toString() {
        return "NioSystemFileSystem";
    }

    protected final C3883k u(Path nioPath) {
        LinkOption linkOption;
        BasicFileAttributes readAttributes;
        boolean isSymbolicLink;
        boolean isRegularFile;
        boolean isDirectory;
        long size;
        FileTime creationTime;
        FileTime lastModifiedTime;
        FileTime lastAccessTime;
        Intrinsics.checkNotNullParameter(nioPath, "nioPath");
        try {
            Class a10 = AbstractC3894w.a();
            linkOption = LinkOption.NOFOLLOW_LINKS;
            readAttributes = Files.readAttributes(nioPath, (Class<BasicFileAttributes>) a10, linkOption);
            isSymbolicLink = readAttributes.isSymbolicLink();
            Path readSymbolicLink = isSymbolicLink ? Files.readSymbolicLink(nioPath) : null;
            isRegularFile = readAttributes.isRegularFile();
            isDirectory = readAttributes.isDirectory();
            S f10 = readSymbolicLink != null ? S.a.f(S.f38611b, readSymbolicLink, false, 1, null) : null;
            size = readAttributes.size();
            Long valueOf = Long.valueOf(size);
            creationTime = readAttributes.creationTime();
            Long v10 = creationTime != null ? v(creationTime) : null;
            lastModifiedTime = readAttributes.lastModifiedTime();
            Long v11 = lastModifiedTime != null ? v(lastModifiedTime) : null;
            lastAccessTime = readAttributes.lastAccessTime();
            return new C3883k(isRegularFile, isDirectory, f10, valueOf, v10, v11, lastAccessTime != null ? v(lastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }
}
