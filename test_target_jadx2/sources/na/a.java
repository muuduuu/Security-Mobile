package Na;

import Db.C0792a;
import Db.C0794c;
import Db.T;
import Db.U;
import Jd.N;
import Jd.O;
import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.ReactContext;
import expo.modules.fetch.NativeRequest;
import expo.modules.fetch.NativeRequestInit;
import expo.modules.fetch.NativeResponse;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.exception.l;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import lc.i;
import org.conscrypt.BuildConfig;
import q1.AbstractC3901a;
import tb.C4826a;
import u5.C4870a;
import vb.C5006a;
import vb.EnumC5010e;
import vc.AbstractC5011a;
import wb.j;
import wb.k;
import xb.AbstractC5139a;
import xc.C5142C;
import xc.m;
import yb.C5190h;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"LNa/a;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "LTd/B;", "d", "Lkotlin/Lazy;", "o", "()LTd/B;", "client", "Lcom/facebook/react/modules/network/e;", "e", "p", "()Lcom/facebook/react/modules/network/e;", "cookieHandler", "Lcom/facebook/react/modules/network/a;", "f", "q", "()Lcom/facebook/react/modules/network/a;", "cookieJarContainer", "LJd/N;", "g", "r", "()LJd/N;", "moduleCoroutineScope", "Lcom/facebook/react/bridge/ReactContext;", "s", "()Lcom/facebook/react/bridge/ReactContext;", "reactContext", "h", C4870a.f43493a, "expo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends AbstractC5139a {

    /* renamed from: i, reason: collision with root package name */
    private static final String f6579i = a.class.getSimpleName();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy client = i.a(new C0990b());

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy cookieHandler = i.a(new C0991c());

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy cookieJarContainer = i.a(new C0992d());

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy moduleCoroutineScope = i.a(new M());

    static final class A extends m implements Function1 {
        public A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            String e10;
            Intrinsics.checkNotNullParameter(it, "it");
            e responseInit = ((NativeResponse) it[0]).getResponseInit();
            return (responseInit == null || (e10 = responseInit.e()) == null) ? BuildConfig.FLAVOR : e10;
        }
    }

    static final class B extends m implements Function1 {
        public B() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            e responseInit = ((NativeResponse) it[0]).getResponseInit();
            return Boolean.valueOf(responseInit != null ? responseInit.b() : false);
        }
    }

    public static final class C extends m implements Function2 {
        public C() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            ((NativeRequest) promise).s();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class D extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final D f6584a = new D();

        public D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(NativeRequest.class);
        }
    }

    public static final class E extends m implements Function1 {
        public E() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            ((NativeRequest) objArr[0]).s();
            return Unit.f36324a;
        }
    }

    public static final class F extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final F f6585a = new F();

        public F() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(NativeRequest.class);
        }
    }

    public static final class G extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final G f6586a = new G();

        public G() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(URL.class);
        }
    }

    public static final class H extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final H f6587a = new H();

        public H() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(NativeRequestInit.class);
        }
    }

    public static final class I extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final I f6588a = new I();

        public I() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.f(byte[].class);
        }
    }

    public static final class J extends m implements Function2 {
        public J() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            byte[] bArr = (byte[]) objArr[3];
            NativeRequest nativeRequest = (NativeRequest) obj;
            Td.B o10 = a.this.o();
            nativeRequest.u(o10, (URL) obj2, (NativeRequestInit) obj3, bArr);
            nativeRequest.getCo.hyperverge.hypersnapsdk.analytics.mixpanel.Keys.RESPONSE java.lang.String().A0(CollectionsKt.m(h.RESPONSE_RECEIVED, h.ERROR_RECEIVED), new C0995g(promise, nativeRequest));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class K extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final K f6590a = new K();

        public K() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(NativeResponse.class);
        }
    }

    public static final class L extends m implements Function1 {
        public L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            return new NativeRequest(a.this.a(), (NativeResponse) objArr[0]);
        }
    }

    static final class M extends m implements Function0 {
        M() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N invoke() {
            return O.a(a.this.a().u().y().l(new Jd.M("expo.modules.fetch.CoroutineScope")));
        }
    }

    /* renamed from: Na.a$b, reason: case insensitive filesystem */
    static final class C0990b extends m implements Function0 {
        C0990b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Td.B invoke() {
            return com.facebook.react.modules.network.h.b(a.this.s()).A().a(new expo.modules.fetch.a(a.this.s())).c();
        }
    }

    /* renamed from: Na.a$c, reason: case insensitive filesystem */
    static final class C0991c extends m implements Function0 {
        C0991c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.facebook.react.modules.network.e invoke() {
            return new com.facebook.react.modules.network.e(a.this.s());
        }
    }

    /* renamed from: Na.a$d, reason: case insensitive filesystem */
    static final class C0992d extends m implements Function0 {
        C0992d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.facebook.react.modules.network.a invoke() {
            Td.o n10 = a.this.o().n();
            Intrinsics.e(n10, "null cannot be cast to non-null type com.facebook.react.modules.network.CookieJarContainer");
            return (com.facebook.react.modules.network.a) n10;
        }
    }

    /* renamed from: Na.a$e, reason: case insensitive filesystem */
    static final class C0993e extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NativeResponse f6596a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ pb.m f6597b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0993e(NativeResponse nativeResponse, pb.m mVar) {
            super(1);
            this.f6596a = nativeResponse;
            this.f6597b = mVar;
        }

        public final void a(h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f6597b.resolve(this.f6596a.getSink().b());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h) obj);
            return Unit.f36324a;
        }
    }

    /* renamed from: Na.a$f, reason: case insensitive filesystem */
    static final class C0994f extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NativeResponse f6598a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ pb.m f6599b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0994f(NativeResponse nativeResponse, pb.m mVar) {
            super(1);
            this.f6598a = nativeResponse;
            this.f6599b = mVar;
        }

        public final void a(h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f6599b.a(new String(this.f6598a.getSink().b(), Charsets.UTF_8));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h) obj);
            return Unit.f36324a;
        }
    }

    /* renamed from: Na.a$g, reason: case insensitive filesystem */
    static final class C0995g extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ pb.m f6600a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ NativeRequest f6601b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0995g(pb.m mVar, NativeRequest nativeRequest) {
            super(1);
            this.f6600a = mVar;
            this.f6601b = nativeRequest;
        }

        public final void a(h state) {
            CodedException dVar;
            CodedException unexpectedException;
            Intrinsics.checkNotNullParameter(state, "state");
            if (state == h.RESPONSE_RECEIVED) {
                this.f6600a.c();
                return;
            }
            if (state == h.ERROR_RECEIVED) {
                pb.m mVar = this.f6600a;
                Exception exc = this.f6601b.getCo.hyperverge.hypersnapsdk.analytics.mixpanel.Keys.RESPONSE java.lang.String().getCo.hyperverge.hypersnapsdk.utils.AppConstants.VIDEO_RECORDING_ERROR java.lang.String();
                if (exc == null) {
                    dVar = new d();
                } else if (exc instanceof CodedException) {
                    dVar = (CodedException) exc;
                } else {
                    if (exc instanceof Da.a) {
                        String a10 = ((Da.a) exc).a();
                        Intrinsics.checkNotNullExpressionValue(a10, "getCode(...)");
                        unexpectedException = new CodedException(a10, exc.getMessage(), exc.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(exc);
                    }
                    dVar = unexpectedException;
                }
                mVar.h(dVar);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h) obj);
            return Unit.f36324a;
        }
    }

    /* renamed from: Na.a$h, reason: case insensitive filesystem */
    public static final class C0996h extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0996h f6602a = new C0996h();

        public C0996h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(NativeResponse.class);
        }
    }

    /* renamed from: Na.a$i, reason: case insensitive filesystem */
    public static final class C0997i extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0997i f6603a = new C0997i();

        public C0997i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(NativeRequest.class);
        }
    }

    /* renamed from: Na.a$j, reason: case insensitive filesystem */
    public static final class C0998j extends m implements Function0 {
        public C0998j() {
            super(0);
        }

        public final void a() {
            a.this.q().a(new Td.y(a.this.p()));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: Na.a$k, reason: case insensitive filesystem */
    public static final class C0999k extends m implements Function0 {
        public C0999k() {
            super(0);
        }

        public final void a() {
            a.this.p().e();
            a.this.q().c();
            try {
                O.c(a.this.r(), new Da.d(null, 1, null));
            } catch (IllegalStateException unused) {
                Log.e(a.f6579i, "The scope does not have a job in it");
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: Na.a$l, reason: case insensitive filesystem */
    public static final class C1000l extends m implements Function2 {
        public C1000l() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            ((NativeResponse) promise).z0();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: Na.a$m, reason: case insensitive filesystem */
    public static final class C1001m extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C1001m f6606a = new C1001m();

        public C1001m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(NativeResponse.class);
        }
    }

    public static final class n extends m implements Function1 {
        public n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            return ((NativeResponse) objArr[0]).z0();
        }
    }

    public static final class o extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final o f6607a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(NativeResponse.class);
        }
    }

    public static final class p extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final p f6608a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class q extends m implements Function1 {
        public q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            ((NativeResponse) obj).y();
            return Unit.f36324a;
        }
    }

    public static final class r extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final r f6609a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(NativeResponse.class);
        }
    }

    public static final class s extends m implements Function2 {
        public s() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            NativeResponse nativeResponse = (NativeResponse) objArr[0];
            nativeResponse.A0(CollectionsKt.e(h.BODY_COMPLETED), new C0993e(nativeResponse, promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class t extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final t f6610a = new t();

        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(NativeResponse.class);
        }
    }

    public static final class u extends m implements Function2 {
        public u() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            NativeResponse nativeResponse = (NativeResponse) objArr[0];
            nativeResponse.A0(CollectionsKt.e(h.BODY_COMPLETED), new C0994f(nativeResponse, promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    public static final class v extends m implements Function1 {
        public v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new NativeResponse(a.this.a(), a.this.r());
        }
    }

    static final class w extends m implements Function1 {
        public w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(((NativeResponse) it[0]).F());
        }
    }

    static final class x extends m implements Function1 {
        public x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            List a10;
            Intrinsics.checkNotNullParameter(it, "it");
            e responseInit = ((NativeResponse) it[0]).getResponseInit();
            return (responseInit == null || (a10 = responseInit.a()) == null) ? CollectionsKt.j() : a10;
        }
    }

    static final class y extends m implements Function1 {
        public y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            e responseInit = ((NativeResponse) it[0]).getResponseInit();
            return Integer.valueOf(responseInit != null ? responseInit.c() : -1);
        }
    }

    static final class z extends m implements Function1 {
        public z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            String d10;
            Intrinsics.checkNotNullParameter(it, "it");
            e responseInit = ((NativeResponse) it[0]).getResponseInit();
            return (responseInit == null || (d10 = responseInit.d()) == null) ? BuildConfig.FLAVOR : d10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Td.B o() {
        return (Td.B) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.facebook.react.modules.network.e p() {
        return (com.facebook.react.modules.network.e) this.cookieHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.facebook.react.modules.network.a q() {
        return (com.facebook.react.modules.network.a) this.cookieJarContainer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N r() {
        return (N) this.moduleCoroutineScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReactContext s() {
        Context w10 = a().w();
        ReactContext reactContext = w10 instanceof ReactContext ? (ReactContext) w10 : null;
        if (reactContext != null) {
            return reactContext;
        }
        throw new l();
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        Object obj;
        Class cls;
        String str;
        wb.g eVar;
        Object obj2;
        Object obj3;
        String str2;
        wb.g kVar;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoFetchModule");
            Map s10 = bVar.s();
            EnumC5010e enumC5010e = EnumC5010e.MODULE_CREATE;
            s10.put(enumC5010e, new C5006a(enumC5010e, new C0998j()));
            Map s11 = bVar.s();
            EnumC5010e enumC5010e2 = EnumC5010e.MODULE_DESTROY;
            s11.put(enumC5010e2, new C5006a(enumC5010e2, new C0999k()));
            kotlin.reflect.d b10 = C5142C.b(NativeResponse.class);
            String simpleName = AbstractC5011a.b(b10).getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b11 = C5142C.b(NativeResponse.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(b11, bool));
            if (c0792a == null) {
                str = "get";
                cls = Boolean.class;
                obj = Unit.class;
                c0792a = new C0792a(new Db.M(C5142C.b(NativeResponse.class), false, C0996h.f6602a));
            } else {
                obj = Unit.class;
                cls = Boolean.class;
                str = "get";
            }
            C4826a c4826a = new C4826a(simpleName, b10, c0792a);
            C0792a[] c0792aArr = new C0792a[0];
            U u10 = U.f1425a;
            T t10 = (T) u10.a().get(C5142C.b(Object.class));
            if (t10 == null) {
                t10 = new T(C5142C.b(Object.class));
                u10.a().put(C5142C.b(Object.class), t10);
            }
            c4826a.q(new wb.q("constructor", c0792aArr, t10, new v()));
            if (Intrinsics.b(NativeResponse.class, pb.m.class)) {
                eVar = new wb.f("startStreaming", new C0792a[0], new C1000l());
            } else {
                C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(NativeResponse.class), bool));
                if (c0792a2 == null) {
                    c0792a2 = new C0792a(new Db.M(C5142C.b(NativeResponse.class), false, C1001m.f6606a));
                }
                eVar = new wb.e("startStreaming", new C0792a[]{c0792a2}, new n());
            }
            c4826a.k().put("startStreaming", eVar);
            C0792a c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(NativeResponse.class), bool));
            if (c0792a3 == null) {
                c0792a3 = new C0792a(new Db.M(C5142C.b(NativeResponse.class), false, o.f6607a));
            }
            C0792a c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
            if (c0792a4 == null) {
                obj2 = pb.m.class;
                c0792a4 = new C0792a(new Db.M(C5142C.b(String.class), false, p.f6608a));
            } else {
                obj2 = pb.m.class;
            }
            C0792a[] c0792aArr2 = {c0792a3, c0792a4};
            q qVar = new q();
            Class cls2 = Integer.TYPE;
            Object obj4 = obj;
            c4826a.k().put("cancelStreaming", Intrinsics.b(obj4, cls2) ? new k("cancelStreaming", c0792aArr2, qVar) : Intrinsics.b(obj4, Boolean.TYPE) ? new wb.h("cancelStreaming", c0792aArr2, qVar) : Intrinsics.b(obj4, Double.TYPE) ? new wb.i("cancelStreaming", c0792aArr2, qVar) : Intrinsics.b(obj4, Float.TYPE) ? new j("cancelStreaming", c0792aArr2, qVar) : Intrinsics.b(obj4, String.class) ? new wb.m("cancelStreaming", c0792aArr2, qVar) : new wb.e("cancelStreaming", c0792aArr2, qVar));
            C5190h c5190h = new C5190h(c4826a.p().d(), "bodyUsed");
            C0792a[] c0792aArr3 = {new C0792a(c5190h.d())};
            T t11 = (T) u10.a().get(C5142C.b(cls));
            if (t11 == null) {
                t11 = new T(C5142C.b(cls));
                obj3 = obj4;
                u10.a().put(C5142C.b(cls), t11);
            } else {
                obj3 = obj4;
            }
            String str3 = str;
            wb.q qVar2 = new wb.q(str3, c0792aArr3, t11, new w());
            qVar2.k(c5190h.d());
            qVar2.j(true);
            c5190h.b(qVar2);
            c4826a.m().put("bodyUsed", c5190h);
            C5190h c5190h2 = new C5190h(c4826a.p().d(), "_rawHeaders");
            C0792a[] c0792aArr4 = {new C0792a(c5190h2.d())};
            T t12 = (T) u10.a().get(C5142C.b(List.class));
            if (t12 == null) {
                t12 = new T(C5142C.b(List.class));
                str2 = "constructor";
                u10.a().put(C5142C.b(List.class), t12);
            } else {
                str2 = "constructor";
            }
            wb.q qVar3 = new wb.q(str3, c0792aArr4, t12, new x());
            qVar3.k(c5190h2.d());
            qVar3.j(true);
            c5190h2.b(qVar3);
            c4826a.m().put("_rawHeaders", c5190h2);
            C5190h c5190h3 = new C5190h(c4826a.p().d(), "status");
            C0792a[] c0792aArr5 = {new C0792a(c5190h3.d())};
            T t13 = (T) u10.a().get(C5142C.b(Integer.class));
            if (t13 == null) {
                t13 = new T(C5142C.b(Integer.class));
                u10.a().put(C5142C.b(Integer.class), t13);
            }
            wb.q qVar4 = new wb.q(str3, c0792aArr5, t13, new y());
            qVar4.k(c5190h3.d());
            qVar4.j(true);
            c5190h3.b(qVar4);
            c4826a.m().put("status", c5190h3);
            C5190h c5190h4 = new C5190h(c4826a.p().d(), "statusText");
            C0792a[] c0792aArr6 = {new C0792a(c5190h4.d())};
            T t14 = (T) u10.a().get(C5142C.b(String.class));
            if (t14 == null) {
                t14 = new T(C5142C.b(String.class));
                u10.a().put(C5142C.b(String.class), t14);
            }
            wb.q qVar5 = new wb.q(str3, c0792aArr6, t14, new z());
            qVar5.k(c5190h4.d());
            qVar5.j(true);
            c5190h4.b(qVar5);
            c4826a.m().put("statusText", c5190h4);
            C5190h c5190h5 = new C5190h(c4826a.p().d(), "url");
            C0792a[] c0792aArr7 = {new C0792a(c5190h5.d())};
            T t15 = (T) u10.a().get(C5142C.b(String.class));
            if (t15 == null) {
                t15 = new T(C5142C.b(String.class));
                u10.a().put(C5142C.b(String.class), t15);
            }
            wb.q qVar6 = new wb.q(str3, c0792aArr7, t15, new A());
            qVar6.k(c5190h5.d());
            qVar6.j(true);
            c5190h5.b(qVar6);
            c4826a.m().put("url", c5190h5);
            C5190h c5190h6 = new C5190h(c4826a.p().d(), "redirected");
            C0792a[] c0792aArr8 = {new C0792a(c5190h6.d())};
            T t16 = (T) u10.a().get(C5142C.b(cls));
            if (t16 == null) {
                t16 = new T(C5142C.b(cls));
                u10.a().put(C5142C.b(cls), t16);
            }
            wb.q qVar7 = new wb.q(str3, c0792aArr8, t16, new B());
            qVar7.k(c5190h6.d());
            qVar7.j(true);
            c5190h6.b(qVar7);
            c4826a.m().put("redirected", c5190h6);
            C0792a c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(NativeResponse.class), bool));
            if (c0792a5 == null) {
                c0792a5 = new C0792a(new Db.M(C5142C.b(NativeResponse.class), false, r.f6609a));
            }
            c4826a.k().put("arrayBuffer", new wb.f("arrayBuffer", new C0792a[]{c0792a5}, new s()));
            C0792a c0792a6 = (C0792a) c0794c.a().get(new Pair(C5142C.b(NativeResponse.class), bool));
            if (c0792a6 == null) {
                c0792a6 = new C0792a(new Db.M(C5142C.b(NativeResponse.class), false, t.f6610a));
            }
            c4826a.k().put("text", new wb.f("text", new C0792a[]{c0792a6}, new u()));
            bVar.r().add(c4826a.o());
            kotlin.reflect.d b12 = C5142C.b(NativeRequest.class);
            String simpleName2 = AbstractC5011a.b(b12).getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
            C0792a c0792a7 = (C0792a) c0794c.a().get(new Pair(C5142C.b(NativeRequest.class), bool));
            if (c0792a7 == null) {
                c0792a7 = new C0792a(new Db.M(C5142C.b(NativeRequest.class), false, C0997i.f6603a));
            }
            C4826a c4826a2 = new C4826a(simpleName2, b12, c0792a7);
            C0792a c0792a8 = (C0792a) c0794c.a().get(new Pair(C5142C.b(NativeResponse.class), bool));
            if (c0792a8 == null) {
                c0792a8 = new C0792a(new Db.M(C5142C.b(NativeResponse.class), false, K.f6590a));
            }
            C0792a[] c0792aArr9 = {c0792a8};
            T t17 = (T) u10.a().get(C5142C.b(Object.class));
            if (t17 == null) {
                t17 = new T(C5142C.b(Object.class));
                u10.a().put(C5142C.b(Object.class), t17);
            }
            c4826a2.q(new wb.q(str2, c0792aArr9, t17, new L()));
            C0792a c0792a9 = (C0792a) c0794c.a().get(new Pair(C5142C.b(NativeRequest.class), bool));
            if (c0792a9 == null) {
                c0792a9 = new C0792a(new Db.M(C5142C.b(NativeRequest.class), false, F.f6585a));
            }
            C0792a c0792a10 = (C0792a) c0794c.a().get(new Pair(C5142C.b(URL.class), bool));
            if (c0792a10 == null) {
                c0792a10 = new C0792a(new Db.M(C5142C.b(URL.class), false, G.f6586a));
            }
            C0792a c0792a11 = (C0792a) c0794c.a().get(new Pair(C5142C.b(NativeRequestInit.class), bool));
            if (c0792a11 == null) {
                c0792a11 = new C0792a(new Db.M(C5142C.b(NativeRequestInit.class), false, H.f6587a));
            }
            C0792a c0792a12 = (C0792a) c0794c.a().get(new Pair(C5142C.b(byte[].class), Boolean.TRUE));
            if (c0792a12 == null) {
                c0792a12 = new C0792a(new Db.M(C5142C.b(byte[].class), true, I.f6588a));
            }
            c4826a2.k().put("start", new wb.f("start", new C0792a[]{c0792a9, c0792a10, c0792a11, c0792a12}, new J()));
            if (Intrinsics.b(NativeRequest.class, obj2)) {
                kVar = new wb.f("cancel", new C0792a[0], new C());
            } else {
                C0792a c0792a13 = (C0792a) c0794c.a().get(new Pair(C5142C.b(NativeRequest.class), bool));
                if (c0792a13 == null) {
                    c0792a13 = new C0792a(new Db.M(C5142C.b(NativeRequest.class), false, D.f6584a));
                }
                C0792a[] c0792aArr10 = {c0792a13};
                E e10 = new E();
                Object obj5 = obj3;
                kVar = Intrinsics.b(obj5, cls2) ? new k("cancel", c0792aArr10, e10) : Intrinsics.b(obj5, Boolean.TYPE) ? new wb.h("cancel", c0792aArr10, e10) : Intrinsics.b(obj5, Double.TYPE) ? new wb.i("cancel", c0792aArr10, e10) : Intrinsics.b(obj5, Float.TYPE) ? new j("cancel", c0792aArr10, e10) : Intrinsics.b(obj5, String.class) ? new wb.m("cancel", c0792aArr10, e10) : new wb.e("cancel", c0792aArr10, e10);
            }
            c4826a2.k().put("cancel", kVar);
            bVar.r().add(c4826a2.o());
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
