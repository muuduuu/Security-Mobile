package org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* loaded from: classes3.dex */
public final class GCMParameters extends AlgorithmParametersSpi {
    private static final int DEFAULT_TLEN = 96;
    private byte[] iv;
    private int tLen;

    public GCMParameters() {
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        long j10;
        long j11;
        long j12 = 0;
        try {
            j10 = NativeCrypto.asn1_write_init();
        } catch (IOException e10) {
            e = e10;
            j11 = 0;
        } catch (Throwable th) {
            th = th;
            j10 = 0;
        }
        try {
            j12 = NativeCrypto.asn1_write_sequence(j10);
            NativeCrypto.asn1_write_octetstring(j12, this.iv);
            if (this.tLen != DEFAULT_TLEN) {
                NativeCrypto.asn1_write_uint64(j12, r4 / 8);
            }
            byte[] asn1_write_finish = NativeCrypto.asn1_write_finish(j10);
            NativeCrypto.asn1_write_free(j12);
            NativeCrypto.asn1_write_free(j10);
            return asn1_write_finish;
        } catch (IOException e11) {
            e = e11;
            long j13 = j12;
            j12 = j10;
            j11 = j13;
            try {
                NativeCrypto.asn1_write_cleanup(j12);
                throw e;
            } catch (Throwable th2) {
                th = th2;
                long j14 = j12;
                j12 = j11;
                j10 = j14;
                NativeCrypto.asn1_write_free(j12);
                NativeCrypto.asn1_write_free(j10);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            NativeCrypto.asn1_write_free(j12);
            NativeCrypto.asn1_write_free(j10);
            throw th;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) {
        if (cls != null && cls.getName().equals("javax.crypto.spec.GCMParameterSpec")) {
            return cls.cast(Platform.toGCMParameterSpec(this.tLen, this.iv));
        }
        throw new InvalidParameterSpecException("Unsupported class: " + cls);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        GCMParameters fromGCMParameterSpec = Platform.fromGCMParameterSpec(algorithmParameterSpec);
        if (fromGCMParameterSpec == null) {
            throw new InvalidParameterSpecException("Only GCMParameterSpec is supported");
        }
        this.tLen = fromGCMParameterSpec.tLen;
        this.iv = fromGCMParameterSpec.iv;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "Conscrypt GCM AlgorithmParameters";
    }

    byte[] getIV() {
        return this.iv;
    }

    int getTLen() {
        return this.tLen;
    }

    GCMParameters(int i10, byte[] bArr) {
        this.tLen = i10;
        this.iv = bArr;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        long j10;
        try {
            j10 = NativeCrypto.asn1_read_init(bArr);
            try {
                long asn1_read_sequence = NativeCrypto.asn1_read_sequence(j10);
                byte[] asn1_read_octetstring = NativeCrypto.asn1_read_octetstring(asn1_read_sequence);
                int asn1_read_uint64 = !NativeCrypto.asn1_read_is_empty(asn1_read_sequence) ? ((int) NativeCrypto.asn1_read_uint64(asn1_read_sequence)) * 8 : DEFAULT_TLEN;
                if (NativeCrypto.asn1_read_is_empty(asn1_read_sequence) && NativeCrypto.asn1_read_is_empty(j10)) {
                    this.iv = asn1_read_octetstring;
                    this.tLen = asn1_read_uint64;
                    NativeCrypto.asn1_read_free(asn1_read_sequence);
                    NativeCrypto.asn1_read_free(j10);
                    return;
                }
                throw new IOException("Error reading ASN.1 encoding");
            } catch (Throwable th) {
                th = th;
                NativeCrypto.asn1_read_free(0L);
                NativeCrypto.asn1_read_free(j10);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j10 = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (str != null && !str.equals("ASN.1")) {
            throw new IOException("Unsupported format: " + str);
        }
        return engineGetEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) {
        if (str != null && !str.equals("ASN.1")) {
            throw new IOException("Unsupported format: " + str);
        }
        engineInit(bArr);
    }
}
