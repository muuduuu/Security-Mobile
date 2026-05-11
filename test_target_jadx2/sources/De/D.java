package De;

import java.lang.annotation.Annotation;

/* loaded from: classes3.dex */
final class D implements C {

    /* renamed from: a, reason: collision with root package name */
    private static final C f1619a = new D();

    D() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (E.l(annotationArr, C.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f1619a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return C.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof C;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + C.class.getName() + "()";
    }
}
