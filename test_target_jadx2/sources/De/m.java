package De;

import Jd.C0874b0;
import Jd.C0899o;
import Jd.InterfaceC0895m;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public abstract class m {

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0818b f1668a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0818b interfaceC0818b) {
            super(1);
            this.f1668a = interfaceC0818b;
        }

        public final void a(Throwable th) {
            this.f1668a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f36324a;
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0818b f1669a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC0818b interfaceC0818b) {
            super(1);
            this.f1669a = interfaceC0818b;
        }

        public final void a(Throwable th) {
            this.f1669a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f36324a;
        }
    }

    public static final class c implements InterfaceC0820d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0895m f1670a;

        c(InterfaceC0895m interfaceC0895m) {
            this.f1670a = interfaceC0895m;
        }

        @Override // De.InterfaceC0820d
        public void onFailure(InterfaceC0818b call, Throwable t10) {
            Intrinsics.f(call, "call");
            Intrinsics.f(t10, "t");
            InterfaceC0895m interfaceC0895m = this.f1670a;
            o.a aVar = lc.o.f37128b;
            interfaceC0895m.resumeWith(lc.o.b(lc.p.a(t10)));
        }

        @Override // De.InterfaceC0820d
        public void onResponse(InterfaceC0818b call, z response) {
            Intrinsics.f(call, "call");
            Intrinsics.f(response, "response");
            if (!response.f()) {
                InterfaceC0895m interfaceC0895m = this.f1670a;
                j jVar = new j(response);
                o.a aVar = lc.o.f37128b;
                interfaceC0895m.resumeWith(lc.o.b(lc.p.a(jVar)));
                return;
            }
            Object a10 = response.a();
            if (a10 != null) {
                this.f1670a.resumeWith(lc.o.b(a10));
                return;
            }
            Object l10 = call.t().l(l.class);
            if (l10 == null) {
                Intrinsics.p();
            }
            Intrinsics.c(l10, "call.request().tag(Invocation::class.java)!!");
            Method method = ((l) l10).a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Response from ");
            Intrinsics.c(method, "method");
            Class<?> declaringClass = method.getDeclaringClass();
            Intrinsics.c(declaringClass, "method.declaringClass");
            sb2.append(declaringClass.getName());
            sb2.append('.');
            sb2.append(method.getName());
            sb2.append(" was null but response body type was declared as non-null");
            lc.f fVar = new lc.f(sb2.toString());
            InterfaceC0895m interfaceC0895m2 = this.f1670a;
            o.a aVar2 = lc.o.f37128b;
            interfaceC0895m2.resumeWith(lc.o.b(lc.p.a(fVar)));
        }
    }

    public static final class d implements InterfaceC0820d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0895m f1671a;

        d(InterfaceC0895m interfaceC0895m) {
            this.f1671a = interfaceC0895m;
        }

        @Override // De.InterfaceC0820d
        public void onFailure(InterfaceC0818b call, Throwable t10) {
            Intrinsics.f(call, "call");
            Intrinsics.f(t10, "t");
            InterfaceC0895m interfaceC0895m = this.f1671a;
            o.a aVar = lc.o.f37128b;
            interfaceC0895m.resumeWith(lc.o.b(lc.p.a(t10)));
        }

        @Override // De.InterfaceC0820d
        public void onResponse(InterfaceC0818b call, z response) {
            Intrinsics.f(call, "call");
            Intrinsics.f(response, "response");
            if (response.f()) {
                this.f1671a.resumeWith(lc.o.b(response.a()));
                return;
            }
            InterfaceC0895m interfaceC0895m = this.f1671a;
            j jVar = new j(response);
            o.a aVar = lc.o.f37128b;
            interfaceC0895m.resumeWith(lc.o.b(lc.p.a(jVar)));
        }
    }

    static final class e extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0818b f1672a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(InterfaceC0818b interfaceC0818b) {
            super(1);
            this.f1672a = interfaceC0818b;
        }

        public final void a(Throwable th) {
            this.f1672a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f36324a;
        }
    }

    public static final class f implements InterfaceC0820d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0895m f1673a;

        f(InterfaceC0895m interfaceC0895m) {
            this.f1673a = interfaceC0895m;
        }

        @Override // De.InterfaceC0820d
        public void onFailure(InterfaceC0818b call, Throwable t10) {
            Intrinsics.f(call, "call");
            Intrinsics.f(t10, "t");
            InterfaceC0895m interfaceC0895m = this.f1673a;
            o.a aVar = lc.o.f37128b;
            interfaceC0895m.resumeWith(lc.o.b(lc.p.a(t10)));
        }

        @Override // De.InterfaceC0820d
        public void onResponse(InterfaceC0818b call, z response) {
            Intrinsics.f(call, "call");
            Intrinsics.f(response, "response");
            this.f1673a.resumeWith(lc.o.b(response));
        }
    }

    static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f1674a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Exception f1675b;

        g(kotlin.coroutines.d dVar, Exception exc) {
            this.f1674a = dVar;
            this.f1675b = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            kotlin.coroutines.d c10 = AbstractC3868b.c(this.f1674a);
            Exception exc = this.f1675b;
            o.a aVar = lc.o.f37128b;
            c10.resumeWith(lc.o.b(lc.p.a(exc)));
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f1676a;

        /* renamed from: b, reason: collision with root package name */
        int f1677b;

        /* renamed from: c, reason: collision with root package name */
        Object f1678c;

        h(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1676a = obj;
            this.f1677b |= Integer.MIN_VALUE;
            return m.d(null, this);
        }
    }

    public static final Object a(InterfaceC0818b interfaceC0818b, kotlin.coroutines.d dVar) {
        C0899o c0899o = new C0899o(AbstractC3868b.c(dVar), 1);
        c0899o.s(new a(interfaceC0818b));
        interfaceC0818b.v1(new c(c0899o));
        Object y10 = c0899o.y();
        if (y10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y10;
    }

    public static final Object b(InterfaceC0818b interfaceC0818b, kotlin.coroutines.d dVar) {
        C0899o c0899o = new C0899o(AbstractC3868b.c(dVar), 1);
        c0899o.s(new b(interfaceC0818b));
        interfaceC0818b.v1(new d(c0899o));
        Object y10 = c0899o.y();
        if (y10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y10;
    }

    public static final Object c(InterfaceC0818b interfaceC0818b, kotlin.coroutines.d dVar) {
        C0899o c0899o = new C0899o(AbstractC3868b.c(dVar), 1);
        c0899o.s(new e(interfaceC0818b));
        interfaceC0818b.v1(new f(c0899o));
        Object y10 = c0899o.y();
        if (y10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(Exception exc, kotlin.coroutines.d dVar) {
        h hVar;
        int i10;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i11 = hVar.f1677b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f1677b = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f1676a;
                Object e10 = AbstractC3868b.e();
                i10 = hVar.f1677b;
                if (i10 != 0) {
                    lc.p.b(obj);
                    hVar.f1678c = exc;
                    hVar.f1677b = 1;
                    C0874b0.a().s(hVar.getContext(), new g(hVar, exc));
                    Object e11 = AbstractC3868b.e();
                    if (e11 == AbstractC3868b.e()) {
                        kotlin.coroutines.jvm.internal.h.c(hVar);
                    }
                    if (e11 == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                }
                return Unit.f36324a;
            }
        }
        hVar = new h(dVar);
        Object obj2 = hVar.f1676a;
        Object e102 = AbstractC3868b.e();
        i10 = hVar.f1677b;
        if (i10 != 0) {
        }
        return Unit.f36324a;
    }
}
