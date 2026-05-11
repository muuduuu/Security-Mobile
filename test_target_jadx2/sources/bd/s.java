package bd;

import bd.r;
import id.C3367b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class s {
    public static final t a(r rVar, Zc.g javaClass, hd.e jvmMetadataVersion) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        r.a a10 = rVar.a(javaClass, jvmMetadataVersion);
        if (a10 != null) {
            return a10.a();
        }
        return null;
    }

    public static final t b(r rVar, C3367b classId, hd.e jvmMetadataVersion) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        r.a c10 = rVar.c(classId, jvmMetadataVersion);
        if (c10 != null) {
            return c10.a();
        }
        return null;
    }
}
