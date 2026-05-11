package db;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: db.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3007b extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3007b(String path, Throwable th) {
        super("Failed to create the file '" + path + "'", th);
        Intrinsics.checkNotNullParameter(path, "path");
    }
}
