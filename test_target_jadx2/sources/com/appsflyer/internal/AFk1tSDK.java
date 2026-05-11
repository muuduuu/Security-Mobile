package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AFk1tSDK extends FilterInputStream {
    private long[] AFAdRevenueData;
    private byte[] areAllFieldsValid;
    private int component1;
    private short component2;
    private int component3;
    private long[] component4;
    private int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final int getMonetizationNetwork;
    private final int getRevenue;
    private int hashCode;

    public AFk1tSDK(InputStream inputStream, int i10, int i11, short s10, int i12, int i13) {
        this(inputStream, i10, i11, s10, i12, i13, (byte) 0);
    }

    private int AFAdRevenueData() {
        int i10;
        if (this.component1 == Integer.MAX_VALUE) {
            this.component1 = ((FilterInputStream) this).in.read();
        }
        if (this.component3 == this.getMonetizationNetwork) {
            byte[] bArr = this.areAllFieldsValid;
            int i11 = this.component1;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.areAllFieldsValid, i12, this.getMonetizationNetwork - i12);
                if (read <= 0) {
                    break;
                }
                i12 += read;
            } while (i12 < this.getMonetizationNetwork);
            if (i12 < this.getMonetizationNetwork) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = this.getRevenue;
            if (i13 == this.getMediationNetwork) {
                getMonetizationNetwork();
            } else {
                if (this.getCurrencyIso4217Code <= i13) {
                    getMonetizationNetwork();
                }
                int i14 = this.getCurrencyIso4217Code;
                if (i14 < this.getMediationNetwork) {
                    this.getCurrencyIso4217Code = i14 + 1;
                } else {
                    this.getCurrencyIso4217Code = 1;
                }
            }
            int read2 = ((FilterInputStream) this).in.read();
            this.component1 = read2;
            this.component3 = 0;
            if (read2 < 0) {
                int i15 = this.getMonetizationNetwork;
                i10 = i15 - (this.areAllFieldsValid[i15 - 1] & 255);
            } else {
                i10 = this.getMonetizationNetwork;
            }
            this.hashCode = i10;
        }
        return this.hashCode;
    }

    private void getMonetizationNetwork() {
        long[] jArr = this.AFAdRevenueData;
        long[] jArr2 = this.component4;
        short s10 = this.component2;
        long j10 = jArr[s10 % 4] * 2147483085;
        long j11 = jArr2[(s10 + 2) % 4];
        int i10 = (s10 + 3) % 4;
        jArr2[i10] = ((jArr[i10] * 2147483085) + j11) / 2147483647L;
        jArr[i10] = (j10 + j11) % 2147483647L;
        for (int i11 = 0; i11 < this.getMonetizationNetwork; i11++) {
            this.areAllFieldsValid[i11] = (byte) (r1[i11] ^ ((this.AFAdRevenueData[this.component2] >> (i11 << 3)) & 255));
        }
        this.component2 = (short) ((this.component2 + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        AFAdRevenueData();
        return this.hashCode - this.component3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        AFAdRevenueData();
        int i10 = this.component3;
        if (i10 >= this.hashCode) {
            return -1;
        }
        byte[] bArr = this.areAllFieldsValid;
        this.component3 = i10 + 1;
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

    private AFk1tSDK(InputStream inputStream, int i10, int i11, short s10, int i12, int i13, byte b10) {
        super(new BufferedInputStream(inputStream, 4096));
        this.getCurrencyIso4217Code = 1;
        this.component1 = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s10, 4), 8);
        this.getMonetizationNetwork = min;
        this.areAllFieldsValid = new byte[min];
        this.AFAdRevenueData = new long[4];
        this.component4 = new long[4];
        this.component3 = min;
        this.hashCode = min;
        this.AFAdRevenueData = AFk1sSDK.getCurrencyIso4217Code(i10 ^ i13, min ^ i13);
        this.component4 = AFk1sSDK.getCurrencyIso4217Code(i11 ^ i13, i12 ^ i13);
        this.getRevenue = 100;
        this.getMediationNetwork = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            AFAdRevenueData();
            int i14 = this.component3;
            if (i14 >= this.hashCode) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.areAllFieldsValid;
            this.component3 = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
