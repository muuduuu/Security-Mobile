package androidx.camera.core.impl;

import E.i;
import android.hardware.camera2.CaptureResult;

/* renamed from: androidx.camera.core.impl.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1469x {

    /* renamed from: androidx.camera.core.impl.x$a */
    public static final class a implements InterfaceC1469x {
        public static InterfaceC1469x l() {
            return new a();
        }

        @Override // androidx.camera.core.impl.InterfaceC1469x
        public long a() {
            return -1L;
        }

        @Override // androidx.camera.core.impl.InterfaceC1469x
        public d1 c() {
            return d1.b();
        }

        @Override // androidx.camera.core.impl.InterfaceC1469x
        public EnumC1465v d() {
            return EnumC1465v.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.InterfaceC1469x
        public EnumC1467w e() {
            return EnumC1467w.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.InterfaceC1469x
        public EnumC1463u f() {
            return EnumC1463u.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.InterfaceC1469x
        public EnumC1459s g() {
            return EnumC1459s.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.InterfaceC1469x
        public r h() {
            return r.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.InterfaceC1469x
        public CaptureResult i() {
            return null;
        }

        @Override // androidx.camera.core.impl.InterfaceC1469x
        public EnumC1456q j() {
            return EnumC1456q.UNKNOWN;
        }

        @Override // androidx.camera.core.impl.InterfaceC1469x
        public EnumC1461t k() {
            return EnumC1461t.UNKNOWN;
        }
    }

    long a();

    default void b(i.b bVar) {
        bVar.g(e());
    }

    d1 c();

    EnumC1465v d();

    EnumC1467w e();

    EnumC1463u f();

    EnumC1459s g();

    r h();

    default CaptureResult i() {
        return null;
    }

    EnumC1456q j();

    EnumC1461t k();
}
