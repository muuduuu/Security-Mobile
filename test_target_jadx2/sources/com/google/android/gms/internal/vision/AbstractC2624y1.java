package com.google.android.gms.internal.vision;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.vision.y1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2624y1 {
    static String a(InterfaceC2609t1 interfaceC2609t1, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        c(interfaceC2609t1, sb2, 0);
        return sb2.toString();
    }

    private static final String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x021a, code lost:
    
        if (((java.lang.Double) r6).doubleValue() == 0.0d) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e4, code lost:
    
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e6, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f7, code lost:
    
        if (((java.lang.Integer) r6).intValue() == 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0208, code lost:
    
        if (((java.lang.Float) r6).floatValue() == 0.0f) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(InterfaceC2609t1 interfaceC2609t1, StringBuilder sb2, int i10) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC2609t1.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            boolean z10 = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    d(sb2, i10, b(concat), N0.m(method2, interfaceC2609t1, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    d(sb2, i10, b(concat2), N0.m(method3, interfaceC2609t1, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object m10 = N0.m(method4, interfaceC2609t1, new Object[0]);
                    if (method5 == null) {
                        if (!(m10 instanceof Boolean)) {
                            if (!(m10 instanceof Integer)) {
                                if (!(m10 instanceof Float)) {
                                    if (!(m10 instanceof Double)) {
                                        equals = m10 instanceof String ? m10.equals(BuildConfig.FLAVOR) : m10 instanceof AbstractC2570g0 ? m10.equals(AbstractC2570g0.f25133b) : !(m10 instanceof InterfaceC2609t1) ? false : false;
                                    }
                                }
                            }
                        }
                        if (equals) {
                            z10 = false;
                        }
                    } else {
                        z10 = ((Boolean) N0.m(method5, interfaceC2609t1, new Object[0])).booleanValue();
                    }
                    if (z10) {
                        d(sb2, i10, b(concat3), m10);
                    }
                }
            }
        }
        C2561d2 c2561d2 = ((N0) interfaceC2609t1).zzb;
        if (c2561d2 != null) {
            c2561d2.f(sb2, i10);
        }
    }

    static final void d(StringBuilder sb2, int i10, String str, Object obj) {
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
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(X1.a(AbstractC2570g0.m((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC2570g0) {
            sb2.append(": \"");
            sb2.append(X1.a((AbstractC2570g0) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof N0) {
            sb2.append(" {");
            c((N0) obj, sb2, i10 + 2);
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i10 + 2;
        d(sb2, i13, "key", entry.getKey());
        d(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        while (i11 < i10) {
            sb2.append(' ');
            i11++;
        }
        sb2.append("}");
    }
}
