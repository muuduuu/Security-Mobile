package Md;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
abstract /* synthetic */ class p {

    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f6426a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f6427b;

        public a(e eVar, Function2 function2) {
            this.f6426a = eVar;
            this.f6427b = function2;
        }

        @Override // Md.e
        public Object b(f fVar, kotlin.coroutines.d dVar) {
            Object b10 = this.f6426a.b(new b(new xc.y(), fVar, this.f6427b), dVar);
            return b10 == AbstractC3868b.e() ? b10 : Unit.f36324a;
        }
    }

    static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ xc.y f6428a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f6429b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f6430c;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f6431a;

            /* renamed from: b, reason: collision with root package name */
            Object f6432b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f6433c;

            /* renamed from: e, reason: collision with root package name */
            int f6435e;

            a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f6433c = obj;
                this.f6435e |= Integer.MIN_VALUE;
                return b.this.f(null, this);
            }
        }

        b(xc.y yVar, f fVar, Function2 function2) {
            this.f6428a = yVar;
            this.f6429b = fVar;
            this.f6430c = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // Md.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object f(Object obj, kotlin.coroutines.d dVar) {
            a aVar;
            int i10;
            b bVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.f6435e;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f6435e = i11 - Integer.MIN_VALUE;
                    Object obj2 = aVar.f6433c;
                    Object e10 = AbstractC3868b.e();
                    i10 = aVar.f6435e;
                    if (i10 != 0) {
                        lc.p.b(obj2);
                        if (this.f6428a.f44999a) {
                            f fVar = this.f6429b;
                            aVar.f6435e = 1;
                            if (fVar.f(obj, aVar) == e10) {
                                return e10;
                            }
                            return Unit.f36324a;
                        }
                        Function2 function2 = this.f6430c;
                        aVar.f6431a = this;
                        aVar.f6432b = obj;
                        aVar.f6435e = 2;
                        obj2 = function2.invoke(obj, aVar);
                        if (obj2 == e10) {
                            return e10;
                        }
                        bVar = this;
                        if (!((Boolean) obj2).booleanValue()) {
                        }
                    } else {
                        if (i10 == 1) {
                            lc.p.b(obj2);
                            return Unit.f36324a;
                        }
                        if (i10 == 2) {
                            obj = aVar.f6432b;
                            bVar = (b) aVar.f6431a;
                            lc.p.b(obj2);
                            if (!((Boolean) obj2).booleanValue()) {
                                return Unit.f36324a;
                            }
                            bVar.f6428a.f44999a = true;
                            f fVar2 = bVar.f6429b;
                            aVar.f6431a = null;
                            aVar.f6432b = null;
                            aVar.f6435e = 3;
                            if (fVar2.f(obj, aVar) == e10) {
                                return e10;
                            }
                        } else {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            lc.p.b(obj2);
                        }
                    }
                    return Unit.f36324a;
                }
            }
            aVar = new a(dVar);
            Object obj22 = aVar.f6433c;
            Object e102 = AbstractC3868b.e();
            i10 = aVar.f6435e;
            if (i10 != 0) {
            }
            return Unit.f36324a;
        }
    }

    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f6436a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f6437b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f6438a;

            /* renamed from: b, reason: collision with root package name */
            int f6439b;

            /* renamed from: d, reason: collision with root package name */
            Object f6441d;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f6438a = obj;
                this.f6439b |= Integer.MIN_VALUE;
                return c.this.b(null, this);
            }
        }

        public c(e eVar, Function2 function2) {
            this.f6436a = eVar;
            this.f6437b = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // Md.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object b(f fVar, kotlin.coroutines.d dVar) {
            a aVar;
            int i10;
            d dVar2;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.f6439b;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f6439b = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f6438a;
                    Object e10 = AbstractC3868b.e();
                    i10 = aVar.f6439b;
                    if (i10 != 0) {
                        lc.p.b(obj);
                        e eVar = this.f6436a;
                        d dVar3 = new d(this.f6437b, fVar);
                        try {
                            aVar.f6441d = dVar3;
                            aVar.f6439b = 1;
                            if (eVar.b(dVar3, aVar) == e10) {
                                return e10;
                            }
                        } catch (Nd.a e11) {
                            e = e11;
                            dVar2 = dVar3;
                            Nd.m.a(e, dVar2);
                            return Unit.f36324a;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dVar2 = (d) aVar.f6441d;
                        try {
                            lc.p.b(obj);
                        } catch (Nd.a e12) {
                            e = e12;
                            Nd.m.a(e, dVar2);
                            return Unit.f36324a;
                        }
                    }
                    return Unit.f36324a;
                }
            }
            aVar = new a(dVar);
            Object obj2 = aVar.f6438a;
            Object e102 = AbstractC3868b.e();
            i10 = aVar.f6439b;
            if (i10 != 0) {
            }
            return Unit.f36324a;
        }
    }

    public static final class d implements f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f6442a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f6443b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f6444a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f6445b;

            /* renamed from: c, reason: collision with root package name */
            int f6446c;

            /* renamed from: e, reason: collision with root package name */
            Object f6448e;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f6445b = obj;
                this.f6446c |= Integer.MIN_VALUE;
                return d.this.f(null, this);
            }
        }

        public d(Function2 function2, f fVar) {
            this.f6442a = function2;
            this.f6443b = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // Md.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object f(Object obj, kotlin.coroutines.d dVar) {
            a aVar;
            int i10;
            boolean z10;
            Object obj2;
            Object obj3;
            d dVar2;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.f6446c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f6446c = i11 - Integer.MIN_VALUE;
                    Object obj4 = aVar.f6445b;
                    Object e10 = AbstractC3868b.e();
                    i10 = aVar.f6446c;
                    z10 = true;
                    if (i10 != 0) {
                        lc.p.b(obj4);
                        Function2 function2 = this.f6442a;
                        aVar.f6444a = this;
                        aVar.f6448e = obj;
                        aVar.f6446c = 1;
                        xc.k.a(6);
                        Object invoke = function2.invoke(obj, aVar);
                        xc.k.a(7);
                        if (invoke == e10) {
                            return e10;
                        }
                        obj2 = invoke;
                        obj3 = obj;
                        dVar2 = this;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            dVar2 = (d) aVar.f6444a;
                            lc.p.b(obj4);
                            if (z10) {
                                return Unit.f36324a;
                            }
                            throw new Nd.a(dVar2);
                        }
                        Object obj5 = aVar.f6448e;
                        d dVar3 = (d) aVar.f6444a;
                        lc.p.b(obj4);
                        obj3 = obj5;
                        dVar2 = dVar3;
                        obj2 = obj4;
                    }
                    if (((Boolean) obj2).booleanValue()) {
                        z10 = false;
                    } else {
                        f fVar = dVar2.f6443b;
                        aVar.f6444a = dVar2;
                        aVar.f6448e = null;
                        aVar.f6446c = 2;
                        if (fVar.f(obj3, aVar) == e10) {
                            return e10;
                        }
                    }
                    if (z10) {
                    }
                }
            }
            aVar = new a(dVar);
            Object obj42 = aVar.f6445b;
            Object e102 = AbstractC3868b.e();
            i10 = aVar.f6446c;
            z10 = true;
            if (i10 != 0) {
            }
            if (((Boolean) obj2).booleanValue()) {
            }
            if (z10) {
            }
        }
    }

    public static final e a(e eVar, Function2 function2) {
        return new a(eVar, function2);
    }

    public static final e b(e eVar, Function2 function2) {
        return new c(eVar, function2);
    }
}
