package A9;

import com.google.protobuf.AbstractC2877h;
import com.google.protobuf.AbstractC2891w;
import com.groww.ems.EventRequestV2.EventRequestV2OuterClass$DeviceContext;
import com.groww.ems.EventRequestV2.EventRequestV2OuterClass$Event;
import com.groww.ems.EventRequestV2.EventRequestV2OuterClass$EventContext;
import com.groww.ems.EventRequestV2.EventRequestV2OuterClass$UserContext;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pc.AbstractC3868b;
import v9.C4973b;
import v9.C4974c;
import v9.EnumC4972a;
import v9.g;
import v9.i;
import z9.InterfaceC5264a;

/* loaded from: classes2.dex */
public final class b implements A9.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f393d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final F9.a f394a;

    /* renamed from: b, reason: collision with root package name */
    private final E9.a f395b;

    /* renamed from: c, reason: collision with root package name */
    private final C4973b f396c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(F9.a deviceInfo, E9.a gobblerRepository, C4973b configuration) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(gobblerRepository, "gobblerRepository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f394a = deviceInfo;
        this.f395b = gobblerRepository;
        this.f396c = configuration;
    }

    private final EventRequestV2OuterClass$DeviceContext d() {
        EventRequestV2OuterClass$DeviceContext.a newBuilder = EventRequestV2OuterClass$DeviceContext.newBuilder();
        newBuilder.w(this.f394a.d());
        newBuilder.x(InterfaceC5264a.f45781a.a().k());
        newBuilder.y(this.f396c.d());
        newBuilder.C(this.f394a.j());
        newBuilder.D(this.f394a.e());
        newBuilder.z(this.f394a.b());
        newBuilder.A(this.f394a.g());
        newBuilder.s(this.f394a.a());
        newBuilder.B(this.f394a.f());
        newBuilder.E(f());
        newBuilder.q(this.f394a.h());
        newBuilder.p(this.f394a.c());
        newBuilder.o(this.f396c.a().getPackageName());
        newBuilder.v(this.f394a.f());
        AbstractC2891w b10 = newBuilder.b();
        Intrinsics.checkNotNullExpressionValue(b10, "build(...)");
        return (EventRequestV2OuterClass$DeviceContext) b10;
    }

    private final EventRequestV2OuterClass$EventContext e() {
        C4974c g10 = InterfaceC5264a.f45781a.a().g();
        EventRequestV2OuterClass$EventContext.a newBuilder = EventRequestV2OuterClass$EventContext.newBuilder();
        newBuilder.s(g10.d());
        newBuilder.o(g10.a());
        newBuilder.q(g10.c());
        newBuilder.p(g10.b());
        AbstractC2891w b10 = newBuilder.b();
        Intrinsics.checkNotNullExpressionValue(b10, "build(...)");
        return (EventRequestV2OuterClass$EventContext) b10;
    }

    private final String f() {
        if (this.f396c.b().length() <= 0) {
            return this.f394a.i();
        }
        return this.f396c.b() + "-" + this.f394a.i();
    }

    private final EventRequestV2OuterClass$UserContext g() {
        i d10 = InterfaceC5264a.f45781a.a().d();
        EventRequestV2OuterClass$UserContext.a newBuilder = EventRequestV2OuterClass$UserContext.newBuilder();
        newBuilder.s(d10.d());
        newBuilder.p(d10.c());
        newBuilder.q(d10.a());
        newBuilder.o(d10.b());
        AbstractC2891w b10 = newBuilder.b();
        Intrinsics.checkNotNullExpressionValue(b10, "build(...)");
        return (EventRequestV2OuterClass$UserContext) b10;
    }

    @Override // A9.a
    public Object a(String str, byte[] bArr, g gVar, EnumC4972a enumC4972a, Long l10, boolean z10, d dVar) {
        long longValue = l10 != null ? l10.longValue() : System.currentTimeMillis();
        String d10 = this.f394a.d();
        F9.d dVar2 = F9.d.f2658a;
        String e10 = F9.d.e(dVar2, longValue + "-" + d10 + "-" + str + "-" + bArr, null, 2, null);
        EventRequestV2OuterClass$UserContext g10 = g();
        EventRequestV2OuterClass$DeviceContext d11 = d();
        EventRequestV2OuterClass$EventContext e11 = e();
        EventRequestV2OuterClass$Event.a newBuilder = EventRequestV2OuterClass$Event.newBuilder();
        newBuilder.v(e10);
        newBuilder.w(str);
        newBuilder.q(AbstractC2877h.k(bArr));
        newBuilder.z(g10);
        newBuilder.y(enumC4972a.name());
        newBuilder.o(z10);
        newBuilder.p(d11);
        newBuilder.x(longValue);
        newBuilder.s(e11);
        EventRequestV2OuterClass$Event eventRequestV2OuterClass$Event = (EventRequestV2OuterClass$Event) newBuilder.b();
        F9.d.g(dVar2, "EventProcessorImpl", "Event processed: " + str + " at " + longValue + ", \nHash: " + e10 + ", \nService: " + gVar + ", \nUserContext: " + g10 + ", \nDeviceContext: " + d11 + ", \nEventContext: " + e11 + ", \nApplication State: " + enumC4972a + ", \nFrom Buffer: " + z10, null, 4, null);
        E9.a aVar = this.f395b;
        Intrinsics.d(eventRequestV2OuterClass$Event);
        Object c10 = aVar.c(e10, longValue, eventRequestV2OuterClass$Event, gVar, dVar);
        return c10 == AbstractC3868b.e() ? c10 : Unit.f36324a;
    }

    @Override // A9.a
    public boolean b(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return InterfaceC5264a.f45781a.a().i().getBlacklist().contains(eventName);
    }

    @Override // A9.a
    public boolean c(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return eventName.length() > 0 && eventName.length() <= 40 && !StringsKt.K(eventName, "$", false, 2, null) && !StringsKt.K(eventName, ".", false, 2, null);
    }
}
