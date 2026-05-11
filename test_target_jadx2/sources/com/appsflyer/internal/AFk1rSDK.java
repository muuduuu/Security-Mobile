package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFk1rSDK extends FilterInputStream {
    private static final short getMediationNetwork = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private int AFAdRevenueData;
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private int copy;
    private final int copydefault;
    private final int equals;
    private byte[] getCurrencyIso4217Code;
    private byte[] getMonetizationNetwork;
    private byte[] getRevenue;
    private int hashCode;
    private int registerClient;
    private int toString;

    public AFk1rSDK(InputStream inputStream, int[] iArr, int i10, byte[] bArr, int i11, int i12) {
        this(inputStream, iArr, i10, bArr, i11, i12, (byte) 0);
    }

    private int AFAdRevenueData() {
        if (this.component1 == Integer.MAX_VALUE) {
            this.component1 = ((FilterInputStream) this).in.read();
        }
        if (this.AFAdRevenueData == 8) {
            byte[] bArr = this.getMonetizationNetwork;
            int i10 = this.component1;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.getMonetizationNetwork, i11, 8 - i11);
                if (read <= 0) {
                    break;
                }
                i11 += read;
            } while (i11 < 8);
            if (i11 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = this.equals;
            if (i12 == this.copydefault) {
                getCurrencyIso4217Code();
            } else {
                if (this.registerClient <= i12) {
                    getCurrencyIso4217Code();
                }
                int i13 = this.registerClient;
                if (i13 < this.copydefault) {
                    this.registerClient = i13 + 1;
                } else {
                    this.registerClient = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.component1 = read2;
            this.AFAdRevenueData = 0;
            this.component4 = read2 < 0 ? 8 - (this.getMonetizationNetwork[7] & 255) : 8;
        }
        return this.component4;
    }

    private void getCurrencyIso4217Code() {
        if (this.component3 == 3) {
            byte[] bArr = this.getMonetizationNetwork;
            System.arraycopy(bArr, 0, this.getCurrencyIso4217Code, 0, bArr.length);
        }
        byte[] bArr2 = this.getMonetizationNetwork;
        int i10 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i11 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i12 = 0;
        while (true) {
            int i13 = this.areAllFieldsValid;
            if (i12 >= i13) {
                break;
            }
            short s10 = getMediationNetwork;
            i11 -= ((((i13 - i12) * s10) + i10) ^ ((i10 << 4) + this.copy)) ^ ((i10 >>> 5) + this.toString);
            i10 -= (((i11 << 4) + this.component2) ^ ((s10 * (i13 - i12)) + i11)) ^ ((i11 >>> 5) + this.hashCode);
            i12++;
        }
        byte[] bArr3 = this.getMonetizationNetwork;
        bArr3[0] = (byte) (i10 >> 24);
        bArr3[1] = (byte) (i10 >> 16);
        bArr3[2] = (byte) (i10 >> 8);
        bArr3[3] = (byte) i10;
        bArr3[4] = (byte) (i11 >> 24);
        bArr3[5] = (byte) (i11 >> 16);
        bArr3[6] = (byte) (i11 >> 8);
        bArr3[7] = (byte) i11;
        if (this.component3 == 3) {
            for (int i14 = 0; i14 < 8; i14++) {
                byte[] bArr4 = this.getMonetizationNetwork;
                bArr4[i14] = (byte) (bArr4[i14] ^ this.getRevenue[i14]);
            }
            byte[] bArr5 = this.getCurrencyIso4217Code;
            System.arraycopy(bArr5, 0, this.getRevenue, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        AFAdRevenueData();
        return this.component4 - this.AFAdRevenueData;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        AFAdRevenueData();
        int i10 = this.AFAdRevenueData;
        if (i10 >= this.component4) {
            return -1;
        }
        byte[] bArr = this.getMonetizationNetwork;
        this.AFAdRevenueData = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    private AFk1rSDK(InputStream inputStream, int[] iArr, int i10, byte[] bArr, int i11, int i12, byte b10) {
        super(new BufferedInputStream(inputStream, 4096));
        this.component1 = Integer.MAX_VALUE;
        this.registerClient = 1;
        this.getMonetizationNetwork = new byte[8];
        this.getRevenue = new byte[8];
        this.getCurrencyIso4217Code = new byte[8];
        this.AFAdRevenueData = 8;
        this.component4 = 8;
        this.areAllFieldsValid = Math.min(Math.max(i11, 5), 16);
        this.component3 = i12;
        if (i12 == 3) {
            System.arraycopy(bArr, 0, this.getRevenue, 0, 8);
        }
        long j10 = (iArr[1] & 4294967295L) | ((iArr[0] & 4294967295L) << 32);
        if (i10 == 0) {
            this.component2 = (int) j10;
            long j11 = j10 >> 3;
            short s10 = getMediationNetwork;
            this.hashCode = (int) ((s10 * j11) >> 32);
            this.copy = (int) (j10 >> 32);
            this.toString = (int) (j11 + s10);
        } else {
            int i13 = (int) j10;
            this.component2 = i13;
            this.hashCode = i13 * i10;
            this.copy = i10 ^ i13;
            this.toString = (int) (j10 >> 32);
        }
        this.equals = 100;
        this.copydefault = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            AFAdRevenueData();
            int i14 = this.AFAdRevenueData;
            if (i14 >= this.component4) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.getMonetizationNetwork;
            this.AFAdRevenueData = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
