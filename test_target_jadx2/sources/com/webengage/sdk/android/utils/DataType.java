package com.webengage.sdk.android.utils;

import com.appsflyer.attribution.RequestError;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.g1;
import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public enum DataType {
    STRING,
    INTEGER,
    LONG,
    DOUBLE,
    BOOLEAN,
    LIST,
    MAP,
    DATE,
    NUMBER,
    UNKNOWN;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30857a;

        static {
            int[] iArr = new int[DataType.values().length];
            f30857a = iArr;
            try {
                iArr[DataType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30857a[DataType.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30857a[DataType.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30857a[DataType.DATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30857a[DataType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30857a[DataType.INTEGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30857a[DataType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30857a[DataType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30857a[DataType.NUMBER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f30857a[DataType.BOOLEAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f30858a;

        /* renamed from: b, reason: collision with root package name */
        private Object f30859b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f30860c;

        /* renamed from: d, reason: collision with root package name */
        private String f30861d;

        b(String str, Object obj) {
            this.f30860c = null;
            this.f30861d = null;
            this.f30858a = str;
            this.f30859b = obj;
            this.f30860c = new ArrayList(2);
            this.f30861d = null;
        }

        public b a(Object obj, String str) {
            this.f30859b = obj;
            this.f30861d = str;
            return this;
        }

        public String b() {
            return this.f30861d;
        }

        public String c() {
            return this.f30858a;
        }

        public String d() {
            if (this.f30860c.size() == 0) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            for (String str : this.f30860c) {
                if (sb2.length() != 0) {
                    sb2.append(" in key ");
                }
                sb2.append("'");
                sb2.append(str);
                sb2.append("'");
            }
            return sb2.toString();
        }

        public b a(Object obj, String str, String str2) {
            this.f30859b = obj;
            this.f30860c.add(0, str);
            this.f30861d = str2;
            return this;
        }

        public void b(String str) {
            this.f30861d = str;
        }

        public Object a() {
            return this.f30859b;
        }

        public void a(String str) {
            this.f30860c.remove(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0141 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static b a(b bVar, int i10, boolean z10, int i11) {
        int i12;
        StringBuilder sb2;
        b bVar2 = bVar;
        switch (a.f30857a[detect(bVar.a()).ordinal()]) {
            case 1:
                if (z10) {
                    return bVar2.a(WebEngageUtils.a(bVar.a().toString(), i11), null);
                }
                break;
            case 2:
                Map map = (Map) bVar.a();
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    b a10 = a(bVar2.a(entry.getKey(), null), i10, z10, 50);
                    String valueOf = String.valueOf(a10.a());
                    bVar2 = a(a10.a(entry.getValue(), valueOf, null), i10, z10, 1000);
                    String b10 = bVar2.b();
                    if (b10 != null) {
                        Logger.d("WebEngage", bVar2.c() != null ? "Invalid value for key " + bVar2.d() + " in event '" + bVar2.c() + "'\n" + b10 : "Invalid value for key " + bVar2.d() + "\n" + b10);
                        if (i10 == 3) {
                            bVar2.a(valueOf);
                        }
                    }
                    hashMap.put(valueOf, bVar2.a());
                    bVar2.a(valueOf);
                }
                return bVar2.a(hashMap, null);
            case 3:
                List list = (List) bVar.a();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bVar2 = a(bVar2.a(it.next(), null), i10, z10, i12);
                    String b11 = bVar2.b();
                    if (b11 != null) {
                        String d10 = bVar2.d();
                        String c10 = bVar2.c();
                        if (c10 != null) {
                            if (d10 != null) {
                                sb2 = new StringBuilder();
                                sb2.append("Invalid value for key ");
                                sb2.append(d10);
                                sb2.append(" in event '");
                            } else {
                                sb2 = new StringBuilder();
                                sb2.append("Invalid attribute in event '");
                            }
                            sb2.append(c10);
                            sb2.append("'\n");
                        } else if (d10 != null) {
                            sb2 = new StringBuilder();
                            sb2.append("Invalid value for key ");
                            sb2.append(d10);
                            sb2.append("\n");
                        } else {
                            Logger.d("WebEngage", b11);
                            i12 = i10 == 3 ? 1000 : 1000;
                        }
                        sb2.append(b11);
                        Logger.d("WebEngage", sb2.toString());
                        if (i10 == 3) {
                        }
                    }
                    arrayList.add(bVar2.a());
                }
                return bVar2.a(arrayList, null);
            case 4:
                return bVar2.a(new Date(((Date) bVar.a()).getTime()), null);
            case 5:
            default:
                Object a11 = bVar.a();
                if (i10 == 0) {
                    return bVar2.a(a11, null);
                }
                if (i10 == 1) {
                    return bVar2.a(null, a11 != null ? "Invalid data type '" + a11.getClass().getSimpleName() + "'. Must be one of [String, Number, Boolean, List, Map, Date].\nConverted value to null." : null);
                }
                if (i10 != 2) {
                    return bVar2.a(String.valueOf(a11), a11 != null ? "Invalid data type '" + a11.getClass().getSimpleName() + "'. Must be one of [String, Number, Boolean, List, Map, Date].\nDiscarded value." : "Value is null.\nDiscarded value");
                }
                if (a11 != null) {
                    bVar2.a(String.valueOf(a11), "Invalid data type '" + a11.getClass().getSimpleName() + "'. Must be one of [String, Number, Boolean, List, Map, Date].\nConverted value to String.");
                } else {
                    bVar2.a(null, "Value is null.");
                }
                return bVar2;
            case 6:
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
                break;
        }
        bVar2.b(null);
        return bVar2;
    }

    public static Object cloneExternal(Object obj) {
        return cloneExternal(null, obj);
    }

    public static Object cloneInternal(Object obj) {
        return a(obj, false, false, Integer.MAX_VALUE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object convert(Object obj, DataType dataType, boolean z10) {
        int i10;
        DataType detect = detect(obj);
        int[] iArr = a.f30857a;
        switch (iArr[dataType.ordinal()]) {
            case 1:
                switch (iArr[detect.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return a(obj, z10).toString();
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        return obj.toString();
                    default:
                        throw new IllegalArgumentException("Unknown Data Type : " + dataType);
                }
            case 2:
                int i11 = iArr[detect.ordinal()];
                if (i11 == 1) {
                    return new com.webengage.sdk.android.utils.a(new ByteArrayInputStream(obj.toString().getBytes()), z10).b();
                }
                if (i11 == 2) {
                    return obj;
                }
                throw new IllegalArgumentException(detect.toString() + " cannot be converted to Map");
            case 3:
                int i12 = iArr[detect.ordinal()];
                if (i12 == 1) {
                    return new com.webengage.sdk.android.utils.a(new ByteArrayInputStream(obj.toString().getBytes()), z10).a();
                }
                if (i12 == 3) {
                    return obj;
                }
                throw new IllegalArgumentException(detect.toString() + " cannot be converted to List");
            case 4:
                int i13 = iArr[detect.ordinal()];
                if (i13 == 1) {
                    obj.toString();
                    SimpleDateFormat simpleDateFormat = z10 ? new SimpleDateFormat("'~t'yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US) : new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    return simpleDateFormat.parse(obj.toString());
                }
                if (i13 == 4) {
                    return obj;
                }
                i10 = iArr[detect.ordinal()];
                if (i10 != 1) {
                    try {
                        return Long.valueOf(Long.parseLong(obj.toString()));
                    } catch (NumberFormatException unused) {
                        return Double.valueOf(Double.parseDouble(obj.toString()));
                    }
                }
                switch (i10) {
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return obj;
                    default:
                        throw new IllegalArgumentException(detect.toString() + " cannot be converted to Number");
                }
            case 6:
                int i14 = iArr[detect.ordinal()];
                if (i14 == 1) {
                    return Integer.valueOf(obj.toString());
                }
                switch (i14) {
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return Integer.valueOf(((Number) obj).intValue());
                    default:
                        throw new IllegalArgumentException(detect.toString() + " cannot be converted to Integer");
                }
            case 7:
                int i15 = iArr[detect.ordinal()];
                if (i15 == 1) {
                    return Long.valueOf(obj.toString());
                }
                switch (i15) {
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return Long.valueOf(((Number) obj).longValue());
                    default:
                        throw new IllegalArgumentException(detect.toString() + " cannot be converted to Long");
                }
            case 8:
                int i16 = iArr[detect.ordinal()];
                if (i16 == 1) {
                    return Double.valueOf(obj.toString());
                }
                switch (i16) {
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        return Double.valueOf(((Number) obj).doubleValue());
                    default:
                        throw new IllegalArgumentException(detect.toString() + " cannot be converted to Double");
                }
            case 9:
                i10 = iArr[detect.ordinal()];
                if (i10 != 1) {
                }
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                int i17 = iArr[detect.ordinal()];
                if (i17 == 1) {
                    return Boolean.valueOf(obj.toString());
                }
                if (i17 == 10) {
                    return obj;
                }
                throw new IllegalArgumentException(detect.toString() + " cannot be converted to Boolean");
        }
    }

    public static DataType detect(Object obj) {
        return obj instanceof Long ? LONG : obj instanceof Integer ? INTEGER : obj instanceof Boolean ? BOOLEAN : obj instanceof String ? STRING : obj instanceof Double ? DOUBLE : obj instanceof List ? LIST : obj instanceof Map ? MAP : obj instanceof Date ? DATE : obj instanceof Number ? NUMBER : UNKNOWN;
    }

    public static boolean isNumber(DataType dataType) {
        return dataType.equals(INTEGER) || dataType.equals(LONG) || dataType.equals(DOUBLE) || dataType.equals(NUMBER);
    }

    public static DataType valueByString(String str) {
        try {
            return valueOf(str.toUpperCase());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase();
    }

    private static Object a(Object obj, boolean z10) {
        DataType detect = detect(obj);
        if (detect != null) {
            switch (a.f30857a[detect.ordinal()]) {
                case 1:
                    String str = (String) obj;
                    if (!z10 || str.startsWith("~t")) {
                        return str;
                    }
                    if (!str.startsWith("~") && !str.startsWith("^") && !str.startsWith("`")) {
                        return str;
                    }
                    return "~" + str;
                case 2:
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        jSONObject.put((String) a(entry.getKey(), z10), a(entry.getValue(), z10));
                    }
                    return jSONObject;
                case 3:
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        jSONArray.put(a(it.next(), z10));
                    }
                    return jSONArray;
                case 4:
                    SimpleDateFormat simpleDateFormat = z10 ? new SimpleDateFormat("'~t'yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US) : new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    return simpleDateFormat.format(obj);
                case 5:
                    return obj instanceof g1 ? a(((g1) obj).toMap(), z10) : JSONObject.NULL;
                case 6:
                case 7:
                case 8:
                case 9:
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    return obj;
            }
        }
        if (obj == null) {
            return JSONObject.NULL;
        }
        throw new IllegalArgumentException("Unknown Data Type : " + detect);
    }

    public static Object cloneExternal(String str, Object obj) {
        b a10 = a(new b(str, obj), 2, true, Integer.MAX_VALUE);
        String b10 = a10.b();
        if (b10 != null) {
            Logger.e("WebEngage", b10);
        }
        return a10.a();
    }

    static Object a(Object obj, boolean z10, boolean z11, int i10) {
        switch (a.f30857a[detect(obj).ordinal()]) {
            case 1:
                return z11 ? WebEngageUtils.a(obj.toString(), i10) : obj;
            case 2:
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    hashMap.put(a(entry.getKey(), z10, z11, 50).toString(), a(entry.getValue(), z10, z11, 1000));
                }
                return hashMap;
            case 3:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(a(it.next(), z10, z11, 1000));
                }
                return arrayList;
            case 4:
                return new Date(((Date) obj).getTime());
            case 5:
            default:
                if (z10) {
                    return null;
                }
                return obj;
            case 6:
            case 7:
            case 8:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return obj;
        }
    }
}
