package Q;

import androidx.camera.core.impl.EnumC1456q;
import androidx.camera.core.impl.EnumC1459s;
import androidx.camera.core.impl.EnumC1461t;
import androidx.camera.core.impl.EnumC1463u;
import androidx.camera.core.impl.EnumC1465v;
import androidx.camera.core.impl.EnumC1467w;
import androidx.camera.core.impl.InterfaceC1469x;
import androidx.camera.core.impl.d1;

/* loaded from: classes.dex */
public class m implements InterfaceC1469x {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1469x f7827a;

    /* renamed from: b, reason: collision with root package name */
    private final d1 f7828b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7829c;

    public m(d1 d1Var, InterfaceC1469x interfaceC1469x) {
        this(interfaceC1469x, d1Var, -1L);
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public long a() {
        InterfaceC1469x interfaceC1469x = this.f7827a;
        if (interfaceC1469x != null) {
            return interfaceC1469x.a();
        }
        long j10 = this.f7829c;
        if (j10 != -1) {
            return j10;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public d1 c() {
        return this.f7828b;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1465v d() {
        InterfaceC1469x interfaceC1469x = this.f7827a;
        return interfaceC1469x != null ? interfaceC1469x.d() : EnumC1465v.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1467w e() {
        InterfaceC1469x interfaceC1469x = this.f7827a;
        return interfaceC1469x != null ? interfaceC1469x.e() : EnumC1467w.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1463u f() {
        InterfaceC1469x interfaceC1469x = this.f7827a;
        return interfaceC1469x != null ? interfaceC1469x.f() : EnumC1463u.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1459s g() {
        InterfaceC1469x interfaceC1469x = this.f7827a;
        return interfaceC1469x != null ? interfaceC1469x.g() : EnumC1459s.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public androidx.camera.core.impl.r h() {
        InterfaceC1469x interfaceC1469x = this.f7827a;
        return interfaceC1469x != null ? interfaceC1469x.h() : androidx.camera.core.impl.r.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1456q j() {
        InterfaceC1469x interfaceC1469x = this.f7827a;
        return interfaceC1469x != null ? interfaceC1469x.j() : EnumC1456q.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC1469x
    public EnumC1461t k() {
        InterfaceC1469x interfaceC1469x = this.f7827a;
        return interfaceC1469x != null ? interfaceC1469x.k() : EnumC1461t.UNKNOWN;
    }

    public m(d1 d1Var, long j10) {
        this(null, d1Var, j10);
    }

    private m(InterfaceC1469x interfaceC1469x, d1 d1Var, long j10) {
        this.f7827a = interfaceC1469x;
        this.f7828b = d1Var;
        this.f7829c = j10;
    }
}
