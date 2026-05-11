package t7;

import java.util.HashMap;
import java.util.Map;
import u8.InterfaceC4874b;

/* loaded from: classes2.dex */
public final class B0 implements InterfaceC4874b {

    /* renamed from: d, reason: collision with root package name */
    private static final t8.d f42417d = new t8.d() { // from class: t7.A0
        @Override // t8.d
        public final void a(Object obj, Object obj2) {
            int i10 = B0.f42418e;
            String valueOf = String.valueOf(obj.getClass().getCanonicalName());
            throw new t8.b(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f42418e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Map f42419a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f42420b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final t8.d f42421c = f42417d;

    @Override // u8.InterfaceC4874b
    public final /* bridge */ /* synthetic */ InterfaceC4874b a(Class cls, t8.d dVar) {
        this.f42419a.put(cls, dVar);
        this.f42420b.remove(cls);
        return this;
    }

    public final C0 b() {
        return new C0(new HashMap(this.f42419a), new HashMap(this.f42420b), this.f42421c);
    }
}
