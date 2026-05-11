package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private File f23053a;

    /* renamed from: b, reason: collision with root package name */
    private FileInputStream f23054b;

    /* renamed from: c, reason: collision with root package name */
    private FileChannel f23055c;

    public i(File file) {
        this.f23053a = file;
        a();
    }

    @Override // com.facebook.soloader.h
    public int H0(ByteBuffer byteBuffer, long j10) {
        return this.f23055c.read(byteBuffer, j10);
    }

    public void a() {
        FileInputStream fileInputStream = new FileInputStream(this.f23053a);
        this.f23054b = fileInputStream;
        this.f23055c = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23054b.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f23055c.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return this.f23055c.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        return this.f23055c.write(byteBuffer);
    }
}
