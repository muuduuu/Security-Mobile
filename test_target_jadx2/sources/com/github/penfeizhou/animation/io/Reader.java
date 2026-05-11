package com.github.penfeizhou.animation.io;

import java.io.InputStream;

/* loaded from: classes2.dex */
public interface Reader {
    int available();

    void close();

    byte peek();

    int position();

    int read(byte[] bArr, int i10, int i11);

    void reset();

    long skip(long j10);

    InputStream toInputStream();
}
