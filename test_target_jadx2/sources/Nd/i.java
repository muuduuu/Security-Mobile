package Nd;

import Jd.AbstractC0891k;
import Jd.N;
import Jd.X0;
import Ld.x;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import pc.AbstractC3868b;
import wc.InterfaceC5068n;

/* loaded from: classes3.dex */
public abstract class i {

    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        Object f6762a;

        /* renamed from: b, reason: collision with root package name */
        Object f6763b;

        /* renamed from: c, reason: collision with root package name */
        int f6764c;

        /* renamed from: d, reason: collision with root package name */
        int f6765d;

        /* renamed from: e, reason: collision with root package name */
        int f6766e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f6767f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Md.e[] f6768g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f6769h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5068n f6770i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Md.f f6771j;

        /* renamed from: Nd.i$a$a, reason: collision with other inner class name */
        static final class C0133a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f6772a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Md.e[] f6773b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f6774c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f6775d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Ld.g f6776e;

            /* renamed from: Nd.i$a$a$a, reason: collision with other inner class name */
            static final class C0134a implements Md.f {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Ld.g f6777a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ int f6778b;

                /* renamed from: Nd.i$a$a$a$a, reason: collision with other inner class name */
                static final class C0135a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f6779a;

                    /* renamed from: c, reason: collision with root package name */
                    int f6781c;

