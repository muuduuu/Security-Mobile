package Mc;

import Kc.AbstractC0948u;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.X;
import Kc.a0;
import Kc.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd.AbstractC3565e;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sd.InterfaceC4518f;
import sd.InterfaceC4519g;
import xc.C5142C;
import yd.AbstractC5194B;
import yd.AbstractC5197E;
import yd.Q;
import yd.n0;
import yd.u0;

/* loaded from: classes3.dex */
public final class J extends p implements I {

    /* renamed from: E, reason: collision with root package name */
    private final xd.n f6195E;

    /* renamed from: F, reason: collision with root package name */
    private final e0 f6196F;

    /* renamed from: G, reason: collision with root package name */
    private final xd.j f6197G;

    /* renamed from: H, reason: collision with root package name */
    private InterfaceC0932d f6198H;

    /* renamed from: J, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f6194J = {C5142C.k(new xc.u(C5142C.b(J.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: I, reason: collision with root package name */
    public static final a f6193I = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final n0 c(e0 e0Var) {
            if (e0Var.x() == null) {
                return null;
            }
            return n0.f(e0Var.b0());
        }

        public final I b(xd.n storageManager, e0 typeAliasDescriptor, InterfaceC0932d constructor) {
            InterfaceC0932d c10;
            List j10;
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            n0 c11 = c(typeAliasDescriptor);
            if (c11 == null || (c10 = constructor.c(c11)) == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i10 = constructor.i();
            InterfaceC0930b.a o10 = constructor.o();
            Intrinsics.checkNotNullExpressionValue(o10, "getKind(...)");
            a0 j11 = typeAliasDescriptor.j();
            Intrinsics.checkNotNullExpressionValue(j11, "getSource(...)");
            J j12 = new J(storageManager, typeAliasDescriptor, c10, null, i10, o10, j11, null);
            List X02 = p.X0(j12, constructor.m(), c11);
            if (X02 == null) {
                return null;
            }
            yd.M c12 = AbstractC5194B.c(c10.g().Z0());
            yd.M y10 = typeAliasDescriptor.y();
            Intrinsics.checkNotNullExpressionValue(y10, "getDefaultType(...)");
            yd.M j13 = Q.j(c12, y10);
            X l02 = constructor.l0();
            X i11 = l02 != null ? AbstractC3565e.i(j12, c11.n(l02.getType(), u0.INVARIANT), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b()) : null;
            InterfaceC0933e x10 = typeAliasDescriptor.x();
            if (x10 != null) {
                List x02 = constructor.x0();
                Intrinsics.checkNotNullExpressionValue(x02, "getContextReceiverParameters(...)");
                List list = x02;
                j10 = new ArrayList(CollectionsKt.u(list, 10));
                int i12 = 0;
                for (Object obj : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt.t();
                    }
                    X x11 = (X) obj;
                    AbstractC5197E n10 = c11.n(x11.getType(), u0.INVARIANT);
                    InterfaceC4519g value = x11.getValue();
                    Intrinsics.e(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    j10.add(AbstractC3565e.c(x10, n10, ((InterfaceC4518f) value).a(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), i12));
                    i12 = i13;
                }
            } else {
                j10 = CollectionsKt.j();
            }
            j12.a1(i11, null, j10, typeAliasDescriptor.B(), X02, j13, Kc.D.FINAL, typeAliasDescriptor.h());
            return j12;
        }

        private a() {
        }
    }

