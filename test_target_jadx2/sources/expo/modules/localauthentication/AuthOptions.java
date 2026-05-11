package expo.modules.localauthentication;

import Ab.b;
import Ab.c;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\u000e\u001a\u00020\r8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u00020\r8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0013\u0010\u000f\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\u0011R \u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lexpo/modules/localauthentication/AuthOptions;", "LAb/c;", "<init>", "()V", BuildConfig.FLAVOR, "promptMessage", "Ljava/lang/String;", "getPromptMessage", "()Ljava/lang/String;", "getPromptMessage$annotations", "cancelLabel", "getCancelLabel", "getCancelLabel$annotations", BuildConfig.FLAVOR, "disableDeviceFallback", "Z", "getDisableDeviceFallback", "()Z", "getDisableDeviceFallback$annotations", "requireConfirmation", "getRequireConfirmation", "getRequireConfirmation$annotations", "Lexpo/modules/localauthentication/BiometricsSecurityLevel;", "biometricsSecurityLevel", "Lexpo/modules/localauthentication/BiometricsSecurityLevel;", "getBiometricsSecurityLevel", "()Lexpo/modules/localauthentication/BiometricsSecurityLevel;", "getBiometricsSecurityLevel$annotations", "expo-local-authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthOptions implements c {
    private final boolean disableDeviceFallback;
    private final String promptMessage = BuildConfig.FLAVOR;
    private final String cancelLabel = BuildConfig.FLAVOR;
    private final boolean requireConfirmation = true;
    private final BiometricsSecurityLevel biometricsSecurityLevel = BiometricsSecurityLevel.WEAK;

    @b
    public static /* synthetic */ void getBiometricsSecurityLevel$annotations() {
    }

    @b
    public static /* synthetic */ void getCancelLabel$annotations() {
    }

    @b
    public static /* synthetic */ void getDisableDeviceFallback$annotations() {
    }

    @b
    public static /* synthetic */ void getPromptMessage$annotations() {
    }

    @b
    public static /* synthetic */ void getRequireConfirmation$annotations() {
    }

    public final BiometricsSecurityLevel getBiometricsSecurityLevel() {
        return this.biometricsSecurityLevel;
    }

    public final String getCancelLabel() {
        return this.cancelLabel;
    }

    public final boolean getDisableDeviceFallback() {
        return this.disableDeviceFallback;
    }

    public final String getPromptMessage() {
        return this.promptMessage;
    }

    public final boolean getRequireConfirmation() {
        return this.requireConfirmation;
    }
}
