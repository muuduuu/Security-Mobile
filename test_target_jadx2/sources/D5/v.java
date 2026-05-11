package D5;

import K5.AbstractC0928i;
import java.io.Serializable;
import v5.H;

/* loaded from: classes2.dex */
public class v implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final v f1283h = new v(Boolean.TRUE, null, null, null, null, null, null);

    /* renamed from: i, reason: collision with root package name */
    public static final v f1284i = new v(Boolean.FALSE, null, null, null, null, null, null);

    /* renamed from: j, reason: collision with root package name */
    public static final v f1285j = new v(null, null, null, null, null, null, null);

    /* renamed from: a, reason: collision with root package name */
    protected final Boolean f1286a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f1287b;

    /* renamed from: c, reason: collision with root package name */
    protected final Integer f1288c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f1289d;

    /* renamed from: e, reason: collision with root package name */
    protected final transient a f1290e;

    /* renamed from: f, reason: collision with root package name */
    protected H f1291f;

    /* renamed from: g, reason: collision with root package name */
    protected H f1292g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC0928i f1293a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1294b;

        protected a(AbstractC0928i abstractC0928i, boolean z10) {
            this.f1293a = abstractC0928i;
            this.f1294b = z10;
        }

        public static a a(AbstractC0928i abstractC0928i) {
            return new a(abstractC0928i, true);
        }

        public static a b(AbstractC0928i abstractC0928i) {
            return new a(abstractC0928i, false);
        }

        public static a c(AbstractC0928i abstractC0928i) {
            return new a(abstractC0928i, false);
        }
    }

    protected v(Boolean bool, String str, Integer num, String str2, a aVar, H h10, H h11) {
        this.f1286a = bool;
        this.f1287b = str;
        this.f1288c = num;
        this.f1289d = (str2 == null || str2.isEmpty()) ? null : str2;
        this.f1290e = aVar;
        this.f1291f = h10;
        this.f1292g = h11;
    }

    public static v a(Boolean bool, String str, Integer num, String str2) {
        return (str == null && num == null && str2 == null) ? bool == null ? f1285j : bool.booleanValue() ? f1283h : f1284i : new v(bool, str, num, str2, null, null, null);
    }

    public Integer b() {
        return this.f1288c;
    }

    public boolean c() {
        return this.f1288c != null;
    }

    public v d(String str) {
        return new v(this.f1286a, str, this.f1288c, this.f1289d, this.f1290e, this.f1291f, this.f1292g);
    }

    public v e(a aVar) {
        return new v(this.f1286a, this.f1287b, this.f1288c, this.f1289d, aVar, this.f1291f, this.f1292g);
    }

    public v f(H h10, H h11) {
        return new v(this.f1286a, this.f1287b, this.f1288c, this.f1289d, this.f1290e, h10, h11);
    }
}
