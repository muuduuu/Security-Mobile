package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;
import x4.C5109a;

/* loaded from: classes.dex */
public class HermesExecutor extends JavaScriptExecutor {

    /* renamed from: a, reason: collision with root package name */
    private static String f20686a;

    static {
        a();
    }

    HermesExecutor(R3.a aVar, boolean z10, String str) {
        super(initHybridDefaultConfig(z10, str));
    }

    public static void a() {
        if (f20686a == null) {
            SoLoader.t("hermes");
            SoLoader.t("hermes_executor");
            f20686a = C5109a.f44775b ? "Debug" : "Release";
        }
    }

    private static native HybridData initHybrid(boolean z10, String str, long j10);

    private static native HybridData initHybridDefaultConfig(boolean z10, String str);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "HermesExecutor" + f20686a;
    }
}
