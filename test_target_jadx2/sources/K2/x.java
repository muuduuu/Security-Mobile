package k2;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import l2.InterfaceC3600b;

/* loaded from: classes.dex */
final class x implements i2.f {

    /* renamed from: j, reason: collision with root package name */
    private static final D2.h f36182j = new D2.h(50);

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3600b f36183b;

    /* renamed from: c, reason: collision with root package name */
    private final i2.f f36184c;

    /* renamed from: d, reason: collision with root package name */
    private final i2.f f36185d;

    /* renamed from: e, reason: collision with root package name */
    private final int f36186e;

    /* renamed from: f, reason: collision with root package name */
    private final int f36187f;

    /* renamed from: g, reason: collision with root package name */
    private final Class f36188g;

    /* renamed from: h, reason: collision with root package name */
    private final i2.h f36189h;

    /* renamed from: i, reason: collision with root package name */
    private final i2.l f36190i;

    x(InterfaceC3600b interfaceC3600b, i2.f fVar, i2.f fVar2, int i10, int i11, i2.l lVar, Class cls, i2.h hVar) {
        this.f36183b = interfaceC3600b;
        this.f36184c = fVar;
        this.f36185d = fVar2;
        this.f36186e = i10;
        this.f36187f = i11;
        this.f36190i = lVar;
        this.f36188g = cls;
        this.f36189h = hVar;
    }

    private byte[] c() {
        D2.h hVar = f36182j;
        byte[] bArr = (byte[]) hVar.g(this.f36188g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f36188g.getName().getBytes(i2.f.f34129a);
        hVar.k(this.f36188g, bytes);
        return bytes;
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f36183b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f36186e).putInt(this.f36187f).array();
        this.f36185d.a(messageDigest);
        this.f36184c.a(messageDigest);
        messageDigest.update(bArr);
        i2.l lVar = this.f36190i;
        if (lVar != null) {
            lVar.a(messageDigest);
        }
        this.f36189h.a(messageDigest);
        messageDigest.update(c());
        this.f36183b.put(bArr);
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f36187f == xVar.f36187f && this.f36186e == xVar.f36186e && D2.l.e(this.f36190i, xVar.f36190i) && this.f36188g.equals(xVar.f36188g) && this.f36184c.equals(xVar.f36184c) && this.f36185d.equals(xVar.f36185d) && this.f36189h.equals(xVar.f36189h);
    }

    @Override // i2.f
    public int hashCode() {
        int hashCode = (((((this.f36184c.hashCode() * 31) + this.f36185d.hashCode()) * 31) + this.f36186e) * 31) + this.f36187f;
        i2.l lVar = this.f36190i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return (((hashCode * 31) + this.f36188g.hashCode()) * 31) + this.f36189h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f36184c + ", signature=" + this.f36185d + ", width=" + this.f36186e + ", height=" + this.f36187f + ", decodedResourceClass=" + this.f36188g + ", transformation='" + this.f36190i + "', options=" + this.f36189h + '}';
    }
}
