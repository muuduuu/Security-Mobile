package Mc;

import Kc.P;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface A {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6140a = a.f6141a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f6141a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Kc.F f6142b = new Kc.F("PackageViewDescriptorFactory");

        private a() {
        }

        public final Kc.F a() {
            return f6142b;
        }
    }

    public static final class b implements A {

        /* renamed from: b, reason: collision with root package name */
        public static final b f6143b = new b();

        private b() {
        }

        @Override // Mc.A
        public P a(x module, id.c fqName, xd.n storageManager) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            return new r(module, fqName, storageManager);
        }
    }

    P a(x xVar, id.c cVar, xd.n nVar);
}
