package Mc;

import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0943o;
import Kc.a0;
import Kc.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import md.AbstractC3680g;
import yd.AbstractC5197E;
import yd.n0;

/* loaded from: classes3.dex */
public class L extends M implements j0 {

    /* renamed from: l, reason: collision with root package name */
    public static final a f6204l = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private final int f6205f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f6206g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f6207h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f6208i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC5197E f6209j;

    /* renamed from: k, reason: collision with root package name */
    private final j0 f6210k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final L a(InterfaceC0929a containingDeclaration, j0 j0Var, int i10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, id.f name, AbstractC5197E outType, boolean z10, boolean z11, boolean z12, AbstractC5197E abstractC5197E, a0 source, Function0 function0) {
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(outType, "outType");
            Intrinsics.checkNotNullParameter(source, "source");
            return function0 == null ? new L(containingDeclaration, j0Var, i10, annotations, name, outType, z10, z11, z12, abstractC5197E, source) : new b(containingDeclaration, j0Var, i10, annotations, name, outType, z10, z11, z12, abstractC5197E, source, function0);
        }

        private a() {
        }
    }

    public static final class b extends L {

        /* renamed from: m, reason: collision with root package name */
        private final Lazy f6211m;

        static final class a extends xc.m implements Function0 {
            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return b.this.W0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0929a containingDeclaration, j0 j0Var, int i10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, id.f name, AbstractC5197E outType, boolean z10, boolean z11, boolean z12, AbstractC5197E abstractC5197E, a0 source, Function0 destructuringVariables) {
            super(containingDeclaration, j0Var, i10, annotations, name, outType, z10, z11, z12, abstractC5197E, source);
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(outType, "outType");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(destructuringVariables, "destructuringVariables");
            this.f6211m = lc.i.a(destructuringVariables);
        }

        public final List W0() {
            return (List) this.f6211m.getValue();
        }

        @Override // Mc.L, Kc.j0
        public j0 k0(InterfaceC0929a newOwner, id.f newName, int i10) {
            Intrinsics.checkNotNullParameter(newOwner, "newOwner");
            Intrinsics.checkNotNullParameter(newName, "newName");
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i11 = i();
            Intrinsics.checkNotNullExpressionValue(i11, "<get-annotations>(...)");
            AbstractC5197E type = getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            boolean B02 = B0();
            boolean h02 = h0();
            boolean d02 = d0();
            AbstractC5197E r02 = r0();
            a0 NO_SOURCE = a0.f5560a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            return new b(newOwner, null, i10, i11, newName, type, B02, h02, d02, r02, NO_SOURCE, new a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(InterfaceC0929a containingDeclaration, j0 j0Var, int i10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, id.f name, AbstractC5197E outType, boolean z10, boolean z11, boolean z12, AbstractC5197E abstractC5197E, a0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(outType, "outType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f6205f = i10;
        this.f6206g = z10;
        this.f6207h = z11;
        this.f6208i = z12;
        this.f6209j = abstractC5197E;
        this.f6210k = j0Var == null ? this : j0Var;
    }

    public static final L T0(InterfaceC0929a interfaceC0929a, j0 j0Var, int i10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar, AbstractC5197E abstractC5197E, boolean z10, boolean z11, boolean z12, AbstractC5197E abstractC5197E2, a0 a0Var, Function0 function0) {
        return f6204l.a(interfaceC0929a, j0Var, i10, gVar, fVar, abstractC5197E, z10, z11, z12, abstractC5197E2, a0Var, function0);
    }

    @Override // Kc.j0
    public boolean B0() {
        if (this.f6206g) {
            InterfaceC0929a b10 = b();
            Intrinsics.e(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((InterfaceC0930b) b10).o().isReal()) {
                return true;
            }
        }
        return false;
    }

    public Void U0() {
        return null;
    }

    @Override // Kc.c0
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public j0 c(n0 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // Kc.k0
    public /* bridge */ /* synthetic */ AbstractC3680g c0() {
        return (AbstractC3680g) U0();
    }

    @Override // Kc.j0
    public boolean d0() {
        return this.f6208i;
    }

    @Override // Kc.InterfaceC0929a
    public Collection f() {
        Collection f10 = b().f();
        Intrinsics.checkNotNullExpressionValue(f10, "getOverriddenDescriptors(...)");
        Collection collection = f10;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((j0) ((InterfaceC0929a) it.next()).m().get(getIndex()));
        }
        return arrayList;
    }

    @Override // Kc.InterfaceC0941m
    public Object f0(InterfaceC0943o visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.e(this, obj);
    }

    @Override // Kc.j0
    public int getIndex() {
        return this.f6205f;
    }

    @Override // Kc.InterfaceC0945q, Kc.C
    public AbstractC0948u h() {
        AbstractC0948u LOCAL = AbstractC0947t.f5590f;
        Intrinsics.checkNotNullExpressionValue(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // Kc.j0
    public boolean h0() {
        return this.f6207h;
    }

    @Override // Kc.j0
    public j0 k0(InterfaceC0929a newOwner, id.f newName, int i10) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newName, "newName");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i11 = i();
        Intrinsics.checkNotNullExpressionValue(i11, "<get-annotations>(...)");
        AbstractC5197E type = getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        boolean B02 = B0();
        boolean h02 = h0();
        boolean d02 = d0();
        AbstractC5197E r02 = r0();
        a0 NO_SOURCE = a0.f5560a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return new L(newOwner, null, i10, i11, newName, type, B02, h02, d02, r02, NO_SOURCE);
    }

    @Override // Kc.k0
    public boolean q0() {
        return false;
    }

    @Override // Kc.j0
    public AbstractC5197E r0() {
        return this.f6209j;
    }

    @Override // Mc.AbstractC0985k, Kc.InterfaceC0941m
    public InterfaceC0929a b() {
        InterfaceC0941m b10 = super.b();
        Intrinsics.e(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC0929a) b10;
    }

    @Override // Mc.AbstractC0985k, Mc.AbstractC0984j, Kc.InterfaceC0941m
    public j0 a() {
        j0 j0Var = this.f6210k;
        return j0Var == this ? this : j0Var.a();
    }
}
