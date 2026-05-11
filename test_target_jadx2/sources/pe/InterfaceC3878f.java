package pe;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* renamed from: pe.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3878f extends Z, WritableByteChannel {
    InterfaceC3878f B0();

    InterfaceC3878f G1(byte[] bArr);

    InterfaceC3878f Q1(C3880h c3880h);

    InterfaceC3878f T0(String str);

    InterfaceC3878f V1(long j10);

    OutputStream X1();

    InterfaceC3878f e0();

    InterfaceC3878f e1(String str, int i10, int i11);

    InterfaceC3878f f0(int i10);

    @Override // pe.Z, java.io.Flushable
    void flush();

    InterfaceC3878f g0(int i10);

    InterfaceC3878f h1(long j10);

    InterfaceC3878f l0(int i10);

    C3877e m();

    InterfaceC3878f q0(int i10);

    long s0(b0 b0Var);

    InterfaceC3878f write(byte[] bArr, int i10, int i11);
}
