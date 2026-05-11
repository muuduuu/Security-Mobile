package io.sentry.vendor;

import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: io.sentry.vendor.a$a, reason: collision with other inner class name */
    static abstract class AbstractC0512a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f35575a;

        /* renamed from: b, reason: collision with root package name */
        public int f35576b;

        AbstractC0512a() {
        }
    }

    static class b extends AbstractC0512a {

        /* renamed from: j, reason: collision with root package name */
        private static final byte[] f35577j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k, reason: collision with root package name */
        private static final byte[] f35578k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f35579c;

        /* renamed from: d, reason: collision with root package name */
        int f35580d;

        /* renamed from: e, reason: collision with root package name */
        private int f35581e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f35582f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f35583g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f35584h;

        /* renamed from: i, reason: collision with root package name */
        private final byte[] f35585i;

        public b(int i10, byte[] bArr) {
            this.f35575a = bArr;
            this.f35582f = (i10 & 1) == 0;
            boolean z10 = (i10 & 2) == 0;
            this.f35583g = z10;
            this.f35584h = (i10 & 4) != 0;
            this.f35585i = (i10 & 8) == 0 ? f35577j : f35578k;
            this.f35579c = new byte[2];
            this.f35580d = 0;
            this.f35581e = z10 ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00e6 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 481
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.a.b.a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] a(byte[] bArr, int i10) {
        return b(bArr, 0, bArr.length, i10);
    }

    public static byte[] b(byte[] bArr, int i10, int i11, int i12) {
        b bVar = new b(i12, null);
        int i13 = (i11 / 3) * 4;
        if (!bVar.f35582f) {
            int i14 = i11 % 3;
            if (i14 == 1) {
                i13 += 2;
            } else if (i14 == 2) {
                i13 += 3;
            }
        } else if (i11 % 3 > 0) {
            i13 += 4;
        }
        if (bVar.f35583g && i11 > 0) {
            i13 += (((i11 - 1) / 57) + 1) * (bVar.f35584h ? 2 : 1);
        }
        bVar.f35575a = new byte[i13];
        bVar.a(bArr, i10, i11, true);
        return bVar.f35575a;
    }

    public static String c(byte[] bArr, int i10) {
        try {
            return new String(a(bArr, i10), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}
