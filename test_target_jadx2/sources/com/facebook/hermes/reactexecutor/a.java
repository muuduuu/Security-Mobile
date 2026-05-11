package com.facebook.hermes.reactexecutor;

import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class a implements JavaScriptExecutorFactory {

    /* renamed from: a, reason: collision with root package name */
    private boolean f20687a;

    /* renamed from: b, reason: collision with root package name */
    private String f20688b;

    public a() {
        this(null);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        return new HermesExecutor(null, this.f20687a, this.f20688b);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        HermesSamplingProfiler.enable();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String str) {
        HermesSamplingProfiler.dumpSampledTraceToFile(str);
        HermesSamplingProfiler.disable();
    }

    public String toString() {
        return "JSIExecutor+HermesRuntime";
    }

    public a(R3.a aVar) {
        this.f20687a = true;
        this.f20688b = BuildConfig.FLAVOR;
    }
}
