package a1;

import androidx.lifecycle.S;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1339d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1339d f12541a = new C1339d();

    private C1339d() {
    }

    public final S a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Object newInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (S) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
        }
    }
}
