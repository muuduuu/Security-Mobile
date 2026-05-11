package z1;

import A1.h;
import C1.u;
import Md.g;
import Nd.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import pc.AbstractC3868b;
import wc.InterfaceC5068n;
import x1.n;
import xc.m;
import z1.AbstractC5238b;

/* renamed from: z1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5241e {

    /* renamed from: a, reason: collision with root package name */
    private final List f45664a;

    /* renamed from: z1.e$a */
    static final class a extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45665a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(A1.c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String simpleName = it.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "it.javaClass.simpleName");
            return simpleName;
        }
    }

    /* renamed from: z1.e$b */
    public static final class b implements Md.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Md.e[] f45666a;

        /* renamed from: z1.e$b$a */
        static final class a extends m implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Md.e[] f45667a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Md.e[] eVarArr) {
                super(0);
                this.f45667a = eVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new AbstractC5238b[this.f45667a.length];
            }
        }

        /* renamed from: z1.e$b$b, reason: collision with other inner class name */
        public static final class C0671b extends l implements InterfaceC5068n {

            /* renamed from: a, reason: collision with root package name */
            int f45668a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f45669b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f45670c;

            public C0671b(kotlin.coroutines.d dVar) {
                super(3, dVar);
            }

            @Override // wc.InterfaceC5068n
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object n(Md.f fVar, Object[] objArr, kotlin.coroutines.d dVar) {
                C0671b c0671b = new C0671b(dVar);
                c0671b.f45669b = fVar;
                c0671b.f45670c = objArr;
                return c0671b.invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5238b abstractC5238b;
                Object e10 = AbstractC3868b.e();
                int i10 = this.f45668a;
                if (i10 == 0) {
                    p.b(obj);
                    Md.f fVar = (Md.f) this.f45669b;
                    AbstractC5238b[] abstractC5238bArr = (AbstractC5238b[]) ((Object[]) this.f45670c);
                    int length = abstractC5238bArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            abstractC5238b = null;
                            break;
                        }
                        abstractC5238b = abstractC5238bArr[i11];
                        if (!Intrinsics.b(abstractC5238b, AbstractC5238b.a.f45658a)) {
                            break;
                        }
                        i11++;
                    }
                    if (abstractC5238b == null) {
                        abstractC5238b = AbstractC5238b.a.f45658a;
                    }
                    this.f45668a = 1;
                    if (fVar.f(abstractC5238b, this) == e10) {
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

        public b(Md.e[] eVarArr) {
            this.f45666a = eVarArr;
        }

        @Override // Md.e
        public Object b(Md.f fVar, kotlin.coroutines.d dVar) {
            Md.e[] eVarArr = this.f45666a;
            Object a10 = i.a(fVar, eVarArr, new a(eVarArr), new C0671b(null), dVar);
            return a10 == AbstractC3868b.e() ? a10 : Unit.f36324a;
        }
    }

    public C5241e(List controllers) {
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.f45664a = controllers;
    }

    public final boolean a(u workSpec) {
        String str;
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        List list = this.f45664a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((A1.c) obj).d(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            n e10 = n.e();
            str = AbstractC5242f.f45671a;
            e10.a(str, "Work " + workSpec.f790a + " constrained by " + CollectionsKt.l0(arrayList, null, null, null, 0, null, a.f45665a, 31, null));
        }
        return arrayList.isEmpty();
    }

    public final Md.e b(u spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        List list = this.f45664a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((A1.c) obj).c(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((A1.c) it.next()).f());
        }
        return g.e(new b((Md.e[]) CollectionsKt.O0(arrayList2).toArray(new Md.e[0])));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5241e(B1.n trackers) {
        this(CollectionsKt.m(new A1.a(trackers.a()), new A1.b(trackers.b()), new h(trackers.d()), new A1.d(trackers.c()), new A1.g(trackers.c()), new A1.f(trackers.c()), new A1.e(trackers.c())));
        Intrinsics.checkNotNullParameter(trackers, "trackers");
    }
}
