package db;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: db.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3011f extends CodedException {
    public /* synthetic */ C3011f(File file, Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i10 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3011f(File file, Throwable th) {
        super("Failed to read a file '" + Uri.fromFile(file), th);
        Intrinsics.checkNotNullParameter(file, "file");
    }
}
