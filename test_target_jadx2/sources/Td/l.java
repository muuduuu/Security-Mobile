package Td;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.PSKKeyManager;
import wc.InterfaceC5068n;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final ae.m f10136a;

    static final class a extends xc.m implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Zd.d f10137a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10138b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f10139c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10140d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10141e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f10142f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f10143g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f10144h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ae.q f10145i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Zd.d dVar, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, ae.q qVar) {
            super(3);
            this.f10137a = dVar;
            this.f10138b = i10;
            this.f10139c = i11;
            this.f10140d = i12;
            this.f10141e = i13;
            this.f10142f = i14;
            this.f10143g = z10;
            this.f10144h = z11;
            this.f10145i = qVar;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ae.f n(ae.m pool, C1225a address, ae.d user) {
            Intrinsics.checkNotNullParameter(pool, "pool");
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(user, "user");
            return new ae.h(new ae.i(new ae.n(this.f10137a, pool, this.f10138b, this.f10139c, this.f10140d, this.f10141e, this.f10142f, this.f10143g, this.f10144h, address, this.f10145i, user)), this.f10137a);
        }
    }

    public l(ae.m delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f10136a = delegate;
    }

    public final ae.m a() {
        return this.f10136a;
    }

    public /* synthetic */ l(int i10, long j10, TimeUnit timeUnit, Zd.d dVar, AbstractC1235k abstractC1235k, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11, ae.q qVar, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 5 : i10, (i16 & 2) != 0 ? 5L : j10, (i16 & 4) != 0 ? TimeUnit.MINUTES : timeUnit, (i16 & 8) != 0 ? Zd.d.f12525m : dVar, (i16 & 16) != 0 ? AbstractC1235k.f10134a.a() : abstractC1235k, (i16 & 32) != 0 ? 10000 : i11, (i16 & 64) != 0 ? 10000 : i12, (i16 & 128) != 0 ? 10000 : i13, (i16 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 10000 : i14, (i16 & 512) == 0 ? i15 : ModuleDescriptor.MODULE_VERSION, (i16 & 1024) != 0 ? true : z10, (i16 & 2048) == 0 ? z11 : true, (i16 & 4096) != 0 ? new ae.q() : qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(int i10, long j10, TimeUnit timeUnit, Zd.d taskRunner, AbstractC1235k connectionListener, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11, ae.q routeDatabase) {
        this(new ae.m(taskRunner, i10, j10, timeUnit, connectionListener, new a(taskRunner, i11, i12, i13, i14, i15, z10, z11, routeDatabase)));
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(int i10, long j10, TimeUnit timeUnit) {
        this(i10, j10, timeUnit, Zd.d.f12525m, AbstractC1235k.f10134a.a(), 0, 0, 0, 0, 0, false, false, null, 8160, null);
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    public l() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
