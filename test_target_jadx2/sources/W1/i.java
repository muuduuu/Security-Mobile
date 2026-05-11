package W1;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final a f11199a;

    /* renamed from: b, reason: collision with root package name */
    private final V1.h f11200b;

    /* renamed from: c, reason: collision with root package name */
    private final V1.d f11201c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f11202d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, V1.h hVar, V1.d dVar, boolean z10) {
        this.f11199a = aVar;
        this.f11200b = hVar;
        this.f11201c = dVar;
        this.f11202d = z10;
    }

    public a a() {
        return this.f11199a;
    }

    public V1.h b() {
        return this.f11200b;
    }

    public V1.d c() {
        return this.f11201c;
    }

    public boolean d() {
        return this.f11202d;
    }
}
