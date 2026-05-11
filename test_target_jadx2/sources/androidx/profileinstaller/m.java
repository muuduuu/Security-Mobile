package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
abstract class m {

    /* renamed from: a, reason: collision with root package name */
    static final byte[] f17242a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    static final byte[] f17243b = {112, 114, 109, 0};

    private static void A(InputStream inputStream) {
        e.h(inputStream);
        int j10 = e.j(inputStream);
        if (j10 == 6 || j10 == 7) {
            return;
        }
        while (j10 > 0) {
            e.j(inputStream);
            for (int j11 = e.j(inputStream); j11 > 0; j11--) {
                e.h(inputStream);
            }
            j10--;
        }
    }

    static boolean B(OutputStream outputStream, byte[] bArr, d[] dVarArr) {
        if (Arrays.equals(bArr, o.f17254a)) {
            N(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, o.f17255b)) {
            M(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, o.f17257d)) {
            K(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, o.f17256c)) {
            L(outputStream, dVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, o.f17258e)) {
            return false;
        }
        J(outputStream, dVarArr);
        return true;
    }

    private static void C(OutputStream outputStream, d dVar) {
        int[] iArr = dVar.f17230h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            e.p(outputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
    }

    private static p D(d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e.p(byteArrayOutputStream, dVarArr.length);
            int i10 = 2;
            for (d dVar : dVarArr) {
                e.q(byteArrayOutputStream, dVar.f17225c);
                e.q(byteArrayOutputStream, dVar.f17226d);
                e.q(byteArrayOutputStream, dVar.f17229g);
                String j10 = j(dVar.f17223a, dVar.f17224b, o.f17254a);
                int k10 = e.k(j10);
                e.p(byteArrayOutputStream, k10);
                i10 = i10 + 14 + k10;
                e.n(byteArrayOutputStream, j10);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                p pVar = new p(f.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return pVar;
            }
            throw e.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static void E(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f17242a);
        outputStream.write(bArr);
    }

    private static void F(OutputStream outputStream, d dVar) {
        I(outputStream, dVar);
        C(outputStream, dVar);
        H(outputStream, dVar);
    }

    private static void G(OutputStream outputStream, d dVar, String str) {
        e.p(outputStream, e.k(str));
        e.p(outputStream, dVar.f17227e);
        e.q(outputStream, dVar.f17228f);
        e.q(outputStream, dVar.f17225c);
        e.q(outputStream, dVar.f17229g);
        e.n(outputStream, str);
    }

    private static void H(OutputStream outputStream, d dVar) {
        byte[] bArr = new byte[k(dVar.f17229g)];
        for (Map.Entry entry : dVar.f17231i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, dVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, dVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(OutputStream outputStream, d dVar) {
        int i10 = 0;
        for (Map.Entry entry : dVar.f17231i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                e.p(outputStream, intValue - i10);
                e.p(outputStream, 0);
                i10 = intValue;
            }
        }
    }

    private static void J(OutputStream outputStream, d[] dVarArr) {
        e.p(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            String j10 = j(dVar.f17223a, dVar.f17224b, o.f17258e);
            e.p(outputStream, e.k(j10));
            e.p(outputStream, dVar.f17231i.size());
            e.p(outputStream, dVar.f17230h.length);
            e.q(outputStream, dVar.f17225c);
            e.n(outputStream, j10);
            Iterator it = dVar.f17231i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i10 : dVar.f17230h) {
                e.p(outputStream, i10);
            }
        }
    }

    private static void K(OutputStream outputStream, d[] dVarArr) {
        e.r(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            int size = dVar.f17231i.size() * 4;
            String j10 = j(dVar.f17223a, dVar.f17224b, o.f17257d);
            e.p(outputStream, e.k(j10));
            e.p(outputStream, dVar.f17230h.length);
            e.q(outputStream, size);
            e.q(outputStream, dVar.f17225c);
            e.n(outputStream, j10);
            Iterator it = dVar.f17231i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, ((Integer) it.next()).intValue());
                e.p(outputStream, 0);
            }
            for (int i10 : dVar.f17230h) {
                e.p(outputStream, i10);
            }
        }
    }

