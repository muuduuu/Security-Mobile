package kotlin.reflect.jvm.internal.impl.types.error;

import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.D;
import Kc.InterfaceC0929a;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0952y;
import Kc.X;
import Kc.Z;
import Kc.a0;
import Mc.G;
import Mc.p;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;
import yd.l0;

/* loaded from: classes3.dex */
public final class c extends G {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC0933e containingDeclaration) {
        super(containingDeclaration, null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f36445g0.b(), id.f.r(b.ERROR_FUNCTION.getDebugText()), InterfaceC0930b.a.DECLARATION, a0.f5560a);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        a1(null, null, CollectionsKt.j(), CollectionsKt.j(), CollectionsKt.j(), k.d(j.RETURN_TYPE_FOR_FUNCTION, new String[0]), D.OPEN, AbstractC0947t.f5589e);
    }

    @Override // Mc.G, Mc.p, Kc.InterfaceC0952y
    public InterfaceC0952y.a A() {
        return new a();
    }

    @Override // Mc.p, Kc.InterfaceC0929a
    public Object A0(InterfaceC0929a.InterfaceC0107a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Override // Mc.p, Kc.InterfaceC0930b
    public void F0(Collection overriddenDescriptors) {
        Intrinsics.checkNotNullParameter(overriddenDescriptors, "overriddenDescriptors");
    }

    @Override // Mc.G, Mc.p
    protected p U0(InterfaceC0941m newOwner, InterfaceC0952y interfaceC0952y, InterfaceC0930b.a kind, id.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations, a0 source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        return this;
    }

    @Override // Mc.G, Kc.InterfaceC0930b
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public Z o0(InterfaceC0941m newOwner, D modality, AbstractC0948u visibility, InterfaceC0930b.a kind, boolean z10) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(modality, "modality");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return this;
    }

    @Override // Mc.p, Kc.InterfaceC0952y
    public boolean z() {
        return false;
    }

    public static final class a implements InterfaceC0952y.a {
        a() {
        }

        @Override // Kc.InterfaceC0952y.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Z c() {
            return c.this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a e(List parameters) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a f(InterfaceC0941m owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a i(AbstractC0948u visibility) {
            Intrinsics.checkNotNullParameter(visibility, "visibility");
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a j(id.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a k(D modality) {
            Intrinsics.checkNotNullParameter(modality, "modality");
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a o(List parameters) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a p(InterfaceC0930b.a kind) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a r(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g additionalAnnotations) {
            Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a t(InterfaceC0929a.InterfaceC0107a userDataKey, Object obj) {
            Intrinsics.checkNotNullParameter(userDataKey, "userDataKey");
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a u(l0 substitution) {
            Intrinsics.checkNotNullParameter(substitution, "substitution");
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a v(AbstractC5197E type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a d() {
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a h() {
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a l() {
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a q() {
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a w() {
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a g(InterfaceC0930b interfaceC0930b) {
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a m(boolean z10) {
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a n(X x10) {
            return this;
        }

        @Override // Kc.InterfaceC0952y.a
        public InterfaceC0952y.a s(X x10) {
            return this;
        }
    }
}
