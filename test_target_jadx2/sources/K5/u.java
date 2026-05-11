package K5;

import D5.AbstractC0776b;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* loaded from: classes2.dex */
abstract class u {

    /* renamed from: b, reason: collision with root package name */
    protected static final p[] f5440b = new p[0];

    /* renamed from: c, reason: collision with root package name */
    protected static final Annotation[] f5441c = new Annotation[0];

    /* renamed from: a, reason: collision with root package name */
    protected final AbstractC0776b f5442a;

    protected u(AbstractC0776b abstractC0776b) {
        this.f5442a = abstractC0776b;
    }

    static p a() {
        return new p();
    }

    static p[] b(int i10) {
        if (i10 == 0) {
            return f5440b;
        }
        p[] pVarArr = new p[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            pVarArr[i11] = a();
        }
        return pVarArr;
    }

    protected static final boolean c(Annotation annotation) {
        return (annotation instanceof Target) || (annotation instanceof Retention);
    }

    protected final o d(o oVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            oVar = oVar.a(annotation);
            if (this.f5442a.f0(annotation)) {
                oVar = h(oVar, annotation);
            }
        }
        return oVar;
    }

    protected final o e(Annotation[] annotationArr) {
        o e10 = o.e();
        for (Annotation annotation : annotationArr) {
            e10 = e10.a(annotation);
            if (this.f5442a.f0(annotation)) {
                e10 = h(e10, annotation);
            }
        }
        return e10;
    }

    protected final o f(o oVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!oVar.f(annotation)) {
                oVar = oVar.a(annotation);
                if (this.f5442a.f0(annotation)) {
                    oVar = g(oVar, annotation);
                }
            }
        }
        return oVar;
    }

    protected final o g(o oVar, Annotation annotation) {
        for (Annotation annotation2 : T5.f.n(annotation.annotationType())) {
            if (!c(annotation2) && !oVar.f(annotation2)) {
                oVar = oVar.a(annotation2);
                if (this.f5442a.f0(annotation2)) {
                    oVar = h(oVar, annotation2);
                }
            }
        }
        return oVar;
    }

    protected final o h(o oVar, Annotation annotation) {
        for (Annotation annotation2 : T5.f.n(annotation.annotationType())) {
            if (!c(annotation2)) {
                if (!this.f5442a.f0(annotation2)) {
                    oVar = oVar.a(annotation2);
                } else if (!oVar.f(annotation2)) {
                    oVar = h(oVar.a(annotation2), annotation2);
                }
            }
        }
        return oVar;
    }
}
