package com.facebook.react.devsupport;

import C4.e;
import android.app.Activity;
import android.util.Pair;
import android.view.View;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class j0 implements C4.e {

    /* renamed from: a, reason: collision with root package name */
    private final DefaultJSExceptionHandler f21650a = new DefaultJSExceptionHandler();

    @Override // C4.e
    public boolean A() {
        return false;
    }

    @Override // C4.e
    public C4.j[] B() {
        return null;
    }

    @Override // C4.e
    public void C() {
    }

    @Override // C4.e
    public void D(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // C4.e
    public void E() {
    }

    @Override // C4.e
    public void F(String str, ReadableArray readableArray, int i10) {
    }

    @Override // C4.e
    public Activity a() {
        return null;
    }

    @Override // C4.e
    public View b(String str) {
        return null;
    }

    @Override // C4.e
    public void c(boolean z10) {
    }

    @Override // C4.e
    public v4.i d(String str) {
        return null;
    }

    @Override // C4.e
    public void e(View view) {
    }

    @Override // C4.e
    public void f(boolean z10) {
    }

    @Override // C4.e
    public void g(boolean z10) {
    }

    @Override // C4.e
    public void h() {
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f21650a.handleException(e10);
    }

    @Override // C4.e
    public void i() {
    }

    @Override // C4.e
    public void j(String message, e.a listener) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // C4.e
    public String k() {
        return null;
    }

    @Override // C4.e
    public String l() {
        return null;
    }

    @Override // C4.e
    public void m() {
    }

    @Override // C4.e
    public boolean n() {
        return false;
    }

    @Override // C4.e
    public void o() {
    }

    @Override // C4.e
    public void p(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // C4.e
    public void q() {
    }

    @Override // C4.e
    public Pair s(Pair pair) {
        return pair;
    }

    @Override // C4.e
    public void t(boolean z10) {
    }

    @Override // C4.e
    public C4.f u() {
        return null;
    }

    @Override // C4.e
    public String v() {
        return null;
    }

    @Override // C4.e
    public P4.a w() {
        return null;
    }

    @Override // C4.e
    public void x(C4.g callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.a(false);
    }

    @Override // C4.e
    public C4.i y() {
        return null;
    }

    @Override // C4.e
    public void z() {
    }

    @Override // C4.e
    public void r(String str, C4.d dVar) {
    }
}
