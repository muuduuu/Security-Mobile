package Z0;

import androidx.lifecycle.S;
import androidx.lifecycle.V;
import kotlin.jvm.internal.Intrinsics;
import vc.AbstractC5011a;

/* loaded from: classes.dex */
public abstract class e {
    public static final S a(V.c factory, kotlin.reflect.d modelClass, a extras) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            try {
                return factory.b(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return factory.a(AbstractC5011a.b(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return factory.c(AbstractC5011a.b(modelClass), extras);
        }
    }
}
