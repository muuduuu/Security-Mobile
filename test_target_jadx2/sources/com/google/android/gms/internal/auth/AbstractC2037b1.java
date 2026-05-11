package com.google.android.gms.internal.auth;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.auth.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2037b1 {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f23682a;

    static {
        char[] cArr = new char[80];
        f23682a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String a(Z0 z02, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        d(z02, sb2, 0);
        return sb2.toString();
    }

    static void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        c(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(AbstractC2076o1.a(new C2072n0(((String) obj).getBytes(G0.f23597b))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC2081q0) {
            sb2.append(": \"");
            sb2.append(AbstractC2076o1.a((AbstractC2081q0) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof C0) {
            sb2.append(" {");
            d((C0) obj, sb2, i10 + 2);
            sb2.append("\n");
            c(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        b(sb2, i12, "key", entry.getKey());
        b(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        c(i10, sb2);
        sb2.append("}");
    }

    private static void c(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f23682a, 0, i11);
            i10 -= i11;
        }
    }

    private static void d(Z0 z02, StringBuilder sb2, int i10) {
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = z02.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb2, i10, substring.substring(0, substring.length() - 4), C0.h(method2, z02, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb2, i10, substring.substring(0, substring.length() - 3), C0.h(method, z02, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object h10 = C0.h(method4, z02, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) C0.h(method5, z02, new Object[0])).booleanValue()) {
                        }
                        b(sb2, i10, substring, h10);
                    } else if (h10 instanceof Boolean) {
                        if (!((Boolean) h10).booleanValue()) {
                        }
                        b(sb2, i10, substring, h10);
                    } else if (h10 instanceof Integer) {
                        if (((Integer) h10).intValue() == 0) {
                        }
                        b(sb2, i10, substring, h10);
                    } else if (h10 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) h10).floatValue()) == 0) {
                        }
                        b(sb2, i10, substring, h10);
                    } else if (h10 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) h10).doubleValue()) == 0) {
                        }
                        b(sb2, i10, substring, h10);
                    } else {
                        if (h10 instanceof String) {
                            equals = h10.equals(BuildConfig.FLAVOR);
                        } else if (h10 instanceof AbstractC2081q0) {
                            equals = h10.equals(AbstractC2081q0.f23760b);
                        } else if (h10 instanceof Z0) {
                            if (h10 == ((Z0) h10).g()) {
                            }
                            b(sb2, i10, substring, h10);
                        } else {
                            if ((h10 instanceof Enum) && ((Enum) h10).ordinal() == 0) {
                            }
                            b(sb2, i10, substring, h10);
                        }
                        if (equals) {
                        }
                        b(sb2, i10, substring, h10);
                    }
                }
            }
            i11 = 3;
        }
        C2087s1 c2087s1 = ((C0) z02).zzc;
        if (c2087s1 != null) {
            c2087s1.g(sb2, i10);
        }
    }
}
