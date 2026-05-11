package De;

import java.util.Objects;

/* loaded from: classes3.dex */
public class j extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final int f1656a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1657b;

    /* renamed from: c, reason: collision with root package name */
    private final transient z f1658c;

    public j(z zVar) {
        super(a(zVar));
        this.f1656a = zVar.b();
        this.f1657b = zVar.g();
        this.f1658c = zVar;
    }

    private static String a(z zVar) {
        Objects.requireNonNull(zVar, "response == null");
        return "HTTP " + zVar.b() + " " + zVar.g();
    }
}
