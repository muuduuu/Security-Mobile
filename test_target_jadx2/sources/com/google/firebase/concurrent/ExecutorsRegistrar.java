package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import n8.InterfaceC3714a;
import n8.InterfaceC3715b;
import n8.InterfaceC3716c;
import o8.C3762D;
import o8.C3766c;
import o8.InterfaceC3767d;
import o8.w;
import p8.EnumC3853l;

/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    static final w f27957a = new w(new A8.b() { // from class: p8.b
        @Override // A8.b
        public final Object get() {
            ScheduledExecutorService p10;
            p10 = ExecutorsRegistrar.p();
            return p10;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    static final w f27958b = new w(new A8.b() { // from class: p8.c
        @Override // A8.b
        public final Object get() {
            ScheduledExecutorService q10;
            q10 = ExecutorsRegistrar.q();
            return q10;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    static final w f27959c = new w(new A8.b() { // from class: p8.d
        @Override // A8.b
        public final Object get() {
            ScheduledExecutorService r10;
            r10 = ExecutorsRegistrar.r();
            return r10;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    static final w f27960d = new w(new A8.b() { // from class: p8.e
        @Override // A8.b
        public final Object get() {
            ScheduledExecutorService s10;
            s10 = ExecutorsRegistrar.s();
            return s10;
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(InterfaceC3767d interfaceC3767d) {
        return (ScheduledExecutorService) f27957a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(InterfaceC3767d interfaceC3767d) {
        return (ScheduledExecutorService) f27959c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(InterfaceC3767d interfaceC3767d) {
        return (ScheduledExecutorService) f27958b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(InterfaceC3767d interfaceC3767d) {
        return EnumC3853l.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f27960d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C3766c.f(C3762D.a(InterfaceC3714a.class, ScheduledExecutorService.class), C3762D.a(InterfaceC3714a.class, ExecutorService.class), C3762D.a(InterfaceC3714a.class, Executor.class)).f(new o8.g() { // from class: p8.f
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                ScheduledExecutorService l10;
                l10 = ExecutorsRegistrar.l(interfaceC3767d);
                return l10;
            }
        }).d(), C3766c.f(C3762D.a(InterfaceC3715b.class, ScheduledExecutorService.class), C3762D.a(InterfaceC3715b.class, ExecutorService.class), C3762D.a(InterfaceC3715b.class, Executor.class)).f(new o8.g() { // from class: p8.g
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                ScheduledExecutorService m10;
                m10 = ExecutorsRegistrar.m(interfaceC3767d);
                return m10;
            }
        }).d(), C3766c.f(C3762D.a(InterfaceC3716c.class, ScheduledExecutorService.class), C3762D.a(InterfaceC3716c.class, ExecutorService.class), C3762D.a(InterfaceC3716c.class, Executor.class)).f(new o8.g() { // from class: p8.h
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                ScheduledExecutorService n10;
                n10 = ExecutorsRegistrar.n(interfaceC3767d);
                return n10;
            }
        }).d(), C3766c.e(C3762D.a(n8.d.class, Executor.class)).f(new o8.g() { // from class: p8.i
            @Override // o8.g
            public final Object a(InterfaceC3767d interfaceC3767d) {
                Executor o10;
                o10 = ExecutorsRegistrar.o(interfaceC3767d);
                return o10;
            }
        }).d());
    }
}
