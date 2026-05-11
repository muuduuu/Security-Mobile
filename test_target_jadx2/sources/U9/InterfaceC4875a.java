package u9;

import kotlin.jvm.internal.Intrinsics;
import v9.C4973b;
import v9.g;
import v9.i;
import w9.C5047a;

/* renamed from: u9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4875a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0623a f43586a = C0623a.f43587a;

    /* renamed from: u9.a$a, reason: collision with other inner class name */
    public static final class C0623a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0623a f43587a = new C0623a();

        private C0623a() {
        }

        public final InterfaceC4875a a() {
            InterfaceC4875a a10 = C5047a.f44363c.a();
            if (a10 != null) {
                return a10;
            }
            throw new IllegalStateException("Gobbler is not initialized properly. The most likely cause is that you forgot to call Gobbler#init in your Application#onCreate.");
        }

        public final void b(C4973b configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            C5047a.f44363c.b(configuration);
        }
    }

    /* renamed from: u9.a$b */
    public static final class b {
        public static /* synthetic */ void a(InterfaceC4875a interfaceC4875a, String str, byte[] bArr, g gVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
            }
            if ((i10 & 4) != 0) {
                gVar = g.EVENTS;
            }
            interfaceC4875a.e(str, bArr, gVar);
        }
    }

    void a();

    void b(String str);

    void c(i iVar);

    i d();

    void e(String str, byte[] bArr, g gVar);

    void logout();
}
