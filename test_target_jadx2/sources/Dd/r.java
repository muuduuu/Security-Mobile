package Dd;

import Dd.f;
import Kc.InterfaceC0952y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import yd.AbstractC5197E;
import yd.M;

/* loaded from: classes3.dex */
public abstract class r implements f {

    /* renamed from: a, reason: collision with root package name */
    private final String f1584a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f1585b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1586c;

    public static final class a extends r {

        /* renamed from: d, reason: collision with root package name */
        public static final a f1587d = new a();

        /* renamed from: Dd.r$a$a, reason: collision with other inner class name */
        static final class C0029a extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0029a f1588a = new C0029a();

            C0029a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC5197E invoke(Hc.g gVar) {
                Intrinsics.checkNotNullParameter(gVar, "$this$null");
                M n10 = gVar.n();
                Intrinsics.checkNotNullExpressionValue(n10, "getBooleanType(...)");
                return n10;
            }
        }

        private a() {
            super("Boolean", C0029a.f1588a, null);
        }
    }

    public static final class b extends r {

        /* renamed from: d, reason: collision with root package name */
        public static final b f1589d = new b();

        static final class a extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1590a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC5197E invoke(Hc.g gVar) {
                Intrinsics.checkNotNullParameter(gVar, "$this$null");
                M D10 = gVar.D();
                Intrinsics.checkNotNullExpressionValue(D10, "getIntType(...)");
                return D10;
            }
        }

        private b() {
            super("Int", a.f1590a, null);
        }
    }

    public static final class c extends r {

        /* renamed from: d, reason: collision with root package name */
        public static final c f1591d = new c();

        static final class a extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final a f1592a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC5197E invoke(Hc.g gVar) {
                Intrinsics.checkNotNullParameter(gVar, "$this$null");
                M Z10 = gVar.Z();
                Intrinsics.checkNotNullExpressionValue(Z10, "getUnitType(...)");
                return Z10;
            }
        }

        private c() {
            super("Unit", a.f1592a, null);
        }
    }

    public /* synthetic */ r(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }

    @Override // Dd.f
    public boolean a(InterfaceC0952y functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return Intrinsics.b(functionDescriptor.g(), this.f1585b.invoke(AbstractC3778c.j(functionDescriptor)));
    }

    @Override // Dd.f
    public String b(InterfaceC0952y interfaceC0952y) {
        return f.a.a(this, interfaceC0952y);
    }

    @Override // Dd.f
    public String getDescription() {
        return this.f1586c;
    }

    private r(String str, Function1 function1) {
        this.f1584a = str;
        this.f1585b = function1;
        this.f1586c = "must return " + str;
    }
}
