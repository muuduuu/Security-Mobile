package bd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final b f19027a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final d f19028b = new d(pd.e.BOOLEAN);

    /* renamed from: c, reason: collision with root package name */
    private static final d f19029c = new d(pd.e.CHAR);

    /* renamed from: d, reason: collision with root package name */
    private static final d f19030d = new d(pd.e.BYTE);

    /* renamed from: e, reason: collision with root package name */
    private static final d f19031e = new d(pd.e.SHORT);

    /* renamed from: f, reason: collision with root package name */
    private static final d f19032f = new d(pd.e.INT);

    /* renamed from: g, reason: collision with root package name */
    private static final d f19033g = new d(pd.e.FLOAT);

    /* renamed from: h, reason: collision with root package name */
    private static final d f19034h = new d(pd.e.LONG);

    /* renamed from: i, reason: collision with root package name */
    private static final d f19035i = new d(pd.e.DOUBLE);

    public static final class a extends o {

        /* renamed from: j, reason: collision with root package name */
        private final o f19036j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o elementType) {
            super(null);
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            this.f19036j = elementType;
        }

        public final o i() {
            return this.f19036j;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return o.f19028b;
        }

        public final d b() {
            return o.f19030d;
        }

        public final d c() {
            return o.f19029c;
        }

        public final d d() {
            return o.f19035i;
        }

        public final d e() {
            return o.f19033g;
        }

        public final d f() {
            return o.f19032f;
        }

        public final d g() {
            return o.f19034h;
        }

        public final d h() {
            return o.f19031e;
        }

        private b() {
        }
    }

    public static final class c extends o {

        /* renamed from: j, reason: collision with root package name */
        private final String f19037j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String internalName) {
            super(null);
            Intrinsics.checkNotNullParameter(internalName, "internalName");
            this.f19037j = internalName;
        }

        public final String i() {
            return this.f19037j;
        }
    }

    public static final class d extends o {

        /* renamed from: j, reason: collision with root package name */
        private final pd.e f19038j;

        public d(pd.e eVar) {
            super(null);
            this.f19038j = eVar;
        }

        public final pd.e i() {
            return this.f19038j;
        }
    }

    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        return q.f19039a.a(this);
    }

    private o() {
    }
}
