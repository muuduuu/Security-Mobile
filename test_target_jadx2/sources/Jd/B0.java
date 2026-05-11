package Jd;

import Od.C1087o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class B0 extends C1087o implements InterfaceC0876c0, InterfaceC0905r0 {

    /* renamed from: d, reason: collision with root package name */
    public C0 f4975d;

    @Override // Jd.InterfaceC0876c0
    public void a() {
        v().F0(this);
    }

    @Override // Jd.InterfaceC0905r0
    public boolean b() {
        return true;
    }

    @Override // Jd.InterfaceC0905r0
    public H0 d() {
        return null;
    }

    @Override // Od.C1087o
    public String toString() {
        return S.a(this) + '@' + S.b(this) + "[job@" + S.b(v()) + ']';
    }

    public final C0 v() {
        C0 c02 = this.f4975d;
        if (c02 != null) {
            return c02;
        }
        Intrinsics.v("job");
        return null;
    }

    public abstract boolean w();

    public abstract void x(Throwable th);

    public final void y(C0 c02) {
        this.f4975d = c02;
    }
}
