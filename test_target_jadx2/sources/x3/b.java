package X3;

import Td.B;
import Td.C1228d;
import Td.D;
import Td.F;
import Td.G;
import Td.InterfaceC1229e;
import Td.InterfaceC1230f;
import X3.b;
import a4.C1349a;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.AbstractC1837d;
import com.facebook.imagepipeline.producers.AbstractC1839f;
import com.facebook.imagepipeline.producers.C;
import com.facebook.imagepipeline.producers.InterfaceC1847n;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.e0;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.t;

/* loaded from: classes.dex */
public class b extends AbstractC1837d {

    /* renamed from: d, reason: collision with root package name */
    private static final a f11738d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1229e.a f11739a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f11740b;

    /* renamed from: c, reason: collision with root package name */
    private final C1228d f11741c;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: X3.b$b, reason: collision with other inner class name */
    public static final class C0218b extends C {

        /* renamed from: f, reason: collision with root package name */
        public long f11742f;

        /* renamed from: g, reason: collision with root package name */
        public long f11743g;

        /* renamed from: h, reason: collision with root package name */
        public long f11744h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0218b(InterfaceC1847n consumer, e0 producerContext) {
            super(consumer, producerContext);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        }
    }

    public static final class c extends AbstractC1839f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1229e f11745a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f11746b;

        c(InterfaceC1229e interfaceC1229e, b bVar) {
            this.f11745a = interfaceC1229e;
            this.f11746b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(InterfaceC1229e interfaceC1229e) {
            interfaceC1229e.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            if (!Intrinsics.b(Looper.myLooper(), Looper.getMainLooper())) {
                this.f11745a.cancel();
                return;
            }
            Executor executor = this.f11746b.f11740b;
            final InterfaceC1229e interfaceC1229e = this.f11745a;
            executor.execute(new Runnable() { // from class: X3.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.f(InterfaceC1229e.this);
                }
            });
        }
    }

    public static final class d implements InterfaceC1230f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0218b f11747a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f11748b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X.a f11749c;

        d(C0218b c0218b, b bVar, X.a aVar) {
            this.f11747a = c0218b;
            this.f11748b = bVar;
            this.f11749c = aVar;
        }

        @Override // Td.InterfaceC1230f
        public void c(InterfaceC1229e call, F response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f11747a.f11743g = SystemClock.elapsedRealtime();
            G b10 = response.b();
            Unit unit = null;
            if (b10 != null) {
                b bVar = this.f11748b;
                X.a aVar = this.f11749c;
                C0218b c0218b = this.f11747a;
                try {
                    try {
                        if (response.isSuccessful()) {
                            C1349a c10 = C1349a.f12568c.c(response.l("Content-Range"));
                            if (c10 != null && (c10.f12570a != 0 || c10.f12571b != Integer.MAX_VALUE)) {
                                c0218b.j(c10);
                                c0218b.i(8);
                            }
                            aVar.b(b10.a(), b10.e() < 0 ? 0 : (int) b10.e());
                        } else {
                            bVar.l(call, new IOException("Unexpected HTTP code " + response), aVar);
                        }
                    } catch (Exception e10) {
                        bVar.l(call, e10, aVar);
                    }
                    Unit unit2 = Unit.f36324a;
                    kotlin.io.c.a(b10, null);
                    unit = Unit.f36324a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kotlin.io.c.a(b10, th);
                        throw th2;
                    }
                }
            }
            if (unit == null) {
                this.f11748b.l(call, new IOException("Response body null: " + response), this.f11749c);
            }
        }

        @Override // Td.InterfaceC1230f
        public void d(InterfaceC1229e call, IOException e10) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e10, "e");
            this.f11748b.l(call, e10, this.f11749c);
        }
    }

    public /* synthetic */ b(InterfaceC1229e.a aVar, Executor executor, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, executor, (i10 & 4) != 0 ? true : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(InterfaceC1229e interfaceC1229e, Exception exc, X.a aVar) {
        if (interfaceC1229e.e()) {
            aVar.a();
        } else {
            aVar.onFailure(exc);
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0218b e(InterfaceC1847n consumer, e0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        return new C0218b(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void d(C0218b fetchState, X.a callback) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fetchState.f11742f = SystemClock.elapsedRealtime();
        Uri g10 = fetchState.g();
        Intrinsics.checkNotNullExpressionValue(g10, "fetchState.uri");
        try {
            D.a requestBuilder = new D.a().x(g10.toString()).e();
            C1228d c1228d = this.f11741c;
            if (c1228d != null) {
                Intrinsics.checkNotNullExpressionValue(requestBuilder, "requestBuilder");
                requestBuilder.c(c1228d);
            }
            C1349a b10 = fetchState.b().c().b();
            if (b10 != null) {
                requestBuilder.a("Range", b10.d());
            }
            D b11 = requestBuilder.b();
            Intrinsics.checkNotNullExpressionValue(b11, "requestBuilder.build()");
            j(fetchState, callback, b11);
        } catch (Exception e10) {
            callback.onFailure(e10);
        }
    }

    protected void j(C0218b fetchState, X.a callback, D request) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(request, "request");
        InterfaceC1229e a10 = this.f11739a.a(request);
        fetchState.b().d(new c(a10, this));
        a10.g1(new d(fetchState, this, callback));
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map c(C0218b fetchState, int i10) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        return kotlin.collections.G.k(t.a("queue_time", String.valueOf(fetchState.f11743g - fetchState.f11742f)), t.a("fetch_time", String.valueOf(fetchState.f11744h - fetchState.f11743g)), t.a("total_time", String.valueOf(fetchState.f11744h - fetchState.f11742f)), t.a("image_size", String.valueOf(i10)));
    }

    @Override // com.facebook.imagepipeline.producers.X
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void a(C0218b fetchState, int i10) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        fetchState.f11744h = SystemClock.elapsedRealtime();
    }

    public b(InterfaceC1229e.a callFactory, Executor cancellationExecutor, boolean z10) {
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(cancellationExecutor, "cancellationExecutor");
        this.f11739a = callFactory;
        this.f11740b = cancellationExecutor;
        this.f11741c = z10 ? new C1228d.a().m().a() : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(B okHttpClient) {
        this(okHttpClient, r3, false, 4, null);
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        ExecutorService c10 = okHttpClient.o().c();
        Intrinsics.checkNotNullExpressionValue(c10, "okHttpClient.dispatcher().executorService()");
    }
}
