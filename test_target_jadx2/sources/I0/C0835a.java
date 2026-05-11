package I0;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: I0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0835a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0835a f4027a = new C0835a();

    private C0835a() {
    }

    public final boolean a(File srcFile, File dstFile) {
        Intrinsics.checkNotNullParameter(srcFile, "srcFile");
        Intrinsics.checkNotNullParameter(dstFile, "dstFile");
        try {
            Files.move(srcFile.toPath(), dstFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
