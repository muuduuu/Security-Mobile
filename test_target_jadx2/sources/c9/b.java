package C9;

import Td.B;
import Td.D;
import Td.E;
import Td.F;
import Td.InterfaceC1229e;
import Td.InterfaceC1230f;
import Td.v;
import j9.C3519a;
import java.io.IOException;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc.i;
import lc.t;
import v9.C4973b;
import v9.g;
import v9.h;
import xc.m;
import z9.InterfaceC5264a;

/* loaded from: classes2.dex */
public final class b implements C9.a {

    /* renamed from: a, reason: collision with root package name */
    private final C4973b f1055a;

    /* renamed from: b, reason: collision with root package name */
    private final F9.a f1056b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1057c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f1058d;

    static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1059a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B invoke() {
            return ((C3519a) InterfaceC5264a.f45781a.a().j().e().get()).c();
        }
    }

    /* renamed from: C9.b$b, reason: collision with other inner class name */
    static final class C0017b extends m implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f1061b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f1062c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0017b(g gVar, Function1 function1) {
            super(0);
            this.f1061b = gVar;
            this.f1062c = function1;
        }

        public final void a() {
            F9.d.g(F9.d.f2658a, b.this.f1057c, "performRequest(" + this.f1061b + "): synced", null, 4, null);
            InterfaceC5264a.f45781a.a().a(0);
            this.f1062c.invoke(Boolean.TRUE);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    static final class c extends m implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f1064b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f1065c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g gVar, Function1 function1) {
            super(1);
            this.f1064b = gVar;
            this.f1065c = function1;
        }

        public final void a(Exception e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            Ge.a.f3026a.d(b.this.f1057c).b(e10, "performRequest(" + this.f1064b + "): failed with exception " + e10.getMessage(), new Object[0]);
            InterfaceC5264a a10 = InterfaceC5264a.f45781a.a();
            a10.a(a10.f() + 1);
            this.f1065c.invoke(Boolean.FALSE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Exception) obj);
            return Unit.f36324a;
        }
    }

    public static final class d implements InterfaceC1230f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f1066a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1067b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0 f1068c;

        d(Function1 function1, String str, Function0 function0) {
            this.f1066a = function1;
            this.f1067b = str;
            this.f1068c = function0;
        }

        @Override // Td.InterfaceC1230f
        public void c(InterfaceC1229e call, F response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.isSuccessful()) {
                this.f1068c.invoke();
                return;
            }
            this.f1066a.invoke(new Exception("post(" + this.f1067b + "): failed with status code: " + response.f()));
        }

        @Override // Td.InterfaceC1230f
        public void d(InterfaceC1229e call, IOException e10) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e10, "e");
            this.f1066a.invoke(e10);
        }
    }

    public b(C4973b config, F9.a deviceInfo) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.f1055a = config;
        this.f1056b = deviceInfo;
        this.f1057c = "Gobbler.HttpService";
        this.f1058d = i.a(a.f1059a);
    }

    private final B c() {
        return (B) this.f1058d.getValue();
    }

    private final void e(String str, E e10, Map map, Function0 function0, Function1 function1) {
        try {
            D b10 = new D.a().x(str).m(v.f10217b.a(map)).o(e10).b();
            c().a(b10).g1(new d(function1, str, function0));
        } catch (Exception e11) {
            function1.invoke(e11);
        }
    }

    @Override // C9.a
    public void a(byte[] eventRequestBytes, g serviceName, Function1 onRequest) {
        Intrinsics.checkNotNullParameter(eventRequestBytes, "eventRequestBytes");
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(onRequest, "onRequest");
        h hVar = (h) this.f1055a.f().get(serviceName);
        if (hVar != null) {
            e(hVar.a(), E.a.r(E.Companion, eventRequestBytes, null, 0, 0, 7, null), d(hVar), new C0017b(serviceName, onRequest), new c(serviceName, onRequest));
            return;
        }
        F9.d.g(F9.d.f2658a, this.f1057c, "performRequest(" + serviceName + "): sync not configured", null, 4, null);
        onRequest.invoke(Boolean.FALSE);
    }

    public Map d(h syncConfig) {
        Intrinsics.checkNotNullParameter(syncConfig, "syncConfig");
        Map l10 = G.l(t.a("X-API-KEY", syncConfig.b()));
        l10.put("Content-Type", "application/x-protobuf");
        l10.put("PLATFORM", this.f1056b.j());
        l10.put("APP-VERSION", this.f1056b.h());
        l10.put("SDK-VERSION", this.f1056b.i());
        return l10;
    }
}