                    C0135a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f6779a = obj;
                        this.f6781c |= Integer.MIN_VALUE;
                        return C0134a.this.f(null, this);
                    }
                }

                C0134a(Ld.g gVar, int i10) {
                    this.f6777a = gVar;
                    this.f6778b = i10;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // Md.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object f(Object obj, kotlin.coroutines.d dVar) {
                    C0135a c0135a;
                    Object e10;
                    int i10;
                    if (dVar instanceof C0135a) {
                        c0135a = (C0135a) dVar;
                        int i11 = c0135a.f6781c;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            c0135a.f6781c = i11 - Integer.MIN_VALUE;
                            Object obj2 = c0135a.f6779a;
                            e10 = AbstractC3868b.e();
                            i10 = c0135a.f6781c;
                            if (i10 != 0) {
                                lc.p.b(obj2);
                                Ld.g gVar = this.f6777a;
                                IndexedValue indexedValue = new IndexedValue(this.f6778b, obj);
                                c0135a.f6781c = 1;
                                if (gVar.D(indexedValue, c0135a) == e10) {
                                    return e10;
                                }
                            } else {
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    lc.p.b(obj2);
                                    return Unit.f36324a;
                                }
                                lc.p.b(obj2);
                            }
                            c0135a.f6781c = 2;
                            if (X0.a(c0135a) == e10) {
                                return e10;
                            }
                            return Unit.f36324a;
                        }
                    }
                    c0135a = new C0135a(dVar);
                    Object obj22 = c0135a.f6779a;
                    e10 = AbstractC3868b.e();
                    i10 = c0135a.f6781c;
                    if (i10 != 0) {
                    }
                    c0135a.f6781c = 2;
                    if (X0.a(c0135a) == e10) {
                    }
                    return Unit.f36324a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0133a(Md.e[] eVarArr, int i10, AtomicInteger atomicInteger, Ld.g gVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f6773b = eVarArr;
                this.f6774c = i10;
                this.f6775d = atomicInteger;
                this.f6776e = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                return new C0133a(this.f6773b, this.f6774c, this.f6775d, this.f6776e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(N n10, kotlin.coroutines.d dVar) {
                return ((C0133a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object e10 = AbstractC3868b.e();
                int i10 = this.f6772a;
                try {
                    if (i10 == 0) {
                        lc.p.b(obj);
                        Md.e[] eVarArr = this.f6773b;
                        int i11 = this.f6774c;
                        Md.e eVar = eVarArr[i11];
                        C0134a c0134a = new C0134a(this.f6776e, i11);
                        this.f6772a = 1;
                        if (eVar.b(c0134a, this) == e10) {
                            return e10;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lc.p.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        x.a.a(this.f6776e, null, 1, null);
                    }
                    return Unit.f36324a;
                } finally {
                    if (this.f6775d.decrementAndGet() == 0) {
                        x.a.a(this.f6776e, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Md.e[] eVarArr, Function0 function0, InterfaceC5068n interfaceC5068n, Md.f fVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f6768g = eVarArr;
            this.f6769h = function0;
            this.f6770i = interfaceC5068n;
            this.f6771j = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(this.f6768g, this.f6769h, this.f6770i, this.f6771j, dVar);
            aVar.f6767f = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ca A[LOOP:0: B:19:0x00ca->B:37:?, LOOP_START, PHI: r6 r10
  0x00ca: PHI (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:16:0x00c5, B:37:?] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r10v8 kotlin.collections.IndexedValue) = (r10v7 kotlin.collections.IndexedValue), (r10v21 kotlin.collections.IndexedValue) binds: [B:16:0x00c5, B:37:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0135 -> B:10:0x0137). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object[] objArr;
            byte b10;
            byte[] bArr;
            int i10;
            Ld.g gVar;
            Object obj2;
            Object[] objArr2;
            byte b11;
            IndexedValue indexedValue;
            Object e10 = AbstractC3868b.e();
            int i11 = this.f6766e;
            if (i11 == 0) {
                lc.p.b(obj);
                N n10 = (N) this.f6767f;
                int length = this.f6768g.length;
                if (length == 0) {
                    return Unit.f36324a;
                }
                objArr = new Object[length];
                AbstractC3574i.p(objArr, p.f6787b, 0, 0, 6, null);
                Ld.g b12 = Ld.j.b(length, null, null, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                b10 = 0;
                int i12 = 0;
                while (i12 < length) {
                    int i13 = i12;
                    AbstractC0891k.d(n10, null, null, new C0133a(this.f6768g, i13, atomicInteger, b12, null), 3, null);
                    i12 = i13 + 1;
                    atomicInteger = atomicInteger;
                }
                bArr = new byte[length];
                i10 = length;
                gVar = b12;
                b11 = (byte) (b10 + 1);
                this.f6767f = objArr;
                this.f6762a = gVar;
                this.f6763b = bArr;
                this.f6764c = i10;
                this.f6765d = b11;
                this.f6766e = 1;
                obj2 = gVar.k(this);
                if (obj2 == e10) {
                }
            } else if (i11 == 1) {
                ?? r22 = this.f6765d;
                i10 = this.f6764c;
                byte[] bArr2 = (byte[]) this.f6763b;
                Ld.g gVar2 = (Ld.g) this.f6762a;
                objArr2 = (Object[]) this.f6767f;
                lc.p.b(obj);
                obj2 = ((Ld.k) obj).k();
                b11 = r22;
                bArr = bArr2;
                gVar = gVar2;
                indexedValue = (IndexedValue) Ld.k.f(obj2);
                if (indexedValue != null) {
                }
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r23 = this.f6765d;
                i10 = this.f6764c;
                byte[] bArr3 = (byte[]) this.f6763b;
                Ld.g gVar3 = (Ld.g) this.f6762a;
                objArr2 = (Object[]) this.f6767f;
                lc.p.b(obj);
                b10 = r23;
                bArr = bArr3;
                gVar = gVar3;
                objArr = objArr2;
                b11 = (byte) (b10 + 1);
                this.f6767f = objArr;
                this.f6762a = gVar;
                this.f6763b = bArr;
                this.f6764c = i10;
                this.f6765d = b11;
                this.f6766e = 1;
                obj2 = gVar.k(this);
                if (obj2 == e10) {
                    return e10;
                }
                objArr2 = objArr;
                indexedValue = (IndexedValue) Ld.k.f(obj2);
                if (indexedValue != null) {
                    return Unit.f36324a;
                }
                do {
                    int c10 = indexedValue.c();
                    Object obj3 = objArr2[c10];
                    objArr2[c10] = indexedValue.d();
                    if (obj3 == p.f6787b) {
                        i10--;
                    }
                    if (bArr[c10] == b11) {
                        break;
                    }
                    bArr[c10] = b11;
                    indexedValue = (IndexedValue) Ld.k.f(gVar.e());
                } while (indexedValue != null);
                if (i10 == 0) {
                    Object[] objArr3 = (Object[]) this.f6769h.invoke();
                    if (objArr3 == null) {
                        InterfaceC5068n interfaceC5068n = this.f6770i;
                        Md.f fVar = this.f6771j;
                        this.f6767f = objArr2;
                        this.f6762a = gVar;
                        this.f6763b = bArr;
                        this.f6764c = i10;
                        this.f6765d = b11;
                        this.f6766e = 2;
                        if (interfaceC5068n.n(fVar, objArr2, this) == e10) {
                            return e10;
                        }
                    } else {
                        AbstractC3574i.k(objArr2, objArr3, 0, 0, 0, 14, null);
                        InterfaceC5068n interfaceC5068n2 = this.f6770i;
                        Md.f fVar2 = this.f6771j;
                        this.f6767f = objArr2;
                        this.f6762a = gVar;
                        this.f6763b = bArr;
                        this.f6764c = i10;
                        this.f6765d = b11;
                        this.f6766e = 3;
                        if (interfaceC5068n2.n(fVar2, objArr3, this) == e10) {
                            return e10;
                        }
                    }
                }
                b10 = b11;
                objArr = objArr2;
                b11 = (byte) (b10 + 1);
                this.f6767f = objArr;
                this.f6762a = gVar;
                this.f6763b = bArr;
                this.f6764c = i10;
                this.f6765d = b11;
                this.f6766e = 1;
                obj2 = gVar.k(this);
                if (obj2 == e10) {
                }
            }
        }
    }

    public static final Object a(Md.f fVar, Md.e[] eVarArr, Function0 function0, InterfaceC5068n interfaceC5068n, kotlin.coroutines.d dVar) {
        Object a10 = l.a(new a(eVarArr, function0, interfaceC5068n, fVar, null), dVar);
        return a10 == AbstractC3868b.e() ? a10 : Unit.f36324a;
    }
}
