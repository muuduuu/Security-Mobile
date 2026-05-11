package Nb;

import D7.InterfaceC0781e;
import D7.InterfaceC0782f;
import D7.InterfaceC0783g;
import Nb.l;
import Nb.q;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.location.records.LocationLastKnownOptions;
import expo.modules.location.records.LocationOptions;
import expo.modules.location.records.LocationResponse;
import expo.modules.location.records.PermissionRequestResponse;
import fc.C3164b;
import fc.EnumC3163a;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import mb.InterfaceC3663a;
import pb.m;
import pc.AbstractC3868b;
import x7.C5118a;
import x7.InterfaceC5121d;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6625a = new a(null);

    public static final class a {

        /* renamed from: Nb.l$a$a, reason: collision with other inner class name */
        public static final class C0131a implements pb.m {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.d f6626a;

            C0131a(kotlin.coroutines.d dVar) {
                this.f6626a = dVar;
            }

            @Override // pb.m
            public void a(String str) {
                m.a.f(this, str);
            }

            @Override // pb.m
            public void b(boolean z10) {
                m.a.h(this, z10);
            }

            @Override // pb.m
            public void c() {
                m.a.b(this);
            }

            @Override // pb.m
            public void d(Collection collection) {
                m.a.g(this, collection);
            }

            @Override // pb.m
            public void e(int i10) {
                m.a.e(this, i10);
            }

            @Override // pb.m
            public void f(double d10) {
                m.a.c(this, d10);
            }

            @Override // pb.m
            public void g(float f10) {
                m.a.d(this, f10);
            }

            @Override // pb.m
            public void h(CodedException codedException) {
                m.a.a(this, codedException);
            }

            @Override // pb.m
            public void reject(String code, String str, Throwable th) {
                Intrinsics.checkNotNullParameter(code, "code");
                kotlin.coroutines.d dVar = this.f6626a;
                o.a aVar = lc.o.f37128b;
                dVar.resumeWith(lc.o.b(lc.p.a(new CodedException(code, str, th))));
            }

            @Override // pb.m
            public void resolve(Object obj) {
                kotlin.coroutines.d dVar = this.f6626a;
                Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
                if (bundle == null) {
                    throw new C1003b(Object.class, Bundle.class, "value returned by the permission promise is not a Bundle");
                }
                dVar.resumeWith(lc.o.b(bundle));
            }
        }

        public static final class b implements pb.m {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.d f6627a;

            b(kotlin.coroutines.d dVar) {
                this.f6627a = dVar;
            }

            @Override // pb.m
            public void a(String str) {
                m.a.f(this, str);
            }

            @Override // pb.m
            public void b(boolean z10) {
                m.a.h(this, z10);
            }

            @Override // pb.m
            public void c() {
                m.a.b(this);
            }

            @Override // pb.m
            public void d(Collection collection) {
                m.a.g(this, collection);
            }

            @Override // pb.m
            public void e(int i10) {
                m.a.e(this, i10);
            }

            @Override // pb.m
            public void f(double d10) {
                m.a.c(this, d10);
            }

            @Override // pb.m
            public void g(float f10) {
                m.a.d(this, f10);
            }

            @Override // pb.m
            public void h(CodedException codedException) {
                m.a.a(this, codedException);
            }

            @Override // pb.m
            public void reject(String code, String str, Throwable th) {
                Intrinsics.checkNotNullParameter(code, "code");
                kotlin.coroutines.d dVar = this.f6627a;
                o.a aVar = lc.o.f37128b;
                dVar.resumeWith(lc.o.b(lc.p.a(new CodedException(code, str, th))));
            }

            @Override // pb.m
            public void resolve(Object obj) {
                Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
                if (bundle == null) {
                    throw new C1003b(Object.class, Bundle.class, "value returned by the permission promise is not a Bundle");
                }
                kotlin.coroutines.d dVar = this.f6627a;
                o.a aVar = lc.o.f37128b;
                dVar.resumeWith(lc.o.b(new PermissionRequestResponse(bundle)));
            }
        }

        public static final class c implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f6628a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f6629b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ pb.m f6630c;

            c(p pVar, int i10, pb.m mVar) {
                this.f6628a = pVar;
                this.f6629b = i10;
                this.f6630c = mVar;
            }

            @Override // Nb.q
            public void a(CodedException cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f6630c.h(cause);
            }

            @Override // Nb.q
            public void b() {
                this.f6630c.resolve(null);
            }

            @Override // Nb.q
            public void c(CodedException codedException) {
                q.a.a(this, codedException);
            }

            @Override // Nb.q
            public void onLocationChanged(Location location) {
                Intrinsics.checkNotNullParameter(location, "location");
                this.f6628a.j0(this.f6629b, new LocationResponse(location));
            }
        }

        static final class d extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ pb.m f6631a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(pb.m mVar) {
                super(1);
                this.f6631a = mVar;
            }

            public final void a(Location location) {
                if (location == null) {
                    this.f6631a.h(new C1004c());
                } else {
                    this.f6631a.resolve(new LocationResponse(location));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Location) obj);
                return Unit.f36324a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final C3164b.a e(int i10) {
            switch (i10) {
                case 1:
                    C3164b.a d10 = new C3164b.a().b(EnumC3163a.LOWEST).c(3000.0f).d(10000L);
                    Intrinsics.checkNotNullExpressionValue(d10, "setInterval(...)");
                    return d10;
                case 2:
                    C3164b.a d11 = new C3164b.a().b(EnumC3163a.LOW).c(1000.0f).d(5000L);
                    Intrinsics.checkNotNullExpressionValue(d11, "setInterval(...)");
                    return d11;
                case 3:
                    C3164b.a d12 = new C3164b.a().b(EnumC3163a.MEDIUM).c(100.0f).d(3000L);
                    Intrinsics.checkNotNullExpressionValue(d12, "setInterval(...)");
                    return d12;
                case 4:
                    C3164b.a d13 = new C3164b.a().b(EnumC3163a.HIGH).c(50.0f).d(2000L);
                    Intrinsics.checkNotNullExpressionValue(d13, "setInterval(...)");
                    return d13;
                case 5:
                    C3164b.a d14 = new C3164b.a().b(EnumC3163a.HIGH).c(25.0f).d(1000L);
                    Intrinsics.checkNotNullExpressionValue(d14, "setInterval(...)");
                    return d14;
                case 6:
                    C3164b.a d15 = new C3164b.a().b(EnumC3163a.HIGH).c(0.0f).d(500L);
                    Intrinsics.checkNotNullExpressionValue(d15, "setInterval(...)");
                    return d15;
                default:
                    C3164b.a d16 = new C3164b.a().b(EnumC3163a.MEDIUM).c(100.0f).d(3000L);
                    Intrinsics.checkNotNullExpressionValue(d16, "setInterval(...)");
                    return d16;
            }
        }

        private final int j(int i10) {
            switch (i10) {
                case 1:
                    return 104;
                case 2:
                case 3:
                default:
                    return 102;
                case 4:
                case 5:
                case 6:
                    return 100;
            }
        }

        private final C3164b k(LocationOptions locationOptions) {
            C3164b.a e10 = e(locationOptions.getAccuracy());
            Long timeInterval = locationOptions.getTimeInterval();
            if (timeInterval != null) {
                e10.d(timeInterval.longValue());
            }
            if (locationOptions.getDistanceInterval() != null) {
                e10.c(r4.intValue());
            }
            C3164b a10 = e10.a();
            Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
            return a10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(pb.m promise, Exception it) {
            Intrinsics.checkNotNullParameter(promise, "$promise");
            Intrinsics.checkNotNullParameter(it, "it");
            promise.h(new s(it));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(pb.m promise) {
            Intrinsics.checkNotNullParameter(promise, "$promise");
            promise.h(new r());
        }

        public final Object d(InterfaceC3663a interfaceC3663a, String[] strArr, kotlin.coroutines.d dVar) {
            kotlin.coroutines.h hVar = new kotlin.coroutines.h(AbstractC3868b.c(dVar));
            InterfaceC3663a.d(interfaceC3663a, new C0131a(hVar), (String[]) Arrays.copyOf(strArr, strArr.length));
            Object a10 = hVar.a();
            if (a10 == AbstractC3868b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return a10;
        }

        public final Object f(InterfaceC3663a interfaceC3663a, String[] strArr, kotlin.coroutines.d dVar) {
            kotlin.coroutines.h hVar = new kotlin.coroutines.h(AbstractC3868b.c(dVar));
            InterfaceC3663a.a(interfaceC3663a, new b(hVar), (String[]) Arrays.copyOf(strArr, strArr.length));
            Object a10 = hVar.a();
            if (a10 == AbstractC3868b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return a10;
        }

        public final boolean g(Context context) {
            if (context == null) {
                return false;
            }
            Object systemService = context.getSystemService("location");
            LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
            return locationManager != null && locationManager.isProviderEnabled("network");
        }

        public final boolean h(Context context) {
            Object systemService = context != null ? context.getSystemService("location") : null;
            LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
            if (locationManager == null) {
                return false;
            }
            return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        }

        public final boolean i(Location location, LocationLastKnownOptions options) {
            Intrinsics.checkNotNullParameter(options, "options");
            if (location == null) {
                return false;
            }
            Double maxAge = options.getMaxAge();
            double doubleValue = maxAge != null ? maxAge.doubleValue() : Double.MAX_VALUE;
            Double requiredAccuracy = options.getRequiredAccuracy();
            return ((double) (System.currentTimeMillis() - location.getTime())) <= doubleValue && ((double) location.getAccuracy()) <= (requiredAccuracy != null ? requiredAccuracy.doubleValue() : Double.MAX_VALUE);
        }

        public final C5118a l(LocationOptions options) {
            Intrinsics.checkNotNullParameter(options, "options");
            C3164b k10 = k(options);
            C5118a.C0654a c0654a = new C5118a.C0654a();
            c0654a.b(0);
            c0654a.d(l.f6625a.j(options.getAccuracy()));
            c0654a.c(k10.c());
            C5118a a10 = c0654a.a();
            Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
            return a10;
        }

        public final LocationRequest m(LocationOptions options) {
            Intrinsics.checkNotNullParameter(options, "options");
            C3164b k10 = k(options);
            LocationRequest a10 = new LocationRequest.a(k10.c()).g(k10.c()).e(k10.c()).f(k10.b()).h(j(options.getAccuracy())).a();
            Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
            return a10;
        }

        public final void n(p locationModule, LocationRequest locationRequest, int i10, pb.m promise) {
            Intrinsics.checkNotNullParameter(locationModule, "locationModule");
            Intrinsics.checkNotNullParameter(locationRequest, "locationRequest");
            Intrinsics.checkNotNullParameter(promise, "promise");
            locationModule.d0(locationRequest, Integer.valueOf(i10), new c(locationModule, i10, promise));
        }

        public final void o(InterfaceC5121d locationProvider, C5118a locationRequest, final pb.m promise) {
            Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
            Intrinsics.checkNotNullParameter(locationRequest, "locationRequest");
            Intrinsics.checkNotNullParameter(promise, "promise");
            try {
                Task g10 = locationProvider.g(locationRequest, null);
                final d dVar = new d(promise);
                g10.f(new InterfaceC0783g() { // from class: Nb.i
                    @Override // D7.InterfaceC0783g
                    public final void onSuccess(Object obj) {
                        l.a.p(Function1.this, obj);
                    }
                }).d(new InterfaceC0782f() { // from class: Nb.j
                    @Override // D7.InterfaceC0782f
                    public final void b(Exception exc) {
                        l.a.q(pb.m.this, exc);
                    }
                }).a(new InterfaceC0781e() { // from class: Nb.k
                    @Override // D7.InterfaceC0781e
                    public final void a() {
                        l.a.r(pb.m.this);
                    }
                });
            } catch (SecurityException e10) {
                promise.h(new s(e10));
            }
        }

        private a() {
        }
    }
}
