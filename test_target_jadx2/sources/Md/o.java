package Md;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lc.AbstractC3622a;
import pc.AbstractC3868b;
import wc.InterfaceC5068n;

/* loaded from: classes3.dex */
abstract /* synthetic */ class o {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6408a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6409b;

        /* renamed from: c, reason: collision with root package name */
        int f6410c;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6409b = obj;
            this.f6410c |= Integer.MIN_VALUE;
            return o.c(null, null, null, this);
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f6411a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5068n f6412b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f6413a;

            /* renamed from: b, reason: collision with root package name */
            int f6414b;

            /* renamed from: d, reason: collision with root package name */
            Object f6416d;

            /* renamed from: e, reason: collision with root package name */
            Object f6417e;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f6413a = obj;
                this.f6414b |= Integer.MIN_VALUE;
                return b.this.b(null, this);
            }
        }

        public b(e eVar, InterfaceC5068n interfaceC5068n) {
            this.f6411a = eVar;
            this.f6412b = interfaceC5068n;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // Md.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object b(f fVar, kotlin.coroutines.d dVar) {
            a aVar;
            Object e10;
            int i10;
            b bVar;
            A a10;
            InterfaceC5068n interfaceC5068n;
            Nd.r rVar;
            Throwable th;
            Nd.r rVar2;
            Object n10;
            try {
                if (dVar instanceof a) {
                    aVar = (a) dVar;
                    int i11 = aVar.f6414b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        aVar.f6414b = i11 - Integer.MIN_VALUE;
                        Object obj = aVar.f6413a;
                        e10 = AbstractC3868b.e();
                        i10 = aVar.f6414b;
                        if (i10 != 0) {
                            lc.p.b(obj);
                            try {
                                e eVar = this.f6411a;
                                aVar.f6416d = this;
                                aVar.f6417e = fVar;
                                aVar.f6414b = 1;
                                if (eVar.b(fVar, aVar) == e10) {
                                    return e10;
                                }
                                bVar = this;
                            } catch (Throwable th2) {
                                th = th2;
                                bVar = this;
                                a10 = new A(th);
                                interfaceC5068n = bVar.f6412b;
                                aVar.f6416d = th;
                                aVar.f6417e = null;
                                aVar.f6414b = 2;
                                if (o.c(a10, interfaceC5068n, th, aVar) != e10) {
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    Throwable th3 = (Throwable) aVar.f6416d;
                                    lc.p.b(obj);
                                    throw th3;
                                }
                                if (i10 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                rVar2 = (Nd.r) aVar.f6416d;
                                try {
                                    lc.p.b(obj);
                                    rVar2.releaseIntercepted();
                                    return Unit.f36324a;
                                } catch (Throwable th4) {
                                    th = th4;
                                    rVar2.releaseIntercepted();
                                    throw th;
                                }
                            }
                            fVar = (f) aVar.f6417e;
                            bVar = (b) aVar.f6416d;
                            try {
                                lc.p.b(obj);
                            } catch (Throwable th5) {
                                th = th5;
                                a10 = new A(th);
                                interfaceC5068n = bVar.f6412b;
                                aVar.f6416d = th;
                                aVar.f6417e = null;
                                aVar.f6414b = 2;
                                if (o.c(a10, interfaceC5068n, th, aVar) != e10) {
                                    return e10;
                                }
                                throw th;
                            }
                        }
                        rVar = new Nd.r(fVar, aVar.getContext());
                        InterfaceC5068n interfaceC5068n2 = bVar.f6412b;
                        aVar.f6416d = rVar;
                        aVar.f6417e = null;
                        aVar.f6414b = 3;
                        xc.k.a(6);
                        n10 = interfaceC5068n2.n(rVar, null, aVar);
                        xc.k.a(7);
                        if (n10 != e10) {
                            return e10;
                        }
                        rVar2 = rVar;
                        rVar2.releaseIntercepted();
                        return Unit.f36324a;
                    }
                }
                InterfaceC5068n interfaceC5068n22 = bVar.f6412b;
                aVar.f6416d = rVar;
                aVar.f6417e = null;
                aVar.f6414b = 3;
                xc.k.a(6);
                n10 = interfaceC5068n22.n(rVar, null, aVar);
                xc.k.a(7);
                if (n10 != e10) {
                }
            } catch (Throwable th6) {
                th = th6;
                rVar2 = rVar;
                rVar2.releaseIntercepted();
                throw th;
            }
            aVar = new a(dVar);
            Object obj2 = aVar.f6413a;
            e10 = AbstractC3868b.e();
            i10 = aVar.f6414b;
            if (i10 != 0) {
            }
            rVar = new Nd.r(fVar, aVar.getContext());
        }
    }

    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f6418a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f6419b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f6420a;

            /* renamed from: b, reason: collision with root package name */
            int f6421b;

            /* renamed from: d, reason: collision with root package name */
            Object f6423d;

            /* renamed from: e, reason: collision with root package name */
            Object f6424e;

            /* renamed from: f, reason: collision with root package name */
            Object f6425f;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f6420a = obj;
                this.f6421b |= Integer.MIN_VALUE;
                return c.this.b(null, this);
            }
        }

        public c(Function2 function2, e eVar) {
            this.f6418a = function2;
            this.f6419b = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // Md.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object b(f fVar, kotlin.coroutines.d dVar) {
            a aVar;
            Object e10;
            int i10;
            Throwable th;
            Nd.r rVar;
            c cVar;
            f fVar2;
            e eVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.f6421b;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f6421b = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f6420a;
                    e10 = AbstractC3868b.e();
                    i10 = aVar.f6421b;
                    if (i10 != 0) {
                        lc.p.b(obj);
                        Nd.r rVar2 = new Nd.r(fVar, aVar.getContext());
                        try {
                            Function2 function2 = this.f6418a;
                            aVar.f6423d = this;
                            aVar.f6424e = fVar;
                            aVar.f6425f = rVar2;
                            aVar.f6421b = 1;
                            xc.k.a(6);
                            Object invoke = function2.invoke(rVar2, aVar);
                            xc.k.a(7);
                            if (invoke == e10) {
                                return e10;
                            }
                            cVar = this;
                            fVar2 = fVar;
                            rVar = rVar2;
                        } catch (Throwable th2) {
                            th = th2;
                            rVar = rVar2;
                            rVar.releaseIntercepted();
                            throw th;
                        }
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            lc.p.b(obj);
                            return Unit.f36324a;
                        }
                        rVar = (Nd.r) aVar.f6425f;
                        fVar2 = (f) aVar.f6424e;
                        cVar = (c) aVar.f6423d;
                        try {
                            lc.p.b(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            rVar.releaseIntercepted();
                            throw th;
                        }
                    }
                    rVar.releaseIntercepted();
                    eVar = cVar.f6419b;
                    aVar.f6423d = null;
                    aVar.f6424e = null;
                    aVar.f6425f = null;
                    aVar.f6421b = 2;
                    if (eVar.b(fVar2, aVar) == e10) {
                        return e10;
                    }
                    return Unit.f36324a;
                }
            }
            aVar = new a(dVar);
            Object obj2 = aVar.f6420a;
            e10 = AbstractC3868b.e();
            i10 = aVar.f6421b;
            if (i10 != 0) {
            }
            rVar.releaseIntercepted();
            eVar = cVar.f6419b;
            aVar.f6423d = null;
            aVar.f6424e = null;
            aVar.f6425f = null;
            aVar.f6421b = 2;
            if (eVar.b(fVar2, aVar) == e10) {
            }
            return Unit.f36324a;
        }
    }

    public static final void b(f fVar) {
        if (fVar instanceof A) {
            throw ((A) fVar).f6380a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(f fVar, InterfaceC5068n interfaceC5068n, Throwable th, kotlin.coroutines.d dVar) {
        a aVar;
        int i10;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.f6410c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f6410c = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f6409b;
                    Object e10 = AbstractC3868b.e();
                    i10 = aVar.f6410c;
                    if (i10 != 0) {
                        lc.p.b(obj);
                        aVar.f6408a = th;
                        aVar.f6410c = 1;
                        if (interfaceC5068n.n(fVar, th, aVar) == e10) {
                            return e10;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) aVar.f6408a;
                        lc.p.b(obj);
                    }
                    return Unit.f36324a;
                }
            }
            if (i10 != 0) {
            }
            return Unit.f36324a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC3622a.a(th2, th);
            }
            throw th2;
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f6409b;
        Object e102 = AbstractC3868b.e();
        i10 = aVar.f6410c;
    }

    public static final e d(e eVar, InterfaceC5068n interfaceC5068n) {
        return new b(eVar, interfaceC5068n);
    }

    public static final e e(e eVar, Function2 function2) {
        return new c(function2, eVar);
    }
}
