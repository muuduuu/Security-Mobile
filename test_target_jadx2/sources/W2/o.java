package W2;

import V2.c;
import java.io.IOException;

/* loaded from: classes.dex */
public class o implements V2.b {

    /* renamed from: i, reason: collision with root package name */
    private static final Object f11344i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private static o f11345j;

    /* renamed from: k, reason: collision with root package name */
    private static int f11346k;

    /* renamed from: a, reason: collision with root package name */
    private V2.d f11347a;

    /* renamed from: b, reason: collision with root package name */
    private String f11348b;

    /* renamed from: c, reason: collision with root package name */
    private long f11349c;

    /* renamed from: d, reason: collision with root package name */
    private long f11350d;

    /* renamed from: e, reason: collision with root package name */
    private long f11351e;

    /* renamed from: f, reason: collision with root package name */
    private IOException f11352f;

    /* renamed from: g, reason: collision with root package name */
    private c.a f11353g;

    /* renamed from: h, reason: collision with root package name */
    private o f11354h;

    private o() {
    }

    public static o a() {
        synchronized (f11344i) {
            try {
                o oVar = f11345j;
                if (oVar == null) {
                    return new o();
                }
                f11345j = oVar.f11354h;
                oVar.f11354h = null;
                f11346k--;
                return oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void c() {
        this.f11347a = null;
        this.f11348b = null;
        this.f11349c = 0L;
        this.f11350d = 0L;
        this.f11351e = 0L;
        this.f11352f = null;
        this.f11353g = null;
    }

    public void b() {
        synchronized (f11344i) {
            try {
                if (f11346k < 5) {
                    c();
                    f11346k++;
                    o oVar = f11345j;
                    if (oVar != null) {
                        this.f11354h = oVar;
                    }
                    f11345j = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public o d(V2.d dVar) {
        this.f11347a = dVar;
        return this;
    }

    public o e(long j10) {
        this.f11350d = j10;
        return this;
    }

    public o f(long j10) {
        this.f11351e = j10;
        return this;
    }

    public o g(c.a aVar) {
        this.f11353g = aVar;
        return this;
    }

    public o h(IOException iOException) {
        this.f11352f = iOException;
        return this;
    }

    public o i(long j10) {
        this.f11349c = j10;
        return this;
    }

    public o j(String str) {
        this.f11348b = str;
        return this;
    }
}
