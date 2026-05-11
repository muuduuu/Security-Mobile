package Ec;

import Ec.y;
import Kc.U;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;

/* loaded from: classes3.dex */
public class w extends y implements kotlin.reflect.m {

    /* renamed from: o, reason: collision with root package name */
    private final Lazy f2125o;

    /* renamed from: p, reason: collision with root package name */
    private final Lazy f2126p;

    public static final class a extends y.c implements m.a {

        /* renamed from: j, reason: collision with root package name */
        private final w f2127j;

        public a(w property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f2127j = property;
        }

        @Override // kotlin.reflect.k.a
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public w u() {
            return this.f2127j;
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            return u().get(obj);
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return new a(w.this);
        }
    }

    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Member invoke() {
            return w.this.S();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(n container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        lc.l lVar = lc.l.PUBLICATION;
        this.f2125o = lc.i.b(lVar, new b());
        this.f2126p = lc.i.b(lVar, new c());
    }

    @Override // kotlin.reflect.k
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public a d() {
        return (a) this.f2125o.getValue();
    }

    @Override // kotlin.reflect.m
    public Object get(Object obj) {
        return d().h(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(n container, U descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        lc.l lVar = lc.l.PUBLICATION;
        this.f2125o = lc.i.b(lVar, new b());
        this.f2126p = lc.i.b(lVar, new c());
    }
}
