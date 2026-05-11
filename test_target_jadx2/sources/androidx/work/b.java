package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import x1.n;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f18142b = n.i("Data");

    /* renamed from: c, reason: collision with root package name */
    public static final b f18143c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    Map f18144a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Map f18145a = new HashMap();

        public b a() {
            b bVar = new b(this.f18145a);
            b.l(bVar);
            return bVar;
        }

        public a b(String str, Object obj) {
            if (obj == null) {
                this.f18145a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f18145a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f18145a.put(str, b.a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f18145a.put(str, b.b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f18145a.put(str, b.e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f18145a.put(str, b.f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f18145a.put(str, b.d((float[]) obj));
                } else {
                    if (cls != double[].class) {
                        throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                    }
                    this.f18145a.put(str, b.c((double[]) obj));
                }
            }
            return this;
        }

        public a c(b bVar) {
            d(bVar.f18144a);
            return this;
        }

        public a d(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                b((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        public a e(String str, String str2) {
            this.f18145a.put(str, str2);
            return this;
        }
    }

    public b(b bVar) {
        this.f18144a = new HashMap(bVar.f18144a);
    }

    public static Boolean[] a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i10 = 0; i10 < zArr.length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    public static Byte[] b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    public static Double[] c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    public static Float[] d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    public static Integer[] e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    public static Long[] f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0040 -> B:16:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b g(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable e10;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap hashMap = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e11) {
                Log.e(f18142b, "Error in Data#fromByteArray: ", e11);
            }
            try {
                for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                    hashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                }
                try {
                    objectInputStream.close();
                } catch (IOException e12) {
                    Log.e(f18142b, "Error in Data#fromByteArray: ", e12);
                }
                byteArrayInputStream.close();
            } catch (IOException e13) {
                e10 = e13;
                Log.e(f18142b, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (IOException e14) {
                        Log.e(f18142b, "Error in Data#fromByteArray: ", e14);
                    }
                }
                byteArrayInputStream.close();
                return new b(hashMap);
            } catch (ClassNotFoundException e15) {
                e10 = e15;
                Log.e(f18142b, "Error in Data#fromByteArray: ", e10);
                if (objectInputStream != null) {
                }
                byteArrayInputStream.close();
                return new b(hashMap);
            }
        } catch (IOException e16) {
            e = e16;
            Throwable th2 = e;
            objectInputStream = null;
            e10 = th2;
            Log.e(f18142b, "Error in Data#fromByteArray: ", e10);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new b(hashMap);
        } catch (ClassNotFoundException e17) {
            e = e17;
            Throwable th22 = e;
            objectInputStream = null;
            e10 = th22;
            Log.e(f18142b, "Error in Data#fromByteArray: ", e10);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new b(hashMap);
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                try {
                    objectInputStream2.close();
                } catch (IOException e18) {
                    Log.e(f18142b, "Error in Data#fromByteArray: ", e18);
                }
            }
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (IOException e19) {
                Log.e(f18142b, "Error in Data#fromByteArray: ", e19);
                throw th;
            }
        }
        return new b(hashMap);
    }

    public static byte[] l(b bVar) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            objectOutputStream.writeInt(bVar.k());
            for (Map.Entry entry : bVar.f18144a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e11) {
                Log.e(f18142b, "Error in Data#toByteArray: ", e11);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e12) {
                Log.e(f18142b, "Error in Data#toByteArray: ", e12);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e13) {
            e = e13;
            objectOutputStream2 = objectOutputStream;
            Log.e(f18142b, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e14) {
                    Log.e(f18142b, "Error in Data#toByteArray: ", e14);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e15) {
                Log.e(f18142b, "Error in Data#toByteArray: ", e15);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e16) {
                    Log.e(f18142b, "Error in Data#toByteArray: ", e16);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e17) {
                Log.e(f18142b, "Error in Data#toByteArray: ", e17);
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        Set<String> keySet = this.f18144a.keySet();
        if (!keySet.equals(bVar.f18144a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f18144a.get(str);
            Object obj3 = bVar.f18144a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public boolean h(String str, boolean z10) {
        Object obj = this.f18144a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    public int hashCode() {
        return this.f18144a.hashCode() * 31;
    }

    public Map i() {
        return Collections.unmodifiableMap(this.f18144a);
    }

    public String j(String str) {
        Object obj = this.f18144a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public int k() {
        return this.f18144a.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f18144a.isEmpty()) {
            for (String str : this.f18144a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f18144a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    public b(Map map) {
        this.f18144a = new HashMap(map);
    }
}
