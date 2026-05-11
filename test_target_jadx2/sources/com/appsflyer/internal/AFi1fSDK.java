package com.appsflyer.internal;

import java.util.Map;

/* loaded from: classes.dex */
public class AFi1fSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    private static long afDebugLog;
    private static long afErrorLog;
    private static long afInfoLog;
    private static int afRDLog;
    private static byte[] afVerboseLog;
    private static int afWarnLog;

    /* renamed from: d, reason: collision with root package name */
    private static Object f20135d;

    /* renamed from: e, reason: collision with root package name */
    private static byte[] f20136e;
    private static int force;

    /* renamed from: i, reason: collision with root package name */
    private static byte[] f20137i;
    public static final Map registerClient;
    private static Object unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private static int f20138v;

    /* renamed from: w, reason: collision with root package name */
    public static final Map f20139w;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i10, int i11, short s10) {
        int i12;
        int i13;
        int i14;
        byte[] bArr;
        byte[] bArr2;
        int i15 = $12 + 35;
        $13 = i15 % 128;
        int i16 = -1;
        if (i15 % 2 == 0) {
            int i17 = i10 * 87;
            bArr2 = $$a;
            i12 = i11 + 6;
            i13 = s10 + 61;
            bArr = new byte[i17];
            i14 = i17 + 41;
        } else {
            byte[] bArr3 = $$a;
            i12 = i11 + 33;
            i13 = s10 + 4;
            byte[] bArr4 = new byte[49 - i10];
            i14 = 48 - i10;
            if (bArr3 == null) {
                bArr = bArr4;
                bArr2 = bArr3;
                int i18 = i14;
                int i19 = i14 + (-i13);
                i13 = i13;
                bArr2 = bArr2;
                i16 = -1;
                bArr = bArr;
                i12 = i19;
                i14 = i18;
            } else {
                bArr = bArr4;
                bArr2 = bArr3;
            }
        }
        while (true) {
            int i20 = i16 + 1;
            bArr[i20] = (byte) i12;
            if (i20 == i14) {
                break;
            }
            int i21 = i13 + 1;
            int i22 = i12;
            int i23 = i14;
            byte[] bArr5 = bArr2;
            byte[] bArr6 = bArr;
            int i24 = i22 + (-bArr2[i21]);
            i13 = i21;
            bArr2 = bArr5;
            i16 = i20;
            bArr = bArr6;
            i12 = i24;
            i14 = i23;
        }
        String str = new String(bArr, 0);
        int i25 = $13 + 115;
        $12 = i25 % 128;
        if (i25 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    static {
        /*
            Method dump skipped, instructions count: 7978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1fSDK.<clinit>():void");
    }

    private AFi1fSDK() {
    }

    public static int getCurrencyIso4217Code(int i10) {
        Object obj;
        int i11 = $11;
        int i12 = i11 + 97;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            obj = f20135d;
            int i13 = 11 / 0;
        } else {
            obj = f20135d;
        }
        $10 = ((i11 ^ 85) + ((i11 & 85) << 1)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i10)};
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c(bArr[27], bArr[82], (short) 563), true, (ClassLoader) unregisterClient).getMethod($$c(bArr[718], bArr[427], (short) 1167), Integer.TYPE).invoke(obj, objArr)).intValue();
            $10 = ($11 + 41) % 128;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object getMediationNetwork(char c10, int i10, int i11) {
        int i12 = $10;
        Object obj = f20135d;
        int i13 = ((i12 & 105) + (i12 | 105)) % 128;
        $11 = i13;
        $10 = ((i13 & 79) + (i13 | 79)) % 128;
        try {
            Object[] objArr = {Character.valueOf(c10), Integer.valueOf(i10), Integer.valueOf(i11)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c(bArr[27], bArr[82], (short) 563), true, (ClassLoader) unregisterClient);
            String $$c = $$c(bArr[506], bArr[427], (short) 1128);
            Class cls2 = Character.TYPE;
            Class cls3 = Integer.TYPE;
            return cls.getMethod($$c, cls2, cls3, cls3).invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void getRevenue(int i10, int i11) {
        int i12 = $10 + 49;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    static void init$0() {
        int i10;
        int i11 = $11;
        int i12 = (i11 & 11) + (i11 | 11);
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            byte[] bArr = new byte[1181];
            System.arraycopy(")\u009f5»ó\nò\u0003\u0006\u00056Çõ\u0011ñ\bÿ\u0006ðEëÔ\u0003ýýö÷\u0010ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ï\u000f\u000fùø\u0000ô\u0002?Íñ\u0000ý\rúó\u0014óó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ýî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001ó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\u0002ñ.Ýý\u0007ò/Û÷\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷\u0002ñ1âþû\u0003!Û÷Ë\u0003í\u00132Ë\u0003í\u00132\të\u00153ÅúAèÝý\u0007\të\u00153ÅúAº\u0007ý\fû÷\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000fø\u0002ñ$Þ\u0003ÿ\u000bóþûô\u000bÿ\u0006ü\u0002þû\u0003ó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\u000fùì\u0016ûú\u0002ó\u0017å\tõ\u000f\u0015ú\u0016ø\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001î\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô÷ýü\u000e\u0015ý\u0013øÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=ýú\u0004\u0000ÿ\u0003\u0002ùÖ+Ð1Ôû-\u0002Ô6\u0002ñ\"íò\u0004ú\u0003\u000fþ\të\u00153À\tñFÙ\u0003\u0006\u0002ñ$ïí\f\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ô\r\u0004ý\u001eÑ\t\u0000ó\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ôô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÛ:¿\u001f\u000fùô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÝ8Ï\u000f\u000fùø\u0000û\u0005Ý\u0012íï\u0011÷ù\u0010!ãí\u0013\b\u0002ù\r\u0004ý\u000eñ\"í\u0004ý\u0015á\u0002ó\u0015ü\u0014ø\u0005\tõ\u000f\u0002ñ.\u0002\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ýú\u000b\u000b\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ý\u000eý ßí\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fÿù\u0007ñ\u000f\u0002ñ1×\u000bî\u0000'Ý\u000eýÿó\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù'Ûþû\u0001!ß\u0002\r\u0004ô\u0002ñ&éí\u0004/×ú\u0002ù\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù+×ú\u0002ù\u0002ñ!êï\u0015\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0005-É\u0005\u000f$Ï\u0000\u0011è\të\u00153ÅúAë×ýü\u000e\u0004ÿö\u0007\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001ó\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿó\u0005\u0011ñ\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u000fí\f\u001cãöÿ\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001\u0002ñ1Ô\u0002ý\u0001\u0001\t÷ú Û\t\u000b\u0015ø\u0018øý\u000eý!×\u000bî\u0000ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ë\u0013\u000fù'\u00adÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ë3Ï\u0000/ú\u0005Ò\u0001)ÿ\bþûÒ4Î7\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0002ñ'è\u0001û\bí\u000bú\u0001 éñý\bý\u0007\u0002ñ1Î\u0003\u0000\r÷\u000bê0Ö\u0004;\u0002\u0001úôÔ\u000bÿ\u0002ñ\"íï\u0011÷ù\u0010".getBytes("ISO-8859-1"), 0, bArr, 0, 1181);
            $$a = bArr;
            i10 = 69;
        } else {
            byte[] bArr2 = new byte[1181];
            System.arraycopy(")\u009f5»ó\nò\u0003\u0006\u00056Çõ\u0011ñ\bÿ\u0006ðEëÔ\u0003ýýö÷\u0010ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ï\u000f\u000fùø\u0000ô\u0002?Íñ\u0000ý\rúó\u0014óó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ýî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001ó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\u0002ñ.Ýý\u0007ò/Û÷\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷\u0002ñ1âþû\u0003!Û÷Ë\u0003í\u00132Ë\u0003í\u00132\të\u00153ÅúAèÝý\u0007\të\u00153ÅúAº\u0007ý\fû÷\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000fø\u0002ñ$Þ\u0003ÿ\u000bóþûô\u000bÿ\u0006ü\u0002þû\u0003ó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\u000fùì\u0016ûú\u0002ó\u0017å\tõ\u000f\u0015ú\u0016ø\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001î\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô÷ýü\u000e\u0015ý\u0013øÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=ýú\u0004\u0000ÿ\u0003\u0002ùÖ+Ð1Ôû-\u0002Ô6\u0002ñ\"íò\u0004ú\u0003\u000fþ\të\u00153À\tñFÙ\u0003\u0006\u0002ñ$ïí\f\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ô\r\u0004ý\u001eÑ\t\u0000ó\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ôô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÛ:¿\u001f\u000fùô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÝ8Ï\u000f\u000fùø\u0000û\u0005Ý\u0012íï\u0011÷ù\u0010!ãí\u0013\b\u0002ù\r\u0004ý\u000eñ\"í\u0004ý\u0015á\u0002ó\u0015ü\u0014ø\u0005\tõ\u000f\u0002ñ.\u0002\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ýú\u000b\u000b\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ý\u000eý ßí\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fÿù\u0007ñ\u000f\u0002ñ1×\u000bî\u0000'Ý\u000eýÿó\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù'Ûþû\u0001!ß\u0002\r\u0004ô\u0002ñ&éí\u0004/×ú\u0002ù\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù+×ú\u0002ù\u0002ñ!êï\u0015\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0005-É\u0005\u000f$Ï\u0000\u0011è\të\u00153ÅúAë×ýü\u000e\u0004ÿö\u0007\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001ó\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿó\u0005\u0011ñ\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u000fí\f\u001cãöÿ\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001\u0002ñ1Ô\u0002ý\u0001\u0001\t÷ú Û\t\u000b\u0015ø\u0018øý\u000eý!×\u000bî\u0000ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ë\u0013\u000fù'\u00adÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ë3Ï\u0000/ú\u0005Ò\u0001)ÿ\bþûÒ4Î7\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0002ñ'è\u0001û\bí\u000bú\u0001 éñý\bý\u0007\u0002ñ1Î\u0003\u0000\r÷\u000bê0Ö\u0004;\u0002\u0001úôÔ\u000bÿ\u0002ñ\"íï\u0011÷ù\u0010".getBytes("ISO-8859-1"), 0, bArr2, 0, 1181);
            $$a = bArr2;
            i10 = 112;
        }
        $$b = i10;
    }

    public static int getCurrencyIso4217Code(Object obj) {
        Object obj2;
        int i10 = $11;
        int i11 = (i10 & 63) + (i10 | 63);
        int i12 = i11 % 128;
        $10 = i12;
        if (i11 % 2 != 0) {
            obj2 = f20135d;
            int i13 = 46 / 0;
        } else {
            obj2 = f20135d;
        }
        $11 = (i12 + 51) % 128;
        try {
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c(bArr[27], bArr[82], (short) 563), true, (ClassLoader) unregisterClient).getMethod($$c(bArr[452], bArr[427], (short) ($$b | 1034)), Object.class).invoke(obj2, obj)).intValue();
            $10 = ($11 + 9) % 128;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
