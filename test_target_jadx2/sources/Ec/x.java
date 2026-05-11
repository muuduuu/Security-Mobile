package Ec;

import Ec.y;
import Kc.U;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.n;
import xc.AbstractC5150c;

/* loaded from: classes3.dex */
public class x extends y implements kotlin.reflect.n {

    /* renamed from: o, reason: collision with root package name */
    private final Lazy f2130o;

    /* renamed from: p, reason: collision with root package name */
    private final Lazy f2131p;

    public static final class a extends y.c implements n.a {

        /* renamed from: j, reason: collision with root package name */
        private final x f2132j;

        public a(x property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f2132j = property;
        }

        @Override // kotlin.reflect.k.a
        /* renamed from: V, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public x u() {
            return this.f2132j;
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(Object obj, Object obj2) {
            return T().B(obj, obj2);
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return new a(x.this);
        }
    }

    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Member invoke() {
            return x.this.S();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(n container, String name, String signature) {
        super(container, name, signature, AbstractC5150c.f44978g);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        lc.l lVar = lc.l.PUBLICATION;
        this.f2130o = lc.i.b(lVar, new b());
        this.f2131p = lc.i.b(lVar, new c());
    }

    @Override // kotlin.reflect.n
    public Object B(Object obj, Object obj2) {
        return W().h(obj, obj2);
    }

    @Override // kotlin.reflect.k
    /* renamed from: Z, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a d() {
        return (a) this.f2130o.getValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return B(obj, obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(n container, U descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        lc.l lVar = lc.l.PUBLICATION;
        this.f2130o = lc.i.b(lVar, new b());
        this.f2131p = lc.i.b(lVar, new c());
    }
}
