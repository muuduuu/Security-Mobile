package j0;

import k0.AbstractC3526a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f35709a = new Object();

    public static final Object c(j jVar, int i10) {
        Object obj;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        int a10 = AbstractC3526a.a(jVar.f35706b, jVar.f35708d, i10);
        if (a10 < 0 || (obj = jVar.f35707c[a10]) == f35709a) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(j jVar) {
        int i10 = jVar.f35708d;
        int[] iArr = jVar.f35706b;
        Object[] objArr = jVar.f35707c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f35709a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        jVar.f35705a = false;
        jVar.f35708d = i11;
    }
}
