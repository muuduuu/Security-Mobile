package T3;

import f3.AbstractC3142a;
import java.util.List;
import p4.InterfaceC3793a;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final c f9254a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC3142a f9255b;

    /* renamed from: c, reason: collision with root package name */
    private List f9256c;

    /* renamed from: d, reason: collision with root package name */
    private int f9257d;

    /* renamed from: e, reason: collision with root package name */
    private String f9258e;

    f(c cVar) {
        this.f9254a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e a() {
        try {
            return new e(this);
        } finally {
            AbstractC3142a.n(this.f9255b);
            this.f9255b = null;
            AbstractC3142a.o(this.f9256c);
            this.f9256c = null;
        }
    }

    public InterfaceC3793a b() {
        return null;
    }

    public List c() {
        return AbstractC3142a.l(this.f9256c);
    }

    public int d() {
        return this.f9257d;
    }

    public c e() {
        return this.f9254a;
    }

    public AbstractC3142a f() {
        return AbstractC3142a.i(this.f9255b);
    }

    public String g() {
        return this.f9258e;
    }

    public f i(List list) {
        this.f9256c = AbstractC3142a.l(list);
        return this;
    }

    public f j(int i10) {
        this.f9257d = i10;
        return this;
    }

    public f k(AbstractC3142a abstractC3142a) {
        this.f9255b = AbstractC3142a.i(abstractC3142a);
        return this;
    }

    public f l(String str) {
        this.f9258e = str;
        return this;
    }

    public f h(InterfaceC3793a interfaceC3793a) {
        return this;
    }
}
