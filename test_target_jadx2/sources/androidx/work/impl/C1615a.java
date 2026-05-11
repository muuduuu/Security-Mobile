package androidx.work.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.work.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1615a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1615a f18250a = new C1615a();

    private C1615a() {
    }

    public final File a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
