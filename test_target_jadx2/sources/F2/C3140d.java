package f2;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* renamed from: f2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3140d {

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f32839b;

    /* renamed from: c, reason: collision with root package name */
    private C3139c f32840c;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f32838a = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: d, reason: collision with root package name */
    private int f32841d = 0;

    private boolean b() {
        return this.f32840c.f32826b != 0;
    }

    private int d() {
        try {
            return this.f32839b.get() & 255;
        } catch (Exception unused) {
            this.f32840c.f32826b = 1;
            return 0;
        }
    }

    private void e() {
        this.f32840c.f32828d.f32814a = n();
        this.f32840c.f32828d.f32815b = n();
        this.f32840c.f32828d.f32816c = n();
        this.f32840c.f32828d.f32817d = n();
        int d10 = d();
        boolean z10 = (d10 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (d10 & 7) + 1);
        C3138b c3138b = this.f32840c.f32828d;
        c3138b.f32818e = (d10 & 64) != 0;
        if (z10) {
            c3138b.f32824k = g(pow);
        } else {
            c3138b.f32824k = null;
        }
        this.f32840c.f32828d.f32823j = this.f32839b.position();
        r();
        if (b()) {
            return;
        }
        C3139c c3139c = this.f32840c;
        c3139c.f32827c++;
        c3139c.f32829e.add(c3139c.f32828d);
    }

    private void f() {
        int d10 = d();
        this.f32841d = d10;
        if (d10 <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                i11 = this.f32841d;
                if (i10 >= i11) {
                    return;
                }
                i11 -= i10;
                this.f32839b.get(this.f32838a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f32841d, e10);
                }
                this.f32840c.f32826b = 1;
                return;
            }
        }
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f32839b.get(bArr);
            iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f32840c.f32826b = 1;
        }
        return iArr;
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f32840c.f32827c <= i10) {
            int d10 = d();
            if (d10 == 33) {
                int d11 = d();
                if (d11 == 1) {
                    q();
                } else if (d11 == 249) {
                    this.f32840c.f32828d = new C3138b();
                    j();
                } else if (d11 == 254) {
                    q();
                } else if (d11 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f32838a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (d10 == 44) {
                C3139c c3139c = this.f32840c;
                if (c3139c.f32828d == null) {
                    c3139c.f32828d = new C3138b();
                }
                e();
            } else if (d10 != 59) {
                this.f32840c.f32826b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void j() {
        d();
        int d10 = d();
        C3138b c3138b = this.f32840c.f32828d;
        int i10 = (d10 & 28) >> 2;
        c3138b.f32820g = i10;
        if (i10 == 0) {
            c3138b.f32820g = 1;
        }
        c3138b.f32819f = (d10 & 1) != 0;
        int n10 = n();
        if (n10 < 2) {
            n10 = 10;
        }
        C3138b c3138b2 = this.f32840c.f32828d;
        c3138b2.f32822i = n10 * 10;
        c3138b2.f32821h = d();
        d();
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f32840c.f32826b = 1;
            return;
        }
        l();
        if (!this.f32840c.f32832h || b()) {
            return;
        }
        C3139c c3139c = this.f32840c;
        c3139c.f32825a = g(c3139c.f32833i);
        C3139c c3139c2 = this.f32840c;
        c3139c2.f32836l = c3139c2.f32825a[c3139c2.f32834j];
    }

    private void l() {
        this.f32840c.f32830f = n();
        this.f32840c.f32831g = n();
        int d10 = d();
        C3139c c3139c = this.f32840c;
        c3139c.f32832h = (d10 & 128) != 0;
        c3139c.f32833i = (int) Math.pow(2.0d, (d10 & 7) + 1);
        this.f32840c.f32834j = d();
        this.f32840c.f32835k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f32838a;
            if (bArr[0] == 1) {
                this.f32840c.f32837m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f32841d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f32839b.getShort();
    }

    private void o() {
        this.f32839b = null;
        Arrays.fill(this.f32838a, (byte) 0);
        this.f32840c = new C3139c();
        this.f32841d = 0;
    }

    private void q() {
        int d10;
        do {
            d10 = d();
            this.f32839b.position(Math.min(this.f32839b.position() + d10, this.f32839b.limit()));
        } while (d10 > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f32839b = null;
        this.f32840c = null;
    }

    public C3139c c() {
        if (this.f32839b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f32840c;
        }
        k();
        if (!b()) {
            h();
            C3139c c3139c = this.f32840c;
            if (c3139c.f32827c < 0) {
                c3139c.f32826b = 1;
            }
        }
        return this.f32840c;
    }

    public C3140d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f32839b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f32839b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
