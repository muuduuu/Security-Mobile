package e;

import f.C3133h;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3065g {

    /* renamed from: a, reason: collision with root package name */
    private C3133h.e f32116a = C3133h.b.f32778a;

    /* renamed from: e.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private C3133h.e f32117a = C3133h.b.f32778a;

        public final C3065g a() {
            C3065g c3065g = new C3065g();
            c3065g.b(this.f32117a);
            return c3065g;
        }

        public final a b(C3133h.e mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            this.f32117a = mediaType;
            return this;
        }
    }

    public final C3133h.e a() {
        return this.f32116a;
    }

    public final void b(C3133h.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f32116a = eVar;
    }
}
