package I0;

import I0.J;
import I0.w;
import Jd.AbstractC0887i;
import Jd.AbstractC0891k;
import Jd.AbstractC0918y;
import Jd.InterfaceC0914w;
import Jd.InterfaceC0915w0;
import Jd.N;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.AbstractC3622a;
import lc.o;
import pc.AbstractC3868b;
import wc.InterfaceC5068n;
import xc.C5141B;

/* renamed from: I0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0845k implements InterfaceC0843i {

    /* renamed from: m, reason: collision with root package name */
    public static final a f4050m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final E f4051a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0839e f4052b;

    /* renamed from: c, reason: collision with root package name */
    private final N f4053c;

    /* renamed from: d, reason: collision with root package name */
    private final Md.e f4054d;

    /* renamed from: e, reason: collision with root package name */
    private final Sd.a f4055e;

    /* renamed from: f, reason: collision with root package name */
    private int f4056f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC0915w0 f4057g;

    /* renamed from: h, reason: collision with root package name */
    private final I0.l f4058h;

    /* renamed from: i, reason: collision with root package name */
    private final b f4059i;

    /* renamed from: j, reason: collision with root package name */
    private final Lazy f4060j;

    /* renamed from: k, reason: collision with root package name */
    private final Lazy f4061k;

    /* renamed from: l, reason: collision with root package name */
    private final B f4062l;

    /* renamed from: I0.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: I0.k$b */
    private final class b extends z {

        /* renamed from: c, reason: collision with root package name */
        private List f4063c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0845k f4064d;

        /* renamed from: I0.k$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f4065a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f4066b;

            /* renamed from: d, reason: collision with root package name */
            int f4068d;

            a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f4066b = obj;
                this.f4068d |= Integer.MIN_VALUE;
                return b.this.b(this);
            }
        }

        /* renamed from: I0.k$b$b, reason: collision with other inner class name */
        static final class C0083b extends kotlin.coroutines.jvm.internal.l implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            Object f4069a;

            /* renamed from: b, reason: collision with root package name */
            Object f4070b;

            /* renamed from: c, reason: collision with root package name */
            Object f4071c;

            /* renamed from: d, reason: collision with root package name */
            Object f4072d;

            /* renamed from: e, reason: collision with root package name */
            Object f4073e;

            /* renamed from: f, reason: collision with root package name */
            int f4074f;

            /* renamed from: g, reason: collision with root package name */
            int f4075g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C0845k f4076h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ b f4077i;

            /* renamed from: I0.k$b$b$a */
            public static final class a implements I0.s {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Sd.a f4078a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ xc.y f4079b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C5141B f4080c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C0845k f4081d;

                /* renamed from: I0.k$b$b$a$a, reason: collision with other inner class name */
                static final class C0084a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    Object f4082a;

                    /* renamed from: b, reason: collision with root package name */
                    Object f4083b;

                    /* renamed from: c, reason: collision with root package name */
                    Object f4084c;

                    /* renamed from: d, reason: collision with root package name */
                    Object f4085d;

                    /* renamed from: e, reason: collision with root package name */
                    Object f4086e;

                    /* renamed from: f, reason: collision with root package name */
                    /* synthetic */ Object f4087f;

                    /* renamed from: h, reason: collision with root package name */
                    int f4089h;

                    C0084a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f4087f = obj;
                        this.f4089h |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                a(Sd.a aVar, xc.y yVar, C5141B c5141b, C0845k c0845k) {
                    this.f4078a = aVar;
                    this.f4079b = yVar;
                    this.f4080c = c5141b;
                    this.f4081d = c0845k;
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #1 {all -> 0x00d8, blocks: (B:40:0x0096, B:42:0x009a, B:46:0x00db, B:47:0x00e2), top: B:39:0x0096 }] */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00db A[Catch: all -> 0x00d8, TRY_ENTER, TryCatch #1 {all -> 0x00d8, blocks: (B:40:0x0096, B:42:0x009a, B:46:0x00db, B:47:0x00e2), top: B:39:0x0096 }] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                @Override // I0.s
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object a(Function2 function2, kotlin.coroutines.d dVar) {
                    C0084a c0084a;
                    int i10;
                    Sd.a aVar;
                    C0845k c0845k;
                    xc.y yVar;
                    C5141B c5141b;
                    Sd.a aVar2;
                    Sd.a aVar3;
                    C0845k c0845k2;
                    Object obj;
                    C5141B c5141b2;
                    try {
                        if (dVar instanceof C0084a) {
                            c0084a = (C0084a) dVar;
                            int i11 = c0084a.f4089h;
                            if ((i11 & Integer.MIN_VALUE) != 0) {
                                c0084a.f4089h = i11 - Integer.MIN_VALUE;
                                Object obj2 = c0084a.f4087f;
                                Object e10 = AbstractC3868b.e();
                                i10 = c0084a.f4089h;
                                if (i10 != 0) {
                                    lc.p.b(obj2);
                                    aVar = this.f4078a;
                                    xc.y yVar2 = this.f4079b;
                                    C5141B c5141b3 = this.f4080c;
                                    c0845k = this.f4081d;
                                    c0084a.f4082a = function2;
                                    c0084a.f4083b = aVar;
                                    c0084a.f4084c = yVar2;
                                    c0084a.f4085d = c5141b3;
                                    c0084a.f4086e = c0845k;
                                    c0084a.f4089h = 1;
                                    if (aVar.b(null, c0084a) == e10) {
                                        return e10;
                                    }
                                    yVar = yVar2;
                                    c5141b = c5141b3;
                                } else {
                                    if (i10 != 1) {
                                        if (i10 != 2) {
                                            if (i10 != 3) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            obj = c0084a.f4084c;
                                            c5141b2 = (C5141B) c0084a.f4083b;
                                            aVar2 = (Sd.a) c0084a.f4082a;
                                            try {
                                                lc.p.b(obj2);
                                                c5141b2.f44962a = obj;
                                                c5141b = c5141b2;
                                                Object obj3 = c5141b.f44962a;
                                                aVar2.c(null);
                                                return obj3;
                                            } catch (Throwable th) {
                                                th = th;
                                                aVar2.c(null);
                                                throw th;
                                            }
                                        }
                                        c0845k2 = (C0845k) c0084a.f4084c;
                                        c5141b = (C5141B) c0084a.f4083b;
                                        aVar3 = (Sd.a) c0084a.f4082a;
                                        try {
                                            lc.p.b(obj2);
                                            if (!Intrinsics.b(obj2, c5141b.f44962a)) {
                                                aVar2 = aVar3;
                                                Object obj32 = c5141b.f44962a;
                                                aVar2.c(null);
                                                return obj32;
                                            }
                                            c0084a.f4082a = aVar3;
                                            c0084a.f4083b = c5141b;
                                            c0084a.f4084c = obj2;
                                            c0084a.f4089h = 3;
                                            if (c0845k2.B(obj2, false, c0084a) == e10) {
                                                return e10;
                                            }
                                            obj = obj2;
                                            c5141b2 = c5141b;
                                            aVar2 = aVar3;
                                            c5141b2.f44962a = obj;
                                            c5141b = c5141b2;
                                            Object obj322 = c5141b.f44962a;
                                            aVar2.c(null);
                                            return obj322;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            aVar2 = aVar3;
                                            aVar2.c(null);
                                            throw th;
                                        }
                                    }
                                    C0845k c0845k3 = (C0845k) c0084a.f4086e;
                                    c5141b = (C5141B) c0084a.f4085d;
                                    yVar = (xc.y) c0084a.f4084c;
                                    Sd.a aVar4 = (Sd.a) c0084a.f4083b;
                                    Function2 function22 = (Function2) c0084a.f4082a;
                                    lc.p.b(obj2);
                                    aVar = aVar4;
                                    c0845k = c0845k3;
                                    function2 = function22;
                                }
                                if (!yVar.f44999a) {
                                    throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                                }
                                Object obj4 = c5141b.f44962a;
                                c0084a.f4082a = aVar;
                                c0084a.f4083b = c5141b;
                                c0084a.f4084c = c0845k;
                                c0084a.f4085d = null;
                                c0084a.f4086e = null;
                                c0084a.f4089h = 2;
                                Object invoke = function2.invoke(obj4, c0084a);
                                if (invoke == e10) {
                                    return e10;
                                }
                                aVar3 = aVar;
                                obj2 = invoke;
                                c0845k2 = c0845k;
                                if (!Intrinsics.b(obj2, c5141b.f44962a)) {
                                }
                            }
                        }
                        if (!yVar.f44999a) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        aVar2 = aVar;
                        aVar2.c(null);
                        throw th;
                    }
                    c0084a = new C0084a(dVar);
                    Object obj22 = c0084a.f4087f;
                    Object e102 = AbstractC3868b.e();
                    i10 = c0084a.f4089h;
                    if (i10 != 0) {
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0083b(C0845k c0845k, b bVar, kotlin.coroutines.d dVar) {
                super(1, dVar);
                this.f4076h = c0845k;
                this.f4077i = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
                return new C0083b(this.f4076h, this.f4077i, dVar);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlin.coroutines.d dVar) {
                return ((C0083b) create(dVar)).invokeSuspend(Unit.f36324a);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x00f3  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x010d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x010e  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00e6 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Sd.a b10;
                xc.y yVar;
                C5141B c5141b;
                C5141B c5141b2;
                xc.y yVar2;
                Sd.a aVar;
                Iterator it;
                Sd.a aVar2;
                xc.y yVar3;
                C5141B c5141b3;
                a aVar3;
                C5141B c5141b4;
                Object obj2;
                int i10;
                Object e10 = AbstractC3868b.e();
                int i11 = this.f4075g;
                if (i11 == 0) {
                    lc.p.b(obj);
                    b10 = Sd.g.b(false, 1, null);
                    yVar = new xc.y();
                    c5141b = new C5141B();
                    C0845k c0845k = this.f4076h;
                    this.f4069a = b10;
                    this.f4070b = yVar;
                    this.f4071c = c5141b;
                    this.f4072d = c5141b;
                    this.f4075g = 1;
                    obj = c0845k.y(true, this);
                    if (obj == e10) {
                        return e10;
                    }
                    c5141b2 = c5141b;
                } else if (i11 == 1) {
                    c5141b = (C5141B) this.f4072d;
                    c5141b2 = (C5141B) this.f4071c;
                    yVar = (xc.y) this.f4070b;
                    b10 = (Sd.a) this.f4069a;
                    lc.p.b(obj);
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i10 = this.f4074f;
                            obj2 = this.f4069a;
                            lc.p.b(obj);
                            return new C0840f(obj2, i10, ((Number) obj).intValue());
                        }
                        aVar = (Sd.a) this.f4071c;
                        c5141b4 = (C5141B) this.f4070b;
                        yVar2 = (xc.y) this.f4069a;
                        lc.p.b(obj);
                        try {
                            yVar2.f44999a = true;
                            Unit unit = Unit.f36324a;
                            aVar.c(null);
                            obj2 = c5141b4.f44962a;
                            int hashCode = obj2 != null ? obj2.hashCode() : 0;
                            I0.t r10 = this.f4076h.r();
                            this.f4069a = obj2;
                            this.f4070b = null;
                            this.f4071c = null;
                            this.f4074f = hashCode;
                            this.f4075g = 4;
                            obj = r10.a(this);
                            if (obj != e10) {
                                return e10;
                            }
                            i10 = hashCode;
                            return new C0840f(obj2, i10, ((Number) obj).intValue());
                        } catch (Throwable th) {
                            aVar.c(null);
                            throw th;
                        }
                    }
                    it = (Iterator) this.f4073e;
                    aVar3 = (a) this.f4072d;
                    c5141b3 = (C5141B) this.f4071c;
                    yVar3 = (xc.y) this.f4070b;
                    aVar2 = (Sd.a) this.f4069a;
                    lc.p.b(obj);
                    while (it.hasNext()) {
                        Function2 function2 = (Function2) it.next();
                        this.f4069a = aVar2;
                        this.f4070b = yVar3;
                        this.f4071c = c5141b3;
                        this.f4072d = aVar3;
                        this.f4073e = it;
                        this.f4075g = 2;
                        if (function2.invoke(aVar3, this) == e10) {
                            return e10;
                        }
                    }
                    c5141b2 = c5141b3;
                    yVar2 = yVar3;
                    aVar = aVar2;
                    this.f4077i.f4063c = null;
                    this.f4069a = yVar2;
                    this.f4070b = c5141b2;
                    this.f4071c = aVar;
                    this.f4072d = null;
                    this.f4073e = null;
                    this.f4075g = 3;
                    if (aVar.b(null, this) == e10) {
                        return e10;
                    }
                    c5141b4 = c5141b2;
                    yVar2.f44999a = true;
                    Unit unit2 = Unit.f36324a;
                    aVar.c(null);
                    obj2 = c5141b4.f44962a;
                    if (obj2 != null) {
                    }
                    I0.t r102 = this.f4076h.r();
                    this.f4069a = obj2;
                    this.f4070b = null;
                    this.f4071c = null;
                    this.f4074f = hashCode;
                    this.f4075g = 4;
                    obj = r102.a(this);
                    if (obj != e10) {
                    }
                }
                c5141b.f44962a = ((C0840f) obj).c();
                a aVar4 = new a(b10, yVar, c5141b2, this.f4076h);
                List list = this.f4077i.f4063c;
                if (list != null) {
                    it = list.iterator();
                    aVar2 = b10;
                    yVar3 = yVar;
                    c5141b3 = c5141b2;
                    aVar3 = aVar4;
                    while (it.hasNext()) {
                    }
                    c5141b2 = c5141b3;
                    yVar2 = yVar3;
                    aVar = aVar2;
                    this.f4077i.f4063c = null;
                    this.f4069a = yVar2;
                    this.f4070b = c5141b2;
                    this.f4071c = aVar;
                    this.f4072d = null;
                    this.f4073e = null;
                    this.f4075g = 3;
                    if (aVar.b(null, this) == e10) {
                    }
                } else {
                    yVar2 = yVar;
                    aVar = b10;
                    this.f4077i.f4063c = null;
                    this.f4069a = yVar2;
                    this.f4070b = c5141b2;
                    this.f4071c = aVar;
                    this.f4072d = null;
                    this.f4073e = null;
                    this.f4075g = 3;
                    if (aVar.b(null, this) == e10) {
                    }
                }
            }
        }

        public b(C0845k c0845k, List initTasksList) {
            Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.f4064d = c0845k;
            this.f4063c = CollectionsKt.O0(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // I0.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected Object b(kotlin.coroutines.d dVar) {
            a aVar;
            int i10;
            b bVar;
            C0840f c0840f;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.f4068d;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f4068d = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f4066b;
                    Object e10 = AbstractC3868b.e();
                    i10 = aVar.f4068d;
                    if (i10 != 0) {
                        lc.p.b(obj);
                        List list = this.f4063c;
                        if (list != null) {
                            Intrinsics.d(list);
                            if (!list.isEmpty()) {
                                I0.t r10 = this.f4064d.r();
                                C0083b c0083b = new C0083b(this.f4064d, this, null);
                                aVar.f4065a = this;
                                aVar.f4068d = 2;
                                obj = r10.c(c0083b, aVar);
                                if (obj == e10) {
                                    return e10;
                                }
                                bVar = this;
                                c0840f = (C0840f) obj;
                            }
                        }
                        C0845k c0845k = this.f4064d;
                        aVar.f4065a = this;
                        aVar.f4068d = 1;
                        obj = c0845k.y(false, aVar);
                        if (obj == e10) {
                            return e10;
                        }
                        bVar = this;
                        c0840f = (C0840f) obj;
                    } else if (i10 == 1) {
                        bVar = (b) aVar.f4065a;
                        lc.p.b(obj);
                        c0840f = (C0840f) obj;
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (b) aVar.f4065a;
                        lc.p.b(obj);
                        c0840f = (C0840f) obj;
                    }
                    bVar.f4064d.f4058h.c(c0840f);
                    return Unit.f36324a;
                }
            }
            aVar = new a(dVar);
            Object obj2 = aVar.f4066b;
            Object e102 = AbstractC3868b.e();
            i10 = aVar.f4068d;
            if (i10 != 0) {
            }
            bVar.f4064d.f4058h.c(c0840f);
            return Unit.f36324a;
        }
    }

    /* renamed from: I0.k$c */
    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I0.t invoke() {
            return C0845k.this.s().d();
        }
    }

    /* renamed from: I0.k$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        Object f4091a;

        /* renamed from: b, reason: collision with root package name */
        int f4092b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4093c;

        /* renamed from: I0.k$d$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f4095a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0845k f4096b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C0845k c0845k, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f4096b = c0845k;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return new a(this.f4096b, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Md.f fVar, kotlin.coroutines.d dVar) {
                return ((a) create(fVar, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = AbstractC3868b.e();
                int i10 = this.f4095a;
                if (i10 == 0) {
                    lc.p.b(obj);
                    C0845k c0845k = this.f4096b;
                    this.f4095a = 1;
                    if (c0845k.u(this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                }
                return Unit.f36324a;
            }
        }

        /* renamed from: I0.k$d$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f4097a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f4098b;

            b(kotlin.coroutines.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                b bVar = new b(dVar);
                bVar.f4098b = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(D d10, kotlin.coroutines.d dVar) {
                return ((b) create(d10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC3868b.e();
                if (this.f4097a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!(((D) this.f4098b) instanceof I0.r));
            }
        }

        /* renamed from: I0.k$d$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f4099a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f4100b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ D f4101c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(D d10, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f4101c = d10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                c cVar = new c(this.f4101c, dVar);
                cVar.f4100b = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(D d10, kotlin.coroutines.d dVar) {
                return ((c) create(d10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC3868b.e();
                if (this.f4099a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
                D d10 = (D) this.f4100b;
                return kotlin.coroutines.jvm.internal.b.a((d10 instanceof C0840f) && d10.a() <= this.f4101c.a());
            }
        }

        /* renamed from: I0.k$d$d, reason: collision with other inner class name */
        static final class C0085d extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

            /* renamed from: a, reason: collision with root package name */
            int f4102a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0845k f4103b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0085d(C0845k c0845k, kotlin.coroutines.d dVar) {
                super(3, dVar);
                this.f4103b = c0845k;
            }

            @Override // wc.InterfaceC5068n
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object n(Md.f fVar, Throwable th, kotlin.coroutines.d dVar) {
                return new C0085d(this.f4103b, dVar).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = AbstractC3868b.e();
                int i10 = this.f4102a;
                if (i10 == 0) {
                    lc.p.b(obj);
                    C0845k c0845k = this.f4103b;
                    this.f4102a = 1;
                    if (c0845k.p(this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                }
                return Unit.f36324a;
            }
        }

        /* renamed from: I0.k$d$e */
        public static final class e implements Md.e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Md.e f4104a;

            /* renamed from: I0.k$d$e$a */
            public static final class a implements Md.f {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Md.f f4105a;

                /* renamed from: I0.k$d$e$a$a, reason: collision with other inner class name */
                public static final class C0086a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f4106a;

                    /* renamed from: b, reason: collision with root package name */
                    int f4107b;

                    public C0086a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f4106a = obj;
                        this.f4107b |= Integer.MIN_VALUE;
                        return a.this.f(null, this);
                    }
                }

                public a(Md.f fVar) {
                    this.f4105a = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // Md.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object f(Object obj, kotlin.coroutines.d dVar) {
                    C0086a c0086a;
                    int i10;
                    if (dVar instanceof C0086a) {
                        c0086a = (C0086a) dVar;
                        int i11 = c0086a.f4107b;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            c0086a.f4107b = i11 - Integer.MIN_VALUE;
                            Object obj2 = c0086a.f4106a;
                            Object e10 = AbstractC3868b.e();
                            i10 = c0086a.f4107b;
                            if (i10 != 0) {
                                lc.p.b(obj2);
                                Md.f fVar = this.f4105a;
                                D d10 = (D) obj;
                                if (d10 instanceof I0.x) {
                                    throw ((I0.x) d10).b();
                                }
                                if (!(d10 instanceof C0840f)) {
                                    if (d10 instanceof I0.r ? true : d10 instanceof H) {
                                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                    }
                                    throw new lc.m();
                                }
                                Object c10 = ((C0840f) d10).c();
                                c0086a.f4107b = 1;
                                if (fVar.f(c10, c0086a) == e10) {
                                    return e10;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                lc.p.b(obj2);
                            }
                            return Unit.f36324a;
                        }
                    }
                    c0086a = new C0086a(dVar);
                    Object obj22 = c0086a.f4106a;
                    Object e102 = AbstractC3868b.e();
                    i10 = c0086a.f4107b;
                    if (i10 != 0) {
                    }
                    return Unit.f36324a;
                }
            }

            public e(Md.e eVar) {
                this.f4104a = eVar;
            }

            @Override // Md.e
            public Object b(Md.f fVar, kotlin.coroutines.d dVar) {
                Object b10 = this.f4104a.b(new a(fVar), dVar);
                return b10 == AbstractC3868b.e() ? b10 : Unit.f36324a;
            }
        }

        d(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            d dVar2 = C0845k.this.new d(dVar);
            dVar2.f4093c = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Md.f fVar, kotlin.coroutines.d dVar) {
            return ((d) create(fVar, dVar)).invokeSuspend(Unit.f36324a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00bc A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Md.f fVar;
            D d10;
            Md.f fVar2;
            D d11;
            Md.e l10;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f4092b;
            if (i10 == 0) {
                lc.p.b(obj);
                Md.f fVar3 = (Md.f) this.f4093c;
                C0845k c0845k = C0845k.this;
                this.f4093c = fVar3;
                this.f4092b = 1;
                Object z10 = c0845k.z(false, this);
                if (z10 == e10) {
                    return e10;
                }
                fVar = fVar3;
                obj = z10;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lc.p.b(obj);
                        return Unit.f36324a;
                    }
                    d11 = (D) this.f4091a;
                    fVar2 = (Md.f) this.f4093c;
                    lc.p.b(obj);
                    d10 = d11;
                    fVar = fVar2;
                    l10 = Md.g.l(new e(Md.g.f(Md.g.n(Md.g.m(C0845k.this.f4058h.b(), new a(C0845k.this, null)), new b(null)), new c(d10, null))), new C0085d(C0845k.this, null));
                    this.f4093c = null;
                    this.f4091a = null;
                    this.f4092b = 3;
                    if (Md.g.h(fVar, l10, this) == e10) {
                        return e10;
                    }
                    return Unit.f36324a;
                }
                fVar = (Md.f) this.f4093c;
                lc.p.b(obj);
            }
            d10 = (D) obj;
            if (!(d10 instanceof C0840f)) {
                if (d10 instanceof H) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                if (d10 instanceof I0.x) {
                    throw ((I0.x) d10).b();
                }
                if (d10 instanceof I0.r) {
                    return Unit.f36324a;
                }
                l10 = Md.g.l(new e(Md.g.f(Md.g.n(Md.g.m(C0845k.this.f4058h.b(), new a(C0845k.this, null)), new b(null)), new c(d10, null))), new C0085d(C0845k.this, null));
                this.f4093c = null;
                this.f4091a = null;
                this.f4092b = 3;
                if (Md.g.h(fVar, l10, this) == e10) {
                }
                return Unit.f36324a;
            }
            Object c10 = ((C0840f) d10).c();
            this.f4093c = fVar;
            this.f4091a = d10;
            this.f4092b = 2;
            if (fVar.f(c10, this) == e10) {
                return e10;
            }
            fVar2 = fVar;
            d11 = d10;
            d10 = d11;
            fVar = fVar2;
            l10 = Md.g.l(new e(Md.g.f(Md.g.n(Md.g.m(C0845k.this.f4058h.b(), new a(C0845k.this, null)), new b(null)), new c(d10, null))), new C0085d(C0845k.this, null));
            this.f4093c = null;
            this.f4091a = null;
            this.f4092b = 3;
            if (Md.g.h(fVar, l10, this) == e10) {
            }
            return Unit.f36324a;
        }
    }

    /* renamed from: I0.k$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4109a;

        /* renamed from: b, reason: collision with root package name */
        Object f4110b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4111c;

        /* renamed from: e, reason: collision with root package name */
        int f4113e;

        e(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4111c = obj;
            this.f4113e |= Integer.MIN_VALUE;
            return C0845k.this.p(this);
        }
    }

    /* renamed from: I0.k$f */
    static final class f extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        int f4114a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1 f4115b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, kotlin.coroutines.d dVar) {
            super(1, dVar);
            this.f4115b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
            return new f(this.f4115b, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.coroutines.d dVar) {
            return ((f) create(dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f4114a;
            if (i10 == 0) {
                lc.p.b(obj);
                Function1 function1 = this.f4115b;
                this.f4114a = 1;
                obj = function1.invoke(this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return obj;
        }
    }

    /* renamed from: I0.k$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4116a;

        /* renamed from: b, reason: collision with root package name */
        Object f4117b;

        /* renamed from: c, reason: collision with root package name */
        Object f4118c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f4119d;

        /* renamed from: f, reason: collision with root package name */
        int f4121f;

        g(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4119d = obj;
            this.f4121f |= Integer.MIN_VALUE;
            return C0845k.this.t(null, this);
        }
    }

    /* renamed from: I0.k$h */
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4122a;

        /* renamed from: b, reason: collision with root package name */
        Object f4123b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4124c;

        /* renamed from: e, reason: collision with root package name */
        int f4126e;

        h(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4124c = obj;
            this.f4126e |= Integer.MIN_VALUE;
            return C0845k.this.u(this);
        }
    }

    /* renamed from: I0.k$i */
    static final class i extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f4127a;

        /* renamed from: I0.k$i$a */
        static final class a implements Md.f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0845k f4129a;

            a(C0845k c0845k) {
                this.f4129a = c0845k;
            }

            @Override // Md.f
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object f(Unit unit, kotlin.coroutines.d dVar) {
                if (this.f4129a.f4058h.a() instanceof I0.r) {
                    return Unit.f36324a;
                }
                Object w10 = this.f4129a.w(true, dVar);
                return w10 == AbstractC3868b.e() ? w10 : Unit.f36324a;
            }
        }

        i(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return C0845k.this.new i(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((i) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f4127a;
            if (i10 == 0) {
                lc.p.b(obj);
                b bVar = C0845k.this.f4059i;
                this.f4127a = 1;
                if (bVar.a(this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                    return Unit.f36324a;
                }
                lc.p.b(obj);
            }
            Md.e d10 = Md.g.d(C0845k.this.r().d());
            a aVar = new a(C0845k.this);
            this.f4127a = 2;
            if (d10.b(aVar, this) == e10) {
                return e10;
            }
            return Unit.f36324a;
        }
    }

    /* renamed from: I0.k$j */
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4130a;

        /* renamed from: b, reason: collision with root package name */
        int f4131b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4132c;

        /* renamed from: e, reason: collision with root package name */
        int f4134e;

        j(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4132c = obj;
            this.f4134e |= Integer.MIN_VALUE;
            return C0845k.this.v(this);
        }
    }

    /* renamed from: I0.k$k, reason: collision with other inner class name */
    static final class C0087k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4135a;

        /* renamed from: b, reason: collision with root package name */
        Object f4136b;

        /* renamed from: c, reason: collision with root package name */
        boolean f4137c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f4138d;

        /* renamed from: f, reason: collision with root package name */
        int f4140f;

        C0087k(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4138d = obj;
            this.f4140f |= Integer.MIN_VALUE;
            return C0845k.this.w(false, this);
        }
    }

    /* renamed from: I0.k$l */
    static final class l extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        Object f4141a;

        /* renamed from: b, reason: collision with root package name */
        int f4142b;

        l(kotlin.coroutines.d dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
            return C0845k.this.new l(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.coroutines.d dVar) {
            return ((l) create(dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            D d10;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f4142b;
            try {
            } catch (Throwable th2) {
                I0.t r10 = C0845k.this.r();
                this.f4141a = th2;
                this.f4142b = 2;
                Object a10 = r10.a(this);
                if (a10 == e10) {
                    return e10;
                }
                th = th2;
                obj = a10;
            }
            if (i10 == 0) {
                lc.p.b(obj);
                C0845k c0845k = C0845k.this;
                this.f4142b = 1;
                obj = c0845k.y(true, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.f4141a;
                    lc.p.b(obj);
                    d10 = new I0.x(th, ((Number) obj).intValue());
                    return lc.t.a(d10, kotlin.coroutines.jvm.internal.b.a(true));
                }
                lc.p.b(obj);
            }
            d10 = (D) obj;
            return lc.t.a(d10, kotlin.coroutines.jvm.internal.b.a(true));
        }
    }

    /* renamed from: I0.k$m */
    static final class m extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        Object f4144a;

        /* renamed from: b, reason: collision with root package name */
        int f4145b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f4146c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4148e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i10, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f4148e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            m mVar = C0845k.this.new m(this.f4148e, dVar);
            mVar.f4146c = ((Boolean) obj).booleanValue();
            return mVar;
        }

        public final Object g(boolean z10, kotlin.coroutines.d dVar) {
            return ((m) create(Boolean.valueOf(z10), dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return g(((Boolean) obj).booleanValue(), (kotlin.coroutines.d) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            int i10;
            boolean z10;
            D d10;
            boolean z11;
            Object e10 = AbstractC3868b.e();
            boolean z12 = this.f4145b;
            try {
            } catch (Throwable th2) {
                if (z12 != 0) {
                    I0.t r10 = C0845k.this.r();
                    this.f4144a = th2;
                    this.f4146c = z12;
                    this.f4145b = 2;
                    Object a10 = r10.a(this);
                    if (a10 == e10) {
                        return e10;
                    }
                    z10 = z12;
                    th = th2;
                    obj = a10;
                } else {
                    boolean z13 = z12;
                    th = th2;
                    i10 = this.f4148e;
                    z10 = z13;
                }
            }
            if (z12 == 0) {
                lc.p.b(obj);
                boolean z14 = this.f4146c;
                C0845k c0845k = C0845k.this;
                this.f4146c = z14;
                this.f4145b = 1;
                obj = c0845k.y(z14, this);
                z12 = z14;
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (z12 != 1) {
                    if (z12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = this.f4146c;
                    th = (Throwable) this.f4144a;
                    lc.p.b(obj);
                    i10 = ((Number) obj).intValue();
                    I0.x xVar = new I0.x(th, i10);
                    z11 = z10;
                    d10 = xVar;
                    return lc.t.a(d10, kotlin.coroutines.jvm.internal.b.a(z11));
                }
                boolean z15 = this.f4146c;
                lc.p.b(obj);
                z12 = z15;
            }
            d10 = (D) obj;
            z11 = z12;
            return lc.t.a(d10, kotlin.coroutines.jvm.internal.b.a(z11));
        }
    }

    /* renamed from: I0.k$n */
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4149a;

        /* renamed from: b, reason: collision with root package name */
        Object f4150b;

        /* renamed from: c, reason: collision with root package name */
        Object f4151c;

        /* renamed from: d, reason: collision with root package name */
        Object f4152d;

        /* renamed from: e, reason: collision with root package name */
        boolean f4153e;

        /* renamed from: f, reason: collision with root package name */
        int f4154f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f4155g;

        /* renamed from: i, reason: collision with root package name */
        int f4157i;

        n(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4155g = obj;
            this.f4157i |= Integer.MIN_VALUE;
            return C0845k.this.y(false, this);
        }
    }

    /* renamed from: I0.k$o */
    static final class o extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        Object f4158a;

        /* renamed from: b, reason: collision with root package name */
        int f4159b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f4160c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4162e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i10, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f4162e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            o oVar = C0845k.this.new o(this.f4162e, dVar);
            oVar.f4160c = ((Boolean) obj).booleanValue();
            return oVar;
        }

        public final Object g(boolean z10, kotlin.coroutines.d dVar) {
            return ((o) create(Boolean.valueOf(z10), dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return g(((Boolean) obj).booleanValue(), (kotlin.coroutines.d) obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object obj2;
            int i10;
            Object e10 = AbstractC3868b.e();
            int i11 = this.f4159b;
            if (i11 == 0) {
                lc.p.b(obj);
                z10 = this.f4160c;
                C0845k c0845k = C0845k.this;
                this.f4160c = z10;
                this.f4159b = 1;
                obj = c0845k.x(this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f4158a;
                    lc.p.b(obj);
                    i10 = ((Number) obj).intValue();
                    return new C0840f(obj2, obj2 != null ? obj2.hashCode() : 0, i10);
                }
                z10 = this.f4160c;
                lc.p.b(obj);
            }
            if (!z10) {
                obj2 = obj;
                i10 = this.f4162e;
                return new C0840f(obj2, obj2 != null ? obj2.hashCode() : 0, i10);
            }
            I0.t r10 = C0845k.this.r();
            this.f4158a = obj;
            this.f4159b = 2;
            Object a10 = r10.a(this);
            if (a10 == e10) {
                return e10;
            }
            obj2 = obj;
            obj = a10;
            i10 = ((Number) obj).intValue();
            return new C0840f(obj2, obj2 != null ? obj2.hashCode() : 0, i10);
        }
    }

    /* renamed from: I0.k$p */
    static final class p extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        Object f4163a;

        /* renamed from: b, reason: collision with root package name */
        int f4164b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5141B f4165c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C0845k f4166d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ xc.z f4167e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(C5141B c5141b, C0845k c0845k, xc.z zVar, kotlin.coroutines.d dVar) {
            super(1, dVar);
            this.f4165c = c5141b;
            this.f4166d = c0845k;
            this.f4167e = zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
            return new p(this.f4165c, this.f4166d, this.f4167e, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.coroutines.d dVar) {
            return ((p) create(dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            xc.z zVar;
            C5141B c5141b;
            xc.z zVar2;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f4164b;
            try {
            } catch (C0838d unused) {
                xc.z zVar3 = this.f4167e;
                C0845k c0845k = this.f4166d;
                Object obj2 = this.f4165c.f44962a;
                this.f4163a = zVar3;
                this.f4164b = 3;
                Object B10 = c0845k.B(obj2, true, this);
                if (B10 == e10) {
                    return e10;
                }
                zVar = zVar3;
                obj = B10;
            }
            if (i10 == 0) {
                lc.p.b(obj);
                c5141b = this.f4165c;
                C0845k c0845k2 = this.f4166d;
                this.f4163a = c5141b;
                this.f4164b = 1;
                obj = c0845k2.x(this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    if (i10 == 2) {
                        zVar2 = (xc.z) this.f4163a;
                        lc.p.b(obj);
                        zVar2.f45000a = ((Number) obj).intValue();
                        return Unit.f36324a;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = (xc.z) this.f4163a;
                    lc.p.b(obj);
                    zVar.f45000a = ((Number) obj).intValue();
                    return Unit.f36324a;
                }
                c5141b = (C5141B) this.f4163a;
                lc.p.b(obj);
            }
            c5141b.f44962a = obj;
            zVar2 = this.f4167e;
            I0.t r10 = this.f4166d.r();
            this.f4163a = zVar2;
            this.f4164b = 2;
            obj = r10.a(this);
            if (obj == e10) {
                return e10;
            }
            zVar2.f45000a = ((Number) obj).intValue();
            return Unit.f36324a;
        }
    }

    /* renamed from: I0.k$q */
    static final class q extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f4168a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4170c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(boolean z10, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f4170c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return C0845k.this.new q(this.f4170c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((q) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f4168a;
            try {
                if (i10 == 0) {
                    lc.p.b(obj);
                    if (C0845k.this.f4058h.a() instanceof I0.r) {
                        return C0845k.this.f4058h.a();
                    }
                    C0845k c0845k = C0845k.this;
                    this.f4168a = 1;
                    if (c0845k.v(this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lc.p.b(obj);
                        return (D) obj;
                    }
                    lc.p.b(obj);
                }
                C0845k c0845k2 = C0845k.this;
                boolean z10 = this.f4170c;
                this.f4168a = 2;
                obj = c0845k2.w(z10, this);
                if (obj == e10) {
                    return e10;
                }
                return (D) obj;
            } catch (Throwable th) {
                return new I0.x(th, -1);
            }
        }
    }

    /* renamed from: I0.k$r */
    static final class r extends xc.m implements Function0 {
        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F invoke() {
            return C0845k.this.f4051a.a();
        }
    }

    /* renamed from: I0.k$s */
    static final class s extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        Object f4172a;

        /* renamed from: b, reason: collision with root package name */
        int f4173b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f4175d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2 f4176e;

        /* renamed from: I0.k$s$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f4177a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2 f4178b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C0840f f4179c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function2 function2, C0840f c0840f, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f4178b = function2;
                this.f4179c = c0840f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return new a(this.f4178b, this.f4179c, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(N n10, kotlin.coroutines.d dVar) {
                return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = AbstractC3868b.e();
                int i10 = this.f4177a;
                if (i10 == 0) {
                    lc.p.b(obj);
                    Function2 function2 = this.f4178b;
                    Object c10 = this.f4179c.c();
                    this.f4177a = 1;
                    obj = function2.invoke(c10, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(CoroutineContext coroutineContext, Function2 function2, kotlin.coroutines.d dVar) {
            super(1, dVar);
            this.f4175d = coroutineContext;
            this.f4176e = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
            return C0845k.this.new s(this.f4175d, this.f4176e, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.coroutines.d dVar) {
            return ((s) create(dVar)).invokeSuspend(Unit.f36324a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C0840f c0840f;
            Object obj2;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f4173b;
            if (i10 == 0) {
                lc.p.b(obj);
                C0845k c0845k = C0845k.this;
                this.f4173b = 1;
                obj = c0845k.y(true, this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f4172a;
                        lc.p.b(obj);
                        return obj2;
                    }
                    c0840f = (C0840f) this.f4172a;
                    lc.p.b(obj);
                    c0840f.b();
                    if (!Intrinsics.b(c0840f.c(), obj)) {
                        return obj;
                    }
                    C0845k c0845k2 = C0845k.this;
                    this.f4172a = obj;
                    this.f4173b = 3;
                    if (c0845k2.B(obj, true, this) == e10) {
                        return e10;
                    }
                    obj2 = obj;
                    return obj2;
                }
                lc.p.b(obj);
            }
            c0840f = (C0840f) obj;
            CoroutineContext coroutineContext = this.f4175d;
            a aVar = new a(this.f4176e, c0840f, null);
            this.f4172a = c0840f;
            this.f4173b = 2;
            obj = AbstractC0887i.g(coroutineContext, aVar, this);
            if (obj == e10) {
                return e10;
            }
            c0840f.b();
            if (!Intrinsics.b(c0840f.c(), obj)) {
            }
        }
    }

    /* renamed from: I0.k$t */
    static final class t extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f4180a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f4181b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2 f4183d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(Function2 function2, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f4183d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            t tVar = C0845k.this.new t(this.f4183d, dVar);
            tVar.f4181b = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((t) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f4180a;
            if (i10 == 0) {
                lc.p.b(obj);
                N n10 = (N) this.f4181b;
                InterfaceC0914w b10 = AbstractC0918y.b(null, 1, null);
                C0845k.this.f4062l.e(new w.a(this.f4183d, b10, C0845k.this.f4058h.a(), n10.y()));
                this.f4180a = 1;
                obj = b10.q(this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return obj;
        }
    }

    /* renamed from: I0.k$u */
    static final class u extends xc.m implements Function1 {
        u() {
            super(1);
        }

        public final void a(Throwable th) {
            if (th != null) {
                C0845k.this.f4058h.c(new I0.r(th));
            }
            if (C0845k.this.f4060j.a()) {
                C0845k.this.s().close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f36324a;
        }
    }

    /* renamed from: I0.k$v */
    static final class v extends xc.m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final v f4185a = new v();

        v() {
            super(2);
        }

        public final void a(w.a msg, Throwable th) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            InterfaceC0914w a10 = msg.a();
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            a10.F(th);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((w.a) obj, (Throwable) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: I0.k$w */
    static final class w extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f4186a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f4187b;

        w(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            w wVar = C0845k.this.new w(dVar);
            wVar.f4187b = obj;
            return wVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w.a aVar, kotlin.coroutines.d dVar) {
            return ((w) create(aVar, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f4186a;
            if (i10 == 0) {
                lc.p.b(obj);
                w.a aVar = (w.a) this.f4187b;
                C0845k c0845k = C0845k.this;
                this.f4186a = 1;
                if (c0845k.t(aVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return Unit.f36324a;
        }
    }

    /* renamed from: I0.k$x */
    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4189a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f4190b;

        /* renamed from: d, reason: collision with root package name */
        int f4192d;

        x(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4190b = obj;
            this.f4192d |= Integer.MIN_VALUE;
            return C0845k.this.B(null, false, this);
        }
    }

    /* renamed from: I0.k$y */
    static final class y extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        Object f4193a;

        /* renamed from: b, reason: collision with root package name */
        int f4194b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f4195c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ xc.z f4196d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C0845k f4197e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f4198f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f4199g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(xc.z zVar, C0845k c0845k, Object obj, boolean z10, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f4196d = zVar;
            this.f4197e = c0845k;
            this.f4198f = obj;
            this.f4199g = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            y yVar = new y(this.f4196d, this.f4197e, this.f4198f, this.f4199g, dVar);
            yVar.f4195c = obj;
            return yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(K k10, kotlin.coroutines.d dVar) {
            return ((y) create(k10, dVar)).invokeSuspend(Unit.f36324a);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            xc.z zVar;
            K k10;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f4194b;
            if (i10 == 0) {
                lc.p.b(obj);
                K k11 = (K) this.f4195c;
                zVar = this.f4196d;
                I0.t r10 = this.f4197e.r();
                this.f4195c = k11;
                this.f4193a = zVar;
                this.f4194b = 1;
                Object e11 = r10.e(this);
                if (e11 == e10) {
                    return e10;
                }
                k10 = k11;
                obj = e11;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                    if (this.f4199g) {
                        I0.l lVar = this.f4197e.f4058h;
                        Object obj2 = this.f4198f;
                        lVar.c(new C0840f(obj2, obj2 != null ? obj2.hashCode() : 0, this.f4196d.f45000a));
                    }
                    return Unit.f36324a;
                }
                zVar = (xc.z) this.f4193a;
                k10 = (K) this.f4195c;
                lc.p.b(obj);
            }
            zVar.f45000a = ((Number) obj).intValue();
            Object obj3 = this.f4198f;
            this.f4195c = null;
            this.f4193a = null;
            this.f4194b = 2;
            if (k10.a(obj3, this) == e10) {
                return e10;
            }
            if (this.f4199g) {
            }
            return Unit.f36324a;
        }
    }

    public C0845k(E storage, List initTasksList, InterfaceC0839e corruptionHandler, N scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f4051a = storage;
        this.f4052b = corruptionHandler;
        this.f4053c = scope;
        this.f4054d = Md.g.k(new d(null));
        this.f4055e = Sd.g.b(false, 1, null);
        this.f4058h = new I0.l();
        this.f4059i = new b(this, initTasksList);
        this.f4060j = lc.i.a(new r());
        this.f4061k = lc.i.a(new c());
        this.f4062l = new B(scope, new u(), v.f4185a, new w(null));
    }

    private final Object A(Function2 function2, CoroutineContext coroutineContext, kotlin.coroutines.d dVar) {
        return r().c(new s(coroutineContext, function2, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:11:0x004e, B:13:0x0056, B:15:0x005a, B:16:0x0060, B:17:0x0062), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(kotlin.coroutines.d dVar) {
        e eVar;
        int i10;
        C0845k c0845k;
        Sd.a aVar;
        int i11;
        try {
            if (dVar instanceof e) {
                eVar = (e) dVar;
                int i12 = eVar.f4113e;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    eVar.f4113e = i12 - Integer.MIN_VALUE;
                    Object obj = eVar.f4111c;
                    Object e10 = AbstractC3868b.e();
                    i10 = eVar.f4113e;
                    if (i10 != 0) {
                        lc.p.b(obj);
                        Sd.a aVar2 = this.f4055e;
                        eVar.f4109a = this;
                        eVar.f4110b = aVar2;
                        eVar.f4113e = 1;
                        if (aVar2.b(null, eVar) == e10) {
                            return e10;
                        }
                        c0845k = this;
                        aVar = aVar2;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (Sd.a) eVar.f4110b;
                        c0845k = (C0845k) eVar.f4109a;
                        lc.p.b(obj);
                    }
                    i11 = c0845k.f4056f - 1;
                    c0845k.f4056f = i11;
                    if (i11 == 0) {
                        InterfaceC0915w0 interfaceC0915w0 = c0845k.f4057g;
                        if (interfaceC0915w0 != null) {
                            InterfaceC0915w0.a.a(interfaceC0915w0, null, 1, null);
                        }
                        c0845k.f4057g = null;
                    }
                    Unit unit = Unit.f36324a;
                    aVar.c(null);
                    return Unit.f36324a;
                }
            }
            i11 = c0845k.f4056f - 1;
            c0845k.f4056f = i11;
            if (i11 == 0) {
            }
            Unit unit2 = Unit.f36324a;
            aVar.c(null);
            return Unit.f36324a;
        } catch (Throwable th) {
            aVar.c(null);
            throw th;
        }
        eVar = new e(dVar);
        Object obj2 = eVar.f4111c;
        Object e102 = AbstractC3868b.e();
        i10 = eVar.f4113e;
        if (i10 != 0) {
        }
    }

    private final Object q(boolean z10, Function1 function1, kotlin.coroutines.d dVar) {
        return z10 ? function1.invoke(dVar) : r().c(new f(function1, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final I0.t r() {
        return (I0.t) this.f4061k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(4:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:54)|(2:40|(2:42|(1:44)(1:45))(2:46|47))(2:48|(2:50|51)(2:52|53))))|24|(1:27)|26|14|15|16))|59|6|7|(0)(0)|24|(0)|26|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0034, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r9v21, types: [Jd.w] */
    /* JADX WARN: Type inference failed for: r9v28, types: [Jd.w] */
    /* JADX WARN: Type inference failed for: r9v3, types: [Jd.w] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(w.a aVar, kotlin.coroutines.d dVar) {
        g gVar;
        Object e10;
        int i10;
        Object b10;
        ?? r92;
        InterfaceC0914w a10;
        D a11;
        C0845k c0845k;
        Object A10;
        w.a aVar2;
        w.a aVar3;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i11 = gVar.f4121f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f4121f = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f4119d;
                e10 = AbstractC3868b.e();
                i10 = gVar.f4121f;
                boolean z10 = true;
                if (i10 == 0) {
                    if (i10 == 1) {
                        aVar3 = (InterfaceC0914w) gVar.f4116a;
                    } else if (i10 == 2) {
                        InterfaceC0914w interfaceC0914w = (InterfaceC0914w) gVar.f4118c;
                        c0845k = (C0845k) gVar.f4117b;
                        w.a aVar4 = (w.a) gVar.f4116a;
                        lc.p.b(obj);
                        a10 = interfaceC0914w;
                        aVar2 = aVar4;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar3 = (InterfaceC0914w) gVar.f4116a;
                    }
                    lc.p.b(obj);
                    aVar = aVar3;
                    b10 = lc.o.b(obj);
                    r92 = aVar;
                    AbstractC0918y.c(r92, b10);
                    return Unit.f36324a;
                }
                lc.p.b(obj);
                a10 = aVar.a();
                try {
                    o.a aVar5 = lc.o.f37128b;
                    a11 = this.f4058h.a();
                } catch (Throwable th) {
                    th = th;
                    aVar = a10;
                    o.a aVar6 = lc.o.f37128b;
                    b10 = lc.o.b(lc.p.a(th));
                    r92 = aVar;
                    AbstractC0918y.c(r92, b10);
                    return Unit.f36324a;
                }
                if (a11 instanceof C0840f) {
                    Function2 d10 = aVar.d();
                    CoroutineContext b11 = aVar.b();
                    gVar.f4116a = a10;
                    gVar.f4121f = 1;
                    A10 = A(d10, b11, gVar);
                    if (A10 == e10) {
                        return e10;
                    }
                    w.a aVar7 = a10;
                    obj = A10;
                    aVar = aVar7;
                    b10 = lc.o.b(obj);
                    r92 = aVar;
                    AbstractC0918y.c(r92, b10);
                    return Unit.f36324a;
                }
                if (!(a11 instanceof I0.x)) {
                    z10 = a11 instanceof H;
                }
                if (!z10) {
                    if (a11 instanceof I0.r) {
                        throw ((I0.r) a11).b();
                    }
                    throw new lc.m();
                }
                if (a11 != aVar.c()) {
                    Intrinsics.e(a11, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((I0.x) a11).b();
                }
                gVar.f4116a = aVar;
                gVar.f4117b = this;
                gVar.f4118c = a10;
                gVar.f4121f = 2;
                if (v(gVar) == e10) {
                    return e10;
                }
                c0845k = this;
                aVar2 = aVar;
                Function2 d11 = aVar2.d();
                CoroutineContext b12 = aVar2.b();
                gVar.f4116a = a10;
                gVar.f4117b = null;
                gVar.f4118c = null;
                gVar.f4121f = 3;
                A10 = c0845k.A(d11, b12, gVar);
                if (A10 == e10) {
                    return e10;
                }
                w.a aVar72 = a10;
                obj = A10;
                aVar = aVar72;
                b10 = lc.o.b(obj);
                r92 = aVar;
                AbstractC0918y.c(r92, b10);
                return Unit.f36324a;
            }
        }
        gVar = new g(dVar);
        Object obj2 = gVar.f4119d;
        e10 = AbstractC3868b.e();
        i10 = gVar.f4121f;
        boolean z102 = true;
        if (i10 == 0) {
        }
        Function2 d112 = aVar2.d();
        CoroutineContext b122 = aVar2.b();
        gVar.f4116a = a10;
        gVar.f4117b = null;
        gVar.f4118c = null;
        gVar.f4121f = 3;
        A10 = c0845k.A(d112, b122, gVar);
        if (A10 == e10) {
        }
        w.a aVar722 = a10;
        obj2 = A10;
        aVar = aVar722;
        b10 = lc.o.b(obj2);
        r92 = aVar;
        AbstractC0918y.c(r92, b10);
        return Unit.f36324a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x004e, B:13:0x0055, B:14:0x0069), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(kotlin.coroutines.d dVar) {
        h hVar;
        int i10;
        C0845k c0845k;
        Sd.a aVar;
        int i11;
        InterfaceC0915w0 d10;
        try {
            if (dVar instanceof h) {
                hVar = (h) dVar;
                int i12 = hVar.f4126e;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    hVar.f4126e = i12 - Integer.MIN_VALUE;
                    Object obj = hVar.f4124c;
                    Object e10 = AbstractC3868b.e();
                    i10 = hVar.f4126e;
                    if (i10 != 0) {
                        lc.p.b(obj);
                        Sd.a aVar2 = this.f4055e;
                        hVar.f4122a = this;
                        hVar.f4123b = aVar2;
                        hVar.f4126e = 1;
                        if (aVar2.b(null, hVar) == e10) {
                            return e10;
                        }
                        c0845k = this;
                        aVar = aVar2;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (Sd.a) hVar.f4123b;
                        c0845k = (C0845k) hVar.f4122a;
                        lc.p.b(obj);
                    }
                    i11 = c0845k.f4056f + 1;
                    c0845k.f4056f = i11;
                    if (i11 == 1) {
                        d10 = AbstractC0891k.d(c0845k.f4053c, null, null, c0845k.new i(null), 3, null);
                        c0845k.f4057g = d10;
                    }
                    Unit unit = Unit.f36324a;
                    aVar.c(null);
                    return Unit.f36324a;
                }
            }
            i11 = c0845k.f4056f + 1;
            c0845k.f4056f = i11;
            if (i11 == 1) {
            }
            Unit unit2 = Unit.f36324a;
            aVar.c(null);
            return Unit.f36324a;
        } catch (Throwable th) {
            aVar.c(null);
            throw th;
        }
        hVar = new h(dVar);
        Object obj2 = hVar.f4124c;
        Object e102 = AbstractC3868b.e();
        i10 = hVar.f4126e;
        if (i10 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(kotlin.coroutines.d dVar) {
        j jVar;
        Object e10;
        int i10;
        C0845k c0845k;
        int intValue;
        int i11;
        Throwable th;
        C0845k c0845k2;
        b bVar;
        try {
            if (dVar instanceof j) {
                jVar = (j) dVar;
                int i12 = jVar.f4134e;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    jVar.f4134e = i12 - Integer.MIN_VALUE;
                    Object obj = jVar.f4132c;
                    e10 = AbstractC3868b.e();
                    i10 = jVar.f4134e;
                    if (i10 != 0) {
                        lc.p.b(obj);
                        I0.t r10 = r();
                        jVar.f4130a = this;
                        jVar.f4134e = 1;
                        obj = r10.a(jVar);
                        if (obj == e10) {
                            return e10;
                        }
                        c0845k = this;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i11 = jVar.f4131b;
                            c0845k2 = (C0845k) jVar.f4130a;
                            try {
                                lc.p.b(obj);
                                return Unit.f36324a;
                            } catch (Throwable th2) {
                                th = th2;
                                c0845k2.f4058h.c(new I0.x(th, i11));
                                throw th;
                            }
                        }
                        c0845k = (C0845k) jVar.f4130a;
                        lc.p.b(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    bVar = c0845k.f4059i;
                    jVar.f4130a = c0845k;
                    jVar.f4131b = intValue;
                    jVar.f4134e = 2;
                    if (bVar.c(jVar) == e10) {
                        return e10;
                    }
                    return Unit.f36324a;
                }
            }
            bVar = c0845k.f4059i;
            jVar.f4130a = c0845k;
            jVar.f4131b = intValue;
            jVar.f4134e = 2;
            if (bVar.c(jVar) == e10) {
            }
            return Unit.f36324a;
        } catch (Throwable th3) {
            i11 = intValue;
            th = th3;
            c0845k2 = c0845k;
            c0845k2.f4058h.c(new I0.x(th, i11));
            throw th;
        }
        jVar = new j(dVar);
        Object obj2 = jVar.f4132c;
        e10 = AbstractC3868b.e();
        i10 = jVar.f4134e;
        if (i10 != 0) {
        }
        intValue = ((Number) obj2).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(boolean z10, kotlin.coroutines.d dVar) {
        C0087k c0087k;
        int i10;
        D d10;
        Object obj;
        boolean z11;
        C0845k c0845k;
        boolean z12;
        Pair pair;
        if (dVar instanceof C0087k) {
            c0087k = (C0087k) dVar;
            int i11 = c0087k.f4140f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0087k.f4140f = i11 - Integer.MIN_VALUE;
                Object obj2 = c0087k.f4138d;
                Object e10 = AbstractC3868b.e();
                i10 = c0087k.f4140f;
                if (i10 != 0) {
                    lc.p.b(obj2);
                    D a10 = this.f4058h.a();
                    if (a10 instanceof H) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    I0.t r10 = r();
                    c0087k.f4135a = this;
                    c0087k.f4136b = a10;
                    c0087k.f4137c = z10;
                    c0087k.f4140f = 1;
                    Object a11 = r10.a(c0087k);
                    if (a11 == e10) {
                        return e10;
                    }
                    d10 = a10;
                    obj = a11;
                    z11 = z10;
                    c0845k = this;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            c0845k = (C0845k) c0087k.f4135a;
                            lc.p.b(obj2);
                            pair = (Pair) obj2;
                            D d11 = (D) pair.getFirst();
                            if (((Boolean) pair.getSecond()).booleanValue()) {
                            }
                            return d11;
                        }
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0845k = (C0845k) c0087k.f4135a;
                        lc.p.b(obj2);
                        pair = (Pair) obj2;
                        D d112 = (D) pair.getFirst();
                        if (((Boolean) pair.getSecond()).booleanValue()) {
                            c0845k.f4058h.c(d112);
                        }
                        return d112;
                    }
                    boolean z13 = c0087k.f4137c;
                    D d12 = (D) c0087k.f4136b;
                    C0845k c0845k2 = (C0845k) c0087k.f4135a;
                    lc.p.b(obj2);
                    z11 = z13;
                    c0845k = c0845k2;
                    d10 = d12;
                    obj = obj2;
                }
                int intValue = ((Number) obj).intValue();
                z12 = d10 instanceof C0840f;
                int a12 = !z12 ? d10.a() : -1;
                if (!z12 && intValue == a12) {
                    return d10;
                }
                if (z11) {
                    I0.t r11 = c0845k.r();
                    m mVar = c0845k.new m(a12, null);
                    c0087k.f4135a = c0845k;
                    c0087k.f4136b = null;
                    c0087k.f4140f = 3;
                    obj2 = r11.b(mVar, c0087k);
                    if (obj2 == e10) {
                        return e10;
                    }
                    pair = (Pair) obj2;
                    D d1122 = (D) pair.getFirst();
                    if (((Boolean) pair.getSecond()).booleanValue()) {
                    }
                    return d1122;
                }
                I0.t r12 = c0845k.r();
                l lVar = c0845k.new l(null);
                c0087k.f4135a = c0845k;
                c0087k.f4136b = null;
                c0087k.f4140f = 2;
                obj2 = r12.c(lVar, c0087k);
                if (obj2 == e10) {
                    return e10;
                }
                pair = (Pair) obj2;
                D d11222 = (D) pair.getFirst();
                if (((Boolean) pair.getSecond()).booleanValue()) {
                }
                return d11222;
            }
        }
        c0087k = new C0087k(dVar);
        Object obj22 = c0087k.f4138d;
        Object e102 = AbstractC3868b.e();
        i10 = c0087k.f4140f;
        if (i10 != 0) {
        }
        int intValue2 = ((Number) obj).intValue();
        z12 = d10 instanceof C0840f;
        if (!z12) {
        }
        if (!z12) {
        }
        if (z11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(kotlin.coroutines.d dVar) {
        return G.a(s(), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|85|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0067, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0068, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(boolean z10, kotlin.coroutines.d dVar) {
        n nVar;
        ?? r22;
        C0845k c0845k;
        C5141B c5141b;
        Object a10;
        C0838d c0838d;
        C5141B c5141b2;
        C0838d c0838d2;
        p pVar;
        xc.z zVar;
        C5141B c5141b3;
        C0845k c0845k2;
        C0845k c0845k3;
        int hashCode;
        Object a11;
        boolean z11;
        int i10;
        Object obj;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i11 = nVar.f4157i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f4157i = i11 - Integer.MIN_VALUE;
                Object obj2 = nVar.f4155g;
                Object e10 = AbstractC3868b.e();
                r22 = nVar.f4157i;
                switch (r22) {
                    case 0:
                        lc.p.b(obj2);
                        try {
                            if (!z10) {
                                I0.t r10 = r();
                                nVar.f4149a = this;
                                nVar.f4153e = z10;
                                nVar.f4157i = 3;
                                obj2 = r10.a(nVar);
                                if (obj2 == e10) {
                                    return e10;
                                }
                                c0845k2 = this;
                                int intValue = ((Number) obj2).intValue();
                                I0.t r11 = c0845k2.r();
                                o oVar = c0845k2.new o(intValue, null);
                                nVar.f4149a = c0845k2;
                                nVar.f4153e = z10;
                                nVar.f4157i = 4;
                                obj2 = r11.b(oVar, nVar);
                                if (obj2 == e10) {
                                    return e10;
                                }
                                return (C0840f) obj2;
                            }
                            nVar.f4149a = this;
                            nVar.f4153e = z10;
                            nVar.f4157i = 1;
                            obj2 = x(nVar);
                            if (obj2 == e10) {
                                return e10;
                            }
                            c0845k3 = this;
                            if (obj2 == null) {
                                try {
                                    hashCode = obj2.hashCode();
                                } catch (C0838d e11) {
                                    e = e11;
                                    c0845k = c0845k3;
                                    c5141b = new C5141B();
                                    InterfaceC0839e interfaceC0839e = c0845k.f4052b;
                                    nVar.f4149a = c0845k;
                                    nVar.f4150b = e;
                                    nVar.f4151c = c5141b;
                                    nVar.f4152d = c5141b;
                                    nVar.f4153e = z10;
                                    nVar.f4157i = 5;
                                    a10 = interfaceC0839e.a(e, nVar);
                                    if (a10 == e10) {
                                    }
                                }
                            } else {
                                hashCode = 0;
                            }
                            I0.t r12 = c0845k3.r();
                            nVar.f4149a = c0845k3;
                            nVar.f4150b = obj2;
                            nVar.f4153e = z10;
                            nVar.f4154f = hashCode;
                            nVar.f4157i = 2;
                            a11 = r12.a(nVar);
                            if (a11 != e10) {
                                return e10;
                            }
                            int i12 = hashCode;
                            z11 = z10;
                            i10 = i12;
                            obj = obj2;
                            obj2 = a11;
                            return new C0840f(obj, i10, ((Number) obj2).intValue());
                        } catch (C0838d e12) {
                            e = e12;
                            c0845k = this;
                            c5141b = new C5141B();
                            InterfaceC0839e interfaceC0839e2 = c0845k.f4052b;
                            nVar.f4149a = c0845k;
                            nVar.f4150b = e;
                            nVar.f4151c = c5141b;
                            nVar.f4152d = c5141b;
                            nVar.f4153e = z10;
                            nVar.f4157i = 5;
                            a10 = interfaceC0839e2.a(e, nVar);
                            if (a10 == e10) {
                            }
                        }
                        break;
                    case 1:
                        z10 = nVar.f4153e;
                        C0845k c0845k4 = (C0845k) nVar.f4149a;
                        lc.p.b(obj2);
                        c0845k3 = c0845k4;
                        if (obj2 == null) {
                        }
                        I0.t r122 = c0845k3.r();
                        nVar.f4149a = c0845k3;
                        nVar.f4150b = obj2;
                        nVar.f4153e = z10;
                        nVar.f4154f = hashCode;
                        nVar.f4157i = 2;
                        a11 = r122.a(nVar);
                        if (a11 != e10) {
                        }
                        break;
                    case 2:
                        i10 = nVar.f4154f;
                        z11 = nVar.f4153e;
                        obj = nVar.f4150b;
                        c0845k3 = (C0845k) nVar.f4149a;
                        try {
                            lc.p.b(obj2);
                            return new C0840f(obj, i10, ((Number) obj2).intValue());
                        } catch (C0838d e13) {
                            e = e13;
                            z10 = z11;
                            c0845k = c0845k3;
                            c5141b = new C5141B();
                            InterfaceC0839e interfaceC0839e22 = c0845k.f4052b;
                            nVar.f4149a = c0845k;
                            nVar.f4150b = e;
                            nVar.f4151c = c5141b;
                            nVar.f4152d = c5141b;
                            nVar.f4153e = z10;
                            nVar.f4157i = 5;
                            a10 = interfaceC0839e22.a(e, nVar);
                            if (a10 == e10) {
                                return e10;
                            }
                            c0838d = e;
                            obj2 = a10;
                            c5141b2 = c5141b;
                            c5141b2.f44962a = obj2;
                            xc.z zVar2 = new xc.z();
                            try {
                                pVar = new p(c5141b, c0845k, zVar2, null);
                                nVar.f4149a = c0838d;
                                nVar.f4150b = c5141b;
                                nVar.f4151c = zVar2;
                                nVar.f4152d = null;
                                nVar.f4157i = 6;
                                if (c0845k.q(z10, pVar, nVar) != e10) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                c0838d2 = c0838d;
                                AbstractC3622a.a(c0838d2, th);
                                throw c0838d2;
                            }
                        }
                        break;
                    case 3:
                        z10 = nVar.f4153e;
                        c0845k2 = (C0845k) nVar.f4149a;
                        lc.p.b(obj2);
                        int intValue2 = ((Number) obj2).intValue();
                        I0.t r112 = c0845k2.r();
                        o oVar2 = c0845k2.new o(intValue2, null);
                        nVar.f4149a = c0845k2;
                        nVar.f4153e = z10;
                        nVar.f4157i = 4;
                        obj2 = r112.b(oVar2, nVar);
                        if (obj2 == e10) {
                        }
                        return (C0840f) obj2;
                    case 4:
                        boolean z12 = nVar.f4153e;
                        lc.p.b(obj2);
                        return (C0840f) obj2;
                    case 5:
                        z10 = nVar.f4153e;
                        C5141B c5141b4 = (C5141B) nVar.f4152d;
                        C5141B c5141b5 = (C5141B) nVar.f4151c;
                        c0838d = (C0838d) nVar.f4150b;
                        c0845k = (C0845k) nVar.f4149a;
                        lc.p.b(obj2);
                        c5141b2 = c5141b4;
                        c5141b = c5141b5;
                        c5141b2.f44962a = obj2;
                        xc.z zVar22 = new xc.z();
                        pVar = new p(c5141b, c0845k, zVar22, null);
                        nVar.f4149a = c0838d;
                        nVar.f4150b = c5141b;
                        nVar.f4151c = zVar22;
                        nVar.f4152d = null;
                        nVar.f4157i = 6;
                        if (c0845k.q(z10, pVar, nVar) != e10) {
                            return e10;
                        }
                        zVar = zVar22;
                        c5141b3 = c5141b;
                        Object obj3 = c5141b3.f44962a;
                        return new C0840f(obj3, obj3 != null ? obj3.hashCode() : 0, zVar.f45000a);
                    case 6:
                        zVar = (xc.z) nVar.f4151c;
                        c5141b3 = (C5141B) nVar.f4150b;
                        c0838d2 = (C0838d) nVar.f4149a;
                        try {
                            lc.p.b(obj2);
                            Object obj32 = c5141b3.f44962a;
                            return new C0840f(obj32, obj32 != null ? obj32.hashCode() : 0, zVar.f45000a);
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC3622a.a(c0838d2, th);
                            throw c0838d2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        nVar = new n(dVar);
        Object obj22 = nVar.f4155g;
        Object e102 = AbstractC3868b.e();
        r22 = nVar.f4157i;
        switch (r22) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(boolean z10, kotlin.coroutines.d dVar) {
        return AbstractC0887i.g(this.f4053c.y(), new q(z10, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(Object obj, boolean z10, kotlin.coroutines.d dVar) {
        x xVar;
        int i10;
        xc.z zVar;
        if (dVar instanceof x) {
            xVar = (x) dVar;
            int i11 = xVar.f4192d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f4192d = i11 - Integer.MIN_VALUE;
                Object obj2 = xVar.f4190b;
                Object e10 = AbstractC3868b.e();
                i10 = xVar.f4192d;
                if (i10 != 0) {
                    lc.p.b(obj2);
                    xc.z zVar2 = new xc.z();
                    F s10 = s();
                    y yVar = new y(zVar2, this, obj, z10, null);
                    xVar.f4189a = zVar2;
                    xVar.f4192d = 1;
                    if (s10.c(yVar, xVar) == e10) {
                        return e10;
                    }
                    zVar = zVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = (xc.z) xVar.f4189a;
                    lc.p.b(obj2);
                }
                return kotlin.coroutines.jvm.internal.b.b(zVar.f45000a);
            }
        }
        xVar = new x(dVar);
        Object obj22 = xVar.f4190b;
        Object e102 = AbstractC3868b.e();
        i10 = xVar.f4192d;
        if (i10 != 0) {
        }
        return kotlin.coroutines.jvm.internal.b.b(zVar.f45000a);
    }

    @Override // I0.InterfaceC0843i
    public Object a(Function2 function2, kotlin.coroutines.d dVar) {
        J j10 = (J) dVar.getContext().a(J.a.C0080a.f4026a);
        if (j10 != null) {
            j10.e(this);
        }
        return AbstractC0887i.g(new J(j10, this), new t(function2, null), dVar);
    }

    @Override // I0.InterfaceC0843i
    public Md.e getData() {
        return this.f4054d;
    }

    public final F s() {
        return (F) this.f4060j.getValue();
    }
}
