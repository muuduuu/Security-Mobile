package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* loaded from: classes3.dex */
public abstract class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final g f36435a;

    public b(g gVar) {
        if (gVar == null) {
            D(0);
        }
        this.f36435a = gVar;
    }

    private static /* synthetic */ void D(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public g i() {
        g gVar = this.f36435a;
        if (gVar == null) {
            D(1);
        }
        return gVar;
    }
}
