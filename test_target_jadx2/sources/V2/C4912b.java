package v2;

import android.graphics.Bitmap;
import f2.InterfaceC3137a;
import l2.InterfaceC3600b;
import l2.InterfaceC3602d;

/* renamed from: v2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4912b implements InterfaceC3137a.InterfaceC0480a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3602d f43819a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3600b f43820b;

    public C4912b(InterfaceC3602d interfaceC3602d, InterfaceC3600b interfaceC3600b) {
        this.f43819a = interfaceC3602d;
        this.f43820b = interfaceC3600b;
    }

    @Override // f2.InterfaceC3137a.InterfaceC0480a
    public Bitmap a(int i10, int i11, Bitmap.Config config) {
        return this.f43819a.e(i10, i11, config);
    }

    @Override // f2.InterfaceC3137a.InterfaceC0480a
    public int[] b(int i10) {
        InterfaceC3600b interfaceC3600b = this.f43820b;
        return interfaceC3600b == null ? new int[i10] : (int[]) interfaceC3600b.d(i10, int[].class);
    }

    @Override // f2.InterfaceC3137a.InterfaceC0480a
    public void c(Bitmap bitmap) {
        this.f43819a.c(bitmap);
    }

    @Override // f2.InterfaceC3137a.InterfaceC0480a
    public void d(byte[] bArr) {
        InterfaceC3600b interfaceC3600b = this.f43820b;
        if (interfaceC3600b == null) {
            return;
        }
        interfaceC3600b.put(bArr);
    }

    @Override // f2.InterfaceC3137a.InterfaceC0480a
    public byte[] e(int i10) {
        InterfaceC3600b interfaceC3600b = this.f43820b;
        return interfaceC3600b == null ? new byte[i10] : (byte[]) interfaceC3600b.d(i10, byte[].class);
    }

    @Override // f2.InterfaceC3137a.InterfaceC0480a
    public void f(int[] iArr) {
        InterfaceC3600b interfaceC3600b = this.f43820b;
        if (interfaceC3600b == null) {
            return;
        }
        interfaceC3600b.put(iArr);
    }
}
