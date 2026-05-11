package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.webengage.sdk.android.utils.WebEngageConstant;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class SVGLength {

    /* renamed from: a, reason: collision with root package name */
    final double f28946a;

    /* renamed from: b, reason: collision with root package name */
    final UnitType f28947b;

    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28948a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f28948a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28948a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28948a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private SVGLength() {
        this.f28946a = 0.0d;
        this.f28947b = UnitType.UNKNOWN;
    }

    static ArrayList a(Dynamic dynamic) {
        int i10 = a.f28948a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new SVGLength(dynamic.asDouble()));
            return arrayList;
        }
        int i11 = 0;
        if (i10 == 2) {
            String[] split = dynamic.asString().trim().replaceAll(",", " ").split(" ");
            ArrayList arrayList2 = new ArrayList(split.length);
            int length = split.length;
            while (i11 < length) {
                arrayList2.add(new SVGLength(split[i11]));
                i11++;
            }
            return arrayList2;
        }
        if (i10 != 3) {
            return null;
        }
        ReadableArray asArray = dynamic.asArray();
        int size = asArray.size();
        ArrayList arrayList3 = new ArrayList(size);
        while (i11 < size) {
            arrayList3.add(b(asArray.getDynamic(i11)));
            i11++;
        }
        return arrayList3;
    }

    static SVGLength b(Dynamic dynamic) {
        int i10 = a.f28948a[dynamic.getType().ordinal()];
        return i10 != 1 ? i10 != 2 ? new SVGLength() : new SVGLength(dynamic.asString()) : new SVGLength(dynamic.asDouble());
    }

    static String c(Dynamic dynamic) {
        int i10 = a.f28948a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i10 != 2) {
            return null;
        }
        return dynamic.asString();
    }

    SVGLength(double d10) {
        this.f28946a = d10;
        this.f28947b = UnitType.NUMBER;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        if (r5.equals("ex") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    SVGLength(String str) {
        char c10 = 2;
        String trim = str.trim();
        int length = trim.length();
        int i10 = length - 1;
        if (length != 0 && !trim.equals("normal")) {
            if (trim.codePointAt(i10) == 37) {
                this.f28947b = UnitType.PERCENTAGE;
                this.f28946a = Double.valueOf(trim.substring(0, i10)).doubleValue();
                return;
            }
            int i11 = length - 2;
            if (i11 > 0) {
                String substring = trim.substring(i11);
                substring.hashCode();
                switch (substring.hashCode()) {
                    case 3178:
                        if (substring.equals("cm")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3240:
                        if (substring.equals("em")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3251:
                        break;
                    case 3365:
                        if (substring.equals(WebEngageConstant.IN)) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3488:
                        if (substring.equals("mm")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3571:
                        if (substring.equals("pc")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3588:
                        if (substring.equals("pt")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3592:
                        if (substring.equals("px")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                        this.f28947b = UnitType.CM;
                        length = i11;
                        break;
                    case 1:
                        this.f28947b = UnitType.EMS;
                        length = i11;
                        break;
                    case 2:
                        this.f28947b = UnitType.EXS;
                        length = i11;
                        break;
                    case 3:
                        this.f28947b = UnitType.IN;
                        length = i11;
                        break;
                    case 4:
                        this.f28947b = UnitType.MM;
                        length = i11;
                        break;
                    case 5:
                        this.f28947b = UnitType.PC;
                        length = i11;
                        break;
                    case 6:
                        this.f28947b = UnitType.PT;
                        length = i11;
                        break;
                    case 7:
                        this.f28947b = UnitType.NUMBER;
                        length = i11;
                        break;
                    default:
                        this.f28947b = UnitType.NUMBER;
                        break;
                }
                this.f28946a = Double.valueOf(trim.substring(0, length)).doubleValue();
                return;
            }
            this.f28947b = UnitType.NUMBER;
            this.f28946a = Double.valueOf(trim).doubleValue();
            return;
        }
        this.f28947b = UnitType.UNKNOWN;
        this.f28946a = 0.0d;
    }
}
