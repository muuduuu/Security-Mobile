package f1;

import Jd.AbstractC0891k;
import Jd.C0874b0;
import Jd.N;
import Jd.O;
import Jd.V;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.measurement.m;
import androidx.privacysandbox.ads.adservices.measurement.n;
import androidx.privacysandbox.ads.adservices.measurement.o;
import e1.AbstractC3070b;
import h8.d;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import pc.AbstractC3868b;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3136a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f32795a = new b(null);

    /* renamed from: f1.a$a, reason: collision with other inner class name */
    private static final class C0478a extends AbstractC3136a {

        /* renamed from: b, reason: collision with root package name */
        private final androidx.privacysandbox.ads.adservices.measurement.b f32796b;

        /* renamed from: f1.a$a$a, reason: collision with other inner class name */
        static final class C0479a extends l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f32797a;

            C0479a(androidx.privacysandbox.ads.adservices.measurement.a aVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return C0478a.this.new C0479a(null, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(N n10, kotlin.coroutines.d dVar) {
                return ((C0479a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = AbstractC3868b.e();
                int i10 = this.f32797a;
                if (i10 == 0) {
                    p.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0478a.this.f32796b;
                    this.f32797a = 1;
                    if (bVar.a(null, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return Unit.f36324a;
            }
        }

        /* renamed from: f1.a$a$b */
        static final class b extends l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f32799a;

            b(kotlin.coroutines.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return C0478a.this.new b(dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(N n10, kotlin.coroutines.d dVar) {
                return ((b) create(n10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = AbstractC3868b.e();
                int i10 = this.f32799a;
                if (i10 == 0) {
                    p.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0478a.this.f32796b;
                    this.f32799a = 1;
                    obj = bVar.b(this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return obj;
            }
        }

        /* renamed from: f1.a$a$c */
        static final class c extends l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f32801a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f32803c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InputEvent f32804d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f32803c = uri;
                this.f32804d = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return C0478a.this.new c(this.f32803c, this.f32804d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(N n10, kotlin.coroutines.d dVar) {
                return ((c) create(n10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = AbstractC3868b.e();
                int i10 = this.f32801a;
                if (i10 == 0) {
                    p.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0478a.this.f32796b;
                    Uri uri = this.f32803c;
                    InputEvent inputEvent = this.f32804d;
                    this.f32801a = 1;
                    if (bVar.c(uri, inputEvent, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return Unit.f36324a;
            }
        }

        /* renamed from: f1.a$a$d */
        static final class d extends l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f32805a;

            d(m mVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return C0478a.this.new d(null, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(N n10, kotlin.coroutines.d dVar) {
                return ((d) create(n10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = AbstractC3868b.e();
                int i10 = this.f32805a;
                if (i10 == 0) {
                    p.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0478a.this.f32796b;
                    this.f32805a = 1;
                    if (bVar.d(null, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return Unit.f36324a;
            }
        }

        /* renamed from: f1.a$a$e */
        static final class e extends l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f32807a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f32809c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Uri uri, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f32809c = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return C0478a.this.new e(this.f32809c, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(N n10, kotlin.coroutines.d dVar) {
                return ((e) create(n10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = AbstractC3868b.e();
                int i10 = this.f32807a;
                if (i10 == 0) {
                    p.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0478a.this.f32796b;
                    Uri uri = this.f32809c;
                    this.f32807a = 1;
                    if (bVar.e(uri, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return Unit.f36324a;
            }
        }

        /* renamed from: f1.a$a$f */
        static final class f extends l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f32810a;

            f(n nVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return C0478a.this.new f(null, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(N n10, kotlin.coroutines.d dVar) {
                return ((f) create(n10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = AbstractC3868b.e();
                int i10 = this.f32810a;
                if (i10 == 0) {
                    p.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0478a.this.f32796b;
                    this.f32810a = 1;
                    if (bVar.f(null, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return Unit.f36324a;
            }
        }

        /* renamed from: f1.a$a$g */
        static final class g extends l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f32812a;

            g(o oVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return C0478a.this.new g(null, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(N n10, kotlin.coroutines.d dVar) {
                return ((g) create(n10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = AbstractC3868b.e();
                int i10 = this.f32812a;
                if (i10 == 0) {
                    p.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0478a.this.f32796b;
                    this.f32812a = 1;
                    if (bVar.g(null, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return Unit.f36324a;
            }
        }

        public C0478a(androidx.privacysandbox.ads.adservices.measurement.b mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.f32796b = mMeasurementManager;
        }

        @Override // f1.AbstractC3136a
        public h8.d b() {
            V b10;
            b10 = AbstractC0891k.b(O.a(C0874b0.a()), null, null, new b(null), 3, null);
            return AbstractC3070b.c(b10, null, 1, null);
        }

        @Override // f1.AbstractC3136a
        public h8.d c(Uri trigger) {
            V b10;
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            b10 = AbstractC0891k.b(O.a(C0874b0.a()), null, null, new e(trigger, null), 3, null);
            return AbstractC3070b.c(b10, null, 1, null);
        }

        public h8.d e(androidx.privacysandbox.ads.adservices.measurement.a deletionRequest) {
            V b10;
            Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
            b10 = AbstractC0891k.b(O.a(C0874b0.a()), null, null, new C0479a(deletionRequest, null), 3, null);
            return AbstractC3070b.c(b10, null, 1, null);
        }

        public h8.d f(Uri attributionSource, InputEvent inputEvent) {
            V b10;
            Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
            b10 = AbstractC0891k.b(O.a(C0874b0.a()), null, null, new c(attributionSource, inputEvent, null), 3, null);
            return AbstractC3070b.c(b10, null, 1, null);
        }

        public h8.d g(m request) {
            V b10;
            Intrinsics.checkNotNullParameter(request, "request");
            b10 = AbstractC0891k.b(O.a(C0874b0.a()), null, null, new d(request, null), 3, null);
            return AbstractC3070b.c(b10, null, 1, null);
        }

        public h8.d h(n request) {
            V b10;
            Intrinsics.checkNotNullParameter(request, "request");
            b10 = AbstractC0891k.b(O.a(C0874b0.a()), null, null, new f(request, null), 3, null);
            return AbstractC3070b.c(b10, null, 1, null);
        }

        public h8.d i(o request) {
            V b10;
            Intrinsics.checkNotNullParameter(request, "request");
            b10 = AbstractC0891k.b(O.a(C0874b0.a()), null, null, new g(request, null), 3, null);
            return AbstractC3070b.c(b10, null, 1, null);
        }
    }

    /* renamed from: f1.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC3136a a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            androidx.privacysandbox.ads.adservices.measurement.b a10 = androidx.privacysandbox.ads.adservices.measurement.b.f17202a.a(context);
            if (a10 != null) {
                return new C0478a(a10);
            }
            return null;
        }

        private b() {
        }
    }

    public static final AbstractC3136a a(Context context) {
        return f32795a.a(context);
    }

    public abstract d b();

    public abstract d c(Uri uri);
}