    private static void L(OutputStream outputStream, d[] dVarArr) {
        byte[] b10 = b(dVarArr, o.f17256c);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b10);
    }

    private static void M(OutputStream outputStream, d[] dVarArr) {
        byte[] b10 = b(dVarArr, o.f17255b);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b10);
    }

    private static void N(OutputStream outputStream, d[] dVarArr) {
        O(outputStream, dVarArr);
    }

    private static void O(OutputStream outputStream, d[] dVarArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(dVarArr));
        arrayList.add(c(dVarArr));
        arrayList.add(d(dVarArr));
        long length2 = o.f17254a.length + f17242a.length + 4 + (arrayList.size() * 16);
        e.q(outputStream, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            p pVar = (p) arrayList.get(i10);
            e.q(outputStream, pVar.f17261a.getValue());
            e.q(outputStream, length2);
            if (pVar.f17264d) {
                byte[] bArr = pVar.f17263c;
                long length3 = bArr.length;
                byte[] b10 = e.b(bArr);
                arrayList2.add(b10);
                e.q(outputStream, b10.length);
                e.q(outputStream, length3);
                length = b10.length;
            } else {
                arrayList2.add(pVar.f17263c);
                e.q(outputStream, pVar.f17263c.length);
                e.q(outputStream, 0L);
                length = pVar.f17263c.length;
            }
            length2 += length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    private static int a(d dVar) {
        Iterator it = dVar.f17231i.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return i10;
    }

    private static byte[] b(d[] dVarArr, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (d dVar : dVarArr) {
            i11 += e.k(j(dVar.f17223a, dVar.f17224b, bArr)) + 16 + (dVar.f17227e * 2) + dVar.f17228f + k(dVar.f17229g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, o.f17256c)) {
            int length = dVarArr.length;
            while (i10 < length) {
                d dVar2 = dVarArr[i10];
                G(byteArrayOutputStream, dVar2, j(dVar2.f17223a, dVar2.f17224b, bArr));
                F(byteArrayOutputStream, dVar2);
                i10++;
            }
        } else {
            for (d dVar3 : dVarArr) {
                G(byteArrayOutputStream, dVar3, j(dVar3.f17223a, dVar3.f17224b, bArr));
            }
            int length2 = dVarArr.length;
            while (i10 < length2) {
                F(byteArrayOutputStream, dVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw e.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    private static p c(d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < dVarArr.length; i11++) {
            try {
                d dVar = dVarArr[i11];
                e.p(byteArrayOutputStream, i11);
                e.p(byteArrayOutputStream, dVar.f17227e);
                i10 = i10 + 4 + (dVar.f17227e * 2);
                C(byteArrayOutputStream, dVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            p pVar = new p(f.CLASSES, i10, byteArray, true);
            byteArrayOutputStream.close();
            return pVar;
        }
        throw e.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    private static p d(d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < dVarArr.length; i11++) {
            try {
                d dVar = dVarArr[i11];
                int a10 = a(dVar);
                byte[] e10 = e(dVar);
                byte[] f10 = f(dVar);
                e.p(byteArrayOutputStream, i11);
                int length = e10.length + 2 + f10.length;
                e.q(byteArrayOutputStream, length);
                e.p(byteArrayOutputStream, a10);
                byteArrayOutputStream.write(e10);
                byteArrayOutputStream.write(f10);
                i10 = i10 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            p pVar = new p(f.METHODS, i10, byteArray, true);
            byteArrayOutputStream.close();
            return pVar;
        }
        throw e.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    private static d i(d[] dVarArr, String str) {
        if (dVarArr.length <= 0) {
            return null;
        }
        String h10 = h(str);
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            if (dVarArr[i10].f17224b.equals(h10)) {
                return dVarArr[i10];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String a10 = o.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a10);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, a10);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + o.a(bArr) + str2;
    }

    private static int k(int i10) {
        return y(i10 * 2) / 8;
    }

    private static int l(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw e.c("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw e.c("Unexpected flag: " + i10);
    }

    private static int[] m(InputStream inputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += e.h(inputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    private static int n(BitSet bitSet, int i10, int i11) {
        int i12 = bitSet.get(l(2, i10, i11)) ? 2 : 0;
        return bitSet.get(l(4, i10, i11)) ? i12 | 4 : i12;
    }

    static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, e.d(inputStream, bArr.length))) {
            return e.d(inputStream, o.f17255b.length);
        }
        throw e.c("Invalid magic");
    }

    private static void p(InputStream inputStream, d dVar) {
        int available = inputStream.available() - dVar.f17228f;
        int i10 = 0;
        while (inputStream.available() > available) {
            i10 += e.h(inputStream);
            dVar.f17231i.put(Integer.valueOf(i10), 1);
            for (int h10 = e.h(inputStream); h10 > 0; h10--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw e.c("Read too much data during profile line parse");
        }
    }

    static d[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, d[] dVarArr) {
        if (Arrays.equals(bArr, o.f17259f)) {
            if (Arrays.equals(o.f17254a, bArr2)) {
                throw e.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, dVarArr);
        }
        if (Arrays.equals(bArr, o.f17260g)) {
            return t(inputStream, bArr2, dVarArr);
        }
        throw e.c("Unsupported meta version");
    }

    static d[] r(InputStream inputStream, byte[] bArr, d[] dVarArr) {
        if (!Arrays.equals(bArr, o.f17259f)) {
            throw e.c("Unsupported meta version");
        }
        int j10 = e.j(inputStream);
        byte[] e10 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
        try {
            d[] s10 = s(byteArrayInputStream, j10, dVarArr);
            byteArrayInputStream.close();
            return s10;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static d[] s(InputStream inputStream, int i10, d[] dVarArr) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i10 != dVarArr.length) {
            throw e.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int h10 = e.h(inputStream);
            iArr[i11] = e.h(inputStream);
            strArr[i11] = e.f(inputStream, h10);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            d dVar = dVarArr[i12];
            if (!dVar.f17224b.equals(strArr[i12])) {
                throw e.c("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            dVar.f17227e = i13;
            dVar.f17230h = m(inputStream, i13);
        }
        return dVarArr;
    }

    static d[] t(InputStream inputStream, byte[] bArr, d[] dVarArr) {
        int h10 = e.h(inputStream);
        byte[] e10 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
        try {
            d[] u10 = u(byteArrayInputStream, bArr, h10, dVarArr);
            byteArrayInputStream.close();
            return u10;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static d[] u(InputStream inputStream, byte[] bArr, int i10, d[] dVarArr) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i10 != dVarArr.length) {
            throw e.c("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            e.h(inputStream);
            String f10 = e.f(inputStream, e.h(inputStream));
            long i12 = e.i(inputStream);
            int h10 = e.h(inputStream);
            d i13 = i(dVarArr, f10);
            if (i13 == null) {
                throw e.c("Missing profile key: " + f10);
            }
            i13.f17226d = i12;
            int[] m10 = m(inputStream, h10);
            if (Arrays.equals(bArr, o.f17258e)) {
                i13.f17227e = h10;
                i13.f17230h = m10;
            }
        }
        return dVarArr;
    }

    private static void v(InputStream inputStream, d dVar) {
        BitSet valueOf = BitSet.valueOf(e.d(inputStream, e.a(dVar.f17229g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = dVar.f17229g;
            if (i10 >= i11) {
                return;
            }
            int n10 = n(valueOf, i10, i11);
            if (n10 != 0) {
                Integer num = (Integer) dVar.f17231i.get(Integer.valueOf(i10));
                if (num == null) {
                    num = 0;
                }
                dVar.f17231i.put(Integer.valueOf(i10), Integer.valueOf(n10 | num.intValue()));
            }
            i10++;
        }
    }

    static d[] w(InputStream inputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, o.f17255b)) {
            throw e.c("Unsupported version");
        }
        int j10 = e.j(inputStream);
        byte[] e10 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
        try {
            d[] x10 = x(byteArrayInputStream, str, j10);
            byteArrayInputStream.close();
            return x10;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static d[] x(InputStream inputStream, String str, int i10) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        d[] dVarArr = new d[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int h10 = e.h(inputStream);
            int h11 = e.h(inputStream);
            dVarArr[i11] = new d(str, e.f(inputStream, h10), e.i(inputStream), 0L, h11, (int) e.i(inputStream), (int) e.i(inputStream), new int[h11], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            d dVar = dVarArr[i12];
            p(inputStream, dVar);
            dVar.f17230h = m(inputStream, dVar.f17227e);
            v(inputStream, dVar);
        }
        return dVarArr;
    }

    private static int y(int i10) {
        return (i10 + 7) & (-8);
    }

    private static void z(byte[] bArr, int i10, int i11, d dVar) {
        int l10 = l(i10, i11, dVar.f17229g);
        int i12 = l10 / 8;
        bArr[i12] = (byte) ((1 << (l10 % 8)) | bArr[i12]);
    }
}
