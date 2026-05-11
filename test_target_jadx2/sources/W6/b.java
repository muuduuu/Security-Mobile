package W6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class b {

    public static class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(String str, Parcel parcel) {
            super(r2.toString());
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(dataPosition).length() + 6 + String.valueOf(dataSize).length());
            sb2.append(str);
            sb2.append(" Parcel: pos=");
            sb2.append(dataPosition);
            sb2.append(" size=");
            sb2.append(dataSize);
        }
    }

    public static int A(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void B(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + A(parcel, i10));
    }

    public static int C(Parcel parcel) {
        int t10 = t(parcel);
        int A10 = A(parcel, t10);
        int m10 = m(t10);
        int dataPosition = parcel.dataPosition();
        if (m10 != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(t10))), parcel);
        }
        int i10 = A10 + dataPosition;
        if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i10).length());
        sb2.append("Size read is invalid start=");
        sb2.append(dataPosition);
        sb2.append(" end=");
        sb2.append(i10);
        throw new a(sb2.toString(), parcel);
    }

    private static void D(Parcel parcel, int i10, int i11) {
        int A10 = A(parcel, i10);
        if (A10 == i11) {
            return;
        }
        String hexString = Integer.toHexString(A10);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(A10).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(A10);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new a(sb2.toString(), parcel);
    }

    private static void E(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        String hexString = Integer.toHexString(i11);
        int length = String.valueOf(i12).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(i11).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i12);
        sb2.append(" got ");
        sb2.append(i11);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new a(sb2.toString(), parcel);
    }

    public static Bundle a(Parcel parcel, int i10) {
        int A10 = A(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (A10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + A10);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int A10 = A(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (A10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + A10);
        return createByteArray;
    }

    public static byte[][] c(Parcel parcel, int i10) {
        int A10 = A(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (A10 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i11 = 0; i11 < readInt; i11++) {
            bArr[i11] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + A10);
        return bArr;
    }

    public static int[] d(Parcel parcel, int i10) {
        int A10 = A(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (A10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + A10);
        return createIntArray;
    }

    public static ArrayList e(Parcel parcel, int i10) {
        int A10 = A(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (A10 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + A10);
        return arrayList;
    }

    public static Parcelable f(Parcel parcel, int i10, Parcelable.Creator creator) {
        int A10 = A(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (A10 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + A10);
        return parcelable;
    }

    public static String g(Parcel parcel, int i10) {
        int A10 = A(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (A10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + A10);
        return readString;
    }

    public static String[] h(Parcel parcel, int i10) {
        int A10 = A(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (A10 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + A10);
        return createStringArray;
    }

    public static ArrayList i(Parcel parcel, int i10) {
        int A10 = A(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (A10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + A10);
        return createStringArrayList;
    }

    public static Object[] j(Parcel parcel, int i10, Parcelable.Creator creator) {
        int A10 = A(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (A10 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + A10);
        return createTypedArray;
    }

    public static ArrayList k(Parcel parcel, int i10, Parcelable.Creator creator) {
        int A10 = A(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (A10 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + A10);
        return createTypedArrayList;
    }

    public static void l(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Overread allowed size end=");
        sb2.append(i10);
        throw new a(sb2.toString(), parcel);
    }

    public static int m(int i10) {
        return (char) i10;
    }

    public static boolean n(Parcel parcel, int i10) {
        D(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean o(Parcel parcel, int i10) {
        int A10 = A(parcel, i10);
        if (A10 == 0) {
            return null;
        }
        E(parcel, i10, A10, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double p(Parcel parcel, int i10) {
        D(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static Double q(Parcel parcel, int i10) {
        int A10 = A(parcel, i10);
        if (A10 == 0) {
            return null;
        }
        E(parcel, i10, A10, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float r(Parcel parcel, int i10) {
        D(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float s(Parcel parcel, int i10) {
        int A10 = A(parcel, i10);
        if (A10 == 0) {
            return null;
        }
        E(parcel, i10, A10, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int t(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder u(Parcel parcel, int i10) {
        int A10 = A(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (A10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + A10);
        return readStrongBinder;
    }

    public static int v(Parcel parcel, int i10) {
        D(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer w(Parcel parcel, int i10) {
        int A10 = A(parcel, i10);
        if (A10 == 0) {
            return null;
        }
        E(parcel, i10, A10, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long x(Parcel parcel, int i10) {
        D(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long y(Parcel parcel, int i10) {
        int A10 = A(parcel, i10);
        if (A10 == 0) {
            return null;
        }
        E(parcel, i10, A10, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short z(Parcel parcel, int i10) {
        D(parcel, i10, 4);
        return (short) parcel.readInt();
    }
}
