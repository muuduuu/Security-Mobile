package bd;

import Kc.b0;
import kotlin.jvm.internal.Intrinsics;
import wd.EnumC5073e;
import wd.InterfaceC5074f;

/* loaded from: classes3.dex */
public final class v implements InterfaceC5074f {

    /* renamed from: b, reason: collision with root package name */
    private final t f19044b;

    /* renamed from: c, reason: collision with root package name */
    private final ud.t f19045c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f19046d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC5073e f19047e;

    public v(t binaryClass, ud.t tVar, boolean z10, EnumC5073e abiStability) {
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        this.f19044b = binaryClass;
        this.f19045c = tVar;
        this.f19046d = z10;
        this.f19047e = abiStability;
    }

    @Override // Kc.a0
    public b0 a() {
        b0 NO_SOURCE_FILE = b0.f5561a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @Override // wd.InterfaceC5074f
    public String c() {
        return "Class '" + this.f19044b.l().b().b() + '\'';
    }

    public final t d() {
        return this.f19044b;
    }

    public String toString() {
        return v.class.getSimpleName() + ": " + this.f19044b;
    }
}
