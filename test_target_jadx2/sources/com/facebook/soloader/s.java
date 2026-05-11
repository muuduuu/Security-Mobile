package com.facebook.soloader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;

/* loaded from: classes2.dex */
public abstract class s {

    protected static class a extends UnsatisfiedLinkError {
        a(String str) {
            super(str);
        }
    }

    public static String[] a(h hVar) {
        return hVar instanceof i ? c((i) hVar) : b(hVar);
    }

    private static String[] b(h hVar) {
        long j10;
        long g10;
        String str;
        long j11;
        long j12;
        long j13;
        String str2;
        long j14;
        long d10;
        long d11;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long g11 = g(hVar, allocate, 0L);
        if (g11 != 1179403647) {
            throw new a("file is not ELF: magic is 0x" + Long.toHexString(g11) + ", it should be " + Long.toHexString(1179403647L));
        }
        boolean z10 = h(hVar, allocate, 4L) == 1;
        if (h(hVar, allocate, 5L) == 2) {
            allocate.order(ByteOrder.BIG_ENDIAN);
        }
        long g12 = z10 ? g(hVar, allocate, 28L) : d(hVar, allocate, 32L);
        long f10 = z10 ? f(hVar, allocate, 44L) : f(hVar, allocate, 56L);
        int f11 = f(hVar, allocate, z10 ? 42L : 54L);
        if (f10 == 65535) {
            long g13 = z10 ? g(hVar, allocate, 32L) : d(hVar, allocate, 40L);
            f10 = z10 ? g(hVar, allocate, g13 + 28) : g(hVar, allocate, g13 + 44);
        }
        long j15 = g12;
        long j16 = 0;
        while (true) {
            if (j16 >= f10) {
                j10 = 0;
                break;
            }
            if ((z10 ? g(hVar, allocate, j15) : g(hVar, allocate, j15)) == 2) {
                j10 = z10 ? g(hVar, allocate, j15 + 4) : d(hVar, allocate, j15 + 8);
            } else {
                j15 += f11;
                j16++;
            }
        }
        if (j10 == 0) {
            throw new a("ELF file does not contain dynamic linking information");
        }
        long j17 = j10;
        int i10 = 0;
        long j18 = 0;
        do {
            g10 = z10 ? g(hVar, allocate, j17) : d(hVar, allocate, j17);
            if (g10 == 1) {
                if (i10 == Integer.MAX_VALUE) {
                    throw new a("malformed DT_NEEDED section");
                }
                i10++;
                str = "malformed DT_NEEDED section";
            } else if (g10 == 5) {
                str = "malformed DT_NEEDED section";
                j18 = z10 ? g(hVar, allocate, j17 + 4) : d(hVar, allocate, j17 + 8);
            } else {
                str = "malformed DT_NEEDED section";
            }
            j17 += z10 ? 8L : 16L;
        } while (g10 != 0);
        if (j18 == 0) {
            throw new a("Dynamic section string-table not found");
        }
        long j19 = g12;
        int i11 = 0;
        while (true) {
            if (i11 >= f10) {
                j11 = j10;
                j12 = 0;
                j13 = 0;
                break;
            }
            if ((z10 ? g(hVar, allocate, j19) : g(hVar, allocate, j19)) == 1) {
                if (z10) {
                    j14 = f10;
                    d10 = g(hVar, allocate, j19 + 8);
                } else {
                    j14 = f10;
                    d10 = d(hVar, allocate, j19 + 16);
                }
                if (z10) {
                    j11 = j10;
                    d11 = g(hVar, allocate, j19 + 20);
                } else {
                    j11 = j10;
                    d11 = d(hVar, allocate, j19 + 40);
                }
                if (d10 <= j18 && j18 < d11 + d10) {
                    j13 = (z10 ? g(hVar, allocate, j19 + 4) : d(hVar, allocate, j19 + 8)) + (j18 - d10);
                    j12 = 0;
                }
            } else {
                j14 = f10;
                j11 = j10;
            }
            j19 += f11;
            i11++;
            f10 = j14;
            j10 = j11;
        }
        if (j13 == j12) {
            throw new a("did not find file offset of DT_STRTAB table");
        }
        String[] strArr = new String[i10];
        long j20 = j11;
        int i12 = 0;
        while (true) {
            long g14 = z10 ? g(hVar, allocate, j20) : d(hVar, allocate, j20);
            if (g14 == 1) {
                strArr[i12] = e(hVar, allocate, (z10 ? g(hVar, allocate, j20 + 4) : d(hVar, allocate, j20 + 8)) + j13);
                if (i12 == Integer.MAX_VALUE) {
                    throw new a(str);
                }
                i12++;
                str2 = str;
            } else {
                str2 = str;
            }
            j20 += z10 ? 8L : 16L;
            if (g14 == 0) {
                if (i12 == i10) {
                    return strArr;
                }
                throw new a(str2);
            }
            str = str2;
        }
    }

    private static String[] c(i iVar) {
        int i10 = 0;
        while (true) {
            try {
                return b(iVar);
            } catch (ClosedByInterruptException e10) {
                i10++;
                if (i10 > 4) {
                    throw e10;
                }
                Thread.interrupted();
                p.c("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e10);
                iVar.a();
            }
        }
    }

    private static long d(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 8, j10);
        return byteBuffer.getLong();
    }

    private static String e(h hVar, ByteBuffer byteBuffer, long j10) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j11 = 1 + j10;
            short h10 = h(hVar, byteBuffer, j10);
            if (h10 == 0) {
                return sb2.toString();
            }
            sb2.append((char) h10);
            j10 = j11;
        }
    }

    private static int f(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 2, j10);
        return byteBuffer.getShort() & 65535;
    }

    private static long g(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 4, j10);
        return byteBuffer.getInt() & 4294967295L;
    }

    private static short h(h hVar, ByteBuffer byteBuffer, long j10) {
        i(hVar, byteBuffer, 1, j10);
        return (short) (byteBuffer.get() & 255);
    }

    private static void i(h hVar, ByteBuffer byteBuffer, int i10, long j10) {
        int H02;
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        while (byteBuffer.remaining() > 0 && (H02 = hVar.H0(byteBuffer, j10)) != -1) {
            j10 += H02;
        }
        if (byteBuffer.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
