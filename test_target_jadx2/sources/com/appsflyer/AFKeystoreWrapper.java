package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class AFKeystoreWrapper {
    public KeyStore getMonetizationNetwork;
    private Context getRevenue;
    public final Object getMediationNetwork = new Object();
    public String getCurrencyIso4217Code = BuildConfig.FLAVOR;
    public int AFAdRevenueData = 0;

    public AFKeystoreWrapper(Context context) {
        this.getRevenue = context;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.getMonetizationNetwork = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
    
        r1 = r3.split(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        if (r1.length != 3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(r3));
        r2 = true;
        r3 = r1[1].trim().split("=");
        r1 = r1[2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r3.length != 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r1.length != 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r6.getCurrencyIso4217Code = r3[1].trim();
        r6.AFAdRevenueData = java.lang.Integer.parseInt(r1[1].trim());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AFAdRevenueData() {
        boolean z10;
        synchronized (this.getMediationNetwork) {
            try {
                KeyStore keyStore = this.getMonetizationNetwork;
                z10 = false;
                if (keyStore != null) {
                    try {
                        Enumeration<String> aliases = keyStore.aliases();
                        while (true) {
                            if (!aliases.hasMoreElements()) {
                                break;
                            }
                            String nextElement = aliases.nextElement();
                            if (nextElement != null && AFAdRevenueData(nextElement)) {
                                break;
                            }
                        }
                    } catch (Throwable th) {
                        StringBuilder sb2 = new StringBuilder("Couldn't list KeyStore Aliases: ");
                        sb2.append(th.getClass().getName());
                        AFLogger.afErrorLog(sb2.toString(), th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final String getCurrencyIso4217Code() {
        String str;
        synchronized (this.getMediationNetwork) {
            str = this.getCurrencyIso4217Code;
        }
        return str;
    }

    public final String getMonetizationNetwork() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.appsflyer,");
        synchronized (this.getMediationNetwork) {
            sb2.append("KSAppsFlyerId=");
            sb2.append(this.getCurrencyIso4217Code);
            sb2.append(",");
            sb2.append("KSAppsFlyerRICounter=");
            sb2.append(this.AFAdRevenueData);
        }
        return sb2.toString();
    }

    public final void getRevenue(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.getMediationNetwork) {
                try {
                    if (this.getMonetizationNetwork.containsAlias(str)) {
                        AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                    } else {
                        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        keyPairGenerator.initialize(build);
                        keyPairGenerator.generateKeyPair();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Exception ");
            sb2.append(th2.getMessage());
            sb2.append(" occurred");
            AFLogger.afErrorLog(sb2.toString(), th2);
        }
    }

    private static boolean AFAdRevenueData(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final int getRevenue() {
        int i10;
        synchronized (this.getMediationNetwork) {
            i10 = this.AFAdRevenueData;
        }
        return i10;
    }
}
