package I8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f4360b;

    /* renamed from: a, reason: collision with root package name */
    private final Set f4361a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f4360b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f4360b;
                    if (dVar == null) {
                        dVar = new d();
                        f4360b = dVar;
                    }
                } finally {
                }
            }
        }
        return dVar;
    }

    Set b() {
        Set unmodifiableSet;
        synchronized (this.f4361a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f4361a);
        }
        return unmodifiableSet;
    }
}
