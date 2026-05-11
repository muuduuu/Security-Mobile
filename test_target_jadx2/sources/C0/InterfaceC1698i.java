package c0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: c0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1698i extends AutoCloseable {
    long C1();

    MediaCodec.BufferInfo E0();

    boolean M0();

    @Override // java.lang.AutoCloseable
    void close();

    ByteBuffer h();

    long size();
}
