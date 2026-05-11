package com.google.protobuf;

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

/* loaded from: classes2.dex */
abstract class P {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f28679a;

    static {
        char[] cArr = new char[80];
        f28679a = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            char[] cArr = f28679a;
            int length = i10 > cArr.length ? cArr.length : i10;
            sb2.append(cArr, 0, length);
            i10 -= length;
        }
    }

    private static boolean b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? Float.floatToRawIntBits(((Float) obj).floatValue()) == 0 : obj instanceof Double ? Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0 : obj instanceof String ? obj.equals(BuildConfig.FLAVOR) : obj instanceof AbstractC2877h ? obj.equals(AbstractC2877h.f28729b) : obj instanceof N ? obj == ((N) obj).getDefaultInstanceForType() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    private static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Character.toLowerCase(str.charAt(0)));
        for (int i10 = 1; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    static void d(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i10, sb2);
        sb2.append(c(str));
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(g0.c((String) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC2877h) {
            sb2.append(": \"");
            sb2.append(g0.a((AbstractC2877h) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC2891w) {
            sb2.append(" {");
            e((AbstractC2891w) obj, sb2, i10 + 2);
            sb2.append("\n");
            a(i10, sb2);
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
        int i11 = i10 + 2;
        d(sb2, i11, "key", entry.getKey());
        d(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        a(i10, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x016f, code lost:
    
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(N n10, StringBuilder sb2, int i10) {
        int i11;
        int i12;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = n10.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
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
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null || !method2.getReturnType().equals(List.class)) {
                if (!substring.endsWith("Map") || substring.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                    i12 = 3;
                    if (hashSet.contains("set" + substring)) {
                        if (substring.endsWith("Bytes")) {
                        }
                        Method method4 = (Method) entry.getValue();
                        Method method5 = (Method) hashMap.get("has" + substring);
                        if (method4 != null) {
                            Object invokeOrDie = AbstractC2891w.invokeOrDie(method4, n10, new Object[0]);
                            if (method5 == null ? !b(invokeOrDie) : ((Boolean) AbstractC2891w.invokeOrDie(method5, n10, new Object[0])).booleanValue()) {
                                d(sb2, i10, substring, invokeOrDie);
                            }
                        }
                    }
                } else {
                    i12 = 3;
                    d(sb2, i10, substring.substring(0, substring.length() - 3), AbstractC2891w.invokeOrDie(method, n10, new Object[0]));
                }
                i11 = i12;
            } else {
                d(sb2, i10, substring.substring(0, substring.length() - 4), AbstractC2891w.invokeOrDie(method2, n10, new Object[0]));
                i11 = 3;
            }
        }
        j0 j0Var = ((AbstractC2891w) n10).unknownFields;
        if (j0Var != null) {
            j0Var.m(sb2, i10);
        }
    }

    static String f(N n10, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        e(n10, sb2, 0);
        return sb2.toString();
    }
}
