package I8;

import java.util.Iterator;
import java.util.Set;
import o8.C3766c;
import o8.InterfaceC3767d;
import o8.q;

/* loaded from: classes2.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f4358a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4359b;

    c(Set set, d dVar) {
        this.f4358a = e(set);
        this.f4359b = dVar;
    }

    public static C3766c c() {
        return C3766c.c(i.class).b(q.m(f.class)).f(new o8.g() { // from class: I8.b
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                i d10;
                d10 = c.d(interfaceC3767d);
                return d10;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(InterfaceC3767d interfaceC3767d) {
        return new c(interfaceC3767d.e(f.class), d.a());
    }

    private static String e(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb2.append(fVar.b());
            sb2.append('/');
            sb2.append(fVar.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // I8.i
    public String a() {
        if (this.f4359b.b().isEmpty()) {
            return this.f4358a;
        }
        return this.f4358a + ' ' + e(this.f4359b.b());
    }
}
