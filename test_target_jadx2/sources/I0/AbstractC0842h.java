package I0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.AbstractC3622a;
import pc.AbstractC3868b;
import xc.C5141B;

/* renamed from: I0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0842h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4031a = new a(null);

    /* renamed from: I0.h$a */
    public static final class a {

        /* renamed from: I0.h$a$a, reason: collision with other inner class name */
        static final class C0081a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            int f4032a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f4033b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f4034c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0081a(List list, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f4034c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                C0081a c0081a = new C0081a(this.f4034c, dVar);
                c0081a.f4033b = obj;
                return c0081a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(s sVar, kotlin.coroutines.d dVar) {
                return ((C0081a) create(sVar, dVar)).invokeSuspend(Unit.f36324a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = AbstractC3868b.e();
                int i10 = this.f4032a;
                if (i10 == 0) {
                    lc.p.b(obj);
                    s sVar = (s) this.f4033b;
                    a aVar = AbstractC0842h.f4031a;
                    List list = this.f4034c;
                    this.f4032a = 1;
                    if (aVar.c(list, sVar, this) == e10) {
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

        /* renamed from: I0.h$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f4035a;

            /* renamed from: b, reason: collision with root package name */
            Object f4036b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f4037c;

            /* renamed from: e, reason: collision with root package name */
            int f4039e;

            b(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f4037c = obj;
                this.f4039e |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        /* renamed from: I0.h$a$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: a, reason: collision with root package name */
            Object f4040a;

            /* renamed from: b, reason: collision with root package name */
            Object f4041b;

            /* renamed from: c, reason: collision with root package name */
            Object f4042c;

            /* renamed from: d, reason: collision with root package name */
            int f4043d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f4044e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f4045f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f4046g;

            /* renamed from: I0.h$a$c$a, reason: collision with other inner class name */
            static final class C0082a extends kotlin.coroutines.jvm.internal.l implements Function1 {

                /* renamed from: a, reason: collision with root package name */
                int f4047a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC0841g f4048b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0082a(InterfaceC0841g interfaceC0841g, kotlin.coroutines.d dVar) {
                    super(1, dVar);
                    this.f4048b = interfaceC0841g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
                    return new C0082a(this.f4048b, dVar);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(kotlin.coroutines.d dVar) {
                    return ((C0082a) create(dVar)).invokeSuspend(Unit.f36324a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e10 = AbstractC3868b.e();
                    int i10 = this.f4047a;
                    if (i10 == 0) {
                        lc.p.b(obj);
                        InterfaceC0841g interfaceC0841g = this.f4048b;
                        this.f4047a = 1;
                        if (interfaceC0841g.a(this) == e10) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, List list2, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f4045f = list;
                this.f4046g = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                c cVar = new c(this.f4045f, this.f4046g, dVar);
                cVar.f4044e = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, kotlin.coroutines.d dVar) {
                return ((c) create(obj, dVar)).invokeSuspend(Unit.f36324a);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                List list;
                Iterator it;
                InterfaceC0841g interfaceC0841g;
                Iterator it2;
                Object obj2;
                Object e10 = AbstractC3868b.e();
                int i10 = this.f4043d;
                if (i10 == 0) {
                    lc.p.b(obj);
                    obj = this.f4044e;
                    List list2 = this.f4045f;
                    list = this.f4046g;
                    it = list2.iterator();
                } else if (i10 == 1) {
                    obj2 = this.f4042c;
                    InterfaceC0841g interfaceC0841g2 = (InterfaceC0841g) this.f4041b;
                    it2 = (Iterator) this.f4040a;
                    List list3 = (List) this.f4044e;
                    lc.p.b(obj);
                    interfaceC0841g = interfaceC0841g2;
                    list = list3;
                    if (((Boolean) obj).booleanValue()) {
                        obj = obj2;
                        it = it2;
                    } else {
                        list.add(new C0082a(interfaceC0841g, null));
                        this.f4044e = list;
                        this.f4040a = it2;
                        this.f4041b = null;
                        this.f4042c = null;
                        this.f4043d = 2;
                        obj = interfaceC0841g.c(obj2, this);
                        if (obj == e10) {
                            return e10;
                        }
                        it = it2;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f4040a;
                    list = (List) this.f4044e;
                    lc.p.b(obj);
                }
                if (!it.hasNext()) {
                    InterfaceC0841g interfaceC0841g3 = (InterfaceC0841g) it.next();
                    this.f4044e = list;
                    this.f4040a = it;
                    this.f4041b = interfaceC0841g3;
                    this.f4042c = obj;
                    this.f4043d = 1;
                    Object b10 = interfaceC0841g3.b(obj, this);
                    if (b10 == e10) {
                        return e10;
                    }
                    Iterator it3 = it;
                    obj2 = obj;
                    obj = b10;
                    interfaceC0841g = interfaceC0841g3;
                    it2 = it3;
                    if (((Boolean) obj).booleanValue()) {
                    }
                    if (!it.hasNext()) {
                        return obj;
                    }
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:13:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008b -> B:13:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(List list, s sVar, kotlin.coroutines.d dVar) {
            b bVar;
            int i10;
            List list2;
            C5141B c5141b;
            Iterator it;
            Throwable th;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i11 = bVar.f4039e;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    bVar.f4039e = i11 - Integer.MIN_VALUE;
                    Object obj = bVar.f4037c;
                    Object e10 = AbstractC3868b.e();
                    i10 = bVar.f4039e;
                    if (i10 != 0) {
                        lc.p.b(obj);
                        ArrayList arrayList = new ArrayList();
                        Function2 cVar = new c(list, arrayList, null);
                        bVar.f4035a = arrayList;
                        bVar.f4039e = 1;
                        if (sVar.a(cVar, bVar) == e10) {
                            return e10;
                        }
                        list2 = arrayList;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            it = (Iterator) bVar.f4036b;
                            c5141b = (C5141B) bVar.f4035a;
                            try {
                                lc.p.b(obj);
                            } catch (Throwable th2) {
                                Object obj2 = c5141b.f44962a;
                                if (obj2 == null) {
                                    c5141b.f44962a = th2;
                                } else {
                                    Intrinsics.d(obj2);
                                    AbstractC3622a.a((Throwable) obj2, th2);
                                }
                            }
                            while (it.hasNext()) {
                                Function1 function1 = (Function1) it.next();
                                bVar.f4035a = c5141b;
                                bVar.f4036b = it;
                                bVar.f4039e = 2;
                                if (function1.invoke(bVar) == e10) {
                                    return e10;
                                }
                            }
                            th = (Throwable) c5141b.f44962a;
                            if (th == null) {
                                return Unit.f36324a;
                            }
                            throw th;
                        }
                        list2 = (List) bVar.f4035a;
                        lc.p.b(obj);
                    }
                    c5141b = new C5141B();
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    th = (Throwable) c5141b.f44962a;
                    if (th == null) {
                    }
                }
            }
            bVar = new b(dVar);
            Object obj3 = bVar.f4037c;
            Object e102 = AbstractC3868b.e();
            i10 = bVar.f4039e;
            if (i10 != 0) {
            }
            c5141b = new C5141B();
            it = list2.iterator();
            while (it.hasNext()) {
            }
            th = (Throwable) c5141b.f44962a;
            if (th == null) {
            }
        }

        public final Function2 b(List migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new C0081a(migrations, null);
        }

        private a() {
        }
    }
}
