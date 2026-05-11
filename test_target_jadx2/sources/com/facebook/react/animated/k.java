package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qc.AbstractC3958a;

/* loaded from: classes.dex */
public final class k extends x {

    /* renamed from: q, reason: collision with root package name */
    public static final a f21303q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f21304r;

    /* renamed from: i, reason: collision with root package name */
    private final double[] f21305i;

    /* renamed from: j, reason: collision with root package name */
    private Object f21306j;

    /* renamed from: k, reason: collision with root package name */
    private b f21307k;

    /* renamed from: l, reason: collision with root package name */
    private String f21308l;

    /* renamed from: m, reason: collision with root package name */
    private final String f21309m;

    /* renamed from: n, reason: collision with root package name */
    private final String f21310n;

    /* renamed from: o, reason: collision with root package name */
    private x f21311o;

    /* renamed from: p, reason: collision with root package name */
    private Object f21312p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int d(double d10, double[] dArr) {
            int i10 = 1;
            while (i10 < dArr.length - 1 && dArr[i10] < d10) {
                i10++;
            }
            return i10 - 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final double[] e(ReadableArray readableArray) {
            if (readableArray == null) {
                return new double[0];
            }
            int size = readableArray.size();
            double[] dArr = new double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = readableArray.getDouble(i10);
            }
            return dArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int[] f(ReadableArray readableArray) {
            if (readableArray == null) {
                return new int[0];
            }
            int size = readableArray.size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = readableArray.getInt(i10);
            }
            return iArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final double[][] g(ReadableArray readableArray) {
            int size = readableArray.size();
            double[][] dArr = new double[size][];
            Matcher matcher = k.f21304r.matcher(readableArray.getString(0));
            ArrayList arrayList = new ArrayList();
            while (matcher.find()) {
                String group = matcher.group();
                Intrinsics.checkNotNullExpressionValue(group, "group(...)");
                arrayList.add(Double.valueOf(Double.parseDouble(group)));
            }
            int size2 = arrayList.size();
            double[] dArr2 = new double[size2];
            int size3 = arrayList.size();
            for (int i10 = 0; i10 < size3; i10++) {
                dArr2[i10] = ((Number) arrayList.get(i10)).doubleValue();
            }
            dArr[0] = dArr2;
            for (int i11 = 1; i11 < size; i11++) {
                double[] dArr3 = new double[size2];
                Matcher matcher2 = k.f21304r.matcher(readableArray.getString(i11));
                for (int i12 = 0; matcher2.find() && i12 < size2; i12++) {
                    String group2 = matcher2.group();
                    Intrinsics.checkNotNullExpressionValue(group2, "group(...)");
                    dArr3[i12] = Double.parseDouble(group2);
                }
                dArr[i11] = dArr3;
            }
            return dArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
        
            if (r24.equals("extend") != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0038, code lost:
        
            if (r23.equals("extend") != false) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final double h(double d10, double d11, double d12, double d13, double d14, String str, String str2) {
            double d15;
            if (d10 < d11) {
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1289044198) {
                        if (hashCode != -135761730) {
                            if (hashCode == 94742715 && str.equals("clamp")) {
                                d15 = d11;
                                if (d15 > d12) {
                                    if (str2 != null) {
                                        int hashCode2 = str2.hashCode();
                                        if (hashCode2 != -1289044198) {
                                            if (hashCode2 != -135761730) {
                                                if (hashCode2 == 94742715 && str2.equals("clamp")) {
                                                    d15 = d12;
                                                }
                                            } else if (str2.equals("identity")) {
                                                return d15;
                                            }
                                        }
                                    }
                                    throw new JSApplicationIllegalArgumentException("Invalid extrapolation type " + str2 + "for right extrapolation");
                                }
                                return d13 != d14 ? d13 : d11 == d12 ? d10 <= d11 ? d13 : d14 : d13 + (((d14 - d13) * (d15 - d11)) / (d12 - d11));
                            }
                        } else if (str.equals("identity")) {
                            return d10;
                        }
                    }
                }
                throw new JSApplicationIllegalArgumentException("Invalid extrapolation type " + str + "for left extrapolation");
            }
            d15 = d10;
            if (d15 > d12) {
            }
            if (d13 != d14) {
            }
        }

        public final double i(double d10, double[] inputRange, double[] outputRange, String str, String str2) {
            Intrinsics.checkNotNullParameter(inputRange, "inputRange");
            Intrinsics.checkNotNullParameter(outputRange, "outputRange");
            int d11 = d(d10, inputRange);
            int i10 = d11 + 1;
            return h(d10, inputRange[d11], inputRange[i10], outputRange[d11], outputRange[i10], str, str2);
        }

        public final int j(double d10, double[] inputRange, int[] outputRange) {
            Intrinsics.checkNotNullParameter(inputRange, "inputRange");
            Intrinsics.checkNotNullParameter(outputRange, "outputRange");
            int d11 = d(d10, inputRange);
            int i10 = outputRange[d11];
            int i11 = d11 + 1;
            int i12 = outputRange[i11];
            if (i10 == i12) {
                return i10;
            }
            double d12 = inputRange[d11];
            double d13 = inputRange[i11];
            return d12 == d13 ? d10 <= d12 ? i10 : i12 : androidx.core.graphics.d.d(i10, i12, (float) ((d10 - d12) / (d13 - d12)));
        }

        public final String k(String pattern, double d10, double[] dArr, double[][] outputRange, String str, String str2) {
            double[] inputRange = dArr;
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(inputRange, "inputRange");
            Intrinsics.checkNotNullParameter(outputRange, "outputRange");
            int d11 = d(d10, inputRange);
            StringBuffer stringBuffer = new StringBuffer(pattern.length());
            Matcher matcher = k.f21304r.matcher(pattern);
            int i10 = 0;
            while (matcher.find()) {
                double[] dArr2 = outputRange[d11];
                if (i10 >= dArr2.length) {
                    break;
                }
                int i11 = d11 + 1;
                int i12 = i10;
                StringBuffer stringBuffer2 = stringBuffer;
                double h10 = h(d10, inputRange[d11], inputRange[i11], dArr2[i10], outputRange[i11][i10], str, str2);
                int i13 = (int) h10;
                matcher.appendReplacement(stringBuffer2, ((double) i13) == h10 ? String.valueOf(i13) : String.valueOf(h10));
                i10 = i12 + 1;
                stringBuffer = stringBuffer2;
                inputRange = dArr;
            }
            StringBuffer stringBuffer3 = stringBuffer;
            matcher.appendTail(stringBuffer3);
            String stringBuffer4 = stringBuffer3.toString();
            Intrinsics.checkNotNullExpressionValue(stringBuffer4, "toString(...)");
            return stringBuffer4;
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b Number = new b("Number", 0);
        public static final b Color = new b("Color", 1);
        public static final b String = new b("String", 2);

        private static final /* synthetic */ b[] $values() {
            return new b[]{Number, Color, String};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private b(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21313a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Color.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21313a = iArr;
        }
    }

    static {
        Pattern compile = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        f21304r = compile;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ReadableMap config) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(config, "config");
        a aVar = f21303q;
        this.f21305i = aVar.e(config.getArray("inputRange"));
        this.f21309m = config.getString("extrapolateLeft");
        this.f21310n = config.getString("extrapolateRight");
        ReadableArray array = config.getArray("outputRange");
        if (Intrinsics.b("color", config.getString("outputType"))) {
            this.f21307k = b.Color;
            this.f21306j = aVar.f(array);
            return;
        }
        if ((array != null ? array.getType(0) : null) != ReadableType.String) {
            this.f21307k = b.Number;
            this.f21306j = aVar.e(array);
        } else {
            this.f21307k = b.String;
            this.f21306j = aVar.g(array);
            this.f21308l = array.getString(0);
        }
    }

    @Override // com.facebook.react.animated.b
    public void c(com.facebook.react.animated.b parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.f21311o != null) {
            throw new IllegalStateException("Parent already attached");
        }
        if (!(parent instanceof x)) {
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
        this.f21311o = (x) parent;
    }

    @Override // com.facebook.react.animated.b
    public void d(com.facebook.react.animated.b parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (parent != this.f21311o) {
            throw new IllegalArgumentException("Invalid parent node provided");
        }
        this.f21311o = null;
    }

    @Override // com.facebook.react.animated.x, com.facebook.react.animated.b
    public String e() {
        return "InterpolationAnimatedNode[" + this.f21267d + "] super: {super.prettyPrint()}";
    }

    @Override // com.facebook.react.animated.b
    public void h() {
        String str;
        x xVar = this.f21311o;
        if (xVar != null) {
            double l10 = xVar.l();
            b bVar = this.f21307k;
            int i10 = bVar == null ? -1 : c.f21313a[bVar.ordinal()];
            if (i10 == 1) {
                a aVar = f21303q;
                double[] dArr = this.f21305i;
                Object obj = this.f21306j;
                Intrinsics.e(obj, "null cannot be cast to non-null type kotlin.DoubleArray");
                this.f21376f = aVar.i(l10, dArr, (double[]) obj, this.f21309m, this.f21310n);
                return;
            }
            if (i10 == 2) {
                a aVar2 = f21303q;
                double[] dArr2 = this.f21305i;
                Object obj2 = this.f21306j;
                Intrinsics.e(obj2, "null cannot be cast to non-null type kotlin.IntArray");
                this.f21312p = Integer.valueOf(aVar2.j(l10, dArr2, (int[]) obj2));
                return;
            }
            if (i10 == 3 && (str = this.f21308l) != null) {
                a aVar3 = f21303q;
                double[] dArr3 = this.f21305i;
                Object obj3 = this.f21306j;
                Intrinsics.e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.DoubleArray>");
                this.f21312p = aVar3.k(str, l10, dArr3, (double[][]) obj3, this.f21309m, this.f21310n);
            }
        }
    }

    @Override // com.facebook.react.animated.x
    public Object k() {
        return this.f21312p;
    }
}
