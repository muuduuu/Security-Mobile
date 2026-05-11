package bd;

import Kc.b0;
import dd.C3035l;
import gd.AbstractC3218a;
import id.C3367b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.text.StringsKt;
import wd.EnumC5073e;
import wd.InterfaceC5074f;

/* loaded from: classes3.dex */
public final class n implements InterfaceC5074f {

    /* renamed from: b, reason: collision with root package name */
    private final pd.d f19020b;

    /* renamed from: c, reason: collision with root package name */
    private final pd.d f19021c;

    /* renamed from: d, reason: collision with root package name */
    private final ud.t f19022d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f19023e;

    /* renamed from: f, reason: collision with root package name */
    private final EnumC5073e f19024f;

    /* renamed from: g, reason: collision with root package name */
    private final t f19025g;

    /* renamed from: h, reason: collision with root package name */
    private final String f19026h;

    public n(pd.d className, pd.d dVar, C3035l packageProto, fd.c nameResolver, ud.t tVar, boolean z10, EnumC5073e abiStability, t tVar2) {
        String string;
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        this.f19020b = className;
        this.f19021c = dVar;
        this.f19022d = tVar;
        this.f19023e = z10;
        this.f19024f = abiStability;
        this.f19025g = tVar2;
        i.f packageModuleName = AbstractC3218a.f33686m;
        Intrinsics.checkNotNullExpressionValue(packageModuleName, "packageModuleName");
        Integer num = (Integer) fd.e.a(packageProto, packageModuleName);
        this.f19026h = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // Kc.a0
    public b0 a() {
        b0 NO_SOURCE_FILE = b0.f5561a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @Override // wd.InterfaceC5074f
    public String c() {
        return "Class '" + d().b().b() + '\'';
    }

    public final C3367b d() {
        return new C3367b(e().g(), h());
    }

    public pd.d e() {
        return this.f19020b;
    }

    public pd.d f() {
        return this.f19021c;
    }

    public final t g() {
        return this.f19025g;
    }

    public final id.f h() {
        String f10 = e().f();
        Intrinsics.checkNotNullExpressionValue(f10, "getInternalName(...)");
        id.f o10 = id.f.o(StringsKt.L0(f10, '/', null, 2, null));
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        return o10;
    }

    public String toString() {
        return n.class.getSimpleName() + ": " + e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(t kotlinClass, C3035l packageProto, fd.c nameResolver, ud.t tVar, boolean z10, EnumC5073e abiStability) {
        this(r2, r1, packageProto, nameResolver, tVar, z10, abiStability, kotlinClass);
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        pd.d b10 = pd.d.b(kotlinClass.l());
        Intrinsics.checkNotNullExpressionValue(b10, "byClassId(...)");
        String e10 = kotlinClass.a().e();
        pd.d dVar = null;
        if (e10 != null && e10.length() > 0) {
            dVar = pd.d.d(e10);
        }
    }
}
