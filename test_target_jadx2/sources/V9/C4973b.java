package v9;

import android.app.Application;
import java.util.HashMap;
import kotlin.collections.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import ma.InterfaceC3662a;

/* renamed from: v9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4973b {

    /* renamed from: a, reason: collision with root package name */
    private final Application f44015a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f44016b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3662a f44017c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f44018d;

    /* renamed from: e, reason: collision with root package name */
    private final String f44019e;

    /* renamed from: f, reason: collision with root package name */
    private final long f44020f;

    /* renamed from: g, reason: collision with root package name */
    private final h f44021g;

    /* renamed from: v9.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Application f44022a;

        /* renamed from: b, reason: collision with root package name */
        private final h f44023b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3662a f44024c;

        /* renamed from: d, reason: collision with root package name */
        private final String f44025d;

        /* renamed from: e, reason: collision with root package name */
        private final long f44026e;

        /* renamed from: f, reason: collision with root package name */
        private HashMap f44027f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f44028g;

        public a(Application app, h primarySyncConfiguration, InterfaceC3662a skynet, String appId, long j10) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(primarySyncConfiguration, "primarySyncConfiguration");
            Intrinsics.checkNotNullParameter(skynet, "skynet");
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.f44022a = app;
            this.f44023b = primarySyncConfiguration;
            this.f44024c = skynet;
            this.f44025d = appId;
            this.f44026e = j10;
            this.f44027f = G.j(t.a(g.EVENTS, primarySyncConfiguration));
        }

        public final C4973b a() {
            return new C4973b(this.f44022a, this.f44027f, this.f44024c, this.f44028g, this.f44025d, this.f44026e, null);
        }

        public final a b(boolean z10) {
            this.f44028g = z10;
            return this;
        }
    }

    public /* synthetic */ C4973b(Application application, HashMap hashMap, InterfaceC3662a interfaceC3662a, boolean z10, String str, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, hashMap, interfaceC3662a, z10, str, j10);
    }

    public final Application a() {
        return this.f44015a;
    }

    public final String b() {
        return this.f44019e;
    }

    public final boolean c() {
        return this.f44018d;
    }

    public final long d() {
        return this.f44020f;
    }

    public final InterfaceC3662a e() {
        return this.f44017c;
    }

    public final HashMap f() {
        return this.f44016b;
    }

    private C4973b(Application application, HashMap hashMap, InterfaceC3662a interfaceC3662a, boolean z10, String str, long j10) {
        this.f44015a = application;
        this.f44016b = hashMap;
        this.f44017c = interfaceC3662a;
        this.f44018d = z10;
        this.f44019e = str;
        this.f44020f = j10;
        Object obj = hashMap.get(g.EVENTS);
        Intrinsics.d(obj);
        this.f44021g = (h) obj;
    }
}
