package Kc;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import od.AbstractC3778c;
import xc.C5142C;

/* loaded from: classes3.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0933e f5553a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f5554b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.g f5555c;

    /* renamed from: d, reason: collision with root package name */
    private final xd.i f5556d;

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.k[] f5552f = {C5142C.k(new xc.u(C5142C.b(Y.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: e, reason: collision with root package name */
    public static final a f5551e = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Y a(InterfaceC0933e classDescriptor, xd.n storageManager, kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefinerForOwnerModule, Function1 scopeFactory) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            Intrinsics.checkNotNullParameter(scopeFactory, "scopeFactory");
            return new Y(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }

        private a() {
        }
    }

    static final class b extends xc.m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.checker.g f5558b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
            super(0);
            this.f5558b = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rd.h invoke() {
            return (rd.h) Y.this.f5554b.invoke(this.f5558b);
        }
    }

    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rd.h invoke() {
            return (rd.h) Y.this.f5554b.invoke(Y.this.f5555c);
        }
    }

    public /* synthetic */ Y(InterfaceC0933e interfaceC0933e, xd.n nVar, Function1 function1, kotlin.reflect.jvm.internal.impl.types.checker.g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0933e, nVar, function1, gVar);
    }

    private final rd.h d() {
        return (rd.h) xd.m.a(this.f5556d, this, f5552f[0]);
    }

    public final rd.h c(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!kotlinTypeRefiner.d(AbstractC3778c.p(this.f5553a))) {
            return d();
        }
        yd.e0 r10 = this.f5553a.r();
        Intrinsics.checkNotNullExpressionValue(r10, "getTypeConstructor(...)");
        return !kotlinTypeRefiner.e(r10) ? d() : kotlinTypeRefiner.c(this.f5553a, new b(kotlinTypeRefiner));
    }

    private Y(InterfaceC0933e interfaceC0933e, xd.n nVar, Function1 function1, kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        this.f5553a = interfaceC0933e;
        this.f5554b = function1;
        this.f5555c = gVar;
        this.f5556d = nVar.d(new c());
    }
}
