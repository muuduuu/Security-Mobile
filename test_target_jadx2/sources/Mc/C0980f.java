package Mc;

import Kc.AbstractC0948u;
import Kc.InterfaceC0930b;
import Kc.InterfaceC0932d;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0940l;
import Kc.InterfaceC0941m;
import Kc.InterfaceC0943o;
import Kc.InterfaceC0952y;
import Kc.X;
import Kc.a0;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import yd.n0;

/* renamed from: Mc.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0980f extends p implements InterfaceC0932d {

    /* renamed from: E, reason: collision with root package name */
    protected final boolean f6249E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C0980f(InterfaceC0933e interfaceC0933e, InterfaceC0940l interfaceC0940l, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z10, InterfaceC0930b.a aVar, a0 a0Var) {
        super(interfaceC0933e, interfaceC0940l, gVar, id.h.f34202i, aVar, a0Var);
        if (interfaceC0933e == null) {
            D(0);
        }
        if (gVar == null) {
            D(1);
        }
        if (aVar == null) {
            D(2);
        }
        if (a0Var == null) {
            D(3);
        }
        this.f6249E = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void D(int i10) {
        String str;
        int i11;
        if (i10 != 21 && i10 != 27) {
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
            if (i10 != 21 && i10 != 27) {
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
                    case 5:
                    case 8:
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                        objArr[0] = "kind";
                        break;
                    case 3:
                    case 6:
                    case 9:
                    case 26:
                        objArr[0] = "source";
                        break;
                    case 4:
                    case 7:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                    case 13:
                        objArr[0] = "unsubstitutedValueParameters";
                        break;
                    case 11:
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        objArr[0] = "visibility";
                        break;
                    case 12:
                        objArr[0] = "typeParameterDescriptors";
                        break;
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    case 18:
                    case 19:
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    case 27:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                        break;
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                        objArr[0] = "overriddenDescriptors";
                        break;
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                        objArr[0] = "newOwner";
                        break;
                }
                if (i10 != 21) {
                    objArr[1] = "getOverriddenDescriptors";
                } else if (i10 != 27) {
                    switch (i10) {
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            objArr[1] = "calculateContextReceiverParameters";
                            break;
                        case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                            objArr[1] = "getContainingDeclaration";
                            break;
                        case 18:
                            objArr[1] = "getConstructedClass";
                            break;
                        case 19:
                            objArr[1] = "getOriginal";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                            break;
                    }
                } else {
                    objArr[1] = "copy";
                }
                switch (i10) {
                    case 4:
                    case 5:
                    case 6:
                        objArr[2] = "create";
                        break;
                    case 7:
                    case 8:
                    case 9:
                        objArr[2] = "createSynthesized";
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                    case 11:
                    case 12:
                    case 13:
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        objArr[2] = "initialize";
                        break;
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    case 18:
                    case 19:
                    case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    case 27:
                        break;
                    case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                        objArr[2] = "substitute";
                        break;
                    case HVError.FACE_DETECTION_ERROR /* 22 */:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    case HVError.LOW_STORAGE_ERROR /* 25 */:
                    case 26:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 21 && i10 != 27) {
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
            if (i10 != 21) {
            }
            switch (i10) {
            }
            String format2 = String.format(str, objArr2);
            if (i10 != 21) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 21) {
            switch (i10) {
            }
            Object[] objArr22 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 21) {
            }
            switch (i10) {
            }
            String format22 = String.format(str, objArr22);
            if (i10 != 21) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        Object[] objArr222 = new Object[i11];
        switch (i10) {
        }
        if (i10 != 21) {
        }
        switch (i10) {
        }
        String format222 = String.format(str, objArr222);
        if (i10 != 21) {
        }
        throw new IllegalStateException(format222);
    }

    private List t1() {
        InterfaceC0933e b10 = b();
        if (b10.P0().isEmpty()) {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                D(16);
            }
            return emptyList;
        }
        List P02 = b10.P0();
        if (P02 == null) {
            D(15);
        }
        return P02;
    }

    public static C0980f w1(InterfaceC0933e interfaceC0933e, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z10, a0 a0Var) {
        if (interfaceC0933e == null) {
            D(4);
        }
        if (gVar == null) {
            D(5);
        }
        if (a0Var == null) {
            D(6);
        }
        return new C0980f(interfaceC0933e, null, gVar, z10, InterfaceC0930b.a.DECLARATION, a0Var);
    }

    public C0980f A1(List list, AbstractC0948u abstractC0948u, List list2) {
        if (list == null) {
            D(10);
        }
        if (abstractC0948u == null) {
            D(11);
        }
        if (list2 == null) {
            D(12);
        }
        super.a1(null, u1(), t1(), list2, list, null, Kc.D.FINAL, abstractC0948u);
        return this;
    }

    @Override // Mc.p, Kc.InterfaceC0930b
    public void F0(Collection collection) {
        if (collection == null) {
            D(22);
        }
    }

    @Override // Kc.InterfaceC0940l
    public boolean H() {
        return this.f6249E;
    }

    @Override // Kc.InterfaceC0940l
    public InterfaceC0933e I() {
        InterfaceC0933e b10 = b();
        if (b10 == null) {
            D(18);
        }
        return b10;
    }

    @Override // Mc.p, Kc.InterfaceC0952y, Kc.InterfaceC0930b, Kc.InterfaceC0929a
    public Collection f() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            D(21);
        }
        return emptySet;
    }

    @Override // Mc.p, Kc.InterfaceC0941m
    public Object f0(InterfaceC0943o interfaceC0943o, Object obj) {
        return interfaceC0943o.m(this, obj);
    }

    public X u1() {
        InterfaceC0933e b10 = b();
        if (!b10.S()) {
            return null;
        }
        InterfaceC0941m b11 = b10.b();
        if (b11 instanceof InterfaceC0933e) {
            return ((InterfaceC0933e) b11).S0();
        }
        return null;
    }

    @Override // Kc.InterfaceC0930b
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public InterfaceC0932d o0(InterfaceC0941m interfaceC0941m, Kc.D d10, AbstractC0948u abstractC0948u, InterfaceC0930b.a aVar, boolean z10) {
        InterfaceC0932d interfaceC0932d = (InterfaceC0932d) super.T0(interfaceC0941m, d10, abstractC0948u, aVar, z10);
        if (interfaceC0932d == null) {
            D(27);
        }
        return interfaceC0932d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mc.p
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C0980f U0(InterfaceC0941m interfaceC0941m, InterfaceC0952y interfaceC0952y, InterfaceC0930b.a aVar, id.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, a0 a0Var) {
        if (interfaceC0941m == null) {
            D(23);
        }
        if (aVar == null) {
            D(24);
        }
        if (gVar == null) {
            D(25);
        }
        if (a0Var == null) {
            D(26);
        }
        InterfaceC0930b.a aVar2 = InterfaceC0930b.a.DECLARATION;
        if (aVar == aVar2 || aVar == InterfaceC0930b.a.SYNTHESIZED) {
            return new C0980f((InterfaceC0933e) interfaceC0941m, this, gVar, this.f6249E, aVar2, a0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC0941m + "\nkind: " + aVar);
    }

    @Override // Mc.AbstractC0985k, Kc.InterfaceC0941m
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public InterfaceC0933e b() {
        InterfaceC0933e interfaceC0933e = (InterfaceC0933e) super.b();
        if (interfaceC0933e == null) {
            D(17);
        }
        return interfaceC0933e;
    }

    public C0980f z1(List list, AbstractC0948u abstractC0948u) {
        if (list == null) {
            D(13);
        }
        if (abstractC0948u == null) {
            D(14);
        }
        A1(list, abstractC0948u, b().B());
        return this;
    }

    @Override // Mc.p, Kc.InterfaceC0952y, Kc.c0
    public InterfaceC0932d c(n0 n0Var) {
        if (n0Var == null) {
            D(20);
        }
        return (InterfaceC0932d) super.c(n0Var);
    }

    @Override // Mc.p, Mc.AbstractC0985k, Mc.AbstractC0984j, Kc.InterfaceC0941m
    public InterfaceC0932d a() {
        InterfaceC0932d interfaceC0932d = (InterfaceC0932d) super.a();
        if (interfaceC0932d == null) {
            D(19);
        }
        return interfaceC0932d;
    }
}
