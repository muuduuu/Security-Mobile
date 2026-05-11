package Mc;

import Kc.AbstractC0947t;
import Kc.AbstractC0948u;
import Kc.EnumC0934f;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.a0;
import Kc.h0;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import rd.h;
import yd.AbstractC5197E;
import yd.C5209k;
import yd.e0;

/* renamed from: Mc.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0988n extends AbstractC0981g {

    /* renamed from: i, reason: collision with root package name */
    private final e0 f6264i;

    /* renamed from: j, reason: collision with root package name */
    private final rd.h f6265j;

    /* renamed from: k, reason: collision with root package name */
    private final xd.i f6266k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f6267l;

    /* renamed from: Mc.n$a */
    private class a extends rd.i {

        /* renamed from: b, reason: collision with root package name */
        private final xd.g f6268b;

        /* renamed from: c, reason: collision with root package name */
        private final xd.g f6269c;

        /* renamed from: d, reason: collision with root package name */
        private final xd.i f6270d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C0988n f6271e;

        /* renamed from: Mc.n$a$a, reason: collision with other inner class name */
        class C0127a implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0988n f6272a;

            C0127a(C0988n c0988n) {
                this.f6272a = c0988n;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection invoke(id.f fVar) {
                return a.this.m(fVar);
            }
        }

        /* renamed from: Mc.n$a$b */
        class b implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0988n f6274a;

            b(C0988n c0988n) {
                this.f6274a = c0988n;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection invoke(id.f fVar) {
                return a.this.n(fVar);
            }
        }

        /* renamed from: Mc.n$a$c */
        class c implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0988n f6276a;

            c(C0988n c0988n) {
                this.f6276a = c0988n;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection invoke() {
                return a.this.l();
            }
        }

        /* renamed from: Mc.n$a$d */
        class d extends kd.j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f6278a;

            d(Set set) {
                this.f6278a = set;
            }

            private static /* synthetic */ void f(int i10) {
                Object[] objArr = new Object[3];
                if (i10 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i10 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i10 == 1 || i10 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kd.k
            public void a(InterfaceC0930b interfaceC0930b) {
                if (interfaceC0930b == null) {
                    f(0);
                }
                kd.l.K(interfaceC0930b, null);
                this.f6278a.add(interfaceC0930b);
            }

            @Override // kd.j
            protected void e(InterfaceC0930b interfaceC0930b, InterfaceC0930b interfaceC0930b2) {
                if (interfaceC0930b == null) {
                    f(1);
                }
                if (interfaceC0930b2 == null) {
                    f(2);
                }
            }
        }

        public a(C0988n c0988n, xd.n nVar) {
            if (nVar == null) {
                h(0);
            }
            this.f6271e = c0988n;
            this.f6268b = nVar.h(new C0127a(c0988n));
            this.f6269c = nVar.h(new b(c0988n));
            this.f6270d = nVar.d(new c(c0988n));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ void h(int i10) {
            String str;
            int i11;
            if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
                switch (i10) {
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    case 18:
                    case 19:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
                if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
                    switch (i10) {
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                        case 18:
                        case 19:
                            break;
                        default:
                            i11 = 3;
                            break;
                    }
                    Object[] objArr = new Object[i11];
                    switch (i10) {
                        case 1:
                        case 4:
                        case 5:
                        case 8:
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                            objArr[0] = "name";
                            break;
                        case 2:
                        case 6:
                            objArr[0] = "location";
                            break;
                        case 3:
                        case 7:
                        case 9:
                        case 12:
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                        case 18:
                        case 19:
                            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                            break;
                        case 11:
                            objArr[0] = "fromSupertypes";
                            break;
                        case 13:
                            objArr[0] = "kindFilter";
                            break;
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            objArr[0] = "nameFilter";
                            break;
                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                            objArr[0] = "p";
                            break;
                        default:
                            objArr[0] = "storageManager";
                            break;
                    }
                    if (i10 != 3) {
                        objArr[1] = "getContributedVariables";
                    } else if (i10 == 7) {
                        objArr[1] = "getContributedFunctions";
                    } else if (i10 == 9) {
                        objArr[1] = "getSupertypeScope";
                    } else if (i10 != 12) {
                        switch (i10) {
                            case HVError.SSL_CONNECT_ERROR /* 15 */:
                                objArr[1] = "getContributedDescriptors";
                                break;
                            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                                objArr[1] = "computeAllDeclarations";
                                break;
                            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                                objArr[1] = "getFunctionNames";
                                break;
                            case 18:
                                objArr[1] = "getClassifierNames";
                                break;
                            case 19:
                                objArr[1] = "getVariableNames";
                                break;
                            default:
                                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                                break;
                        }
                    } else {
                        objArr[1] = "resolveFakeOverrides";
                    }
                    switch (i10) {
                        case 1:
                        case 2:
                            objArr[2] = "getContributedVariables";
                            break;
                        case 3:
                        case 7:
                        case 9:
                        case 12:
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                        case 18:
                        case 19:
                            break;
                        case 4:
                            objArr[2] = "computeProperties";
                            break;
                        case 5:
                        case 6:
                            objArr[2] = "getContributedFunctions";
                            break;
                        case 8:
                            objArr[2] = "computeFunctions";
                            break;
                        case RequestError.EVENT_TIMEOUT /* 10 */:
                        case 11:
                            objArr[2] = "resolveFakeOverrides";
                            break;
                        case 13:
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            objArr[2] = "getContributedDescriptors";
                            break;
                        case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                            objArr[2] = "printScopeStructure";
                            break;
                        default:
                            objArr[2] = "<init>";
                            break;
                    }
                    String format = String.format(str, objArr);
                    if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
                        switch (i10) {
                            case HVError.SSL_CONNECT_ERROR /* 15 */:
                            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                            case 18:
                            case 19:
                                break;
                            default:
                                throw new IllegalArgumentException(format);
                        }
                    }
                    throw new IllegalStateException(format);
                }
                i11 = 2;
                Object[] objArr2 = new Object[i11];
                switch (i10) {
                }
                if (i10 != 3) {
                }
                switch (i10) {
                }
                String format2 = String.format(str, objArr2);
                if (i10 != 3) {
                    switch (i10) {
                    }
                }
                throw new IllegalStateException(format2);
            }
            str = "@NotNull method %s.%s must not return null";
            if (i10 != 3) {
                switch (i10) {
                }
                Object[] objArr22 = new Object[i11];
                switch (i10) {
                }
                if (i10 != 3) {
                }
                switch (i10) {
                }
                String format22 = String.format(str, objArr22);
                if (i10 != 3) {
                }
                throw new IllegalStateException(format22);
            }
            i11 = 2;
            Object[] objArr222 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 3) {
            }
            switch (i10) {
            }
            String format222 = String.format(str, objArr222);
            if (i10 != 3) {
            }
            throw new IllegalStateException(format222);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection l() {
            HashSet hashSet = new HashSet();
            for (id.f fVar : (Set) this.f6271e.f6266k.invoke()) {
                Rc.d dVar = Rc.d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(a(fVar, dVar));
                hashSet.addAll(c(fVar, dVar));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection m(id.f fVar) {
            if (fVar == null) {
                h(8);
            }
            return p(fVar, o().a(fVar, Rc.d.FOR_NON_TRACKED_SCOPE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection n(id.f fVar) {
            if (fVar == null) {
                h(4);
            }
            return p(fVar, o().c(fVar, Rc.d.FOR_NON_TRACKED_SCOPE));
        }

        private rd.h o() {
            rd.h w10 = ((AbstractC5197E) this.f6271e.r().a().iterator().next()).w();
            if (w10 == null) {
                h(9);
            }
            return w10;
        }

        private Collection p(id.f fVar, Collection collection) {
            if (fVar == null) {
                h(10);
            }
            if (collection == null) {
                h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            kd.l.f36296f.v(fVar, collection, Collections.emptySet(), this.f6271e, new d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // rd.i, rd.h
        public Collection a(id.f fVar, Rc.b bVar) {
            if (fVar == null) {
                h(5);
            }
            if (bVar == null) {
                h(6);
            }
            Collection collection = (Collection) this.f6268b.invoke(fVar);
            if (collection == null) {
                h(7);
            }
            return collection;
        }

        @Override // rd.i, rd.h
        public Set b() {
            Set set = (Set) this.f6271e.f6266k.invoke();
            if (set == null) {
                h(17);
            }
            return set;
        }

        @Override // rd.i, rd.h
        public Collection c(id.f fVar, Rc.b bVar) {
            if (fVar == null) {
                h(1);
            }
            if (bVar == null) {
                h(2);
            }
            Collection collection = (Collection) this.f6269c.invoke(fVar);
            if (collection == null) {
                h(3);
            }
            return collection;
        }

        @Override // rd.i, rd.h
        public Set d() {
            Set set = (Set) this.f6271e.f6266k.invoke();
            if (set == null) {
                h(19);
            }
            return set;
        }

        @Override // rd.i, rd.h
        public Set e() {
            Set emptySet = Collections.emptySet();
            if (emptySet == null) {
                h(18);
            }
            return emptySet;
        }

        @Override // rd.i, rd.k
        public Collection g(rd.d dVar, Function1 function1) {
            if (dVar == null) {
                h(13);
            }
            if (function1 == null) {
                h(14);
            }
            Collection collection = (Collection) this.f6270d.invoke();
            if (collection == null) {
                h(15);
            }
            return collection;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C0988n(xd.n nVar, InterfaceC0933e interfaceC0933e, AbstractC5197E abstractC5197E, id.f fVar, xd.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, a0 a0Var) {
        super(nVar, interfaceC0933e, fVar, a0Var, false);
        if (nVar == null) {
            I0(6);
        }
        if (interfaceC0933e == null) {
            I0(7);
        }
        if (abstractC5197E == null) {
            I0(8);
        }
        if (fVar == null) {
            I0(9);
        }
        if (iVar == null) {
            I0(10);
        }
        if (gVar == null) {
            I0(11);
        }
        if (a0Var == null) {
            I0(12);
        }
        this.f6267l = gVar;
        this.f6264i = new C5209k(this, Collections.emptyList(), Collections.singleton(abstractC5197E), nVar);
        this.f6265j = new a(this, nVar);
        this.f6266k = iVar;
    }

    private static /* synthetic */ void I0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
                objArr[1] = "getStaticScope";
                break;
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[1] = "getConstructors";
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                objArr[1] = "getVisibility";
                break;
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                objArr[1] = "getAnnotations";
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static C0988n U0(xd.n nVar, InterfaceC0933e interfaceC0933e, id.f fVar, xd.i iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, a0 a0Var) {
        if (nVar == null) {
            I0(0);
        }
        if (interfaceC0933e == null) {
            I0(1);
        }
        if (fVar == null) {
            I0(2);
        }
        if (iVar == null) {
            I0(3);
        }
        if (gVar == null) {
            I0(4);
        }
        if (a0Var == null) {
            I0(5);
        }
        return new C0988n(nVar, interfaceC0933e, interfaceC0933e.y(), fVar, iVar, gVar, a0Var);
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0937i
    public List B() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            I0(22);
        }
        return emptyList;
    }

    @Override // Kc.InterfaceC0933e
    public boolean F() {
        return false;
    }

    @Override // Kc.InterfaceC0933e
    public h0 H0() {
        return null;
    }

    @Override // Kc.InterfaceC0933e
    public boolean J() {
        return false;
    }

    @Override // Kc.C
    public boolean M0() {
        return false;
    }

    @Override // Mc.t
    public rd.h N(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            I0(13);
        }
        rd.h hVar = this.f6265j;
        if (hVar == null) {
            I0(14);
        }
        return hVar;
    }

    @Override // Kc.InterfaceC0933e
    public Collection P() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            I0(23);
        }
        return emptyList;
    }

    @Override // Kc.InterfaceC0933e
    public boolean Q() {
        return false;
    }

    @Override // Kc.C
    public boolean R() {
        return false;
    }

    @Override // Kc.InterfaceC0933e
    public boolean R0() {
        return false;
    }

    @Override // Kc.InterfaceC0937i
    public boolean S() {
        return false;
    }

    @Override // Kc.InterfaceC0933e
    public InterfaceC0932d W() {
        return null;
    }

    @Override // Kc.InterfaceC0933e
    public rd.h X() {
        h.b bVar = h.b.f40647b;
        if (bVar == null) {
            I0(15);
        }
        return bVar;
    }

    @Override // Kc.InterfaceC0933e
    public InterfaceC0933e Z() {
        return null;
    }

    @Override // Kc.InterfaceC0933e, Kc.InterfaceC0945q, Kc.C
    public AbstractC0948u h() {
        AbstractC0948u abstractC0948u = AbstractC0947t.f5589e;
        if (abstractC0948u == null) {
            I0(20);
        }
        return abstractC0948u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g i() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar = this.f6267l;
        if (gVar == null) {
            I0(21);
        }
        return gVar;
    }

    @Override // Kc.InterfaceC0933e
    public Collection k() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            I0(16);
        }
        return emptyList;
    }

    @Override // Kc.InterfaceC0933e
    public EnumC0934f o() {
        EnumC0934f enumC0934f = EnumC0934f.ENUM_ENTRY;
        if (enumC0934f == null) {
            I0(18);
        }
        return enumC0934f;
    }

    @Override // Kc.InterfaceC0933e
    public boolean p() {
        return false;
    }

    @Override // Kc.InterfaceC0936h
    public e0 r() {
        e0 e0Var = this.f6264i;
        if (e0Var == null) {
            I0(17);
        }
        return e0Var;
    }

    @Override // Kc.InterfaceC0933e, Kc.C
    public Kc.D s() {
        Kc.D d10 = Kc.D.FINAL;
        if (d10 == null) {
            I0(19);
        }
        return d10;
    }

    public String toString() {
        return "enum entry " + getName();
    }
}
