package I0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;

/* loaded from: classes.dex */
public final class C implements t {

    /* renamed from: a, reason: collision with root package name */
    private final String f4002a;

    /* renamed from: b, reason: collision with root package name */
    private final Sd.a f4003b;

    /* renamed from: c, reason: collision with root package name */
    private final C0836b f4004c;

    /* renamed from: d, reason: collision with root package name */
    private final Md.e f4005d;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4006a;

        /* renamed from: b, reason: collision with root package name */
        Object f4007b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4008c;

        /* renamed from: e, reason: collision with root package name */
        int f4010e;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4008c = obj;
            this.f4010e |= Integer.MIN_VALUE;
            return C.this.c(null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4011a;

        /* renamed from: b, reason: collision with root package name */
        boolean f4012b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4013c;

        /* renamed from: e, reason: collision with root package name */
        int f4015e;

        b(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4013c = obj;
            this.f4015e |= Integer.MIN_VALUE;
            return C.this.b(null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f4016a;

        c(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Md.f fVar, kotlin.coroutines.d dVar) {
            return ((c) create(fVar, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f4016a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            return Unit.f36324a;
        }
    }

    public C(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f4002a = filePath;
        this.f4003b = Sd.g.b(false, 1, null);
        this.f4004c = new C0836b(0);
        this.f4005d = Md.g.k(new c(null));
    }

    @Override // I0.t
    public Object a(kotlin.coroutines.d dVar) {
        return kotlin.coroutines.jvm.internal.b.b(this.f4004c.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // I0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(Function2 function2, kotlin.coroutines.d dVar) {
        b bVar;
        int i10;
        Sd.a aVar;
        Throwable th;
        boolean z10;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.f4015e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f4015e = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f4013c;
                Object e10 = AbstractC3868b.e();
                i10 = bVar.f4015e;
                if (i10 != 0) {
                    lc.p.b(obj);
                    Sd.a aVar2 = this.f4003b;
                    boolean a10 = aVar2.a(null);
                    try {
                        Object a11 = kotlin.coroutines.jvm.internal.b.a(a10);
                        bVar.f4011a = aVar2;
                        bVar.f4012b = a10;
                        bVar.f4015e = 1;
                        Object invoke = function2.invoke(a11, bVar);
                        if (invoke == e10) {
                            return e10;
                        }
                        aVar = aVar2;
                        obj = invoke;
                        z10 = a10;
                    } catch (Throwable th2) {
                        aVar = aVar2;
                        th = th2;
                        z10 = a10;
                        if (z10) {
                        }
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = bVar.f4012b;
                    aVar = (Sd.a) bVar.f4011a;
                    try {
                        lc.p.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z10) {
                            aVar.c(null);
                        }
                        throw th;
                    }
                }
                if (z10) {
                    aVar.c(null);
                }
                return obj;
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f4013c;
        Object e102 = AbstractC3868b.e();
        i10 = bVar.f4015e;
        if (i10 != 0) {
        }
        if (z10) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // I0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(Function1 function1, kotlin.coroutines.d dVar) {
        a aVar;
        Object e10;
        int i10;
        Sd.a aVar2;
        Throwable th;
        Sd.a aVar3;
        Object invoke;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.f4010e;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f4010e = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f4008c;
                    e10 = AbstractC3868b.e();
                    i10 = aVar.f4010e;
                    if (i10 != 0) {
                        lc.p.b(obj);
                        aVar2 = this.f4003b;
                        aVar.f4006a = function1;
                        aVar.f4007b = aVar2;
                        aVar.f4010e = 1;
                        if (aVar2.b(null, aVar) == e10) {
                            return e10;
                        }
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar3 = (Sd.a) aVar.f4006a;
                            try {
                                lc.p.b(obj);
                                aVar3.c(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar3.c(null);
                                throw th;
                            }
                        }
                        Sd.a aVar4 = (Sd.a) aVar.f4007b;
                        Function1 function12 = (Function1) aVar.f4006a;
                        lc.p.b(obj);
                        aVar2 = aVar4;
                        function1 = function12;
                    }
                    aVar.f4006a = aVar2;
                    aVar.f4007b = null;
                    aVar.f4010e = 2;
                    invoke = function1.invoke(aVar);
                    if (invoke != e10) {
                        return e10;
                    }
                    Sd.a aVar5 = aVar2;
                    obj = invoke;
                    aVar3 = aVar5;
                    aVar3.c(null);
                    return obj;
                }
            }
            aVar.f4006a = aVar2;
            aVar.f4007b = null;
            aVar.f4010e = 2;
            invoke = function1.invoke(aVar);
            if (invoke != e10) {
            }
        } catch (Throwable th3) {
            Sd.a aVar6 = aVar2;
            th = th3;
            aVar3 = aVar6;
            aVar3.c(null);
            throw th;
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f4008c;
        e10 = AbstractC3868b.e();
        i10 = aVar.f4010e;
        if (i10 != 0) {
        }
    }

    @Override // I0.t
    public Md.e d() {
        return this.f4005d;
    }

    @Override // I0.t
    public Object e(kotlin.coroutines.d dVar) {
        return kotlin.coroutines.jvm.internal.b.b(this.f4004c.d());
    }
}
