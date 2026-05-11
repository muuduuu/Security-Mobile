package e4;

import b3.AbstractC1647b;
import b3.l;
import b3.q;
import e3.InterfaceC3074a;
import g4.i;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class f {

    /* renamed from: g, reason: collision with root package name */
    private boolean f32210g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3074a f32211h;

    /* renamed from: c, reason: collision with root package name */
    private int f32206c = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f32205b = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f32207d = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f32209f = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f32208e = 0;

    /* renamed from: a, reason: collision with root package name */
    private int f32204a = 0;

    public f(InterfaceC3074a interfaceC3074a) {
        this.f32211h = (InterfaceC3074a) l.g(interfaceC3074a);
    }

    private boolean a(InputStream inputStream) {
        int read;
        int i10 = this.f32208e;
        while (this.f32204a != 6 && (read = inputStream.read()) != -1) {
            try {
                int i11 = this.f32206c;
                this.f32206c = i11 + 1;
                if (this.f32210g) {
                    this.f32204a = 6;
                    this.f32210g = false;
                    return false;
                }
                int i12 = this.f32204a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 4) {
                                    this.f32204a = 5;
                                } else if (i12 != 5) {
                                    l.i(false);
                                } else {
                                    int i13 = ((this.f32205b << 8) + read) - 2;
                                    j3.d.a(inputStream, i13);
                                    this.f32206c += i13;
                                    this.f32204a = 2;
                                }
                            } else if (read == 255) {
                                this.f32204a = 3;
                            } else if (read == 0) {
                                this.f32204a = 2;
                            } else if (read == 217) {
                                this.f32210g = true;
                                f(i11 - 1);
                                this.f32204a = 2;
                            } else {
                                if (read == 218) {
                                    f(i11 - 1);
                                }
                                if (b(read)) {
                                    this.f32204a = 4;
                                } else {
                                    this.f32204a = 2;
                                }
                            }
                        } else if (read == 255) {
                            this.f32204a = 3;
                        }
                    } else if (read == 216) {
                        this.f32204a = 2;
                    } else {
                        this.f32204a = 6;
                    }
                } else if (read == 255) {
                    this.f32204a = 1;
                } else {
                    this.f32204a = 6;
                }
                this.f32205b = read;
            } catch (IOException e10) {
                q.a(e10);
            }
        }
        return (this.f32204a == 6 || this.f32208e == i10) ? false : true;
    }

    private static boolean b(int i10) {
        if (i10 == 1) {
            return false;
        }
        return ((i10 >= 208 && i10 <= 215) || i10 == 217 || i10 == 216) ? false : true;
    }

    private void f(int i10) {
        int i11 = this.f32207d;
        if (i11 > 0) {
            this.f32209f = i10;
        }
        this.f32207d = i11 + 1;
        this.f32208e = i11;
    }

    public int c() {
        return this.f32209f;
    }

    public int d() {
        return this.f32208e;
    }

    public boolean e() {
        return this.f32210g;
    }

    public boolean g(i iVar) {
        if (this.f32204a == 6 || iVar.p() <= this.f32206c) {
            return false;
        }
        e3.g gVar = new e3.g(iVar.n(), (byte[]) this.f32211h.get(16384), this.f32211h);
        try {
            j3.d.a(gVar, this.f32206c);
            return a(gVar);
        } catch (IOException e10) {
            q.a(e10);
            return false;
        } finally {
            AbstractC1647b.b(gVar);
        }
    }
}
