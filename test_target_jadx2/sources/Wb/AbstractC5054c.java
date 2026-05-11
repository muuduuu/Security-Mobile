package wb;

import Db.C0792a;
import Jd.AbstractC0891k;
import Jd.N;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.PromiseImpl;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;
import pb.t;
import pc.AbstractC3868b;

/* renamed from: wb.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5054c extends g {

    /* renamed from: wb.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44411a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f44411a = iArr;
        }
    }

    /* renamed from: wb.c$b */
    static final class b extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PromiseImpl f44412a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5054c f44413b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f44414c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object[] f44415d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3862a f44416e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(PromiseImpl promiseImpl, AbstractC5054c abstractC5054c, String str, Object[] objArr, C3862a c3862a) {
            super(0);
            this.f44412a = promiseImpl;
            this.f44413b = abstractC5054c;
            this.f44414c = str;
            this.f44415d = objArr;
            this.f44416e = c3862a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.Unit] */
        public final void a() {
            CodedException unexpectedException;
            CodedException codedException;
            String str = "getCode(...)";
            try {
                AbstractC5054c abstractC5054c = this.f44413b;
                String str2 = this.f44414c;
                try {
                    abstractC5054c.p(this.f44415d, this.f44412a, this.f44416e);
                    str = Unit.f36324a;
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
                    throw new expo.modules.kotlin.exception.p(abstractC5054c.f(), str2, codedException);
                }
            } catch (Throwable th2) {
                if (this.f44412a.getWasSettled()) {
                    throw th2;
                }
                PromiseImpl promiseImpl = this.f44412a;
                if (th2 instanceof CodedException) {
                    unexpectedException = (CodedException) th2;
                } else if (th2 instanceof Da.a) {
                    String a11 = ((Da.a) th2).a();
                    Intrinsics.checkNotNullExpressionValue(a11, str);
                    unexpectedException = new CodedException(a11, th2.getMessage(), th2.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th2);
                }
                promiseImpl.h(unexpectedException);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: wb.c$c, reason: collision with other inner class name */
    static final class C0641c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f44417a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f44418b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0641c(Function0 function0, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f44418b = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new C0641c(this.f44418b, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((C0641c) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f44417a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            this.f44418b.invoke();
            return Unit.f36324a;
        }
    }

    /* renamed from: wb.c$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f44419a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f44420b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0 function0, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f44420b = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new d(this.f44420b, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((d) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f44419a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            this.f44420b.invoke();
            return Unit.f36324a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5054c(String name, C0792a[] desiredArgsTypes) {
        super(name, desiredArgsTypes);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desiredArgsTypes, "desiredArgsTypes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(WeakReference appContextHolder, String moduleName, AbstractC5054c this$0, C3862a appContext, Object[] args, PromiseImpl promiseImpl) {
        Intrinsics.checkNotNullParameter(appContextHolder, "$appContextHolder");
        Intrinsics.checkNotNullParameter(moduleName, "$moduleName");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appContext, "$appContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(promiseImpl, "promiseImpl");
        this$0.q(appContext, new b(promiseImpl, this$0, moduleName, args, appContext));
    }

    private final void q(C3862a c3862a, Function0 function0) {
        int i10 = a.f44411a[l().ordinal()];
        if (i10 == 1) {
            AbstractC0891k.d(c3862a.u(), null, null, new C0641c(function0, null), 3, null);
        } else {
            if (i10 != 2) {
                return;
            }
            AbstractC0891k.d(c3862a.t(), null, null, new d(function0, null), 3, null);
        }
    }

    @Override // wb.AbstractC5052a
    public void a(final C3862a appContext, JSDecoratorsBridgingObject jsObject, final String moduleName) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(jsObject, "jsObject");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        final WeakReference a10 = t.a(appContext);
        String f10 = f();
        boolean h10 = h();
        boolean i10 = i();
        C0792a[] e10 = e();
        ArrayList arrayList = new ArrayList(e10.length);
        for (C0792a c0792a : e10) {
            arrayList.add(c0792a.c());
        }
        jsObject.registerAsyncFunction(f10, h10, i10, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new JNIAsyncFunctionBody() { // from class: wb.b
            @Override // expo.modules.kotlin.jni.JNIAsyncFunctionBody
            public final void invoke(Object[] objArr, PromiseImpl promiseImpl) {
                AbstractC5054c.o(a10, moduleName, this, appContext, objArr, promiseImpl);
            }
        });
    }

    public abstract void p(Object[] objArr, pb.m mVar, C3862a c3862a);
}
