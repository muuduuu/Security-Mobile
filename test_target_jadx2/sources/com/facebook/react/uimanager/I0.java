package com.facebook.react.uimanager;

import c3.AbstractC1721a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* loaded from: classes.dex */
public abstract class I0 {

    /* renamed from: a, reason: collision with root package name */
    private static ThreadLocal f22162a = new a();

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public double[] initialValue() {
            return new double[16];
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22163a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f22163a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22163a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static double a(ReadableMap readableMap, String str) {
        double d10;
        boolean z10 = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z10 = false;
            }
            d10 = Float.parseFloat(string);
        } else {
            d10 = readableMap.getDouble(str);
        }
        return z10 ? d10 : Z.l(d10);
    }

    private static float[] b(float f10, float f11, ReadableArray readableArray, boolean z10) {
        if (readableArray == null) {
            return null;
        }
        if (f11 == 0.0f && f10 == 0.0f) {
            return null;
        }
        float f12 = f10 / 2.0f;
        float f13 = f11 / 2.0f;
        float[] fArr = new float[3];
        fArr[0] = f12;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        int i10 = 0;
        while (i10 < readableArray.size() && i10 < 3) {
            int i11 = b.f22163a[readableArray.getType(i10).ordinal()];
            if (i11 == 1) {
                fArr[i10] = (float) readableArray.getDouble(i10);
            } else if (i11 == 2 && z10) {
                String string = readableArray.getString(i10);
                if (string.endsWith("%")) {
                    fArr[i10] = ((i10 == 0 ? f10 : f11) * Float.parseFloat(string.substring(0, string.length() - 1))) / 100.0f;
                }
            }
            i10++;
        }
        return new float[]{(-f12) + fArr[0], (-f13) + fArr[1], fArr[2]};
    }

    private static double c(String str, double d10) {
        try {
            return str.endsWith("%") ? (Double.parseDouble(str.substring(0, str.length() - 1)) * d10) / 100.0d : Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            AbstractC1721a.J("ReactNative", "Invalid translate value: " + str);
            return 0.0d;
        }
    }

    public static void d(ReadableArray readableArray, double[] dArr) {
        e(readableArray, dArr, 0.0f, 0.0f, null, false);
    }

    public static void e(ReadableArray readableArray, double[] dArr, float f10, float f11, ReadableArray readableArray2, boolean z10) {
        int i10;
        int i11;
        int i12;
        double[] dArr2 = (double[]) f22162a.get();
        Z.r(dArr);
        float[] b10 = b(f10, f11, readableArray2, z10);
        int i13 = 1;
        if (b10 != null) {
            Z.r(dArr2);
            Z.j(dArr2, b10[0], b10[1], b10[2]);
            Z.p(dArr, dArr, dArr2);
        }
        int i14 = 16;
        if (readableArray.size() == 16 && readableArray.getType(0) == ReadableType.Number) {
            Z.r(dArr2);
            for (int i15 = 0; i15 < readableArray.size(); i15++) {
                dArr2[i15] = readableArray.getDouble(i15);
            }
            Z.p(dArr, dArr, dArr2);
        } else {
            int size = readableArray.size();
            int i16 = 0;
            while (i16 < size) {
                ReadableMap map = readableArray.getMap(i16);
                String nextKey = map.keySetIterator().nextKey();
                Z.r(dArr2);
                if ("matrix".equals(nextKey)) {
                    ReadableArray array = map.getArray(nextKey);
                    for (int i17 = 0; i17 < i14; i17++) {
                        dArr2[i17] = array.getDouble(i17);
                    }
                } else if ("perspective".equals(nextKey)) {
                    Z.a(dArr2, map.getDouble(nextKey));
                } else if ("rotateX".equals(nextKey)) {
                    Z.b(dArr2, a(map, nextKey));
                } else if ("rotateY".equals(nextKey)) {
                    Z.c(dArr2, a(map, nextKey));
                } else {
                    if ("rotate".equals(nextKey) || "rotateZ".equals(nextKey)) {
                        i10 = i16;
                        i11 = i14;
                        i12 = size;
                        Z.d(dArr2, a(map, nextKey));
                    } else if ("scale".equals(nextKey)) {
                        double d10 = map.getDouble(nextKey);
                        Z.e(dArr2, d10);
                        Z.f(dArr2, d10);
                    } else if ("scaleX".equals(nextKey)) {
                        Z.e(dArr2, map.getDouble(nextKey));
                    } else if ("scaleY".equals(nextKey)) {
                        Z.f(dArr2, map.getDouble(nextKey));
                    } else {
                        int i18 = size;
                        if ("translate".equals(nextKey)) {
                            ReadableArray array2 = map.getArray(nextKey);
                            ReadableType type = array2.getType(0);
                            ReadableType readableType = ReadableType.String;
                            double c10 = (type == readableType && z10) ? c(array2.getString(0), f10) : array2.getDouble(0);
                            i10 = i16;
                            double c11 = (array2.getType(i13) == readableType && z10) ? c(array2.getString(i13), f11) : array2.getDouble(i13);
                            i12 = i18;
                            i11 = 16;
                            Z.j(dArr2, c10, c11, array2.size() > 2 ? array2.getDouble(2) : 0.0d);
                        } else {
                            i10 = i16;
                            i12 = i18;
                            i11 = 16;
                            if ("translateX".equals(nextKey)) {
                                Z.i(dArr2, (map.getType(nextKey) == ReadableType.String && z10) ? c(map.getString(nextKey), f10) : map.getDouble(nextKey), 0.0d);
                            } else if ("translateY".equals(nextKey)) {
                                Z.i(dArr2, 0.0d, (map.getType(nextKey) == ReadableType.String && z10) ? c(map.getString(nextKey), f11) : map.getDouble(nextKey));
                            } else if ("skewX".equals(nextKey)) {
                                Z.g(dArr2, a(map, nextKey));
                            } else if ("skewY".equals(nextKey)) {
                                Z.h(dArr2, a(map, nextKey));
                            } else {
                                AbstractC1721a.J("ReactNative", "Unsupported transform type: " + nextKey);
                            }
                        }
                    }
                    Z.p(dArr, dArr, dArr2);
                    i16 = i10 + 1;
                    i14 = i11;
                    size = i12;
                    i13 = 1;
                }
                i10 = i16;
                i11 = i14;
                i12 = size;
                Z.p(dArr, dArr, dArr2);
                i16 = i10 + 1;
                i14 = i11;
                size = i12;
                i13 = 1;
            }
        }
        if (b10 != null) {
            Z.r(dArr2);
            Z.j(dArr2, -b10[0], -b10[1], -b10[2]);
            Z.p(dArr, dArr, dArr2);
        }
    }
}
