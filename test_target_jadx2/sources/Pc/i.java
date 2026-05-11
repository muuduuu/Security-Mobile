package Pc;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vc.AbstractC5011a;

/* loaded from: classes3.dex */
public abstract class i {
    public static final e a(Annotation[] annotationArr, id.c fqName) {
        Annotation annotation;
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        int length = annotationArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i10];
            if (Intrinsics.b(d.a(AbstractC5011a.b(AbstractC5011a.a(annotation))).b(), fqName)) {
                break;
            }
            i10++;
        }
        if (annotation != null) {
            return new e(annotation);
        }
        return null;
    }

    public static final List b(Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new e(annotation));
        }
        return arrayList;
    }
}
