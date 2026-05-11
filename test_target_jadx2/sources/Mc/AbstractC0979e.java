package Mc;

import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0943o;
import Kc.d0;
import Kc.f0;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kd.C3564d;
import kotlin.jvm.functions.Function0;
import od.AbstractC3778c;
import yd.AbstractC5197E;
import yd.AbstractC5204f;
import yd.C5198F;
import yd.a0;
import yd.e0;
import yd.u0;

/* renamed from: Mc.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0979e extends AbstractC0985k implements f0 {

    /* renamed from: e, reason: collision with root package name */
    private final u0 f6235e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6236f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6237g;

    /* renamed from: h, reason: collision with root package name */
    private final xd.i f6238h;

    /* renamed from: i, reason: collision with root package name */
    private final xd.i f6239i;

    /* renamed from: j, reason: collision with root package name */
    private final xd.n f6240j;

    /* renamed from: Mc.e$a */
    class a implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ xd.n f6241a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f6242b;

        a(xd.n nVar, d0 d0Var) {
            this.f6241a = nVar;
            this.f6242b = d0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e0 invoke() {
            return new c(AbstractC0979e.this, this.f6241a, this.f6242b);
        }
    }

    /* renamed from: Mc.e$b */
    class b implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ id.f f6244a;

        /* renamed from: Mc.e$b$a */
        class a implements Function0 {
            a() {
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public rd.h invoke() {
                return rd.n.j("Scope for type parameter " + b.this.f6244a.c(), AbstractC0979e.this.getUpperBounds());
            }
        }

        b(id.f fVar) {
            this.f6244a = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public yd.M invoke() {
            return C5198F.k(a0.f45478b.i(), AbstractC0979e.this.r(), Collections.emptyList(), false, new rd.g(new a()));
        }
    }

    /* renamed from: Mc.e$c */
    private class c extends AbstractC5204f {

        /* renamed from: d, reason: collision with root package name */
        private final d0 f6247d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC0979e f6248e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC0979e abstractC0979e, xd.n nVar, d0 d0Var) {
            super(nVar);
            if (nVar == null) {
                u(0);
            }
            this.f6248e = abstractC0979e;
            this.f6247d = d0Var;
        }

        private static /* synthetic */ void u(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // yd.e0
        public List c() {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                u(2);
            }
            return emptyList;
        }

        @Override // yd.AbstractC5210l, yd.e0
        public InterfaceC0936h d() {
            AbstractC0979e abstractC0979e = this.f6248e;
            if (abstractC0979e == null) {
                u(3);
            }
            return abstractC0979e;
        }

        @Override // yd.e0
        public boolean e() {
            return true;
        }

        @Override // yd.AbstractC5210l
        protected boolean i(InterfaceC0936h interfaceC0936h) {
            if (interfaceC0936h == null) {
                u(9);
            }
            return (interfaceC0936h instanceof f0) && C3564d.f36286a.h(this.f6248e, (f0) interfaceC0936h, true);
        }

        @Override // yd.AbstractC5204f
        protected Collection l() {
            List U02 = this.f6248e.U0();
            if (U02 == null) {
                u(1);
            }
            return U02;
        }

        @Override // yd.AbstractC5204f
        protected AbstractC5197E m() {
            return kotlin.reflect.jvm.internal.impl.types.error.k.d(kotlin.reflect.jvm.internal.impl.types.error.j.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // yd.AbstractC5204f
        protected d0 p() {
            d0 d0Var = this.f6247d;
            if (d0Var == null) {
                u(5);
            }
            return d0Var;
        }

        @Override // yd.AbstractC5204f
        protected List r(List list) {
            if (list == null) {
                u(7);
            }
            List N02 = this.f6248e.N0(list);
            if (N02 == null) {
                u(8);
            }
            return N02;
        }

        @Override // yd.AbstractC5204f
        protected void t(AbstractC5197E abstractC5197E) {
            if (abstractC5197E == null) {
                u(6);
            }
            this.f6248e.T0(abstractC5197E);
        }

        public String toString() {
            return this.f6248e.getName().toString();
        }

        @Override // yd.e0
        public Hc.g v() {
            Hc.g j10 = AbstractC3778c.j(this.f6248e);
            if (j10 == null) {
                u(4);
            }
            return j10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC0979e(xd.n nVar, InterfaceC0941m interfaceC0941m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, id.f fVar, u0 u0Var, boolean z10, int i10, Kc.a0 a0Var, d0 d0Var) {
        super(interfaceC0941m, gVar, fVar, a0Var);
        if (nVar == null) {
            D(0);
        }
        if (interfaceC0941m == null) {
            D(1);
        }
        if (gVar == null) {
            D(2);
        }
        if (fVar == null) {
            D(3);
        }
        if (u0Var == null) {
            D(4);
        }
        if (a0Var == null) {
            D(5);
        }
        if (d0Var == null) {
            D(6);
        }
        this.f6235e = u0Var;
        this.f6236f = z10;
        this.f6237g = i10;
        this.f6238h = nVar.d(new a(nVar, d0Var));
        this.f6239i = nVar.d(new b(fVar));
        this.f6240j = nVar;
    }

    private static /* synthetic */ void D(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // Kc.f0
    public boolean L() {
        return this.f6236f;
    }

    protected List N0(List list) {
        if (list == null) {
            D(12);
        }
        if (list == null) {
            D(13);
        }
        return list;
    }

    protected abstract void T0(AbstractC5197E abstractC5197E);

    protected abstract List U0();

    @Override // Kc.InterfaceC0941m
    public Object f0(InterfaceC0943o interfaceC0943o, Object obj) {
        return interfaceC0943o.b(this, obj);
    }

    @Override // Kc.f0
    public int getIndex() {
        return this.f6237g;
    }

    @Override // Kc.f0
    public List getUpperBounds() {
        List a10 = ((c) r()).a();
        if (a10 == null) {
            D(8);
        }
        return a10;
    }

    @Override // Kc.f0
    public xd.n n0() {
        xd.n nVar = this.f6240j;
        if (nVar == null) {
            D(14);
        }
        return nVar;
    }

    @Override // Kc.f0, Kc.InterfaceC0936h
    public final e0 r() {
        e0 e0Var = (e0) this.f6238h.invoke();
        if (e0Var == null) {
            D(9);
        }
        return e0Var;
    }

    @Override // Kc.f0
    public u0 u() {
        u0 u0Var = this.f6235e;
        if (u0Var == null) {
            D(7);
        }
        return u0Var;
    }

    @Override // Kc.f0
    public boolean u0() {
        return false;
    }

    @Override // Kc.InterfaceC0936h
    public yd.M y() {
        yd.M m10 = (yd.M) this.f6239i.invoke();
        if (m10 == null) {
            D(10);
        }
        return m10;
    }

    @Override // Mc.AbstractC0985k, Mc.AbstractC0984j, Kc.InterfaceC0941m
    public f0 a() {
        f0 f0Var = (f0) super.a();
        if (f0Var == null) {
            D(11);
        }
        return f0Var;
    }
}
