package Oc;

import bd.r;
import id.C3367b;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import vd.C5013a;

/* loaded from: classes3.dex */
public final class g implements r {

    /* renamed from: a, reason: collision with root package name */
    private final ClassLoader f7289a;

    /* renamed from: b, reason: collision with root package name */
    private final vd.d f7290b;

    public g(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f7289a = classLoader;
        this.f7290b = new vd.d();
    }

    private final r.a d(String str) {
        f a10;
        Class a11 = e.a(this.f7289a, str);
        if (a11 == null || (a10 = f.f7286c.a(a11)) == null) {
            return null;
        }
        return new r.a.C0337a(a10, null, 2, null);
    }

    @Override // bd.r
    public r.a a(Zc.g javaClass, hd.e jvmMetadataVersion) {
        String b10;
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        id.c e10 = javaClass.e();
        if (e10 == null || (b10 = e10.b()) == null) {
            return null;
        }
        return d(b10);
    }

    @Override // ud.v
    public InputStream b(id.c packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        if (packageFqName.i(Hc.j.f3890x)) {
            return this.f7290b.a(C5013a.f44220r.r(packageFqName));
        }
        return null;
    }

    @Override // bd.r
    public r.a c(C3367b classId, hd.e jvmMetadataVersion) {
        String b10;
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(jvmMetadataVersion, "jvmMetadataVersion");
        b10 = h.b(classId);
        return d(b10);
    }
}
