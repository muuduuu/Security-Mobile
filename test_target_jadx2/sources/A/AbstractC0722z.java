package A;

import androidx.camera.core.impl.U;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: A.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0722z {

    /* renamed from: A.z$a */
    static final class a implements androidx.camera.core.impl.S {

        /* renamed from: a, reason: collision with root package name */
        final List f288a;

        a(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f288a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // androidx.camera.core.impl.S
        public List a() {
            return this.f288a;
        }
    }

    static androidx.camera.core.impl.S a(androidx.camera.core.impl.U... uArr) {
        return new a(Arrays.asList(uArr));
    }

    public static androidx.camera.core.impl.S b() {
        return a(new U.a());
    }
}
