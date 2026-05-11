package com.facebook.react.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u0007\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/facebook/react/common/JavascriptException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", BuildConfig.FLAVOR, "jsStackTrace", "<init>", "(Ljava/lang/String;)V", C4870a.f43493a, "Ljava/lang/String;", "getExtraDataAsJson", "()Ljava/lang/String;", "extraDataAsJson", "ReactAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class JavascriptException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String extraDataAsJson;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavascriptException(String jsStackTrace) {
        super(jsStackTrace);
        Intrinsics.checkNotNullParameter(jsStackTrace, "jsStackTrace");
    }

    public final void a(String str) {
        this.extraDataAsJson = str;
    }
}