    static final class b extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0932d f6200b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC0932d interfaceC0932d) {
            super(0);
            this.f6200b = interfaceC0932d;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J invoke() {
            xd.n n02 = J.this.n0();
            e0 x12 = J.this.x1();
            InterfaceC0932d interfaceC0932d = this.f6200b;
            J j10 = J.this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i10 = interfaceC0932d.i();
            InterfaceC0930b.a o10 = this.f6200b.o();
            Intrinsics.checkNotNullExpressionValue(o10, "getKind(...)");
            a0 j11 = J.this.x1().j();
            Intrinsics.checkNotNullExpressionValue(j11, "getSource(...)");
            J j12 = new J(n02, x12, interfaceC0932d, j10, i10, o10, j11, null);
            J j13 = J.this;
            InterfaceC0932d interfaceC0932d2 = this.f6200b;
            n0 c10 = J.f6193I.c(j13.x1());
            if (c10 == null) {
                return null;
            }
            X l02 = interfaceC0932d2.l0();
            X c11 = l02 != null ? l02.c(c10) : null;
            List x02 = interfaceC0932d2.x0();
            Intrinsics.checkNotNullExpressionValue(x02, "getContextReceiverParameters(...)");
            List list = x02;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((X) it.next()).c(c10));
            }
            j12.a1(null, c11, arrayList, j13.x1().B(), j13.m(), j13.g(), Kc.D.FINAL, j13.x1().h());
            return j12;
        }
    }

    public /* synthetic */ J(xd.n nVar, e0 e0Var, InterfaceC0932d interfaceC0932d, I i10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, InterfaceC0930b.a aVar, a0 a0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, e0Var, interfaceC0932d, i10, gVar, aVar, a0Var);
    }

    @Override // Kc.InterfaceC0940l
    public boolean H() {
        return v0().H();
    }

    @Override // Kc.InterfaceC0940l
    public InterfaceC0933e I() {
        InterfaceC0933e I10 = v0().I();
        Intrinsics.checkNotNullExpressionValue(I10, "getConstructedClass(...)");
        return I10;
    }

    @Override // Mc.p, Kc.InterfaceC0929a
    public AbstractC5197E g() {
        AbstractC5197E g10 = super.g();
        Intrinsics.d(g10);
        return g10;
    }

    public final xd.n n0() {
        return this.f6195E;
    }

    @Override // Kc.InterfaceC0930b
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public I o0(InterfaceC0941m newOwner, Kc.D modality, AbstractC0948u visibility, InterfaceC0930b.a kind, boolean z10) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(modality, "modality");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(kind, "kind");
        InterfaceC0952y c10 = A().f(newOwner).k(modality).i(visibility).p(kind).m(z10).c();
        Intrinsics.e(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (I) c10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mc.p
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public J U0(InterfaceC0941m newOwner, InterfaceC0952y interfaceC0952y, InterfaceC0930b.a kind, id.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, a0 source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        InterfaceC0930b.a aVar = InterfaceC0930b.a.DECLARATION;
        if (kind != aVar) {
            InterfaceC0930b.a aVar2 = InterfaceC0930b.a.SYNTHESIZED;
        }
        return new J(this.f6195E, x1(), v0(), this, annotations, aVar, source);
    }

    @Override // Mc.I
    public InterfaceC0932d v0() {
        return this.f6198H;
    }

    @Override // Mc.AbstractC0985k, Kc.InterfaceC0941m
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public e0 b() {
        return x1();
    }

    @Override // Mc.p, Mc.AbstractC0985k, Mc.AbstractC0984j, Kc.InterfaceC0941m
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public I a() {
        InterfaceC0952y a10 = super.a();
        Intrinsics.e(a10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (I) a10;
    }

    public e0 x1() {
        return this.f6196F;
    }

    @Override // Mc.p, Kc.InterfaceC0952y, Kc.c0
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public I c(n0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        InterfaceC0952y c10 = super.c(substitutor);
        Intrinsics.e(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        J j10 = (J) c10;
        n0 f10 = n0.f(j10.g());
        Intrinsics.checkNotNullExpressionValue(f10, "create(...)");
        InterfaceC0932d c11 = v0().a().c(f10);
        if (c11 == null) {
            return null;
        }
        j10.f6198H = c11;
        return j10;
    }

    private J(xd.n nVar, e0 e0Var, InterfaceC0932d interfaceC0932d, I i10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, InterfaceC0930b.a aVar, a0 a0Var) {
        super(e0Var, i10, gVar, id.h.f34202i, aVar, a0Var);
        this.f6195E = nVar;
        this.f6196F = e0Var;
        e1(x1().M0());
        this.f6197G = nVar.f(new b(interfaceC0932d));
        this.f6198H = interfaceC0932d;
    }
}
