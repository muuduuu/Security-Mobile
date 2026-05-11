package com.horcrux.svg;

import com.appsflyer.attribution.RequestError;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength;

/* loaded from: classes2.dex */
abstract class K {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28906a;

        static {
            int[] iArr = new int[SVGLength.UnitType.values().length];
            f28906a = iArr;
            try {
                iArr[SVGLength.UnitType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28906a[SVGLength.UnitType.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28906a[SVGLength.UnitType.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28906a[SVGLength.UnitType.EMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28906a[SVGLength.UnitType.EXS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28906a[SVGLength.UnitType.CM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28906a[SVGLength.UnitType.MM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28906a[SVGLength.UnitType.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28906a[SVGLength.UnitType.PT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28906a[SVGLength.UnitType.PC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28906a[SVGLength.UnitType.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static double a(SVGLength sVGLength, double d10, double d11, double d12, double d13) {
        double d14;
        if (sVGLength == null) {
            return d11;
        }
        SVGLength.UnitType unitType = sVGLength.f28947b;
        double d15 = sVGLength.f28946a;
        switch (a.f28906a[unitType.ordinal()]) {
            case 1:
            case 2:
                d13 = 1.0d;
                d15 *= d13;
                d14 = d15 * d12;
                break;
            case 3:
                d14 = (d15 / 100.0d) * d10;
                break;
            case 4:
                d15 *= d13;
                d14 = d15 * d12;
                break;
            case 5:
                d13 /= 2.0d;
                d15 *= d13;
                d14 = d15 * d12;
                break;
            case 6:
                d13 = 35.43307d;
                d15 *= d13;
                d14 = d15 * d12;
                break;
            case 7:
                d13 = 3.543307d;
                d15 *= d13;
                d14 = d15 * d12;
                break;
            case 8:
                d13 = 90.0d;
                d15 *= d13;
                d14 = d15 * d12;
                break;
            case 9:
                d13 = 1.25d;
                d15 *= d13;
                d14 = d15 * d12;
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                d13 = 15.0d;
                d15 *= d13;
                d14 = d15 * d12;
                break;
            default:
                d14 = d15 * d12;
                break;
        }
        return d14 + d11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        if (r10.equals(com.webengage.sdk.android.utils.WebEngageConstant.IN) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static double b(String str, double d10, double d11, double d12) {
        double doubleValue;
        char c10 = 2;
        String trim = str.trim();
        int length = trim.length();
        int i10 = length - 1;
        if (length == 0 || trim.equals("normal")) {
            return 0.0d;
        }
        if (trim.codePointAt(i10) == 37) {
            return (Double.valueOf(trim.substring(0, i10)).doubleValue() / 100.0d) * d10;
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
                case 3365:
                    break;
                case 3488:
                    if (substring.equals("mm")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3571:
                    if (substring.equals("pc")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3588:
                    if (substring.equals("pt")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3592:
                    if (substring.equals("px")) {
                        c10 = 6;
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
                    d12 = 35.43307d;
                    length = i11;
                    break;
                case 1:
                    length = i11;
                    break;
                case 2:
                    d12 = 90.0d;
                    length = i11;
                    break;
                case 3:
                    d12 = 3.543307d;
                    length = i11;
                    break;
                case 4:
                    d12 = 15.0d;
                    length = i11;
                    break;
                case 5:
                    d12 = 1.25d;
                    length = i11;
                    break;
                case 6:
                    length = i11;
                    d12 = 1.0d;
                    break;
                default:
                    d12 = 1.0d;
                    break;
            }
            doubleValue = Double.valueOf(trim.substring(0, length)).doubleValue() * d12;
        } else {
            doubleValue = Double.valueOf(trim).doubleValue();
        }
        return doubleValue * d11;
    }

    static int c(ReadableArray readableArray, float[] fArr, float f10) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f10;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f10;
        return 6;
    }
}
