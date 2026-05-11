package w5;

import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.j;
import com.fasterxml.jackson.core.l;
import java.math.BigDecimal;
import z5.C5255a;
import z5.C5257c;

/* renamed from: w5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5038a extends f {

    /* renamed from: j, reason: collision with root package name */
    protected static final int f44325j = (f.b.WRITE_NUMBERS_AS_STRINGS.getMask() | f.b.ESCAPE_NON_ASCII.getMask()) | f.b.STRICT_DUPLICATE_DETECTION.getMask();

    /* renamed from: e, reason: collision with root package name */
    protected l f44326e;

    /* renamed from: f, reason: collision with root package name */
    protected int f44327f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f44328g;

    /* renamed from: h, reason: collision with root package name */
    protected C5257c f44329h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f44330i;

    protected AbstractC5038a(int i10, l lVar) {
        this.f44327f = i10;
        this.f44326e = lVar;
        this.f44329h = C5257c.m(f.b.STRICT_DUPLICATE_DETECTION.enabledIn(i10) ? C5255a.e(this) : null);
        this.f44328g = f.b.WRITE_NUMBERS_AS_STRINGS.enabledIn(i10);
    }

    @Override // com.fasterxml.jackson.core.f
    public void A1(String str) {
        p2("write raw value");
        y1(str);
    }

    @Override // com.fasterxml.jackson.core.f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f44330i = true;
    }

    @Override // com.fasterxml.jackson.core.f
    public f i(f.b bVar) {
        int mask = bVar.getMask();
        this.f44327f &= ~mask;
        if ((mask & f44325j) != 0) {
            if (bVar == f.b.WRITE_NUMBERS_AS_STRINGS) {
                this.f44328g = false;
            } else if (bVar == f.b.ESCAPE_NON_ASCII) {
                r(0);
            } else if (bVar == f.b.STRICT_DUPLICATE_DETECTION) {
                this.f44329h = this.f44329h.r(null);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.f
    public j j() {
        return this.f44329h;
    }

    @Override // com.fasterxml.jackson.core.f
    public final boolean n(f.b bVar) {
        return (bVar.getMask() & this.f44327f) != 0;
    }

    protected String n2(BigDecimal bigDecimal) {
        if (!f.b.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this.f44327f)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale < -9999 || scale > 9999) {
            a(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(scale), 9999, 9999));
        }
        return bigDecimal.toPlainString();
    }

    protected void o2(int i10, int i11) {
        if ((f44325j & i11) == 0) {
            return;
        }
        this.f44328g = f.b.WRITE_NUMBERS_AS_STRINGS.enabledIn(i10);
        f.b bVar = f.b.ESCAPE_NON_ASCII;
        if (bVar.enabledIn(i11)) {
            if (bVar.enabledIn(i10)) {
                r(127);
            } else {
                r(0);
            }
        }
        f.b bVar2 = f.b.STRICT_DUPLICATE_DETECTION;
        if (bVar2.enabledIn(i11)) {
            if (!bVar2.enabledIn(i10)) {
                this.f44329h = this.f44329h.r(null);
            } else if (this.f44329h.n() == null) {
                this.f44329h = this.f44329h.r(C5255a.e(this));
            }
        }
    }

    @Override // com.fasterxml.jackson.core.f
    public f p(int i10, int i11) {
        int i12 = this.f44327f;
        int i13 = (i10 & i11) | ((~i11) & i12);
        int i14 = i12 ^ i13;
        if (i14 != 0) {
            this.f44327f = i13;
            o2(i13, i14);
        }
        return this;
    }

    protected abstract void p2(String str);

    @Override // com.fasterxml.jackson.core.f
    public void q(Object obj) {
        C5257c c5257c = this.f44329h;
        if (c5257c != null) {
            c5257c.q(obj);
        }
    }
}
