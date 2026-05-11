package Ec;

import Ec.AbstractC0829h;
import Kc.AbstractC0947t;
import Kc.InterfaceC0941m;
import Kc.U;
import dd.C3026c;
import dd.C3037n;
import gd.AbstractC3218a;
import hd.d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import org.conscrypt.BuildConfig;
import wd.C5072d;
import wd.C5078j;
import wd.InterfaceC5074f;

/* renamed from: Ec.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0830i {

    /* renamed from: Ec.i$a */
    public static final class a extends AbstractC0830i {

        /* renamed from: a, reason: collision with root package name */
        private final Field f1982a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            Intrinsics.checkNotNullParameter(field, "field");
            this.f1982a = field;
        }

        @Override // Ec.AbstractC0830i
        public String a() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.f1982a.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            sb2.append(Sc.A.b(name));
            sb2.append("()");
            Class<?> type = this.f1982a.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(Pc.d.b(type));
            return sb2.toString();
        }

        public final Field b() {
            return this.f1982a;
        }
    }

    /* renamed from: Ec.i$b */
    public static final class b extends AbstractC0830i {

        /* renamed from: a, reason: collision with root package name */
        private final Method f1983a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f1984b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method getterMethod, Method method) {
            super(null);
            Intrinsics.checkNotNullParameter(getterMethod, "getterMethod");
            this.f1983a = getterMethod;
            this.f1984b = method;
        }

        @Override // Ec.AbstractC0830i
        public String a() {
            String b10;
            b10 = J.b(this.f1983a);
            return b10;
        }

        public final Method b() {
            return this.f1983a;
        }

        public final Method c() {
            return this.f1984b;
        }
    }

    /* renamed from: Ec.i$c */
    public static final class c extends AbstractC0830i {

        /* renamed from: a, reason: collision with root package name */
        private final U f1985a;

        /* renamed from: b, reason: collision with root package name */
        private final C3037n f1986b;

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC3218a.d f1987c;

        /* renamed from: d, reason: collision with root package name */
        private final fd.c f1988d;

        /* renamed from: e, reason: collision with root package name */
        private final fd.g f1989e;

        /* renamed from: f, reason: collision with root package name */
        private final String f1990f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(U descriptor, C3037n proto, AbstractC3218a.d signature, fd.c nameResolver, fd.g typeTable) {
            super(null);
            String str;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(proto, "proto");
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.f1985a = descriptor;
            this.f1986b = proto;
            this.f1987c = signature;
            this.f1988d = nameResolver;
            this.f1989e = typeTable;
            if (signature.D()) {
                str = nameResolver.getString(signature.y().u()) + nameResolver.getString(signature.y().t());
            } else {
                d.a d10 = hd.i.d(hd.i.f34080a, proto, nameResolver, typeTable, false, 8, null);
                if (d10 == null) {
                    throw new D("No field signature for property: " + descriptor);
                }
                String d11 = d10.d();
                str = Sc.A.b(d11) + c() + "()" + d10.e();
            }
            this.f1990f = str;
        }

        private final String c() {
            String str;
            InterfaceC0941m b10 = this.f1985a.b();
            Intrinsics.checkNotNullExpressionValue(b10, "getContainingDeclaration(...)");
            if (Intrinsics.b(this.f1985a.h(), AbstractC0947t.f5588d) && (b10 instanceof C5072d)) {
                C3026c j12 = ((C5072d) b10).j1();
                i.f classModuleName = AbstractC3218a.f33682i;
                Intrinsics.checkNotNullExpressionValue(classModuleName, "classModuleName");
                Integer num = (Integer) fd.e.a(j12, classModuleName);
                if (num == null || (str = this.f1988d.getString(num.intValue())) == null) {
                    str = "main";
                }
                return '$' + id.g.b(str);
            }
            if (!Intrinsics.b(this.f1985a.h(), AbstractC0947t.f5585a) || !(b10 instanceof Kc.K)) {
                return BuildConfig.FLAVOR;
            }
            U u10 = this.f1985a;
            Intrinsics.e(u10, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            InterfaceC5074f i02 = ((C5078j) u10).i0();
            if (!(i02 instanceof bd.n)) {
                return BuildConfig.FLAVOR;
            }
            bd.n nVar = (bd.n) i02;
            if (nVar.f() == null) {
                return BuildConfig.FLAVOR;
            }
            return '$' + nVar.h().c();
        }

        @Override // Ec.AbstractC0830i
        public String a() {
            return this.f1990f;
        }

        public final U b() {
            return this.f1985a;
        }

        public final fd.c d() {
            return this.f1988d;
        }

        public final C3037n e() {
            return this.f1986b;
        }

        public final AbstractC3218a.d f() {
            return this.f1987c;
        }

        public final fd.g g() {
            return this.f1989e;
        }
    }

    /* renamed from: Ec.i$d */
    public static final class d extends AbstractC0830i {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC0829h.e f1991a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC0829h.e f1992b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC0829h.e getterSignature, AbstractC0829h.e eVar) {
            super(null);
            Intrinsics.checkNotNullParameter(getterSignature, "getterSignature");
            this.f1991a = getterSignature;
            this.f1992b = eVar;
        }

        @Override // Ec.AbstractC0830i
        public String a() {
            return this.f1991a.a();
        }

        public final AbstractC0829h.e b() {
            return this.f1991a;
        }

        public final AbstractC0829h.e c() {
            return this.f1992b;
        }
    }

    public /* synthetic */ AbstractC0830i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private AbstractC0830i() {
    }
}
