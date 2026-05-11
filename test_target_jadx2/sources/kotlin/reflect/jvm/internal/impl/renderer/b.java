package kotlin.reflect.jvm.internal.impl.renderer;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.K;
import Kc.f0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36575a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.b
        public String a(InterfaceC0936h classifier, kotlin.reflect.jvm.internal.impl.renderer.c renderer) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            if (classifier instanceof f0) {
                id.f name = ((f0) classifier).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return renderer.v(name, false);
            }
            id.d m10 = kd.f.m(classifier);
            Intrinsics.checkNotNullExpressionValue(m10, "getFqName(...)");
            return renderer.u(m10);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.b$b, reason: collision with other inner class name */
    public static final class C0535b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0535b f36576a = new C0535b();

        private C0535b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [Kc.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v1, types: [Kc.I, Kc.m] */
        /* JADX WARN: Type inference failed for: r2v2, types: [Kc.m] */
        @Override // kotlin.reflect.jvm.internal.impl.renderer.b
        public String a(InterfaceC0936h classifier, kotlin.reflect.jvm.internal.impl.renderer.c renderer) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            if (classifier instanceof f0) {
                id.f name = ((f0) classifier).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return renderer.v(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifier.getName());
                classifier = classifier.b();
            } while (classifier instanceof InterfaceC0933e);
            return n.c(CollectionsKt.N(arrayList));
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f36577a = new c();

        private c() {
        }

        private final String b(InterfaceC0936h interfaceC0936h) {
            id.f name = interfaceC0936h.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String b10 = n.b(name);
            if (interfaceC0936h instanceof f0) {
                return b10;
            }
            InterfaceC0941m b11 = interfaceC0936h.b();
            Intrinsics.checkNotNullExpressionValue(b11, "getContainingDeclaration(...)");
            String c10 = c(b11);
            if (c10 == null || Intrinsics.b(c10, BuildConfig.FLAVOR)) {
                return b10;
            }
            return c10 + '.' + b10;
        }

        private final String c(InterfaceC0941m interfaceC0941m) {
            if (interfaceC0941m instanceof InterfaceC0933e) {
                return b((InterfaceC0936h) interfaceC0941m);
            }
            if (!(interfaceC0941m instanceof K)) {
                return null;
            }
            id.d j10 = ((K) interfaceC0941m).e().j();
            Intrinsics.checkNotNullExpressionValue(j10, "toUnsafe(...)");
            return n.a(j10);
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.b
        public String a(InterfaceC0936h classifier, kotlin.reflect.jvm.internal.impl.renderer.c renderer) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            return b(classifier);
        }
    }

    String a(InterfaceC0936h interfaceC0936h, kotlin.reflect.jvm.internal.impl.renderer.c cVar);
}
