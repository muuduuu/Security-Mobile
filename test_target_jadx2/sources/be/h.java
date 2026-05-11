package be;

import Td.G;
import Td.z;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC3879g;

/* loaded from: classes3.dex */
public final class h extends G {

    /* renamed from: c, reason: collision with root package name */
    private final String f19068c;

    /* renamed from: d, reason: collision with root package name */
    private final long f19069d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3879g f19070e;

    public h(String str, long j10, InterfaceC3879g source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f19068c = str;
        this.f19069d = j10;
        this.f19070e = source;
    }

    @Override // Td.G
    public long e() {
        return this.f19069d;
    }

    @Override // Td.G
    public z f() {
        String str = this.f19068c;
        if (str != null) {
            return z.f10239e.b(str);
        }
        return null;
    }

    @Override // Td.G
    public InterfaceC3879g j() {
        return this.f19070e;
    }
}
