package db;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: db.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3020o extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3020o(String moduleName) {
        super("Module '" + moduleName + "' not found. Are you sure all modules are linked correctly?", null, 2, null);
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
    }
}
