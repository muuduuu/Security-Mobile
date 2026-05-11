package com.github.penfeizhou.animation.gif.io;

import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.c;

/* loaded from: classes2.dex */
public class GifReader extends c {
    private static ThreadLocal<byte[]> __intBytes = new ThreadLocal<>();

    public GifReader(Reader reader) {
        super(reader);
    }

    private static byte[] ensureBytes() {
        byte[] bArr = __intBytes.get();
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[4];
        __intBytes.set(bArr2);
        return bArr2;
    }

    public int readUInt16() {
        byte[] ensureBytes = ensureBytes();
        read(ensureBytes, 0, 2);
        return ((ensureBytes[1] & 255) << 8) | (ensureBytes[0] & 255);
    }
}
