package Ec;

import Ec.y;
import Kc.U;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.l;

/* loaded from: classes3.dex */
public class v extends y implements kotlin.reflect.l {

    /* renamed from: o, reason: collision with root package name */
    private final Lazy f2120o;

    /* renamed from: p, reason: collision with root package name */
    private final Lazy f2121p;

    public static final class a extends y.c implements l.a {

        /* renamed from: j, reason: collision with root package name */
        private final v f2122j;

        public a(v property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f2122j = property;
        }

        @Override // kotlin.reflect.k.a
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public v u() {
            return this.f2122j;
        }

        @Override // kotlin.jvm.functions.Function0
        public Object invoke() {
            return u().get();
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return new a(v.this);
        }
    }

    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            v vVar = v.this;
            return vVar.U(vVar.S(), null, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(n container, U descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        lc.l lVar = lc.l.PUBLICATION;
        this.f2120o = lc.i.b(lVar, new b());
        this.f2121p = lc.i.b(lVar, new c());
    }

    @Override // kotlin.reflect.k
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public a d() {
        return (a) this.f2120o.getValue();
    }

    @Override // kotlin.reflect.l
    public Object get() {
        return d().h(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(n container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        lc.l lVar = lc.l.PUBLICATION;
        this.f2120o = lc.i.b(lVar, new b());
        this.f2121p = lc.i.b(lVar, new c());
    }
}
