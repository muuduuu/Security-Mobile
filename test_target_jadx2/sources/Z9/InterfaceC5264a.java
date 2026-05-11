package z9;

import android.content.Context;
import com.google.gson.e;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import v9.C4973b;
import v9.C4974c;
import v9.GobblerConfig;
import v9.i;

/* renamed from: z9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC5264a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0676a f45781a = C0676a.f45782a;

    /* renamed from: z9.a$a, reason: collision with other inner class name */
    public static final class C0676a {

        /* renamed from: b, reason: collision with root package name */
        private static volatile InterfaceC5264a f45783b;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0676a f45782a = new C0676a();

        /* renamed from: c, reason: collision with root package name */
        private static final Object f45784c = new Object();

        private C0676a() {
        }

        public final InterfaceC5264a a() {
            InterfaceC5264a interfaceC5264a;
            InterfaceC5264a interfaceC5264a2 = f45783b;
            if (interfaceC5264a2 != null) {
                return interfaceC5264a2;
            }
            synchronized (f45784c) {
                interfaceC5264a = f45783b;
                if (interfaceC5264a == null) {
                    throw new IllegalArgumentException("GobblerDependencyProvider is not initialized yet, See GobblerDependencyProvider#init()");
                }
            }
            return interfaceC5264a;
        }

        public final void b(Context context, e gson, C4973b configuration) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(gson, "gson");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            synchronized (f45784c) {
                if (f45783b != null) {
                    throw new IllegalStateException("GobblerDependencyProvider is already initialized. If you want to re-initialize it with new Configuration, please call GobblerDependencyProvider#release() first.");
                }
                f45782a.d(new C5265b(context, gson, configuration));
                Unit unit = Unit.f36324a;
            }
        }

        public final void c() {
            f45783b = null;
        }

        public final void d(InterfaceC5264a serviceProvider) {
            Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
            f45783b = serviceProvider;
        }
    }

    void a(int i10);

    void b(String str);

    void c(i iVar);

    i d();

    E9.a e();

    int f();

    C4974c g();

    A9.a h();

    GobblerConfig i();

    C4973b j();

    String k();
}
