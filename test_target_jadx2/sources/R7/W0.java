package r7;

import java.util.HashMap;
import java.util.Map;
import u8.InterfaceC4874b;

/* loaded from: classes2.dex */
public final class W0 implements InterfaceC4874b {

    /* renamed from: d, reason: collision with root package name */
    private static final t8.d f39782d = new t8.d() { // from class: r7.V0
        @Override // t8.d
        public final void a(Object obj, Object obj2) {
            int i10 = W0.f39783e;
            throw new t8.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f39783e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Map f39784a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f39785b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final t8.d f39786c = f39782d;

    @Override // u8.InterfaceC4874b
    public final /* bridge */ /* synthetic */ InterfaceC4874b a(Class cls, t8.d dVar) {
        this.f39784a.put(cls, dVar);
        this.f39785b.remove(cls);
        return this;
    }

    public final X0 b() {
        return new X0(new HashMap(this.f39784a), new HashMap(this.f39785b), this.f39786c);
    }
}
