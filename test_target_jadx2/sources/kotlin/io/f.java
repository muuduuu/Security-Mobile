package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(File file, File file2, String str) {
        super(file, file2, str);
        Intrinsics.checkNotNullParameter(file, "file");
    }
}
