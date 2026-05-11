package yd;

import Kc.InterfaceC0933e;
import Kc.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: yd.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5209k extends AbstractC5200b implements e0 {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0933e f45542d;

    /* renamed from: e, reason: collision with root package name */
    private final List f45543e;

    /* renamed from: f, reason: collision with root package name */
    private final Collection f45544f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5209k(InterfaceC0933e interfaceC0933e, List list, Collection collection, xd.n nVar) {
        super(nVar);
        if (interfaceC0933e == null) {
            u(0);
        }
        if (list == null) {
            u(1);
        }
        if (collection == null) {
            u(2);
        }
        if (nVar == null) {
            u(3);
        }
        this.f45542d = interfaceC0933e;
        this.f45543e = Collections.unmodifiableList(new ArrayList(list));
        this.f45544f = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void u(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // yd.e0
    public List c() {
        List list = this.f45543e;
        if (list == null) {
            u(4);
        }
        return list;
    }

    @Override // yd.e0
    public boolean e() {
        return true;
    }

    @Override // yd.AbstractC5204f
    protected Collection l() {
        Collection collection = this.f45544f;
        if (collection == null) {
            u(6);
        }
        return collection;
    }

    @Override // yd.AbstractC5204f
    protected Kc.d0 p() {
        d0.a aVar = d0.a.f5565a;
        if (aVar == null) {
            u(7);
        }
        return aVar;
    }

    public String toString() {
        return kd.f.m(this.f45542d).b();
    }

    @Override // yd.AbstractC5210l, yd.e0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceC0933e d() {
        InterfaceC0933e interfaceC0933e = this.f45542d;
        if (interfaceC0933e == null) {
            u(5);
        }
        return interfaceC0933e;
    }
}
