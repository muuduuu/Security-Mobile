package s7;

import java.util.HashMap;
import java.util.Map;
import u8.InterfaceC4874b;

/* renamed from: s7.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4417n implements InterfaceC4874b {

    /* renamed from: d, reason: collision with root package name */
    private static final t8.d f41339d = new t8.d() { // from class: s7.m
        @Override // t8.d
        public final void a(Object obj, Object obj2) {
            int i10 = C4417n.f41340e;
            throw new t8.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f41340e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Map f41341a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f41342b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final t8.d f41343c = f41339d;

    @Override // u8.InterfaceC4874b
    public final /* bridge */ /* synthetic */ InterfaceC4874b a(Class cls, t8.d dVar) {
        this.f41341a.put(cls, dVar);
        this.f41342b.remove(cls);
        return this;
    }

    public final C4424o b() {
        return new C4424o(new HashMap(this.f41341a), new HashMap(this.f41342b), this.f41343c);
    }
}
