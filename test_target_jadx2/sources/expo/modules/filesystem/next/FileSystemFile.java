package expo.modules.filesystem.next;

import Pa.h;
import android.net.Uri;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.Locale;
import kb.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0013J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u000b8F¢\u0006\f\u0012\u0004\b\u001e\u0010\b\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010#\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010%\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013¨\u0006&"}, d2 = {"Lexpo/modules/filesystem/next/FileSystemFile;", "Lexpo/modules/filesystem/next/FileSystemPath;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", BuildConfig.FLAVOR, "A0", "()V", "F", "N", BuildConfig.FLAVOR, "content", "Z0", "(Ljava/lang/String;)V", "LCb/j;", "O0", "(LCb/j;)V", "H", "()Ljava/lang/String;", "z0", "I", BuildConfig.FLAVOR, "K", "()[B", BuildConfig.FLAVOR, "Q", "()Z", "exists", "i0", "getMd5$annotations", "md5", BuildConfig.FLAVOR, "o0", "()Ljava/lang/Long;", "size", "y0", "type", "expo-file-system_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FileSystemFile extends FileSystemPath {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemFile(File file) {
        super(file);
        Intrinsics.checkNotNullParameter(file, "file");
    }

    public final void A0() {
    }

    @Override // expo.modules.filesystem.next.FileSystemPath
    public void F() {
        C(c.READ);
        if (getFile().exists() && getFile().isDirectory()) {
            throw new h();
        }
    }

    public final String H() {
        String uri = Uri.fromFile(getFile()).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return StringsKt.q(uri, "/", false, 2, null) ? StringsKt.U0(uri, 1) : uri;
    }

    public final String I() {
        F();
        C(c.READ);
        String encodeToString = Base64.encodeToString(j.g(getFile()), 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public final byte[] K() {
        F();
        C(c.READ);
        return j.g(getFile());
    }

    public final void N() {
        F();
        C(c.WRITE);
        getFile().createNewFile();
    }

    public final void O0(Cb.j content) {
        Intrinsics.checkNotNullParameter(content, "content");
        F();
        C(c.WRITE);
        if (!Q()) {
            N();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(getFile());
        try {
            fileOutputStream.getChannel().write(content.toDirectBuffer());
            kotlin.io.c.a(fileOutputStream, null);
        } finally {
        }
    }

    public final boolean Q() {
        C(c.READ);
        return getFile().isFile();
    }

    public final void Z0(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        F();
        C(c.WRITE);
        if (!Q()) {
            N();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(getFile());
        try {
            byte[] bytes = content.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            Unit unit = Unit.f36324a;
            kotlin.io.c.a(fileOutputStream, null);
        } finally {
        }
    }

    public final String i0() {
        C(c.READ);
        byte[] digest = MessageDigest.getInstance("MD5").digest(j.g(getFile()));
        Intrinsics.d(digest);
        return kotlin.text.c.i(digest, null, 1, null);
    }

    public final Long o0() {
        if (getFile().exists()) {
            return Long.valueOf(getFile().length());
        }
        return null;
    }

    public final String y0() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(getFile().getPath());
        if (fileExtensionFromUrl == null) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    public final String z0() {
        F();
        C(c.READ);
        return j.i(getFile(), null, 1, null);
    }
}
