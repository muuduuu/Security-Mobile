package Oc;

import Kc.b0;
import Pc.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements Yc.b {

    /* renamed from: a, reason: collision with root package name */
    public static final l f7296a = new l();

    public static final class a implements Yc.a {

        /* renamed from: b, reason: collision with root package name */
        private final p f7297b;

        public a(p javaElement) {
            Intrinsics.checkNotNullParameter(javaElement, "javaElement");
            this.f7297b = javaElement;
        }

        @Override // Kc.a0
        public b0 a() {
            b0 NO_SOURCE_FILE = b0.f5561a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
            return NO_SOURCE_FILE;
        }

        @Override // Yc.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public p b() {
            return this.f7297b;
        }

        public String toString() {
            return a.class.getName() + ": " + b();
        }
    }

    private l() {
    }

    @Override // Yc.b
    public Yc.a a(Zc.l javaElement) {
        Intrinsics.checkNotNullParameter(javaElement, "javaElement");
        return new a((p) javaElement);
    }
}
