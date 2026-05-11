package expo.modules.fetch;

import Jd.AbstractC0891k;
import Jd.C0874b0;
import Jd.N;
import Na.g;
import Na.h;
import Td.F;
import Td.G;
import Td.InterfaceC1229e;
import Td.InterfaceC1230f;
import Td.v;
import android.util.Log;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import lc.t;
import org.conscrypt.BuildConfig;
import pb.C3862a;
import pc.AbstractC3868b;
import pe.InterfaceC3879g;
import u5.C4870a;
import xc.m;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001\u0019B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\r\u0010 \u001a\u00020\u0016¢\u0006\u0004\b \u0010\u001aJ/\u0010%\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160#¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00162\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010/R\u0017\u00104\u001a\u0002008\u0006¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b2\u00103R*\u0010;\u001a\u00020\n2\u0006\u00105\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\u0012\n\u0004\b*\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010@\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0#j\u0002`=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R(\u0010F\u001a\u0004\u0018\u00010\u00112\b\u0010A\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER4\u0010M\u001a\n\u0018\u00010Gj\u0004\u0018\u0001`H2\u000e\u0010A\u001a\n\u0018\u00010Gj\u0004\u0018\u0001`H8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0011\u0010P\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lexpo/modules/fetch/NativeResponse;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "LTd/f;", "Lpb/a;", "appContext", "LJd/N;", "coroutineScope", "<init>", "(Lpb/a;LJd/N;)V", BuildConfig.FLAVOR, "LNa/h;", "validStates", BuildConfig.FLAVOR, "Q", "([LNa/h;)Z", "LTd/F;", Keys.RESPONSE, "LNa/e;", "z", "(LTd/F;)LNa/e;", "Lpe/g;", "stream", BuildConfig.FLAVOR, "o0", "(Lpe/g;)V", C4870a.f43493a, "()V", "i0", BuildConfig.FLAVOR, "z0", "()[B", "y", "C", BuildConfig.FLAVOR, "states", "Lkotlin/Function1;", "callback", "A0", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "LTd/e;", "call", "Ljava/io/IOException;", "e", "d", "(LTd/e;Ljava/io/IOException;)V", "c", "(LTd/e;LTd/F;)V", "LJd/N;", "LNa/g;", "LNa/g;", "K", "()LNa/g;", "sink", "value", "LNa/h;", "N", "()LNa/h;", "y0", "(LNa/h;)V", Keys.STATE, BuildConfig.FLAVOR, "Lexpo/modules/fetch/StateChangeListener;", "f", "Ljava/util/List;", "stateChangeOnceListeners", "<set-?>", "g", "LNa/e;", "I", "()LNa/e;", "responseInit", "Ljava/lang/Exception;", "Lkotlin/Exception;", "h", "Ljava/lang/Exception;", "H", "()Ljava/lang/Exception;", AppConstants.VIDEO_RECORDING_ERROR, "F", "()Z", "bodyUsed", "i", "expo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NativeResponse extends SharedObject implements InterfaceC1230f {

    /* renamed from: j, reason: collision with root package name */
    private static final String f32643j = NativeResponse.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final N coroutineScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g sink;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private h state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List stateChangeOnceListeners;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Na.e responseInit;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Exception error;

    static final class b extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f32650a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return String.valueOf(it.getIntValue());
        }
    }

    static final class c extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f32651a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F f32652b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ NativeResponse f32653c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(F f10, NativeResponse nativeResponse, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f32652b = f10;
            this.f32653c = nativeResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new c(this.f32652b, this.f32653c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((c) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3879g j10;
            AbstractC3868b.e();
            if (this.f32651a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            G b10 = this.f32652b.b();
            if (b10 == null || (j10 = b10.j()) == null) {
                return Unit.f36324a;
            }
            this.f32653c.o0(j10);
            this.f32652b.close();
            if (this.f32653c.N() == h.BODY_STREAMING_STARTED) {
                this.f32653c.b("didComplete", new Object[0]);
            }
            this.f32653c.y0(h.BODY_COMPLETED);
            this.f32653c.b("readyForJSFinalization", new Object[0]);
            return Unit.f36324a;
        }
    }

    static final class d extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f32654a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f32656c;

        static final class a extends m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f32657a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(1);
                this.f32657a = hVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Function1 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (Boolean) it.invoke(this.f32657a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h hVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f32656c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return NativeResponse.this.new d(this.f32656c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((d) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f32654a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            CollectionsKt.E(NativeResponse.this.stateChangeOnceListeners, new a(this.f32656c));
            return Unit.f36324a;
        }
    }

    static final class e extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f32658a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f32659b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List list, Function1 function1) {
            super(1);
            this.f32658a = list;
            this.f32659b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(h newState) {
            Intrinsics.checkNotNullParameter(newState, "newState");
            if (!this.f32658a.contains(newState)) {
                return Boolean.FALSE;
            }
            this.f32659b.invoke(newState);
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeResponse(C3862a appContext, N coroutineScope) {
        super(appContext);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.sink = new g();
        this.state = h.INITIALIZED;
        this.stateChangeOnceListeners = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h N() {
        h hVar;
        synchronized (this) {
            hVar = this.state;
        }
        return hVar;
    }

    private final boolean Q(h... validStates) {
        if (AbstractC3574i.v(validStates, N())) {
            return false;
        }
        String S10 = AbstractC3574i.S(validStates, ",", null, null, 0, null, b.f32650a, 30, null);
        Log.w(f32643j, "Invalid state - currentState[" + N().getIntValue() + "] validStates[" + S10 + "]");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(InterfaceC3879g stream) {
        while (!stream.p0()) {
            try {
                h hVar = h.RESPONSE_RECEIVED;
                h hVar2 = h.BODY_STREAMING_STARTED;
                if (Q(hVar, hVar2, h.BODY_STREAMING_CANCELLED)) {
                    return;
                }
                if (N() == hVar) {
                    this.sink.a(stream.m().n0());
                } else if (N() != hVar2) {
                    return;
                } else {
                    b("didReceiveResponseData", stream.m().n0());
                }
            } catch (IOException e10) {
                this.error = e10;
                if (N() == h.BODY_STREAMING_STARTED) {
                    b("didFailWithError", e10);
                }
                y0(h.ERROR_RECEIVED);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(h hVar) {
        synchronized (this) {
            this.state = hVar;
            Unit unit = Unit.f36324a;
        }
        AbstractC0891k.d(this.coroutineScope, null, null, new d(hVar, null), 3, null);
    }

    private final Na.e z(F response) {
        int f10 = response.f();
        String r10 = response.r();
        v<Pair> p10 = response.p();
        ArrayList arrayList = new ArrayList(CollectionsKt.u(p10, 10));
        for (Pair pair : p10) {
            arrayList.add(t.a(pair.c(), pair.d()));
        }
        return new Na.e(arrayList, f10, r10, response.z().n().toString(), response.q());
    }

    public final void A0(List states, Function1 callback) {
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (states.contains(N())) {
            callback.invoke(N());
        } else {
            this.stateChangeOnceListeners.add(new e(states, callback));
        }
    }

    public final void C() {
        Na.c cVar = new Na.c();
        this.error = cVar;
        if (N() == h.BODY_STREAMING_STARTED) {
            b("didFailWithError", cVar);
        }
        y0(h.ERROR_RECEIVED);
    }

    public final boolean F() {
        return this.sink.c();
    }

    /* renamed from: H, reason: from getter */
    public final Exception getError() {
        return this.error;
    }

    /* renamed from: I, reason: from getter */
    public final Na.e getResponseInit() {
        return this.responseInit;
    }

    /* renamed from: K, reason: from getter */
    public final g getSink() {
        return this.sink;
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public void a() {
        this.sink.b();
        super.a();
    }

    @Override // Td.InterfaceC1230f
    public void c(InterfaceC1229e call, F response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        this.responseInit = z(response);
        y0(h.RESPONSE_RECEIVED);
        AbstractC0891k.d(this.coroutineScope, C0874b0.b(), null, new c(response, this, null), 2, null);
    }

    @Override // Td.InterfaceC1230f
    public void d(InterfaceC1229e call, IOException e10) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e10, "e");
        if (e10.getMessage() == "Canceled") {
            return;
        }
        h hVar = h.STARTED;
        h hVar2 = h.RESPONSE_RECEIVED;
        h hVar3 = h.BODY_STREAMING_STARTED;
        if (Q(hVar, hVar2, hVar3, h.BODY_STREAMING_CANCELLED)) {
            return;
        }
        if (N() == hVar3) {
            b("didFailWithError", e10);
        }
        this.error = e10;
        y0(h.ERROR_RECEIVED);
        b("readyForJSFinalization", new Object[0]);
    }

    public final void i0() {
        if (Q(h.INITIALIZED)) {
            return;
        }
        y0(h.STARTED);
    }

    public final void y() {
        if (Q(h.BODY_STREAMING_STARTED)) {
            return;
        }
        y0(h.BODY_STREAMING_CANCELLED);
    }

    public final byte[] z0() {
        h hVar = h.RESPONSE_RECEIVED;
        h hVar2 = h.BODY_COMPLETED;
        if (Q(hVar, hVar2)) {
            return null;
        }
        if (N() == hVar) {
            y0(h.BODY_STREAMING_STARTED);
            b("didReceiveResponseData", this.sink.b());
        } else if (N() == hVar2) {
            return this.sink.b();
        }
        return null;
    }
}
