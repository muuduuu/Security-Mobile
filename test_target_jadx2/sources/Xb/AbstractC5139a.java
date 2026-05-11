package xb;

import android.os.Bundle;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lc.i;
import pb.C3862a;
import pb.r;
import vb.InterfaceC5007b;
import xc.m;
import zb.InterfaceC5270a;

/* renamed from: xb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5139a implements InterfaceC5270a {

    /* renamed from: a, reason: collision with root package name */
    private r f44939a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f44940b = i.a(new C0657a());

    /* renamed from: c, reason: collision with root package name */
    public Lazy f44941c;

    /* renamed from: xb.a$a, reason: collision with other inner class name */
    static final class C0657a extends m implements Function0 {
        C0657a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5007b invoke() {
            return AbstractC5139a.this.a().d(AbstractC5139a.this);
        }
    }

    private final InterfaceC5007b c() {
        return (InterfaceC5007b) this.f44940b.getValue();
    }

    @Override // zb.InterfaceC5270a
    public C3862a a() {
        r rVar = this.f44939a;
        C3862a b10 = rVar != null ? rVar.b() : null;
        if (b10 != null) {
            return b10;
        }
        throw new IllegalArgumentException("You attempted to access the app context before the module was created. Defer accessing the context until after the module initializes.");
    }

    public abstract c b();

    public final r d() {
        r rVar = this.f44939a;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalArgumentException("The module wasn't created! You can't access the runtime context.");
    }

    public final r e() {
        return this.f44939a;
    }

    public final void f(String name, Bundle bundle) {
        Intrinsics.checkNotNullParameter(name, "name");
        InterfaceC5007b c10 = c();
        if (c10 != null) {
            c10.b(name, bundle);
        }
    }

    public final void g(Lazy lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<set-?>");
        this.f44941c = lazy;
    }

    public final void h(r rVar) {
        this.f44939a = rVar;
    }
}
