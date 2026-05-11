package pb;

import Jd.AbstractC0891k;
import Jd.N;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableNativeMap;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.exception.u;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.JavaScriptModuleObject_;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;
import q1.AbstractC3901a;
import tb.C4827b;
import vb.AbstractC5008c;
import vb.C5006a;
import vb.C5009d;
import vb.EnumC5010e;
import vc.AbstractC5011a;
import wb.AbstractC5052a;
import wb.AbstractC5054c;
import xb.AbstractC5139a;
import yb.C5185c;
import yb.C5188f;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5139a f38561a;

    /* renamed from: b, reason: collision with root package name */
    private final xb.c f38562b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38563c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f38564d;

    static final class a extends xc.m implements Function0 {

        /* renamed from: pb.j$a$a, reason: collision with other inner class name */
        static final class C0595a implements JNIFunctionBody {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f38566a;

            C0595a(j jVar) {
                this.f38566a = jVar;
            }

            @Override // expo.modules.kotlin.jni.JNIFunctionBody
            public final Object invoke(Object[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f38566a.h();
            }
        }

        a() {
            super(0);
        }

        /* JADX WARN: Finally extract failed */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JavaScriptModuleObject_ invoke() {
            JSDecoratorsBridgingObject jSDecoratorsBridgingObject;
            Class j10;
            j.this.f38563c = true;
            String str = j.this.h() + ".jsObject";
            j jVar = j.this;
            AbstractC3901a.c("[ExpoModulesCore] " + str);
            try {
                C3862a a10 = jVar.g().a();
                JNIDeallocator e10 = jVar.g().d().e();
                JSDecoratorsBridgingObject jSDecoratorsBridgingObject2 = new JSDecoratorsBridgingObject(e10);
                jVar.c(a10, jVar.e().f(), jSDecoratorsBridgingObject2, jVar.h());
                jSDecoratorsBridgingObject2.registerProperty("__expo_module_name__", false, new ExpectedType[0], new C0595a(jVar), false, new ExpectedType[0], null);
                expo.modules.kotlin.views.o h10 = jVar.e().h();
                List<wb.g> b10 = h10 != null ? h10.b() : null;
                if (b10 == null || !(!b10.isEmpty())) {
                    jSDecoratorsBridgingObject = jSDecoratorsBridgingObject2;
                } else {
                    AbstractC3901a.c("[ExpoModulesCore] Attaching view prototype");
                    try {
                        JSDecoratorsBridgingObject jSDecoratorsBridgingObject3 = new JSDecoratorsBridgingObject(e10);
                        for (wb.g gVar : b10) {
                            String h11 = jVar.h();
                            expo.modules.kotlin.views.o h12 = jVar.e().h();
                            gVar.a(a10, jSDecoratorsBridgingObject3, h11 + "_" + ((h12 == null || (j10 = h12.j()) == null) ? null : j10.getName()));
                        }
                        jSDecoratorsBridgingObject = jSDecoratorsBridgingObject2;
                        jSDecoratorsBridgingObject.registerObject("ViewPrototype", jSDecoratorsBridgingObject3);
                        Unit unit = Unit.f36324a;
                        AbstractC3901a.f();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                AbstractC3901a.c("[ExpoModulesCore] Attaching classes");
                try {
                    for (C4827b c4827b : jVar.e().b()) {
                        JSDecoratorsBridgingObject jSDecoratorsBridgingObject4 = new JSDecoratorsBridgingObject(e10);
                        jVar.c(a10, c4827b.c(), jSDecoratorsBridgingObject4, c4827b.b());
                        wb.q a11 = c4827b.a();
                        kotlin.reflect.o g10 = a11.g();
                        kotlin.reflect.e j11 = g10 != null ? g10.j() : null;
                        kotlin.reflect.d dVar = j11 instanceof kotlin.reflect.d ? (kotlin.reflect.d) j11 : null;
                        jSDecoratorsBridgingObject.registerClass(c4827b.b(), jSDecoratorsBridgingObject4, a11.h(), dVar != null ? AbstractC5011a.b(dVar) : null, c4827b.d(), (ExpectedType[]) a11.d().toArray(new ExpectedType[0]), a11.n(c4827b.b(), a10));
                        jSDecoratorsBridgingObject = jSDecoratorsBridgingObject;
                    }
                    JSDecoratorsBridgingObject jSDecoratorsBridgingObject5 = jSDecoratorsBridgingObject;
                    Unit unit2 = Unit.f36324a;
                    AbstractC3901a.f();
                    JavaScriptModuleObject_ javaScriptModuleObject_ = new JavaScriptModuleObject_(e10, jVar.h());
                    javaScriptModuleObject_.decorate(jSDecoratorsBridgingObject5);
                    AbstractC3901a.f();
                    return javaScriptModuleObject_;
                } finally {
                    AbstractC3901a.f();
                }
            } catch (Throwable th2) {
                AbstractC3901a.f();
                throw th2;
            }
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f38567a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f38568b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f38569c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function2 function2, j jVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f38568b = function2;
            this.f38569c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new b(this.f38568b, this.f38569c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((b) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f38567a;
            if (i10 == 0) {
                lc.p.b(obj);
                Function2 function2 = this.f38568b;
                rb.m g10 = this.f38569c.g().a().g();
                this.f38567a = 1;
                if (function2.invoke(g10, this) == e10) {
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

    public j(AbstractC5139a module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.f38561a = module;
        this.f38562b = module.b();
        this.f38564d = lc.i.a(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public final void c(C3862a c3862a, C5185c c5185c, JSDecoratorsBridgingObject jSDecoratorsBridgingObject, String str) {
        AbstractC3901a.c("[ExpoModulesCore] Exporting constants");
        try {
            WritableNativeMap makeNativeMap = Arguments.makeNativeMap((Map<String, Object>) c5185c.b().invoke());
            Intrinsics.d(makeNativeMap);
            jSDecoratorsBridgingObject.registerConstants(makeNativeMap);
            Unit unit = Unit.f36324a;
            AbstractC3901a.f();
            AbstractC3901a.c("[ExpoModulesCore] Attaching functions");
            try {
                C3863b d10 = c5185c.d();
                while (d10.hasNext()) {
                    ((AbstractC5052a) d10.next()).a(c3862a, jSDecoratorsBridgingObject, str);
                }
                Unit unit2 = Unit.f36324a;
                AbstractC3901a.f();
                AbstractC3901a.c("[ExpoModulesCore] Attaching properties");
                try {
                    Iterator it = c5185c.e().entrySet().iterator();
                    while (it.hasNext()) {
                        ((C5188f) ((Map.Entry) it.next()).getValue()).c(c3862a, jSDecoratorsBridgingObject);
                    }
                    Unit unit3 = Unit.f36324a;
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        } finally {
            AbstractC3901a.f();
        }
    }

    public final void d(String methodName, Object[] args, m promise) {
        CodedException codedException;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            wb.g gVar = (wb.g) this.f38562b.a().get(methodName);
            if (gVar == null) {
                throw new u();
            }
            if (gVar instanceof AbstractC5054c) {
                ((AbstractC5054c) gVar).p(args, promise, this.f38561a.a());
                Unit unit = Unit.f36324a;
            } else {
                throw new IllegalStateException("Cannot call a " + gVar + " method in test context");
            }
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                codedException = (CodedException) th;
            } else if (th instanceof Da.a) {
                String a10 = ((Da.a) th).a();
                Intrinsics.checkNotNullExpressionValue(a10, "getCode(...)");
                codedException = new CodedException(a10, th.getMessage(), th.getCause());
            } else {
                codedException = new UnexpectedException(th);
            }
            throw new expo.modules.kotlin.exception.p(methodName, this.f38562b.e(), codedException);
        }
    }

    public final xb.c e() {
        return this.f38562b;
    }

    public final JavaScriptModuleObject_ f() {
        return (JavaScriptModuleObject_) this.f38564d.getValue();
    }

    public final AbstractC5139a g() {
        return this.f38561a;
    }

    public final String h() {
        return this.f38562b.e();
    }

    public final JavaScriptModuleObject_ i() {
        if (this.f38563c) {
            return f();
        }
        return null;
    }

    public final void j(EnumC5010e eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        AbstractC5008c abstractC5008c = (AbstractC5008c) this.f38562b.c().get(eventName);
        if (abstractC5008c == null) {
            return;
        }
        C5006a c5006a = abstractC5008c instanceof C5006a ? (C5006a) abstractC5008c : null;
        if (c5006a != null) {
            c5006a.a();
        }
    }

    public final void k(EnumC5010e eventName, Object obj) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    public final void l(EnumC5010e eventName, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        AbstractC5008c abstractC5008c = (AbstractC5008c) this.f38562b.c().get(eventName);
        if (abstractC5008c == null) {
            return;
        }
        C5009d c5009d = abstractC5008c instanceof C5009d ? (C5009d) abstractC5008c : null;
        if (c5009d != null) {
            c5009d.a(obj, obj2);
        }
    }

    public final void m() {
        Function2 g10 = this.f38562b.g();
        if (g10 != null) {
            AbstractC0891k.d(this.f38561a.a().t(), null, null, new b(g10, this, null), 3, null);
        }
    }
}
