package com.facebook.react.bridge;

import com.facebook.react.module.model.ReactModuleInfo;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;
import o3.AbstractC3747a;
import r4.AbstractC4012a;
import s5.C4314b;

/* loaded from: classes.dex */
public class ModuleHolder {
    private static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);
    private boolean mInitializable;
    private final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();
    private boolean mIsCreating;
    private boolean mIsInitializing;
    private NativeModule mModule;
    private final String mName;
    private Provider mProvider;
    private final ReactModuleInfo mReactModuleInfo;

    public ModuleHolder(ReactModuleInfo reactModuleInfo, Provider provider) {
        this.mName = reactModuleInfo.f();
        this.mProvider = provider;
        this.mReactModuleInfo = reactModuleInfo;
        if (reactModuleInfo.g()) {
            this.mModule = create();
        }
    }

    private NativeModule create() {
        boolean z10 = false;
        SoftAssertions.assertCondition(this.mModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.mName, this.mInstanceKey);
        C4314b.a(0L, "ModuleHolder.createModule").b("name", this.mName).c();
        n3.c.a().c(AbstractC3747a.f37916e, "NativeModule init: %s", this.mName);
        try {
            NativeModule nativeModule = (NativeModule) ((Provider) AbstractC4012a.c(this.mProvider)).get();
            this.mProvider = null;
            synchronized (this) {
                try {
                    this.mModule = nativeModule;
                    if (this.mInitializable && !this.mIsInitializing) {
                        z10 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z10) {
                doInitialize(nativeModule);
            }
            return nativeModule;
        } finally {
        }
    }

    private void doInitialize(NativeModule nativeModule) {
        boolean z10;
        C4314b.a(0L, "ModuleHolder.initialize").b("name", this.mName).c();
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.mName, this.mInstanceKey);
        try {
            synchronized (this) {
                try {
                    if (!this.mInitializable || this.mIsInitializing) {
                        z10 = false;
                    } else {
                        z10 = true;
                        this.mIsInitializing = true;
                    }
                } finally {
                }
            }
            if (z10) {
                nativeModule.initialize();
                synchronized (this) {
                    this.mIsInitializing = false;
                }
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mName, this.mInstanceKey);
            C4314b.b(0L).c();
        }
    }

    public synchronized void destroy() {
        NativeModule nativeModule = this.mModule;
        if (nativeModule != null) {
            nativeModule.invalidate();
        }
    }

    public boolean getCanOverrideExistingModule() {
        return this.mReactModuleInfo.a();
    }

    public String getClassName() {
        return this.mReactModuleInfo.c();
    }

    public NativeModule getModule() {
        boolean z10;
        NativeModule nativeModule;
        NativeModule nativeModule2;
        synchronized (this) {
            try {
                NativeModule nativeModule3 = this.mModule;
                if (nativeModule3 != null) {
                    return nativeModule3;
                }
                if (this.mIsCreating) {
                    z10 = false;
                } else {
                    z10 = true;
                    this.mIsCreating = true;
                }
                if (z10) {
                    NativeModule create = create();
                    synchronized (this) {
                        this.mIsCreating = false;
                        notifyAll();
                    }
                    return create;
                }
                synchronized (this) {
                    while (true) {
                        nativeModule = this.mModule;
                        if (nativeModule != null || !this.mIsCreating) {
                            break;
                        }
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    nativeModule2 = (NativeModule) AbstractC4012a.c(nativeModule);
                }
                return nativeModule2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getName() {
        return this.mName;
    }

    synchronized boolean hasInstance() {
        return this.mModule != null;
    }

    public boolean isCxxModule() {
        return this.mReactModuleInfo.d();
    }

    public boolean isTurboModule() {
        return this.mReactModuleInfo.e();
    }

    void markInitializable() {
        boolean z10;
        NativeModule nativeModule;
        synchronized (this) {
            z10 = true;
            try {
                this.mInitializable = true;
                if (this.mModule != null) {
                    AbstractC4012a.a(!this.mIsInitializing);
                    nativeModule = this.mModule;
                } else {
                    nativeModule = null;
                    z10 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            doInitialize(nativeModule);
        }
    }

    public ModuleHolder(NativeModule nativeModule) {
        String name = nativeModule.getName();
        this.mName = name;
        this.mReactModuleInfo = new ReactModuleInfo(nativeModule.getName(), nativeModule.getClass().getSimpleName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), ReactModuleInfo.b(nativeModule.getClass()));
        this.mModule = nativeModule;
        n3.c.a().c(AbstractC3747a.f37916e, "NativeModule init: %s", name);
    }
}
