package org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes3.dex */
public class IvParameters extends AlgorithmParametersSpi {
    private byte[] iv;

    public static class AES extends IvParameters {
    }

    public static class ChaCha20 extends IvParameters {
    }

    public static class DESEDE extends IvParameters {
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        long j10 = 0;
        try {
            try {
                j10 = NativeCrypto.asn1_write_init();
                NativeCrypto.asn1_write_octetstring(j10, this.iv);
                return NativeCrypto.asn1_write_finish(j10);
            } catch (IOException e10) {
                NativeCrypto.asn1_write_cleanup(j10);
                throw e10;
            }
        } finally {
            NativeCrypto.asn1_write_free(j10);
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) {
        if (cls == IvParameterSpec.class) {
            return new IvParameterSpec(this.iv);
        }
        throw new InvalidParameterSpecException("Incompatible AlgorithmParametersSpec class: " + cls);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
            throw new InvalidParameterSpecException("Only IvParameterSpec is supported");
        }
        this.iv = (byte[]) ((IvParameterSpec) algorithmParameterSpec).getIV().clone();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "Conscrypt IV AlgorithmParameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        long j10;
        try {
            j10 = NativeCrypto.asn1_read_init(bArr);
            try {
                byte[] asn1_read_octetstring = NativeCrypto.asn1_read_octetstring(j10);
                if (NativeCrypto.asn1_read_is_empty(j10)) {
                    this.iv = asn1_read_octetstring;
                    NativeCrypto.asn1_read_free(j10);
                    return;
                }
                throw new IOException("Error reading ASN.1 encoding");
            } catch (Throwable th) {
                th = th;
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
            if (str.equals("RAW")) {
                return (byte[]) this.iv.clone();
            }
            throw new IOException("Unsupported format: " + str);
        }
        return engineGetEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) {
        if (str != null && !str.equals("ASN.1")) {
            if (str.equals("RAW")) {
                this.iv = (byte[]) bArr.clone();
                return;
            }
            throw new IOException("Unsupported format: " + str);
        }
        engineInit(bArr);
    }
}
