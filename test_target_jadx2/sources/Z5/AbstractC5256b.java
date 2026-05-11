package z5;

import C5.h;
import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.n;
import w5.AbstractC5038a;
import y5.AbstractC5174a;
import y5.C5176c;

/* renamed from: z5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5256b extends AbstractC5038a {

    /* renamed from: p, reason: collision with root package name */
    protected static final int[] f45740p = AbstractC5174a.d();

    /* renamed from: q, reason: collision with root package name */
    protected static final h f45741q = f.f23140c;

    /* renamed from: k, reason: collision with root package name */
    protected final C5176c f45742k;

    /* renamed from: l, reason: collision with root package name */
    protected int[] f45743l;

    /* renamed from: m, reason: collision with root package name */
    protected int f45744m;

    /* renamed from: n, reason: collision with root package name */
    protected n f45745n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f45746o;

    public AbstractC5256b(C5176c c5176c, int i10, l lVar) {
        super(i10, lVar);
        this.f45743l = f45740p;
        this.f45745n = C5.d.f899h;
        this.f45742k = c5176c;
        if (f.b.ESCAPE_NON_ASCII.enabledIn(i10)) {
            this.f45744m = 127;
        }
        this.f45746o = !f.b.QUOTE_FIELD_NAMES.enabledIn(i10);
    }

    @Override // w5.AbstractC5038a, com.fasterxml.jackson.core.f
    public f i(f.b bVar) {
        super.i(bVar);
        if (bVar == f.b.QUOTE_FIELD_NAMES) {
            this.f45746o = true;
        }
        return this;
    }

    @Override // w5.AbstractC5038a
    protected void o2(int i10, int i11) {
        super.o2(i10, i11);
        this.f45746o = !f.b.QUOTE_FIELD_NAMES.enabledIn(i10);
    }

    protected void q2(String str) {
        a(String.format("Can not %s, expecting field name (context: %s)", str, this.f44329h.f()));
    }

    @Override // com.fasterxml.jackson.core.f
    public f r(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f45744m = i10;
        return this;
    }

    protected void r2(String str, int i10) {
        if (i10 == 0) {
            if (this.f44329h.d()) {
                this.f23142a.h(this);
                return;
            } else {
                if (this.f44329h.e()) {
                    this.f23142a.d(this);
                    return;
                }
                return;
            }
        }
        if (i10 == 1) {
            this.f23142a.c(this);
            return;
        }
        if (i10 == 2) {
            this.f23142a.k(this);
            return;
        }
        if (i10 == 3) {
            this.f23142a.b(this);
        } else if (i10 != 5) {
            b();
        } else {
            q2(str);
        }
    }

    public f s2(n nVar) {
        this.f45745n = nVar;
        return this;
    }
}
