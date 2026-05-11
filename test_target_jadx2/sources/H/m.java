package H;

import androidx.camera.core.impl.Q0;
import androidx.camera.core.impl.V;

/* loaded from: classes.dex */
public interface m extends Q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final V.a f3078b = V.a.a("camerax.core.target.name", String.class);

    /* renamed from: c, reason: collision with root package name */
    public static final V.a f3079c = V.a.a("camerax.core.target.class", Class.class);

    default String C(String str) {
        return (String) f(f3078b, str);
    }

    default String J() {
        return (String) a(f3078b);
    }
}
