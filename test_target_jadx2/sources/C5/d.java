package C5;

import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.n;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class d implements m, e, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final y5.h f899h = new y5.h(" ");

    /* renamed from: a, reason: collision with root package name */
    protected b f900a;

    /* renamed from: b, reason: collision with root package name */
    protected b f901b;

    /* renamed from: c, reason: collision with root package name */
    protected final n f902c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f903d;

    /* renamed from: e, reason: collision with root package name */
    protected transient int f904e;

    /* renamed from: f, reason: collision with root package name */
    protected i f905f;

    /* renamed from: g, reason: collision with root package name */
    protected String f906g;

    public static class a extends c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f907b = new a();

        @Override // C5.d.c, C5.d.b
        public boolean p() {
            return true;
        }

        @Override // C5.d.c, C5.d.b
        public void q(com.fasterxml.jackson.core.f fVar, int i10) {
            fVar.v1(' ');
        }
    }

    public interface b {
        boolean p();

        void q(com.fasterxml.jackson.core.f fVar, int i10);
    }

    public d() {
        this(f899h);
    }

    @Override // com.fasterxml.jackson.core.m
    public void a(com.fasterxml.jackson.core.f fVar) {
        fVar.v1('{');
        if (this.f901b.p()) {
            return;
        }
        this.f904e++;
    }

    @Override // com.fasterxml.jackson.core.m
    public void b(com.fasterxml.jackson.core.f fVar) {
        n nVar = this.f902c;
        if (nVar != null) {
            fVar.x1(nVar);
        }
    }

    @Override // com.fasterxml.jackson.core.m
    public void c(com.fasterxml.jackson.core.f fVar) {
        fVar.v1(this.f905f.b());
        this.f900a.q(fVar, this.f904e);
    }

    @Override // com.fasterxml.jackson.core.m
    public void d(com.fasterxml.jackson.core.f fVar) {
        this.f901b.q(fVar, this.f904e);
    }

    @Override // com.fasterxml.jackson.core.m
    public void f(com.fasterxml.jackson.core.f fVar, int i10) {
        if (!this.f901b.p()) {
            this.f904e--;
        }
        if (i10 > 0) {
            this.f901b.q(fVar, this.f904e);
        } else {
            fVar.v1(' ');
        }
        fVar.v1('}');
    }

    @Override // com.fasterxml.jackson.core.m
    public void g(com.fasterxml.jackson.core.f fVar) {
        if (!this.f900a.p()) {
            this.f904e++;
        }
        fVar.v1('[');
    }

    @Override // com.fasterxml.jackson.core.m
    public void h(com.fasterxml.jackson.core.f fVar) {
        this.f900a.q(fVar, this.f904e);
    }

    @Override // com.fasterxml.jackson.core.m
    public void i(com.fasterxml.jackson.core.f fVar) {
        fVar.v1(this.f905f.c());
        this.f901b.q(fVar, this.f904e);
    }

    @Override // com.fasterxml.jackson.core.m
    public void j(com.fasterxml.jackson.core.f fVar, int i10) {
        if (!this.f900a.p()) {
            this.f904e--;
        }
        if (i10 > 0) {
            this.f900a.q(fVar, this.f904e);
        } else {
            fVar.v1(' ');
        }
        fVar.v1(']');
    }

    @Override // com.fasterxml.jackson.core.m
    public void k(com.fasterxml.jackson.core.f fVar) {
        if (this.f903d) {
            fVar.y1(this.f906g);
        } else {
            fVar.v1(this.f905f.d());
        }
    }

    @Override // C5.e
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public d e() {
        if (getClass() == d.class) {
            return new d(this);
        }
        throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
    }

    public d m(i iVar) {
        this.f905f = iVar;
        this.f906g = " " + iVar.d() + " ";
        return this;
    }

    public d(n nVar) {
        this.f900a = a.f907b;
        this.f901b = C5.c.f895f;
        this.f903d = true;
        this.f902c = nVar;
        m(m.f23146S);
    }

    public d(d dVar) {
        this(dVar, dVar.f902c);
    }

    public d(d dVar, n nVar) {
        this.f900a = a.f907b;
        this.f901b = C5.c.f895f;
        this.f903d = true;
        this.f900a = dVar.f900a;
        this.f901b = dVar.f901b;
        this.f903d = dVar.f903d;
        this.f904e = dVar.f904e;
        this.f905f = dVar.f905f;
        this.f906g = dVar.f906g;
        this.f902c = nVar;
    }

    public static class c implements b, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final c f908a = new c();

        @Override // C5.d.b
        public boolean p() {
            return true;
        }

        @Override // C5.d.b
        public void q(com.fasterxml.jackson.core.f fVar, int i10) {
        }
    }
}
