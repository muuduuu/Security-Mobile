package com.google.firebase;

import Jd.AbstractC0900o0;
import Jd.J;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import n8.InterfaceC3714a;
import n8.InterfaceC3715b;
import n8.InterfaceC3716c;
import o8.C3762D;
import o8.C3766c;
import o8.InterfaceC3767d;
import o8.g;
import o8.q;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", BuildConfig.FLAVOR, "Lo8/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27936a = new a();

        @Override // o8.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J a(InterfaceC3767d interfaceC3767d) {
            Object g10 = interfaceC3767d.g(C3762D.a(InterfaceC3714a.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(g10, "get(...)");
            return AbstractC0900o0.a((Executor) g10);
        }
    }

    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27937a = new b();

        @Override // o8.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J a(InterfaceC3767d interfaceC3767d) {
            Object g10 = interfaceC3767d.g(C3762D.a(InterfaceC3716c.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(g10, "get(...)");
            return AbstractC0900o0.a((Executor) g10);
        }
    }

    public static final class c implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final c f27938a = new c();

        @Override // o8.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J a(InterfaceC3767d interfaceC3767d) {
            Object g10 = interfaceC3767d.g(C3762D.a(InterfaceC3715b.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(g10, "get(...)");
            return AbstractC0900o0.a((Executor) g10);
        }
    }

    public static final class d implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final d f27939a = new d();

        @Override // o8.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J a(InterfaceC3767d interfaceC3767d) {
            Object g10 = interfaceC3767d.g(C3762D.a(n8.d.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(g10, "get(...)");
            return AbstractC0900o0.a((Executor) g10);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3766c> getComponents() {
        C3766c d10 = C3766c.e(C3762D.a(InterfaceC3714a.class, J.class)).b(q.k(C3762D.a(InterfaceC3714a.class, Executor.class))).f(a.f27936a).d();
        Intrinsics.checkNotNullExpressionValue(d10, "build(...)");
        C3766c d11 = C3766c.e(C3762D.a(InterfaceC3716c.class, J.class)).b(q.k(C3762D.a(InterfaceC3716c.class, Executor.class))).f(b.f27937a).d();
        Intrinsics.checkNotNullExpressionValue(d11, "build(...)");
        C3766c d12 = C3766c.e(C3762D.a(InterfaceC3715b.class, J.class)).b(q.k(C3762D.a(InterfaceC3715b.class, Executor.class))).f(c.f27938a).d();
        Intrinsics.checkNotNullExpressionValue(d12, "build(...)");
        C3766c d13 = C3766c.e(C3762D.a(n8.d.class, J.class)).b(q.k(C3762D.a(n8.d.class, Executor.class))).f(d.f27939a).d();
        Intrinsics.checkNotNullExpressionValue(d13, "build(...)");
        return CollectionsKt.m(d10, d11, d12, d13);
    }
}
