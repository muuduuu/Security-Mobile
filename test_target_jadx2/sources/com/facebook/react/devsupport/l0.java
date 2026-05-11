package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f21652a = Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f21653b = Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$");

    public static C4.j[] a(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        C4.j[] jVarArr = new C4.j[stackTrace.length];
        for (int i10 = 0; i10 < stackTrace.length; i10++) {
            jVarArr[i10] = new a(stackTrace[i10].getClassName(), stackTrace[i10].getFileName(), stackTrace[i10].getMethodName(), stackTrace[i10].getLineNumber(), -1);
        }
        return jVarArr;
    }

    public static C4.j[] b(ReadableArray readableArray) {
        int size = readableArray != null ? readableArray.size() : 0;
        C4.j[] jVarArr = new C4.j[size];
        for (int i10 = 0; i10 < size; i10++) {
            ReadableType type = readableArray.getType(i10);
            if (type == ReadableType.Map) {
                ReadableMap map = readableArray.getMap(i10);
                String string = map.getString("methodName");
                jVarArr[i10] = new a(map.getString("file"), string, (!map.hasKey("lineNumber") || map.isNull("lineNumber")) ? -1 : map.getInt("lineNumber"), (!map.hasKey("column") || map.isNull("column")) ? -1 : map.getInt("column"), map.hasKey("collapse") && !map.isNull("collapse") && map.getBoolean("collapse"));
            } else if (type == ReadableType.String) {
                jVarArr[i10] = new a((String) null, readableArray.getString(i10), -1, -1);
            }
        }
        return jVarArr;
    }

    public static JavaOnlyMap c(ReactJsExceptionHandler.ParsedError parsedError) {
        List<ReactJsExceptionHandler.ParsedError.StackFrame> frames = parsedError.getFrames();
        ArrayList arrayList = new ArrayList();
        for (ReactJsExceptionHandler.ParsedError.StackFrame stackFrame : frames) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putDouble("column", stackFrame.getColumnNumber());
            javaOnlyMap.putDouble("lineNumber", stackFrame.getLineNumber());
            javaOnlyMap.putString("file", stackFrame.getFileName());
            javaOnlyMap.putString("methodName", stackFrame.getMethodName());
            arrayList.add(javaOnlyMap);
        }
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putString("message", parsedError.getMessage());
        javaOnlyMap2.putArray("stack", JavaOnlyArray.from(arrayList));
        javaOnlyMap2.putInt("id", parsedError.getExceptionId());
        javaOnlyMap2.putBoolean("isFatal", parsedError.isFatal());
        return javaOnlyMap2;
    }

    public static String d(C4.j jVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jVar.getFileName());
        int a10 = jVar.a();
        if (a10 > 0) {
            sb2.append(":");
            sb2.append(a10);
            int e10 = jVar.e();
            if (e10 > 0) {
                sb2.append(":");
                sb2.append(e10);
            }
        }
        return sb2.toString();
    }

    public static class a implements C4.j {

        /* renamed from: a, reason: collision with root package name */
        private final String f21654a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21655b;

        /* renamed from: c, reason: collision with root package name */
        private final int f21656c;

        /* renamed from: d, reason: collision with root package name */
        private final int f21657d;

        /* renamed from: e, reason: collision with root package name */
        private final String f21658e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f21659f;

        @Override // C4.j
        public int a() {
            return this.f21656c;
        }

        @Override // C4.j
        public String b() {
            return this.f21654a;
        }

        @Override // C4.j
        public String c() {
            return this.f21655b;
        }

        @Override // C4.j
        public boolean d() {
            return this.f21659f;
        }

        @Override // C4.j
        public int e() {
            return this.f21657d;
        }

        @Override // C4.j
        public String getFileName() {
            return this.f21658e;
        }

        private a(String str, String str2, int i10, int i11, boolean z10) {
            this.f21654a = str;
            this.f21655b = str2;
            this.f21656c = i10;
            this.f21657d = i11;
            this.f21658e = str != null ? new File(str).getName() : BuildConfig.FLAVOR;
            this.f21659f = z10;
        }

        private a(String str, String str2, int i10, int i11) {
            this(str, str2, i10, i11, false);
        }

        private a(String str, String str2, String str3, int i10, int i11) {
            this.f21654a = str;
            this.f21658e = str2;
            this.f21655b = str3;
            this.f21656c = i10;
            this.f21657d = i11;
            this.f21659f = false;
        }
    }
}
