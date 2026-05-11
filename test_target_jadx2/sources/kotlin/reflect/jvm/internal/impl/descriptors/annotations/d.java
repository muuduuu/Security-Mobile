package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import Kc.a0;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5197E f36436a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f36437b;

    /* renamed from: c, reason: collision with root package name */
    private final a0 f36438c;

    public d(AbstractC5197E abstractC5197E, Map map, a0 a0Var) {
        if (abstractC5197E == null) {
            b(0);
        }
        if (map == null) {
            b(1);
        }
        if (a0Var == null) {
            b(2);
        }
        this.f36436a = abstractC5197E;
        this.f36437b = map;
        this.f36438c = a0Var;
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map a() {
        Map map = this.f36437b;
        if (map == null) {
            b(4);
        }
        return map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public id.c e() {
        return c.a.a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public AbstractC5197E getType() {
        AbstractC5197E abstractC5197E = this.f36436a;
        if (abstractC5197E == null) {
            b(3);
        }
        return abstractC5197E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public a0 j() {
        a0 a0Var = this.f36438c;
        if (a0Var == null) {
            b(5);
        }
        return a0Var;
    }

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.c.f36584g.r(this, null);
    }
}
