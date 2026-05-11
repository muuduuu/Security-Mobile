package u6;

import java.util.Set;
import s6.C4317c;
import s6.InterfaceC4321g;
import s6.InterfaceC4322h;
import s6.InterfaceC4323i;

/* loaded from: classes2.dex */
final class p implements InterfaceC4323i {

    /* renamed from: a, reason: collision with root package name */
    private final Set f43566a;

    /* renamed from: b, reason: collision with root package name */
    private final o f43567b;

    /* renamed from: c, reason: collision with root package name */
    private final s f43568c;

    p(Set set, o oVar, s sVar) {
        this.f43566a = set;
        this.f43567b = oVar;
        this.f43568c = sVar;
    }

    @Override // s6.InterfaceC4323i
    public InterfaceC4322h a(String str, Class cls, C4317c c4317c, InterfaceC4321g interfaceC4321g) {
        if (this.f43566a.contains(c4317c)) {
            return new r(this.f43567b, str, c4317c, interfaceC4321g, this.f43568c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c4317c, this.f43566a));
    }
}
