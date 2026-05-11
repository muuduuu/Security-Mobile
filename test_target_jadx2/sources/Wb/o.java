package wb;

import Db.C0792a;
import Jd.AbstractC0891k;
import Jd.N;
import Jd.O;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.PromiseImpl;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;
import pb.t;
import pc.AbstractC3868b;
import wc.InterfaceC5068n;

/* loaded from: classes2.dex */
public final class o extends g {

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC5068n f44430h;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44431a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f44431a = iArr;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        Object f44432a;

        /* renamed from: b, reason: collision with root package name */
        Object f44433b;

        /* renamed from: c, reason: collision with root package name */
        Object f44434c;

        /* renamed from: d, reason: collision with root package name */
        int f44435d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f44436e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ PromiseImpl f44437f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ o f44438g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f44439h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object[] f44440i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C3862a f44441j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(PromiseImpl promiseImpl, o oVar, String str, Object[] objArr, C3862a c3862a, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f44437f = promiseImpl;
            this.f44438g = oVar;
            this.f44439h = str;
            this.f44440i = objArr;
            this.f44441j = c3862a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            b bVar = new b(this.f44437f, this.f44438g, this.f44439h, this.f44440i, this.f44441j, dVar);
            bVar.f44436e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((b) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:16:0x006a, B:18:0x006f, B:20:0x0073, B:21:0x0096, B:22:0x009f, B:38:0x008d, B:39:0x0093, B:44:0x0033), top: B:43:0x0033 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0093 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:16:0x006a, B:18:0x006f, B:20:0x0073, B:21:0x0096, B:22:0x009f, B:38:0x008d, B:39:0x0093, B:44:0x0033), top: B:43:0x0033 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            N n10;
            String str;
            o oVar;
            CodedException th;
            PromiseImpl promiseImpl;
            CodedException unexpectedException;
            CodedException codedException;
            CodedException codedException2;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f44435d;
            if (i10 == 0) {
                lc.p.b(obj);
                n10 = (N) this.f44436e;
                try {
                    o oVar2 = this.f44438g;
                    str = this.f44439h;
                    Object[] objArr = this.f44440i;
                    C3862a c3862a = this.f44441j;
                    PromiseImpl promiseImpl2 = this.f44437f;
                    try {
                        InterfaceC5068n interfaceC5068n = oVar2.f44430h;
                        Object[] b10 = oVar2.b(objArr, c3862a);
                        this.f44436e = n10;
                        this.f44432a = oVar2;
                        this.f44433b = str;
                        this.f44434c = promiseImpl2;
                        this.f44435d = 1;
                        Object n11 = interfaceC5068n.n(n10, b10, this);
                        if (n11 == e10) {
                            return e10;
                        }
                        promiseImpl = promiseImpl2;
                        oVar = oVar2;
                        obj = n11;
                    } catch (Throwable th2) {
                        oVar = oVar2;
                        th = th2;
                        if (!(th instanceof CodedException)) {
                        }
                        throw new expo.modules.kotlin.exception.p(oVar.f(), str, codedException2);
                    }
                } catch (Throwable th3) {
                    if (this.f44437f.getWasSettled()) {
                        throw th3;
                    }
                    PromiseImpl promiseImpl3 = this.f44437f;
                    if (th3 instanceof CodedException) {
                        codedException = (CodedException) th3;
                    } else {
                        if (th3 instanceof Da.a) {
                            String a10 = ((Da.a) th3).a();
                            Intrinsics.checkNotNullExpressionValue(a10, "getCode(...)");
                            unexpectedException = new CodedException(a10, th3.getMessage(), th3.getCause());
                        } else {
                            unexpectedException = new UnexpectedException(th3);
                        }
                        codedException = unexpectedException;
                    }
                    promiseImpl3.h(codedException);
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                promiseImpl = (PromiseImpl) this.f44434c;
                str = (String) this.f44433b;
                oVar = (o) this.f44432a;
                n10 = (N) this.f44436e;
                try {
                    lc.p.b(obj);
                } catch (Throwable th4) {
                    th = th4;
                    if (!(th instanceof CodedException)) {
                        codedException2 = th;
                    } else if (th instanceof Da.a) {
                        String a11 = ((Da.a) th).a();
                        Intrinsics.checkNotNullExpressionValue(a11, "getCode(...)");
                        codedException2 = new CodedException(a11, th.getMessage(), th.getCause());
                    } else {
                        codedException2 = new UnexpectedException(th);
                    }
                    throw new expo.modules.kotlin.exception.p(oVar.f(), str, codedException2);
                }
            }
            if (O.f(n10)) {
                promiseImpl.resolve(obj);
            }
            Unit unit = Unit.f36324a;
            return Unit.f36324a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String name, C0792a[] desiredArgsTypes, InterfaceC5068n body) {
        super(name, desiredArgsTypes);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desiredArgsTypes, "desiredArgsTypes");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f44430h = body;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(WeakReference appContextHolder, String moduleName, o this$0, C3862a appContext, Object[] args, PromiseImpl promiseImpl) {
        N t10;
        Intrinsics.checkNotNullParameter(appContextHolder, "$appContextHolder");
        Intrinsics.checkNotNullParameter(moduleName, "$moduleName");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appContext, "$appContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(promiseImpl, "promiseImpl");
        int i10 = a.f44431a[this$0.l().ordinal()];
        if (i10 == 1) {
            t10 = appContext.t();
        } else {
            if (i10 != 2) {
                throw new lc.m();
            }
            t10 = appContext.u();
        }
        AbstractC0891k.d(t10, null, null, new b(promiseImpl, this$0, moduleName, args, appContext, null), 3, null);
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
        jsObject.registerAsyncFunction(f10, h10, i10, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new JNIAsyncFunctionBody() { // from class: wb.n
            @Override // expo.modules.kotlin.jni.JNIAsyncFunctionBody
            public final void invoke(Object[] objArr, PromiseImpl promiseImpl) {
                o.p(a10, moduleName, this, appContext, objArr, promiseImpl);
            }
        });
    }
}
