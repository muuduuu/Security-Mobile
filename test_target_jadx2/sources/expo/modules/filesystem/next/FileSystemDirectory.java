package expo.modules.filesystem.next;

import Pa.i;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kb.c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.t;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lexpo/modules/filesystem/next/FileSystemDirectory;", "Lexpo/modules/filesystem/next/FileSystemPath;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", BuildConfig.FLAVOR, "Q", "()V", "F", "I", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "N", "()Ljava/util/List;", "H", "()Ljava/lang/String;", BuildConfig.FLAVOR, "K", "()Z", "exists", "expo-file-system_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FileSystemDirectory extends FileSystemPath {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemDirectory(File file) {
        super(file);
        Intrinsics.checkNotNullParameter(file, "file");
    }

    @Override // expo.modules.filesystem.next.FileSystemPath
    public void F() {
        if (getFile().exists() && !getFile().isDirectory()) {
            throw new i();
        }
    }

    public final String H() {
        String uri = Uri.fromFile(getFile()).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        if (StringsKt.q(uri, "/", false, 2, null)) {
            return uri;
        }
        return uri + "/";
    }

    public final void I() {
        F();
        C(c.WRITE);
        getFile().mkdir();
    }

    public final boolean K() {
        C(c.READ);
        return getFile().isDirectory();
    }

    public final List N() {
        F();
        C(c.READ);
        File[] listFiles = getFile().listFiles();
        if (listFiles == null) {
            return CollectionsKt.j();
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            arrayList.add(G.k(t.a("isDirectory", Boolean.valueOf(file.isDirectory())), t.a("path", file.getPath())));
        }
        return arrayList;
    }

    public final void Q() {
    }
}
