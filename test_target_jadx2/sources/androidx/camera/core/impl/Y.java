package androidx.camera.core.impl;

import A.AbstractC0700h0;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f14507a = Collections.unmodifiableSet(EnumSet.of(EnumC1461t.PASSIVE_FOCUSED, EnumC1461t.PASSIVE_NOT_FOCUSED, EnumC1461t.LOCKED_FOCUSED, EnumC1461t.LOCKED_NOT_FOCUSED));

    /* renamed from: b, reason: collision with root package name */
    private static final Set f14508b = Collections.unmodifiableSet(EnumSet.of(EnumC1465v.CONVERGED, EnumC1465v.UNKNOWN));

    /* renamed from: c, reason: collision with root package name */
    private static final Set f14509c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set f14510d;

    static {
        r rVar = r.CONVERGED;
        r rVar2 = r.FLASH_REQUIRED;
        r rVar3 = r.UNKNOWN;
        Set unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(rVar, rVar2, rVar3));
        f14509c = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(rVar2);
        copyOf.remove(rVar3);
        f14510d = Collections.unmodifiableSet(copyOf);
    }

    public static boolean a(InterfaceC1469x interfaceC1469x, boolean z10) {
        boolean z11 = interfaceC1469x.g() == EnumC1459s.OFF || interfaceC1469x.g() == EnumC1459s.UNKNOWN || f14507a.contains(interfaceC1469x.k());
        boolean z12 = interfaceC1469x.j() == EnumC1456q.OFF;
        boolean z13 = !z10 ? !(z12 || f14509c.contains(interfaceC1469x.h())) : !(z12 || f14510d.contains(interfaceC1469x.h()));
        boolean z14 = interfaceC1469x.f() == EnumC1463u.OFF || f14508b.contains(interfaceC1469x.d());
        AbstractC0700h0.a("ConvergenceUtils", "checkCaptureResult, AE=" + interfaceC1469x.h() + " AF =" + interfaceC1469x.k() + " AWB=" + interfaceC1469x.d());
        return z11 && z13 && z14;
    }
}
