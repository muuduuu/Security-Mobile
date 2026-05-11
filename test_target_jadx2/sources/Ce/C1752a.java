package ce;

import Td.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC3879g;

/* renamed from: ce.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1752a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0352a f19469c = new C0352a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3879g f19470a;

    /* renamed from: b, reason: collision with root package name */
    private long f19471b;

    /* renamed from: ce.a$a, reason: collision with other inner class name */
    public static final class C0352a {
        public /* synthetic */ C0352a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0352a() {
        }
    }

    public C1752a(InterfaceC3879g source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f19470a = source;
        this.f19471b = 262144L;
    }

    public final v a() {
        v.a aVar = new v.a();
        while (true) {
            String b10 = b();
            if (b10.length() == 0) {
                return aVar.f();
            }
            aVar.c(b10);
        }
    }

    public final String b() {
        String F02 = this.f19470a.F0(this.f19471b);
        this.f19471b -= F02.length();
        return F02;
    }
}
