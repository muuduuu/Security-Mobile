package q8;

import I0.C0838d;
import I0.InterfaceC0843i;
import Jd.AbstractC0889j;
import Jd.N;
import L0.i;
import M0.f;
import M0.j;
import Md.e;
import Md.g;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.k;
import lc.p;
import pc.AbstractC3868b;
import xc.C5142C;
import xc.w;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ k[] f38837f = {C5142C.l(new w(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: a, reason: collision with root package name */
    private final Context f38838a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38839b;

    /* renamed from: c, reason: collision with root package name */
    private final ThreadLocal f38840c;

    /* renamed from: d, reason: collision with root package name */
    private final Ac.c f38841d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC0843i f38842e;

    static final class a extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f38843a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f38845c;

        /* renamed from: q8.c$a$a, reason: collision with other inner class name */
        static final class C0599a extends l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f38846a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f38847b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1 f38848c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0599a(Function1 function1, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f38848c = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                C0599a c0599a = new C0599a(this.f38848c, dVar);
                c0599a.f38847b = obj;
                return c0599a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(M0.c cVar, kotlin.coroutines.d dVar) {
                return ((C0599a) create(cVar, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC3868b.e();
                if (this.f38846a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
                this.f38848c.invoke((M0.c) this.f38847b);
                return Unit.f36324a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f38845c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return c.this.new a(this.f38845c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f38843a;
            try {
                if (i10 == 0) {
                    p.b(obj);
                    if (Intrinsics.b(c.this.f38840c.get(), kotlin.coroutines.jvm.internal.b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    c.this.f38840c.set(kotlin.coroutines.jvm.internal.b.a(true));
                    InterfaceC0843i interfaceC0843i = c.this.f38842e;
                    C0599a c0599a = new C0599a(this.f38845c, null);
                    this.f38843a = 1;
                    obj = j.a(interfaceC0843i, c0599a, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                return (f) obj;
            } finally {
                c.this.f38840c.set(kotlin.coroutines.jvm.internal.b.a(false));
            }
        }
    }

    static final class b extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f38849a;

        b(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return c.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((b) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Map a10;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f38849a;
            if (i10 == 0) {
                p.b(obj);
                e data = c.this.f38842e.getData();
                this.f38849a = 1;
                obj = g.j(data, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (a10 = fVar.a()) == null) ? G.h() : a10;
        }
    }

    /* renamed from: q8.c$c, reason: collision with other inner class name */
    static final class C0600c extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f38851a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a f38853c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f38854d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0600c(f.a aVar, Object obj, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f38853c = aVar;
            this.f38854d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return c.this.new C0600c(this.f38853c, this.f38854d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((C0600c) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b10;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f38851a;
            if (i10 == 0) {
                p.b(obj);
                e data = c.this.f38842e.getData();
                this.f38851a = 1;
                obj = g.j(data, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (b10 = fVar.b(this.f38853c)) == null) ? this.f38854d : b10;
        }
    }

    static final class d extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f38855a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a f38857c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f38858d;

        static final class a extends l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f38859a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f38860b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ f.a f38861c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f38862d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f.a aVar, Object obj, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f38861c = aVar;
                this.f38862d = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                a aVar = new a(this.f38861c, this.f38862d, dVar);
                aVar.f38860b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(M0.c cVar, kotlin.coroutines.d dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC3868b.e();
                if (this.f38859a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
                ((M0.c) this.f38860b).i(this.f38861c, this.f38862d);
                return Unit.f36324a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f.a aVar, Object obj, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f38857c = aVar;
            this.f38858d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return c.this.new d(this.f38857c, this.f38858d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((d) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f38855a;
            if (i10 == 0) {
                p.b(obj);
                InterfaceC0843i interfaceC0843i = c.this.f38842e;
                a aVar = new a(this.f38857c, this.f38858d, null);
                this.f38855a = 1;
                obj = j.a(interfaceC0843i, aVar, this);
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

    public c(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f38838a = context;
        this.f38839b = name;
        this.f38840c = new ThreadLocal();
        this.f38841d = L0.a.b(name, new J0.b(new Function1() { // from class: q8.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                f e10;
                e10 = c.e(c.this, (C0838d) obj);
                return e10;
            }
        }), new Function1() { // from class: q8.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List f10;
                f10 = c.f(c.this, (Context) obj);
                return f10;
            }
        }, null, 8, null);
        this.f38842e = i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f e(c cVar, C0838d ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        Log.w(C5142C.b(c.class).q(), "CorruptionException in " + cVar.f38839b + " DataStore running in process " + Process.myPid(), ex);
        return M0.g.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(c cVar, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.e(i.b(it, cVar.f38839b, null, 4, null));
    }

    private final InterfaceC0843i i(Context context) {
        return (InterfaceC0843i) this.f38841d.a(context, f38837f[0]);
    }

    public final f g(Function1 transform) {
        Object b10;
        Intrinsics.checkNotNullParameter(transform, "transform");
        b10 = AbstractC0889j.b(null, new a(transform, null), 1, null);
        return (f) b10;
    }

    public final Map h() {
        Object b10;
        b10 = AbstractC0889j.b(null, new b(null), 1, null);
        return (Map) b10;
    }

    public final Object j(f.a key, Object obj) {
        Object b10;
        Intrinsics.checkNotNullParameter(key, "key");
        b10 = AbstractC0889j.b(null, new C0600c(key, obj, null), 1, null);
        return b10;
    }

    public final f k(f.a key, Object obj) {
        Object b10;
        Intrinsics.checkNotNullParameter(key, "key");
        b10 = AbstractC0889j.b(null, new d(key, obj, null), 1, null);
        return (f) b10;
    }
}
