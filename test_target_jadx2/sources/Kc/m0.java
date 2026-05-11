package Kc;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f5570a = new m0();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f5571b;

    /* renamed from: c, reason: collision with root package name */
    private static final h f5572c;

    public static final class a extends n0 {

        /* renamed from: c, reason: collision with root package name */
        public static final a f5573c = new a();

        private a() {
            super("inherited", false);
        }
    }

    public static final class b extends n0 {

        /* renamed from: c, reason: collision with root package name */
        public static final b f5574c = new b();

        private b() {
            super("internal", false);
        }
    }

    public static final class c extends n0 {

        /* renamed from: c, reason: collision with root package name */
        public static final c f5575c = new c();

        private c() {
            super("invisible_fake", false);
        }
    }

    public static final class d extends n0 {

        /* renamed from: c, reason: collision with root package name */
        public static final d f5576c = new d();

        private d() {
            super("local", false);
        }
    }

    public static final class e extends n0 {

        /* renamed from: c, reason: collision with root package name */
        public static final e f5577c = new e();

        private e() {
            super("private", false);
        }
    }

    public static final class f extends n0 {

        /* renamed from: c, reason: collision with root package name */
        public static final f f5578c = new f();

        private f() {
            super("private_to_this", false);
        }

        @Override // Kc.n0
        public String b() {
            return "private/*private to this*/";
        }
    }

    public static final class g extends n0 {

        /* renamed from: c, reason: collision with root package name */
        public static final g f5579c = new g();

        private g() {
            super("protected", true);
        }
    }

    public static final class h extends n0 {

        /* renamed from: c, reason: collision with root package name */
        public static final h f5580c = new h();

        private h() {
            super("public", true);
        }
    }

    public static final class i extends n0 {

        /* renamed from: c, reason: collision with root package name */
        public static final i f5581c = new i();

        private i() {
            super("unknown", false);
        }
    }

    static {
        Map c10 = kotlin.collections.G.c();
        c10.put(f.f5578c, 0);
        c10.put(e.f5577c, 0);
        c10.put(b.f5574c, 1);
        c10.put(g.f5579c, 1);
        h hVar = h.f5580c;
        c10.put(hVar, 2);
        f5571b = kotlin.collections.G.b(c10);
        f5572c = hVar;
    }

    private m0() {
    }

    public final Integer a(n0 first, n0 second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first == second) {
            return 0;
        }
        Map map = f5571b;
        Integer num = (Integer) map.get(first);
        Integer num2 = (Integer) map.get(second);
        if (num == null || num2 == null || Intrinsics.b(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(n0 visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return visibility == e.f5577c || visibility == f.f5578c;
    }
}
