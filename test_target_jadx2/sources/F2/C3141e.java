package f2;

import android.graphics.Bitmap;
import android.util.Log;
import f2.InterfaceC3137a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import org.conscrypt.PSKKeyManager;

/* renamed from: f2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3141e implements InterfaceC3137a {

    /* renamed from: u, reason: collision with root package name */
    private static final String f32842u = "e";

    /* renamed from: a, reason: collision with root package name */
    private int[] f32843a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f32844b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3137a.InterfaceC0480a f32845c;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f32846d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f32847e;

    /* renamed from: f, reason: collision with root package name */
    private short[] f32848f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f32849g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f32850h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f32851i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f32852j;

    /* renamed from: k, reason: collision with root package name */
    private int f32853k;

    /* renamed from: l, reason: collision with root package name */
    private C3139c f32854l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f32855m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f32856n;

    /* renamed from: o, reason: collision with root package name */
    private int f32857o;

    /* renamed from: p, reason: collision with root package name */
    private int f32858p;

    /* renamed from: q, reason: collision with root package name */
    private int f32859q;

    /* renamed from: r, reason: collision with root package name */
    private int f32860r;

    /* renamed from: s, reason: collision with root package name */
    private Boolean f32861s;

    /* renamed from: t, reason: collision with root package name */
    private Bitmap.Config f32862t;

    public C3141e(InterfaceC3137a.InterfaceC0480a interfaceC0480a, C3139c c3139c, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0480a);
        q(c3139c, byteBuffer, i10);
    }

    private int i(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f32858p + i10; i18++) {
            byte[] bArr = this.f32851i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f32843a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f32858p + i20; i21++) {
            byte[] bArr2 = this.f32851i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f32843a[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    private void j(C3138b c3138b) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.f32852j;
        int i15 = c3138b.f32817d;
        int i16 = this.f32858p;
        int i17 = i15 / i16;
        int i18 = c3138b.f32815b / i16;
        int i19 = c3138b.f32816c / i16;
        int i20 = c3138b.f32814a / i16;
        boolean z10 = this.f32853k == 0;
        int i21 = this.f32860r;
        int i22 = this.f32859q;
        byte[] bArr = this.f32851i;
        int[] iArr2 = this.f32843a;
        Boolean bool = this.f32861s;
        int i23 = 8;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1;
        while (i25 < i17) {
            Boolean bool2 = bool;
            if (c3138b.f32818e) {
                if (i24 >= i17) {
                    int i27 = i26 + 1;
                    i10 = i17;
                    if (i27 == 2) {
                        i24 = 4;
                    } else if (i27 == 3) {
                        i23 = 4;
                        i26 = i27;
                        i24 = 2;
                    } else if (i27 == 4) {
                        i26 = i27;
                        i24 = 1;
                        i23 = 2;
                    }
                    i26 = i27;
                } else {
                    i10 = i17;
                }
                i11 = i24 + i23;
            } else {
                i10 = i17;
                i11 = i24;
                i24 = i25;
            }
            int i28 = i24 + i18;
            boolean z11 = i16 == 1;
            if (i28 < i22) {
                int i29 = i28 * i21;
                int i30 = i29 + i20;
                int i31 = i30 + i19;
                int i32 = i29 + i21;
                if (i32 < i31) {
                    i31 = i32;
                }
                i12 = i11;
                int i33 = i25 * i16 * c3138b.f32816c;
                if (z11) {
                    int i34 = i30;
                    while (i34 < i31) {
                        int i35 = i18;
                        int i36 = iArr2[bArr[i33] & 255];
                        if (i36 != 0) {
                            iArr[i34] = i36;
                        } else if (z10 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i33 += i16;
                        i34++;
                        i18 = i35;
                    }
                } else {
                    i14 = i18;
                    int i37 = ((i31 - i30) * i16) + i33;
                    int i38 = i30;
                    while (true) {
                        i13 = i19;
                        if (i38 >= i31) {
                            break;
                        }
                        int i39 = i(i33, i37, c3138b.f32816c);
                        if (i39 != 0) {
                            iArr[i38] = i39;
                        } else if (z10 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i33 += i16;
                        i38++;
                        i19 = i13;
                    }
                    bool = bool2;
                    i25++;
                    i18 = i14;
                    i17 = i10;
                    i19 = i13;
                    i24 = i12;
                }
            } else {
                i12 = i11;
            }
            i14 = i18;
            i13 = i19;
            bool = bool2;
            i25++;
            i18 = i14;
            i17 = i10;
            i19 = i13;
            i24 = i12;
        }
        Boolean bool3 = bool;
        if (this.f32861s == null) {
            this.f32861s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void k(C3138b c3138b) {
        C3138b c3138b2 = c3138b;
        int[] iArr = this.f32852j;
        int i10 = c3138b2.f32817d;
        int i11 = c3138b2.f32815b;
        int i12 = c3138b2.f32816c;
        int i13 = c3138b2.f32814a;
        boolean z10 = this.f32853k == 0;
        int i14 = this.f32860r;
        byte[] bArr = this.f32851i;
        int[] iArr2 = this.f32843a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = c3138b2.f32816c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int i22 = i10;
                int i23 = b11 & 255;
                if (i23 != b10) {
                    int i24 = iArr2[i23];
                    if (i24 != 0) {
                        iArr[i21] = i24;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                i10 = i22;
            }
            i15++;
            c3138b2 = c3138b;
        }
        Boolean bool = this.f32861s;
        this.f32861s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f32861s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void l(C3138b c3138b) {
        int i10;
        int i11;
        short s10;
        C3141e c3141e = this;
        if (c3138b != null) {
            c3141e.f32846d.position(c3138b.f32823j);
        }
        if (c3138b == null) {
            C3139c c3139c = c3141e.f32854l;
            i10 = c3139c.f32830f;
            i11 = c3139c.f32831g;
        } else {
            i10 = c3138b.f32816c;
            i11 = c3138b.f32817d;
        }
        int i12 = i10 * i11;
        byte[] bArr = c3141e.f32851i;
        if (bArr == null || bArr.length < i12) {
            c3141e.f32851i = c3141e.f32845c.e(i12);
        }
        byte[] bArr2 = c3141e.f32851i;
        if (c3141e.f32848f == null) {
            c3141e.f32848f = new short[4096];
        }
        short[] sArr = c3141e.f32848f;
        if (c3141e.f32849g == null) {
            c3141e.f32849g = new byte[4096];
        }
        byte[] bArr3 = c3141e.f32849g;
        if (c3141e.f32850h == null) {
            c3141e.f32850h = new byte[4097];
        }
        byte[] bArr4 = c3141e.f32850h;
        int p10 = p();
        int i13 = 1 << p10;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = p10 + 1;
        int i17 = (1 << i16) - 1;
        int i18 = 0;
        for (int i19 = 0; i19 < i13; i19++) {
            sArr[i19] = 0;
            bArr3[i19] = (byte) i19;
        }
        byte[] bArr5 = c3141e.f32847e;
        int i20 = i16;
        int i21 = i15;
        int i22 = i17;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        while (true) {
            if (i18 >= i12) {
                break;
            }
            if (i23 == 0) {
                i23 = o();
                if (i23 <= 0) {
                    c3141e.f32857o = 3;
                    break;
                }
                i24 = 0;
            }
            i26 += (bArr5[i24] & 255) << i25;
            i24++;
            i23--;
            int i31 = i25 + 8;
            int i32 = i21;
            int i33 = i20;
            int i34 = i30;
            int i35 = i16;
            int i36 = i28;
            while (true) {
                if (i31 < i33) {
                    i30 = i34;
                    i21 = i32;
                    i25 = i31;
                    c3141e = this;
                    i28 = i36;
                    i16 = i35;
                    i20 = i33;
                    break;
                }
                int i37 = i15;
                int i38 = i26 & i22;
                i26 >>= i33;
                i31 -= i33;
                if (i38 == i13) {
                    i22 = i17;
                    i33 = i35;
                    i32 = i37;
                    i15 = i32;
                    i34 = -1;
                } else {
                    if (i38 == i14) {
                        i25 = i31;
                        i28 = i36;
                        i21 = i32;
                        i16 = i35;
                        i15 = i37;
                        i30 = i34;
                        i20 = i33;
                        c3141e = this;
                        break;
                    }
                    if (i34 == -1) {
                        bArr2[i27] = bArr3[i38];
                        i27++;
                        i18++;
                        i34 = i38;
                        i36 = i34;
                        i15 = i37;
                        i31 = i31;
                    } else {
                        if (i38 >= i32) {
                            bArr4[i29] = (byte) i36;
                            i29++;
                            s10 = i34;
                        } else {
                            s10 = i38;
                        }
                        while (s10 >= i13) {
                            bArr4[i29] = bArr3[s10];
                            i29++;
                            s10 = sArr[s10];
                        }
                        i36 = bArr3[s10] & 255;
                        byte b10 = (byte) i36;
                        bArr2[i27] = b10;
                        while (true) {
                            i27++;
                            i18++;
                            if (i29 <= 0) {
                                break;
                            }
                            i29--;
                            bArr2[i27] = bArr4[i29];
                        }
                        byte[] bArr6 = bArr4;
                        if (i32 < 4096) {
                            sArr[i32] = (short) i34;
                            bArr3[i32] = b10;
                            i32++;
                            if ((i32 & i22) == 0 && i32 < 4096) {
                                i33++;
                                i22 += i32;
                            }
                        }
                        i34 = i38;
                        i15 = i37;
                        i31 = i31;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i27, i12, (byte) 0);
    }

    private Bitmap n() {
        Boolean bool = this.f32861s;
        Bitmap a10 = this.f32845c.a(this.f32860r, this.f32859q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f32862t);
        a10.setHasAlpha(true);
        return a10;
    }

    private int o() {
        int p10 = p();
        if (p10 <= 0) {
            return p10;
        }
        ByteBuffer byteBuffer = this.f32846d;
        byteBuffer.get(this.f32847e, 0, Math.min(p10, byteBuffer.remaining()));
        return p10;
    }

    private int p() {
        return this.f32846d.get() & 255;
    }

    private Bitmap r(C3138b c3138b, C3138b c3138b2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f32852j;
        int i12 = 0;
        if (c3138b2 == null) {
            Bitmap bitmap2 = this.f32855m;
            if (bitmap2 != null) {
                this.f32845c.c(bitmap2);
            }
            this.f32855m = null;
            Arrays.fill(iArr, 0);
        }
        if (c3138b2 != null && c3138b2.f32820g == 3 && this.f32855m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c3138b2 != null && (i11 = c3138b2.f32820g) > 0) {
            if (i11 == 2) {
                if (!c3138b.f32819f) {
                    C3139c c3139c = this.f32854l;
                    int i13 = c3139c.f32836l;
                    if (c3138b.f32824k == null || c3139c.f32834j != c3138b.f32821h) {
                        i12 = i13;
                    }
                }
                int i14 = c3138b2.f32817d;
                int i15 = this.f32858p;
                int i16 = i14 / i15;
                int i17 = c3138b2.f32815b / i15;
                int i18 = c3138b2.f32816c / i15;
                int i19 = c3138b2.f32814a / i15;
                int i20 = this.f32860r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f32860r;
                }
            } else if (i11 == 3 && (bitmap = this.f32855m) != null) {
                int i25 = this.f32860r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f32859q);
            }
        }
        l(c3138b);
        if (c3138b.f32818e || this.f32858p != 1) {
            j(c3138b);
        } else {
            k(c3138b);
        }
        if (this.f32856n && ((i10 = c3138b.f32820g) == 0 || i10 == 1)) {
            if (this.f32855m == null) {
                this.f32855m = n();
            }
            Bitmap bitmap3 = this.f32855m;
            int i26 = this.f32860r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f32859q);
        }
        Bitmap n10 = n();
        int i27 = this.f32860r;
        n10.setPixels(iArr, 0, i27, 0, 0, i27, this.f32859q);
        return n10;
    }

    @Override // f2.InterfaceC3137a
    public int a() {
        return this.f32854l.f32827c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    @Override // f2.InterfaceC3137a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized Bitmap b() {
        int i10;
        String str;
        int[] iArr;
        try {
            if (this.f32854l.f32827c > 0) {
                if (this.f32853k < 0) {
                }
                i10 = this.f32857o;
                if (i10 != 1 && i10 != 2) {
                    this.f32857o = 0;
                    if (this.f32847e == null) {
                        this.f32847e = this.f32845c.e(255);
                    }
                    C3138b c3138b = (C3138b) this.f32854l.f32829e.get(this.f32853k);
                    int i11 = this.f32853k - 1;
                    C3138b c3138b2 = i11 < 0 ? (C3138b) this.f32854l.f32829e.get(i11) : null;
                    iArr = c3138b.f32824k;
                    if (iArr != null) {
                        iArr = this.f32854l.f32825a;
                    }
                    this.f32843a = iArr;
                    if (iArr != null) {
                        String str2 = f32842u;
                        if (Log.isLoggable(str2, 3)) {
                            Log.d(str2, "No valid color table found for frame #" + this.f32853k);
                        }
                        this.f32857o = 1;
                        return null;
                    }
                    if (c3138b.f32819f) {
                        System.arraycopy(iArr, 0, this.f32844b, 0, iArr.length);
                        int[] iArr2 = this.f32844b;
                        this.f32843a = iArr2;
                        iArr2[c3138b.f32821h] = 0;
                        if (c3138b.f32820g == 2 && this.f32853k == 0) {
                            this.f32861s = Boolean.TRUE;
                        }
                    }
                    return r(c3138b, c3138b2);
                }
                str = f32842u;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, status=" + this.f32857o);
                }
                return null;
            }
            String str3 = f32842u;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, frameCount=" + this.f32854l.f32827c + ", framePointer=" + this.f32853k);
            }
            this.f32857o = 1;
            i10 = this.f32857o;
            if (i10 != 1) {
                this.f32857o = 0;
                if (this.f32847e == null) {
                }
                C3138b c3138b3 = (C3138b) this.f32854l.f32829e.get(this.f32853k);
                int i112 = this.f32853k - 1;
                if (i112 < 0) {
                }
                iArr = c3138b3.f32824k;
                if (iArr != null) {
                }
                this.f32843a = iArr;
                if (iArr != null) {
                }
            }
            str = f32842u;
            if (Log.isLoggable(str, 3)) {
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // f2.InterfaceC3137a
    public void c() {
        this.f32853k = (this.f32853k + 1) % this.f32854l.f32827c;
    }

    @Override // f2.InterfaceC3137a
    public void clear() {
        this.f32854l = null;
        byte[] bArr = this.f32851i;
        if (bArr != null) {
            this.f32845c.d(bArr);
        }
        int[] iArr = this.f32852j;
        if (iArr != null) {
            this.f32845c.f(iArr);
        }
        Bitmap bitmap = this.f32855m;
        if (bitmap != null) {
            this.f32845c.c(bitmap);
        }
        this.f32855m = null;
        this.f32846d = null;
        this.f32861s = null;
        byte[] bArr2 = this.f32847e;
        if (bArr2 != null) {
            this.f32845c.d(bArr2);
        }
    }

    @Override // f2.InterfaceC3137a
    public int d() {
        int i10;
        if (this.f32854l.f32827c <= 0 || (i10 = this.f32853k) < 0) {
            return 0;
        }
        return m(i10);
    }

    @Override // f2.InterfaceC3137a
    public void e(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f32862t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // f2.InterfaceC3137a
    public void f() {
        this.f32853k = -1;
    }

    @Override // f2.InterfaceC3137a
    public int g() {
        return this.f32853k;
    }

    @Override // f2.InterfaceC3137a
    public ByteBuffer getData() {
        return this.f32846d;
    }

    @Override // f2.InterfaceC3137a
    public int h() {
        return this.f32846d.limit() + this.f32851i.length + (this.f32852j.length * 4);
    }

    public int m(int i10) {
        if (i10 >= 0) {
            C3139c c3139c = this.f32854l;
            if (i10 < c3139c.f32827c) {
                return ((C3138b) c3139c.f32829e.get(i10)).f32822i;
            }
        }
        return -1;
    }

    public synchronized void q(C3139c c3139c, ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int highestOneBit = Integer.highestOneBit(i10);
            this.f32857o = 0;
            this.f32854l = c3139c;
            this.f32853k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f32846d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f32846d.order(ByteOrder.LITTLE_ENDIAN);
            this.f32856n = false;
            Iterator it = c3139c.f32829e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C3138b) it.next()).f32820g == 3) {
                    this.f32856n = true;
                    break;
                }
            }
            this.f32858p = highestOneBit;
            int i11 = c3139c.f32830f;
            this.f32860r = i11 / highestOneBit;
            int i12 = c3139c.f32831g;
            this.f32859q = i12 / highestOneBit;
            this.f32851i = this.f32845c.e(i11 * i12);
            this.f32852j = this.f32845c.b(this.f32860r * this.f32859q);
        } catch (Throwable th) {
            throw th;
        }
    }

    public C3141e(InterfaceC3137a.InterfaceC0480a interfaceC0480a) {
        this.f32844b = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f32862t = Bitmap.Config.ARGB_8888;
        this.f32845c = interfaceC0480a;
        this.f32854l = new C3139c();
    }
}
