package xc;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import vc.C5012b;

/* renamed from: xc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5150c implements kotlin.reflect.c, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f44978g = a.f44985a;

    /* renamed from: a, reason: collision with root package name */
    private transient kotlin.reflect.c f44979a;

    /* renamed from: b, reason: collision with root package name */
    protected final Object f44980b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f44981c;

    /* renamed from: d, reason: collision with root package name */
    private final String f44982d;

    /* renamed from: e, reason: collision with root package name */
    private final String f44983e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f44984f;

    /* renamed from: xc.c$a */
    private static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private static final a f44985a = new a();

        private a() {
        }
    }

    public AbstractC5150c() {
        this(f44978g);
    }

    protected abstract kotlin.reflect.c C();

    public Object D() {
        return this.f44980b;
    }

    public kotlin.reflect.f E() {
        Class cls = this.f44981c;
        if (cls == null) {
            return null;
        }
        return this.f44984f ? C5142C.c(cls) : C5142C.b(cls);
    }

    protected kotlin.reflect.c F() {
        kotlin.reflect.c u10 = u();
        if (u10 != this) {
            return u10;
        }
        throw new C5012b();
    }

    public String G() {
        return this.f44983e;
    }

    @Override // kotlin.reflect.c
    public List c() {
        return F().c();
    }

    @Override // kotlin.reflect.c
    public kotlin.reflect.o g() {
        return F().g();
    }

    @Override // kotlin.reflect.c
    public String getName() {
        return this.f44982d;
    }

    @Override // kotlin.reflect.b
    public List i() {
        return F().i();
    }

    public kotlin.reflect.c u() {
        kotlin.reflect.c cVar = this.f44979a;
        if (cVar != null) {
            return cVar;
        }
        kotlin.reflect.c C10 = C();
        this.f44979a = C10;
        return C10;
    }

    @Override // kotlin.reflect.c
    public Object v(Map map) {
        return F().v(map);
    }

    protected AbstractC5150c(Object obj) {
        this(obj, null, null, null, false);
    }

    protected AbstractC5150c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f44980b = obj;
        this.f44981c = cls;
        this.f44982d = str;
        this.f44983e = str2;
        this.f44984f = z10;
    }
}
