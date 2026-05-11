package pe;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: pe.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3879g extends b0, ReadableByteChannel {
    byte[] B1(long j10);

    long C0();

    boolean D0(long j10, C3880h c3880h);

    String F0(long j10);

    String F1();

    short I1();

    long J1(Z z10);

    long L1();

    long O(C3880h c3880h);

    String R(long j10);

    void R0(C3877e c3877e, long j10);

    void S1(long j10);

    long W0(C3880h c3880h);

    C3877e X();

    C3880h Y(long j10);

    String Y0(Charset charset);

    long Z1();

    InputStream a2();

    int k1(P p10);

    C3877e m();

    byte[] n0();

    boolean n1(long j10);

    boolean p0();

    InterfaceC3879g peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j10);

    String u1();

    int w1();
}
