package vd;

import Kc.G;
import dd.C3036m;
import ed.C3121a;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import ud.p;
import xd.n;

/* loaded from: classes3.dex */
public final class c extends p implements Hc.b {

    /* renamed from: o, reason: collision with root package name */
    public static final a f44222o = new a(null);

    /* renamed from: n, reason: collision with root package name */
    private final boolean f44223n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(id.c fqName, n storageManager, G module, InputStream inputStream, boolean z10) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Pair a10 = ed.c.a(inputStream);
            C3036m c3036m = (C3036m) a10.getFirst();
            C3121a c3121a = (C3121a) a10.getSecond();
            if (c3036m != null) {
                return new c(fqName, storageManager, module, c3036m, c3121a, z10, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + C3121a.f32552h + ", actual " + c3121a + ". Please update Kotlin");
        }

        private a() {
        }
    }

    public /* synthetic */ c(id.c cVar, n nVar, G g10, C3036m c3036m, C3121a c3121a, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, nVar, g10, c3036m, c3121a, z10);
    }

    @Override // Mc.z, Mc.AbstractC0984j
    public String toString() {
        return "builtins package fragment for " + e() + " from " + AbstractC3778c.p(this);
    }

    private c(id.c cVar, n nVar, G g10, C3036m c3036m, C3121a c3121a, boolean z10) {
        super(cVar, nVar, g10, c3036m, c3121a, null);
        this.f44223n = z10;
    }
}
