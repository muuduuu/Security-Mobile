package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class j implements h {

    /* renamed from: a, reason: collision with root package name */
    private InputStream f23056a;

    /* renamed from: b, reason: collision with root package name */
    private final ZipEntry f23057b;

    /* renamed from: c, reason: collision with root package name */
    private final ZipFile f23058c;

    /* renamed from: d, reason: collision with root package name */
    private final long f23059d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23060e = true;

    /* renamed from: f, reason: collision with root package name */
    private long f23061f = 0;

    public j(ZipFile zipFile, ZipEntry zipEntry) {
        this.f23058c = zipFile;
        this.f23057b = zipEntry;
        this.f23059d = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f23056a = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // com.facebook.soloader.h
    public int H0(ByteBuffer byteBuffer, long j10) {
        if (this.f23056a == null) {
            throw new IOException("InputStream is null");
        }
        int remaining = byteBuffer.remaining();
        long j11 = this.f23059d - j10;
        if (j11 <= 0) {
            return -1;
        }
        int i10 = (int) j11;
        if (remaining > i10) {
            remaining = i10;
        }
        a(j10);
        if (byteBuffer.hasArray()) {
            this.f23056a.read(byteBuffer.array(), 0, remaining);
            byteBuffer.position(byteBuffer.position() + remaining);
        } else {
            byte[] bArr = new byte[remaining];
            this.f23056a.read(bArr, 0, remaining);
            byteBuffer.put(bArr, 0, remaining);
        }
        this.f23061f += remaining;
        return remaining;
    }

    public h a(long j10) {
        InputStream inputStream = this.f23056a;
        if (inputStream == null) {
            throw new IOException(this.f23057b.getName() + "'s InputStream is null");
        }
        long j11 = this.f23061f;
        if (j10 == j11) {
            return this;
        }
        long j12 = this.f23059d;
        if (j10 > j12) {
            j10 = j12;
        }
        if (j10 >= j11) {
            inputStream.skip(j10 - j11);
        } else {
            inputStream.close();
            InputStream inputStream2 = this.f23058c.getInputStream(this.f23057b);
            this.f23056a = inputStream2;
            if (inputStream2 == null) {
                throw new IOException(this.f23057b.getName() + "'s InputStream is null");
            }
            inputStream2.skip(j10);
        }
        this.f23061f = j10;
        return this;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.f23056a;
        if (inputStream != null) {
            inputStream.close();
            this.f23060e = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f23060e;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return H0(byteBuffer, this.f23061f);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
