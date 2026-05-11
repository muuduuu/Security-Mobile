package V;

import A.I0;
import androidx.camera.core.impl.E0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: V.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1237a0 {

    /* renamed from: a, reason: collision with root package name */
    static final AbstractC1237a0 f10593a = d(0, a.INACTIVE);

    /* renamed from: b, reason: collision with root package name */
    static final Set f10594b = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* renamed from: c, reason: collision with root package name */
    static final E0 f10595c = androidx.camera.core.impl.X.g(d(0, a.ACTIVE));

    /* renamed from: V.a0$a */
    enum a {
        ACTIVE,
        INACTIVE
    }

    AbstractC1237a0() {
    }

    static AbstractC1237a0 d(int i10, a aVar) {
        return new C1250m(i10, aVar, null);
    }

    static AbstractC1237a0 e(int i10, a aVar, I0.h hVar) {
        return new C1250m(i10, aVar, hVar);
    }

    public abstract int a();

    public abstract I0.h b();

    public abstract a c();
}
